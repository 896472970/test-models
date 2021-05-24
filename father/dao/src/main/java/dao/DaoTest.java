package dao;

import com.sun.org.apache.xpath.internal.objects.XString;
import entity.EntityTest;

public class DaoTest {
    public String showDao(){
        EntityTest entityTest=new EntityTest();
        return  entityTest.showEntity()+"I'm dao";
    }
}
