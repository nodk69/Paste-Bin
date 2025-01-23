package com.example.pastebin.controllers;


import com.example.pastebin.DTO.ContentWriterDTO;
import com.example.pastebin.entities.Paste;
import com.example.pastebin.service.PasteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/home")
public class PasteController {

    @Autowired
    private PasteService pasteService;

    @PostMapping
    public ContentWriterDTO createContent(@RequestBody ContentWriterDTO contentWriterDTO){
        return pasteService.goSaveIt(contentWriterDTO);

    }

    @GetMapping("/{id}")
    public Optional<Paste> getContentById(@PathVariable Long id){
        return pasteService.getContentById(id);
    }

    @GetMapping("/allContent")
    public List<String> getAllThePaste(){
        return pasteService.getAllPaste();
    }
}
