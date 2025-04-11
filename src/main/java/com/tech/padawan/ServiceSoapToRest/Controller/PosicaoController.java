package com.tech.padawan.ServiceSoapToRest.Controller;

import com.tech.padawan.ServiceSoapToRest.Model.Posicao;
import com.tech.padawan.ServiceSoapToRest.Service.SoapWrapperService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/posicao")
public class PosicaoController {

    private final SoapWrapperService soapService;

    public PosicaoController(SoapWrapperService soapService) {
        this.soapService = soapService;
    }

    @GetMapping("/{user}/{senha}")
    public ResponseEntity<List<Posicao>> listarUltimaPosicaoVeiculos(
            @PathVariable String user,
            @PathVariable String senha
    ) throws Exception {
        List<Posicao> result = soapService.getUltimaPosicaoVeiculos(user, senha);
        return ResponseEntity.ok(result);
    }
}
