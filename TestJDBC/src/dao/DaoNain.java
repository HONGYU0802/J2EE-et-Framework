package dao;

import ent.Nain;

public interface DaoNain extends IDao<Nain>{
	public Nain findById(Nain n);
}
