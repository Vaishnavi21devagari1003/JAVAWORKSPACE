//package com.example.model;
//
//import com.fasterxml.jackson.annotation.JsonBackReference;
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@AllArgsConstructor
//@NoArgsConstructor
//@Data
//@Entity
//public class Musician {
//    @Id
//
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Integer id;
//    private String name;
//    private Integer strings;
//    private String type;
//    //band Reference
//    @ManyToOne
//    @JsonBackReference
//    private Band band;
//}

package com.example.model;

import com.fasterxml.jackson.annotation.JsonManagedReference; // Change this import
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Musician {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private Integer strings;
    private String type;

    // Band Reference
    @ManyToOne
    @JsonManagedReference  // Change this annotation to allow serialization of band in Musician
    private Band band;
}