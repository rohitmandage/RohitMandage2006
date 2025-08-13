import java.io.*;


public class ReverseStringExample {

public static void main(String[] args) {

String originalString = "Hello Java";

StringBuilder sb = new StringBuilder(originalString);

String reversedString = sb.reverse().toString();

System.out.println("Original String: " + originalString);

System.out.println("Reversed String: " + reversedString);


    }
}