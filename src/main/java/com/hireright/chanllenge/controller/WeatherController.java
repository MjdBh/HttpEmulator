package com.hireright.chanllenge.controller;

import com.hireright.chanllenge.controller.dto.WeatherDto;
import com.hireright.chanllenge.model.Weather;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.hireright.chanllenge.service.WeatherService;
import com.hireright.chanllenge.utils.ContentTypes;
import com.hireright.chanllenge.utils.Converter;
import com.hireright.chanllenge.utils.EntityMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import static com.hireright.chanllenge.utils.Constants.ACCEPT_RESPONSE;
import static com.hireright.chanllenge.utils.Constants.CONTENT_TYPE_HEADER;

@WebServlet(urlPatterns = "/weather")
public class WeatherController extends HttpServlet implements BaseController {
    private static Logger logger = LoggerFactory.getLogger(WeatherController.class);
    private WeatherService weatherService = new WeatherService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String cityCode = req.getParameter("city");
        if( cityCode==null || cityCode.length()==0){
            ExceptionHandler.handleBadRequest(req, resp);
            return;
        }
        Weather weather = weatherService.findByCityCode(cityCode);
        if (weather == null) {
            ExceptionHandler.handleNotFound(req, resp);
            return;
        }
        WeatherDto weatherDto = EntityMapper.toWeatherDto(weather);
        resp.setHeader(CONTENT_TYPE_HEADER,req.getHeader(ACCEPT_RESPONSE));
        PrintWriter writer = resp.getWriter();
        writer.print(Converter.getConvertByType( ContentTypes.getType(req.getHeader(ACCEPT_RESPONSE)),
                weatherDto));
        writer.flush();
    }
}
