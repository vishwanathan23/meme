package com.kyubi.meme.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//@Table(name = "Review")
@Entity
public class Review {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String dogBreed;
private int Pincode;

public Review() {}

public Review(int id,String dogBreed,  int Pincode) {

this.id = id;
this.dogBreed = dogBreed;
this.Pincode = Pincode;
}

public String getDogBreed() {
return dogBreed;
}

public void setDogBreed(String dogBreed) {
this.dogBreed = dogBreed;
}

public int getRange() {
return id;
}

public void setRange(int id) {
this.id = id;
}

public int getPincode() {
return Pincode;
}

public void setPincode(int Pincode) {
this.Pincode = Pincode;
} 
}