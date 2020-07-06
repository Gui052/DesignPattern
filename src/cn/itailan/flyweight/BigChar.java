package cn.itailan.flyweight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 大型字符类
 */
public class BigChar {
    private char charName;
    private String frontData;

    public BigChar(char charName) {
        this.charName = charName;
        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader("big" + charName)
            );
            String line;
            StringBuilder buffer = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                buffer.append(line).append("\n");
            }
            reader.close();
            this.frontData = buffer.toString();
        } catch (IOException e) {
            this.frontData = charName + "?";
        }
    }

    public void print() {
        System.out.println(frontData);
    }
}
