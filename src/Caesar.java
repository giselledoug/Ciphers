//Caesar cipher is shift or additive cipher. Key represents how far it should be shifted
//For simplicity will work with uppercase only
public class Caesar {
    public static String encode (String input, int key){
        char[] input_arr = input.toCharArray();

        for (int i = 0; i < input_arr.length; i++){
            input_arr[i] = (char) (input_arr[i] + key);
            if (input_arr[i] > 'Z') {
                input_arr[i] = (char) (input_arr[i] - 26);
            }
        }

        String code = String.valueOf(input_arr);
        return code;
    }

    public static String decode (String input, int key) {
        char[] input_arr = input.toCharArray();

        for (int i = 0; i < input_arr.length; i++){
            input_arr[i] = (char) (input_arr[i] - key);
            if (input_arr[i] < 'A') {
                input_arr[i] = (char) (input_arr[i] + 26);
            }
        }

        String message = String.valueOf(input_arr);
        return message;
    }

    public static void brute_force(String input){
        for (int i = 1; i <= 26; i++){
            System.out.println("Trying key of: " + i + " resulting message: " + decode(input, i));
        }

    }



}
