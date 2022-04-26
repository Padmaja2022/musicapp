package com.example.musicapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "musicapp")



public class Music {
	/*
	 private Long id;
	private String SongtName;
	private String genre;
	private String artist;
	private int duration;
    
*/
			@Override
	public String toString() {
		return "trackMusic [id=" + id + ", songtName=" + songtName + ", genre=" + genre + ", artist=" + artist
				+ ", duration=" + duration + "]";
	}



			public Music() {
		//super();
	}
			
			
		    
		    /**
			 * @return the id
			 */
			public Long getId() {
				return id;
			}



			/**
			 * @param id the id to set
			 */
			public void setId(Long id) {
				this.id = id;
			}



			/**
			 * @return the songtName
			 */
			public String getSongtName() {
				return songtName;
			}



			/**
			 * @param songtName the songtName to set
			 */
			public void setSongtName(String songtName) {
				this.songtName = songtName;
			}



			/**
			 * @return the genre
			 */
			public String getGenre() {
				return genre;
			}



			/**
			 * @param genre the genre to set
			 */
			public void setGenre(String genre) {
				this.genre = genre;
			}



			/**
			 * @return the artist
			 */
			public String getArtist() {
				return artist;
			}



			/**
			 * @param artist the artist to set
			 */
			public void setArtist(String artist) {
				this.artist = artist;
			}



			/**
			 * @return the duration
			 */
			public int getDuration() {
				return duration;
			}



			/**
			 * @param duration the duration to set
			 */
			public void setDuration(int duration) {
				this.duration = duration;
			}



			public Music(Long id, String songtName, String genre, String artist, int duration) {
			//super();
			//this.id = id;
			this.songtName = songtName;
			this.genre = genre;
			this.artist = artist;
			this.duration = duration;
		}
			

			@Id
	        @GeneratedValue(strategy = GenerationType.IDENTITY)
	        @Column(name="Autoid")
	            private Long id;
	        
	        @Column(name="song_name")
	        private String songtName;
	        
	        @Column(name="genre")
	        private String genre;
	        
	        
	        @Column(name="artist")
	        private String artist;
	        
	        @Column(name="duration")
	        private int duration;
	}

