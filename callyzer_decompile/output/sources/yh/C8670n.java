package yh;

import java.util.Iterator;
import pg.n8;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yh.n */
/* loaded from: classes.dex */
public final class C8670n extends AbstractC8662f {

    /* renamed from: j */
    public static final Object[] f41989j;

    /* renamed from: k */
    public static final C8670n f41990k;

    /* renamed from: d */
    public final transient Object[] f41991d;

    /* renamed from: e */
    public final transient int f41992e;

    /* renamed from: f */
    public final transient Object[] f41993f;

    /* renamed from: g */
    public final transient int f41994g;

    /* renamed from: h */
    public final transient int f41995h;

    static {
        Object[] objArr = new Object[0];
        f41989j = objArr;
        f41990k = new C8670n(0, 0, 0, objArr, objArr);
    }

    public C8670n(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        this.f41991d = objArr;
        this.f41992e = i10;
        this.f41993f = objArr2;
        this.f41994g = i11;
        this.f41995h = i12;
    }

    @Override // yh.AbstractC8657a
    /* renamed from: a */
    public final int mo15993a(Object[] objArr) {
        Object[] objArr2 = this.f41991d;
        int i10 = this.f41995h;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override // yh.AbstractC8657a
    /* renamed from: b */
    public final Object[] mo15994b() {
        return this.f41991d;
    }

    @Override // yh.AbstractC8657a
    /* renamed from: c */
    public final int mo15995c() {
        return this.f41995h;
    }

    @Override // yh.AbstractC8657a, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f41993f;
            if (objArr.length != 0) {
                int iM11802a = n8.m11802a(obj.hashCode());
                while (true) {
                    int i10 = iM11802a & this.f41994g;
                    Object obj2 = objArr[i10];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iM11802a = i10 + 1;
                }
            }
        }
        return false;
    }

    @Override // yh.AbstractC8657a
    /* renamed from: e */
    public final int mo15996e() {
        return 0;
    }

    @Override // yh.AbstractC8657a
    /* renamed from: g */
    public final boolean mo15997g() {
        return false;
    }

    @Override // yh.AbstractC8662f, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f41992e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return mo16005h().listIterator(0);
    }

    @Override // yh.AbstractC8662f
    /* renamed from: m */
    public final AbstractC8660d mo16006m() {
        return AbstractC8660d.m16000h(this.f41995h, this.f41991d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f41995h;
    }
}
