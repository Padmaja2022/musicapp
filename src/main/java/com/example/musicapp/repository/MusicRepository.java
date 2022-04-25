package com.example.musicapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.musicapp.model.Music;

public interface MusicRepository  extends JpaRepository<Music, Long >{

	
}
