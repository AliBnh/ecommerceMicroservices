package com.ali.ecommerce.handlers;


import java.util.Map;

public record ErrorResponse (
        Map<String,String> errors
){
}
