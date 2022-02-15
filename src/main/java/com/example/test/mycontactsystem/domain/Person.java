package com.example.test.mycontactsystem.domain;


import com.example.test.mycontactsystem.controller.dto.PersonDto;
import com.example.test.mycontactsystem.domain.dto.Birthday;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.springframework.util.StringUtils;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@RequiredArgsConstructor
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
//    @NotEmpty
    @Column(nullable = false)
    private String name;
    private String hobby;
    private String address;
   // @Validated
    @Embedded
    private Birthday birthday;
    private String job;
    private String phoneNumber;
    @ColumnDefault("0")
    private boolean deleted;

    public void set(PersonDto personDto){
    if(!StringUtils.isEmpty(personDto.getHobby())){
        this.setHobby(personDto.getHobby());
    }
    }
}
