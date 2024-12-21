package work8.pascalTools;

import work8.Validator;

public class PascalValidator implements Validator {
    @Override
    public void validate(String code) {
        System.out.println("Validating Object Pascal code: " + code);
    }
}
