package com.JavaNoteCurdOperation.JavaNoteCurdOperation.Controller;

import com.JavaNoteCurdOperation.JavaNoteCurdOperation.Model.JavaNotes;
import com.JavaNoteCurdOperation.JavaNoteCurdOperation.Service.NotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NotesController {

    @Autowired
    private NotesService service;

    @GetMapping("/notes")
    public String getNotes(Model model) {
        model.addAttribute("listNote", service.getNotes());
        return "/notes";
    }

    @GetMapping("/addNote")
    public String addNotes(Model model) {
        model.addAttribute("note", new JavaNotes());
        return "addNotes";
    }

    @PostMapping("/saveNotes")
    public String saveNotes(JavaNotes javaNotes) {
        service.addNotes(javaNotes);
        return "redirect:/notes";
    }

    @GetMapping("/updateForm/{id}")
    public String getUpdateNotesId(@PathVariable int id, Model model) {
        for (JavaNotes j : service.getNotes()) {
            if (j.getNoteId() == id) {
                model.addAttribute("note", j);
            }
        }
        return "updateNotes";
    }

    @PostMapping("/updateNotes")
    public String updateNotes(JavaNotes javaNotes) {
        service.updateNotes(javaNotes);
        return "redirect:/notes";
    }

    @GetMapping("/deleteNotes/{id}")
    public String deleteNotes(@PathVariable int id) {
        service.deleteNotes(id);
        return "redirect:/notes";
    }
}
