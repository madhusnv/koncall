package ge;

import fx.InterfaceC2395a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;
import qw.C6361k;
import rw.C6669s;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ge.n */
/* loaded from: classes.dex */
public final class C2582n implements Iterable, InterfaceC2395a {

    /* renamed from: b */
    public static final C2582n f14061b = new C2582n(C6669s.f31944a);

    /* renamed from: a */
    public final Map f14062a;

    public C2582n(Map map) {
        this.f14062a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2582n) {
            return AbstractC4154l.m8918a(this.f14062a, ((C2582n) obj).f14062a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14062a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Map map = this.f14062a;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (entry.getValue() != null) {
                throw new ClassCastException();
            }
            arrayList.add(new C6361k(str, null));
        }
        return arrayList.iterator();
    }

    public final String toString() {
        return "Parameters(entries=" + this.f14062a + ')';
    }
}
