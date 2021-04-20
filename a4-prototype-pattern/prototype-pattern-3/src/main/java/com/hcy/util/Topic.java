package com.hcy.util;

import lombok.*;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Topic {

    /**
     * 选项；A、B、C、D
     */
    private Map<String, String> option;
    /**
     * 答案；B
     */
    private String key;


}
