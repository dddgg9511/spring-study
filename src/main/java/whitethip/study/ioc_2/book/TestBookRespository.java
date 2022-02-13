package whitethip.study.ioc_2.book;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
public class TestBookRespository implements BookRepository{
}
