/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.modelDao;

import com.exam.model.Addv;
import com.exam.model.Member;
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
public class AddvDao {
    private String searchLoc;
    private String searchByUserName;
    
    private List<Addv> list2a = new ArrayList<>();
    private List<Addv> list2b = new ArrayList<>();
    private List<Addv> list2c = new ArrayList<>();
    
     public List<Addv> addData(){
        List<Addv> list = new ArrayList<>();
        Session ses= NewHibernateUtil.getSessionFactory().openSession();
        ses.getTransaction().begin();
        Query q = ses.createQuery("from Addv");
        list = q.list();
        ses.close();
        return list;
    }

    public String getSearchLoc() {
        return searchLoc;
    }

    public void setSearchLoc(String searchLoc) {
        this.searchLoc = searchLoc;
    }

    public List<Addv> getList2a() {
         Session ses= NewHibernateUtil.getSessionFactory().openSession();
        Query q = ses.createQuery("from Addv where loc=:a");
        q.setString("a", searchLoc);
        list2a = q.list();
        return list2a;
    }

    public void setList2a(List<Addv> list2a) {
        this.list2a = list2a;
    }
    
        public void saveData(Addv r){
        Session ses= NewHibernateUtil.getSessionFactory().openSession();
        ses.getTransaction().begin();
        ses.save(r);
        ses.getTransaction().commit();
        ses.close();
    }
    public void updateData(Addv r){
        Session ses= NewHibernateUtil.getSessionFactory().openSession();
        ses.getTransaction().begin();
        ses.update(r);
        ses.getTransaction().commit();
        ses.close();
    }
     public void deleteData(Addv r){
        Session ses= NewHibernateUtil.getSessionFactory().openSession();
        ses.getTransaction().begin();
        ses.delete(r);
        ses.getTransaction().commit();
        ses.close();
    }

    public String getSearchByUserName() {
        return searchByUserName;
    }

    public void setSearchByUserName(String searchByUserName) {
        this.searchByUserName = searchByUserName;
    }

    public List<Addv> getList2b() {
        Session ses= NewHibernateUtil.getSessionFactory().openSession();
        ses.getTransaction().begin();
         Query q = ses.createQuery("from Addv where addtype=:a");
         q.setString("a", searchByUserName);
         list2b = q.list();
        return list2b;
    }

    public void setList2b(List<Addv> list2b) {
        this.list2b = list2b;
    }
    
    public List<Addv> getList2c(){
        Session ses= NewHibernateUtil.getSessionFactory().openSession();
        ses.getTransaction().begin();
         Query q = ses.createQuery("from Addv");
         list2c = q.list();
        return list2c;
    }

    public void setList2c(List<Addv> list2c) {
        this.list2c = list2c;
    }
    
}
