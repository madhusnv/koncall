package ng;

import java.util.Objects;
import og.w1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ng.g */
/* loaded from: classes.dex */
public final class C5056g extends AbstractC5053d {

    /* renamed from: e */
    public static final C5056g f24836e = new C5056g(0, new Object[0]);

    /* renamed from: c */
    public final transient Object[] f24837c;

    /* renamed from: d */
    public final transient int f24838d;

    public C5056g(int i10, Object[] objArr) {
        this.f24837c = objArr;
        this.f24838d = i10;
    }

    @Override // ng.AbstractC5053d, ng.AbstractC5050a
    /* renamed from: a */
    public final int mo9987a(Object[] objArr) {
        Object[] objArr2 = this.f24837c;
        int i10 = this.f24838d;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override // ng.AbstractC5050a
    /* renamed from: b */
    public final int mo9988b() {
        return this.f24838d;
    }

    @Override // ng.AbstractC5050a
    /* renamed from: c */
    public final int mo9989c() {
        return 0;
    }

    @Override // ng.AbstractC5050a
    /* renamed from: e */
    public final Object[] mo9990e() {
        return this.f24837c;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        w1.m11022b(i10, this.f24838d);
        Object obj = this.f24837c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f24838d;
    }
}
