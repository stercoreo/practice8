package work8.cppTools;

import work8.IDEFactory;
import work8.Validator;
import work8.Compiler;
import work8.Debugger;

public class CppIDEFactory implements IDEFactory {
    @Override
    public Validator createValidator() {
        return new CppValidator();
    }

    @Override
    public Compiler createCompiler() {
        return new CppCompiler();
    }

    @Override
    public Debugger createDebugger() {
        return new CppDebugger();
    }
}
