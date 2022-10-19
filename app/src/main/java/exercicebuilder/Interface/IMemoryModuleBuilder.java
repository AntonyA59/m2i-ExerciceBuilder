package exercicebuilder.Interface;

import exercicebuilder.builder.ComputerBuilder;

import exercicebuilder.enumeration.DDRtypeEnum;

public interface IMemoryModuleBuilder {
    public ComputerBuilder and();

    public IMemoryModuleBuilder setFrequency(float frequency);

    public IMemoryModuleBuilder setMemory(int memory);

    public IMemoryModuleBuilder setDdrType(DDRtypeEnum ddrType);
}
