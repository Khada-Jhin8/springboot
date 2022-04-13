package vip.zhguo.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Book {
    @TableId(value = "book_id")
    private Integer book_id;
    private String book_name;
}
