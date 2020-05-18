package uvsq21921358;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Before;
import org.junit.Test;

import uvsq21921358.ADAOFactory.DAOType;

public class SerialisationTest {
	
	//Testons 
	private PersonnelImuable per;
	private PersonnelGroupe pergr;
	
	@Before()
	public void init() {
		per = new PersonnelImuable.Builder("TAHOURA","JEAN").dateNaiss(1997,02,8).numT(new NumTelephone("70010203","34567890","2345676788")).build();
		pergr = new PersonnelGroupe();
		PersonnelGroupe gr = new PersonnelGroupe();
		pergr.addPersonnel(gr);
		pergr.addPersonnel(per);
	}
	
	
	/*@Test()
	public void serialiserPersonnelTest() {
		PersonnelImuable persI = null;
		ObjectOutputStream outp;
		ObjectInputStream intp;
		try {
			outp = new ObjectOutputStream(new FileOutputStream("Outserial.txt"));
			intp = new ObjectInputStream(new FileInputStream("Intserial.txt"));
			try {
				outp.writeObject(persI);
				persI = (PersonnelImuable) intp.readObject();
			} catch (ClassNotFoundException | IOException e) {
				e.printStackTrace();
			} finally {
				outp.close();
				intp.close();
			}
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		assertEquals(per, persI);
	}
	
	
	@Test()
	public void serialiserPersonnelGroupeTest() {
		PersonnelGroupe perg = null;
		ObjectOutputStream outp;
		ObjectInputStream intp;
		try {
			outp = new ObjectOutputStream(new FileOutputStream("Outserial.txt"));
			intp = new ObjectInputStream(new FileInputStream("Intserial.txt"));
			try {
				outp.writeObject(pergr);
				perg = (PersonnelGroupe) intp.readObject();
			} 
			catch (ClassNotFoundException | IOException e) {
				e.printStackTrace();
			} 
			finally {
				outp.close();
				intp.close();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		assertEquals(pergr, perg);
	}
	
	@Test()
	public void testPersonnelCRUD() {
		DAO<PersonnelImuable> pI = ADAOFactory.getFactory(DAOType.Serial).getPersonnelDAO();
		pI.delete(per);
		pI.create(per);
		per.addNumTelephone(new NumTelephone("70010203","34567890","2345676788"));
		pI.update(per);
		assertEquals(per, pI.read(per.getNom()));

	}
	
	@Test()
	public void personnelGroupeCRUDTest() {
		DAO<PersonnelGroupe> pegr = DAOFactory.getFactory(DAOType.Serial).getPersonnelGroupeDAO();
		pegr.delete(pergr); 
		pegr.create(pergr);
		pergr.addPersonnel(per);
		pegr.update(pergr);
		assertEquals(pergr, pegr.read(pergr.getId()));
	}*/

}
