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
        NameRepository.names[0]= "Kalle Anka";
        int elementNames = NameRepository.getSize();
        System.out.println(elementNames);
        String allNames = Arrays.toString(NameRepository.findAll());
        System.out.println(allNames);

    }
}
