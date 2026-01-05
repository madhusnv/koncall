package og;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import ns.C5136b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class ya {
    /* renamed from: a */
    public static final LinkedHashMap m11063a(List list) {
        AbstractC4154l.m8923f(list, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            String str = ((C5136b) obj).f25147j;
            Object arrayList = linkedHashMap.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(str, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        return linkedHashMap;
    }

    /* renamed from: b */
    public static boolean m11064b(byte b10) {
        return b10 > -65;
    }
}
