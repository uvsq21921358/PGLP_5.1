package uvsq21921358;

public abstract class ADAOFactory {

	// Une factory
	public enum DAOType { Serial};
	public abstract DAO<PersonnelImuable> getPersonnelDAO();
	public abstract DAO<PersonnelGroupe> getPersonnelGroupeDAO();

	public static ADAOFactory getFactory(DAOType type) {
		if (type == DAOType.Serial) return new DAOFactory();
		return null;
	}
}
