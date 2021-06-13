package org.example;



public class NameRepository {

    private static String[] namesArray = new String[0];

    //int counter = 0;

    //String name;


    public NameRepository() {
    }

    public static int getSize(){
        int elements=namesArray.length;
        return elements;
    }

    public static void setNames(String[]names){
        namesArray = names;
    }
    public static void clear(){
       //namesArray  = new String[namesArray.length];
        namesArray = new String[0];
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
        boolean notUpdate = false;
        for (String i : namesArray) {
            if (i.equals(original)){
                System.out.println("equals original");
                notUpdate = true;
                for (String j : namesArray) {
                    if (j.equals(updatedName)){
                        System.out.println("updated name existed");
                        return false;
                    }
                }
            }
        }
        if (!notUpdate) {
            return false;
        }
        for (int k = 0; k< namesArray.length; k++) {
            if (namesArray[k].equals(original)){
                namesArray[k] = updatedName;
            }
        }
        return true;
    }
    public static String[] findByFirstName(final String firstName){
        String []newArray = namesArray;
        boolean space= false;
        boolean match = false
        for (int i = 0; i< namesArray.length; i++) {
            for(int j = 0; j<namesArray[i].length();j++){
             if (namesArray[i].charAt(j) == ' ') {
                 space = true;
                 if (match){

                 }

             }
            if (namesArray[i].charAt(j)!=firstName.charAt(j)){
                namesArray[i] = updatedName;
            }
        }
        if(line != null){


            for(int i = 0; i < line.length(); i++){

                if(line.charAt(i) == ' '){
                    space= true;
                }

            }
        }
        return space;
    }
        return namesArray;
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
