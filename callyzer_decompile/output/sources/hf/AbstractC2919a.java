package hf;

import android.util.SparseArray;
import java.util.HashMap;
import mm.AbstractC4801l;
import ue.EnumC7422d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hf.a */
/* loaded from: classes.dex */
public abstract class AbstractC2919a {

    /* renamed from: a */
    public static final SparseArray f15950a = new SparseArray();

    /* renamed from: b */
    public static final HashMap f15951b;

    static {
        HashMap map = new HashMap();
        f15951b = map;
        map.put(EnumC7422d.DEFAULT, 0);
        map.put(EnumC7422d.VERY_LOW, 1);
        map.put(EnumC7422d.HIGHEST, 2);
        for (EnumC7422d enumC7422d : map.keySet()) {
            f15950a.append(((Integer) f15951b.get(enumC7422d)).intValue(), enumC7422d);
        }
    }

    /* renamed from: a */
    public static int m7025a(EnumC7422d enumC7422d) {
        Integer num = (Integer) f15951b.get(enumC7422d);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + enumC7422d);
    }

    /* renamed from: b */
    public static EnumC7422d m7026b(int i10) {
        EnumC7422d enumC7422d = (EnumC7422d) f15950a.get(i10);
        if (enumC7422d != null) {
            return enumC7422d;
        }
        throw new IllegalArgumentException(AbstractC4801l.m9730d(i10, "Unknown Priority for value "));
    }
}
