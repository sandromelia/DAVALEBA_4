package btu;

import generateText.Generator;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String language;
        String parameters;
        Scanner scanner = new Scanner(System.in);
//        language = scanner.nextLine();
//        parameters = scanner.nextLine();
        language = "en";
        parameters = "p-2-s-5-17-w-7-9";
        String[] parametersArray = parameters.split("-");
        ArrayList param = new ArrayList();
        for (String parameter: parametersArray) {
//            System.out.println(parameter);
            try {
               param.add(Integer.parseInt(parameter));
            } catch (NumberFormatException e) {
//                e.printStackTrace();
            }
        }
        System.out.println(param);
        Generator generator = new Generator(language, param);
        generator.generateAlphabet();
        System.out.println(generator.generateChar());
    }
}
