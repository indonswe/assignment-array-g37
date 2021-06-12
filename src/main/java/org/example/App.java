package org.example;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //String[] names = NameRepository.names;
        //names[0] = "Kalle Anka";
        //NameRepository.names[0]= "Kalle Anka";
        NameRepository dB = new NameRepository();
        String[] arrayOfNames = {"A B", "C D"};
        dB.setNames(arrayOfNames);
        int elementNames = dB.getSize();
        System.out.println(elementNames);
        String allNames = Arrays.toString(dB.findAll());
        System.out.println(allNames);
        dB.clear();
        allNames = Arrays.toString(dB.findAll());
        System.out.println(allNames);
        boolean success = dB.add("E F");
        allNames = Arrays.toString(dB.findAll());
        System.out.println(allNames);


    }
}
