package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://development.excelcredit.co/auth/realms/rei_excelcredit/protocol/openid-connect/auth?client_id=cli_portal_rilo&redirect_uri=https%3A%2F%2Frilodev.excelcredit.co%2Finstancia6%2F%23%2Ftarjeta%2Fgestion&state=c65f96bc-b96c-494b-84fa-d2f8579ea8f3&response_mode=fragment&response_type=code&scope=openid&nonce=f8a67868-92e8-407f-8386-e95473aa633f")
public class HomePage extends PageObject {

    public static final Target USUARIO  = Target.the("Caja de texto usuario").located(By.id("username"));
    public static final Target PASSWORD = Target.the("Caja de texto Password").located(By.id("password"));
    public static final Target BtnIngresar = Target.the("Boton ingresar").located(By.id("kc-login"));



}
