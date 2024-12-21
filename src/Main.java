package work8;

import work8.javaTools.JavaIDEFactory;
import work8.cppTools.CppIDEFactory;
import work8.pascalTools.PascalIDEFactory;

public class Main {
    public static void main(String[] args) {
        // Choose a factory
        IDEFactory factory = new JavaIDEFactory(); // For Java
        // IDEFactory factory = new CppIDEFactory(); // For C++
        // IDEFactory factory = new PascalIDEFactory(); // For Object Pascal

        Validator validator = factory.createValidator();
        Compiler compiler = factory.createCompiler();
        Debugger debugger = factory.createDebugger();

        String code = "Sample code";

        validator.validate(code);
        compiler.compile(code);
        debugger.debug(code);
    }
}
