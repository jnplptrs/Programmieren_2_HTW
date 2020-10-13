package Main;

public class MeinArray {
    /**
     * liefert true zurück, wenn beide übergebene Arrays identisch sind
     * @param a1
     *  erstes float Array
     * @param a2
     *  zweites float Array
     * @return
     *  liefert true, wenn Arrays identisch
     */
    public static boolean istGleich(float[] a1, float[] a2){
        if (a1 == null && a2 == null){
            return true;
        }
        if ((a1 == null) ^ (a2 == null)){
            return false;
        }
        for (int i = 0; i < a1.length; i++){
            if (a1[i] != a2[i]){
                return false;
            }
        }
        return true;
    }
    /**
     * -----------------------------------------------------------------------------------------------------------------
     * sucheElem mit @param als int
     * -----------------------------------------------------------------------------------------------------------------
     * liefert true zurück, wenn beide übergebene Arrays identisch sind
     * @param a1
     *  erstes float Array
     * @param a2
     *  zweites float Array
     * @return
     *  liefert true, wenn Arrays identisch
     */
    public static boolean istGleich(int[] a1, int[] a2){
        if (a1 == null && a2 == null){
            return true;
        }
        if ((a1 == null) ^ (a2 == null)){
            return false;
        }
        for (int i = 0; i < a1.length; i++){
            if (a1[i] != a2[i]){
                return false;
            }
        }
        return true;
    }

    /**
     * sucht nachdem Element elem im aufsteighend sortiertem Array durch binäre suche und liefert den Index von dem
     * gefunden Element zurück, wenn nicht gefunden dann wird -1 zurückgegeben
     * @param elem
     *  gescuhtes Element
     * @param arr
     *  übergebenes Array
     * @return
     *  -1 wenn Element elem nicht gefunden
     * @return
     *  Index von dem gescuhten Element elem
     */
    public static int sucheElem(double elem, double[] arr){
        if (arr == null){
            return -1;
        }
        int high = arr.length-1;
        int low = 0;
        int mid;
        //binäre suche
        while (low <= high){
            mid = (low + high) / 2;
            if (arr[mid] < elem){
                low = mid + 1;
            }else if (arr[mid] > elem){
                high = mid - 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
    /**
     * -----------------------------------------------------------------------------------------------------------------
     * sucheElem mit @param als int
     * -----------------------------------------------------------------------------------------------------------------
     * sucht nachdem Element elem im aufsteighend sortiertem Array durch binäre suche und liefert den Index von dem
     * gefunden Element zurück, wenn nicht gefunden dann wird -1 zurückgegeben
     * @param elem
     *  gescuhtes Element
     * @param arr
     *  übergebenes Array
     * @return
     *  -1 wenn Element elem nicht gefunden
     * @return
     *  Index von dem gescuhten Element elem
     */
    public static int sucheElem(int elem, int[] arr){
        if (arr == null){
            return -1;
        }
        int high = arr.length-1;
        int low = 0;
        int mid;
        //binäre suche
        while (low <= high){
            mid = (low + high) / 2;
            if (arr[mid] < elem){
                low = mid + 1;
            }else if (arr[mid] > elem){
                high = mid - 1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    /**
     * falls Element elem im
     * aufsteigend sortierten Array arr nicht vorhanden, fügt elem in arr ein und liefert erweiterte Array zurück
     * falls elem bereits in arr vorhanden wird das unveränderte Array zurückgeliefert
     * @param arr
     *  uebergebenes Array
     * @param elem
     *  einzufügendes Element
     * @return
     *  falls Element vorhanden, liefert unverändertes Array zurück
     * @return
     *  falls Element nicht vorhanden, liefert erweitertes Array zurück
     */
    public static int[] einfuegeSortiert(int[] arr, int elem){
        if (arr == null){
            return new int[]{elem};
        }
        boolean elemAdded = false;
        if (MeinArray.sucheElem(elem, arr) == -1){
            int[] newArr = new int[arr.length + 1];
            for (int i = 0; i < arr.length; i++){
                if (arr[i] < elem){
                    newArr[i] = arr[i];
                }else {
                    if (!elemAdded){
                        newArr[i] = elem;
                        elemAdded = true;
                    }
                    newArr[i + 1] = arr[i];
                }
            }
            return newArr;
        }
        return arr;
    }

}
