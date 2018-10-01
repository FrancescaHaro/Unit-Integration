package lets.develop.BpzCore.test.unit.suite;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import lets.develop.BpzCore.test.unit.test.FacturaUnitTest;
import lets.develop.BpzCore.test.unit.test.ProveedorUnitTest;


@RunWith(Categories.class)
@SuiteClasses(
		{
			FacturaUnitTest.class,
			ProveedorUnitTest.class
		}
		)
public class UnitSuite { 


}
