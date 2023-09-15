package dataproviders;

import org.testng.annotations.DataProvider;

public class DataProviders {
    @DataProvider(name = "data")
    public static Object [][] getData(){
        Object [][] array;
        array = ExcelReader.getDataFromSheet("users");
        return array;
    }

    @DataProvider(name = "username")
    public static Object [][] getUsernameData(){
        Object [][] array;
        array = CustomExcelReader.getDataFromSheet("users");
        return array;
    }
}
