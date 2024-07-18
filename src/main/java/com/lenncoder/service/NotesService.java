package com.lenncoder.service;

import java.util.List;

import com.lenncoder.entity.Notes;
import com.lenncoder.entity.User;

public interface NotesService {

	public Notes saveNotes(Notes notes);
	
	public Notes getNotesById(int id);
	
	public List<Notes> getNotesByUser(User user);
	
	public Notes updateNotes(Notes notes);
	
	public boolean deleteNotes(int id);
}
