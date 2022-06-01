package ru.netology.i18n;

import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;

import static org.junit.jupiter.api.Assertions.*;

class LocalizationServiceImplTest {

    @Test
    void locateTest() {

        LocalizationService localizationService = new LocalizationServiceImpl();
        for (Country country : Country.values()) {
            String countryName = localizationService.locale(country);
            if (country.equals(Country.RUSSIA)) {
                assertEquals("Добро пожаловать", countryName);
            } else assertEquals("Welcome", countryName);

        }
    }
}