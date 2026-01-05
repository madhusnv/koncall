package b2;

import bv.C0790h;
import eq.C2100l;
import ex.InterfaceC2141e;
import kv.C4252f;
import os.C5731i;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class s0 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f3825a;

    /* renamed from: b */
    public int f3826b;

    /* renamed from: c */
    public boolean f3827c;

    /* renamed from: d */
    public final /* synthetic */ Object f3828d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(int i10, Object obj, InterfaceC7559c interfaceC7559c, boolean z6) {
        super(2, interfaceC7559c);
        this.f3825a = i10;
        this.f3828d = obj;
        this.f3827c = z6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0072, code lost:
    
        if (r1 == r9) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a6, code lost:
    
        if (r1 == r9) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0132, code lost:
    
        if (r0 != r9) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01fe A[LOOP:5: B:41:0x00f8->B:63:0x01fe, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0121 A[EDGE_INSN: B:76:0x0121->B:43:0x0121 BREAK  A[LOOP:5: B:41:0x00f8->B:63:0x01fe], SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m1678d(java.lang.Object r26) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.s0.m1678d(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x024a, code lost:
    
        if (r2.mo14775g(r10, r40) == r6) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x018f  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m1679e(java.lang.Object r41) {
        /*
            Method dump skipped, instructions count: 888
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.s0.m1679e(java.lang.Object):java.lang.Object");
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f3825a) {
            case 0:
                return new s0(0, (y0) this.f3828d, interfaceC7559c, this.f3827c);
            case 1:
                return new s0(1, (C0790h) this.f3828d, interfaceC7559c, this.f3827c);
            case 2:
                return new s0(this.f3827c, (C2100l) this.f3828d, interfaceC7559c);
            case 3:
                return new s0((C4252f) this.f3828d, interfaceC7559c, 3);
            case 4:
                return new s0(4, (C5731i) this.f3828d, interfaceC7559c, this.f3827c);
            case 5:
                return new s0((rv.p0) this.f3828d, interfaceC7559c, 5);
            default:
                return new s0(6, (ss.z0) this.f3828d, interfaceC7559c, this.f3827c);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f3825a) {
        }
        return ((s0) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x04b9 A[Catch: Exception -> 0x0288, TryCatch #0 {Exception -> 0x0288, blocks: (B:91:0x0282, B:97:0x0293, B:143:0x04b3, B:145:0x04b9, B:146:0x04bb, B:148:0x051d, B:150:0x052f, B:154:0x0541, B:156:0x0545, B:159:0x05b0, B:162:0x05b8, B:163:0x05ca, B:166:0x0633, B:168:0x0637, B:169:0x0649, B:172:0x06b3, B:173:0x06b8, B:98:0x029a, B:106:0x02b5, B:101:0x02a1, B:103:0x02a9, B:109:0x0319, B:111:0x0327, B:113:0x0335, B:114:0x0358, B:116:0x0376, B:121:0x038b, B:123:0x03a7, B:126:0x03b9, B:128:0x03c7, B:130:0x03d0, B:133:0x0411, B:135:0x0470, B:137:0x0494, B:140:0x049a, B:129:0x03cc, B:125:0x03ac, B:120:0x037e, B:132:0x03f1), top: B:198:0x027a }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0541 A[Catch: Exception -> 0x0288, TryCatch #0 {Exception -> 0x0288, blocks: (B:91:0x0282, B:97:0x0293, B:143:0x04b3, B:145:0x04b9, B:146:0x04bb, B:148:0x051d, B:150:0x052f, B:154:0x0541, B:156:0x0545, B:159:0x05b0, B:162:0x05b8, B:163:0x05ca, B:166:0x0633, B:168:0x0637, B:169:0x0649, B:172:0x06b3, B:173:0x06b8, B:98:0x029a, B:106:0x02b5, B:101:0x02a1, B:103:0x02a9, B:109:0x0319, B:111:0x0327, B:113:0x0335, B:114:0x0358, B:116:0x0376, B:121:0x038b, B:123:0x03a7, B:126:0x03b9, B:128:0x03c7, B:130:0x03d0, B:133:0x0411, B:135:0x0470, B:137:0x0494, B:140:0x049a, B:129:0x03cc, B:125:0x03ac, B:120:0x037e, B:132:0x03f1), top: B:198:0x027a }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x00db A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012d A[Catch: ApiException -> 0x0143, TryCatch #1 {ApiException -> 0x0143, blocks: (B:24:0x0056, B:29:0x0065, B:45:0x00ee, B:47:0x0121, B:49:0x012d, B:54:0x0145, B:30:0x006a, B:37:0x00a8, B:38:0x00ae, B:41:0x00dd, B:57:0x0178, B:34:0x0081), top: B:199:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0145 A[Catch: ApiException -> 0x0143, LOOP:1: B:54:0x0145->B:204:?, LOOP_START, TryCatch #1 {ApiException -> 0x0143, blocks: (B:24:0x0056, B:29:0x0065, B:45:0x00ee, B:47:0x0121, B:49:0x012d, B:54:0x0145, B:30:0x006a, B:37:0x00a8, B:38:0x00ae, B:41:0x00dd, B:57:0x0178, B:34:0x0081), top: B:199:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01aa A[LOOP:2: B:38:0x00ae->B:60:0x01aa, LOOP_END] */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r57) {
        /*
            Method dump skipped, instructions count: 1962
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.s0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(d7.w0 w0Var, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f3825a = i10;
        this.f3828d = w0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(boolean z6, C2100l c2100l, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f3825a = 2;
        this.f3827c = z6;
        this.f3828d = c2100l;
    }
}
