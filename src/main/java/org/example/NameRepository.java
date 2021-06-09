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
    public static String find(final String fullName){
        for(String i:names){
            if (i.equals(fullName)) return fullName;
        }
        return null;
    }
    public static String[]findAll(){
        String []newArray = names;
        return newArray;
    }
    public static boolean update(final String original, final String updatedName) {
        for (String i : names) {
            if (i.equals(fullName)) return false;
        }
        return null;
    }
    public static boolean remove(final String fullName){

        //String[] newArray= new String[names.length-1];
        String[] newArray=names;

        boolean arrayCut = false;
        for(int i=0, k=0;i<newArray.length;i++){
            if(newArray[i]!=fullName){
                newArray[k]=newArray[i];
                k++;
            }
            else arrayCut = true;
        }
        if (arrayCut){
            String[] newArrayCut = new String[names.length-2];
            for(int i=0;i<(newArray.length-1);i++) {
                newArrayCut[i] = newArray[i];
            }
            return true;
        }
      return false;
    }
}
