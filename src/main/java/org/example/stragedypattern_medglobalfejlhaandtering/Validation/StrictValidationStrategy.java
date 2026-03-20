package org.example.stragedypattern_medglobalfejlhaandtering.Validation;

import org.example.stragedypattern_medglobalfejlhaandtering.Exceptions.ValidationException;
import org.example.stragedypattern_medglobalfejlhaandtering.Model.RegisterUserModel;

public class StrictValidationStrategy implements ValidationStrategy {

    public void validate(RegisterUserModel userModel) throws ValidationException {
        if (userModel.getUsername().length() < 6){
            throw new ValidationException("Username length should be at least 6 characters");
        }
        if (userModel.getUsername().contains(" ")){
            throw new ValidationException("Username must not contain spaces");
        }

        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$"; //bruges til at tjekke for de specifikke tegn der skal være i email...
        if (!userModel.getEmail().matches(emailRegex)) {
            throw new ValidationException("Invalid email address");
        }

        if (userModel.getPassword().length() < 10){
            throw new ValidationException("Password length should be at least 10 characters");
        }
        if (!userModel.getPassword().matches(".*[0-9].*") || !userModel.getPassword().matches(".*[a-zA-Z].*")){
            throw new ValidationException("Password must contain both numbers and letters");
        }
        if (!(userModel.getPassword().equals(userModel.getRepeatPassword()))) {
            throw new ValidationException("Passwords do not match");
        }
    }
}
