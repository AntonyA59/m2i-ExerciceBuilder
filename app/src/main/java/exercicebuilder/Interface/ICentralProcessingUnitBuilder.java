package exercicebuilder.Interface;

import exercicebuilder.builder.ComputerBuilder;
import exercicebuilder.enumeration.ChipsetEnum;

public interface ICentralProcessingUnitBuilder {

    public ComputerBuilder and();

    public ICentralProcessingUnitBuilder setFrequency(float frequency);

    public ICentralProcessingUnitBuilder setChipset(ChipsetEnum chipset);

    public ICentralProcessingUnitBuilder setHyperthreading(boolean hyperthreading);

    public ICentralProcessingUnitBuilder setCoreCount(int coreCount);
}
