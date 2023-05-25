public class Scytale {

    //encodes a message using Scytale cipher
    public static String encode(String input, int key){
        int message_len = input.length();
        int rows = key;
        int columns =  message_len / key + (message_len % key == 0 ? 0 : 1);

        //wrap the stick & write the message to it
        char[][] wrapped = new char[rows][columns];
        for (int i = 0; i < message_len; i++){
            wrapped[i/columns][i % columns] = input.charAt(i);
        }

        //unwrap the stick
        char[] unwrapped = new char[message_len];
        for (int i = 0; i < message_len; i++) {
            unwrapped[i] = wrapped[i%rows][i/rows];
        }

        String code = String.valueOf(unwrapped);
        return code;
    };


    // decodes a message using Scytale cipher
    public static String decode(String input, int key){
        int message_len = input.length();
        int rows = key;
        int columns =  message_len / key + (message_len % key == 0 ? 0 : 1);

        //wrap the stick
        char[][] wrapped = new char[rows][columns];
        for (int i = 0; i < message_len; i++){
            wrapped[i%rows][i/rows] = input.charAt(i);
        }

        //read the message
        char[] message_arr = new char[message_len];
        for (int i = 0; i < message_len; i++) {
            message_arr [i] = wrapped[i/columns][i%columns];
        }

        String message = String.valueOf(message_arr);
        return message;
    };


    //tries all combinations of keys up to n/2 for message length n
    public static void brute_force(String input){
        int message_len = input.length();
        for (int i = 2; i<=message_len/2; i++) {
            System.out.println("Trying key of: " + i + " resulting message: " + decode(input, i));
        }
    };

}
