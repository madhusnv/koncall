package ng;

import java.util.AbstractMap;
import java.util.Objects;
import og.w1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ng.h */
/* loaded from: classes.dex */
public final class C5057h extends AbstractC5053d {

    /* renamed from: c */
    public final /* synthetic */ C5058i f24839c;

    public C5057h(C5058i c5058i) {
        this.f24839c = c5058i;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        C5058i c5058i = this.f24839c;
        w1.m11022b(i10, c5058i.f24842e);
        Object[] objArr = c5058i.f24841d;
        int i11 = i10 + i10;
        Object obj = objArr[i11];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i11 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f24839c.f24842e;
    }
}
