package k4;

import a2.AbstractC0030c;
import i0.m0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;
import rw.AbstractC6663m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: k4.r */
/* loaded from: classes.dex */
public final class C3997r {

    /* renamed from: a */
    public final ArrayList f20691a;

    public C3997r(InterfaceC3996q... interfaceC3996qArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (interfaceC3996qArr.length > 0) {
            InterfaceC3996q interfaceC3996q = interfaceC3996qArr[0];
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.size() != 1) {
                throw new IllegalArgumentException(AbstractC0030c.m123n(m0.m7383p("'", str, "' must be unique. Actual [ ["), AbstractC6663m.m12748L(list, null, null, null, null, 63), ']').toString());
            }
            AbstractC6663m.m12765x(arrayList, list);
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.f20691a = arrayList2;
        if (arrayList2.size() <= 0) {
            return;
        }
        arrayList2.get(0).getClass();
        throw new ClassCastException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3997r) {
            return AbstractC4154l.m8918a(this.f20691a, ((C3997r) obj).f20691a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20691a.hashCode();
    }
}
