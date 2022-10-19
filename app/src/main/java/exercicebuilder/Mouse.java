package exercicebuilder;

import exercicebuilder.enumeration.ColorEnum;

public class Mouse {
    private boolean rgb;
    private boolean wired;
    private float wireLength;
    private ColorEnum color;

    public Mouse(boolean rgb, boolean wired, float wireLength, ColorEnum color) {
        this.rgb = rgb;
        this.wired = wired;
        this.wireLength = wireLength;
        this.color = color;
    }

    public boolean isRgb() {
        return rgb;
    }

    public boolean isWired() {
        return wired;
    }

    public float getWireLength() {
        return wireLength;
    }

    public ColorEnum getColor() {
        return color;
    }

}
