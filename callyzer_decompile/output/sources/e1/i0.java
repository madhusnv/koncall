package e1;

import fx.InterfaceC2395a;
import fx.InterfaceC2400f;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4153k;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class i0 implements InterfaceC2400f, Set, InterfaceC2395a {

    /* renamed from: a */
    public final f0 f8995a;

    /* renamed from: b */
    public final f0 f8996b;

    public i0(f0 parent) {
        AbstractC4154l.m8923f(parent, "parent");
        this.f8995a = parent;
        this.f8996b = parent;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f8996b.m5557a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection elements) {
        AbstractC4154l.m8923f(elements, "elements");
        f0 f0Var = this.f8996b;
        f0Var.getClass();
        int i10 = f0Var.f8967g;
        for (Object obj : elements) {
            int iM5560d = f0Var.m5560d(obj);
            f0Var.f8962b[iM5560d] = obj;
            long[] jArr = f0Var.f8963c;
            int i11 = f0Var.f8964d;
            jArr[iM5560d] = (i11 & 2147483647L) | 4611686016279904256L;
            if (i11 != Integer.MAX_VALUE) {
                jArr[i11] = ((iM5560d & 2147483647L) << 31) | (jArr[i11] & (-4611686016279904257L));
            }
            f0Var.f8964d = iM5560d;
            if (f0Var.f8965e == Integer.MAX_VALUE) {
                f0Var.f8965e = iM5560d;
            }
        }
        return i10 != f0Var.f8967g;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f8996b.m5558b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f8995a.m5559c(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection elements) {
        AbstractC4154l.m8923f(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!this.f8995a.m5559c(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i0.class != obj.getClass()) {
            return false;
        }
        return AbstractC4154l.m8918a(this.f8995a, ((i0) obj).f8995a);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f8995a.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f8995a.f8967g == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new h0(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f8996b.m5563g(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0093, code lost:
    
        if (((r5 & ((~r5) << 6)) & r12) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0095, code lost:
    
        r14 = -1;
     */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean removeAll(java.util.Collection r21) {
        /*
            r20 = this;
            r0 = r21
            java.lang.String r1 = "elements"
            kotlin.jvm.internal.AbstractC4154l.m8923f(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r1 = r20
            e1.f0 r2 = r1.f8996b
            r2.getClass()
            int r3 = r2.f8967g
            java.util.Iterator r0 = r0.iterator()
        L16:
            boolean r4 = r0.hasNext()
            r5 = 1
            r6 = 0
            if (r4 == 0) goto La4
            java.lang.Object r4 = r0.next()
            if (r4 == 0) goto L29
            int r7 = r4.hashCode()
            goto L2a
        L29:
            r7 = r6
        L2a:
            r8 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r7 = r7 * r8
            int r8 = r7 << 16
            r7 = r7 ^ r8
            r8 = r7 & 127(0x7f, float:1.78E-43)
            int r9 = r2.f8966f
            int r7 = r7 >>> 7
            r7 = r7 & r9
        L38:
            long[] r10 = r2.f8961a
            int r11 = r7 >> 3
            r12 = r7 & 7
            int r12 = r12 << 3
            r13 = r10[r11]
            long r13 = r13 >>> r12
            int r11 = r11 + r5
            r15 = r10[r11]
            int r10 = 64 - r12
            long r10 = r15 << r10
            r21 = r5
            r15 = r6
            long r5 = (long) r12
            long r5 = -r5
            r12 = 63
            long r5 = r5 >> r12
            long r5 = r5 & r10
            long r5 = r5 | r13
            long r10 = (long) r8
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r10 = r10 * r12
            long r10 = r10 ^ r5
            long r12 = r10 - r12
            long r10 = ~r10
            long r10 = r10 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
        L66:
            r16 = 0
            int r14 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r14 == 0) goto L89
            int r14 = java.lang.Long.numberOfTrailingZeros(r10)
            int r14 = r14 >> 3
            int r14 = r14 + r7
            r14 = r14 & r9
            r18 = r12
            java.lang.Object[] r12 = r2.f8962b
            r12 = r12[r14]
            boolean r12 = kotlin.jvm.internal.AbstractC4154l.m8918a(r12, r4)
            if (r12 == 0) goto L81
            goto L96
        L81:
            r12 = 1
            long r12 = r10 - r12
            long r10 = r10 & r12
            r12 = r18
            goto L66
        L89:
            r18 = r12
            long r10 = ~r5
            r12 = 6
            long r10 = r10 << r12
            long r5 = r5 & r10
            long r5 = r5 & r18
            int r5 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r5 == 0) goto L9d
            r14 = -1
        L96:
            if (r14 < 0) goto L16
            r2.m5564h(r14)
            goto L16
        L9d:
            int r6 = r15 + 8
            int r7 = r7 + r6
            r7 = r7 & r9
            r5 = r21
            goto L38
        La4:
            r21 = r5
            int r0 = r2.f8967g
            if (r3 == r0) goto Lab
            return r21
        Lab:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.i0.removeAll(java.util.Collection):boolean");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection elements) {
        AbstractC4154l.m8923f(elements, "elements");
        return this.f8996b.m5565i(elements);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f8995a.f8967g;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return AbstractC4153k.m8916a(this);
    }

    public final String toString() {
        return this.f8995a.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] array) {
        AbstractC4154l.m8923f(array, "array");
        return AbstractC4153k.m8917b(this, array);
    }
}
