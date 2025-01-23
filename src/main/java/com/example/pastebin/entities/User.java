package com.example.pastebin.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userID;

    @Column(nullable = false,unique = true,length = 30)
    private String userName;

    @Column(nullable = false,unique = true,length = 30)
    private String email;

    @OneToMany
    @JoinColumn
    List<Paste> pasteList= new ArrayList<>();
}
