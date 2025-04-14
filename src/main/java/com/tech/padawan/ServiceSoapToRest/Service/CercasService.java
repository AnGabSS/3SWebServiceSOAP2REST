package com.tech.padawan.ServiceSoapToRest.Service;

import com.tech.padawan.ServiceSoapToRest.Model.Cerca;
import com.tech.padawan.ServiceSoapToRest.Model.Posicao;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;



@Service
public class CercasService {
    private static final DateTimeFormatter DATE_TIME_FORMATTER =
            DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    private String path = "C:\\Users\\angelo.gabriel\\Documents\\ws-intellij\\3sServiceSoapToRest\\src\\main\\java\\com\\tech\\padawan\\ServiceSoapToRest\\Public\\cercas.xlsx";

    public CercasService(){};

    public List<Cerca> getCercas() throws IOException {
        List<Cerca> cercas = new ArrayList<>();
        FileInputStream file = new FileInputStream(path); // Substituir pelo caminho real
        Workbook workbook = new XSSFWorkbook(file);
        Sheet sheet = workbook.getSheetAt(0);

        // Pular o cabeçalho, se existir (começa do índice 1)
        boolean firstRow = true;

        for (Row row : sheet) {
            if (firstRow) {
                firstRow = false;
                continue;
            }

            Cerca cerca = new Cerca();

            try {
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
                // Log e continue caso tenha erro de parsing em alguma linha
                System.err.println("Erro ao processar linha " + row.getRowNum() + ": " + e.getMessage());
            }
        }

        workbook.close();
        file.close();

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