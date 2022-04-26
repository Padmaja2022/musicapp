package com.example.musicapp;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;



import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.musicapp.model.Music;
import com.example.musicapp.repository.MusicRepository;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)

class MusicappApplicationTests {
	
@Autowired
	MusicRepository music_Repo;

	@Test
	@Order(1)
	public void testCreate() {
		
		Music m = new Music();
	   //Long Id = 9L;
		m.setId(1L);
		m.setSongtName("om namo");
		m.setArtist("Padmaja");
		m.setGenre("classic");
		m.setDuration(50);
		music_Repo.save(m);	
		assertNotNull(music_Repo.findById(1L).get());
	}
	
	@Test
	@Order(2)
	public void testReadAll() {
		List<Music> list = music_Repo.findAll();
		assertTrue(list.size()>0);

		
	}
	
	@Test
	@Order(3)
	public void testSingleMusic() {
		
	Music music = music_Repo.findById(1L).get();
	assertEquals("classic", music.getGenre());
				
	}

	
	@Test
	@Order(4)
	public void testUpdate() {
		
		Music m = music_Repo.findById(1L).get();
		m.setDuration(200);
		music_Repo.save(m);
		assertNotEquals(50, music_Repo.findById(1L).get().getDuration());
			
		
	}

	@Test
	@Order(5)
   public void testDelete() {
	   
	   music_Repo.deleteById(4L);
	   assertFalse(music_Repo.existsById(4L));
   }
}
