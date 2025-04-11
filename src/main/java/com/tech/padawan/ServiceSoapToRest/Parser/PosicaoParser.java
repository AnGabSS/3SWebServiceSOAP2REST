package com.tech.padawan.ServiceSoapToRest.Parser;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tech.padawan.ServiceSoapToRest.Model.Posicao;
import com.tech.padawan.ServiceSoapToRest.Model.Veiculo;

import java.util.List;

public class PosicaoParser {

    public static List<Posicao> parsePosicao(String json) throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        JsonNode rootNode = mapper.readTree(json);

        JsonNode tbPosicaoNode = rootNode.get("tbPosicao");

        return mapper.readValue(tbPosicaoNode.toString(), new TypeReference<List<Posicao>>() {});
    }
}
