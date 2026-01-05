package p001o;

import android.util.SparseArray;
import java.util.HashMap;

/* loaded from: classes5.dex */
public abstract class iid {

    /* renamed from: a */
    public static SparseArray f28728a = new SparseArray();

    /* renamed from: b */
    public static HashMap f28729b;

    static {
        HashMap map = new HashMap();
        f28729b = map;
        map.put(fid.DEFAULT, 0);
        f28729b.put(fid.VERY_LOW, 1);
        f28729b.put(fid.HIGHEST, 2);
        for (fid fidVar : f28729b.keySet()) {
            f28728a.append(((Integer) f28729b.get(fidVar)).intValue(), fidVar);
        }
    }

    /* renamed from: a */
    public static int m32179a(fid fidVar) {
        Integer num = (Integer) f28729b.get(fidVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + fidVar);
    }

    /* renamed from: b */
    public static fid m32180b(int i) {
        fid fidVar = (fid) f28728a.get(i);
        if (fidVar != null) {
            return fidVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i);
    }
}
