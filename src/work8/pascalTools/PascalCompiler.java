package work8.pascalTools;

import work8.Compiler;

public class PascalCompiler implements Compiler {
    @Override
    public void compile(String code) {
        System.out.println("Compiling Object Pascal code: " + code);
    }
}
