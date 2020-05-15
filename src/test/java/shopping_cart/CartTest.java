package shopping_cart;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CartTest {

    @Test
    public void ShouldAddItemAfterUserInput() {
        Cart underTest = new Cart();
        Item itemTest = new Item("Ball", 1, 10);
        underTest.addItem(itemTest);
        int check = underTest.getTotalItems();
        assertEquals(1, check);
    }

    @Test
    public void ShouldRemoveItemAfterNameGiven() {
        Cart underTest = new Cart();
        Item itemTest = new Item("Ball", 1, 10);
        underTest.removeItem(itemTest);
        int check = underTest.getTotalItems();
        assertEquals(0, check);
    }
}
