package work8.cppTools;

import work8.Compiler;

public class CppCompiler implements Compiler {
    @Override
    public void compile(String code) {
        System.out.println("Compiling C++ code: " + code);
    }
}
