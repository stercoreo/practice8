package work8.javaTools;

import work8.IDEFactory;
import work8.Validator;
import work8.Compiler;
import work8.Debugger;

public class JavaIDEFactory implements IDEFactory {
    @Override
    public Validator createValidator() {
        return new JavaValidator();
    }

    @Override
    public Compiler createCompiler() {
        return new JavaCompiler();
    }

    @Override
    public Debugger createDebugger() {
        return new JavaDebugger();
    }
}
