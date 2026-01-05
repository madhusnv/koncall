package k1;

import bs.C0749g;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import hp.C2995b;
import p3.EnumC5813k;
import p3.InterfaceC5822t;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8198h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class i2 {

    /* renamed from: a */
    public static final g0 f20132a = new g0(3, 2, null);

    /* JADX WARN: Removed duplicated region for block: B:17:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d A[LOOP:0: B:19:0x004b->B:20:0x004d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003e -> B:18:0x0041). Please report as a decompilation issue!!! */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8447a(p3.f0 r8, ww.AbstractC8191a r9) {
        /*
            boolean r0 = r9 instanceof k1.a2
            if (r0 == 0) goto L13
            r0 = r9
            k1.a2 r0 = (k1.a2) r0
            int r1 = r0.f20018c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20018c = r1
            goto L18
        L13:
            k1.a2 r0 = new k1.a2
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f20017b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f20018c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            p3.f0 r8 = r0.f20016a
            og.od.m10798c(r9)
            goto L41
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            og.od.m10798c(r9)
        L34:
            r0.f20016a = r8
            r0.f20018c = r3
            p3.k r9 = p3.EnumC5813k.Main
            java.lang.Object r9 = r8.m11384b(r9, r0)
            if (r9 != r1) goto L41
            return r1
        L41:
            p3.j r9 = (p3.C5812j) r9
            java.lang.Object r2 = r9.f28467a
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L4b:
            if (r6 >= r4) goto L59
            java.lang.Object r7 = r2.get(r6)
            p3.q r7 = (p3.C5819q) r7
            r7.m11405a()
            int r6 = r6 + 1
            goto L4b
        L59:
            java.lang.Object r9 = r9.f28467a
            int r2 = r9.size()
        L5f:
            if (r5 >= r2) goto L6f
            java.lang.Object r4 = r9.get(r5)
            p3.q r4 = (p3.C5819q) r4
            boolean r4 = r4.f28479d
            if (r4 == 0) goto L6c
            goto L34
        L6c:
            int r5 = r5 + 1
            goto L5f
        L6f:
            qw.a0 r8 = qw.a0.f30746a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.i2.m8447a(p3.f0, ww.a):java.lang.Object");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0048 -> B:18:0x004b). Please report as a decompilation issue!!! */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8448b(p3.f0 r10, boolean r11, p3.EnumC5813k r12, ww.AbstractC8191a r13) {
        /*
            boolean r0 = r13 instanceof k1.y1
            if (r0 == 0) goto L13
            r0 = r13
            k1.y1 r0 = (k1.y1) r0
            int r1 = r0.f20333e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20333e = r1
            goto L18
        L13:
            k1.y1 r0 = new k1.y1
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f20332d
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f20333e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            boolean r10 = r0.f20331c
            p3.k r11 = r0.f20330b
            p3.f0 r12 = r0.f20329a
            og.od.m10798c(r13)
            r9 = r11
            r11 = r10
            r10 = r12
            r12 = r9
            goto L4b
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L39:
            og.od.m10798c(r13)
        L3c:
            r0.f20329a = r10
            r0.f20330b = r12
            r0.f20331c = r11
            r0.f20333e = r3
            java.lang.Object r13 = r10.m11384b(r12, r0)
            if (r13 != r1) goto L4b
            return r1
        L4b:
            p3.j r13 = (p3.C5812j) r13
            java.lang.Object r2 = r13.f28467a
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L55:
            if (r6 >= r4) goto L7c
            java.lang.Object r7 = r2.get(r6)
            p3.q r7 = (p3.C5819q) r7
            if (r11 == 0) goto L71
            boolean r8 = r7.m11406b()
            if (r8 != 0) goto L6f
            boolean r8 = r7.f28483h
            if (r8 != 0) goto L6f
            boolean r7 = r7.f28479d
            if (r7 == 0) goto L6f
            r7 = r3
            goto L75
        L6f:
            r7 = r5
            goto L75
        L71:
            boolean r7 = p3.AbstractC5818p.m11397a(r7)
        L75:
            if (r7 != 0) goto L79
            r2 = r5
            goto L7d
        L79:
            int r6 = r6 + 1
            goto L55
        L7c:
            r2 = r3
        L7d:
            if (r2 == 0) goto L3c
            java.lang.Object r10 = r13.f28467a
            java.lang.Object r10 = r10.get(r5)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.i2.m8448b(p3.f0, boolean, p3.k, ww.a):java.lang.Object");
    }

    /* renamed from: c */
    public static /* synthetic */ Object m8449c(p3.f0 f0Var, EnumC5813k enumC5813k, AbstractC8198h abstractC8198h, int i10) {
        boolean z6 = (i10 & 1) != 0;
        if ((i10 & 2) != 0) {
            enumC5813k = EnumC5813k.Main;
        }
        return m8448b(f0Var, z6, enumC5813k, abstractC8198h);
    }

    /* renamed from: d */
    public static Object m8450d(InterfaceC5822t interfaceC5822t, g2.t1 t1Var, InterfaceC2139c interfaceC2139c, InterfaceC7559c interfaceC7559c, int i10) {
        InterfaceC7559c interfaceC7559c2 = t1Var;
        if ((i10 & 4) != 0) {
            interfaceC7559c2 = f20132a;
        }
        Object objM13488k = tx.c0.m13488k(new C0749g(interfaceC5822t, interfaceC7559c2, null, null, interfaceC2139c, null, 5), interfaceC7559c);
        return objM13488k == EnumC7794a.COROUTINE_SUSPENDED ? objM13488k : qw.a0.f30746a;
    }

    /* renamed from: e */
    public static tx.s1 m8451e(InterfaceC7266z interfaceC7266z, tx.e1 e1Var, InterfaceC2141e interfaceC2141e) {
        return tx.c0.m13502y(interfaceC7266z, null, tx.b0.UNDISPATCHED, new C2995b(e1Var, interfaceC2141e, (InterfaceC7559c) null), 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8452f(p3.f0 r8, p3.EnumC5813k r9, ww.AbstractC8191a r10) {
        /*
            boolean r0 = r10 instanceof k1.g2
            if (r0 == 0) goto L13
            r0 = r10
            k1.g2 r0 = (k1.g2) r0
            int r1 = r0.f20105c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20105c = r1
            goto L18
        L13:
            k1.g2 r0 = new k1.g2
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f20104b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f20105c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.jvm.internal.z r8 = r0.f20103a
            og.od.m10798c(r10)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5b
            goto L58
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            og.od.m10798c(r10)
            kotlin.jvm.internal.z r10 = new kotlin.jvm.internal.z
            r10.<init>()
            k1.n0 r2 = k1.n0.f20191a
            r10.f21164a = r2
            w3.t2 r2 = r8.m11386d()     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5b
            long r4 = r2.mo14529b()     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5b
            k1.m0 r2 = new k1.m0     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5b
            r6 = 0
            r7 = 2
            r2.<init>(r9, r10, r6, r7)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5b
            r0.f20103a = r10     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5b
            r0.f20105c = r3     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5b
            java.lang.Object r8 = r8.m11387h(r4, r2, r0)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5b
            if (r8 != r1) goto L57
            return r1
        L57:
            r8 = r10
        L58:
            java.lang.Object r8 = r8.f21164a
            return r8
        L5b:
            k1.p0 r8 = k1.p0.f20202a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.i2.m8452f(p3.f0, p3.k, ww.a):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x009e, code lost:
    
        if (r15 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r15v10, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x009e -> B:13:0x002e). Please report as a decompilation issue!!! */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8453g(p3.f0 r13, p3.EnumC5813k r14, ww.AbstractC8191a r15) {
        /*
            boolean r0 = r15 instanceof k1.h2
            if (r0 == 0) goto L13
            r0 = r15
            k1.h2 r0 = (k1.h2) r0
            int r1 = r0.f20112d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20112d = r1
            goto L18
        L13:
            k1.h2 r0 = new k1.h2
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f20111c
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f20112d
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L43
            if (r2 == r5) goto L3b
            if (r2 != r3) goto L33
            p3.k r13 = r0.f20110b
            p3.f0 r14 = r0.f20109a
            og.od.m10798c(r15)
        L2e:
            r12 = r14
            r14 = r13
            r13 = r12
            goto La1
        L33:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3b:
            p3.k r13 = r0.f20110b
            p3.f0 r14 = r0.f20109a
            og.od.m10798c(r15)
            goto L56
        L43:
            og.od.m10798c(r15)
        L46:
            r0.f20109a = r13
            r0.f20110b = r14
            r0.f20112d = r5
            java.lang.Object r15 = r13.m11384b(r14, r0)
            if (r15 != r1) goto L53
            goto La0
        L53:
            r12 = r14
            r14 = r13
            r13 = r12
        L56:
            p3.j r15 = (p3.C5812j) r15
            java.lang.Object r15 = r15.f28467a
            int r2 = r15.size()
            r6 = r4
        L5f:
            if (r6 >= r2) goto Lc0
            java.lang.Object r7 = r15.get(r6)
            p3.q r7 = (p3.C5819q) r7
            boolean r7 = p3.AbstractC5818p.m11398b(r7)
            if (r7 != 0) goto Lbd
            int r2 = r15.size()
            r6 = r4
        L72:
            if (r6 >= r2) goto L92
            java.lang.Object r7 = r15.get(r6)
            p3.q r7 = (p3.C5819q) r7
            boolean r8 = r7.m11406b()
            if (r8 != 0) goto Lb8
            p3.h0 r8 = r14.f28444f
            long r8 = r8.f28455C
            long r10 = r14.m11385c()
            boolean r7 = p3.AbstractC5818p.m11401e(r7, r8, r10)
            if (r7 == 0) goto L8f
            goto Lb8
        L8f:
            int r6 = r6 + 1
            goto L72
        L92:
            p3.k r15 = p3.EnumC5813k.Final
            r0.f20109a = r14
            r0.f20110b = r13
            r0.f20112d = r3
            java.lang.Object r15 = r14.m11384b(r15, r0)
            if (r15 != r1) goto L2e
        La0:
            return r1
        La1:
            p3.j r15 = (p3.C5812j) r15
            java.lang.Object r15 = r15.f28467a
            int r2 = r15.size()
            r6 = r4
        Laa:
            if (r6 >= r2) goto L46
            java.lang.Object r7 = r15.get(r6)
            p3.q r7 = (p3.C5819q) r7
            boolean r7 = r7.m11406b()
            if (r7 == 0) goto Lba
        Lb8:
            r13 = 0
            return r13
        Lba:
            int r6 = r6 + 1
            goto Laa
        Lbd:
            int r6 = r6 + 1
            goto L5f
        Lc0:
            java.lang.Object r13 = r15.get(r4)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.i2.m8453g(p3.f0, p3.k, ww.a):java.lang.Object");
    }
}
