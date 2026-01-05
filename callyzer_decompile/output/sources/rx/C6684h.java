package rx;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC4154l;
import o2.AbstractC5268a;
import og.re;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rx.h */
/* loaded from: classes3.dex */
public final class C6684h extends AbstractC5268a {

    /* renamed from: d */
    public int f31972d;

    /* renamed from: e */
    public Object[] f31973e;

    /* renamed from: f */
    public boolean f31974f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public C6684h(Object[] root, int i10, int i11, int i12) {
        super(i10, i11, 1);
        AbstractC4154l.m8923f(root, "root");
        this.f31972d = i12;
        Object[] objArr = new Object[i12];
        this.f31973e = objArr;
        ?? r52 = i10 == i11 ? 1 : 0;
        this.f31974f = r52;
        objArr[0] = root;
        m12822d(i10 - r52, 1);
    }

    /* renamed from: b */
    public final Object m12821b() {
        int i10 = this.f25900b & 31;
        Object obj = this.f31973e[this.f31972d - 1];
        AbstractC4154l.m8921d(obj, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return ((Object[]) obj)[i10];
    }

    /* renamed from: d */
    public final void m12822d(int i10, int i11) {
        int i12 = (this.f31972d - i11) * 5;
        while (i11 < this.f31972d) {
            Object[] objArr = this.f31973e;
            Object obj = objArr[i11 - 1];
            AbstractC4154l.m8921d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i11] = ((Object[]) obj)[re.m10879c(i10, i12)];
            i12 -= 5;
            i11++;
        }
    }

    /* renamed from: f */
    public final void m12823f(int i10) {
        int i11 = 0;
        while (re.m10879c(this.f25900b, i11) == i10) {
            i11 += 5;
        }
        if (i11 > 0) {
            m12822d(this.f25900b, ((this.f31972d - 1) - (i11 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objM12821b = m12821b();
        int i10 = this.f25900b + 1;
        this.f25900b = i10;
        if (i10 == this.f25901c) {
            this.f31974f = true;
            return objM12821b;
        }
        m12823f(0);
        return objM12821b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.f25900b--;
        if (this.f31974f) {
            this.f31974f = false;
            return m12821b();
        }
        m12823f(31);
        return m12821b();
    }
}
