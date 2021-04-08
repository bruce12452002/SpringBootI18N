package bruce.home.i18n.controller;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class MyController {
    @Resource
    private MessageSource messageSource;

    @GetMapping(value = {"/test"})
    public String test() {
        System.out.println(LocaleContextHolder.getLocale());
        return messageSource.getMessage("language.name", null, LocaleContextHolder.getLocale());
    }
}
