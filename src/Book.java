public class Book {
    private String nameBook;
    private String author;
    private int publishingYear;

    public Book(String nameBook, String author, int publishingYear) {
        this.nameBook = nameBook;
        this.author = author;
        this.publishingYear = publishingYear;
    }
    public String getNameBook() {
        return this.nameBook;
    }
    public  String getAuthor() {
        return this.author;
    }
    public int getPublishingYear() {
        return this.publishingYear;
    }
    public void setPublishingYear(int year) {
        if (year > 1950 && year <= 2024) {
            this.publishingYear = year;
        }
        else {
            System.out.println("Ошибка ввода года издания.");
        }
    }

}
