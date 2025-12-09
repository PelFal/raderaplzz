package systementor.cidemo1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.when;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
public class CountryServiceTest {
    @Mock
    CountryApiClient ApiClient;

    @InjectMocks
    CountryService countryService;

    private static final Country LATVIA = new Country(
            "Latvia",
            "Republic of Latvia",
            "Latvija",
            "Latvijas Republikas",
            "Riga",
            "Europe",
            "Northern Europe",
            Map.of(
                    "lav", "Latvian",
                    "eng", "English"
            ),
            List.of("EST", "LTU", "RUS", "BLR"),
            1829000,
            64559.0,
            "https://goo.gl/maps/iQpUkH7ghq31ZtXe9"
    );

    @Test
    void getSortedLaungagesReturnsAlphabeticallySortedLangues() {
        CountryApiClient CountryApiClient;
        when(ApiClient.fetchCountryByName("Latvia"))
            .thenReturn(LATVIA);

        var result = countryService.getSortedBorders("Latvia");

        assertEquals(List.of("English", "Latvian"), result);
    }
    @Test
    void getSortedLaungagesReturnsAlphabeticallySortedLangues() {
        CountryApiClient CountryApiClient;
        when(ApiClient.fetchCountryByName("Latvia"))
                .thenReturn(LATVIA);

        var result = countryService.getSortedBorders("Latvia");

        assertEquals(List.of("English", "Latvian"), result);
    }
}
