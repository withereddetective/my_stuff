import java.util.LinkedHashMap;
import java.util.Scanner;

public class string_short {

    public static int find_num_of_char_occurances(char target_char, String input){

        int num = 0;
        for (int i = 0; i < input.length(); i++){
            if (input.charAt(i) == target_char){
                num++;
            }
        }
        return num;

    }

    public static boolean is_in(char target_char, char[] char_array){

        for (char c : char_array){
            if (c == target_char){
                return true;
            }
        }
        return false;

    }

    public static void algorithm_1(String input){

        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        char last_char = ' ';
        String new_string = "";

        int vowel_count = 0;
        int repeat_count = 0;
        int char_count = 0;

        for (int i = 0; i < input.length(); i++){

            if (is_in(input.charAt(i), vowels) && input.charAt(i - 1) == ' ' && input.charAt(i + 1) == ' '){

                new_string = new_string + input.charAt(i);

            } else if (!is_in(input.charAt(i), vowels) && input.charAt(i) != last_char){

                new_string = new_string + input.charAt(i);

            } else {

                if (is_in(input.charAt(i), vowels)){
                    vowel_count++;
                }
                if (input.charAt(i) == last_char){
                    repeat_count++;
                }
                char_count++;

            }
            last_char = input.charAt(i);

        }
        
        System.out.println("vowels removed: " + vowel_count);
        System.out.println("repeats removed: " + repeat_count);
        System.out.println("new message: " + new_string);
        System.out.println("characters saved: " + char_count);

    }

    public static void algorithm_2(String input){

        LinkedHashMap<Character, Integer> char_counter = new LinkedHashMap<>();

        for (int i = 0; i < input.length(); i++){
            if (input.charAt(i) != ' '){

                char_counter.put(input.charAt(i), find_num_of_char_occurances(input.charAt(i), input));

            }
        }

        System.out.println("\nunique characters found: " + char_counter.size());
        System.out.print("new message: ");
        char_counter.forEach((key, value) -> System.out.print(String.valueOf(value) + key));
        System.out.println("\ncharacters saved: " + (input.length() - (char_counter.size()) * 2));

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a string: ");
        String input = scan.nextLine();
        input = input.toLowerCase();
        scan.close();

        System.out.println("algorithm 1");
        algorithm_1(input);

        System.out.println("\n");

        System.out.println("algorithm 2");
        algorithm_2(input);

    }
}
