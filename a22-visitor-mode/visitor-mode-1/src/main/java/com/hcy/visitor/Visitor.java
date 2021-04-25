package com.hcy.visitor;


import com.hcy.user.impl.Student;
import com.hcy.user.impl.Teacher;

/**
 * 定义访问数据接口
 * @author HCY
 * @since 2021/4/25 2:17 下午
*/
public interface Visitor {

    /**
     * 访问学生信息
     * @author HCY
     * @since 2021/4/25 2:17 下午
     * @param student:
     * @return void
    */
    void visit(Student student);

    /**
     * 访问老师信息
     * @author HCY
     * @since 2021/4/25 2:17 下午
     * @param teacher:
     * @return void
    */
    void visit(Teacher teacher);

}
