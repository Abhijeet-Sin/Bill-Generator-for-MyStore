package project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

class Person implements Comparable<Person> {
	private String firstname;
	private int age;
	
	public Person(String firstname, int age) {
		super();
		this.firstname = firstname;
		this.age = age;
	}
	
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {return "name is "+ firstname +"And age is "+age;}


	@Override
	public int compareTo(Person o) {
		if (this.age<o.age)
			return -1;
		else if (this.age>o.age)
				return 1;
		else
		return 0;
	}
	
	}



public class DamyTwo {

	public static void main(String[] args) {
		Set seto =new HashSet();
		seto.add(200);
		seto.add(300.5);
		seto.add("some");
		seto.add(200);
		System.out.println(seto);
		int arr[]= {22,5,87,99,33,-77,23};
		Person persons[]= { new Person("some2",20), new Person("some3",30),new Person("some1",10), new Person("some4",40),};
		System.out.println("Befor e sorting is :....");
		for(int i:arr) 
		{
			System.out.print(" "+ i);
			System.out.println();
		}
		//Arrays.sort(arr);//Arrays Class in Util Package And sort method in arrays class
		System.out.println(" After Sorting is:");
		for(int i:arr) 
		{
			System.out.print(" "+ i);
			System.out.println();
		}
		
		System.out.println("Person Before sorting is :....");
		for(Person i:persons) 
		{
			System.out.print(" "+ i);
			System.out.println();
		}
		
		Arrays.sort(persons);
		
		System.out.println("Person After sorting is :....");
		for(Person i:persons) 
		{
			System.out.print(" "+ i);
			System.out.println();
		}
		String s1="This is it";
		String s2="this is it";
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s1));
		System.out.println(s1.compareTo(s1));
		ArrayList<Person> persono = new ArrayList<>();
		persono.add(new Person("fun",33));
		persono.add(new Person("chun",23));
		persono.add(new Person("gun",34));
		persono.add(new Person("funda",45));
		persono.add(new Person("gunda",66));
		System.out.println("Before Sorting Collection");
		for(Person p:persono)
			System.out.println(p);
		
		System.out.println("After sorting....");
		Collections.sort(persono);
		for(Person p:persono)
			System.out.println(p);
		//do sorting by name urself
		
	}

}
