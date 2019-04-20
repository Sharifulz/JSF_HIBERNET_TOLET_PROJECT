/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.modelDao;

import com.exam.model.Admin;
import com.exam.model.NewHibernateUtil;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author shaarif
 */

public class AdminDao {
    public Admin aAdmin(String username, String passw){
        Admin a = null;
        List<Admin> list = new ArrayList<>();
        Session ses = NewHibernateUtil.getSessionFactory().openSession();
        ses.getTransaction().begin();;
        Query q = ses.createQuery("from Admin where name=:a and pass=:b");
        q.setString("a", username);
        q.setString("b", passw);
        list = q.list();
        if (list!=null) {
            a = list.get(0);
        }else{
            a=null;
        }
        return a;
        
    }
}
