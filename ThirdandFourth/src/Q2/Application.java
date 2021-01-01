package Q2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Application {

	public static void main(String[] args) {
		
		Set<Book> books = new HashSet<Book>();
		books.add(new Book("Elektrik makinalari", 500, "Ola Alshikh", 2020));
		books.add(new Book("Mnatık", 250, "Necla doğan", 2018));
		books.add(new Book("Sinyaller ve sistemler", 600, "Şeyma ağır", 2008));
		books.add(new Book("unity", 185, "İbrahim abdelli", 2018));
		books.add(new Book("C PROGRAMMİNG", 125, "Tala hamso", 2001));
		books.add(new Book("İslam tarihi", 55, "Aya izz", 2010));
		
		Set<Book> allBooks = new TreeSet<Book>(books);
 
        System.out.println("----A'dan Z'ye kitap ismine göre sıralama----\n");
        for(Book book : allBooks) {
            System.out.println(book);
        }
        
        BookComparatorByNumberPage comparatorByNumberpage = new BookComparatorByNumberPage();
        Set<Book> sortedBooksByNumberPage = new TreeSet<Book>(comparatorByNumberpage);
        sortedBooksByNumberPage.addAll(books);
		
		System.out.println("\n\n----Kitap sayfa sayısına göre sıralama----\n");
		for(Book sortedBook : sortedBooksByNumberPage) {
            System.out.println(sortedBook);
        }
	}
	



	

}
