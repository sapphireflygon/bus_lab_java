import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {
    private BusStop busStop;
    private Person person;
    private Bus bus;

    @Before
    public void before() {
        bus = new Bus("HMP", 50);
        person = new Person();
        busStop = new BusStop("High Court");
    }

    @Test
    public void queueIsEmpty() {
        assertEquals(0, busStop.queueCount());
    }

    @Test
    public void addPersonToQueue() {
        busStop.addPerson(person);
        assertEquals(1, busStop.queueCount());
    }

    @Test
    public void canRemovePersonFromQueue() {
        busStop.addPerson(person);
        busStop.removePerson();
        assertEquals(0, busStop.queueCount());
    }
}
