import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LightSaberTest {

    @Test
    public void isChargedByefault() {
        //setup
        LightSaber lightsaber = new LightSaber(1);
        //execution
        float expected = 100.0f;
        float actual = lightsaber.getCharge();

        //assertion
        assertEquals(expected, actual);
    }

    @Test
    public void isInstantiatedWithSerialNumber() {
        //setup
        LightSaber lightsaber = new LightSaber(1);
        //execution
        long expected = 1;
        long actual = lightsaber.getJediSerialNumber();

        //assertion
        assertEquals(expected, actual);
    }

    @Test
    public void isGreenByDefault() {
        //setup
        LightSaber lightsaber = new LightSaber(1);
        //execution
        String expected = "green";
        String actual = lightsaber.getColor();

        //assertion
        assertEquals(expected, actual);
    }

    @Test
    public void canSetCharge() {
        //setup
        LightSaber lightsaber = new LightSaber(1);
        //execution
        lightsaber.setCharge(50.0f);

        float expected = 50.0f;
        float actual = lightsaber.getCharge();

        //assertion
        assertEquals(expected, actual);
    }

    @Test
    public void canSetColor() {
        //setup
        LightSaber lightsaber = new LightSaber(1);
        //execution
        lightsaber.setColor("red");

        String expected = "red";
        String actual = lightsaber.getColor();

        //assertion
        assertEquals(expected, actual);
    }

    @Test
    public void remainingMinutesByDefaultIs300() {
        //setup
        LightSaber lightsaber = new LightSaber(1);
        //execution

        float expected = 300.0f;
        float actual = lightsaber.getRemainingMinutes();

        //assertion
        assertEquals(expected, actual);
    }

    @Test
    public void usingLightSaberDrainsTheCharge() {
        //setup
        LightSaber lightsaber = new LightSaber(1);
        //execution
        lightsaber.use(100.0f);

        float expected = 83.33333f;
        float actual = lightsaber.getCharge();

        //assertion
        assertEquals(expected, actual);
    }

    @Test
    public void usingLightSaberDrainsTheAvailableMinutes() {
        //setup
        LightSaber lightsaber = new LightSaber(1);
        //execution
        lightsaber.use(100.0f);

        float expected = 249.99998f;
        float actual = lightsaber.getRemainingMinutes();

        //assertion
        assertEquals(expected, actual);
    }

    @Test
    public void canBeRecharged() {
        //setup
        LightSaber lightsaber = new LightSaber(1);
        //execution
        lightsaber.use(100.0f);
        lightsaber.recharge();

        float expected = 100.0f;
        float actual = lightsaber.getCharge();

        //assertion
        assertEquals(expected, actual);
    }
}
