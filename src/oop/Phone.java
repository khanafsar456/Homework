package oop;

public class Phone {
	
	String Model;
	String color;
	int storage;
	double weight;
	
	void calling () {
		System.out.println("Can make audio / Video Calls");
	}
	void games () {
		System.out.println("Can Play Games online");
	}
public static void main(String[] args) {
	Phone iphone=new Phone();
		iphone.Model="iphone 14 pro max";
		iphone.storage=128;
		iphone.weight=172;
		
		System.out.println("Model "+ iphone.Model + "storage "+ iphone.storage);
		iphone.games();
		
		System.out.println();
		Phone samsung=new Phone();
		samsung.Model="Galaxy Note 10";
		samsung.color="black";
		samsung.storage=256;
		samsung.weight=162;
		System.out.println();
		
		System.out.println("Model "+ samsung.Model + "storage "+ samsung.storage);
		samsung.calling();
		
		System.out.println();
		Phone Pixel=new Phone();
		Pixel.Model="Google Pixel 6A";
		Pixel.storage=512;
		Pixel.weight=122;
		
		
		System.out.println("Model "+ Pixel.Model + "storage "+ Pixel.storage);
		Pixel.calling();
		Pixel.games();
		

}}
