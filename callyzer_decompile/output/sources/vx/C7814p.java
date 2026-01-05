package vx;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.AbstractC4154l;
import yx.AbstractC8823q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vx.p */
/* loaded from: classes3.dex */
public final class C7814p extends AbstractC8823q {

    /* renamed from: e */
    public final C7806h f37521e;

    /* renamed from: f */
    public final /* synthetic */ AtomicReferenceArray f37522f;

    public C7814p(long j6, C7814p c7814p, C7806h c7806h, int i10) {
        super(j6, c7814p, i10);
        this.f37521e = c7806h;
        this.f37522f = new AtomicReferenceArray(AbstractC7808j.f37498b * 2);
    }

    @Override // yx.AbstractC8823q
    /* renamed from: g */
    public final int mo5495g() {
        return AbstractC7808j.f37498b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x005a, code lost:
    
        m14798n(r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005d, code lost:
    
        if (r1 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005f, code lost:
    
        kotlin.jvm.internal.AbstractC4154l.m8920c(r4);
        r7 = r4.f37494b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0064, code lost:
    
        if (r7 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0066, code lost:
    
        yx.AbstractC8808b.m16241a(r7, r0, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0069, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
    
        return;
     */
    @Override // yx.AbstractC8823q
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo5496h(int r7, uw.InterfaceC7564h r8) {
        /*
            r6 = this;
            int r0 = vx.AbstractC7808j.f37498b
            if (r7 < r0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            if (r1 == 0) goto La
            int r7 = r7 - r0
        La:
            int r0 = r7 * 2
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r6.f37522f
            java.lang.Object r0 = r2.get(r0)
        L12:
            java.lang.Object r2 = r6.m14796l(r7)
            boolean r3 = r2 instanceof tx.e2
            vx.h r4 = r6.f37521e
            r5 = 0
            if (r3 != 0) goto L6a
            boolean r3 = r2 instanceof vx.C7823y
            if (r3 == 0) goto L22
            goto L6a
        L22:
            l7.q r3 = vx.AbstractC7808j.f37506j
            if (r2 == r3) goto L5a
            l7.q r3 = vx.AbstractC7808j.f37507k
            if (r2 != r3) goto L2b
            goto L5a
        L2b:
            l7.q r3 = vx.AbstractC7808j.f37503g
            if (r2 == r3) goto L12
            l7.q r3 = vx.AbstractC7808j.f37502f
            if (r2 != r3) goto L34
            goto L12
        L34:
            l7.q r7 = vx.AbstractC7808j.f37505i
            if (r2 == r7) goto L8b
            l7.q r7 = vx.AbstractC7808j.f37500d
            if (r2 != r7) goto L3d
            goto L8b
        L3d:
            l7.q r7 = vx.AbstractC7808j.f37508l
            if (r2 != r7) goto L42
            goto L8b
        L42:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "unexpected state: "
            r8.<init>(r0)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L5a:
            r6.m14798n(r7, r5)
            if (r1 == 0) goto L8b
            kotlin.jvm.internal.AbstractC4154l.m8920c(r4)
            ex.c r7 = r4.f37494b
            if (r7 == 0) goto L8b
            yx.AbstractC8808b.m16241a(r7, r0, r8)
            return
        L6a:
            if (r1 == 0) goto L6f
            l7.q r3 = vx.AbstractC7808j.f37506j
            goto L71
        L6f:
            l7.q r3 = vx.AbstractC7808j.f37507k
        L71:
            boolean r2 = r6.m14795k(r7, r2, r3)
            if (r2 == 0) goto L12
            r6.m14798n(r7, r5)
            r2 = r1 ^ 1
            r6.m14797m(r7, r2)
            if (r1 == 0) goto L8b
            kotlin.jvm.internal.AbstractC4154l.m8920c(r4)
            ex.c r7 = r4.f37494b
            if (r7 == 0) goto L8b
            yx.AbstractC8808b.m16241a(r7, r0, r8)
        L8b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vx.C7814p.mo5496h(int, uw.h):void");
    }

    /* renamed from: k */
    public final boolean m14795k(int i10, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i11 = (i10 * 2) + 1;
        do {
            atomicReferenceArray = this.f37522f;
            if (atomicReferenceArray.compareAndSet(i11, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i11) == obj);
        return false;
    }

    /* renamed from: l */
    public final Object m14796l(int i10) {
        return this.f37522f.get((i10 * 2) + 1);
    }

    /* renamed from: m */
    public final void m14797m(int i10, boolean z6) {
        if (z6) {
            C7806h c7806h = this.f37521e;
            AbstractC4154l.m8920c(c7806h);
            c7806h.m14770M((this.f42518c * AbstractC7808j.f37498b) + i10);
        }
        m16277i();
    }

    /* renamed from: n */
    public final void m14798n(int i10, Object obj) {
        this.f37522f.set(i10 * 2, obj);
    }

    /* renamed from: o */
    public final void m14799o(int i10, Object obj) {
        this.f37522f.set((i10 * 2) + 1, obj);
    }
}
