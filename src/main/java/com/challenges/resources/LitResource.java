package com.challenges.resources;

import com.challenges.Bandwidth;
import com.challenges.SiteType;
import com.challenges.dto.*;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;

// full url is localhost:8080/webapi/lit/1
@Path("lit")
public class LitResource {


    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getIt(@PathParam("id") Integer id) {
        if(id == 1)
            return Response.ok(createLitBuilding()).build();
        else
            return Response.status(Response.Status.NOT_FOUND).build();
    }


    /**
     * Obviously this is just a sample project. Won't do this in real world application.
     * @return
     */
    private LitBuilding createLitBuilding() {
        LitBuilding litBuilding = new LitBuilding();
        litBuilding.setBldgClli("MLMAAR07");
        litBuilding.setBuilding("");
        litBuilding.setProviderName("PROVIDER ARKANSAS");
        litBuilding.setIcsc("CC30");
        litBuilding.setSystem("KANSAS/ARKANSAS");
        Address address = new Address();
        address.setStreetNum(1);
        address.setPrefix("E");
        address.setStreetName("MAIN");
        address.setStreetType("ST");
        address.setCity("ALMA");
        address.setState("AR");
        address.setZip(72921);
        litBuilding.setAddress(address);
        ProviderCoordinates pc = new ProviderCoordinates();
        pc.setLatitude(45.47672);
        pc.setLongitude(-84.2194);
        pc.setHorizontalCoord(3811);
        pc.setVerticalCoord(7709);
        litBuilding.setProviderCoordinates(pc);
        Lata lata = new Lata();
        lata.setCode("555");
        litBuilding.setLata(lata);
        Ethernet e = new Ethernet();
        e.setBandwidth(Bandwidth.BANDWIDTH100M.getValue());
        e.setFlag("Y");
        Ethernet e4 = new Ethernet();
        e4.setBandwidth(Bandwidth.BANDWIDTH1G.getValue());
        e4.setFlag("Y");

        Ethernet e1 = new Ethernet();
        e1.setBandwidth(Bandwidth.BANDWIDTH10G.getValue());
        e1.setFlag("Y");

        Ethernet e2 = new Ethernet();
        e2.setBandwidth(Bandwidth.BANDWIDTH40G.getValue());
        e2.setFlag("Y");

        Ethernet e3 = new Ethernet();
        e3.setBandwidth(Bandwidth.BANDWIDTH100G.getValue());
        e3.setFlag("Y");
        ArrayList<Ethernet> ethernetArrayList = new ArrayList<Ethernet>();
        ethernetArrayList.add(e);
        ethernetArrayList.add(e1);
        ethernetArrayList.add(e2);
        ethernetArrayList.add(e3);
        litBuilding.setEthernet(ethernetArrayList);
        litBuilding.setSiteType(SiteType.CUSTOMER.toString());
        return litBuilding;
    }
}
