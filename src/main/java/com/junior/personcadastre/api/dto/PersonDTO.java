package com.junior.personcadastre.api.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@ApiModel("PersonResponse")
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class PersonDTO extends ObjectBaseDTO {

    @ApiModelProperty(value = "Identificador único")
    private int personId;

    @ApiModelProperty(value = "Primeiro nome")
    private String firstName;

    @ApiModelProperty(value = "Último nome")
    private String lastName;

    @ApiModelProperty(value = "Idade da pessoa")
    private int personAge;
}