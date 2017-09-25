package application.rest.v1;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import java.util.ArrayList;


/**
@Path("v1/example")
public class Example {


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response example() {
        List<String> list = new ArrayList<>();
        //return a simple list of strings
        list.add("Some data");
        return Response.ok(list.toString()).build();
    }


}
*/

@Path("hello")
public class Example {
	@GET 
	public String greet() throws Exception {
		return "Hello from " + java.net.InetAddress.getLocalHost().getHostName();
	}
}
