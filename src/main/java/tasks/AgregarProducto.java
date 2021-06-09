package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.waits.WaitUntil.the;
import static userinterfaces.DetallesArticulosPages.*;

public class AgregarProducto implements Task {

    //private String cantidad;
    public  AgregarProducto (){
        //this.cantidad=cantidad;
    }


    @Override

    public <T extends Actor> void performAs(T actor) {
        WaitUntil.the(MenuTarjetaDebito_Principal,isVisible()).forNoMoreThan(5).seconds(); //
         actor.attemptsTo(
                 Click.on(MenuTarjetaDebito_Principal.of("Tarjeta débito")),
                 Click.on(MenuTarjetaDebito_Consulta.of("Consulta"))
         );
    }




    public static AgregarProducto cantidad(){
        return instrumented(AgregarProducto.class);
    }
}
