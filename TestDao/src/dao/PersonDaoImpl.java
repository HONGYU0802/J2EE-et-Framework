package dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
// 一个实现DAO接口的具体类；
public class PersonDaoImpl extends JdbcDaoSupport implements IPersonDao{

	   public void initDatabase(){
	        String sql="create table if not exists tb_person "
	                +"(id int auto_increment, "+"name varchar(255), "+"age int , primary key(id))";
	        this.getJdbcTemplate().execute(sql);
	    }
	   
	    @Override
	    public String getPersonName(Integer id) {
	        String sql="select name from tb_person where id="+id;
	        return (String)this.getJdbcTemplate().queryForObject(sql, String.class);
	    }

	    @Override
	    public void addPerson(Person person) {
	        String sql="insert into tb_person(name,age) values(?,?)";
	        this.getJdbcTemplate().update(sql, new Object[]{person.getName(),person.getAge()});
	    }

}
