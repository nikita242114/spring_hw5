package service;

import jakarta.transaction.Transactional;
import model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.BookRepository;
import repository.IssueRepository;

import java.util.List;

@Service
public class BookService {
    private final BookRepository bookRepository;
    private final IssueRepository issueRepository;

    @Autowired
    public BookService(BookRepository bookRepository, IssueRepository issueRepository) {
        this.bookRepository = bookRepository;
        this.issueRepository = issueRepository;
    }

    // получить книгу по id
    public Book getBookById(Long id) {
        return bookRepository.findById(id).get();
    }

    //получить список всех книг
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    // создание книги
    public Book addBook(Book book){
        return bookRepository.save(book);
    }

    //обновление книг
    @Transactional
    public Book updateBooks(Long id, Book book){
        Book updateBook = bookRepository.findById(id).orElseThrow(()-> new RuntimeException("Book not found"));
        updateBook.setName(book.getName());
        return bookRepository.save(updateBook);
    }

    // удаление книги
    public void deleteBook(Long id){
        bookRepository.deleteById(id);
    }


}