package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.gms.internal.measurement.c */
/* loaded from: classes.dex */
public final class C1287c implements Iterator {

    /* renamed from: a */
    public final /* synthetic */ Iterator f6092a;

    /* renamed from: b */
    public final /* synthetic */ Iterator f6093b;

    public C1287c(C1288d c1288d, Iterator it, Iterator it2) {
        this.f6092a = it;
        this.f6093b = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f6092a.hasNext()) {
            return true;
        }
        return this.f6093b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Iterator it = this.f6092a;
        if (it.hasNext()) {
            return new C1301q(((Integer) it.next()).toString());
        }
        Iterator it2 = this.f6093b;
        if (it2.hasNext()) {
            return new C1301q((String) it2.next());
        }
        throw new NoSuchElementException();
    }
}
