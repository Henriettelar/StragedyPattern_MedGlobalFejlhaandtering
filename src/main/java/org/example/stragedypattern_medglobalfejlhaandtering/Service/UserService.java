package org.example.stragedypattern_medglobalfejlhaandtering.Service;

import org.example.stragedypattern_medglobalfejlhaandtering.Model.RegisterUserModel;
import org.example.stragedypattern_medglobalfejlhaandtering.Validation.SimpleValidationStrategy;
import org.example.stragedypattern_medglobalfejlhaandtering.Validation.StrictValidationStrategy;
import org.example.stragedypattern_medglobalfejlhaandtering.Validation.ValidationStrategy;

public class UserService {

    public void registerUser(RegisterUserModel userModel, String mode){
        ValidationStrategy strategy;
        if (mode.equals("strict")){
            strategy = new StrictValidationStrategy();
        } else {
            strategy = new SimpleValidationStrategy();
        }

        strategy.validate(userModel);


        //returner WIP
    }
}
