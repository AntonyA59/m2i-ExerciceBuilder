package exercicebuilder.builder;

import exercicebuilder.Mouse;
import exercicebuilder.Interface.IMouseBuilder;
import exercicebuilder.enumeration.ColorEnum;

public class MouseBuilder implements IMouseBuilder {
    private ComputerBuilder computerBuilder;
    private boolean rgb = true;
    private boolean wired = true;
    private float wireLength = 2.5f;
    private ColorEnum color = ColorEnum.RED;

    public MouseBuilder(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public Mouse build() {
        return new Mouse(rgb, wired, wireLength, color);
    }

    public ComputerBuilder and() {
        return computerBuilder;
    }

    public MouseBuilder setRgb(boolean rgb) {
        this.rgb = rgb;
        return this;
    }

    public MouseBuilder setWired(boolean wired) {
        this.wired = wired;
        return this;
    }

    public MouseBuilder setWireLength(float wireLength) {
        this.wireLength = wireLength;
        return this;
    }

    public MouseBuilder setColor(ColorEnum color) {
        this.color = color;
        return this;
    }

}
