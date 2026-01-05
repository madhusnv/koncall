package wc;

import ex.InterfaceC2141e;
import java.io.Closeable;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;
import xc.C8324e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class f0 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public C7985s f38347a;

    /* renamed from: b */
    public e0 f38348b;

    /* renamed from: c */
    public C8324e f38349c;

    /* renamed from: d */
    public InterfaceC7266z f38350d;

    /* renamed from: e */
    public Closeable f38351e;

    /* renamed from: f */
    public int f38352f;

    /* renamed from: g */
    public int f38353g;

    /* renamed from: h */
    public int f38354h;

    /* renamed from: j */
    public int f38355j;

    /* renamed from: k */
    public int f38356k;

    /* renamed from: l */
    public /* synthetic */ Object f38357l;

    /* renamed from: m */
    public final /* synthetic */ C8324e f38358m;

    /* renamed from: n */
    public final /* synthetic */ e0 f38359n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(C8324e c8324e, e0 e0Var, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f38358m = c8324e;
        this.f38359n = e0Var;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        f0 f0Var = new f0(this.f38358m, this.f38359n, interfaceC7559c);
        f0Var.f38357l = obj;
        return f0Var;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        return ((f0) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0062 A[Catch: all -> 0x008b, TRY_LEAVE, TryCatch #4 {all -> 0x008b, blocks: (B:13:0x004f, B:15:0x0062), top: B:44:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.io.Closeable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0083 -> B:18:0x0086). Please report as a decompilation issue!!! */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r1 = r19
            java.lang.Object r0 = r1.f38357l
            tx.z r0 = (tx.InterfaceC7266z) r0
            vw.a r2 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r3 = r1.f38356k
            qw.a0 r4 = qw.a0.f30746a
            xc.e r5 = r1.f38358m
            r6 = 1
            if (r3 == 0) goto L3d
            if (r3 != r6) goto L35
            int r0 = r1.f38355j
            int r3 = r1.f38354h
            int r7 = r1.f38353g
            int r8 = r1.f38352f
            java.io.Closeable r9 = r1.f38351e
            tx.z r10 = r1.f38350d
            xc.e r11 = r1.f38349c
            wc.e0 r12 = r1.f38348b
            wc.s r13 = r1.f38347a
            og.od.m10798c(r20)     // Catch: java.lang.Throwable -> L31
            r18 = r7
            r7 = r0
            r0 = r10
            r10 = r9
            r9 = r8
            r8 = r18
            goto L86
        L31:
            r0 = move-exception
            r2 = r0
            goto L97
        L35:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L3d:
            og.od.m10798c(r20)
            wc.s r3 = new wc.s
            r3.<init>()
            r7 = 0
            wc.e0 r8 = r1.f38359n
            r13 = r3
            r11 = r5
            r3 = r7
            r9 = r3
            r10 = r8
            r12 = r10
            r8 = r9
        L4f:
            uw.h r14 = r0.mo1865w()     // Catch: java.lang.Throwable -> L8b
            tx.c0.m13490m(r14)     // Catch: java.lang.Throwable -> L8b
            r14 = 16384(0x4000, double:8.095E-320)
            long r14 = r12.read(r13, r14)     // Catch: java.lang.Throwable -> L8b
            r16 = -1
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 == 0) goto L8d
            r14 = 0
            r1.f38357l = r14     // Catch: java.lang.Throwable -> L8b
            r1.f38347a = r13     // Catch: java.lang.Throwable -> L8b
            r1.f38348b = r12     // Catch: java.lang.Throwable -> L8b
            r1.f38349c = r11     // Catch: java.lang.Throwable -> L8b
            r1.f38350d = r0     // Catch: java.lang.Throwable -> L8b
            r1.f38351e = r10     // Catch: java.lang.Throwable -> L8b
            r1.f38352f = r9     // Catch: java.lang.Throwable -> L8b
            r1.f38353g = r8     // Catch: java.lang.Throwable -> L8b
            r1.f38354h = r3     // Catch: java.lang.Throwable -> L8b
            r1.f38355j = r7     // Catch: java.lang.Throwable -> L8b
            r1.f38356k = r6     // Catch: java.lang.Throwable -> L8b
            b00.k r14 = r13.f38413a     // Catch: java.lang.Throwable -> L8b
            long r14 = r14.f3638b     // Catch: java.lang.Throwable -> L8b
            wc.v r6 = r11.f39897a     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r6 = r6.i0(r13, r14, r1)     // Catch: java.lang.Throwable -> L8b
            if (r6 != r2) goto L86
            return r2
        L86:
            r6 = 1
            goto L4f
        L88:
            r2 = r0
            r9 = r10
            goto L97
        L8b:
            r0 = move-exception
            goto L88
        L8d:
            if (r3 != 0) goto L95
            r10.close()     // Catch: java.lang.Throwable -> L93
            goto L95
        L93:
            r0 = move-exception
            goto La2
        L95:
            r0 = r4
            goto La6
        L97:
            r9.close()     // Catch: java.lang.Throwable -> L9b
            goto L9f
        L9b:
            r0 = move-exception
            og.md.m10764a(r2, r0)     // Catch: java.lang.Throwable -> La0
        L9f:
            throw r2     // Catch: java.lang.Throwable -> La0
        La0:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L93
        La2:
            qw.m r0 = og.od.m10796a(r0)
        La6:
            java.lang.Throwable r0 = qw.C6364n.m12363a(r0)
            r5.mo15150Y(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: wc.f0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
