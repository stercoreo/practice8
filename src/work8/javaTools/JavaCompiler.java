package work8.javaTools;

import work8.Compiler;

public class JavaCompiler implements Compiler {
    @Override
    public void compile(String code) {
        System.out.println("Compiling Java code: " + code);
    }
}
