package vip.zhguo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import vip.zhguo.mapper.BookMapper;
import vip.zhguo.pojo.Book;

@SpringBootTest
class Springboot02ApplicationTests {
    @Autowired
    BookMapper bookMapper;


    @Test
    void contextLoads() {
        System.out.println(bookMapper.selectById(1));
    }
    @Test
    void contextLoads1() {
        System.out.println(bookMapper.updateById(new Book(5,"测试修改")));
    }

    @Test
    void contextLoads3() {
        System.out.println(bookMapper.deleteById(5));
    }

    @Test
    void contextLoads4() {
        System.out.println(bookMapper.getBookById(1));
    }

}
