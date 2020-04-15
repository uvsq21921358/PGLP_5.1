package uvsq21921358;

import uvsq21921358.ADAOFactory.DAOType;

public enum Serialiser {

	ENVIRONNEMENT;
	
	private void run(String[] args, DAOType dt) {
		DAO<PersonnelImuable> personnelDAO = ADAOFactory
				.getFactory(dt) // Factory
				.getPersonnelDAO();
		DAO<PersonnelGroupe> pgDAO = ADAOFactory
				.getFactory(dt)
				.getPersonnelGroupeDAO();
		
		// Creation du personnel
				PersonnelImuable Marie = new PersonnelImuable.Builder("Marie", "Popins").build();
				PersonnelImuable  Ki = new PersonnelImuable.Builder("Ki", "Arnold").build();
				PersonnelGroupe pg = new PersonnelGroupe();
				PersonnelGroupe spg = new PersonnelGroupe();
				pg.addPersonnel(spg);
				pg.addPersonnel(Marie);
				spg.addPersonnel(Ki);
				
				// Ajout DAO
				pgDAO.create(pg);
				pgDAO.create(spg);
				personnelDAO.create(Marie); // update
				personnelDAO.create(Ki); // update
				System.out.println("\t" + pgDAO.read(spg.getId()));
				System.out.println("\t" + personnelDAO.read("Ki"));
	}
	
	public static void main(String[] args) {
		
		 ENVIRONNEMENT.run(args, DAOType.Serial);
		
	}
}
