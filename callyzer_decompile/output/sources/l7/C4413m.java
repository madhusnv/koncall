package l7;

import d7.b1;
import d7.w0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC4154l;
import og.d2;
import og.pd;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l7.m */
/* loaded from: classes.dex */
public final class C4413m extends w0 {

    /* renamed from: b */
    public final LinkedHashMap f22084b = new LinkedHashMap();

    @Override // d7.w0
    /* renamed from: d */
    public final void mo1209d() {
        LinkedHashMap linkedHashMap = this.f22084b;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((b1) it.next()).m5307a();
        }
        linkedHashMap.clear();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NavControllerViewModel{");
        int iIdentityHashCode = System.identityHashCode(this);
        d2.m10599b(16);
        sb2.append(pd.m10825c(16, iIdentityHashCode & 4294967295L));
        sb2.append("} ViewModelStores (");
        Iterator it = this.f22084b.keySet().iterator();
        while (it.hasNext()) {
            sb2.append((String) it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        String string = sb2.toString();
        AbstractC4154l.m8922e(string, "toString(...)");
        return string;
    }
}
