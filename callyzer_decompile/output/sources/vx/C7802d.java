package vx;

import ex.InterfaceC2142f;
import kotlin.jvm.internal.AbstractC4152j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vx.d */
/* loaded from: classes3.dex */
public final /* synthetic */ class C7802d extends AbstractC4152j implements InterfaceC2142f {

    /* renamed from: a */
    public static final C7802d f37476a = new C7802d(3, C7806h.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0075, code lost:
    
        return qw.a0.f30746a;
     */
    @Override // ex.InterfaceC2142f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r9, java.lang.Object r10, java.lang.Object r11) {
        /*
            r8 = this;
            r0 = r9
            vx.h r0 = (vx.C7806h) r0
            r5 = r10
            cy.f r5 = (cy.InterfaceC1535f) r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r9 = vx.C7806h.f37484d
            r0.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = vx.C7806h.f37489j
            java.lang.Object r9 = r9.get(r0)
            vx.p r9 = (vx.C7814p) r9
        L13:
            boolean r10 = r0.m14792z()
            if (r10 == 0) goto L20
            l7.q r9 = vx.AbstractC7808j.f37508l
            cy.e r5 = (cy.C1534e) r5
            r5.f7719e = r9
            goto L73
        L20:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r10 = vx.C7806h.f37485e
            long r3 = r10.getAndIncrement(r0)
            int r10 = vx.AbstractC7808j.f37498b
            long r10 = (long) r10
            long r1 = r3 / r10
            long r10 = r3 % r10
            int r10 = (int) r10
            long r6 = r9.f42518c
            int r11 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r11 == 0) goto L3e
            vx.p r11 = r0.m14786s(r1, r9)
            if (r11 != 0) goto L3b
            goto L13
        L3b:
            r1 = r11
        L3c:
            r2 = r10
            goto L40
        L3e:
            r1 = r9
            goto L3c
        L40:
            java.lang.Object r9 = r0.m14768K(r1, r2, r3, r5)
            r11 = r1
            l7.q r10 = vx.AbstractC7808j.f37509m
            if (r9 != r10) goto L57
            boolean r9 = r5 instanceof tx.e2
            if (r9 == 0) goto L50
            tx.e2 r5 = (tx.e2) r5
            goto L51
        L50:
            r5 = 0
        L51:
            if (r5 == 0) goto L73
            r5.mo5076a(r11, r2)
            goto L73
        L57:
            l7.q r10 = vx.AbstractC7808j.f37511o
            if (r9 != r10) goto L68
            long r9 = r0.m14790w()
            int r9 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r9 >= 0) goto L66
            r11.m16257a()
        L66:
            r9 = r11
            goto L13
        L68:
            l7.q r10 = vx.AbstractC7808j.f37510n
            if (r9 == r10) goto L76
            r11.m16257a()
            cy.e r5 = (cy.C1534e) r5
            r5.f7719e = r9
        L73:
            qw.a0 r9 = qw.a0.f30746a
            return r9
        L76:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "unexpected"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: vx.C7802d.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
