package org;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductoDto {
    private String name;
    private Double price;
    private Integer cantidad;
    private Integer stock;
}