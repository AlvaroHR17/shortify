package com.alvarohdr.shortifyapi.domain.utils;

import java.util.Random;

public class UriUtils {
    private final static String DICTIONARY = "0123456789ABCDEF";
    private final static int URI_LENGTH = 7;

    public static String crateUri(){
        StringBuilder uri = new StringBuilder();
        for(int i = 0; i < URI_LENGTH; i++){
            Random random = new Random();
            uri.append(DICTIONARY.charAt(random.nextInt(DICTIONARY.length())));
        }
        return uri.toString();
    }
}
