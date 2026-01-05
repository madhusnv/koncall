package p001o;

/* loaded from: classes2.dex */
public abstract class df2 {
    /* renamed from: a */
    public static void m22956a(long j, zwc zwcVar, uth[] uthVarArr) {
        while (true) {
            if (zwcVar.m60020a() <= 1) {
                return;
            }
            int iM22958c = m22958c(zwcVar);
            int iM22958c2 = m22958c(zwcVar);
            int iM60025f = zwcVar.m60025f() + iM22958c2;
            if (iM22958c2 == -1 || iM22958c2 > zwcVar.m60020a()) {
                ria.m46824h("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                iM60025f = zwcVar.m60026g();
            } else if (iM22958c == 4 && iM22958c2 >= 8) {
                int iM60004H = zwcVar.m60004H();
                int iM60010N = zwcVar.m60010N();
                int iM60036q = iM60010N == 49 ? zwcVar.m60036q() : 0;
                int iM60004H2 = zwcVar.m60004H();
                if (iM60010N == 47) {
                    zwcVar.m60018V(1);
                }
                boolean z = iM60004H == 181 && (iM60010N == 49 || iM60010N == 47) && iM60004H2 == 3;
                if (iM60010N == 49) {
                    z &= iM60036q == 1195456820;
                }
                if (z) {
                    m22957b(j, zwcVar, uthVarArr);
                }
            }
            zwcVar.m60017U(iM60025f);
        }
    }

    /* renamed from: b */
    public static void m22957b(long j, zwc zwcVar, uth[] uthVarArr) {
        int iM60004H = zwcVar.m60004H();
        if ((iM60004H & 64) != 0) {
            zwcVar.m60018V(1);
            int i = (iM60004H & 31) * 3;
            int iM60025f = zwcVar.m60025f();
            for (uth uthVar : uthVarArr) {
                zwcVar.m60017U(iM60025f);
                uthVar.m52027e(zwcVar, i);
                op0.m42517g(j != -9223372036854775807L);
                uthVar.mo7071a(j, 1, i, 0, null);
            }
        }
    }

    /* renamed from: c */
    public static int m22958c(zwc zwcVar) {
        int i = 0;
        while (zwcVar.m60020a() != 0) {
            int iM60004H = zwcVar.m60004H();
            i += iM60004H;
            if (iM60004H != 255) {
                return i;
            }
        }
        return -1;
    }
}
