package com.hireright.chanllenge.controller;

import com.hireright.chanllenge.model.GeoLocation;
import org.apache.commons.io.IOUtils;
import com.hireright.chanllenge.service.GeoLocationService;
import com.hireright.chanllenge.utils.ContentTypes;
import com.hireright.chanllenge.utils.Converter;
import com.hireright.chanllenge.utils.EntityMapper;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import static com.hireright.chanllenge.utils.Constants.*;

@WebServlet(urlPatterns = "/location")
public class GeoLocationController extends HttpServlet implements BaseController {
    private GeoLocationService geoLocationService = new GeoLocationService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        
       String zip= IOUtils.toString(req.getReader());
        GeoLocation geoLocation = geoLocationService.findByZip(zip);
        if (geoLocation == null) {
            ExceptionHandler.handleNotFound(req, resp);
            return;
        }
        resp.setHeader(CONTENT_TYPE_HEADER,req.getHeader(ACCEPT_RESPONSE));
        PrintWriter writer = resp.getWriter();
        writer.print(Converter.getConvertByType( ContentTypes.getType(req.getHeader(ACCEPT_RESPONSE)),
                EntityMapper.toGeoLocationDto(geoLocation)));

        writer.flush();
    }
}
