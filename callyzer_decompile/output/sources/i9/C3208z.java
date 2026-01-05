package i9;

import ia.C3211c;
import ia.C3220l;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import nc.InterfaceC4991b;
import og.gf;
import qw.C6361k;
import rw.AbstractC6674x;
import sb.InterfaceC6775b;
import ud.InterfaceC7411o;
import wc.AbstractC7984r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i9.z */
/* loaded from: classes.dex */
public final class C3208z implements InterfaceC6775b {

    /* renamed from: a */
    public final String f17315a;

    /* renamed from: b */
    public final InterfaceC7411o f17316b;

    /* renamed from: c */
    public final InterfaceC4991b f17317c;

    /* renamed from: d */
    public final LinkedHashSet f17318d = new LinkedHashSet();

    /* renamed from: e */
    public final Object f17319e;

    public C3208z(String str, InterfaceC4991b interfaceC4991b, InterfaceC7411o interfaceC7411o) {
        this.f17315a = str;
        this.f17316b = interfaceC7411o;
        this.f17317c = interfaceC4991b;
        C6361k c6361k = new C6361k("Environment", new C3192j(new C3183a(1, interfaceC7411o, InterfaceC7411o.class, "getenv", "getenv(Ljava/lang/String;)Ljava/lang/String;", 0, 3)));
        C3220l c3220l = new C3220l();
        c3220l.f17358e = this.f17316b;
        c3220l.f17356c = this.f17317c;
        this.f17319e = AbstractC6674x.m12778f(c6361k, new C6361k("Ec2InstanceMetadata", new C3199q(new C3211c(c3220l), interfaceC7411o)), new C6361k("EcsContainer", new C3190h(interfaceC7411o, interfaceC4991b)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Iterator it = this.f17319e.entrySet().iterator();
        while (it.hasNext()) {
            AbstractC7984r.m15160d(((Map.Entry) it.next()).getValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m7553h(ca.C0940l r10, sb.InterfaceC6777d r11, l4.C4367l r12, ww.AbstractC8193c r13) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r13 instanceof i9.C3207y
            if (r0 == 0) goto L13
            r0 = r13
            i9.y r0 = (i9.C3207y) r0
            int r1 = r0.f17314f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17314f = r1
            goto L18
        L13:
            i9.y r0 = new i9.y
            r0.<init>(r9, r13)
        L18:
            java.lang.Object r13 = r0.f17312d
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f17314f
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.String r10 = r0.f17311c
            i9.n0 r11 = r0.f17310b
            ca.l r12 = r0.f17309a
            og.od.m10798c(r13)
            r4 = r10
            r3 = r11
            r10 = r12
            goto L54
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L38:
            og.od.m10798c(r13)
            i9.n0 r13 = new i9.n0
            r13.<init>(r11)
            java.lang.String r11 = r10.f5695a
            r0.f17309a = r10
            r0.f17310b = r13
            r0.f17311c = r11
            r0.f17314f = r3
            java.lang.Object r12 = r12.m9139s(r0)
            if (r12 != r1) goto L51
            return r1
        L51:
            r4 = r11
            r3 = r13
            r13 = r12
        L54:
            r5 = r13
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = r10.f5697c
            java.lang.String r7 = r10.f5698d
            i9.q0 r2 = new i9.q0
            nc.b r8 = r9.f17317c
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i9.C3208z.m7553h(ca.l, sb.d, l4.l, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, java.util.Map] */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m7554j(og.la r17, l4.C4367l r18, ww.AbstractC8193c r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i9.C3208z.m7554j(og.la, l4.l, ww.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0287, code lost:
    
        java.util.Collections.reverse(r2);
        r8 = new ca.C0939k(r11, r2);
        r1 = r25;
        r3 = r26;
        r2 = null;
        r4 = new l4.C4367l(new an.u2(r1, r2, r3, null, 3));
        r6.f17286a = r3;
        r6.f17287b = r14;
        r6.f17288c = r8;
        r6.f17289d = r4;
        r6.f17298n = 2;
        r0 = r1.m7554j(r11, r4, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02b3, code lost:
    
        if (r0 != r7) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02b7, code lost:
    
        r5 = r4;
        r11 = r8;
        r13 = r14;
        r14 = r3;
        r2 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.String, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r2v21, types: [ca.k, kotlin.jvm.internal.z] */
    /* JADX WARN: Type inference failed for: r2v22, types: [ca.k, java.lang.Throwable, kotlin.jvm.internal.z] */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.String, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:138:0x0387 -> B:139:0x038c). Please report as a decompilation issue!!! */
    @Override // vc.InterfaceC7700c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object resolve(ec.InterfaceC2004b r26, uw.InterfaceC7559c r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1012
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i9.C3208z.resolve(ec.b, uw.c):java.lang.Object");
    }

    public final String toString() {
        return gf.m10673a(this);
    }
}
