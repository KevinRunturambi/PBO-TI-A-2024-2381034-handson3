package handson1;

public class Foreach {
    public static void main(String[] args) {
        String[] kumpulanBuah = new String[] {"Apel", "Pisang", "Mangga", "Jeruk"};

        for (String itemBuah : kumpulanBuah) {
            System.out.println(itemBuah);
        }
    }
}