package libraryManagement;

class Book {
    private static int code = 1;
    private String title;
    private String author;
    private String subject;
    private int edition;
    private int volume;
    private String publication;
    private int publishedYear;
    private boolean available;
    private int bookCode;
    
    Book(){
	bookCode = code;
	available = true;
	code++;
    }
    
    void setTitle (String t) {
	title = t;
    }
    void setAuthor (String a) {
	author = a;
    }
    void setSubject (String s) {
	subject = s;
    }
    void setEdition (int e) {
	edition = e;
    }
    void setVolume (int v) {
	volume = v;
    }
    void setPublication (String p) {
	publication = p;
    }
    void setPublishedYear (int y) {
	publishedYear = y;
    }
    void setAvailable (boolean a) {
	available = a;
    }
    String getTitle () {
	return title;
    }
    String getAuthor () {
	return author;
    }
    String getSubject () {
	return subject;
    }
    int getEdition () {
	return edition;
    }
    int getVolume () {
	return volume;
    }
    String getPublication () {
	return publication;
    }
    int getPublishedYear () {
	return publishedYear;
    }
    boolean getAvailable () {
	return available;
    }
    int getBookCode () {
	return bookCode;
    }
    
    public String toString () {
	String objectValue = "                      Title : " + title + "\n" +
						"                     Author : " + author + "\n" +
						"                    Subject : " + subject + "\n" +
						"                    Edition : " + edition + "\n" +
						"                     Volume : " + volume + "\n" +
						"                Publication : " + publication + "\n" +
						"              PublishedYear : " + publishedYear + "\n" +
						"                   BookCode : " + bookCode + "\n";
	return objectValue;
    }
}
