package testsJunit;


import dominio.Consola;
import dominio.Sobremesa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class sistemaTests {


    @Test
    public void testContructor(){
        Consola consola = new Consola("Intel",4,10,400,5,true);

        Assertions.assertSame("Intel", consola.getProcesador());
        Assertions.assertEquals(4,consola.getHerzios());
        Assertions.assertEquals(10, consola.getRam());
        Assertions.assertEquals(400, consola.getCapacidad());
        Assertions.assertEquals(true, consola.isStick());
        Assertions.assertNotEquals("AMD", consola.getProcesador());
        Assertions.assertNotEquals(10, consola.getPulgadas());
    }

    @Test
    public void testEqualsSobremesa(){
        Sobremesa sobremesa1 = new Sobremesa("intel",4,10,500,"ASUS" );
        Sobremesa sobremesa2 = new Sobremesa("intel",4,10,500,"ASUS");
        Sobremesa sobremesa3 = new Sobremesa("AMD",4,11,500,"ASUS");

        Assertions.assertEquals(sobremesa1, sobremesa2);
        Assertions.assertNotEquals(sobremesa1,sobremesa3);
    }

    /*private void assertSame(boolean b) {
    }*/
}
