/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.modelDao;

import com.exam.model.Addv;
import com.exam.model.Member;
import com.exam.model.Payment;
import com.exam.model.NewHibernateUtil;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author shaarif
 */
@ManagedBean
@SessionScoped
public class PaymentDao {
    
    private String searchId;
    private List<Payment> list3a= new ArrayList<>();
    
        public List<Payment> paymentData(){
        List<Payment> list = new ArrayList<>();
        Session ses= NewHibernateUtil.getSessionFactory().openSession();
        ses.getTransaction().begin();
        Query q = ses.createQuery("from Payment");
        list = q.list();
        ses.close();
        return list;
    }

    public String getSearchId() {
        return searchId;
    }

    public void setSearchId(String searchId) {
        this.searchId = searchId;
    }

    public List<Payment> getList3a() {
        Session ses= NewHibernateUtil.getSessionFactory().openSession();
        Query q = ses.createQuery("from Payment where id=:a");
        q.setString("a", searchId);
        list3a = q.list();
        return list3a;
    }

    public void setList3a(List<Payment> list3a) {
        this.list3a = list3a;
    }
         public void saveData(Payment r){
        Session ses= NewHibernateUtil.getSessionFactory().openSession();
        ses.getTransaction().begin();
        ses.save(r);
        ses.getTransaction().commit();
        ses.close();
    }
     public void updateData(Payment r){
        Session ses= NewHibernateUtil.getSessionFactory().openSession();
        ses.getTransaction().begin();
        ses.update(r);
        ses.getTransaction().commit();
        ses.close();
    }
      public void deleteData(Payment r){
        Session ses= NewHibernateUtil.getSessionFactory().openSession();
        ses.getTransaction().begin();
        ses.delete(r);
        ses.getTransaction().commit();
        ses.close();
    }
}
