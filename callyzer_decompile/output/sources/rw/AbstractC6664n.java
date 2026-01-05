package rw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4154l;
import og.pe;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rw.n */
/* loaded from: classes3.dex */
public abstract class AbstractC6664n extends pe {
    /* renamed from: r */
    public static int m12768r(Iterable iterable, int i10) {
        AbstractC4154l.m8923f(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i10;
    }

    /* renamed from: s */
    public static ArrayList m12769s(Iterable iterable) {
        AbstractC4154l.m8923f(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            AbstractC6663m.m12765x(arrayList, (Iterable) it.next());
        }
        return arrayList;
    }
}
