package com.example.coffeestatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CoffeeStatusVO {
    private String ordernumber;
    private String coffeename;
    private int number;
    private String customername;
}
