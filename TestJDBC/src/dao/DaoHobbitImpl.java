package dao;



import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ent.Hobbit;

public class DaoHobbitImpl implements DaoHobbit{

	@Override
	public void Insert(Hobbit bean) {
		try {
			Connection c= ConnectionBd.getConnection();
			Statement statement=c.createStatement();
			statement.executeUpdate("Insert into Hobbit VALUES ("+null+",'"+bean.getNom()+"','"+bean.getRace()+"','"+bean.getDesc()+"')");			
			
		} catch (Exception e2) {
			System.out.println("probleme insert Hobbit");
		}
		
	}

	@Override
	public void delete(Hobbit bean) {
		int i=bean.getId();
		//System.out.println(i);
		
		try {
			Connection c= ConnectionBd.getConnection();
			Statement statement=c.createStatement();
			statement.executeUpdate("delete from Hobbit where id="+i);			
			
		} catch (Exception e2) {
			System.out.println("probleme delete Hobbit");
		}
		
	}

	@Override
	public void update(Hobbit bean, Integer id, String nom, String race, String desc) {
		try {
			Connection c= ConnectionBd.getConnection();
			Statement statement=c.createStatement();
			//System.out.println("--"+id+nom+race+desc);
			//System.out.println("update Elf set nom='"+nom+"', race='"+race+"', desc='"+desc+"' where id="+id);
			statement.executeUpdate("update Hobbit set nom='"+nom+"', race='"+race+"', `desc`='"+desc+"' where id="+id);	
			//System.out.println("marche!!!");
		} catch (Exception e2) {
			System.out.println("probleme update");
		}
		
	}
	
	@Override
	public Hobbit findById(Integer i) {
		Hobbit hobbit =new Hobbit();
		try {
			Connection c= ConnectionBd.getConnection();
			Statement statement=c.createStatement();
			ResultSet datas=statement.executeQuery("Select * from Hobbit where id="+i);
			
			while(datas.next()) {
				
				hobbit.setId(datas.getInt("id"));
				hobbit.setNom(datas.getString("nom"));
				hobbit.setRace(datas.getString("race"));
				hobbit.setDesc(datas.getString("desc"));
				
			}
			
		} catch (Exception e2) {
			System.out.println("probleme findId Hobbit");
		}
		return hobbit;
	}

	@Override
	public List<Hobbit> findAll() {
		List<Hobbit> list=new ArrayList<>();	
		try {		
			Connection c= ConnectionBd.getConnection();
			Statement statement=c.createStatement();
			ResultSet datas=statement.executeQuery("Select * from Hobbit");
			
			while(datas.next()) {
				Hobbit hobbit =new Hobbit();
				hobbit.setId(datas.getInt("id"));
				hobbit.setNom(datas.getString("nom"));
				hobbit.setRace(datas.getString("race"));
				hobbit.setDesc(datas.getString("desc"));
				list.add(hobbit);
			}
		}
		catch (Exception e) {
			System.out.println("probleme findAll Hobbit");
		}
		
		return list;
	}


}
