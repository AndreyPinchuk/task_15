package homework.task_15.service;

import homework.task_15.entiti.Note;
import homework.task_15.repository.NoteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class NoteService {
    private final NoteRepository noteRepository;

    public List<Note> listAll(){
        return new ArrayList<Note>(noteRepository.findAll());
    }
    @Transactional
    public Note add(Note note){
        return noteRepository.save(note);
    }

    @Transactional
    public void deleteById(long id){
        if(noteRepository.existsById(id)){
            noteRepository.deleteById(id);
        } else {
            throw new RuntimeException("Id not found");
        }
    }
    @Transactional
    public void update(Note note){
        if(noteRepository.existsById(note.getId())){
            noteRepository.save(note);
        } else {
            throw new RuntimeException("Note not found");
        }
    }

    public Note getById(long id){
        return noteRepository.findById(id).get();
    }
}
