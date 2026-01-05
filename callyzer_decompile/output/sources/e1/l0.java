package e1;

import ex.InterfaceC2141e;
import mx.C4912h;
import uw.InterfaceC7559c;
import ww.AbstractC8198h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class l0 extends AbstractC8198h implements InterfaceC2141e {

    /* renamed from: b */
    public h0 f9015b;

    /* renamed from: c */
    public m0 f9016c;

    /* renamed from: d */
    public long[] f9017d;

    /* renamed from: e */
    public int f9018e;

    /* renamed from: f */
    public int f9019f;

    /* renamed from: g */
    public int f9020g;

    /* renamed from: h */
    public int f9021h;

    /* renamed from: j */
    public long f9022j;

    /* renamed from: k */
    public int f9023k;

    /* renamed from: l */
    public /* synthetic */ Object f9024l;

    /* renamed from: m */
    public final /* synthetic */ m0 f9025m;

    /* renamed from: n */
    public final /* synthetic */ h0 f9026n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(m0 m0Var, h0 h0Var, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f9025m = m0Var;
        this.f9026n = h0Var;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        l0 l0Var = new l0(this.f9025m, this.f9026n, interfaceC7559c);
        l0Var.f9024l = obj;
        return l0Var;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        return ((l0) create((C4912h) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0051 -> B:23:0x00a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0053 -> B:14:0x0066). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006f -> B:20:0x0097). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0094 -> B:20:0x0097). Please report as a decompilation issue!!! */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f9023k
            r4 = 8
            r5 = 1
            if (r2 == 0) goto L2e
            if (r2 != r5) goto L26
            int r2 = r0.f9021h
            int r6 = r0.f9020g
            long r7 = r0.f9022j
            int r9 = r0.f9019f
            int r10 = r0.f9018e
            long[] r11 = r0.f9017d
            e1.m0 r12 = r0.f9016c
            e1.h0 r13 = r0.f9015b
            java.lang.Object r14 = r0.f9024l
            mx.h r14 = (mx.C4912h) r14
            og.od.m10798c(r22)
            goto L97
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2e:
            og.od.m10798c(r22)
            java.lang.Object r2 = r0.f9024l
            mx.h r2 = (mx.C4912h) r2
            e1.m0 r6 = r0.f9025m
            e1.k0 r7 = r6.f9029b
            long[] r7 = r7.f9005a
            int r8 = r7.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto La7
            e1.h0 r9 = r0.f9026n
            r10 = 0
        L43:
            r11 = r7[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto La2
            int r13 = r10 - r8
            int r13 = ~r13
            int r13 = r13 >>> 31
            int r13 = 8 - r13
            r14 = r2
            r2 = 0
            r19 = r11
            r12 = r6
            r11 = r7
            r6 = r13
            r13 = r9
            r9 = r10
            r10 = r8
            r7 = r19
        L66:
            if (r2 >= r6) goto L9a
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r7
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L97
            int r15 = r9 << 3
            int r15 = r15 + r2
            r13.f8991b = r15
            e1.k0 r3 = r12.f9029b
            java.lang.Object[] r3 = r3.f9006b
            r3 = r3[r15]
            r0.f9024l = r14
            r0.f9015b = r13
            r0.f9016c = r12
            r0.f9017d = r11
            r0.f9018e = r10
            r0.f9019f = r9
            r0.f9022j = r7
            r0.f9020g = r6
            r0.f9021h = r2
            r0.f9023k = r5
            vw.a r3 = r14.m9805d(r3, r0)
            if (r3 != r1) goto L97
            return r1
        L97:
            long r7 = r7 >> r4
            int r2 = r2 + r5
            goto L66
        L9a:
            if (r6 != r4) goto La7
            r8 = r10
            r7 = r11
            r6 = r12
            r2 = r14
            r10 = r9
            r9 = r13
        La2:
            if (r10 == r8) goto La7
            int r10 = r10 + 1
            goto L43
        La7:
            qw.a0 r1 = qw.a0.f30746a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.l0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
