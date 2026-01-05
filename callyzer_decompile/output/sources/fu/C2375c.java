package fu;

import d7.w0;
import nn.C5113e;
import rw.C6668r;
import wx.c1;
import wx.m1;
import yx.C8810d;
import zo.C9000c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fu.c */
/* loaded from: classes3.dex */
public final class C2375c extends w0 {

    /* renamed from: b */
    public final C5113e f10808b;

    /* renamed from: c */
    public final C9000c f10809c;

    /* renamed from: d */
    public final C8810d f10810d;

    /* renamed from: e */
    public final m1 f10811e;

    /* renamed from: f */
    public final wx.w0 f10812f;

    public C2375c(C5113e c5113e, C9000c c9000c, C8810d c8810d) {
        this.f10808b = c5113e;
        this.f10809c = c9000c;
        this.f10810d = c8810d;
        m1 m1VarM15372c = c1.m15372c(new C2373a(C6668r.f31943a));
        this.f10811e = m1VarM15372c;
        this.f10812f = new wx.w0(m1VarM15372c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x008d, code lost:
    
        if (r2.m16472h(r4, false, r6, r7, r8) == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m6059e(fu.C2375c r9, ww.AbstractC8193c r10) {
        /*
            zo.c r0 = r9.f10809c
            boolean r1 = r10 instanceof fu.C2374b
            if (r1 == 0) goto L16
            r1 = r10
            fu.b r1 = (fu.C2374b) r1
            int r2 = r1.f10807d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.f10807d = r2
        L14:
            r8 = r1
            goto L1c
        L16:
            fu.b r1 = new fu.b
            r1.<init>(r9, r10)
            goto L14
        L1c:
            java.lang.Object r10 = r8.f10805b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r8.f10807d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            og.od.m10798c(r10)
            goto L90
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            zo.c r0 = r8.f10804a
            og.od.m10798c(r10)
        L3b:
            r2 = r0
            goto L5a
        L3d:
            og.od.m10798c(r10)
            android.content.Context r10 = r0.f43353a
            u8.p r10 = u8.C7368p.m13783g(r10)
            java.lang.String r2 = "SCHEDULE_HOUR_SYNC"
            r10.m13784f(r2)
            nn.e r9 = r9.f10808b
            r8.f10804a = r0
            r8.f10807d = r4
            xm.z r9 = r9.f25030a
            java.lang.Enum r10 = r9.m15716f(r8)
            if (r10 != r1) goto L3b
            goto L8f
        L5a:
            yv.j r10 = (yv.EnumC8795j) r10
            long r9 = r10.getPeriod()
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r9)
            long r9 = r0.longValue()
            r4 = 0
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            r10 = 0
            if (r9 <= 0) goto L71
            goto L72
        L71:
            r0 = r10
        L72:
            if (r0 == 0) goto L79
            long r4 = r0.longValue()
            goto L7f
        L79:
            yv.j r9 = yv.EnumC8795j._2_HOUR
            long r4 = r9.getPeriod()
        L7f:
            im.v r6 = im.EnumC3320v.SCHEDULE_HOUR_SYNC
            t8.n r7 = t8.EnumC7068n.REPLACE
            r8.f10804a = r10
            r8.f10807d = r3
            r3 = r4
            r5 = 0
            java.lang.Object r9 = r2.m16472h(r3, r5, r6, r7, r8)
            if (r9 != r1) goto L90
        L8f:
            return r1
        L90:
            qw.a0 r9 = qw.a0.f30746a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: fu.C2375c.m6059e(fu.c, ww.c):java.lang.Object");
    }
}
