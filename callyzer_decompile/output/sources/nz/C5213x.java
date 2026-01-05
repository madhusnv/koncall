package nz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nz.x */
/* loaded from: classes3.dex */
public final class C5213x {

    /* renamed from: a */
    public final ArrayList f25423a;

    /* renamed from: b */
    public int f25424b;

    public C5213x() {
        this.f25423a = new ArrayList();
        this.f25424b = 128;
    }

    /* renamed from: a */
    public synchronized List m10207a() {
        return Collections.unmodifiableList(new ArrayList(this.f25423a));
    }

    /* renamed from: b */
    public synchronized boolean m10208b(List list) {
        this.f25423a.clear();
        int size = list.size();
        int i10 = this.f25424b;
        if (size <= i10) {
            return this.f25423a.addAll(list);
        }
        return this.f25423a.addAll(list.subList(0, i10));
    }

    public C5213x(ArrayList arrayList) {
        this.f25423a = arrayList;
    }
}
