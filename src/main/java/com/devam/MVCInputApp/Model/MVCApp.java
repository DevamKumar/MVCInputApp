package com.devam.MVCInputApp.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor


public class MVCApp {
    @Id
    private Integer id;
    private String Name;
    private String Address;
}
