package rn;

import aw.C0481u;
import ex.InterfaceC2141e;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C4166x;
import kotlin.jvm.internal.C4168z;
import tx.C7251k;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;
import wx.k1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rn.t */
/* loaded from: classes3.dex */
public final class C6591t extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public List f31663a;

    /* renamed from: b */
    public h0 f31664b;

    /* renamed from: c */
    public Iterator f31665c;

    /* renamed from: d */
    public int f31666d;

    /* renamed from: e */
    public int f31667e;

    /* renamed from: f */
    public final /* synthetic */ h0 f31668f;

    /* renamed from: g */
    public final /* synthetic */ C0481u f31669g;

    /* renamed from: h */
    public final /* synthetic */ C4166x f31670h;

    /* renamed from: j */
    public final /* synthetic */ C4168z f31671j;

    /* renamed from: k */
    public final /* synthetic */ k1 f31672k;

    /* renamed from: l */
    public final /* synthetic */ C4166x f31673l;

    /* renamed from: m */
    public final /* synthetic */ C4166x f31674m;

    /* renamed from: n */
    public final /* synthetic */ C7251k f31675n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6591t(h0 h0Var, C0481u c0481u, C4166x c4166x, C4168z c4168z, k1 k1Var, C4166x c4166x2, C4166x c4166x3, C7251k c7251k, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f31668f = h0Var;
        this.f31669g = c0481u;
        this.f31670h = c4166x;
        this.f31671j = c4168z;
        this.f31672k = k1Var;
        this.f31673l = c4166x2;
        this.f31674m = c4166x3;
        this.f31675n = c7251k;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        return new C6591t(this.f31668f, this.f31669g, this.f31670h, this.f31671j, this.f31672k, this.f31673l, this.f31674m, this.f31675n, interfaceC7559c);
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        return ((C6591t) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a9, code lost:
    
        if (r0.m16175a(r2, r7, r3, r4, r17) == r6) goto L18;
     */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r5 = r17
            vw.a r6 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r0 = r5.f31667e
            r1 = 2
            r2 = 1
            r3 = 0
            rn.h0 r8 = r5.f31668f
            if (r0 == 0) goto L2a
            if (r0 == r2) goto L1e
            if (r0 != r1) goto L16
            og.od.m10798c(r18)
            goto Lac
        L16:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L1e:
            int r0 = r5.f31666d
            java.util.Iterator r4 = r5.f31665c
            rn.h0 r7 = r5.f31664b
            java.util.List r9 = r5.f31663a
            og.od.m10798c(r18)
            goto L3b
        L2a:
            java.util.ArrayList r0 = i0.m0.m7386s(r18)
            java.util.ArrayList r4 = xm.s2.f40811o
            java.util.List r4 = rw.AbstractC6663m.c0(r4)
            java.util.Iterator r4 = r4.iterator()
            r9 = r0
            r0 = r3
            r7 = r8
        L3b:
            boolean r10 = r4.hasNext()
            if (r10 == 0) goto L6a
            java.lang.Object r10 = r4.next()
            kn.a r10 = (kn.C4121a) r10
            mm.b r11 = r10.f21054a
            int r11 = r11.f23832a
            java.lang.Integer r12 = new java.lang.Integer
            r12.<init>(r11)
            r9.add(r12)
            mm.b r10 = r10.f21054a
            int r10 = r10.f23832a
            zm.c r11 = zm.EnumC8993c.UPLOAD_IN_PROGRESS
            r5.f31663a = r9
            r5.f31664b = r7
            r5.f31665c = r4
            r5.f31666d = r0
            r5.f31667e = r2
            java.lang.Object r10 = r7.m12615P(r10, r11, r3, r5)
            if (r10 != r6) goto L3b
            goto Lab
        L6a:
            wo.s r0 = r8.f31526h
            im.d r2 = new im.d
            r2.<init>(r9)
            r0.m15308k(r2)
            yv.f r0 = yv.C8791f.f42457a
            java.util.ArrayList r2 = xm.s2.f40811o
            rn.s r7 = new rn.s
            kotlin.jvm.internal.x r14 = r5.f31674m
            r16 = 0
            aw.u r9 = r5.f31669g
            kotlin.jvm.internal.x r10 = r5.f31670h
            kotlin.jvm.internal.z r11 = r5.f31671j
            wx.k1 r12 = r5.f31672k
            kotlin.jvm.internal.x r13 = r5.f31673l
            tx.k r15 = r5.f31675n
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            h1.b r3 = new h1.b
            r4 = 1
            r9 = 0
            r3.<init>(r8, r15, r9, r4)
            lu.k r4 = new lu.k
            r10 = 12
            r4.<init>(r8, r15, r9, r10)
            r5.f31663a = r9
            r5.f31664b = r9
            r5.f31665c = r9
            r5.f31667e = r1
            r1 = r2
            r2 = r7
            java.lang.Object r0 = r0.m16175a(r1, r2, r3, r4, r5)
            if (r0 != r6) goto Lac
        Lab:
            return r6
        Lac:
            qw.a0 r0 = qw.a0.f30746a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rn.C6591t.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
