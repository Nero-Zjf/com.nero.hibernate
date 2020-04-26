package test.po;

import org.hibernate.annotations.Formula;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;
import test.enums.Size;

import javax.persistence.*;
import java.util.Date;


@Entity//声明该类是一个Hibernate的持久化类
@Table(name = "Person")//指定该类映射的表，name是表名
public class Person {
    @Id //指定该类的唯一标识，通常映射到数据表的主键
    //指定主键的生成策略，其中strategy属性指定了主键生成策略为IDENTITY策略，也就是采用MySQL自动增长的主键生成策略
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
}
