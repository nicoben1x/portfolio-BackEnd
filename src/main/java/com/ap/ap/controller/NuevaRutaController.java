package com.ap.ap.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NuevaRutaController {

    @RequestMapping("/api/madre")
    @ResponseBody
    String error(HttpServletRequest request) {
        return "<h1>Madre Mia Willy</h1>";
    }

}
