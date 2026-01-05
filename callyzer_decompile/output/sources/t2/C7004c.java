package t2;

import ex.InterfaceC2141e;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: t2.c */
/* loaded from: classes.dex */
public final class C7004c extends AbstractC4155m implements InterfaceC2141e {

    /* renamed from: b */
    public static final C7004c f33931b;

    /* renamed from: c */
    public static final C7004c f33932c;

    /* renamed from: a */
    public final /* synthetic */ int f33933a;

    static {
        int i10 = 2;
        f33931b = new C7004c(i10, 0);
        f33932c = new C7004c(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7004c(int i10, int i11) {
        super(i10);
        this.f33933a = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006a  */
    @Override // ex.InterfaceC2141e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r18, java.lang.Object r19) {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.f33933a
            switch(r1) {
                case 0: goto Lc;
                default: goto L7;
            }
        L7:
            r1 = r18
            t2.a r1 = (t2.C7002a) r1
            return r19
        Lc:
            r1 = r18
            t2.a r1 = (t2.C7002a) r1
            r1 = r19
            t2.e r1 = (t2.C7006e) r1
            java.util.Map r2 = r1.f33938a
            e1.j0 r1 = r1.f33939b
            java.lang.Object[] r3 = r1.f8999b
            java.lang.Object[] r4 = r1.f9000c
            long[] r1 = r1.f8998a
            int r5 = r1.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L6f
            r6 = 0
            r7 = r6
        L25:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L6a
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L3f:
            if (r12 >= r10) goto L68
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L64
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r4[r13]
            t2.h r13 = (t2.InterfaceC7009h) r13
            java.util.Map r13 = r13.mo12857c()
            boolean r15 = r13.isEmpty()
            if (r15 == 0) goto L61
            r2.remove(r14)
            goto L64
        L61:
            r2.put(r14, r13)
        L64:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L3f
        L68:
            if (r10 != r11) goto L6f
        L6a:
            if (r7 == r5) goto L6f
            int r7 = r7 + 1
            goto L25
        L6f:
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L76
            r2 = 0
        L76:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.C7004c.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
