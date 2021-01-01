package Q5;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class Application {

	private static final book book1 = null;
	private static book book2;
	private static book book3;
	private static book book4;
	private static book book5;
	private static book book6;

	public static void main(String[] args) {
		Set<book> books = new HashSet<book>();
		books.add(new book("kitap 1",150, "ola alshikh", 2020));
		books.add(new book("kitap 2",500, "tala hamsho", 2012));
		books.add(new book("kitap 3",75, "aya izz", 2007));
		books.add(new book("kitap 4",288, "vildan nur aka", 2016));
		books.add(new book("kitap 5",300, "layla alshikh", 2002));
		books.add(new book("kitap 6",55, "marwa alshikh", 2010));

		List<book> bookList = new ArrayList<book>();
		
		bookList.add(book1);
		
		bookList.add(book2);
		
		bookList.add(book3);
		
		bookList.add(book4);
		
		bookList.add(book5);
	
		bookList.add(book6);
		
		
		
		
		Stream<book> stream = bookList.stream();
		Consumer<? super book> printer = (book) -> {
			System.out.println(book);
		};
		stream.forEach(printer);

		Predicate<book> greaterThan100 = (book) -> {

			if (book.getNumberPages() > 100) {
				return true;
			}

			return false;
		};

		Set<book> greaterThan100List = bookList.stream().filter(greaterThan100).collect(Collectors.toSet());

		Consumer<book> bookPrinter = (book) -> System.out.println(book);

		System.out.println("\n\nSayfa sayısı 100'den fazla olan kitaplar\n");
		greaterThan100List.stream().forEach(bookPrinter);
	}
				
	
	}


