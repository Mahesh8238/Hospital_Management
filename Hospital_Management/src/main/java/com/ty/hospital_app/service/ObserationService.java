package com.ty.hospital_app.service;

import java.util.List;

import com.ty.hospital_app.dao.imp.ObserationDaoImp;
import com.ty.hospital_app.dto.Obseration;

public class ObserationService 
{
	public void savaObseration(int eid, Obseration obserations)
	{
		ObserationDaoImp obserationDaoImp = new ObserationDaoImp();
		Obseration Obseration = obserationDaoImp.savaObseration(eid, obserations);
		if(Obseration != null)
		{
			System.out.println("Data Saved");
		}
		else
		{
			System.out.println("Unfortunatly data not saved");
		}
	}
	public Obseration getObserationId(int oid)
	{
		ObserationDaoImp obserationDaoImp = new ObserationDaoImp();
		Obseration Obseration = obserationDaoImp.getObserationId(oid);
		if(Obseration != null)
		{
			return Obseration;
		}
		else
		{
			return null;
		}
	}
	public void deleteObserationId(int oid)
	{
		ObserationDaoImp obserationDaoImp = new ObserationDaoImp();
		boolean Obseration = obserationDaoImp.deleteObserationId(oid);
		if(Obseration )
		{
			System.out.println("Data deleted");
		}
		else
		{
			System.out.println(" data not deleted");
		}
	}
	public Obseration updateObseration(int oid, Obseration obserations)
	{
		ObserationDaoImp obserationDaoImp = new ObserationDaoImp();
		Obseration Obseration = obserationDaoImp.getObserationId(oid);
		if(Obseration != null)
		{
			return Obseration;
		}
		else
		{
			return null;
		}
	}
	public List<Obseration> getAllObseration()
	{
		ObserationDaoImp  obserationDaoImp = new ObserationDaoImp ();
		List<Obseration> Obseration = obserationDaoImp.getAllObseration();
		if(Obseration != null)
		{
			return Obseration;
		}
		else
		{
			return null;
		}
	}
	public List<Obseration> getObserationByDocterName(String name)
	{
		ObserationDaoImp  obserationDaoImp = new ObserationDaoImp ();
		List<Obseration> Obseration = obserationDaoImp.getAllObseration();
		if(Obseration != null)
		{
			return Obseration;
		}
		else
		{
			return null;
		}
	}
}





















