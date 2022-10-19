package exercicebuilder.builder;

import java.util.ArrayList;
import java.util.List;

import exercicebuilder.Computer;
import exercicebuilder.MemoryModule;
import exercicebuilder.Interface.ICentralProcessingUnitBuilder;
import exercicebuilder.Interface.IMemoryModuleBuilder;
import exercicebuilder.Interface.IMouseBuilder;

public class ComputerBuilder {
    private MouseBuilder mouseBuilder = new MouseBuilder(this);
    private CentralProcessingUnitBuilder centralProcessingUnitBuilder = new CentralProcessingUnitBuilder(this);
    private List<MemoryModuleBuilder> listMemoryModuleBuilder = new ArrayList<MemoryModuleBuilder>();

    public Computer build() {
        List<MemoryModule> listMemoryModules = new ArrayList<MemoryModule>();
        for (MemoryModuleBuilder memoryModuleBuilder : listMemoryModuleBuilder) {
            listMemoryModules.add(memoryModuleBuilder.build());
        }
        return new Computer(mouseBuilder.build(), centralProcessingUnitBuilder.build(), listMemoryModules);
    }

    public IMouseBuilder setMouse() {
        return mouseBuilder;
    }

    public ICentralProcessingUnitBuilder setCentralProcessingUnit() {
        return centralProcessingUnitBuilder;

    }

    public IMemoryModuleBuilder addMemoryModule() {
        MemoryModuleBuilder memoryModuleBuilder = new MemoryModuleBuilder(this);
        this.listMemoryModuleBuilder.add(memoryModuleBuilder);
        return memoryModuleBuilder;
    }

}
