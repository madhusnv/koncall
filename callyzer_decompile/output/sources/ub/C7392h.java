package ub;

import android.content.res.AssetManager;
import android.os.Build;
import com.amplifyframework.storage.s3.transfer.RunnableC1255b;
import h6.ExecutorC2852h;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import jc.C3734j;
import kotlin.jvm.internal.AbstractC4154l;
import tb.C7096g;
import tb.C7105p;
import uf.C7427b;
import w7.AbstractC7945c;
import wc.C7985s;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ub.h */
/* loaded from: classes.dex */
public final class C7392h {

    /* renamed from: a */
    public byte[] f35150a;

    /* renamed from: b */
    public boolean f35151b;

    /* renamed from: c */
    public final Object f35152c;

    /* renamed from: d */
    public final Object f35153d;

    /* renamed from: e */
    public final Object f35154e;

    /* renamed from: f */
    public Object f35155f;

    /* renamed from: g */
    public Object f35156g;

    public C7392h(InterfaceC7385a interfaceC7385a, C7105p signer, C7096g c7096g, byte[] bArr, C3734j c3734j) {
        AbstractC4154l.m8923f(signer, "signer");
        this.f35152c = interfaceC7385a;
        this.f35153d = signer;
        this.f35154e = c7096g;
        this.f35150a = bArr;
        this.f35155f = c3734j;
        this.f35156g = new C7985s();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0075, code lost:
    
        if (r13 == r3) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0081, code lost:
    
        if (r13 == r3) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0094, code lost:
    
        if (r13 == r3) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m13797a(ww.AbstractC8193c r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.f35152c
            ub.a r0 = (ub.InterfaceC7385a) r0
            java.lang.Object r1 = r12.f35156g
            wc.s r1 = (wc.C7985s) r1
            boolean r2 = r13 instanceof ub.C7386b
            if (r2 == 0) goto L1b
            r2 = r13
            ub.b r2 = (ub.C7386b) r2
            int r3 = r2.f35127c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1b
            int r3 = r3 - r4
            r2.f35127c = r3
            goto L20
        L1b:
            ub.b r2 = new ub.b
            r2.<init>(r12, r13)
        L20:
            java.lang.Object r13 = r2.f35125a
            vw.a r3 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r4 = r2.f35127c
            r5 = 0
            r7 = 3
            r8 = 2
            r9 = 1
            if (r4 == 0) goto L47
            if (r4 == r9) goto L43
            if (r4 == r8) goto L3f
            if (r4 != r7) goto L37
            og.od.m10798c(r13)
            goto L97
        L37:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L3f:
            og.od.m10798c(r13)
            goto L84
        L43:
            og.od.m10798c(r13)
            goto L78
        L47:
            og.od.m10798c(r13)
            b00.k r13 = r1.f38413a
            long r10 = r13.f3638b
            int r13 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r13 <= 0) goto L55
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            return r13
        L55:
            boolean r13 = r0.isClosedForRead()
            r4 = 0
            if (r13 == 0) goto L61
            boolean r13 = r12.f35151b
            if (r13 == 0) goto L61
            goto La5
        L61:
            java.lang.Object r13 = r12.f35154e
            tb.g r13 = (tb.C7096g) r13
            tb.f0 r13 = r13.f34248j
            tb.e0 r10 = tb.e0.f34224b
            boolean r13 = kotlin.jvm.internal.AbstractC4154l.m8918a(r13, r10)
            if (r13 == 0) goto L7b
            r2.f35127c = r9
            java.lang.Object r13 = r12.m13801e(r4, r2)
            if (r13 != r3) goto L78
            goto L96
        L78:
            wc.s r13 = (wc.C7985s) r13
            goto L86
        L7b:
            r2.f35127c = r8
            java.lang.Object r13 = r12.m13799c(r4, r2)
            if (r13 != r3) goto L84
            goto L96
        L84:
            wc.s r13 = (wc.C7985s) r13
        L86:
            if (r13 != 0) goto L9b
            boolean r13 = r0.isClosedForRead()
            if (r13 == 0) goto L9d
            r2.f35127c = r7
            java.lang.Object r13 = r12.m13798b(r2)
            if (r13 != r3) goto L97
        L96:
            return r3
        L97:
            wc.s r13 = (wc.C7985s) r13
            r12.f35151b = r9
        L9b:
            r4 = r13
            goto La5
        L9d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "Expected underlying reader to be closed"
            r13.<init>(r0)
            throw r13
        La5:
            if (r4 == 0) goto Lac
            java.lang.String r13 = "\r\n"
            r4.mo15145m(r8, r13)
        Lac:
            if (r4 == 0) goto Lb7
            long r2 = r1.mo15146y(r4)
            java.lang.Long r13 = new java.lang.Long
            r13.<init>(r2)
        Lb7:
            b00.k r13 = r1.f38413a
            long r0 = r13.f3638b
            int r13 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r13 <= 0) goto Lc0
            goto Lc1
        Lc0:
            r9 = 0
        Lc1:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r9)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ub.C7392h.m13797a(ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m13798b(ww.AbstractC8193c r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f35155f
            jc.j r0 = (jc.C3734j) r0
            boolean r1 = r9 instanceof ub.C7387c
            if (r1 == 0) goto L17
            r1 = r9
            ub.c r1 = (ub.C7387c) r1
            int r2 = r1.f35132e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f35132e = r2
            goto L1c
        L17:
            ub.c r1 = new ub.c
            r1.<init>(r8, r9)
        L1c:
            java.lang.Object r9 = r1.f35130c
            vw.a r2 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r3 = r1.f35132e
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r3 == 0) goto L4b
            if (r3 == r7) goto L47
            if (r3 == r6) goto L47
            if (r3 == r5) goto L3f
            if (r3 != r4) goto L37
            wc.s r0 = r1.f35128a
            og.od.m10798c(r9)
            goto La6
        L37:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3f:
            ub.h r0 = r1.f35129b
            wc.s r3 = r1.f35128a
            og.od.m10798c(r9)
            goto L95
        L47:
            og.od.m10798c(r9)
            goto L6a
        L4b:
            og.od.m10798c(r9)
            java.lang.Object r9 = r8.f35154e
            tb.g r9 = (tb.C7096g) r9
            tb.f0 r9 = r9.f34248j
            tb.e0 r3 = tb.e0.f34224b
            boolean r9 = kotlin.jvm.internal.AbstractC4154l.m8918a(r9, r3)
            if (r9 == 0) goto L6d
            wc.s r9 = new wc.s
            r9.<init>()
            r1.f35132e = r7
            java.lang.Object r9 = r8.m13801e(r9, r1)
            if (r9 != r2) goto L6a
            goto La4
        L6a:
            wc.s r9 = (wc.C7985s) r9
            goto L7b
        L6d:
            wc.s r9 = new wc.s
            r9.<init>()
            r1.f35132e = r6
            java.lang.Object r9 = r8.m13799c(r9, r1)
            if (r9 != r2) goto L6a
            goto La4
        L7b:
            if (r9 == 0) goto Lad
            java.util.Map r3 = r0.f9581c
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto Lac
            r1.f35128a = r9
            r1.f35129b = r8
            r1.f35132e = r5
            java.lang.Object r0 = pg.e8.m11602a(r0, r1)
            if (r0 != r2) goto L92
            goto La4
        L92:
            r3 = r9
            r9 = r0
            r0 = r8
        L95:
            jc.n r9 = (jc.InterfaceC3738n) r9
            r1.f35128a = r3
            r5 = 0
            r1.f35129b = r5
            r1.f35132e = r4
            java.lang.Object r9 = r0.m13800d(r9, r1)
            if (r9 != r2) goto La5
        La4:
            return r2
        La5:
            r0 = r3
        La6:
            wc.s r9 = (wc.C7985s) r9
            r0.mo15146y(r9)
            return r0
        Lac:
            return r9
        Lad:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Required value was null."
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ub.C7392h.m13798b(ww.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
    
        if (r1 == r3) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m13799c(wc.C7985s r23, ww.AbstractC8193c r24) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ub.C7392h.m13799c(wc.s, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m13800d(jc.InterfaceC3738n r22, ww.AbstractC8193c r23) {
        /*
            Method dump skipped, instructions count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ub.C7392h.m13800d(jc.n, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m13801e(wc.C7985s r5, ww.AbstractC8193c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ub.C7390f
            if (r0 == 0) goto L13
            r0 = r6
            ub.f r0 = (ub.C7390f) r0
            int r1 = r0.f35143c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35143c = r1
            goto L18
        L13:
            ub.f r0 = new ub.f
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f35141a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f35143c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            og.od.m10798c(r6)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            og.od.m10798c(r6)
            if (r5 != 0) goto L48
            java.lang.Object r5 = r4.f35152c
            ub.a r5 = (ub.InterfaceC7385a) r5
            r0.f35143c = r3
            java.lang.Object r6 = r4.m13803g(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            r5 = r6
            wc.s r5 = (wc.C7985s) r5
            if (r5 != 0) goto L48
            r5 = 0
            return r5
        L48:
            wc.s r6 = new wc.s
            r6.<init>()
            b00.k r0 = r5.f38413a
            long r0 = r0.f3638b
            r2 = 16
            og.d2.m10599b(r2)
            java.lang.String r0 = java.lang.Long.toString(r0, r2)
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.AbstractC4154l.m8922e(r0, r1)
            int r1 = r0.length()
            r6.mo15145m(r1, r0)
            java.lang.String r0 = "\r\n"
            r1 = 2
            r6.mo15145m(r1, r0)
            r6.mo15146y(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ub.C7392h.m13801e(wc.s, ww.c):java.lang.Object");
    }

    /* renamed from: f */
    public FileInputStream m13802f(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e2) {
            String message = e2.getMessage();
            if (message == null) {
                return null;
            }
            message.contains("compressed");
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0059 -> B:12:0x0031). Please report as a decompilation issue!!! */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m13803g(ub.InterfaceC7385a r14, ww.AbstractC8193c r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof ub.C7391g
            if (r0 == 0) goto L13
            r0 = r15
            ub.g r0 = (ub.C7391g) r0
            int r1 = r0.f35149f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35149f = r1
            goto L18
        L13:
            ub.g r0 = new ub.g
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.f35147d
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f35149f
            r3 = 0
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 != r5) goto L33
            long r6 = r0.f35146c
            wc.s r14 = r0.f35145b
            ub.a r2 = r0.f35144a
            og.od.m10798c(r15)
            r12 = r0
            r0 = r14
            r14 = r2
        L31:
            r2 = r12
            goto L5d
        L33:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L3b:
            og.od.m10798c(r15)
            wc.s r15 = new wc.s
            r15.<init>()
            r6 = 65536(0x10000, double:3.2379E-319)
        L46:
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 <= 0) goto L6e
            r0.f35144a = r14
            r0.f35145b = r15
            r0.f35146c = r6
            r0.f35149f = r5
            java.lang.Object r2 = r14.mo8770k(r15, r6, r0)
            if (r2 != r1) goto L59
            return r1
        L59:
            r12 = r0
            r0 = r15
            r15 = r2
            goto L31
        L5d:
            java.lang.Number r15 = (java.lang.Number) r15
            long r8 = r15.longValue()
            r10 = -1
            int r15 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r15 == 0) goto L6d
            long r6 = r6 - r8
            r15 = r0
            r0 = r2
            goto L46
        L6d:
            r15 = r0
        L6e:
            b00.k r14 = r15.f38413a
            long r0 = r14.f3638b
            int r14 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r14 != 0) goto L78
            r14 = 0
            return r14
        L78:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: ub.C7392h.m13803g(ub.a, ww.c):java.lang.Object");
    }

    /* renamed from: h */
    public void m13804h(int i10, Serializable serializable) {
        new RunnableC1255b(this, i10, serializable, 8).run();
    }

    public C7392h(AssetManager assetManager, ExecutorC2852h executorC2852h, C7427b c7427b, String str, File file) {
        byte[] bArr;
        this.f35151b = false;
        this.f35152c = c7427b;
        this.f35154e = str;
        this.f35153d = file;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            bArr = AbstractC7945c.f38220c;
        } else {
            switch (i10) {
                case 24:
                case 25:
                    bArr = AbstractC7945c.f38224g;
                    break;
                case 26:
                    bArr = AbstractC7945c.f38223f;
                    break;
                case 27:
                    bArr = AbstractC7945c.f38222e;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = AbstractC7945c.f38221d;
                    break;
                default:
                    bArr = null;
                    break;
            }
        }
        this.f35150a = bArr;
    }
}
