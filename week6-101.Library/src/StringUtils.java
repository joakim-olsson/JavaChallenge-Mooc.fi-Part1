/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joak
 */
public class StringUtils {

    public static boolean included(String bookname, String searched) {
        if (bookname.toLowerCase().contains(searched.toLowerCase().trim())) {
            return true;
        } else {
            return false;
        }
    }
}