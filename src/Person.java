import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Person {
    String firstname;
    String surname;
    String street;
    int zipCode;
    String City;

    void  initialize()throws IOException {
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter your firstname: ");
        firstname = Br.readLine();
        System.out.println("Please enter your surname: ");
        surname = Br.readLine();
        System.out.println("Please enter your street name: ");
        street = Br.readLine();
        System.out.println("Please enter your zip code: ");
        zipCode = Integer.parseInt(Br.readLine());
        System.out.println("Please enter your city: ");
        City = Br.readLine();
    }
    void print(){
        System.out.println("");
        System.out.println(firstname+"\n"+surname+"\n"+street+"\n"+zipCode+"\n"+City);
    }
}
