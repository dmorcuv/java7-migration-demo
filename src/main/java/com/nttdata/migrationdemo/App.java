package com.nttdata.migrationdemo;

import javax.xml.bind.DatatypeConverter;
import java.util.Date;
import java.util.Vector;

public class App {

    public static String encodeBase64(String input) {
        // Usa JAXB DatatypeConverter (eliminado en Java 11+)
        return DatatypeConverter.printBase64Binary(input.getBytes());
    }

    public static Vector<String> oldCollectionExample() {
        Vector<String> v = new Vector<String>();
        v.add("hola");
        v.add("mundo");
        return v;
    }

    public static String formatLegacyDate(Date date) {
        // Código muy simplón, pero usando java.util.Date y toString
        return date.toString();
    }

    public static void main(String[] args) {
        System.out.println("Java 7 demo");
        System.out.println("Encoded: " + encodeBase64("NTTData"));
        System.out.println("Vector: " + oldCollectionExample());
        System.out.println("Date: " + formatLegacyDate(new Date()));
    }
}
