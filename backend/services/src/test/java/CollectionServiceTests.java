import org.artapp.domain.ArtCollection;
import org.artapp.services.CollectionService;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CollectionServiceTests {
    private final CollectionService collectionService = new CollectionService();

    CollectionServiceTests() throws SQLException {
    }
/*
    @Test
    void collectionSizeEmpty() {
        assertEquals(0, collectionService.numberOfArtwork(new ArtCollection()));
    }
*/
}
