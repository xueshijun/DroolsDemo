package com.ws.soon.test.collect;

import com.ws.soon.entity.Person;
import com.ws.soon.entity.School;
import org.junit.Test;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import java.util.*;

public class RuleCollect {

    @Test
    public void testFromCollect(){
        KieServices kss = KieServices.Factory.get();
        KieContainer kc = kss.getKieClasspathContainer();
        KieSession ks =kc.newKieSession("ks-Collect");

        ks.insert(new Person("张三","一班"));
        ks.insert(new Person("李四","一班"));
        ks.insert(new Person("王五","二班"));
        ks.insert(new Person("赵六","一班"));

        int count = ks.fireAllRules();
        System.out.println("总执行了"+count+"条规则");
        ks.dispose();
    }

    @Test
    public void testFromCollectFrom(){
        KieServices kss = KieServices.Factory.get();
        KieContainer kc = kss.getKieClasspathContainer();
        KieSession ks =kc.newKieSession("ks-Collect");
        List clsList=new ArrayList();
        clsList.add(new Person("张三","一班"));
        clsList.add(new Person("李四","一班"));
        clsList.add(new Person("王五","二班"));
        clsList.add(new Person("赵六","一班"));
        School school=new School();
        school.setClassNameList(clsList);
        ks.insert(school);
        int count = ks.fireAllRules();
        System.out.println("总执行了"+count+"条规则");
        ks.dispose();
    }
}
