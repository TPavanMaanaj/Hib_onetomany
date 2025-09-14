import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HSFactory {
 
 static Configuration cfg;
 static SessionFactory sf;
 static Session session;
 
 public static Session getSession() {
  try {
   if(session==null) {
          cfg = new Configuration();
          cfg.configure("/hibernate.cfg.xml");
          // cfg.addAnnotatedClass(Emp.class);  // ✅ Ensure Hibernate knows about Emp
          sf = cfg.buildSessionFactory();
          session = sf.openSession();
   }
  } catch(Exception e) {
   e.printStackTrace();
  }
  return session;
 }
}