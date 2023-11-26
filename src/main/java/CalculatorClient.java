import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RegisterRestClient(baseUri = "http://localhost:8080/calculator")
public interface CalculatorClient {

    @GET
    @Path("/sum/{a}/{b}")
    @Produces(MediaType.TEXT_PLAIN)
    long sum(@PathParam("a") long a, @PathParam("b") long b);

    @GET
    @Path("/subtract/{a}/{b}")
    @Produces(MediaType.TEXT_PLAIN)
    long subtract(@PathParam("a") long a, @PathParam("b") long b);

    @GET
    @Path("/multiply/{a}/{b}")
    @Produces(MediaType.TEXT_PLAIN)
    long multiply(@PathParam("a") long a, @PathParam("b") long b);

    @GET
    @Path("/divide/{a}/{b}")
    @Produces(MediaType.TEXT_PLAIN)
    String divide(@PathParam("a") long a, @PathParam("b") long b);
}
