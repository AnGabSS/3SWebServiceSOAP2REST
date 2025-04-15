package com.tech.padawan.ServiceSoapToRest.Service;

import com.tech.padawan.ServiceSoapToRest.Model.Cerca;
import com.tech.padawan.ServiceSoapToRest.Model.Posicao;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;



@Service
public class CercasService {
    private static final DateTimeFormatter DATE_TIME_FORMATTER =
            DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    private final ResourceLoader resourceLoader;
    private final String filePath;

    public CercasService(ResourceLoader resourceLoader,
                         @Value("${cercas.file.path}") String filePath) {
        this.resourceLoader = resourceLoader;
        this.filePath = filePath;
    }


    public List<Cerca> getCercas() throws IOException {
        List<Cerca> cercas = new ArrayList<>();

        // Carrega o recurso a partir do classpath
        Resource resource = resourceLoader.getResource(filePath);
        try (InputStream file = resource.getInputStream();
             Workbook workbook = new XSSFWorkbook(file)) {

            Sheet sheet = workbook.getSheetAt(0);
            boolean firstRow = true;

            for (Row row : sheet) {
                if (firstRow) {
                    firstRow = false;
                    continue;
                }

                try {
                    Cerca cerca = new Cerca();
                    cerca.setFrota(getCellValueAsString(row.getCell(0)));
                    cerca.setPlaca(getCellValueAsString(row.getCell(1)));
                    cerca.setTempoNoStatus(getCellValueAsString(row.getCell(2)));
                    cerca.setStatus(getCellValueAsString(row.getCell(3)));
                    cerca.setDataAlteracaoStatus(parseDateTime(row.getCell(4)));
                    cerca.setBateria(getCellValueAsDouble(row.getCell(5)));
                    cerca.setLocal(getCellValueAsString(row.getCell(6)));
                    cerca.setUltimaComunicacao(parseDateTime(row.getCell(7)));
                    cerca.setEndereco(getCellValueAsString(row.getCell(8)));
                    cerca.setFrete(getCellValueAsDouble(row.getCell(9)));

                    cercas.add(cerca);
                } catch (Exception e) {
                    System.err.println("Erro ao processar linha " + row.getRowNum() + ": " + e.getMessage());
                }
            }
        }

        return cercas;
    }

// Métodos auxiliares para conversão de células

    private String getCellValueAsString(Cell cell) {
        if (cell == null) return null;

        switch (cell.getCellType()) {
            case STRING:
                return cell.getStringCellValue();
            case NUMERIC:
                return String.valueOf(cell.getNumericCellValue());
            case BOOLEAN:
                return String.valueOf(cell.getBooleanCellValue());
            case FORMULA:
                return cell.getCellFormula();
            default:
                return "";
        }
    }

    private Double getCellValueAsDouble(Cell cell) {
        if (cell == null) return null;

        if (cell.getCellType() == CellType.NUMERIC) {
            return cell.getNumericCellValue();
        } else if (cell.getCellType() == CellType.STRING) {
            try {
                return Double.parseDouble(cell.getStringCellValue());
            } catch (NumberFormatException e) {
                return null;
            }
        }

        return null;
    }

    private LocalDateTime parseDateTime(Cell cell) {
        if (cell == null) return null;

        if (cell.getCellType() == CellType.NUMERIC && DateUtil.isCellDateFormatted(cell)) {
            return cell.getLocalDateTimeCellValue();
        }

        if (cell.getCellType() == CellType.STRING) {
            try {
                return LocalDateTime.parse(cell.getStringCellValue(), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            } catch (Exception e) {
                return null;
            }
        }

        return null;
    }

    public String getLocalByEndereco(List<Cerca> cercas, Posicao posicao){
        for(Cerca cerca: cercas){
            String endereco = cerca.getEndereco();

            if(endereco.contains(posicao.getEndereco())
                    && endereco.contains(posicao.getBairro())
                    && endereco.contains(posicao.getCidade())
                    && endereco.contains(posicao.getUf())
                    && endereco.contains(posicao.getNumero())
            ){
                return cerca.getLocal();
            }
        }
        return "N/A";
    }
}