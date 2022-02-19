package com.books.integrate.spring.react.repository;

import java.util.ArrayList;
import java.util.List;

import com.books.integrate.spring.react.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
	List<Tutorial> findByPublished(boolean published);
	List<Tutorial> findByTitleContaining(String title);
	Tutorial findByTitle(String title);
	ArrayList<Tutorial> findByPrice(Integer price);
}
