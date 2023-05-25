public class Main {
    public static void main(String[] args) {

        String myString = "attackatdawn";
        String encoded = Scytale.encode(myString, 3);

        System.out.println(encoded);

        String decoded = Scytale.decode(encoded, 3);
        System.out.println(decoded);

        Scytale.brute_force("AFNFNBNGGEEARINNISAGFOU");

        }
    }