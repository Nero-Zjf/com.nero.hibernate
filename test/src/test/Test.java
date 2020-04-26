package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import test.po.User;

import java.util.List;

public class Test {

    // SessionFactory全局只需要有一个就可以了，因为它的创建和销毁需要消耗大量的资源，初始化信息会比较多，并且它是线程安全的，可以在多线程的环境下使用它
    private static SessionFactory sessionFactory;

    //初始化SessionFactory
    static {
        Configuration cfg = new Configuration();
        cfg.configure();//加载默认位置的配置文件
//        cfg.configure("hibernate.cfg.xml");//加载指定位置的配置文件
        ServiceRegistry registry = new StandardServiceRegistryBuilder()
                .applySettings(cfg.getProperties())
                .build();
        sessionFactory = cfg.buildSessionFactory(registry);
    }

    public static void main(String[] args) {
//        //插入用户
//        User user = new User();
//        user.setId(1);
//        user.setName("nero");
//
//        Session session1 = sessionFactory.openSession();
//        Transaction ts1 = session1.beginTransaction();
//        int reId = (Integer) session1.save(user);
//        ts1.commit();
//        session1.close();
//
//        //查询用户
//        Session session2 = sessionFactory.openSession();
//        Transaction ts2 = session2.beginTransaction();
//        user = (User) session2.get(User.class, reId);
//        ts2.commit();
//        session2.close();
//        System.out.println("查询用户：" + user);
//
//        //更新用户
//        user.setName("update");
//        Session session3 = sessionFactory.openSession();
//        Transaction ts3 = session3.beginTransaction();
//        session3.update(user);
//        ts3.commit();
//        session3.close();
//
//        //查询所有用户
//        Session session4 = sessionFactory.openSession();
//        Transaction ts4 = session4.beginTransaction();
//        List users = session4.createQuery("FROM User").list();
//        ts4.commit();
//        session4.close();
//        System.out.println(users);
//
//        //删除用户
//        Session session5 = sessionFactory.openSession();
//        Transaction ts5 = session5.beginTransaction();
//        User userDel = (User) session5.get(User.class, reId);
//
//        session5.delete(userDel);
//        ts5.commit();
//        session5.close();
//        sessionFactory.close();
    }
}
