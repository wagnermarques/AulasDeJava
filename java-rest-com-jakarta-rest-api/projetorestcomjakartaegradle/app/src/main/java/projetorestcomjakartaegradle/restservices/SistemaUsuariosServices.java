package projetorestcomjakartaegradle.restservices;

import jakarta.enterprise.inject.Produces;
import jakarta.websocket.server.PathParam;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import projetorestcomjakartaegradle.model.SistemaUsuario;

import java.util.List;

@Path("/usuarios")
public class SistemaUsuariosServices {

	
	@GET
	@Path("getdefaultstring")
    //@Produces(MediaType.APPLICATION_JSON)
    public String getDefaultTestString() {
		//http://localhost:8080/app/api/usuarios/getdefaultstring
		
        // Return a list of SistemaUsuario objects (e.g., from a database)
        // This is a simplified example
        return "DefaultTestString...";
    }
	
    @GET
    //@Produces(MediaType.APPLICATION_JSON)
    public List<SistemaUsuario> getAllUsuarios() {
        // Return a list of SistemaUsuario objects (e.g., from a database)
        // This is a simplified example
        return null;
    }

    @POST
    //@Consumes(MediaType.APPLICATION_JSON)
    public void createUsuario(SistemaUsuario usuario) {
        // Create a new SistemaUsuario (e.g., save it to a database)
        // This is a simplified example
    }

    @GET
    @Path("/{loginName}")
    //@Produces(MediaType.APPLICATION_JSON)
    public SistemaUsuario getUsuario(@PathParam("loginName") String loginName) {
        // Retrieve a SistemaUsuario by loginName (e.g., from a database)
        // This is a simplified example
        return null;
    }

    @PUT
    @Path("/{loginName}")
    //@Consumes(MediaType.APPLICATION_JSON)
    public void updateUsuario(@PathParam("loginName") String loginName, SistemaUsuario usuario) {
        // Update a SistemaUsuario with the specified loginName (e.g., update it in a database)
        // This is a simplified example
    }

    @DELETE
    @Path("/{loginName}")
    public void deleteUsuario(@PathParam("loginName") String loginName) {
        // Delete a SistemaUsuario by loginName (e.g., remove it from a database)
        // This is a simplified example
    }
}
