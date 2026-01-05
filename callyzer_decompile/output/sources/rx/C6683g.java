package rx;

import java.util.ListIterator;
import og.ag;
import qx.InterfaceC6378b;
import rw.AbstractC6662l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rx.g */
/* loaded from: classes3.dex */
public final class C6683g extends AbstractC6677a implements InterfaceC6378b {

    /* renamed from: b */
    public static final C6683g f31970b = new C6683g(new Object[0]);

    /* renamed from: a */
    public final Object[] f31971a;

    public C6683g(Object[] objArr) {
        this.f31971a = objArr;
    }

    @Override // rw.AbstractC6651a
    /* renamed from: b */
    public final int mo1628b() {
        return this.f31971a.length;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        ag.m10536a(i10, mo1628b());
        return this.f31971a[i10];
    }

    @Override // rw.AbstractC6654d, java.util.List
    public final int indexOf(Object obj) {
        return AbstractC6662l.m12698A(this.f31971a, obj);
    }

    @Override // rw.AbstractC6654d, java.util.List
    public final int lastIndexOf(Object obj) {
        return AbstractC6662l.m12704G(this.f31971a, obj);
    }

    @Override // rw.AbstractC6654d, java.util.List
    public final ListIterator listIterator(int i10) {
        Object[] objArr = this.f31971a;
        ag.m10537b(i10, objArr.length);
        return new C6678b(objArr, i10, objArr.length);
    }
}
