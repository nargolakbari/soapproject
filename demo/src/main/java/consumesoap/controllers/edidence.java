package consumesoap.controllers;

import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;

import java.time.format.FormatStyle;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.ResponseBody;

 @Controller

public class edidence {

    @GetMapping("/now")

    @ResponseBody

    public String now() {

        return "<strong>" + DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).format(LocalDateTime.now()) + "<strong>";

    }

}