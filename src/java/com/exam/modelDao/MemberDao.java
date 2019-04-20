/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.modelDao;

import com.exam.model.Member;
import com.exam.model.NewHibernateUtil;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.hibernate.Query;
import org.hibernate.Session;
import org.primefaces.PrimeFaces;

/**
 *
 * @author shaarif
 */
@ManagedBean
@SessionScoped
public class MemberDao {
       private String searchName;
    
    private List<Member> list1a= new ArrayList<>();
    
    public List<Member> memberData(){
        List<Member> list = new ArrayList<>();
        Session ses= NewHibernateUtil.getSessionFactory().openSession();
        ses.getTransaction().begin();
        Query q = ses.createQuery("from Member");
        list = q.list();
        ses.close();
        return list;
    }
    
   
    
      public String getSearchName() {
        return searchName;
    }

    public void setSearchName(String searchName) {
        this.searchName = searchName;
    }

    public List<Member> getList1a() {
       
        Session ses= NewHibernateUtil.getSessionFactory().openSession();
        Query q = ses.createQuery("from Member where cont=:a");
        q.setString("a", searchName);
        list1a = q.list();
        return list1a;
    }

    public void setList1a(List<Member> list1a) {
        this.list1a = list1a;
    }
    
      public void saveData(Member r){
        Session ses= NewHibernateUtil.getSessionFactory().openSession();
        ses.getTransaction().begin();
        ses.save(r);
        ses.getTransaction().commit();
        ses.close();
    }
      
    public void updateData(Member r){
        Session ses= NewHibernateUtil.getSessionFactory().openSession();
        ses.getTransaction().begin();
        ses.update(r);
        ses.getTransaction().commit();
        ses.close();
    }
    
    public void deleteData(Member r){
        Session ses= NewHibernateUtil.getSessionFactory().openSession();
        ses.getTransaction().begin();
        ses.delete(r);
        ses.getTransaction().commit();
        ses.close();
    }
    
    //LOG IN
    
        public Member aMember(String username, String passw){
        Member a = null;
        List<Member> list = new ArrayList<>();
        Session ses = NewHibernateUtil.getSessionFactory().openSession();
        ses.getTransaction().begin();;
        Query q = ses.createQuery("from Member where name=:a and pass=:b");
        q.setString("a", username);
        q.setString("b", passw);
        list = q.list();
        if (list!=null) {
            a = list.get(0);
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "WELCOME ", "WELCOME TO MEMBER PAGE \n\t YOU ARE A MEMBER");
        PrimeFaces.current().dialog().showMessageDynamic(message);
        }else{
             FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "LOGIN FAILED", "INVALID CREDENTIALS");
        PrimeFaces.current().dialog().showMessageDynamic(message);
            a=null;
        }
        return a;
        
    }
}
