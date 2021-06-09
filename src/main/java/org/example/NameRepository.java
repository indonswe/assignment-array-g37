package org.example;



public class NameRepository {
    static String[] names  = new String[0];

    public static int getSize(){
        int elements=names.length;
        return elements;
    }
    public static void clear(){
       names  = new String[names.length];
    }
    public static boolean add(final String fullName){
        int nl = names.length+1;
        String [] newArray = new String[nl];
        for(String i:names){
            if (i.equals(fullName)) return false;
        }
        newArray[nl-1] = fullName;
        for (int i = 0;i < names.length; i++)
        {
            newArray[i] = names[i];
        }
        newArray[nl-1] = fullName;
        names = newArray;
        return true;
    }
}
