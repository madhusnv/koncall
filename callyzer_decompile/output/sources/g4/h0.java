package g4;

import d3.C1565s;
import og.af;
import pg.AbstractC5941v;
import r4.C6448c;
import r4.C6459n;
import r4.InterfaceC6461p;
import s4.AbstractC6753i;
import s4.C6759o;
import s4.C6760p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class h0 {

    /* renamed from: a */
    public static final long f13623a = af.m10534c(14);

    /* renamed from: b */
    public static final long f13624b = af.m10534c(0);

    /* renamed from: c */
    public static final long f13625c = C1565s.f7816i;

    /* renamed from: d */
    public static final InterfaceC6461p f13626d;

    static {
        long j6 = C1565s.f7809b;
        f13626d = j6 != 16 ? new C6448c(j6) : C6459n.f31121a;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0155  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final g4.g0 m6438a(g4.g0 r24, long r25, d3.AbstractC1561o r27, float r28, long r29, k4.C3998s r31, k4.C3994o r32, k4.C3995p r33, k4.AbstractC3988i r34, java.lang.String r35, long r36, r4.C6446a r38, r4.C6462q r39, n4.C4953b r40, long r41, r4.C6457l r43, d3.k0 r44, g4.C2509y r45, f3.AbstractC2199e r46) {
        /*
            Method dump skipped, instructions count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.h0.m6438a(g4.g0, long, d3.o, float, long, k4.s, k4.o, k4.p, k4.i, java.lang.String, long, r4.a, r4.q, n4.b, long, r4.l, d3.k0, g4.y, f3.e):g4.g0");
    }

    /* renamed from: b */
    public static final Object m6439b(Object obj, Object obj2, float f6) {
        return ((double) f6) < 0.5d ? obj : obj2;
    }

    /* renamed from: c */
    public static final long m6440c(long j6, long j10, float f6) {
        C6760p[] c6760pArr = C6759o.f32212b;
        long j11 = j6 & 1095216660480L;
        if (j11 != 0) {
            long j12 = 1095216660480L & j10;
            if (j12 != 0) {
                if (j11 == 0 || j12 == 0) {
                    AbstractC6753i.m12938a("Cannot perform operation for Unspecified type.");
                }
                if (!C6760p.m12956a(C6759o.m12953b(j6), C6759o.m12953b(j10))) {
                    AbstractC6753i.m12938a("Cannot perform operation for " + ((Object) C6760p.m12957b(C6759o.m12953b(j6))) + " and " + ((Object) C6760p.m12957b(C6759o.m12953b(j10))));
                }
                return af.m10535d(AbstractC5941v.m11891e(C6759o.m12954c(j6), C6759o.m12954c(j10), f6), j11);
            }
        }
        return ((C6759o) m6439b(new C6759o(j6), new C6759o(j10), f6)).f32214a;
    }
}
