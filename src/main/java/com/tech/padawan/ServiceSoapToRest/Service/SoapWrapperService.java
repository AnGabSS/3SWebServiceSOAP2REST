package com.tech.padawan.ServiceSoapToRest.Service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.tech.padawan.ServiceSoapToRest.Model.Posicao;
import com.tech.padawan.ServiceSoapToRest.Model.Veiculo;
import com.tech.padawan.ServiceSoapToRest.Parser.PosicaoParser;
import com.tech.padawan.ServiceSoapToRest.Parser.VeiculoParser;
import com.tech.padawan.ServiceSoapToRest.wsdl.DataExport;
import com.tech.padawan.ServiceSoapToRest.wsdl.DataExportSoap;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class SoapWrapperService {
    DataExport service = new DataExport(); // classe gerada
    DataExportSoap port = service.getDataExportSoap();

    public List<Veiculo> getVeiculos(String login, String senha) throws Exception {
        String resultadoXml = port.listaVeiculos(login, senha);
        XmlMapper xmlMapper = new XmlMapper();
        JsonNode node = xmlMapper.readTree(resultadoXml.getBytes());
        JsonMapper jsonMapper = new JsonMapper();

        String json = jsonMapper.writeValueAsString(node);

        List<Veiculo> veiculos = VeiculoParser.parseVeiculos(json);

        return veiculos;
    }

    public List<Posicao> getUltimaPosicaoVeiculos(String login, String senha) throws Exception {
        String resultadoXml = port.listaUltimaPosicaoVeiculos(login, senha);
        XmlMapper xmlMapper = new XmlMapper();
        JsonNode node = xmlMapper.readTree(resultadoXml.getBytes());
        JsonMapper jsonMapper = new JsonMapper();
        String json = jsonMapper.writeValueAsString(node);
        List<Posicao> posicoes = PosicaoParser.parsePosicao(json);
        return posicoes;
    }
}
