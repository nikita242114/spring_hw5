package repository;

import model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {

//  private final AtomicLong counter =new AtomicLong();
//  private final Map<Long,Book> books = new ConcurrentHashMap<>();
//
//
//
//  @PostConstruct
//  public void generateBooks() {
//    books.put(counter.incrementAndGet(),new Book(counter.get(),"война и мир"));
//    books.put(counter.incrementAndGet(),new Book(counter.get(),"метрвые души"));
//    books.put(counter.incrementAndGet(),new Book(counter.get(),"чистый код"));
//  }
//
// // получить книгу по id
//  public Book getBookById(Long id) {
//    return books.get(id);
//  }
//
//  //получить список всех книг
//  public List<Book> getAllBooks() { return new ArrayList<>(books.values()); }
//
//  // создание книги
//  public Book addBook(Book book){
//    book.setId(counter.incrementAndGet());
//    books.put(book.getId(), book);
//    return book;
//  }
//
//  //обновление книг
//  public Book updateBooks(Long id, Book book){
//    Book updateBook = books.get(id);
//    if(updateBook != null){
//      updateBook.setName(book.getName());
//    }
//    return updateBook;
//  }
//
//  // удаление книги
//  public void deleteBook(Long id){
//    books.remove(id);
//  }

}
