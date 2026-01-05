package og;

import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class e0 extends a0 {

    /* renamed from: e */
    public static final e0 f26386e = new e0(0, new Object[0]);

    /* renamed from: c */
    public final transient Object[] f26387c;

    /* renamed from: d */
    public final transient int f26388d;

    public e0(int i10, Object[] objArr) {
        this.f26387c = objArr;
        this.f26388d = i10;
    }

    @Override // og.a0, og.AbstractC5382w
    /* renamed from: a */
    public final int mo10520a(int i10, Object[] objArr) {
        Object[] objArr2 = this.f26387c;
        int i11 = this.f26388d;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }

    @Override // og.AbstractC5382w
    /* renamed from: b */
    public final int mo10616b() {
        return this.f26388d;
    }

    @Override // og.AbstractC5382w
    /* renamed from: c */
    public final int mo10617c() {
        return 0;
    }

    @Override // og.AbstractC5382w
    /* renamed from: e */
    public final Object[] mo10618e() {
        return this.f26387c;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        qa.m10846a(i10, this.f26388d);
        Object obj = this.f26387c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f26388d;
    }
}
