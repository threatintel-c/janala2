/*
 * Author: Koushik Sen (ksen@cs.berkeley.edu)
 */

package janala.analysis.inst;

public class FALOAD extends Instruction {
    public FALOAD(int iid, int mid) {
        super(iid, mid);
    }

    @Override
    public String toString() {
        return "FALOAD iid="+iid+" mid="+mid;
    }
}