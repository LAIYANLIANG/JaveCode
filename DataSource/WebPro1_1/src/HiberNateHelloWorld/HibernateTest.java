package HiberNateHelloWorld;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateTest {
	public static void main(String[] args) {
		// 1：創建一個SessionFactory物件
		SessionFactory sessionFactory = null;
		// 1-1創建Configuration對像：對應hibernate的基本信息，和對像關係映射信息(就是與資料庫連線啦!!)
		Configuration configuration = new Configuration().configure();
		sessionFactory = configuration.buildSessionFactory();
		// 1-2創建一個ServicRegistry 對像：Hibernate 4.x新加的物件
		// hibernate的任何配直和服務都需要在該對像中注冊後才能有效。
		// ServiceRegistry serviceRegistry=new Servicereg
		// 1-3
		sessionFactory = configuration.buildSessionFactory((ServiceRegistry) sessionFactory);
		// 2：創建一個Session對像
		Session session = sessionFactory.openSession();
		// 3：開啟事務
		Transaction transaction = session.beginTransaction();
		// 4：執行保存操作
		News news = new News("JAVA", "ATGUIGU", new Date(new java.util.Date().getTime()));
		session.save(news);
		// 5：提交事務
		transaction.commit();
		// 6：關閉Session
		session.close();
		// 7：關閉SessionFactory對像
		sessionFactory.close();
	}
}
