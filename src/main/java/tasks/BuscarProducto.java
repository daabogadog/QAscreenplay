package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.waits.Wait;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.waits.WaitUntil.the;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static userinterfaces.HomePage.*;

public class BuscarProducto implements Task {

    private String descripcion;
    private String tipoCategoria;
    public BuscarProducto(String descripcion, String tipoCategoria){
        this.descripcion=descripcion;
        this.tipoCategoria=tipoCategoria;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        /*if(Visibility.of(BtnIngresar).viewedBy(actor).asBoolean())
            actor.attemptsTo(Click.on(BtnIngresar));*/
        actor.attemptsTo(
                Enter.theValue(descripcion).into(USUARIO),
                Enter.theValue(tipoCategoria).into(PASSWORD),
                //SelectFromOptions.byVisibleText(tipoCategoria).from(PASSWORD),
                //Hit.the(Keys.ENTER).into(),
                Click.on(BtnIngresar)
                //Click.on(MenuTarjetaDebito.of("Valor a enviar al xpath")
                        );
        /*
        import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver; //Importar esta libreria
        for (String winHandle : getDriver().getWindowHandles()){
            getDriver().switchTo().window(winHandle);
        }

        */
    }

    public static BuscarProducto conDescripcion(String descripcion, String tipoCategoria){
       return instrumented(BuscarProducto.class, descripcion, tipoCategoria);
    }
    /*
    private void validarVentanaEmergente(Actor actor) {
        //import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent; se necesita esta libreria
        Wait.until(the(BtnIngresar), isPresent()).forNoLongerThan(5); // esperas explicitas
        if (Visibility.of(BUTTON_CERRAR_VENTANA1).viewedBy(actor).asBoolean())
            actor.attemptsTo(Click.on(BUTTON_CERRAR_VENTANA1));

        Wait.until(the(BUTTON_CERRAR_VENTANA2), isPresent()).forNoLongerThan(5); // esperas explicitas
        if (Visibility.of(BUTTON_CERRAR_VENTANA2).viewedBy(actor).asBoolean())
            actor.attemptsTo(Click.on(BUTTON_CERRAR_VENTANA2));
    }*/
}
