package yh;

import java.util.AbstractMap;
import java.util.Objects;
import pg.s7;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yh.i */
/* loaded from: classes.dex */
public final class C8665i extends AbstractC8660d {

    /* renamed from: c */
    public final /* synthetic */ C8666j f41973c;

    public C8665i(C8666j c8666j) {
        this.f41973c = c8666j;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        C8666j c8666j = this.f41973c;
        s7.m11859b(i10, c8666j.f41976f);
        Object[] objArr = c8666j.f41975e;
        int i11 = i10 * 2;
        Object obj = objArr[i11];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i11 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f41973c.f41976f;
    }
}
