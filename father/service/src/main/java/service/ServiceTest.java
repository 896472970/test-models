package service;

import dao.DaoTest;

public class ServiceTest {
    public  String showService(){
        DaoTest daoTest = new DaoTest();
        return  daoTest.showDao()+"I'm service";
    }

}
