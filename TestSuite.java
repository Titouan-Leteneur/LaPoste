import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestSuite {

	private Colis c;
	private Lettre l;
	
	@Before
	public void setUp() throws Exception {
		this.l = new Lettre(7742, "famille Kirik, igloo 5 banquise nord", 0, "ordinaire");
		this.c = new Colis(7854, "famille Kaya, igloo 10, terres ouest", 2, 0.02F, 150, "origine", "contenu", 200);
		
	}

	@After
	public void tearDown() throws Exception {
		this.l = null;
		this.c = null;
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
	
	@Test
	public void testAffranchissementTauxRecommandation0VolumeDepasse() {
		this.c.setVolume(0.2F);
		this.c.setTauxDeRecommandation(0);
		assertEquals(5.0F, c.affranchissement(), 0.0001);
	}
	
	@Test
	public void testAffranchissementTauxRecommandation0VolumeNonDepasse() {
		this.c.setVolume(0.1F);
		this.c.setTauxDeRecommandation(0);
		assertEquals(2.0F, c.affranchissement(), 0.0001);
	}

	@Test
	public void testAffranchissementTauxRecommandation1VolumeDepasse() {
		this.c.setVolume(0.2F);
		this.c.setTauxDeRecommandation(1);
		assertEquals(5.5F, this.c.affranchissement(), 0.0001);
	}
	
	@Test
	public void testAffranchissementTauxRecommandation1VolumeNonDepasse() {
		this.c.setVolume(0.1F);
		this.c.setTauxDeRecommandation(1);
		assertEquals(2.5F, this.c.affranchissement(), 0.0001);
	}
	
	@Test
	public void testAffranchissementTauxRecommandation2VolumeDepasse() {
		this.c.setVolume(0.2F);
		this.c.setTauxDeRecommandation(2);
		assertEquals(6.5F, this.c.affranchissement(), 0.0001);
	}
	
	@Test
	public void testAffranchissementTauxRecommandation2VolumeNonDepasse() {
		this.c.setVolume(0.1F);
		this.c.setTauxDeRecommandation(2);
		assertEquals(3.5F, this.c.affranchissement(), 0.0001);
	}
	
	@Test
	public void testTarifRemboursementTauxRecommandation0c() {
		this.c.setTauxDeRecommandation(0);
		assertEquals(0.0F, this.c.tarifRemboursement(), 0.0001);
	}
	
	@Test
	public void testTarifRemboursementTauxRecommandation1c() {
		this.c.setTauxDeRecommandation(1);
		assertEquals(20.0F, this.c.tarifRemboursement(), 0.0001);
	}
	
	@Test
	public void testTarifRemboursementTauxRecommandation2c() {
		this.c.setTauxDeRecommandation(2);
		assertEquals(100.0F, this.c.tarifRemboursement(), 0.0001);
	}
	
	@Test
	public void testToString() {
		this.c.setTauxDeRecommandation(1);
		this.c.setVolume(0.1F);
		assertEquals("Colis [7854/famille Kaya, igloo 10, terres ouest/1/0.1/200]", this.c.toString());
	}
	
	@Test
	public void testToString1() {
		this.c.setTauxDeRecommandation(1);
		this.c.setVolume(0.2F);
		assertEquals("Colis [7854/famille Kaya, igloo 10, terres ouest/1/0.2/200]", this.c.toString());
	}
	
	@Test
	public void testToString2() {
		this.c.setTauxDeRecommandation(2);
		this.c.setVolume(0.1F);
		assertEquals("Colis [7854/famille Kaya, igloo 10, terres ouest/2/0.1/200]", this.c.toString());
	}
	
	@Test
	public void testToString3() {
		this.c.setTauxDeRecommandation(2);
		this.c.setVolume(0.2F);
		assertEquals("Colis [7854/famille Kaya, igloo 10, terres ouest/2/0.2/200]", this.c.toString());
	}

}
