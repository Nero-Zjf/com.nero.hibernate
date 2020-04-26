package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import test.enums.Size;
import test.po.IdCard;
import test.po.User;
import test.util.HibernateUtil;

import java.util.Date;
import java.util.List;

public class StateTest {
    public static void main(String[] args) {
        //插入用户
        User user = new User();
        user.setIdCard(new IdCard("440222333131313","nero"));

        Session session1 = HibernateUtil.getSessionFactory().openSession();
        Transaction ts1 = session1.beginTransaction();
        int reId = (Integer) session1.save(user);
        ts1.commit();//如果使用的sessionFactory.getCurrentSession() commit之后会关闭session
        session1.close();

        //查询用户
        Session session2 = HibernateUtil.getSessionFactory().openSession();
        Transaction ts2 = session2.beginTransaction();
        user = (User) session2.get(User.class, reId);
        ts2.commit();
        System.out.println("查询用户：" + user);
        session2.close();

        HibernateUtil.getSessionFactory().close();
    }
}
