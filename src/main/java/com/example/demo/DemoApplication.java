package com.example.demo;

import AdapterPattern.Emplyee;
import AdapterPattern.EmplyeeAdapterCSV;
import AdapterPattern.EmplyeeCSV;
import BridgePatternProblem.*;
import BridgePatternProblem.WithBridge.Color;
import BridgePatternProblem.WithBridge.Red;
import CompositePattern.CmplexPattern.Menu;
import CompositePattern.CmplexPattern.MenuItem;
import DecoraorPattern.Mozzarella;
import DecoraorPattern.Pizza;
import DecoraorPattern.PlainPizza;
import DecoraorPattern.TomatoSouce;
import FactoryPattern.WebisteTyp;
import FactoryPattern.Website;
import FactoryPattern.WebsiteFactory;
import ModelPrototype.Movie;
import ModelPrototype.Registry;
import Builder.TableModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		//Builder pattern
		TableModel.Builder tableBuilder = new TableModel.Builder();
		tableBuilder.id(11l).ime("Dejan").prezime("Stojkic");
		System.out.println(tableBuilder.toString());
		TableModel tb = tableBuilder.build();
		System.out.println(tb.getId());
		System.out.println(tb.getIme());
		System.out.println(tb.getPrezime());
		//-------------------------------------------------------
		//Prototype pattern
		Registry registry = new Registry();
		Movie movie = (Movie) registry.createItem("Movie");
		movie.setTitle("Creational patterns in Java");
		System.out.println(movie.getTitle());
		System.out.println(movie.getPrice());
		System.out.println(movie.getRuntime());
		System.out.println(movie.getUrl());

		Movie movie2 = (Movie) registry.createItem("Movie");
		movie2.setTitle("Novi naslovv");
		System.out.println(movie2.getTitle());
		System.out.println(movie2.getPrice());
		System.out.println(movie2.getRuntime());
		System.out.println(movie2.getUrl());
		//---------------------------------------------------------
		// If template have template that is framework ...
		// Factory pattern
		Website website =  WebsiteFactory.getWbsite(WebisteTyp.BLOG);
		System.out.println(website.getListPages());
		website = WebsiteFactory.getWbsite(WebisteTyp.SHOP);
		System.out.println(website.getListPages());
		//-----------------------
		// Adapter Pattern
		List<Emplyee> emplyees = new ArrayList<>();
		EmplyeeCSV emplyeeCSV = new EmplyeeCSV("567,Sherlock,Holms,email@email.com");
		emplyees.add(new EmplyeeAdapterCSV(emplyeeCSV));
		System.out.println(emplyees);

		///Bridge pattern PROBLEM
		Square redSquare = new RedSquare();
		Circle circle = new BlueCircle();
		redSquare.applayColor();
		circle.applayColor();
		///utilize Bridge pattern RESOLEVE
		Color red = new Red();
		BridgePatternProblem.WithBridge.Shape circleC = new BridgePatternProblem.WithBridge.Circle(red);
		BridgePatternProblem.WithBridge.Shape square1 = new BridgePatternProblem.WithBridge.Square(red);
		circleC.applayColor();
		square1.applayColor();
		/// CompositeMenuDemo
		Menu mainMenu = new Menu("Main","/main");
		MenuItem safetyMenuItem = new MenuItem("Safety","/safety");
		mainMenu.add(safetyMenuItem);
		Menu claimsSubMenu = new Menu("Claims","/claims");
		mainMenu.add(claimsSubMenu);
		MenuItem personalClaimsMenu = new MenuItem("Personal claims","/personalClaims");
		claimsSubMenu.add(personalClaimsMenu);
		System.out.println(mainMenu.toString());
		//Decorator pattern
		// The PlainPizza object is sent to the Mozzarella constructor
		// and then to the TomatoSauce constructor
		Pizza basicPizza = new TomatoSouce((new Mozzarella(new PlainPizza())));
		System.out.println("Ingredients: " + basicPizza.getDescription());
		System.out.println("Price: " + basicPizza.getCost());
		//---------------------------------------------------------------------
		//


		SpringApplication.run(DemoApplication.class, args);
	}

}
