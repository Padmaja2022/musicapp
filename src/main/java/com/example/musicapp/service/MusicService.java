package com.example.musicapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.musicapp.model.Music;
import com.example.musicapp.repository.MusicRepository;

@Service
public class MusicService {

	@Autowired
    MusicRepository musicRepository;   

	
	
	
	// CREATE 
	public Music createMusic(Music music) {
	    return musicRepository.save(music);
	}

	// READ
	public List<Music> getMusic() {
	    return musicRepository.findAll();
	}
	
	
	
	                            
	

	// DELETE
	public void deleteMusic(Long musicId) {
	    musicRepository.deleteById(musicId);	    	    
	}
	
	
	// UPDATE
	public Music updateMusic(Long musicId, Music musicDetails) {
		Music music = musicRepository.findById(musicId).get();
	        music.setSongtName(musicDetails.getSongtName());
	        music.setGenre(musicDetails.getGenre());
	        music.setArtist(musicDetails.getArtist());
	        music.setDuration(musicDetails.getDuration());
	        
	        return musicRepository.save(music);                                
	}
	
	// Patch
	//public Music PatchMusic(Long musicId, String SongName) {
		//return musicRepository.save(PatchMusic(null, null));
		
	//}
	
	
}
	
	
	
	

