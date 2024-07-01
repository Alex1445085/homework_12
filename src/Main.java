public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Грег ", "Айлс");
        Author author2 = new Author("Николай ", "Гоголь");
        Book book1 = new Book("По стопам господа", author1 , 1977);
        Book book2 = new Book("Вечера на хуторе близ Диканьки", author2, 1956);

        System.out.print("book1 : " + book1.getNameBook() + ", ");
        System.out.print(book1.getAuthor().getAuthorFirstName() + book1.getAuthor().getAuthorSecondName() + ", ");
        System.out.println(book1.getPublishingYear());
        System.out.print("book2 : " + book2.getNameBook() + ", ");
        System.out.print(book2.getAuthor().getAuthorFirstName() + book2.getAuthor().getAuthorSecondName() + ", ");
        System.out.println(book2.getPublishingYear());

        book2.setPublishingYear(1958);

        System.out.print("book2 : " + book2.getNameBook() + ", ");
        System.out.print(book2.getAuthor().getAuthorFirstName() + book2.getAuthor().getAuthorSecondName() + ", ");
        System.out.println(book2.getPublishingYear());
    }
}