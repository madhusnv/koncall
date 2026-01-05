package yx;

import b3.C0581m;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC4154l;
import tx.c0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yx.i */
/* loaded from: classes3.dex */
public class C8815i {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f42502a = AtomicReferenceFieldUpdater.newUpdater(C8815i.class, Object.class, "_next$volatile");

    /* renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f42503b = AtomicReferenceFieldUpdater.newUpdater(C8815i.class, Object.class, "_prev$volatile");

    /* renamed from: c */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f42504c = AtomicReferenceFieldUpdater.newUpdater(C8815i.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    /* renamed from: b */
    public final boolean m16261b(C8815i c8815i, int i10) {
        while (true) {
            C8815i c8815iM16262c = m16262c();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f42503b;
            if (c8815iM16262c == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    c8815iM16262c = (C8815i) obj;
                    if (!c8815iM16262c.mo13573f()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(c8815iM16262c);
                }
            }
            if (c8815iM16262c instanceof C8814h) {
                return (((C8814h) c8815iM16262c).f42501d & i10) == 0 && c8815iM16262c.m16261b(c8815i, i10);
            }
            atomicReferenceFieldUpdater.set(c8815i, c8815iM16262c);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f42502a;
            atomicReferenceFieldUpdater2.set(c8815i, this);
            while (!atomicReferenceFieldUpdater2.compareAndSet(c8815iM16262c, this, c8815i)) {
                if (atomicReferenceFieldUpdater2.get(c8815iM16262c) != this) {
                    break;
                }
            }
            c8815i.m16263d(this);
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        r6 = ((yx.C8820n) r6).f42515a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0041, code lost:
    
        if (r5.get(r4) == r3) goto L43;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final yx.C8815i m16262c() {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = yx.C8815i.f42503b
            java.lang.Object r1 = r0.get(r9)
            yx.i r1 = (yx.C8815i) r1
            r2 = 0
            r3 = r1
        La:
            r4 = r2
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = yx.C8815i.f42502a
            java.lang.Object r6 = r5.get(r3)
            if (r6 != r9) goto L24
            if (r1 != r3) goto L16
            return r3
        L16:
            boolean r2 = r0.compareAndSet(r9, r1, r3)
            if (r2 == 0) goto L1d
            return r3
        L1d:
            java.lang.Object r2 = r0.get(r9)
            if (r2 == r1) goto L16
            goto L0
        L24:
            boolean r7 = r9.mo13573f()
            if (r7 == 0) goto L2b
            return r2
        L2b:
            boolean r7 = r6 instanceof yx.C8820n
            if (r7 == 0) goto L4b
            if (r4 == 0) goto L44
            yx.n r6 = (yx.C8820n) r6
            yx.i r6 = r6.f42515a
        L35:
            boolean r7 = r5.compareAndSet(r4, r3, r6)
            if (r7 == 0) goto L3d
            r3 = r4
            goto La
        L3d:
            java.lang.Object r7 = r5.get(r4)
            if (r7 == r3) goto L35
            goto L0
        L44:
            java.lang.Object r3 = r0.get(r3)
            yx.i r3 = (yx.C8815i) r3
            goto Lb
        L4b:
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
            kotlin.jvm.internal.AbstractC4154l.m8921d(r6, r4)
            r4 = r6
            yx.i r4 = (yx.C8815i) r4
            r8 = r4
            r4 = r3
            r3 = r8
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: yx.C8815i.m16262c():yx.i");
    }

    /* renamed from: d */
    public final void m16263d(C8815i c8815i) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f42503b;
            C8815i c8815i2 = (C8815i) atomicReferenceFieldUpdater.get(c8815i);
            if (f42502a.get(this) != c8815i) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(c8815i, c8815i2, this)) {
                if (atomicReferenceFieldUpdater.get(c8815i) != c8815i2) {
                    break;
                }
            }
            if (mo13573f()) {
                c8815i.m16262c();
                return;
            }
            return;
        }
    }

    /* renamed from: e */
    public final C8815i m16264e() {
        C8815i c8815i;
        Object obj = f42502a.get(this);
        C8820n c8820n = obj instanceof C8820n ? (C8820n) obj : null;
        if (c8820n != null && (c8815i = c8820n.f42515a) != null) {
            return c8815i;
        }
        AbstractC4154l.m8921d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (C8815i) obj;
    }

    /* renamed from: f */
    public boolean mo13573f() {
        return f42502a.get(this) instanceof C8820n;
    }

    public String toString() {
        return new C0581m(1, 6, c0.class, this, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;") + '@' + c0.m13494q(this);
    }
}
