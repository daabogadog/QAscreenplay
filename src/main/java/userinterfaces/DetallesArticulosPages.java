package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class DetallesArticulosPages {

    public static final Target MenuTarjetaDebito_Principal = Target.the("Menu Tarjeta Debito").locatedBy("//span[text()='{0}']");
    public static final Target MenuTarjetaDebito_Consulta = Target.the("Sub Menu Tarjeta Debito Consulta").locatedBy("//span[text()='{0}']");

}
