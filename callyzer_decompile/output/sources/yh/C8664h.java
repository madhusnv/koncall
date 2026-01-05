package yh;

import java.util.Objects;
import pg.s7;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yh.h */
/* loaded from: classes.dex */
public final class C8664h extends AbstractC8660d {

    /* renamed from: e */
    public static final C8664h f41970e = new C8664h(0, new Object[0]);

    /* renamed from: c */
    public final transient Object[] f41971c;

    /* renamed from: d */
    public final transient int f41972d;

    public C8664h(int i10, Object[] objArr) {
        this.f41971c = objArr;
        this.f41972d = i10;
    }

    @Override // yh.AbstractC8660d, yh.AbstractC8657a
    /* renamed from: a */
    public final int mo15993a(Object[] objArr) {
        Object[] objArr2 = this.f41971c;
        int i10 = this.f41972d;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override // yh.AbstractC8657a
    /* renamed from: b */
    public final Object[] mo15994b() {
        return this.f41971c;
    }

    @Override // yh.AbstractC8657a
    /* renamed from: c */
    public final int mo15995c() {
        return this.f41972d;
    }

    @Override // yh.AbstractC8657a
    /* renamed from: e */
    public final int mo15996e() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        s7.m11859b(i10, this.f41972d);
        Object obj = this.f41971c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f41972d;
    }
}
