package d7;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class b1 {

    /* renamed from: a */
    public final LinkedHashMap f8072a = new LinkedHashMap();

    /* renamed from: a */
    public final void m5307a() {
        LinkedHashMap linkedHashMap = this.f8072a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((w0) it.next()).m5360b();
        }
        linkedHashMap.clear();
    }
}
