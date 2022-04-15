package vip.zhguo.util;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResultDto {
    private String code;
    private Object Data;
}
