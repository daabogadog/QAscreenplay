package stepdefinitions;

import cucumber.api.java.es.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.AgregarProducto;
import tasks.BuscarProducto;
import userinterfaces.HomePage;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;


import java.util.List;

public class EjemploSteps {

    @Managed(driver ="chrome")
    private WebDriver navegador;
    private Actor actor = Actor.named("Probador");
    private HomePage homePage = new HomePage();


    @Dado("^que un nuevo cliente accede hasta a web de compras$")
    public void queUnNuevoClienteAccedeHastaAWebDeCompras() {
              actor.can(BrowseTheWeb.with(navegador));
              getDriver().manage().window().maximize();
              actor.wasAbleTo(Open.browserOn(homePage));

    }

    @Cuando("^el agrega (.*) unidades de (.*) de (.*) al carro$")
    public void elAgregaUnPorductoAlCarro(String cantidad, String descripcion,String tipoCategoria) {
            actor.wasAbleTo(
                    BuscarProducto.conDescripcion(descripcion,tipoCategoria),
                    AgregarProducto.cantidad()
            );
    }

    @Entonces("^el ve los productors lsitados en el carro de compras$")
    public void elVeLosProductorsLsitadosEnElCarroDeCompras() {

    }

    @Dado("^que un nuevo cliente accede hasta la web de compras$")
    public void queUnNuevoClienteAccedeHastaLaWebDeCompras() {

    }

    @Cuando("^el agraga productos al carro$")
    public void elAgragaProductosAlCarro(List<String> datos) {

    }

    @Entonces("^l ve los productos listados en el carro de compras$")
    public void lVeLosProductosListadosEnElCarroDeCompras() {

    }

}
