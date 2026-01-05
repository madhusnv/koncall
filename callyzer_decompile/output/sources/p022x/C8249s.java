package p022x;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k0.ExecutorC3900j;
import p020v.f0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: x.s */
/* loaded from: classes.dex */
public final class C8249s {

    /* renamed from: a */
    public final InterfaceC8248r f39395a;

    public C8249s(int i10, ArrayList arrayList, ExecutorC3900j executorC3900j, f0 f0Var) {
        if (Build.VERSION.SDK_INT < 28) {
            this.f39395a = new C8247q(i10, arrayList, executorC3900j, f0Var);
        } else {
            this.f39395a = new C8246p(i10, arrayList, executorC3900j, f0Var);
        }
    }

    /* renamed from: a */
    public static ArrayList m15429a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((OutputConfiguration) ((C8238h) it.next()).f39377a.mo15413c());
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8249s)) {
            return false;
        }
        return this.f39395a.equals(((C8249s) obj).f39395a);
    }

    public final int hashCode() {
        return this.f39395a.hashCode();
    }
}
