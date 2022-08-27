package org.gipoong.client;

import org.gipoong.domain.Employee;
import org.gipoong.domain.EmployeeId;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeServiceClient {

    public static void main(String[] args) {

        // 엔티티 매니저 팩토리 생성
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Chapter03");

        // 엔티티 매니저 생성
        EntityManager em = emf.createEntityManager();

        // 엔티티 트랜잭션 생성
        EntityTransaction tx = em.getTransaction();

        try{
            EmployeeId empId = new EmployeeId(1L, "guset123");
            Employee findEmployee = em.find(Employee.class, empId);
            System.out.println("검색된 직원 정보 : " + findEmployee.toString());
        }catch(Exception e){
            e.printStackTrace();

            tx.rollback();
        }finally{
            em.close();
            emf.close();
        }
    }
}
