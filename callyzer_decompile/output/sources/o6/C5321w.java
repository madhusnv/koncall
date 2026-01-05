package o6;

import a3.C0045d;
import c9.C0914i;
import dy.AbstractC1856d;
import dy.C1855c;
import ex.InterfaceC2141e;
import f9.C2222e;
import hp.C2995b;
import i1.C3135n;
import java.util.List;
import lp.C4504f;
import og.nd;
import pg.o6;
import qw.C6366p;
import rw.AbstractC6663m;
import tx.C7257q;
import tx.C7263w;
import tx.InterfaceC7266z;
import tx.s1;
import uw.InterfaceC7559c;
import wj.C8090p;
import ww.AbstractC8193c;
import wx.InterfaceC8209j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o6.w */
/* loaded from: classes.dex */
public final class C5321w implements InterfaceC5304f {

    /* renamed from: a */
    public final c0 f26181a;

    /* renamed from: b */
    public final InterfaceC5301c f26182b;

    /* renamed from: c */
    public final InterfaceC7266z f26183c;

    /* renamed from: d */
    public final C2222e f26184d;

    /* renamed from: f */
    public int f26186f;

    /* renamed from: g */
    public s1 f26187g;

    /* renamed from: i */
    public final C8090p f26189i;

    /* renamed from: j */
    public final C6366p f26190j;

    /* renamed from: k */
    public final C6366p f26191k;

    /* renamed from: l */
    public final C0914i f26192l;

    /* renamed from: e */
    public final C1855c f26185e = AbstractC1856d.m5490a();

    /* renamed from: h */
    public final C5322x f26188h = new C5322x();

    public C5321w(c0 c0Var, List list, InterfaceC5301c interfaceC5301c, InterfaceC7266z interfaceC7266z) {
        this.f26181a = c0Var;
        this.f26182b = interfaceC5301c;
        this.f26183c = interfaceC7266z;
        InterfaceC7559c interfaceC7559c = null;
        this.f26184d = new C2222e(new C2995b(this, interfaceC7559c, 28));
        C8090p c8090p = new C8090p();
        c8090p.f38726d = this;
        c8090p.f38723a = AbstractC1856d.m5490a();
        C7257q c7257q = new C7257q(true);
        c7257q.m13554M(null);
        c8090p.f38724b = c7257q;
        c8090p.f38725c = AbstractC6663m.c0(list);
        this.f26189i = c8090p;
        this.f26190j = nd.m10782c(new C5309k(this, 1));
        this.f26191k = nd.m10782c(new C5309k(this, 0));
        C0045d c0045d = new C0045d(24, this);
        C4504f c4504f = new C4504f(this, interfaceC7559c, 19);
        C0914i c0914i = new C0914i();
        c0914i.f5585a = interfaceC7266z;
        c0914i.f5586b = c4504f;
        c0914i.f5587c = o6.m11805a(Integer.MAX_VALUE, null, null, 6);
        c0914i.f5588d = new C5299a();
        tx.e1 e1Var = (tx.e1) interfaceC7266z.mo1865w().o0(C7263w.f34689b);
        if (e1Var != null) {
            e1Var.v0(new C3135n(21, c0045d, c0914i));
        }
        this.f26192l = c0914i;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m10457b(o6.C5321w r4, ww.AbstractC8193c r5) {
        /*
            boolean r0 = r5 instanceof o6.C5313o
            if (r0 == 0) goto L13
            r0 = r5
            o6.o r0 = (o6.C5313o) r0
            int r1 = r0.f26100e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26100e = r1
            goto L18
        L13:
            o6.o r0 = new o6.o
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f26098c
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f26100e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            dy.c r4 = r0.f26097b
            o6.w r0 = r0.f26096a
            og.od.m10798c(r5)
            r5 = r4
            r4 = r0
            goto L47
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            og.od.m10798c(r5)
            dy.c r5 = r4.f26185e
            r0.f26096a = r4
            r0.f26097b = r5
            r0.f26100e = r3
            java.lang.Object r0 = r5.mo1768h(r0)
            if (r0 != r1) goto L47
            return r1
        L47:
            r0 = 0
            int r1 = r4.f26186f     // Catch: java.lang.Throwable -> L58
            int r1 = r1 + (-1)
            r4.f26186f = r1     // Catch: java.lang.Throwable -> L58
            if (r1 != 0) goto L5c
            tx.s1 r1 = r4.f26187g     // Catch: java.lang.Throwable -> L58
            if (r1 == 0) goto L5a
            r1.mo13510j(r0)     // Catch: java.lang.Throwable -> L58
            goto L5a
        L58:
            r4 = move-exception
            goto L62
        L5a:
            r4.f26187g = r0     // Catch: java.lang.Throwable -> L58
        L5c:
            r5.mo1769j(r0)
            qw.a0 r4 = qw.a0.f30746a
            return r4
        L62:
            r5.mo1769j(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.C5321w.m10457b(o6.w, ww.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|(2:4|(1:6)(1:7))(0)|8|(8:68|(1:(1:(2:18|19))(3:20|21|22))|13|14|62|(1:64)(1:65)|66|67)(5:23|73|24|(3:26|71|27)(3:37|(1:39)(1:40)|(2:42|(2:44|(1:46))(2:53|54))(2:55|(2:57|58)(2:59|60)))|50)|47|69|48|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
    
        if (r9 == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0074, code lost:
    
        r8 = r11;
        r11 = r9;
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b5, code lost:
    
        if (r9 == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b8, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v3, types: [ex.e, ww.i] */
    /* JADX WARN: Type inference failed for: r2v9, types: [ex.e, ww.i] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m10458c(o6.C5321w r9, o6.k0 r10, ww.AbstractC8193c r11) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.C5321w.m10458c(o6.w, o6.k0, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m10459d(o6.C5321w r4, ww.AbstractC8193c r5) {
        /*
            boolean r0 = r5 instanceof o6.C5315q
            if (r0 == 0) goto L13
            r0 = r5
            o6.q r0 = (o6.C5315q) r0
            int r1 = r0.f26124e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26124e = r1
            goto L18
        L13:
            o6.q r0 = new o6.q
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f26122c
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f26124e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            dy.c r4 = r0.f26121b
            o6.w r0 = r0.f26120a
            og.od.m10798c(r5)
            r5 = r4
            r4 = r0
            goto L47
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            og.od.m10798c(r5)
            dy.c r5 = r4.f26185e
            r0.f26120a = r4
            r0.f26121b = r5
            r0.f26124e = r3
            java.lang.Object r0 = r5.mo1768h(r0)
            if (r0 != r1) goto L47
            return r1
        L47:
            r0 = 0
            int r1 = r4.f26186f     // Catch: java.lang.Throwable -> L5f
            int r1 = r1 + r3
            r4.f26186f = r1     // Catch: java.lang.Throwable -> L5f
            if (r1 != r3) goto L61
            tx.z r1 = r4.f26183c     // Catch: java.lang.Throwable -> L5f
            o6.l r2 = new o6.l     // Catch: java.lang.Throwable -> L5f
            r3 = 1
            r2.<init>(r4, r0, r3)     // Catch: java.lang.Throwable -> L5f
            r3 = 3
            tx.s1 r1 = tx.c0.m13502y(r1, r0, r0, r2, r3)     // Catch: java.lang.Throwable -> L5f
            r4.f26187g = r1     // Catch: java.lang.Throwable -> L5f
            goto L61
        L5f:
            r4 = move-exception
            goto L67
        L61:
            r5.mo1769j(r0)
            qw.a0 r4 = qw.a0.f30746a
            return r4
        L67:
            r5.mo1769j(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.C5321w.m10459d(o6.w, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m10460e(o6.C5321w r8, boolean r9, uw.InterfaceC7559c r10) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.C5321w.m10460e(o6.w, boolean, uw.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009f A[Catch: CorruptionException -> 0x005f, TryCatch #3 {CorruptionException -> 0x005f, blocks: (B:19:0x005a, B:54:0x00ff, B:24:0x0068, B:51:0x00e0, B:32:0x0085, B:40:0x009f, B:42:0x00a5, B:36:0x008e, B:48:0x00cd), top: B:83:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013c A[Catch: all -> 0x0169, TryCatch #1 {all -> 0x0169, blocks: (B:61:0x012a, B:63:0x013c, B:64:0x0144), top: B:80:0x012a }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0144 A[Catch: all -> 0x0169, TRY_LEAVE, TryCatch #1 {all -> 0x0169, blocks: (B:61:0x012a, B:63:0x013c, B:64:0x0144), top: B:80:0x012a }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m10461f(o6.C5321w r9, boolean r10, ww.AbstractC8193c r11) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.C5321w.m10461f(o6.w, boolean, ww.c):java.lang.Object");
    }

    @Override // o6.InterfaceC5304f
    /* renamed from: a */
    public final Object mo10447a(InterfaceC2141e interfaceC2141e, InterfaceC7559c interfaceC7559c) {
        e1 e1Var = (e1) interfaceC7559c.getContext().o0(d1.f26022a);
        if (e1Var != null) {
            e1Var.m10446a(this);
        }
        return tx.c0.m13475K(new e1(e1Var, this), new C2995b(this, interfaceC2141e, (InterfaceC7559c) null), interfaceC7559c);
    }

    /* renamed from: g */
    public final j0 m10462g() {
        return (j0) this.f26191k.getValue();
    }

    @Override // o6.InterfaceC5304f
    public final InterfaceC8209j getData() {
        return this.f26184d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        if (r4.m15238P(r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10463h(ww.AbstractC8193c r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof o6.C5316r
            if (r0 == 0) goto L13
            r0 = r6
            o6.r r0 = (o6.C5316r) r0
            int r1 = r0.f26138e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26138e = r1
            goto L18
        L13:
            o6.r r0 = new o6.r
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f26136c
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f26138e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            int r1 = r0.f26135b
            o6.w r0 = r0.f26134a
            og.od.m10798c(r6)     // Catch: java.lang.Throwable -> L2e
            goto L66
        L2e:
            r6 = move-exception
            goto L6d
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L38:
            o6.w r2 = r0.f26134a
            og.od.m10798c(r6)
            goto L51
        L3e:
            og.od.m10798c(r6)
            o6.j0 r6 = r5.m10462g()
            r0.f26134a = r5
            r0.f26138e = r4
            java.lang.Object r6 = r6.mo10444e(r0)
            if (r6 != r1) goto L50
            goto L65
        L50:
            r2 = r5
        L51:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            wj.p r4 = r2.f26189i     // Catch: java.lang.Throwable -> L69
            r0.f26134a = r2     // Catch: java.lang.Throwable -> L69
            r0.f26135b = r6     // Catch: java.lang.Throwable -> L69
            r0.f26138e = r3     // Catch: java.lang.Throwable -> L69
            java.lang.Object r6 = r4.m15238P(r0)     // Catch: java.lang.Throwable -> L69
            if (r6 != r1) goto L66
        L65:
            return r1
        L66:
            qw.a0 r6 = qw.a0.f30746a
            return r6
        L69:
            r0 = move-exception
            r1 = r6
            r6 = r0
            r0 = r2
        L6d:
            o6.x r0 = r0.f26188h
            o6.u0 r2 = new o6.u0
            r2.<init>(r6, r1)
            r0.m10469d(r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.C5321w.m10463h(ww.c):java.lang.Object");
    }

    /* renamed from: i */
    public final Object m10464i(AbstractC8193c abstractC8193c) {
        return ((f0) this.f26190j.getValue()).m10448a(new C5311m(3, (InterfaceC7559c) null), abstractC8193c);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10465j(java.lang.Object r11, boolean r12, ww.AbstractC8193c r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof o6.C5320v
            if (r0 == 0) goto L13
            r0 = r13
            o6.v r0 = (o6.C5320v) r0
            int r1 = r0.f26175d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26175d = r1
            goto L18
        L13:
            o6.v r0 = new o6.v
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.f26173b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f26175d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.jvm.internal.x r11 = r0.f26172a
            og.od.m10798c(r13)
            goto L56
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            og.od.m10798c(r13)
            kotlin.jvm.internal.x r5 = new kotlin.jvm.internal.x
            r5.<init>()
            qw.p r13 = r10.f26190j
            java.lang.Object r13 = r13.getValue()
            o6.f0 r13 = (o6.f0) r13
            aw.f0 r4 = new aw.f0
            r9 = 0
            r6 = r10
            r7 = r11
            r8 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f26172a = r5
            r0.f26175d = r3
            java.lang.Object r11 = r13.m10449b(r4, r0)
            if (r11 != r1) goto L55
            return r1
        L55:
            r11 = r5
        L56:
            int r11 = r11.f21162a
            java.lang.Integer r12 = new java.lang.Integer
            r12.<init>(r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.C5321w.m10465j(java.lang.Object, boolean, ww.c):java.lang.Object");
    }
}
