package day06;

public class CharacterIdentity {

    public static void main(String[] args) {

       
        char character = '7';

        boolean isDigit = character>'0' && character < '9';
        boolean isLetter = character >'A' && character< 'Z' ||character >'a'&& character< 'z';
        boolean isSpecialCharacter = !isLetter && !isDigit;
        String result = "";

        if (isDigit){
            result = "Digit";
        }
        if (isLetter){
            result = "Letter";
        }
        if(isSpecialCharacter){
            result = "Special character";
        }

        System.out.println(result);

    }
}
/*
5. Create a class named CharacterIdentity, and write a program that can identify if the given character is a
digit or Alphabetic Character(A~Z or a~Z) or a special character

		Ex:
			ch = '@'

		output:
			Special Character


			ch = '1'

		output:
			digit

		HINT: You may wanna check out the numbers of the chracters on ASCII table

 */
