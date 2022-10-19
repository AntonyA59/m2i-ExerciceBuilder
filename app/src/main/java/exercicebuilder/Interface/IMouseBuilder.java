package exercicebuilder.Interface;

import exercicebuilder.builder.ComputerBuilder;

import exercicebuilder.enumeration.ColorEnum;

public interface IMouseBuilder {
    ComputerBuilder and();

    IMouseBuilder setRgb(boolean rgb);

    IMouseBuilder setWired(boolean wired);

    IMouseBuilder setWireLength(float wireLength);

    IMouseBuilder setColor(ColorEnum color);
}
