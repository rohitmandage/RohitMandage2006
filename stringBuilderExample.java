import java.io.*;


public class stringBuilderExample {

public static void main(String args[]) {

StringBuilder Sb=new StringBuilder ("This is my car");

Sb.append("hi");

Sb.insert(11,"Red");

System.out.println("print your string"+Sb);

Sb.delete(14,17);

System.out.println("Sb");
}
}

