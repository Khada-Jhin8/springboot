package vip.zhguo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import vip.zhguo.pojo.Book;
@Mapper
public interface BookMapper extends BaseMapper<Book> {
    @Select("select * from t_book where book_id = #{id}")
     Book getBookById(int id);

}
