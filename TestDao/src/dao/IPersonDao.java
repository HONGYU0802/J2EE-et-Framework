package dao;
// 一个DAO接口；
public interface IPersonDao {
	public String getPersonName(Integer id);//根据id查找name
    public void addPerson(Person person);//添加person对象到数据库里    
}
