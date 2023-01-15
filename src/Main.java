public class Main {


    public static void main(String[] args) {
        Author Tolstoy = new Author("Lev", "Tolstoy");
        Book warAndPeace = new Book("War and Peace", Tolstoy, 1867);
        System.out.println(warAndPeace);

        Author Pushkin = new Author("Aleksander", "Pushkin");
        Book captainsDaughter = new Book("The Captain's Daughter", Pushkin, 1836);
        System.out.println(captainsDaughter);

    }
}

