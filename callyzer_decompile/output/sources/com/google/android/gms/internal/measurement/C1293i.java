package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.gms.internal.measurement.i */
/* loaded from: classes.dex */
public final class C1293i implements Iterator {

    /* renamed from: a */
    public final /* synthetic */ Iterator f6239a;

    public C1293i(Iterator it) {
        this.f6239a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6239a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new C1301q((String) this.f6239a.next());
    }
}
