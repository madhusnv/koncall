package mg;

import java.util.Iterator;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mg.z */
/* loaded from: classes.dex */
public final class C4747z extends AbstractC4737p {

    /* renamed from: j */
    public static final Object[] f23716j;

    /* renamed from: k */
    public static final C4747z f23717k;

    /* renamed from: d */
    public final transient Object[] f23718d;

    /* renamed from: e */
    public final transient int f23719e;

    /* renamed from: f */
    public final transient Object[] f23720f;

    /* renamed from: g */
    public final transient int f23721g;

    /* renamed from: h */
    public final transient int f23722h;

    static {
        Object[] objArr = new Object[0];
        f23716j = objArr;
        f23717k = new C4747z(0, 0, 0, objArr, objArr);
    }

    public C4747z(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        this.f23718d = objArr;
        this.f23719e = i10;
        this.f23720f = objArr2;
        this.f23721g = i11;
        this.f23722h = i12;
    }

    @Override // mg.AbstractC4730i
    /* renamed from: a */
    public final int mo9588a(Object[] objArr) {
        Object[] objArr2 = this.f23718d;
        int i10 = this.f23722h;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override // mg.AbstractC4730i
    /* renamed from: b */
    public final int mo9589b() {
        return this.f23722h;
    }

    @Override // mg.AbstractC4730i
    /* renamed from: c */
    public final int mo9590c() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        Object[] objArr = this.f23720f;
        if (objArr.length == 0) {
            return false;
        }
        int iRotateLeft = (int) (Integer.rotateLeft((int) (obj.hashCode() * (-862048943)), 15) * 461845907);
        while (true) {
            int i10 = iRotateLeft & this.f23721g;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iRotateLeft = i10 + 1;
        }
    }

    @Override // mg.AbstractC4730i
    /* renamed from: e */
    public final e0 mo9591e() {
        return mo9593k().listIterator(0);
    }

    @Override // mg.AbstractC4730i
    /* renamed from: g */
    public final Object[] mo9592g() {
        return this.f23718d;
    }

    @Override // mg.AbstractC4737p, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f23719e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return mo9593k().listIterator(0);
    }

    @Override // mg.AbstractC4737p
    /* renamed from: m */
    public final AbstractC4735n mo9634m() {
        return AbstractC4735n.m9626k(this.f23722h, this.f23718d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f23722h;
    }
}
