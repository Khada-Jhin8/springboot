package vip.zhguo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import vip.zhguo.service.IBookService;
import vip.zhguo.service.impl.BookService;


@SpringBootTest
class SpringbootTests {
    @Autowired
    IBookService bookService;


    @Test
    void test3() {
        System.out.println(bookService.list());
    }
}
