package loop_Practice02;

public class UniqueCharacters {
    public static void main(String[] args) {

        String characters = "AAGGGBJJkIIl";
        String unique = "";

        for (int i = 0; i < characters.length(); i++) {
            char each = characters.charAt(i);

            if (characters.indexOf(each) == characters.lastIndexOf(each)){
                unique += each;
            }
        }

        System.out.println(unique);

    }

}
/*
9. Create a class called UniqueCharacters, Write a program that can return the unique characters from a String

	            Ex:
	                input:
	                    AABCCD

	                output:
	                    BD

	            Hint: You will need indexOf() and lastIndexOf()
	                  if the first and last index numbers of the character are same, then it's unique
 */
