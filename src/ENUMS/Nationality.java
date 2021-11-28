package ENUMS;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public enum Nationality {
    POLISH("POLISH", new Locale("PL", "PL")),
    UKRAINIAN("UKRAINIAN", new Locale("UK", "UA")),
    BELORUSSIAN("BELORUSSIAN", new Locale("BE", "BY")),
    SLOVAK("SLOVAK", new Locale("SK", "SK")),
    LITHUANIAN("LITHUANIAN", new Locale("LT", "LT")),
    LATVIAN("LATVIAN", new Locale("LV", "LV")),
    BRITISH("BRITISH", Locale.UK),
    INDIAN("INDIAN", new Locale("EN", "IN")),
    CHINESE("CHINESE", Locale.CHINESE),
    VIETNAMESE("VIETNAMESE", new Locale("VI", "VN"));

    public final String country;
    public final Locale locale;

    private static final Map<String, Nationality> COUNTRY_NATIONALITY_MAP = new HashMap<>();
    private static final Map<Locale, Nationality> LOCALE_NATIONALITY_MAP = new HashMap<>();

    static {
        for (Nationality nationality : values()) {
            COUNTRY_NATIONALITY_MAP.put(nationality.country, nationality);
            LOCALE_NATIONALITY_MAP.put(nationality.locale, nationality);
        }
    }

    private Nationality(String country, Locale locale) {
        this.country = country;
        this.locale = locale;
    }

    public static Nationality getByCountry(String country){
        return COUNTRY_NATIONALITY_MAP.get(country);
    }

    public static Nationality getByLocale(Locale locale){
        return LOCALE_NATIONALITY_MAP.get(locale);
    }
    
    
    
}
