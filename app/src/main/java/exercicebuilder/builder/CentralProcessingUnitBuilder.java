package exercicebuilder.builder;

import exercicebuilder.CentralProcessingUnit;
import exercicebuilder.Interface.ICentralProcessingUnitBuilder;
import exercicebuilder.enumeration.ChipsetEnum;

public class CentralProcessingUnitBuilder implements ICentralProcessingUnitBuilder {
    private ComputerBuilder computerBuilder;
    private float frequency = 2000f;
    private ChipsetEnum chipset = ChipsetEnum.AMD;
    private boolean hyperthreading = true;
    private int coreCount = 4;

    public CentralProcessingUnitBuilder(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public CentralProcessingUnit build() {
        return new CentralProcessingUnit(frequency, chipset, hyperthreading, coreCount);
    }

    public ComputerBuilder and() {
        return computerBuilder;
    }

    public CentralProcessingUnitBuilder setFrequency(float frequency) {
        this.frequency = frequency;
        return this;
    }

    public CentralProcessingUnitBuilder setChipset(ChipsetEnum chipset) {
        this.chipset = chipset;
        return this;
    }

    public CentralProcessingUnitBuilder setHyperthreading(boolean hyperthreading) {
        this.hyperthreading = hyperthreading;
        return this;
    }

    public CentralProcessingUnitBuilder setCoreCount(int coreCount) {
        this.coreCount = coreCount;
        return this;
    }

}
