package com.ty.hospital_app.service;

import java.util.List;

import com.ty.hospital_app.dao.imp.UserDaoImp;
import com.ty.hospital_app.dto.User;

public class UserService {
	public void savaPerson(User users)
	{
		UserDaoImp userDaoImp = new UserDaoImp();
		User user = userDaoImp.savaPerson(users);
		if(user != null)
		{
			System.out.println("Data Saved");
		}
		else
		{
			System.out.println("Unfortunatly data not saved");
		}
	}

	public User getHospitalId(int uid)
	{
		UserDaoImp userDaoImp = new UserDaoImp();
		User user = userDaoImp.getHospitalId(uid);
		if(user != null)
		{
			return user;
		}
		else
		{
			return null;
		}	
	}
	public void deleteHospitalId(int uid)
	{
		UserDaoImp userDaoImp = new UserDaoImp();
		boolean user = userDaoImp.deleteHospitalId(uid);
		if(user )
			{
				System.out.println("Data Saved");
			}
			else
			{
				System.out.println("Unfortunatly data not saved");
			}
	}
	public User updateHospital(int uid, User users)
	{
		UserDaoImp userDaoImp = new UserDaoImp();
		User user = userDaoImp.updateHospital(uid, users);
		if(user != null)
		{
			return user;
		}
		else
		{
			return null;
		}	
	}
	public List<User> getAllUser()
	{
		UserDaoImp userDaoImp = new UserDaoImp();
		List<User> user = userDaoImp.getAllUser();
		if(user != null)
		{
			return user;
		}
		else
		{
			return null;
		}
	}
	public List<User> getUserRoles(String role)
	{
		UserDaoImp userDaoImp = new UserDaoImp();
		List<User> user = userDaoImp.getAllUser();
		if(user != null)
		{
			return user;
		}
		else
		{
			return null;
		}
	}
}



























