package com.tech.padawan.ServiceSoapToRest.Controller;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.tech.padawan.ServiceSoapToRest.Model.UserLogin;
import com.tech.padawan.ServiceSoapToRest.Model.Veiculo;
import com.tech.padawan.ServiceSoapToRest.Service.SoapWrapperService;
import org.apache.tomcat.util.json.ParseException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/veiculos")
public class VeiculoController {


    private final SoapWrapperService soapService;

    public VeiculoController(SoapWrapperService soapService) {
        this.soapService = soapService;
    }

    @GetMapping("/{login}/{senha}")
    public ResponseEntity<List<Veiculo>> consultarEstoque(
            @PathVariable String login,
            @PathVariable String senha) throws Exception {

        List<Veiculo> response = soapService.getVeiculos(login, senha);


        return ResponseEntity.ok(response);
    }

}
