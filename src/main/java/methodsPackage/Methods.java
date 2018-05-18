package methodsPackage;


import objectPackage.Objects;
import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Methods {

    Objects objects = new Objects();
    String txt ="";

    public void task1(WebDriver driver){

        //Establezco el titulo de la pagina
        objects.TxtPageTitle(driver).sendKeys(driver.getTitle());
    }

    public void task2(WebDriver driver){

        //Capturamos el nombre aleatorio
        //Y lo seteamos en el txt correspondiente
        txt = objects.LblNombre(driver).getText();
        objects.TxtNombre(driver).sendKeys(txt);
    }

    public void task3(WebDriver driver){

        //Capturamos el valor de la ocupacion a setear
        txt = objects.LblCargo(driver).getText();

        //Evaluo que ocupacion esta establecida para seleccionarla en el form
        if (txt.equals("Developer")){
            txt="dev";
        }else if (txt.equals("Scrum Master")){
            txt="sm";
        }else if (txt.equals("QA Automation")){
            txt="qa";
        }else{
            txt="pm";
        }

        //Se establece la ocupacion definida en la tarea
        Select ocupacion = new Select(objects.SltCargo(driver));
        ocupacion.selectByValue(txt);
    }

    public void task4(WebDriver driver){

        int nro;

        //Establecemos cuantas cajas negras hay
        nro = objects.NroBlackBoxes(driver);

        //casteamos el valor obtenido a string
        txt = String.valueOf(nro);

        //Seteamos el valor en el campo correspondiente
        objects.TxtBlackBoxes(driver).sendKeys(txt);
    }

    public void task5(WebDriver driver){

        //Capturamos el texto del link
        txt = objects.LblLink(driver).getText();

        //Evaluamos texto del link
        if (txt.equals("Link 1")){
            txt="link1";
        }else if (txt.equals("Link 2")){
            txt="link2";
        }else {
            txt="clickme";
        }

        //Hacemos click en el link pedido en la tarea
        objects.ClickLink(driver, txt);
    }

    public void task6(WebDriver driver){

        //Capturamos el valor del atributo class
        txt = objects.RedBox(driver).getAttribute("class");

        //Escribimos el valor, en la caja de texto respectiva
        objects.TxtRedBox(driver).sendKeys(txt);
    }

    public void task7(WebDriver driver){

        //Capturamos el texto de la posicion a establecer
        txt = objects.LblPosicion(driver).getText();

        //El texto obtenido, lo pasamos al objeto optionButton para seleccionar el correcto
        objects.OptPosicion(driver, txt).click();
    }

    public  void task8(WebDriver driver){

        //Capturamos el texto del elemento RedBox
        txt = objects.RedBox(driver).getText();

        //Escribimos el texto obtenido en el campo correspondiente
        objects.TxtRes8(driver).sendKeys(txt);
    }

    public  void task9(WebDriver driver){

        //Capturamos las coordenadas de los elementos
        Point pGreen, pOrange;
        pGreen = objects.GreenBox(driver).getLocation();
        pOrange = objects.OrangeBox(driver).getLocation();

        //Evaluo las coordenadas YY de los elementos
        txt= (pGreen.getY() > pOrange.getY()) ? "orange" : "green";

        //Escribimos el color del elemento que esta mas arriba en el campo correspondiente
        objects.TxtRes9(driver).sendKeys(txt);
    }

    public void task10(WebDriver driver){
        try {

            //Buscamos el elemento
            objects.LblIamHere(driver);

            //Establecemos la respuesta en la caja de texto correspondiente a la tarea
            objects.TxtRes10(driver).sendKeys("YES");

        }catch (Exception e){
            //Si lanza una excepcion, significa que el elemento no esta presente, y escribomos NO en el
            //Campo de texto correspondiente a la tarea
            objects.TxtRes10(driver).sendKeys("NO");
        }
    }

    public void task11(WebDriver driver){

        //Evaluamos si el elemento esta visible
        txt = (objects.PurpleBox(driver).isDisplayed()) ? "YES" : "NO";

        //Colocamos la respuesta en el campo correspondiente
        objects.TxtRes11(driver).sendKeys(txt);
    }

    public void task12(WebDriver driver){

        boolean enable = false;

        //Hacemos click en el link WAIT
        objects.LinkWait(driver).click();

        //Esperamos hasta que aparezca el nuevo link y hacemos click en el
        do{
            try {
                objects.LinkAfterWait(driver).click();
                enable=true;
            }catch (Exception e){
                continue;
            }
        }while (enable==false);

        System.out.println("Tiempo del click: "+ driver.switchTo().alert().getText());

        //Hacemos click en OK en el alert que aparece
        driver.switchTo().alert().accept();
    }

    public void task14(WebDriver driver){

        //Hacemos click en boton enviar
        objects.BtnSubmit(driver).click();
    }

    public String[] CheckResults(WebDriver driver){

        WebDriverWait wait;
        String[] arrayLabels = {"","","","","","","",
                                "", "", "", "", "", "", ""};

        //Hacemos click en boton Check Results
        objects.BtnCheckResults(driver).click();

        //Pausa explcita hasta que se muestre la etiqueta de resultados
        wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("showresults")));

        //Evaluamos resultado de tarea 1
        txt = objects.LblOk1(driver).getText();
        arrayLabels[0]=txt;

        //Evaluamos resultado de tarea 2
        txt = objects.LblOk2(driver).getText();
        arrayLabels[1]=txt;

        //Evaluamos resultado de tarea 3
        txt = objects.LblOk3(driver).getText();
        arrayLabels[2]=txt;

        //Evaluamos resultado de tarea 4
        txt = objects.LblOk4(driver).getText();
        arrayLabels[3]=txt;

        //Evaluamos resultado de tarea 5
        txt = objects.LblOk5(driver).getText();
        arrayLabels[4]=txt;

        //Evaluamos resultado de tarea 6
        txt = objects.LblOk6(driver).getText();
        arrayLabels[5]=txt;

        //Evaluamos resultado de tarea 7
        txt = objects.LblOk7(driver).getText();
        arrayLabels[6]=txt;

        //Evaluamos resultado de tarea 8
        txt = objects.LblOk8(driver).getText();
        arrayLabels[7]=txt;

        //Evaluamos resultado de tarea 9
        txt = objects.LblOk9(driver).getText();
        arrayLabels[8]=txt;

        //Evaluamos resultado de tarea 10
        txt = objects.LblOk10(driver).getText();
        arrayLabels[9]=txt;

        //Evaluamos resultado de tarea 11
        txt = objects.LblOk11(driver).getText();
        arrayLabels[10]=txt;

        //Evaluamos resultado de tarea 12
        txt = objects.LblOk12(driver).getText();
        arrayLabels[11]=txt;

        //Evaluamos resultado de tarea 13
        txt = objects.LblOk13(driver).getText();
        arrayLabels[12]=txt;

        //Evaluamos resultado de tarea 14
        txt = objects.LblOk14(driver).getText();
        arrayLabels[13]=txt;
        return arrayLabels;
    }
}
