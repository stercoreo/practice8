package work8.cppTools;

import work8.Validator;

public class CppValidator implements Validator {
    @Override
    public void validate(String code) {
        System.out.println("Validating C++ code: " + code);
    }
}
