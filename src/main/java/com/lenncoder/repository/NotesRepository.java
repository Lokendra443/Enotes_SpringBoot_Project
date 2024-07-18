package com.lenncoder.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lenncoder.entity.Notes;
import com.lenncoder.entity.User;

public interface NotesRepository extends JpaRepository<Notes, Integer> {

	public List<Notes> findByUser(User user);
}
