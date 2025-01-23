package com.example.pastebin.repository;

import com.example.pastebin.entities.Paste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface PasteRepository extends JpaRepository<Paste,Long> {

    @Query("SELECT p.content FROM Paste p")
    List<String> findAllContent();
}
