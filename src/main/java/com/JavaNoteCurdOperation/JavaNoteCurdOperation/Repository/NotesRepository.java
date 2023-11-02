package com.JavaNoteCurdOperation.JavaNoteCurdOperation.Repository;

import com.JavaNoteCurdOperation.JavaNoteCurdOperation.Model.JavaNotes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotesRepository extends JpaRepository<JavaNotes, Integer> {
}
