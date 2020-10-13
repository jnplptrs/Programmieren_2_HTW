package Main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MeinArrayTest {

    /**
     * -----------------------------------------------------------------------------------------------------------------
     * a)
     * -----------------------------------------------------------------------------------------------------------------
     */

    /**
     * Fall 1:
     * Beide arrays sind gleich und nicht null
     * Expected Output: True
     */
    @Test
    public void istGleichFall1() {
        float[] a1 = new float[]{1000, 0.1f, -1000.1f};
        float[] a2 = new float[]{1000, 0.1f, -1000.1f};
        if (MeinArray.istGleich(a1,a2) == false){
            fail();
        }
    }

    /**
     * Fall 2:
     * Beide arrays sind null
     * Expected Output: True
     */
    @Test
    public void istGleichFall2() {
        float[] a1 = null;
        float[] a2 = null;
        if (MeinArray.istGleich(a1,a2) == false){
            fail();
        }
    }

    /**
     * Fall 3:
     * Beide arrays sind gleich groß enthalten aber nicht die gleichen Elemente
     * Expected Output: False
     */
    @Test
    public void istGleichFall3() {
        float[] a1 = new float[]{1000, 0.1f, -1000.1f};
        float[] a2 = new float[]{2000, 1.1f, -2000.2f};
        if (MeinArray.istGleich(a1,a2) == true){
            fail();
        }
    }

    /**
     * Fall 4:
     * Beide arrays sind gleich und nicht null
     * Expected Output: True
     */
    @Test
    public void istGleichFall4() {
        float[] a1 = new float[]{0.1f, -1000.1f, 1000};
        float[] a2 = new float[]{1000, 0.1f, -1000.1f};
        if (MeinArray.istGleich(a1,a2) == true){
            fail();
        }
    }

    /**
     * -----------------------------------------------------------------------------------------------------------------
     * b)
     * -----------------------------------------------------------------------------------------------------------------
     */

    /**
     * Fall 1:
     * Array hat das gleiche übergebene Element
     * Expected Output: Index des Elements im Array
     */
    @Test
    public void sucheElemFall1() {
        double elem = 6;
        double[] arr = new double[]{-6, -3, -1, 0, 1, 3, 5, 6, 10.1};
        if (MeinArray.sucheElem(elem, arr) == -1){
            fail();
        }
    }

    /**
     * Fall 2:
     * Array ist null
     * Expected Output: -1
     */
    @Test
    public void sucheElemFall2() {
        double elem = 6;
        double[] arr = null;
        if (MeinArray.sucheElem(elem, arr) != -1){
            fail();
        }
    }

    /**
     * Fall 3:
     * Array hat nicht das übergebene Element
     * Expected Output: -1
     */
    @Test
    public void sucheElemFall3() {
        double elem = 6;
        double[] arr = new double[]{-6, -3, -1, 0, 1, 3, 10.1};
        if (MeinArray.sucheElem(elem, arr) != -1){
            fail();
        }
    }

    /**
     * Fall 4:
     * Array hat nur das gewünschte Element
     * Expected Output: 0
     */
    @Test
    public void sucheElemFall4() {
        double elem = 6;
        double[] arr = new double[]{6};
        if (MeinArray.sucheElem(elem, arr) != 0){
            fail();
        }
    }

    /**
     * -----------------------------------------------------------------------------------------------------------------
     * b)
     * -----------------------------------------------------------------------------------------------------------------
     */

    /**
     * Fall 1:
     * Array beinhaltet bereits das Element
     * Expected Output: Zuvor übergebenes Array
     */
    @Test
    public void einfuegeSortiertFall1() {
        int elem = 6;
        int[] arr = new int[]{-6, -3, -1, 0, 1, 3, 6, 10};
        if (MeinArray.einfuegeSortiert(arr, elem) != arr){
            fail();
        }
    }

    /**
     * Fall 2:
     * Array besitzt bereits das Element
     * Expected Output: Zuvor übergebenes Array
     */
    @Test
    public void einfuegeSortiertFall2() {
        int elem = 6;
        int[] arr = new int[]{-6, -3, -1, 0, 1, 3, 10};
        int[] result = new int[]{-6, -3, -1, 0, 1, 3, 6, 10};
        if (MeinArray.istGleich(MeinArray.einfuegeSortiert(arr, elem), result) == false){
            fail();
        }
    }

    /**
     * Fall 3:
     * Array ist null
     * Expected Output: Neues Array mit null als einzigen 'Wert'
     */
    @Test
    public void einfuegeSortiertFall3() {
        int elem = 6;
        int[] arr = null;
        int[] result = new int[]{6};
        if (MeinArray.istGleich(MeinArray.einfuegeSortiert(arr, elem), result) == false){
            fail();
        }
    }

    /**
     * Fall 4:
     * Element befindet sich im Array
     * Expected Output: Neues sortiertes Array mit dem hinzugefügtem Element
     */
    @Test
    public void einfuegeSortiertFall4() {
        int elem = 6;
        int[] arr = new int[]{-6, -6, -3, -1, 0, 1, 1, 3, 3, 7, 10};
        int[] result = new int[]{-6, -6, -3, -1, 0, 1, 1, 3, 3, 6, 7, 10};
        if (MeinArray.istGleich(MeinArray.einfuegeSortiert(arr, elem), result) == false){
            fail();
        }
    }
}