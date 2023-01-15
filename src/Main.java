public class Main {


    public static void main(String[] args) {
        Author Tolstoy = new Author("Lev", "Tolstoy");
        Book warAndPeace = new Book("War and Peace", Tolstoy, 1867);
        System.out.println("Book 1");
        System.out.println("Title of the book: " + warAndPeace.getName());
        System.out.println("Author: " + warAndPeace.getAuthor().getAuthorName() + " " + warAndPeace.getAuthor().getAuthorSurname());
        System.out.println("Publication year: " + warAndPeace.getYear());

        Author Pushkin = new Author("Aleksander", "Pushkin");
        Book captainsDaughter = new Book("The Captain's Daughter", Pushkin, 1836);
        System.out.println("Book 2");
        System.out.println("Title of the book: " + captainsDaughter.getName());
        System.out.println("Author: " + captainsDaughter.getAuthor().getAuthorName() + " " + captainsDaughter.getAuthor().getAuthorSurname());
        System.out.println("Publication year: " + captainsDaughter.getYear());
        captainsDaughter.setYear(1922);
        System.out.println("Publication year: " + captainsDaughter.getYear());

    }
}

