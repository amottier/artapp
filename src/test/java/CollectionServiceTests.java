import org.artapp.ArtCollection;
import org.artapp.CollectionService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CollectionServiceTests {
    private final CollectionService collectionService = new CollectionService();

    @Test
    void collectionSizeEmpty() {
        assertEquals(0, collectionService.numberOfArtwork(new ArtCollection()));
    }

}
