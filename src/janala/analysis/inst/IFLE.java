/*
 * Author: Koushik Sen (ksen@cs.berkeley.edu)
 */

package janala.analysis.inst;

public class IFLE extends Instruction {
    int label;

    public IFLE(int iid, int mid, int label) {
        super(iid, mid);
        this.label = label;
    }

    @Override
    public String toString() {
        return "IFLE iid="+iid+" mid="+mid+" label="+label;
    }
}