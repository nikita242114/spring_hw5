package repository;

import model.Reader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReaderRepository extends JpaRepository<Reader,Long> {

//    private final AtomicLong counter =new AtomicLong();
//    private final Map<Long, Reader> readers = new ConcurrentHashMap<>();
//
//
//
//    @PostConstruct
//    public void generateReaders() {
//        readers.put(counter.incrementAndGet(),new Reader(counter.get(),"Ivan"));
//        readers.put(counter.incrementAndGet(),new Reader(counter.get(),"Artem"));
//        readers.put(counter.incrementAndGet(),new Reader(counter.get(),"Kris"));
//        readers.put(counter.incrementAndGet(),new Reader(counter.get(),"Javochir"));
//        readers.put(counter.incrementAndGet(),new Reader(counter.get(),"Vika"));
//    }
//
//
//
//    // получить читателя по id
//    public Reader getReaderById(Long id) {
//        return readers.get(id);
//    }
//
//    //получить список всех читателей
//    public List<Reader> getAllReaders() { return new ArrayList<>(readers.values()); }
//
//    // создание читателя
//    public Reader addReader(Reader reader){
//        reader.setId(counter.incrementAndGet());
//        readers.put(reader.getId(), reader);
//        return reader;
//    }
//
//    //обновление читателей
//    public Reader updateReaders(Long id, Reader reader){
//        Reader updateReader = readers.get(id);
//        if(updateReader != null){
//            updateReader.setName(reader.getName());
//        }
//        return updateReader;
//    }
//
//    // удаление читателя
//    public void deleteReader(Long id){
//        readers.remove(id);
//    }
//
////    //заполнение списка выдачи
////    public void saveIssuesReader(Issue issue){
////        listIssue.add(issue);
////    }


}