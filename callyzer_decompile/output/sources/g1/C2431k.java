package g1;

import b2.C0554l;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g1.k */
/* loaded from: classes.dex */
public final class C2431k extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f11026a = 1;

    /* renamed from: b */
    public final /* synthetic */ int f11027b;

    /* renamed from: c */
    public final /* synthetic */ int f11028c;

    /* renamed from: d */
    public final /* synthetic */ Object f11029d;

    /* renamed from: e */
    public final /* synthetic */ Object f11030e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2431k(int i10, int i11, e1.d0 d0Var, C0554l c0554l) {
        super(1);
        this.f11027b = i10;
        this.f11028c = i11;
        this.f11029d = d0Var;
        this.f11030e = c0554l;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050 A[LOOP:0: B:6:0x0026->B:12:0x0050, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    @Override // ex.InterfaceC2139c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.f11026a
            switch(r1) {
                case 0: goto L56;
                default: goto L7;
            }
        L7:
            r1 = r18
            s1.h r1 = (s1.C6713h) r1
            s1.q r2 = r1.f32070c
            ex.c r2 = r2.getKey()
            int r3 = r1.f32068a
            int r4 = r0.f11027b
            int r4 = java.lang.Math.max(r4, r3)
            int r1 = r1.f32069b
            int r1 = r1 + r3
            int r1 = r1 + (-1)
            int r5 = r0.f11028c
            int r1 = java.lang.Math.min(r5, r1)
            if (r4 > r1) goto L53
        L26:
            if (r2 == 0) goto L34
            int r5 = r4 - r3
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r5 = r2.invoke(r5)
            if (r5 != 0) goto L39
        L34:
            s1.f r5 = new s1.f
            r5.<init>(r4)
        L39:
            java.lang.Object r6 = r0.f11029d
            e1.d0 r6 = (e1.d0) r6
            r6.m5539h(r4, r5)
            java.lang.Object r6 = r0.f11030e
            b2.l r6 = (b2.C0554l) r6
            java.lang.Object r7 = r6.f3780d
            java.lang.Object[] r7 = (java.lang.Object[]) r7
            int r6 = r6.f3778b
            int r6 = r4 - r6
            r7[r6] = r5
            if (r4 == r1) goto L53
            int r4 = r4 + 1
            goto L26
        L53:
            qw.a0 r1 = qw.a0.f30746a
            return r1
        L56:
            r1 = r18
            t3.v0 r1 = (t3.v0) r1
            java.lang.Object r2 = r0.f11029d
            t3.w0[] r2 = (t3.w0[]) r2
            java.lang.Object r3 = r0.f11030e
            g1.l r3 = (g1.C2432l) r3
            int r4 = r2.length
            r5 = 0
        L64:
            if (r5 >= r4) goto L9f
            r6 = r2[r5]
            if (r6 == 0) goto L9c
            g1.r r7 = r3.f11032a
            w2.e r8 = r7.f11061b
            int r7 = r6.f34030a
            int r9 = r6.f34031b
            long r10 = (long) r7
            r7 = 32
            long r10 = r10 << r7
            long r12 = (long) r9
            r14 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r12 = r12 & r14
            long r9 = r10 | r12
            int r11 = r0.f11027b
            long r11 = (long) r11
            long r11 = r11 << r7
            int r13 = r0.f11028c
            r16 = r7
            r18 = r8
            long r7 = (long) r13
            long r7 = r7 & r14
            long r11 = r11 | r7
            s4.m r13 = s4.EnumC6757m.Ltr
            r8 = r18
            long r7 = r8.mo14848a(r9, r11, r13)
            long r9 = r7 >> r16
            int r9 = (int) r9
            long r7 = r7 & r14
            int r7 = (int) r7
            t3.v0.m13317e(r1, r6, r9, r7)
        L9c:
            int r5 = r5 + 1
            goto L64
        L9f:
            qw.a0 r1 = qw.a0.f30746a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.C2431k.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2431k(t3.w0[] w0VarArr, C2432l c2432l, int i10, int i11) {
        super(1);
        this.f11029d = w0VarArr;
        this.f11030e = c2432l;
        this.f11027b = i10;
        this.f11028c = i11;
    }
}
