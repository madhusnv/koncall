package og;

import hd.EnumC2908t;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class wd {
    /* renamed from: a */
    public static final void m11033a(List list, EnumC2908t enumC2908t) {
        AbstractC4154l.m8923f(list, "<this>");
        if (!list.isEmpty()) {
            list.remove(pe.m10832g(list));
        }
        list.add(enumC2908t);
    }

    /* renamed from: b */
    public static final Object m11034b(List list) {
        AbstractC4154l.m8923f(list, "<this>");
        return list.get(list.size() - 1);
    }
}
