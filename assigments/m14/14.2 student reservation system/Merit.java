
/**
 * Class for Merit.
 */
public class Merit {
    /**
     * Array to store all the students data.
     */
    private Student[] array;
    /**
     * To check how much data is added to the array.
     */
    private int size;
    /**
     * Constructs the object.
     */
    public Merit() {

    }
    /**
     * Constructs the object.
     *
     * @param      cap   The capacity
     */
    public Merit(final int cap) {
        array = new Student[cap];
        size = 0;
    }
    /**
     * Adds a student to the list.
     *Complexity 1
     * @param      stu   The stu
     */
    public void add(final Student stu) {
        array[size++] = stu;
    }
    /**
     * Returns the merit list
     * Complexity N
     * @return     { description_of_the_return_value }
     */
    public String meritlist() {
        Heap h = new Heap(array, size);
        array = h.sort();
        String s = "";
        for (int i = 0; i < size; i++) {
            s += array[i].toString() + "\n";
        }
        return s.substring(0, s.length() - 1);
    }
    /**
     * Allocates the vacencyancies according to the reqirement.
     * Complexity O(N^2)
     * @param      vacency    The vacency
     * @param      urvacency  The urvacency
     * @param      bcvacency  The bcvacency
     * @param      scvacency  The scvacency
     * @param      stvacency  The stvacency
     */
    public String allocation(final int vacency, final int urvacency, final int bcvacency, final int scvacency, final int stvacency) {
        int n = vacency;
        int count = 0;
        int bcres = bcvacency;
        int scres = scvacency;
        int stres = stvacency;
        Student[] allocated = new Student[n];
        if (urvacency > 0) {
            for (int j = 0; j < urvacency; j++) {
                allocated[count] = array[count];
                array[count].setAllocation(true);
                count++;
                n--;
            }
        }
        for (int i = count; i < size; i++) {
            if (bcres > 0) {
                if (!(array[i].getAllocation())
                        && array[i].getCat().equals("BC")) {
                    allocated[count++] = array[i];
                    array[i].setAllocation(true);
                    bcres--;
                    n--;
                }
            }
            if (scres > 0) {
                if (!(array[i].getAllocation())
                        && array[i].getCat().equals("SC")) {
                    allocated[count++] = array[i];
                    array[i].setAllocation(true);
                    scres--;
                    n--;
                }
            }
            if (stres > 0) {
                if (!(array[i].getAllocation())
                        && array[i].getCat().equals("ST")) {
                    allocated[count++] = array[i];
                    array[i].setAllocation(true);
                    stres--;
                    n--;
                }
            }
        }
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < size; j++) {
                    if (!(array[j].getAllocation())) {
                        allocated[count++] = array[j];
                        array[j].setAllocation(true);
                        break;
                    }
                }
            }
        }
        Heap h = new Heap(allocated, count);
        allocated = h.sort();
        String s = "";
        for (int k = 0; k < count; k++) {
            s += allocated[k].toString() + "\n";
        }
        return s.substring(0, s.length() - 1);
    }
}