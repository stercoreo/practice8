package work8.javaTools;

import work8.Debugger;

public class JavaDebugger implements Debugger {
    @Override
    public void debug(String code) {
        System.out.println("Debugging Java code: " + code);
    }
}
