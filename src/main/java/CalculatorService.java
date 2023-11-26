import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/calculator")
public class CalculatorService {

    @GET
    @Path("/sum/{a}/{b}")
    @Produces(MediaType.TEXT_PLAIN)
    public long sum(@PathParam("a") long a, @PathParam("b") long b) {
        return a + b;
    }

    @GET
    @Path("/subtract/{a}/{b}")
    @Produces(MediaType.TEXT_PLAIN)
    public long subtract(@PathParam("a") long a, @PathParam("b") long b) {
        return a - b;
    }

    @GET
    @Path("/multiply/{a}/{b}")
    @Produces(MediaType.TEXT_PLAIN)
    public long multiply(@PathParam("a") long a, @PathParam("b") long b) {
        return a * b;
    }

    @GET
    @Path("/divide/{a}/{b}")
    @Produces(MediaType.TEXT_PLAIN)
    public String divide(@PathParam("a") long a, @PathParam("b") long b) {
        if (b != 0) {
            return String.valueOf(a / b);
        } else {
            return "Cannot divide by zero";
        }
    }
}
