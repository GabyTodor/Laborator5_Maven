import ex2_tema.PerecheNumere;
import exemplu2.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TesteNumere {
    @Test
    void test1_fibb_consecutive() {
        PerecheNumere p = new PerecheNumere(3,5);
        assertEquals(true, p.consecutive());
    }
    @Test
    void test2_fibb_consecutive() {
        PerecheNumere p=new PerecheNumere(5,8);
        assertTrue(p.consecutive());
    }
    @Test
    void test3_fibb_consecutive() {
        PerecheNumere p=new PerecheNumere(5,8);
        assertFalse(!p.consecutive());
    }
    @Test
    void test1_cmmdc(){
        PerecheNumere p=new PerecheNumere(5,8);
        assertEquals(1, p.cmmdc());
    }
    @Test
    void test2_cmmdc(){
        PerecheNumere p=new PerecheNumere(6,8);
        assertTrue(p.cmmdc()==2);
    }
    @Test
    void test3_cmmdc(){
        PerecheNumere p=new PerecheNumere(20,8);
        assertFalse(p.cmmdc()!=4);
    }
    @Test
    void test1_suma(){
        PerecheNumere p=new PerecheNumere(15,60);
        assertEquals(true,p.suma_cifre());
    }
    @Test
    void test2_suma(){
        PerecheNumere p=new PerecheNumere(367,907);
        assertTrue(p.suma_cifre());
    }@Test
    void test3_suma(){
        PerecheNumere p=new PerecheNumere(15,60);
        assertFalse(!p.suma_cifre());
    }
    @Test
    void test1_paritate(){
        PerecheNumere p=new PerecheNumere(22,46);
        assertEquals(true, p.paritate());
    }
    @Test
    void test2_paritate(){
        PerecheNumere p=new PerecheNumere(32,491);
        assertTrue(p.paritate());
    }
    @Test
    void test3_paritate(){
        PerecheNumere p=new PerecheNumere(13,579);
        assertFalse(!p.paritate());
    }
}
