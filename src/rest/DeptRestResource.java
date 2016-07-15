package rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("demo")
//@Produces("application/json;charset=utf-8")
//@Consumes("application/json;charset=utf-8")
public class DeptRestResource {

	
	@GET
	@Path("hello")
	@Produces(MediaType.TEXT_PLAIN)
	public String hello(){
		
		return "hello world";
	}
}
