package org.example.stragedypattern_medglobalfejlhaandtering.Validation;

import org.example.stragedypattern_medglobalfejlhaandtering.Exceptions.ValidationException;
import org.example.stragedypattern_medglobalfejlhaandtering.Model.RegisterUserModel;

public interface ValidationStrategy {
    void validate(RegisterUserModel userModel) throws ValidationException;
}
