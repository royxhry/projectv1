package Model;
public class Book {
    private String title,author,published;
    private int numPage,year;
    public Book(String title, int year, int numPage, String author,String published){
        this.title = title;
        this.year = year;
        this.numPage = numPage;
        this.author = author;
        this.published = published;
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + ", published=" + published + ", numPage=" + numPage
                + ", year=" + year + "]";
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getPublished() {
        return published;
    }
    public void setPublished(String published) {
        this.published = published;
    }
    public int getNumPage() {
        return numPage;
    }
    public void setNumPage(int numPage) {
        this.numPage = numPage;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    

}



