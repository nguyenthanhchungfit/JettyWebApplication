/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package others;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author cpu11165-local
 */
public class TestStringRegex {
    public static void main(String[] args) {
        String songName = "Xa nhau chẳng dễ dàng".toLowerCase();
        String search = "xa".toLowerCase();
        System.out.println(songName.startsWith(search));
        
    }
}
