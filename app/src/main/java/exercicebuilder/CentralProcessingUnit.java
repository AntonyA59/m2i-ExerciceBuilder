package exercicebuilder;

import exercicebuilder.enumeration.ChipsetEnum;

public class CentralProcessingUnit {
    private float frequency;
    private ChipsetEnum chipset;
    private boolean hyperthreading;
    private int coreCount;

    public CentralProcessingUnit(float frequency, ChipsetEnum chipset, boolean hyperthreading, int coreCount) {
        this.frequency = frequency;
        this.chipset = chipset;
        this.hyperthreading = hyperthreading;
        this.coreCount = coreCount;
    }

    public float getFrequency() {
        return frequency;
    }

    public ChipsetEnum getChipset() {
        return chipset;
    }

    public boolean isHyperthreading() {
        return hyperthreading;
    }

    public int getCoreCount() {
        return coreCount;
    }

}
