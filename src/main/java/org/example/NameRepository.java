package org.example;



public class NameRepository {
    static String[] names  = new String[5];

    public static int getSize(){
        int elements=names.length;
        return elements;
    }
    public static void clear(){
       names  = new String[names.length];
    }
    
}
