package va;

import bb.C0641b;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import og.ud;
import pg.e9;
import sc.C6781a;
import sc.C6802v;
import sc.InterfaceC6783c;
import sc.InterfaceC6786f;
import ua.C7382b;
import zb.AbstractC8923q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: va.a */
/* loaded from: classes.dex */
public final class C7693a implements InterfaceC6783c, InterfaceC6786f {

    /* renamed from: a */
    public final C7382b f37195a;

    public C7693a(C7382b config, int i10) {
        switch (i10) {
            case 1:
                AbstractC4154l.m8923f(config, "config");
                this.f37195a = config;
                break;
            default:
                AbstractC4154l.m8923f(config, "config");
                this.f37195a = config;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // sc.InterfaceC6783c
    /* renamed from: j */
    public Object mo8769j(C6802v c6802v, C6781a c6781a) {
        String str = (String) ud.m10978d(c6802v.f32331a, AbstractC8923q.f42882a);
        C0641b c0641b = this.f37195a.f35115r;
        c0641b.getClass();
        Object obj = c0641b.f4111b.get(str);
        if (obj == null) {
            obj = c0641b.f4112c;
        }
        List list = (List) obj;
        List list2 = c0641b.f4110a;
        return list2 != null ? e9.m11605c(list2, list) : list;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // sc.InterfaceC6786f
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo1858o(sc.C6804x r7, ww.AbstractC8193c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof xa.C8317a
            if (r0 == 0) goto L13
            r0 = r8
            xa.a r0 = (xa.C8317a) r0
            int r1 = r0.f39876d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39876d = r1
            goto L18
        L13:
            xa.a r0 = new xa.a
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f39874b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f39876d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            sc.x r7 = r0.f39873a
            og.od.m10798c(r8)
            goto L85
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            og.od.m10798c(r8)
            java.lang.String r8 = "config"
            ua.b r2 = r6.f37195a
            kotlin.jvm.internal.AbstractC4154l.m8923f(r2, r8)
            java.lang.String r8 = "request"
            kotlin.jvm.internal.AbstractC4154l.m8923f(r7, r8)
            c9.i r8 = new c9.i
            r8.<init>()
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r8.f5587c = r4
            r8.f5588d = r4
            java.lang.String r4 = r2.f35103d
            r8.f5586b = r4
            boolean r4 = r2.f35112n
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r8.f5587c = r4
            boolean r4 = r2.f35113p
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r8.f5588d = r4
            ad.p r4 = r2.f35107h
            if (r4 == 0) goto L66
            java.lang.String r4 = r4.f382h
            goto L67
        L66:
            r4 = 0
        L67:
            r8.f5585a = r4
            bd.a r4 = r7.f32335a
            ec.a r5 = zb.AbstractC8923q.f42882a
            java.lang.Object r4 = og.ud.m10978d(r4, r5)
            java.lang.String r4 = (java.lang.String) r4
            wa.a r4 = new wa.a
            r4.<init>(r8)
            ug.z r8 = r2.f35106g
            r0.f39873a = r7
            r0.f39876d = r3
            java.lang.Object r8 = r8.resolveEndpoint(r4, r0)
            if (r8 != r1) goto L85
            return r1
        L85:
            bc.a r8 = (bc.C0642a) r8
            ec.b r0 = r8.f4114b
            ec.a r1 = yb.AbstractC8610b.f41875c
            boolean r1 = r0.mo1861a(r1)
            if (r1 == 0) goto L98
            bd.a r1 = r7.f32335a
            yb.c r2 = yb.EnumC8611c.SERVICE_ENDPOINT_OVERRIDE
            yb.AbstractC8610b.m15956b(r1, r2)
        L98:
            ec.a r1 = yb.AbstractC8610b.f41874b
            boolean r1 = r0.mo1861a(r1)
            if (r1 == 0) goto La7
            bd.a r1 = r7.f32335a
            yb.c r2 = yb.EnumC8611c.ACCOUNT_ID_BASED_ENDPOINT
            yb.AbstractC8610b.m15956b(r1, r2)
        La7:
            ec.a r1 = tb.AbstractC7094e.f34214d
            boolean r2 = r0.mo1861a(r1)
            if (r2 == 0) goto Lc2
            java.lang.Object r0 = og.ud.m10978d(r0, r1)
            java.lang.String r1 = "s3express"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lc2
            bd.a r0 = r7.f32335a
            pa.a r1 = pa.EnumC5867a.S3_EXPRESS_BUCKET
            yb.AbstractC8610b.m15956b(r0, r1)
        Lc2:
            vc.a r0 = r7.f32337c
            ec.b r0 = r0.getAttributes()
            ec.a r1 = da.AbstractC1678a.f8215b
            boolean r0 = r0.mo1861a(r1)
            if (r0 == 0) goto Ld7
            bd.a r7 = r7.f32335a
            yb.c r0 = yb.EnumC8611c.RESOLVED_ACCOUNT_ID
            yb.AbstractC8610b.m15956b(r7, r0)
        Ld7:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: va.C7693a.mo1858o(sc.x, ww.c):java.lang.Object");
    }
}
