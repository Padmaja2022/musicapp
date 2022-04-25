package com.example.musicapp.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


	import com.example.musicapp.model.Music;
	import com.example.musicapp.service.MusicService;

	@RestController
	@RequestMapping("/api")
	
	public class MusicController {
		@Autowired
		MusicService musicservice;
		
		
		@RequestMapping(value="/musicapp", method=RequestMethod.POST)
		public Music createMusic(@RequestBody Music music) {
		    return musicservice.createMusic(music);
		}
		@RequestMapping(value="/musicapp", method=RequestMethod.GET)
		public List<Music> readMusic() {
		    return musicservice.getMusic();
		}
		@RequestMapping(value="/musicapp/{musicId}", method=RequestMethod.GET)
		public List<Music> readtrackMusic(@PathVariable(value = "musicId")Long id) {
		    return musicservice.getMusic();
		}
		@RequestMapping(value="/musicapp/{musicId}", method=RequestMethod.PUT)
		public Music readMusic(@PathVariable(value = "musicId") Long id, @RequestBody Music musicDetails) {
		    return musicservice.updateMusic(id, musicDetails);
		}

		@RequestMapping(value="/musicapp/{musicId}", method=RequestMethod.DELETE)
		public void deleteMusic(@PathVariable(value = "musicId") Long id) {
			musicservice.deleteMusic(id);
		}
	        
	                
	        
	    
	}
	
