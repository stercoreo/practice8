package work8.cppTools;

import work8.Debugger;

public class CppDebugger implements Debugger {
    @Override
    public void debug(String code) {
        System.out.println("Debugging C++ code: " + code);
    }
}
