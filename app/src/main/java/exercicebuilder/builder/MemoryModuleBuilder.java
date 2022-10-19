package exercicebuilder.builder;

import exercicebuilder.MemoryModule;
import exercicebuilder.Interface.IMemoryModuleBuilder;
import exercicebuilder.enumeration.DDRtypeEnum;

public class MemoryModuleBuilder implements IMemoryModuleBuilder {
    private ComputerBuilder computerBuilder;
    private float frequency = 2000f;
    private int memory = 16;
    private DDRtypeEnum ddrType = DDRtypeEnum.DDR4;

    public MemoryModuleBuilder(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public MemoryModule build() {
        return new MemoryModule(frequency, memory, ddrType);
    }

    public ComputerBuilder and() {
        return computerBuilder;
    }

    public MemoryModuleBuilder setFrequency(float frequency) {
        this.frequency = frequency;
        return this;
    }

    public MemoryModuleBuilder setMemory(int memory) {
        this.memory = memory;
        return this;
    }

    public MemoryModuleBuilder setDdrType(DDRtypeEnum ddrType) {
        this.ddrType = ddrType;
        return this;
    }

}
