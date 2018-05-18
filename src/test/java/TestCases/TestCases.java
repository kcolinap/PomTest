package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import methodsPackage.Methods;


public class TestCases {

    private WebDriver driver;

    private Methods methods = new Methods();
    static String rutaDriver = "chromedriver.exe",
            rutaUrl = "http://exercises.fdvs.com.ar/semisenior.html";

    private void abrirNavegador(String rutaDriver, String rutaUrl){

        //Cambiar aqui direccion del driver
        System.setProperty("webdriver.chrome.driver", rutaDriver);

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(rutaUrl);
    }


    @BeforeClass
    public void setUp(){
        System.out.println("Iniciando Navegador");
        abrirNavegador(rutaDriver, rutaUrl);
    }

    @Test
    public void testA1(){
        try {
            System.out.println("Ejecutando la tarea 1");
            methods.task1(driver);
        }catch (Exception e){
            System.out.println("Error Ejecutando la tarea 1");
        }

    }

    @Test
    public void testA2(){
        try {
            System.out.println("Ejecutando la tarea 2");
            methods.task2(driver);
        }catch (Exception e){
            System.out.println("Error Ejecutando la tarea 2");
        }
    }

    @Test
    public void testA3(){
        try {
            System.out.println("Ejecutando la tarea 3");
            methods.task3(driver);
        }catch (Exception e){
            System.out.println("Error Ejecutando la tarea 3");
        }

    }

    @Test
        public void testA4(){
            try {
                System.out.println("Ejecutando la tarea 4");
                methods.task4(driver);
            }catch (Exception e){
                System.out.println("Error Ejecutando la tarea 4");
            }
    }

    @Test
    public void testA5(){
        try {
            System.out.println("Ejecutando la tarea 5");
            methods.task5(driver);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Error Ejecutando la tarea 5");
        }
    }

    @Test
    public void testA6(){
        try {
            System.out.println("Ejecutando la tarea 6");
            methods.task6(driver);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Error Ejecutando la tarea 6");
        }
    }

    @Test
    public void testA7(){
        try {
            System.out.println("Ejecutando la tarea 7");
            methods.task7(driver);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Error Ejecutando la tarea 7");
        }
    }

    @Test
    public void testA8(){
        try {
            System.out.println("Ejecutando la tarea 8");
            methods.task8(driver);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Error Ejecutando la tarea 8");
        }
    }

    @Test
    public void testA9(){
        try {
            System.out.println("Ejecutando la tarea 9");
            methods.task9(driver);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Error Ejecutando la tarea 9");
        }
    }

    @Test
    public void testB1(){
        try {
            System.out.println("Ejecutando la tarea 10");
            methods.task10(driver);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Error Ejecutando la tarea 10");
        }
    }

    @Test
    public void testB2(){
        try {
            System.out.println("Ejecutando la tarea 11");
            methods.task11(driver);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Error Ejecutando la tarea 11");
        }
    }

    @Test
    public void testB3(){
        try {
            System.out.println("Ejecutando la tarea 12");
            methods.task12(driver);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Error Ejecutando la tarea 12");
        }
    }

    @Test
    public void testB4(){
        try {
            System.out.println("Ejecutando la tarea 14");
            methods.task14(driver);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Error Ejecutando la tarea 14");
        }
    }


    @AfterClass
    public void tearDown(){

        try {

            System.out.println("");
            System.out.println("");
            System.out.println("Chequeo de resultados de las tareas");
            System.out.println("*************************************");
            String[] auxTxt = methods.CheckResults(driver);
            int i=0;

            for (i=0; i<14; i++){
                Assert.assertEquals(auxTxt[i], "OK");
                if (auxTxt[i].equals("OK"))  {
                    System.out.println("Tarea #"+(i+1)+": Ejecutada correctamente");
                }
            }

        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Error Ejecutando el chequeo de resultados");
        }

        System.out.println("Cerrando Navegador");
        //driver.quit();
    }
}
