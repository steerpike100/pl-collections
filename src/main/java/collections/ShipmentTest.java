package collections;

import org.junit.jupiter.api.Test;

import static collections.ProductFixtures.door;
import static collections.ProductFixtures.window;
import static org.hamcrest.Matchers.*;

public class ShipmentTest {

    private Shipment shipment = new Shipment();

    @Test
    public void shouldAddItems(){
        shipment.add(door);
        shipment.add(window);

        assertThat(shipment, contains(ProductFixtures.door, window));

    }
    @Test
    public void shouldAddItems(){
        shipment.add(ProductFixtures.door);
        shipment.add(window);

        assertThat(shipment, contains(door, window));

    }

}
