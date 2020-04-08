package uvsq21921358;

public class DAOFactory extends ADAOFactory {

	//
	@Override
	public DAO<PersonnelImuable> getPersonnelDAO() {
		return new PersonnelSerialDAO();
	}

	@Override
	public DAO<PersonnelGroupe> getPersonnelGroupeDAO() {
		return new PersonnelGroupeSerialDAO();
	}

}
