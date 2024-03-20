import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.Test;

public class CompanyTest {
    
    private Company company;
    private User client1, client2, seller1, seller2;
    private Property property1, property2;
    private Sell sell1, sell2;

    
    @Before
    public void setUp() {
        company = new Company();
        // Registro de vendedores
        seller1 = new User("Fernando Fernandes", "966777101", "fefe@remax.pt");
        seller2 = new User("Rodrigo Rodrigues", "966777152", "roro@remax.pt");
        company.registerSeller(seller1);
        company.registerSeller(seller2);
        
        client1 = new User("José Manuel", "911111111", "zemanel@yahoo.com");
        client2 = new User("António Francisco", "922222222", "tochico@hotmail.com");
        
        property1 = new Property("T3 Monte Belo", 150000.0);
        property2 = new Property("T2 Jardim das Flores", 120000.0);
        
        sell1 = new Sell(client1, seller1, property1);
        sell2 = new Sell(client2, seller2, property2);
    }
    
    @Test
    public void testRegisterClient() {
        assertTrue(company.registerClient(client1));
        assertEquals(1, company.getClients().size());
        assertTrue(company.getClients().contains(client1));
    }
    
    @Test
    public void testCalculateSellsOfTheYear() {
        company.registerSell(sell1);
        company.registerSell(sell2);
        assertEquals(2, company.calculateSellsOfTheYear(2024));
    }
    
    @Test
    public void testRegisterClients() {
        assertTrue(company.registerClient(client1));
        assertTrue(company.registerClient(client2));
        assertEquals(2, company.getClients().size());
        assertTrue(company.getClients().contains(client1));
        assertTrue(company.getClients().contains(client2));
    }
    
    @Test
    public void testRegisterClientDuplicate() {
        company.registerClient(client1);
        company.registerClient(client1);
    }
    
    @Test
    public void testCreateSell() {
        assertTrue(company.createSell(client1, seller1, property1));
    }
    
    @Test
    public void testRegisterClientNull() {
        company.registerClient(null);
    }
    
    @Test
    public void testConstructor() {
        assertNotNull(company.getClients());
        assertNotNull(company.getSellers());
        assertNotNull(company.getProperties());
        assertNotNull(company.getSells());
    }
    
    @Test
    public void testFindSellerOfTheYear() {
        company.createSell(client1, seller1, property1);
        company.createSell(client2, seller2, property2);
        company.createSell(client2, seller1, property1);

        assertEquals("Fernando Fernandes", company.findSellerOfTheYear(2024));
    }
}
