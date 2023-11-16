import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Staff extends Person{
    String education;
    String position;

    void initialize1() throws IOException {
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
        initialize();
        System.out.println("Please enter your education");
        education = BR.readLine();
        System.out.println("Please enter your position");
        position = BR.readLine();
    }
    void print1(){
        print();
        System.out.println(education+"\n"+position);
    }
}
