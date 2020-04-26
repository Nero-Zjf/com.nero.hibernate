package test.po;

import org.hibernate.annotations.*;
import test.enums.Size;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.*;


@Entity //声明该类是一个Hibernate的持久化类
@Table(name = "user")//指定该类映射的表，name是表名
public class User {
    //指定该类的唯一标识，通常映射到数据表的主键
    @Id
    //指定主键的生成策略，其中strategy属性指定了主键生成策略为IDENTITY策略，也就是采用MySQL自动增长的主键生成策略
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    //组件属性
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "cardNum",column = @Column(name = "card_num"))
    })
    private IdCard idCard;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public IdCard getIdCard() {
        return idCard;
    }

    public void setIdCard(IdCard idCard) {
        this.idCard = idCard;
    }

    @Override
    public String toString() {
        return "{" +
                "\"id\":" + id +
                ", \"idCard\":" + idCard +
                '}';
    }
}
