package test.po;

import org.hibernate.annotations.Parent;

import javax.persistence.Column;
import javax.persistence.Embeddable;

public class IdCard {
    private String cardNum;
    private String name;

    //无参构造器（必须提供）
    public IdCard() {
    }

    public IdCard(String cardNum, String name) {
        this.cardNum = cardNum;
        this.name = name;
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" +
                "\"cardNum\":\"" + cardNum + '\"' +
                ", \"name\":\"" + name + '\"' +
                '}';
    }
}
