package com.example.mybatis.controller;

import com.example.mybatis.dao.MybatisDAO;
import com.example.mybatis.dto.MybatisDTO;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

@RestController
@Slf4j
public class MybatisController {

    @Autowired
    private MybatisDAO dao;

    @GetMapping("hi")
    public String hi(@RequestParam int i) {
        dao.ret("d");
        return "zzzz";
    }

    @GetMapping("/download/{id}")
    public void download(HttpServletResponse response, @PathVariable("id") String id) throws IOException {
        Workbook wb = new XSSFWorkbook();
        Sheet sheet = wb.createSheet("첫번째 시트");

        System.out.println("id: " + id);


        Row row;
//        Cell cell;
        int rowNum = 0;

        // Header
        row = sheet.createRow(rowNum++);
        row.createCell(0).setCellValue("Mode");
        row.createCell(1).setCellValue("Affinity");
        row.createCell(2).setCellValue("lb");
        row.createCell(3).setCellValue("ub");
        row.createCell(4).setCellValue("purl");

        List<MybatisDTO> dtoList = dao.ret(id);
        System.out.println("dtoList " + dtoList.toString());


        // Body
        for (MybatisDTO iad : dtoList) {
            row = sheet.createRow(rowNum++);
            row.createCell(0).setCellValue(iad.getAddress());
            row.createCell(1).setCellValue(iad.getSeq());
            row.createCell(2).setCellValue(iad.getMbId());
            row.createCell(3).setCellValue(iad.getMbPw());
            row.createCell(4).setCellValue(iad.getMbTell());
        }

        // 컨텐츠 타입과 파일명 지정
        response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        response.setHeader("Content-Disposition", "attachment;filename=example.xls");

        // Excel File Output
        wb.write(response.getOutputStream());
        wb.close();
    }

    @PostMapping("/times")
    public void insertTime(@RequestBody HashMap<String, String> hashMap) {
        LocalDate date = LocalDate.now();

        log.info(date.toString());

        dao.insertTime(hashMap);

    }

}
