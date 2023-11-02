package com.JavaNoteCurdOperation.JavaNoteCurdOperation.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "java_notes")
public class JavaNotes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "note_id")
    private int noteId;

    @Column(name = "note_title")
    private String noteTitle;

    @Column(name = "notes")
    private String notes;

    @Column(name = "date")
    private Date date;
}
