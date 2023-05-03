package day06;

public class ChooseLanguage {
    public static void main(String[] args) {

        int select = 3;
        String result = "";

        if (select ==1 ){
            result="Hello, thank for your call";
        } else if (select == 2) {
            result = "Hola, gracias para llamar";
        } else if (select == 3) {
            result = "Merhaba, aradiginiz icin tesekkurler";
        } else if (select == 4) {
            result= "Privet, spasibo za vash zvonok";
        } else if (select==5) {
            result ="Merci ,pour votre appel";
        }else {
            result= "Invalid select!";
        }
        System.out.println(result);

    }
}
/*
4. Create a class named ChooseLanguage, Given an integer variable named selection that has a number
between 1~5, Write a program that can select the language based on the number that's
given in selection and prints the following message:

		for 1: Hello, thank for your call
		for 2: Hola, gracias para llamar
		for 3: Merhaba, aradiginiz icin tesekkurler
		for 4: Privet, spasibo za vash zvonok
		for 5: Merci ,pour votre appel

	Note: Do not use more than one print statement

 */