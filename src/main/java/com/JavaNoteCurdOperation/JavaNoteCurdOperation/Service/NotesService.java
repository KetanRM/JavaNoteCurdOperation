package com.JavaNoteCurdOperation.JavaNoteCurdOperation.Service;

import com.JavaNoteCurdOperation.JavaNoteCurdOperation.Model.JavaNotes;
import com.JavaNoteCurdOperation.JavaNoteCurdOperation.Repository.NotesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotesService {
    @Autowired
    private NotesRepository repository;

    public List<JavaNotes> getNotes() {
        List<JavaNotes> note = repository.findAll();
        return note;
    }

    public void addNotes(JavaNotes javaNotes) {
        repository.save(javaNotes);
    }

    public void updateNotes(JavaNotes javaNotes) {
        repository.save(javaNotes);
    }

    public void deleteNotes(int id) {
        repository.deleteById(id);
    }
}
