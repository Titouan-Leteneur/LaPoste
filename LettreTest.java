import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LettreTest {
	
	private Lettre l;
	
	@Before
	public void setUp() throws Exception {
		this.l = new Lettre(7742, "famille Kirik, igloo 5 banquise nord", 0, "ordinaire");
	}

	@After
	public void tearDown() throws Exception {
		this.l = null;
	}
	
	@Test
	public void testAffranchissementTauxRecommandation0NonUrgente() {
		assertEquals(0.5F, l.affranchissement(), 0.0001);
	}
	
	@Test
	public void testAffranchissementTauxRecommandation0Urgente() {
		this.l.setCaractereUrgence("urgente");
		assertEquals(0.8F, l.affranchissement(), 0.0001);
	}

	@Test
	public void testAffranchissementTauxRecommandation1NonUrgente() {
		this.l.setCaractereUrgence("ordinaire");
		this.l.setTauxDeRecommandation(1);
		assertEquals(1.0F, this.l.affranchissement(), 0.0001);
	}
	
	@Test
	public void testAffranchissementTauxRecommandation1Urgente() {
		this.l.setCaractereUrgence("urgente");
		this.l.setTauxDeRecommandation(1);
		assertEquals(1.3F, this.l.affranchissement(), 0.0001);
	}
	
	@Test
	public void testAffranchissementTauxRecommandation2NonUrgente() {
		this.l.setCaractereUrgence("ordinaire");
		this.l.setTauxDeRecommandation(2);
		assertEquals(2.0F, this.l.affranchissement(), 0.0001);
	}
	
	@Test
	public void testAffranchissementTauxRecommandation2Urgente() {
		this.l.setCaractereUrgence("urgente");
		this.l.setTauxDeRecommandation(2);
		assertEquals(2.3F, this.l.affranchissement(), 0.0001);
	}
	
	@Test
	public void testTarifRemboursementTauxRecommandation0() {
		this.l.setTauxDeRecommandation(0);
		assertEquals(0.0F, this.l.tarifRemboursement(), 0.0001);
	}
	
	@Test
	public void testTarifRemboursementTauxRecommandation1() {
		this.l.setTauxDeRecommandation(1);
		assertEquals(1.5F, this.l.tarifRemboursement(), 0.0001);
	}
	
	@Test
	public void testTarifRemboursementTauxRecommandation2() {
		this.l.setTauxDeRecommandation(2);
		assertEquals(15.0F, this.l.tarifRemboursement(), 0.0001);
	}
	
	@Test
	public void testToStringUrgente() {
		this.l.setTauxDeRecommandation(1);
		this.l.setCaractereUrgence("urgent");;
		assertEquals("Lettre [7742/famille Kirik, igloo 5 banquise nord/1/urgent]", this.l.toString());
	}
	
	@Test
	public void testToStringNonUrgente() {
		this.l.setTauxDeRecommandation(1);
		this.l.setCaractereUrgence("ordinaire");;
		assertEquals("Lettre [7742/famille Kirik, igloo 5 banquise nord/1/ordinaire]", this.l.toString());
	}
	
}
 