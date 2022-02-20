import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;

class MonopolyTest {
    Monopoly player = new Monopoly(0);

    @Test
    public void when_die_rolls_are_1_and_2_current_position_should_advance_to_3(){
        // WRITE CODE HERE
        Monopoly spiedPlayer = Mockito.spy(player);
        Mockito.when(spiedPlayer.throwDie()).thenReturn(1,2);
        assertEquals(3,spiedPlayer.advance());

    }
    @Test
    public void when_die_rolls_are_3_and_3_advance_should_be_called_again_and_when_1_and_3_are_rolled_current_position_should_be_updated_to_10(){
        // WRITE CODE HERE
        Monopoly spiedPlayer = Mockito.spy(player);
        Mockito.when(spiedPlayer.throwDie()).thenReturn(3,3,1,3);
        assertEquals(10,spiedPlayer.advance());

    }

}