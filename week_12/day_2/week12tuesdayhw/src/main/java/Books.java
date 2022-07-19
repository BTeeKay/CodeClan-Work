public class Books {

    private String author;
    private String genre;
    private String title;

    public Books(String author, String genre, String title) {
        this.title = title;
        this.genre = genre;
        this.author = author;
    }

    public String getTitle() {
        return this.title;
    }
}
