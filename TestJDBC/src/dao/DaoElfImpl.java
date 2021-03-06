package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import ent.Elfe;


public class DaoElfImpl  implements DaoElf{
		
	@Override
	public void Insert(Elfe bean) {
		try {
			Connection c= ConnectionBd.getConnection();
			Statement statement=c.createStatement();
			statement.executeUpdate("Insert into ELF VALUES ("+null+",'"+bean.getNom()+"','"+bean.getRace()+"','"+bean.getDesc()+"')");			
			
		} catch (Exception e2) {
			System.out.println("probleme insert");
		}
		
	}

	@Override
	public void delete(Elfe bean) {
		int i=bean.getId();
		//System.out.println(i);
		
		try {
			Connection c= ConnectionBd.getConnection();
			Statement statement=c.createStatement();
			statement.executeUpdate("delete from Elf where id="+i);			
			
		} catch (Exception e2) {
			System.out.println("probleme delete");
		}		
		
	}
	
	@Override
	public void update(Elfe bean, Integer id, String nom, String race, String desc) {
			
		try {
			Connection c= ConnectionBd.getConnection();
			Statement statement=c.createStatement();
			//System.out.println("--"+id+nom+race+desc);
			//System.out.println("update Elf set nom='"+nom+"', race='"+race+"', desc='"+desc+"' where id="+id);
			statement.executeUpdate("update Elf set nom='"+nom+"', race='"+race+"', `desc`='"+desc+"' where id="+id);	
			//System.out.println("marche!!!");
		} catch (Exception e2) {
			System.out.println("probleme update");
		}
		
	}

	@Override
	public Elfe findById(Integer i) {
		Elfe elfe =new Elfe();
		try {
			Connection c= ConnectionBd.getConnection();
			Statement statement=c.createStatement();
			ResultSet datas=statement.executeQuery("Select * from Elf where id="+i);
			
			while(datas.next()) {
				
				elfe.setId(datas.getInt("id"));
				elfe.setNom(datas.getString("nom"));
				elfe.setRace(datas.getString("race"));
				elfe.setDesc(datas.getString("desc"));
				
			}
			
		} catch (Exception e2) {
			System.out.println("probleme findId");
		}
		return elfe;
	}

	@Override
	public List<Elfe> findAll() {
		
		List<Elfe> list=new ArrayList<>();	
		try {		
			Connection c= ConnectionBd.getConnection();
			Statement statement=c.createStatement();
			ResultSet datas=statement.executeQuery("Select * from Elf");
			
			while(datas.next()) {
				Elfe elfe =new Elfe();
				elfe.setId(datas.getInt("id"));
				elfe.setNom(datas.getString("nom"));
				elfe.setRace(datas.getString("race"));
				elfe.setDesc(datas.getString("desc"));
				list.add(elfe);
			}
		}
		catch (Exception e) {
			System.out.println("probleme findAll");
		}
		
		return list;
	}
	
	
	
	public static void main(String[] args) {
		//ConnectionBd.getConnection();
		DaoElfImpl impl=new DaoElfImpl();
		//Elfe elfe2 = new Elfe();
		//elfe2.setId(2);
		//elfe2.setNom("fengquan");
		//elfe2.setRace("elfe");
		//elfe2.setDesc("papa");
		
		//impl.Insert(elfe2);
		
		List<Elfe> list=impl.findAll();
		list.forEach(e->{System.out.println("id: "+e.getId()+"\nnom: "+e.getNom()+"\nrace: "+e.getRace()+"\ndesc: "+e.getDesc()); }  );
		
		Elfe elfe=impl.findById(68);
		//System.out.println("id: "+elfe.getId()+"\nnom: "+elfe.getNom()+"\nrace: "+elfe.getRace()+"\ndesc: "+elfe.getDesc());
		
		impl.update(elfe, 68, "fffff", "elfe","tttttt");
		

	}
	

}
