package work_out;

class Book {
	String title;
	String author;

	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}

	public void displayinfo() {
		System.out.println("title: " + title);
		System.out.println("author: " + author);
	}
}

class paperbook extends Book {
	int pages;

	public paperbook(String title, String author, int pages) {
		super(title, author);
		this.pages = pages;
	}

	public void displaypages() {
		System.out.println("pages: " + pages);
	}
}

class ebook extends Book {
	double filesize;

	public ebook(String title, String author, double filesize) {
		super(title, author);
		this.filesize = filesize;
	}

	public void displayfilesize() {
		System.out.println("filesize: " + filesize + " mb");

	}
}

class audiobook extends Book {
	double duration;

	public audiobook(String title, String author, double duration) {
		super(title, author);
		this.duration = duration;
	}

	public void displayduration() {
		System.out.println("duration :" + duration + " hours");
	}
}

public class Book_Hierarchical_Inheritence {

	public static void main(String[] args) {
		paperbook pb = new paperbook("the catcher in the rye", "j.d.salinger", 224);
		ebook eb = new ebook("to kill a mockingbird", "harper lee", 2.5);
		audiobook ab = new audiobook("1984", "george orwell", 8.75);

		System.out.println("paperbook information");
		pb.displayinfo();
		pb.displaypages();
		System.out.println("ebook information");
		eb.displayinfo();
		eb.displayfilesize();
		System.out.println("audiobook information");
		ab.displayinfo();
		ab.displayduration();

	}

}
