package yh;

import java.util.Objects;
import pg.s7;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yh.l */
/* loaded from: classes.dex */
public final class C8668l extends AbstractC8660d {

    /* renamed from: c */
    public final transient Object[] f41979c;

    /* renamed from: d */
    public final transient int f41980d;

    /* renamed from: e */
    public final transient int f41981e;

    public C8668l(Object[] objArr, int i10, int i11) {
        this.f41979c = objArr;
        this.f41980d = i10;
        this.f41981e = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        s7.m11859b(i10, this.f41981e);
        Object obj = this.f41979c[(i10 * 2) + this.f41980d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f41981e;
    }
}
