package code54.release2;

import code54.release1.Font;

import java.util.ArrayList;
import java.util.List;

public class Editor {

    private List<Character> chars = new ArrayList<Character>();

    public void appendCharacter(char c, Font font, int size, int colorRGB) {
        Character character = new Character(c, CharacterStyleFactory.getStyle(
                font, size, colorRGB)
        );
        chars.add(character);
    }
}
