package com.example.coffeestatus;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CoffeeMapper {
    int createStatusTable();
    int insertCoffeeOrderStatus(CoffeeStatusVO vo);
    List<CoffeeStatusVO> selectCoffeeOrderStatus();
}
