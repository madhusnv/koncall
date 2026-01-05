package fk;

import ik.C3287k;
import ji.C3773g;
import kotlin.jvm.internal.AbstractC4154l;
import rj.InterfaceC6558d;
import uw.InterfaceC7564h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class v0 implements s0 {

    /* renamed from: f */
    public static final double f10500f = Math.random();

    /* renamed from: g */
    public static final /* synthetic */ int f10501g = 0;

    /* renamed from: a */
    public final C3773g f10502a;

    /* renamed from: b */
    public final InterfaceC6558d f10503b;

    /* renamed from: c */
    public final C3287k f10504c;

    /* renamed from: d */
    public final C2306l f10505d;

    /* renamed from: e */
    public final InterfaceC7564h f10506e;

    public v0(C3773g firebaseApp, InterfaceC6558d firebaseInstallations, C3287k sessionSettings, C2306l eventGDTLogger, InterfaceC7564h backgroundDispatcher) {
        AbstractC4154l.m8923f(firebaseApp, "firebaseApp");
        AbstractC4154l.m8923f(firebaseInstallations, "firebaseInstallations");
        AbstractC4154l.m8923f(sessionSettings, "sessionSettings");
        AbstractC4154l.m8923f(eventGDTLogger, "eventGDTLogger");
        AbstractC4154l.m8923f(backgroundDispatcher, "backgroundDispatcher");
        this.f10502a = firebaseApp;
        this.f10503b = firebaseInstallations;
        this.f10504c = sessionSettings;
        this.f10505d = eventGDTLogger;
        this.f10506e = backgroundDispatcher;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0082, code lost:
    
        if (r6.m7634b(r0) == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m5985a(fk.v0 r5, ww.AbstractC8193c r6) {
        /*
            boolean r0 = r6 instanceof fk.u0
            if (r0 == 0) goto L13
            r0 = r6
            fk.u0 r0 = (fk.u0) r0
            int r1 = r0.f10498d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10498d = r1
            goto L18
        L13:
            fk.u0 r0 = new fk.u0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f10496b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f10498d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            fk.v0 r5 = r0.f10495a
            og.od.m10798c(r6)
            goto L85
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            fk.v0 r5 = r0.f10495a
            og.od.m10798c(r6)
            goto L4a
        L3a:
            og.od.m10798c(r6)
            gk.c r6 = gk.C2622c.f14197a
            r0.f10495a = r5
            r0.f10498d = r4
            java.lang.Object r6 = r6.m6596b(r0)
            if (r6 != r1) goto L4a
            goto L84
        L4a:
            java.util.Map r6 = (java.util.Map) r6
            java.util.Collection r6 = r6.values()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            boolean r2 = r6 instanceof java.util.Collection
            if (r2 == 0) goto L60
            r2 = r6
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L60
            goto Lb7
        L60:
            java.util.Iterator r6 = r6.iterator()
        L64:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto Lb7
            java.lang.Object r2 = r6.next()
            wi.i r2 = (wi.C8059i) r2
            a9.l r2 = r2.f38588a
            boolean r2 = r2.m194C()
            if (r2 == 0) goto L64
            ik.k r6 = r5.f10504c
            r0.f10495a = r5
            r0.f10498d = r3
            java.lang.Object r6 = r6.m7634b(r0)
            if (r6 != r1) goto L85
        L84:
            return r1
        L85:
            ik.k r6 = r5.f10504c
            ik.p r0 = r6.f17504a
            java.lang.Boolean r0 = r0.mo7628a()
            if (r0 == 0) goto L94
            boolean r4 = r0.booleanValue()
            goto La0
        L94:
            ik.p r6 = r6.f17505b
            java.lang.Boolean r6 = r6.mo7628a()
            if (r6 == 0) goto La0
            boolean r4 = r6.booleanValue()
        La0:
            if (r4 != 0) goto La5
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        La5:
            ik.k r5 = r5.f10504c
            double r5 = r5.m7633a()
            double r0 = fk.v0.f10500f
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 > 0) goto Lb4
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        Lb4:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        Lb7:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: fk.v0.m5985a(fk.v0, ww.c):java.lang.Object");
    }
}
