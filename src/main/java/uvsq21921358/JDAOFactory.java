package uvsq21921358;

public class JDAOFactory extends ADAOFactory {

	@Override
	public DAO<PersonnelImuable> getPersonnelDAO() {
		return new PersonnelJdbcDAO();
	}

	@Override
	public DAO<PersonnelGroupe> getPersonnelGroupeDAO() {
		return new PersonnelGroupeJdbcDAO();
	}

}
