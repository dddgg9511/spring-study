package whitethip.study.ioc_2.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class BookService{
    @Autowired
    BookRepository myBookRepository;

    public void printBookRepository(){
//        System.out.println(myBookRepository.getClass());
    }

    @PostConstruct
    public void setUp(){
        System.out.println(myBookRepository.getClass());
    }
}
