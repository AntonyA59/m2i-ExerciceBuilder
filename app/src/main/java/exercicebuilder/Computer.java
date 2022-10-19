package exercicebuilder;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    private Mouse mouse;
    private CentralProcessingUnit cpu;
    private List<MemoryModule> memoryModules = new ArrayList<MemoryModule>();

    public Computer(Mouse mouse, CentralProcessingUnit cpu, List<MemoryModule> memoryModules) {
        this.mouse = mouse;
        this.cpu = cpu;
        this.memoryModules = memoryModules;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public CentralProcessingUnit getCpu() {
        return cpu;
    }

    public List<MemoryModule> getMemoryModules() {
        return memoryModules;
    }

}
