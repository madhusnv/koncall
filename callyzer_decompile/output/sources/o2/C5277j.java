package o2;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC4154l;
import og.ja;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o2.j */
/* loaded from: classes.dex */
public final class C5277j extends AbstractC5268a {

    /* renamed from: d */
    public int f25926d;

    /* renamed from: e */
    public Object[] f25927e;

    /* renamed from: f */
    public boolean f25928f;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public C5277j(Object[] objArr, int i10, int i11, int i12) {
        super(i10, i11, 0);
        this.f25926d = i12;
        Object[] objArr2 = new Object[i12];
        this.f25927e = objArr2;
        ?? r52 = i10 == i11 ? 1 : 0;
        this.f25928f = r52;
        objArr2[0] = objArr;
        m10426d(i10 - r52, 1);
    }

    /* renamed from: b */
    public final Object m10425b() {
        int i10 = this.f25900b & 31;
        Object obj = this.f25927e[this.f25926d - 1];
        AbstractC4154l.m8921d(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return ((Object[]) obj)[i10];
    }

    /* renamed from: d */
    public final void m10426d(int i10, int i11) {
        int i12 = (this.f25926d - i11) * 5;
        while (i11 < this.f25926d) {
            Object[] objArr = this.f25927e;
            Object obj = objArr[i11 - 1];
            AbstractC4154l.m8921d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i11] = ((Object[]) obj)[ja.m10707b(i10, i12)];
            i12 -= 5;
            i11++;
        }
    }

    /* renamed from: f */
    public final void m10427f(int i10) {
        int i11 = 0;
        while (ja.m10707b(this.f25900b, i11) == i10) {
            i11 += 5;
        }
        if (i11 > 0) {
            m10426d(this.f25900b, ((this.f25926d - 1) - (i11 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objM10425b = m10425b();
        int i10 = this.f25900b + 1;
        this.f25900b = i10;
        if (i10 == this.f25901c) {
            this.f25928f = true;
            return objM10425b;
        }
        m10427f(0);
        return objM10425b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.f25900b--;
        if (this.f25928f) {
            this.f25928f = false;
            return m10425b();
        }
        m10427f(31);
        return m10425b();
    }
}
