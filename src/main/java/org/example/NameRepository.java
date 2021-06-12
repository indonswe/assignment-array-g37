package org.example;



public class NameRepository {

    private static String[] namesArray = new String[5];
    int counter = 0;

    //String name;

    public NameRepository(String name) {
        //this.name = name;
        namesArray[counter] = name;
        this.counter++;
    }

    public static int getSize(){
        int elements=namesArray.length;
        return elements;
    }

    public static void setNames(String[]names){
        namesArray = names;
    }
    public static void clear(){
       namesArray  = new String[namesArray.length];
    }
    public static boolean add(final String fullName){
        int nl = namesArray.length+1;
        String [] newArray = new String[nl];
        for(String i:namesArray){
            if (i.equals(fullName)) return false;
        }
        newArray[nl-1] = fullName;
        for (int i = 0;i < namesArray.length; i++)
        {
            newArray[i] = namesArray[i];
        }
        newArray[nl-1] = fullName;
        namesArray = newArray;
        return true;
    }
    public static String find(final String fullName){
        for(String i:namesArray){
            if (i.equals(fullName)) return fullName;
        }
        return null;
    }
    public static String[]findAll(){
        String []newArray = namesArray;
        return newArray;
    }
    public static boolean update(final String original, final String updatedName) {
        boolean updated = false;
        for (String i : namesArray) {
            if (i.equals(original)){

            }
        }
        for (String i : namesArray) {
            if (i.equals(original)){

            }
        }
        return true;
    }
    public static String[] findByFirstName(final String firstName){
        return null;
    }
    public static String[] findByLastName(final String lastName){
        return  null;
    }
    public static boolean remove(final String fullName){

        //String[] newArray= new String[names.length-1];
        String[] newArray=namesArray;

        boolean arrayCut = false;
        for(int i=0, k=0;i<newArray.length;i++){
            if(newArray[i]!=fullName){
                newArray[k]=newArray[i];
                k++;
            }
            else arrayCut = true;
        }
        if (arrayCut){
            String[] newArrayCut = new String[namesArray.length-2];
            for(int i=0;i<(newArray.length-1);i++) {
                newArrayCut[i] = newArray[i];
            }
            return true;
        }
      return false;
    }
}
