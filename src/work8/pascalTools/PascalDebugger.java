package work8.pascalTools;

import work8.Debugger;

public class PascalDebugger implements Debugger {
    @Override
    public void debug(String code) {
        System.out.println("Debugging Object Pascal code: " + code);
    }
}
