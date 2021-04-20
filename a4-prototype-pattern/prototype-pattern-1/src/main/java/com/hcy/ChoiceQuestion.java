package com.hcy;

import lombok.*;

import java.util.Map;

/**
 * 选择题目
 * @author HCY
 * @since 2021/3/17 下午10:46
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ChoiceQuestion {
    /**
     * 题目
     */
    private String name;
    /**
     * 选项；A、B、C、D
     */
    private Map<String, String> option;
    /**
     * 答案；B
     */
    private String key;
}
