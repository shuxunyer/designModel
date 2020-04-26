package code54.release2;

import code54.release1.Font;

import java.util.ArrayList;
import java.util.List;

public class CharacterStyleFactory {

    private static List<CharacterStyle> characterStyleList = new ArrayList<CharacterStyle>();

    public static CharacterStyle getStyle(Font font, int size, int colorRGB) {
        CharacterStyle newStyle = new CharacterStyle(font, size, colorRGB);
        for (CharacterStyle characterStyle : characterStyleList) {
            if (characterStyle.equals(newStyle)) {
                return characterStyle;
            }
        }
        characterStyleList.add(newStyle);
        return newStyle;
    }
}
