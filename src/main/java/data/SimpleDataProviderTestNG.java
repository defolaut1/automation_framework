package data;

import org.testng.annotations.DataProvider;

public class SimpleDataProviderTestNG {
    @DataProvider(name = "provider")
    public static Object[][] provider() {
        return new Object[][] {
                {"Коньки"}
        };
    }
}
