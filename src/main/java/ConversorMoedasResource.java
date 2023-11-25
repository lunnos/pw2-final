import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;


@Path("/conversor-moedas")
public class ConversorMoedasResource {
    @GET
    @Path("/usd-para-brl/{quantidade}")
    public double converterUsdParaBrl(@PathParam("quantidade") double quantidade) {
        // Implemente a lógica de conversão aqui
        return quantidade * 5.5; // Exemplo: 1 USD = 5.5 BRL
    }

    @GET
    @Path("/brl-para-usd/{quantidade}")
    public double converterBrlParaUsd(@PathParam("quantidade") double quantidade) {
        // Implemente a lógica de conversão aqui
        return quantidade / 5.5; // Exemplo: 1 BRL = 0.18 USD
    }
}
