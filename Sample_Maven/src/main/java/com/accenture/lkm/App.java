package com.accenture.lkm;
import java.util.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        NavigableMap<Character,String> map=new TreeMap<>();
        map.put('a', "Java");
        map.put('b', "Dot Net");
        map.put('c', "SAP");
        map.put('d', "Big Data");
        map.put('e', "Cloud");
        map.put('f', "SAP-ABAP");
        NavigableMap<Character,String> m=map.descendingMap();
        m.forEach((a,b)->System.out.println(a+"->"+b));
        
    }
}
