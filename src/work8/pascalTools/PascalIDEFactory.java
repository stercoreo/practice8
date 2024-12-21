package work8.pascalTools;

import work8.IDEFactory;
import work8.Validator;
import work8.Compiler;
import work8.Debugger;

public class PascalIDEFactory implements IDEFactory {
    @Override
    public Validator createValidator() {
        return new PascalValidator();
    }

    @Override
    public Compiler createCompiler() {
        return new PascalCompiler();
    }

    @Override
    public Debugger createDebugger() {
        return new PascalDebugger();
    }
}
