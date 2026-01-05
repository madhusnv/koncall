package i0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i0.p */
/* loaded from: classes.dex */
public final class C3085p extends AbstractC3084o {

    /* renamed from: a */
    public final ArrayList f16552a = new ArrayList();

    public C3085p(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC3084o abstractC3084o = (AbstractC3084o) it.next();
            if (!(abstractC3084o instanceof C3086q)) {
                this.f16552a.add(abstractC3084o);
            }
        }
    }

    @Override // i0.AbstractC3084o
    /* renamed from: a */
    public final void mo82a(int i10) {
        ArrayList arrayList = this.f16552a;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((AbstractC3084o) obj).mo82a(i10);
        }
    }

    @Override // i0.AbstractC3084o
    /* renamed from: b */
    public final void mo83b(int i10, InterfaceC3093x interfaceC3093x) {
        ArrayList arrayList = this.f16552a;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((AbstractC3084o) obj).mo83b(i10, interfaceC3093x);
        }
    }

    @Override // i0.AbstractC3084o
    /* renamed from: c */
    public final void mo84c(int i10, C3088s c3088s) {
        ArrayList arrayList = this.f16552a;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((AbstractC3084o) obj).mo84c(i10, c3088s);
        }
    }

    @Override // i0.AbstractC3084o
    /* renamed from: d */
    public final void mo2192d(int i10) {
        ArrayList arrayList = this.f16552a;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((AbstractC3084o) obj).mo2192d(i10);
        }
    }
}
