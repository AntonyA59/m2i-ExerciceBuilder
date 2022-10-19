package exercicebuilder;

import exercicebuilder.enumeration.DDRtypeEnum;

public class MemoryModule {
    private float frequency;
    private int memory;
    private DDRtypeEnum ddrType;

    public MemoryModule(float frequency, int memory, DDRtypeEnum ddrType) {
        this.frequency = frequency;
        this.memory = memory;
        this.ddrType = ddrType;
    }

    public float getFrequency() {
        return frequency;
    }

    public int getMemory() {
        return memory;
    }

    public DDRtypeEnum getDdrType() {
        return ddrType;
    }

}
