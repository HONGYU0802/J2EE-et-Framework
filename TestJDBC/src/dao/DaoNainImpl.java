package dao;



import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ent.Nain;

public class DaoNainImpl  implements DaoNain{

	@Override
	public void Insert(Nain bean) {
		try {
			Connection c= ConnectionBd.getConnection();
			Statement statement=c.createStatement();
			statement.executeUpdate("Insert into Nain VALUES ("+null+",'"+bean.getNom()+"','"+bean.getRace()+"','"+bean.getDesc()+"')");			
			
		} catch (Exception e2) {
			System.out.println("probleme insert Nain");
		}
		
	}

	@Override
	public void delete(Nain bean) {
		int i=bean.getId();
		//System.out.println(i);
		
		try {
			Connection c= ConnectionBd.getConnection();
			Statement statement=c.createStatement();
			statement.executeUpdate("delete from Nain where id="+i);			
			
		} catch (Exception e2) {
			System.out.println("probleme delete Nain");
		}
	}

	
	@Override
	public void update(Nain bean, Integer id, String nom, String race, String desc) {
		try {
			Connection c= ConnectionBd.getConnection();
			Statement statement=c.createStatement();
			//System.out.println("--"+id+nom+race+desc);
			//System.out.println("update Elf set nom='"+nom+"', race='"+race+"', desc='"+desc+"' where id="+id);
			statement.executeUpdate("update Nain set nom='"+nom+"', race='"+race+"', `desc`='"+desc+"' where id="+id);	
			//System.out.println("marche!!!");
		} catch (Exception e2) {
			System.out.println("probleme update");
		}
		
	}

	
	@Override
	public Nain findById(Integer i) {
		Nain nain =new Nain();
		try {
			Connection c= ConnectionBd.getConnection();
			Statement statement=c.createStatement();
			ResultSet datas=statement.executeQuery("Select * from Nain where id="+i);
			
			while(datas.next()) {
				
				nain.setId(datas.getInt("id"));
				nain.setNom(datas.getString("nom"));
				nain.setRace(datas.getString("race"));
				nain.setDesc(datas.getString("desc"));
				
			}
			
		} catch (Exception e2) {
			System.out.println("probleme findId Nain");
		}
		return nain;
	}

	@Override
	public List<Nain> findAll() {
		List<Nain> list=new ArrayList<>();	
		try {		
			Connection c= ConnectionBd.getConnection();
			Statement statement=c.createStatement();
			ResultSet datas=statement.executeQuery("Select * from Nain");
			
			while(datas.next()) {
				Nain nain =new Nain();
				nain.setId(datas.getInt("id"));
				nain.setNom(datas.getString("nom"));
				nain.setRace(datas.getString("race"));
				nain.setDesc(datas.getString("desc"));
				list.add(nain);
			}
		}
		catch (Exception e) {
			System.out.println("probleme findAll Nain");
		}
		
		return list;
	}


}
