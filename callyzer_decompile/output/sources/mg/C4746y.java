package mg;

import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mg.y */
/* loaded from: classes.dex */
public final class C4746y extends AbstractC4735n {

    /* renamed from: e */
    public static final C4746y f23712e = new C4746y(0, new Object[0]);

    /* renamed from: c */
    public final transient Object[] f23713c;

    /* renamed from: d */
    public final transient int f23714d;

    public C4746y(int i10, Object[] objArr) {
        this.f23713c = objArr;
        this.f23714d = i10;
    }

    @Override // mg.AbstractC4735n, mg.AbstractC4730i
    /* renamed from: a */
    public final int mo9588a(Object[] objArr) {
        Object[] objArr2 = this.f23713c;
        int i10 = this.f23714d;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override // mg.AbstractC4730i
    /* renamed from: b */
    public final int mo9589b() {
        return this.f23714d;
    }

    @Override // mg.AbstractC4730i
    /* renamed from: c */
    public final int mo9590c() {
        return 0;
    }

    @Override // mg.AbstractC4730i
    /* renamed from: g */
    public final Object[] mo9592g() {
        return this.f23713c;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC4723b.m9603e(i10, this.f23714d);
        Object obj = this.f23713c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f23714d;
    }
}
