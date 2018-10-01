package lets.develop.BpzCore.test.functional.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import lets.develop.BpzCore.test.functional.test.FacturaFunctionalTest;
import lets.develop.BpzCore.test.functional.test.ProveedorFunctionalTest;


@RunWith(Suite.class)
@Suite.SuiteClasses({ FacturaFunctionalTest.class, ProveedorFunctionalTest.class})
public class FunctionalSuite {

}
