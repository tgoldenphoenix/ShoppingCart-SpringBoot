package com.dailycodework.dreamshops.dto;

import lombok.Data;

@Data
public class ImageDto {
    private Long id;
    private String fileName;
    private String downloadUrl;

    // no fileName, blob, product
}
