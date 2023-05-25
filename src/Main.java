public class Main {
    public static void main(String[] args) {

        String myString = "ATTACKATDAWNABCXYZ";
        String encoded = Caesar.encode(myString, 3);
        System.out.println(encoded);

        Caesar.brute_force(encoded);


        }
    }