package org.example.stragedypattern_medglobalfejlhaandtering.Validation;

import org.example.stragedypattern_medglobalfejlhaandtering.Exceptions.ValidationException;
import org.example.stragedypattern_medglobalfejlhaandtering.Model.RegisterUserModel;

public class SimpleValidationStrategy implements ValidationStrategy {

    public void validate(RegisterUserModel userModel) throws ValidationException {
        if (userModel.getUsername().length() < 3){
            throw new ValidationException("Username length should be at least 3 characters");
        }

        if (!userModel.getEmail().contains("@")){
            throw new ValidationException("Email address should contain @");
        }

        if (userModel.getPassword().length() < 6){
            throw new ValidationException("Password length should be at least 6 characters");
        }
        if (!(userModel.getPassword().equals(userModel.getRepeatPassword()))) {
            throw new ValidationException("Passwords do not match");
        }

    }
}
