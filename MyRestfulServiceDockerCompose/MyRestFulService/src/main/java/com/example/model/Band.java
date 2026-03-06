//package com.example.model;
//
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import org.hibernate.annotations.OnDelete;
//import org.hibernate.annotations.OnDeleteAction;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@AllArgsConstructor
//@NoArgsConstructor
//@Data
//@Entity
//public class Band {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Integer id;
//    private String name;
//    //List of musician
//    @OneToMany(mappedBy = "band", fetch = FetchType.EAGER)
//    @OnDelete(action = OnDeleteAction.CASCADE)
//    @JsonIgnore
//    private List<Musician> musicians = new ArrayList<>();
//}

package com.example.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Band {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    // List of musicians
    @OneToMany(mappedBy = "band", fetch = FetchType.EAGER)
    @OnDelete(action = OnDeleteAction.CASCADE)
    //@JsonIgnore  // Keep this here to ignore musicians when serializing Band
    private List<Musician> musicians = new ArrayList<>();
}