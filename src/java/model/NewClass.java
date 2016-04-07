/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Cassius
 */
//public class NewClass {
//package model;
import businessServirce.PaymentId;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
/**
 *
 * @author Cassius
 */
public class NewClass {
    private static SessionFactory factory;
    public static void addpay(String invoiceN0, int membersMemberId, int usersUserId){
    try{
     Configuration config=new Configuration().configure();   
    factory = new Configuration().configure().buildSessionFactory();
    Session session=factory.openSession();
    Transaction trans=session.beginTransaction();
    PaymentId pa=new PaymentId();
    pa.setInvoiceN0(invoiceN0);
    pa.setMembersMemberId(membersMemberId);
    pa.setUsersUserId(usersUserId);
    session.save(pa);
    trans.commit();
    Query query= session.createQuery("from users where userID='"+ invoiceNo + "'");
    query= "select * from users where userID=221";
    
    System.out.println("users"+ "\n"+ pa.getMembersMemberId()+ "\n"+"added");
    

    }catch(Exception e){
        e.printStackTrace();
    } finally{
        
    }
    
    }
    
}
