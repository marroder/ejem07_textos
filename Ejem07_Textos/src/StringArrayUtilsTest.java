import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.ParametersSuppliedBy;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class StringArrayUtilsTest{
	
	public StringArrayUtils array;
	public String[] datosArray;
	public String vEsperado, valor1, valor2;
	
	@Parameters
	public static ArrayList<String[]> metodoParametrizado() {
		//Creamos 6 arrays de tipo String
		String cadena[] = {"Cristina"};
		String cadena2[] = {"Leonardo"};
		String cadena3[] = {"Samuel"};
		//Creamos 1 arrayList de tipo String
		ArrayList<String[]> datos = new ArrayList<>();
		//Añadimos los 6 arrays al arrayList 
		datos.add(cadena);
		datos.add(cadena2);
		datos.add(cadena3);
		//Retornamos el arrayList
		return datos;
	}
	@Before
	public void inicializa() {
		array = new StringArrayUtils(datosArray);
	}
	//Constructor
	public StringArrayUtilsTest(String valor1) {
	super();
	this.vEsperado = valor1;
	this.valor1 = valor1;
	}
	
	@Test
	public void testStringArrayUtils() {
		
		}
	@Test
	public void testGetMaxLength() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTotalLength() {
		Assert.assertEquals(valorEsperado, (Integer)mical.suma(valor1, valor2));
	}

	@Test
	public void testGetIndexOf() {
		fail("Not yet implemented");
	}

	@Test
	public void testMain() {
		fail("Not yet implemented");
	}

}

//@Test
//public void testSuma() {
//	Assert.assertEquals((int) vEsperado, (int) calc.suma(valor1, valor2));
//}
@Test
public void testMultiplicar()
{
	Assert.assertEquals(vEsperado,(Integer)calc.multiplicar(valor1, valor2));
}
//modificacion por guillermo

