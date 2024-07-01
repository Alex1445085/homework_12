public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("По стопам господа", "Грег Айлс", 1977);
        Book book2 = new Book("Вечера на хуторе близ Диканьки", "Нииколай Гоголь", 1956);

        System.out.print("book1 : " + book1.getNameBook() + ", ");
        System.out.print(book1.getAuthor() + ", ");
        System.out.println(book1.getPublishingYear());
        System.out.print("book2 : " + book2.getNameBook() + ", ");
        System.out.print(book2.getAuthor() + ", ");
        System.out.println(book2.getPublishingYear());

        book2.setPublishingYear(1958);

        System.out.print("book2 : " + book2.getNameBook() + ", ");
        System.out.print(book2.getAuthor() + ", ");
        System.out.println(book2.getPublishingYear());
    }
}