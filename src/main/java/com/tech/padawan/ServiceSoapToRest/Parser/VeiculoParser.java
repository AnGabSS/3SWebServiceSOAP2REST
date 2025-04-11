package com.tech.padawan.ServiceSoapToRest.Parser;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tech.padawan.ServiceSoapToRest.Model.Veiculo;

import java.util.List;

public class VeiculoParser {

    public static List<Veiculo> parseVeiculos(String json) throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        // Converte o JSON em árvore
        JsonNode rootNode = mapper.readTree(json);

        // Acessa o array "tbVeiculo"
        JsonNode tbVeiculoNode = rootNode.get("tbVeiculo");

        // Converte o array em uma lista de objetos Veiculo
        return mapper.readValue(tbVeiculoNode.toString(), new TypeReference<List<Veiculo>>() {});
    }
}
