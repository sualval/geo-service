package ru.netology.geo;

import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;

import static org.junit.jupiter.api.Assertions.*;

class GeoServiceImplTest {


    @Test
    void byIpTest() {
        GeoService geoService = new GeoServiceImpl();
        assertEquals(Country.RUSSIA, geoService.byIp("172.0.32.11").getCountry());
        assertEquals(Country.USA, geoService.byIp("96.23.43.56").getCountry());
        assertNull(geoService.byIp(""));
    }
}