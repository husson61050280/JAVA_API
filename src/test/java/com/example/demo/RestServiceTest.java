package com.example.demo;

import com.example.demo.ProvinceAPI.All;
import com.example.demo.ProvinceAPI.Field;
import com.example.demo.ProvinceAPI.Record;
import com.example.demo.ProvinceAPI.Result;
import com.example.demo.Service.RestService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.boot.web.client.RestTemplateBuilder;

import java.io.IOException;

public class RestServiceTest {

    private static Logger logger = LogManager.getLogger(RestServiceTest.class);

    @Test
    public void testCallGetPeopleAsObject() throws IOException, InterruptedException {
        RestService restService = new RestService(new RestTemplateBuilder());
        All all = restService.getProvincesObject();
        logger.info("help: {}", all.getHelp());
        logger.info("success: {}", all.isSuccess());
        Result result = all.getResult();
        logger.info("include_total: {}", result.isIncludeTotal());
        logger.info("resource_id: {}", result.getResourceId());
        result.getFields().stream().forEach((f) -> logField(f));
        logger.info("records_format: {}", result.getRecordsFormat());
        result.getRecords().stream().forEach((r) -> logRecord(r));
        logger.info("limit: {}", result.getLimit());
        logger.info("start link: {}", result.getLinks().getStart());
        logger.info("next link: {}", result.getLinks().getNext());
        logger.info("total: {}", result.getTotal());
    }

    private void logField(Field field){
        logger.info("field: {} ({})", field.getId(), field.getType());
    }

    private void logRecord(Record record){
        logger.info("records id: {}, province_id: {}, province_name:{}, locattion: ({},{})", record.getId(), record.getProvinceId(), record.getProvinceName(), record.getLat(), record.getLng());
    }

}
