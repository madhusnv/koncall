package rx;

import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC4154l;
import og.ag;
import og.re;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rx.c */
/* loaded from: classes3.dex */
public final class C6679c extends AbstractC6677a {

    /* renamed from: a */
    public final Object[] f31954a;

    /* renamed from: b */
    public final Object[] f31955b;

    /* renamed from: c */
    public final int f31956c;

    /* renamed from: d */
    public final int f31957d;

    public C6679c(Object[] root, Object[] tail, int i10, int i11) {
        AbstractC4154l.m8923f(root, "root");
        AbstractC4154l.m8923f(tail, "tail");
        this.f31954a = root;
        this.f31955b = tail;
        this.f31956c = i10;
        this.f31957d = i11;
        if (mo1628b() > 32) {
            return;
        }
        throw new IllegalArgumentException(("Trie-based persistent vector should have at least 33 elements, got " + mo1628b()).toString());
    }

    @Override // rw.AbstractC6651a
    /* renamed from: b */
    public final int mo1628b() {
        return this.f31956c;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        Object[] objArr;
        int i11 = this.f31956c;
        ag.m10536a(i10, i11);
        if (((i11 - 1) & (-32)) <= i10) {
            objArr = this.f31955b;
        } else {
            objArr = this.f31954a;
            for (int i12 = this.f31957d; i12 > 0; i12 -= 5) {
                Object obj = objArr[re.m10879c(i10, i12)];
                AbstractC4154l.m8921d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i10 & 31];
    }

    @Override // rw.AbstractC6654d, java.util.List
    public final ListIterator listIterator(int i10) {
        ag.m10537b(i10, this.f31956c);
        return new C6681e(i10, this.f31956c, (this.f31957d / 5) + 1, this.f31954a, this.f31955b);
    }
}
