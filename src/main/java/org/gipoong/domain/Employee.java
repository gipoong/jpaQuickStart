package org.gipoong.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "S_EMP")
/*@SequenceGenerator(name = "S_EMP_GENERATOR",
                sequenceName = "S_EMP_SEQUENCE",
                initialValue = 1,
                allocationSize = 1)
@TableGenerator(name = "SEQ_GENERATOR",
            table = "SHOPPING_SEQUENCE",
            pkColumnName = "SEQ_NAME",
            pkColumnValue = "EMP_SEQ",
            valueColumnName = "NEXT_VALUE",
            initialValue = 0,
            allocationSize = 1)*/
public class Employee {

    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    /*@GeneratedValue(strategy = GenerationType.SEQUENCE,
                    generator = "S_EMP_GENERATOR")*/
    /*@GeneratedValue(strategy = GenerationType.TABLE, generator = "SEQ_GENERATOR")*/
    /*@GeneratedValue(strategy = GenerationType.AUTO)*/

    @Id     @GeneratedValue(strategy = GenerationType.IDENTITY)
    //private EmployeeId empId;
    private Long id;

    private String name;

}
