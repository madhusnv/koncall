package ad;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4154l;
import rw.AbstractC6662l;
import rw.AbstractC6663m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ad.u */
/* loaded from: classes.dex */
public abstract class AbstractC0114u {

    /* renamed from: b */
    public static final Set f386b;

    /* renamed from: c */
    public static final C0110q f387c;

    /* renamed from: a */
    public final int f388a;

    static {
        int i10 = 0;
        Set setM12710M = AbstractC6662l.m12710M(new AbstractC0114u[]{C0112s.f384d, C0113t.f385d, C0111r.f383d});
        f386b = setM12710M;
        Iterator it = setM12710M.iterator();
        while (it.hasNext()) {
            i10 += ((AbstractC0114u) it.next()).f388a;
        }
        f387c = new C0110q(i10);
    }

    public AbstractC0114u(int i10) {
        this.f388a = i10;
    }

    /* renamed from: a */
    public final boolean m298a(AbstractC0114u item) {
        AbstractC4154l.m8923f(item, "item");
        return (item.f388a & this.f388a) != 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AbstractC0114u) {
            return this.f388a == ((AbstractC0114u) obj).f388a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f388a;
    }

    public String toString() {
        Set set = f386b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (m298a((AbstractC0114u) obj)) {
                arrayList.add(obj);
            }
        }
        return AbstractC6663m.m12748L(arrayList, "|", null, null, null, 62);
    }
}
