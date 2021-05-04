package at.kienboeck.swlcm.cypher;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api/cypher")
public class CaesarCypherController {
    @GET
    @Path("/{secret}")
    @Produces(MediaType.TEXT_PLAIN)
    public String GetCaesarCode(@PathParam("secret") String secret) {
        return secret;
    }
}
