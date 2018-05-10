/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.*;
import java.util.*;
/**
 *
 * @author mitchellwong
 */
public class FontMapper {
    public FontMapper(){
        Font courier = new Font("Courier New", Font.PLAIN, 6);
        Font times = new Font("Times New Roman", Font.BOLD, 12);
        Font verdana = new Font("Verdana", Font.ITALIC, 25);
        HashMap<String, Font>fonts = new HashMap<>();
        fonts.put("smallprint", courier);
        fonts.put("body", times);
        fonts.put("headline", verdana);
        for (Map.Entry<String, Font>entry : fonts.entrySet()){
            String key = entry.getKey();
            Font value = entry.getValue();
            System.out.println(key + ": " + value.getSize() + "-pt " + value.getFontName());
        }
    }
    
    public static void main(String[] args){
        new FontMapper();
    }
}
