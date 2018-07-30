package com.vogella.jersey.first;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import javarevolutions.ws.rest.vo.VOUsuario;

@Path("/JavaRevolutions")
public class ServiceLogin {
	
	@POST
    @Path("/validaUsuario")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public VOUsuario validaUsuario(VOUsuario vo) {
        vo.setUserValido(false);
        if (vo.getUsuario().equals("Java") && vo.getPassword().equals("Revolutions")) {
            vo.setUserValido(true);
        }
        //vo.setPassword("#############################");
        return vo;
    }

}
