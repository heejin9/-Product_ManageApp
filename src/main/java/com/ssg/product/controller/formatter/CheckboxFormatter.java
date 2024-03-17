package com.ssg.product.controller.formatter;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

// 빈이긴 하지만 톰캣에서 넘어온 값을 저장해야 하기 때문에 servlet-contxer.xml에 빈으로 등록
public class CheckboxFormatter implements Formatter<Boolean> {

    @Override
    public Boolean parse(String text, Locale locale) throws ParseException {
        if (text == null) {
            return false;
        }
        return text.equals("on");
    }

    @Override
    public String print(Boolean object, Locale locale) {
        return object.toString();
    }
}

