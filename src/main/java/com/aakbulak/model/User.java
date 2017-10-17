package com.aakbulak.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Alper AKBULAK<alper.akbulak@indbilisim.com.tr>
 * @since 0.0.16
 */
@Entity
@Table(name="APP_USER")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long id;

    @NotEmpty
    @Column(name="NAME", nullable = false)
    @Getter
    @Setter
    private String name;

    @Column(name="AGE", nullable=false)
    @Getter
    @Setter
    private Integer age;

    @Column(name="SALARY", nullable=false)
    @Getter
    @Setter
    private double salary;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
