package com.ty.hospital_app.service;

import java.util.List;

import com.ty.hospital_app.dao.imp.PersonDaoImp;
import com.ty.hospital_app.dto.Person;

public class PersonService 
{
	public void savaPerson(int eid, Person persons)
	{
		PersonDaoImp personDaoImp = new PersonDaoImp();
		Person person = personDaoImp.savaPerson(eid, persons);
		if(person != null)
		{
			System.out.println("Person Saved");
		}
		else
		{
			System.out.println("Unfortunatly Person not saved");
		}
	}
	public Person getPersonId(int pid)
	{
		PersonDaoImp personDaoImp = new PersonDaoImp();
		Person person = personDaoImp.getPersonId(pid);
		if(person != null)
		{
			return person;
		}
		else
		{
			return null;
		}
	}
	public void deletePersonId(int pid)
	{
		PersonDaoImp personDaoImp = new PersonDaoImp();
		boolean flag = personDaoImp.deletePersonId(pid);
		if(flag) 
		{
			System.out.println("Person deleted");
		}
		else
		{
			System.out.println("Person not deleted");
		}
	}
	public Person updatePerson(int pid, Person persons)
	{
		PersonDaoImp personDaoImp = new PersonDaoImp();
		Person person = personDaoImp.savaPerson(pid, persons);
		if(person != null)
		{
			return person;
		}
		else
		{
			return null;
		}
	}
	public List<Person> getAllPerson()
	{
		PersonDaoImp personDaoImp = new PersonDaoImp();
		List<Person> person = personDaoImp.getAllPerson();
		if(person != null)
		{
			return person;
		}
		else
		{
			return null;
		}
	}
	public List<Person> getPersonByAge(int age)
	{
		PersonDaoImp personDaoImp = new PersonDaoImp();
		List<Person> person = personDaoImp.getAllPerson();
		if(person != null)
		{
			return person;
		}
		else
		{
			return null;
		}
	}
	public List<Person> getPersonByGender(String gernder)
	{
		PersonDaoImp personDaoImp = new PersonDaoImp();
		List<Person> person = personDaoImp.getAllPerson();
		if(person != null)
		{
			return person;
		}
		else
		{
			return null;
		}
	}
	public List<Person> getPersonByPhono(long phono)
	{
		PersonDaoImp personDaoImp = new PersonDaoImp();
		List<Person> person = personDaoImp.getAllPerson();
		if(person != null)
		{
			return person;
		}
		else
		{
			return null;
		}
	}
}





























