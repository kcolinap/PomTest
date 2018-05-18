package objectPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Objects {

    private WebDriver driver;

    private  static WebElement element = null;

    By txtPageTitle = By.id("answer1");//Txt para respuesta de tarea 1
    By lblNombre = By.xpath("/html/body/ol/li[2]/b");//nombre aleatorio a colocar en txtNombre
    By txtNombre = By.id("name");
    By lblCargo =  By.xpath("/html/body/ol/li[3]/b");//Nombre aleatorio del cargo
    By sltCargo = By.id("occupation");
    By nroBlackBoxes = By.className("blackbox");//elemento cajas negras
    By txtBlackBoxes = By.id("answer4"); //Txt para respuesta de tarea 4
    By lblLink = By.xpath("/html/body/ol/li[5]/b"); //Nombre aleatrorio del link a clickear
    By redBox = By.id("redbox"); //Elemento redBox
    By txtClassRedBox = By.id("answer6"); //Txt para respuesta de tarea 6
    By lblPosicion = By.xpath("/html/body/ol/li[7]/b"); //Nombre aleatorio de la posicion
    By txtRes8 = By.id("answer8"); //Campo de respuesta a la tarea 8
    By orangeBox = By.id("orangebox"); //Elemento OrangeBox
    By greenBox = By.id("greenbox"); //Elemento GreenBox
    By txtRes9 = By.id("answer9"); //Campo de respuesta a la tarea 9
    By lblIamHere = By.id("IAmHere"); //Elemento IAmHere
    By txtRes10 = By.id("answer10"); //Campo de respuesta a la tarea 10
    By purpleBox = By.id("purplebox"); //Elemento caja purpura
    By txtRes11 = By.id("answer11"); //Campo de respuesta a la tarea 11
    By linkWait = By.linkText("Wait"); // Elemento link Wait
    By linkAfterWait = By.linkText("Click After Wait"); // Elemento link after wait
    By btnSubmit = By.id("submitbutton");// Elemento boton enviar
    By btnCheckResults = By.id("checkresults"); // Elemento boton checkResults

    //Elementos de etiqueta de resultado de las tareas
    By lblOk1 = By.id("ok_1");// etiqueta ok tarea 1
    By lblOk2 = By.id("ok_2");// etiqueta ok tarea 2
    By lblOk3 = By.id("ok_3");// etiqueta ok tarea 3
    By lblOk4 = By.id("ok_4");// etiqueta ok tarea 4
    By lblOk5 = By.id("ok_5");// etiqueta ok tarea 5
    By lblOk6 = By.id("ok_6");// etiqueta ok tarea 6
    By lblOk7 = By.id("ok_7");// etiqueta ok tarea 7
    By lblOk8 = By.id("ok_8");// etiqueta ok tarea 8
    By lblOk9 = By.id("ok_9");// etiqueta ok tarea 9
    By lblOk10 = By.id("ok_10");// etiqueta ok tarea 10
    By lblOk11 = By.id("ok_11");// etiqueta ok tarea 11
    By lblOk12 = By.id("ok_12");// etiqueta ok tarea 12
    By lblOk13 = By.id("ok_13");// etiqueta ok tarea 13
    By lblOk14 = By.id("ok_14");// etiqueta ok tarea 14

    /*
                Cada metodo ubica el elemento respectivo
                y lo retorna
     */

    public WebElement TxtPageTitle(WebDriver driver){
        element = driver.findElement(txtPageTitle);
        return element;
    }

    public WebElement LblNombre(WebDriver driver){
        element = driver.findElement(lblNombre);
        return element;
    }

    public WebElement TxtNombre(WebDriver driver){
        element = driver.findElement(txtNombre);
        return element;
    }

    public WebElement LblCargo(WebDriver driver){
        element = driver.findElement(lblCargo);
        return element;
    }

    public WebElement SltCargo(WebDriver driver){
        element = driver.findElement(sltCargo);
        return element;
    }

    public int NroBlackBoxes(WebDriver driver){
        int nro;
        nro = driver.findElements(nroBlackBoxes).size();
        return nro;
    }

    public WebElement TxtBlackBoxes(WebDriver driver){
        element = driver.findElement(txtBlackBoxes);
        return element;
    }

    public WebElement LblLink(WebDriver driver){
        element = driver.findElement(lblLink);
        return element;
    }

    public void ClickLink(WebDriver driver, String link){

        element = driver.findElement(By.id(link));
        element.click();
    }

    public WebElement RedBox(WebDriver driver){
        element = driver.findElement(redBox);
        return element;
    }

    public WebElement TxtRedBox(WebDriver driver){
        element = driver.findElement(txtClassRedBox);
        return element;
    }

    public WebElement LblPosicion(WebDriver driver){
        element = driver.findElement(lblPosicion);
        return element;
    }

    public  WebElement OptPosicion(WebDriver driver, String txt){
        element = driver.findElement(By.cssSelector("input[value='"+txt+"']"));
        return element;
    }

    public  WebElement TxtRes8(WebDriver driver){
        element = driver.findElement(txtRes8);
        return element;
    }

    public  WebElement OrangeBox(WebDriver driver){
        element = driver.findElement(orangeBox);
        return element;
    }

    public  WebElement GreenBox(WebDriver driver){
        element = driver.findElement(greenBox);
        return element;
    }

    public  WebElement TxtRes9(WebDriver driver){
        element = driver.findElement(txtRes9);
        return element;
    }

    public  WebElement LblIamHere(WebDriver driver){
        element = driver.findElement(lblIamHere);
        return element;
    }

    public  WebElement TxtRes10(WebDriver driver){
        element = driver.findElement(txtRes10);
        return element;
    }

    public  WebElement PurpleBox(WebDriver driver){
        element = driver.findElement(purpleBox);
        return element;
    }

    public  WebElement TxtRes11(WebDriver driver){
        element = driver.findElement(txtRes11);
        return element;
    }

    public  WebElement LinkWait(WebDriver driver){
        element = driver.findElement(linkWait);
        return element;
    }

    public  WebElement LinkAfterWait(WebDriver driver){
        element = driver.findElement(linkAfterWait);
        return element;
    }

    public  WebElement BtnSubmit(WebDriver driver){
        element = driver.findElement(btnSubmit);
        return element;
    }

    public  WebElement BtnCheckResults(WebDriver driver){
        element = driver.findElement(btnCheckResults);
        return element;
    }

    public  WebElement LblOk1(WebDriver driver){
        element = driver.findElement(lblOk1);
        return element;
    }

    public  WebElement LblOk2(WebDriver driver){
        element = driver.findElement(lblOk2);
        return element;
    }

    public  WebElement LblOk3(WebDriver driver){
        element = driver.findElement(lblOk3);
        return element;
    }

    public  WebElement LblOk4(WebDriver driver){
        element = driver.findElement(lblOk4);
        return element;
    }

    public  WebElement LblOk5(WebDriver driver){
        element = driver.findElement(lblOk5);
        return element;
    }

    public  WebElement LblOk6(WebDriver driver){
        element = driver.findElement(lblOk6);
        return element;
    }

    public  WebElement LblOk7(WebDriver driver){
        element = driver.findElement(lblOk7);
        return element;
    }

    public  WebElement LblOk8(WebDriver driver){
        element = driver.findElement(lblOk8);
        return element;
    }

    public  WebElement LblOk9(WebDriver driver){
        element = driver.findElement(lblOk9);
        return element;
    }

    public  WebElement LblOk10(WebDriver driver){
        element = driver.findElement(lblOk10);
        return element;
    }

    public  WebElement LblOk11(WebDriver driver){
        element = driver.findElement(lblOk11);
        return element;
    }

    public  WebElement LblOk12(WebDriver driver){
        element = driver.findElement(lblOk12);
        return element;
    }

    public  WebElement LblOk13(WebDriver driver){
        element = driver.findElement(lblOk13);
        return element;
    }

    public  WebElement LblOk14(WebDriver driver){
        element = driver.findElement(lblOk14);
        return element;
    }
}
