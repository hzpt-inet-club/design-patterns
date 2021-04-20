package com.hcy;

import lombok.*;

/**
 * 问答题目
 * @author HCY
 * @since 2021/3/17 下午10:45
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class AnswerQuestion {

    /**
     * 问题
     */
    private String name;
    /**
     * 答案
     */
    private String key;

}
