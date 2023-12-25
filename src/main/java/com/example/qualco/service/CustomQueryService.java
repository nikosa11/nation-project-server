package com.example.qualco.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.example.qualco.model.CountryStatModel;
import com.example.qualco.model.ResultRatioModel;
@Service
public class CustomQueryService {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public CustomQueryService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<ResultRatioModel> executeCustomQuery() {
        String customQuery = "SELECT c.name, c.country_code3, cs.year, cs.population, cs.gdp " +
                "FROM countries c " +
                "JOIN (SELECT country_id, year, population, gdp, " +
                "       RANK() OVER (PARTITION BY country_id ORDER BY gdp / population DESC) AS rnk " +
                "      FROM country_stats) cs " +
                "ON c.country_id = cs.country_id AND cs.rnk = 1";

        List<ResultRatioModel> resultList = jdbcTemplate.query(customQuery, (rs, rowNum) -> {
            ResultRatioModel resultModel = new ResultRatioModel();
            resultModel.setName(rs.getString("name"));
            resultModel.setCountryCode3(rs.getString("country_code3"));
            resultModel.setYear(rs.getInt("year"));
            resultModel.setPopulation(rs.getDouble("population"));
            resultModel.setGdp(rs.getDouble("gdp"));
            return resultModel;
        });
        return resultList;
    }
    
    public List<CountryStatModel> executeCustomQueryForCountryStats() {
        String customQuery = "SELECT c.name AS country_name, r.name AS region_name, cn.name AS continent_name, cs.year, cs.population, cs.gdp " +
                "FROM country_stats cs " +
                "JOIN countries c ON cs.country_id = c.country_id " +
                "JOIN regions r ON c.region_id = r.region_id " +
                "JOIN continents cn ON r.continent_id = cn.continent_id";
        List<CountryStatModel> resultList = jdbcTemplate.query(customQuery, (rs, rowNum) -> {
            CountryStatModel resultModel = new CountryStatModel();
            resultModel.setCountryName(rs.getString("country_name"));
            resultModel.setRegionName(rs.getString("region_name"));
            resultModel.setContinentName(rs.getString("continent_name"));
            resultModel.setYear(rs.getInt("year"));
            resultModel.setPopulation(rs.getDouble("population"));
            resultModel.setGdp(rs.getDouble("gdp"));
            return resultModel;
        });
        return resultList;
    }

}
