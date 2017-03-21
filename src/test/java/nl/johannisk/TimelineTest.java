package nl.johannisk;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TimelineTest {
    private Timeline timeline;

    @Before
    public void setUp() {
        timeline = new Timeline();
    }

    @Test
    public void setFetchCount() {
        int expected = 5;
        timeline.setFetchCount( expected );
        int actual = timeline.getFetchCount();
        assertEquals( expected, actual );
    }

    @Test( expected = IllegalArgumentException.class )
    public void setFetchCountWithNonPositiveValue() {
        timeline.setFetchCount( 0 );
    }
}
