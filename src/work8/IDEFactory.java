package work8;

public interface IDEFactory {
    Validator createValidator();
    Compiler createCompiler();
    Debugger createDebugger();
}
