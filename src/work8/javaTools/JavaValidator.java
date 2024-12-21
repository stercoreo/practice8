package work8.javaTools;

import work8.Validator;

public class JavaValidator implements Validator {
    @Override
    public void validate(String code) {
        System.out.println("Validating Java code: " + code);
    }
}
