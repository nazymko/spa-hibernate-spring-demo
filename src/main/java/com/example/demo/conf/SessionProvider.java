package com.example.demo.conf;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.metadata.ClassMetadata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Map;

//import org.hibernate.ejb.HibernateEntityManagerFactory;

@Service
public class SessionProvider {

    @Autowired
    private SessionFactory sessionFactory;

    @PostConstruct
    void afterInit() {
        System.out.println("SessionProvider.afterInit");
        final Session session = this.getSesion();
        Map<String, ClassMetadata> allClassMetadata = sessionFactory.getAllClassMetadata();
        for (Map.Entry<String, ClassMetadata> stringClassMetadataEntry : allClassMetadata.entrySet()) {
            System.out.println(stringClassMetadataEntry.getKey() + " : " + stringClassMetadataEntry.getValue().getEntityName());
        }
    }

    public Session getSesion() {
        return sessionFactory.openSession();
    }

}
