package vip.zhguo.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {
    @TableId(value = "id")
    private Integer id;
    private String type;
    private String name;
    private String description;
}
