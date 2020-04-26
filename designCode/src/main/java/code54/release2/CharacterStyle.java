package code54.release2;

import code54.release1.Font;

public class CharacterStyle {

    private Font font;

    private int size;

    private int colorRGB;

    public CharacterStyle(Font font, int size, int colorRGB) {
        this.font = font;
        this.size = size;
        this.colorRGB = colorRGB;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof CharacterStyle)) {
            return false;
        }
        CharacterStyle otherStyle = (CharacterStyle) o;
        return otherStyle.font.equals(this.font)
                && otherStyle.size == this.size
                && otherStyle.colorRGB == this.colorRGB;
    }


}
