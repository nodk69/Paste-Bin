package com.example.pastebin.service;


import com.example.pastebin.DTO.ContentWriterDTO;
import com.example.pastebin.entities.Paste;
import com.example.pastebin.repository.PasteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PasteService {

    @Autowired
    private PasteRepository pasteRepository;


    public ContentWriterDTO goSaveIt(ContentWriterDTO contentWriterDTO1) {
        // Convert DTO to Entity
        Paste contentWriterEntity = new Paste();
        contentWriterEntity.setContent(contentWriterDTO1.getContent());

        // Save the entity
        Paste savedEntity = pasteRepository.save(contentWriterEntity);

        // Convert the saved entity back to DTO
        ContentWriterDTO savedDTO = new ContentWriterDTO();
        savedDTO.setContent(savedEntity.getContent());

        return savedDTO;
    }

    public Optional<Paste> getContentById(Long id) {
        return pasteRepository.findById(id);
    }

    public List<String> getAllPaste() {
        return pasteRepository.findAllContent();
    }
}
