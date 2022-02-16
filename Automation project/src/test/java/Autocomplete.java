import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocomplete {
    public static void main(String [] arg) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver","C:/Users/dianaolari/Documents/chromedriver.exe");

            //la linia 6 i-am spus sistemului unde sa gaseasca driverul
        WebDriver driver=new ChromeDriver();//aici am creat un nou obiect al clasei Chrome driver care se numeste driver si care are tipul de data ChromeDriver
            driver.get("https://formy-project.herokuapp.com/autocomplete");// aici am dechis linkul specificat intre paranteze
        WebElement autocomplete = driver.findElement(By.id("autocomplete")); //identificam prin intermediul id-ului elementul textbox in care se poate pune adresa
        //elementul identificat este salvat intr-o variabila numita acutocomplete care are tipul de data webelement

        autocomplete.sendKeys("strada Lalelelor nr.5");
        Thread.sleep(2000);
    driver.findElement(By.xpath("/html/body/div[2]/div/table/tr/td[2]/button")).click();


        /* o variabila este o adresa de memorie la care sunt stocate informatiile
        o functie reprezinta un set de instructiuni grupate sub un singur nume
        o clasa reprezinta un tipar care defineste atributele pe care trebuie sa le aiba un obiect si actiunile pe care poate sa le faca
        un obiect este o instanta a unei clase adica o reprezentare reala creata pe baza tiparului definit in clasa
        un tip de data este o proprietate a unei variabile sau a unei functii care specifica ce informatii pot sa fie stocate in variabila sau returnate de catre functie
        putem spune ca o functie returneaza ceva atunci cand trimite rezultatul actiunii pe care o face catre exterior
     */
    }


}
