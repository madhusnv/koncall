package p001o;

import org.objectweb.asm.Opcodes;

/* loaded from: classes2.dex */
public abstract class f27 {

    /* renamed from: o.f27$a */
    public static final class C13314a {

        /* renamed from: a */
        public long f22562a;
    }

    /* renamed from: a */
    public static boolean m25959a(zwc zwcVar, j27 j27Var, int i) {
        int iM25968j = m25968j(zwcVar, i);
        return iM25968j != -1 && iM25968j <= j27Var.f29615b;
    }

    /* renamed from: b */
    public static boolean m25960b(zwc zwcVar, int i) {
        return zwcVar.m60004H() == sqi.m48745x(zwcVar.m60024e(), i, zwcVar.m60025f() - 1, 0);
    }

    /* renamed from: c */
    public static boolean m25961c(zwc zwcVar, j27 j27Var, boolean z, C13314a c13314a) {
        try {
            long jM60011O = zwcVar.m60011O();
            if (!z) {
                jM60011O *= j27Var.f29615b;
            }
            c13314a.f22562a = jM60011O;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* renamed from: d */
    public static boolean m25962d(zwc zwcVar, j27 j27Var, int i, C13314a c13314a) {
        int iM60025f = zwcVar.m60025f();
        long jM60006J = zwcVar.m60006J();
        long j = jM60006J >>> 16;
        if (j != i) {
            return false;
        }
        return m25965g((int) ((jM60006J >> 4) & 15), j27Var) && m25964f((int) ((jM60006J >> 1) & 7), j27Var) && !(((jM60006J & 1) > 1L ? 1 : ((jM60006J & 1) == 1L ? 0 : -1)) == 0) && m25961c(zwcVar, j27Var, ((j & 1) > 1L ? 1 : ((j & 1) == 1L ? 0 : -1)) == 0, c13314a) && m25959a(zwcVar, j27Var, (int) ((jM60006J >> 12) & 15)) && m25963e(zwcVar, j27Var, (int) ((jM60006J >> 8) & 15)) && m25960b(zwcVar, iM60025f);
    }

    /* renamed from: e */
    public static boolean m25963e(zwc zwcVar, j27 j27Var, int i) {
        int i2 = j27Var.f29618e;
        if (i == 0) {
            return true;
        }
        if (i <= 11) {
            return i == j27Var.f29619f;
        }
        if (i == 12) {
            return zwcVar.m60004H() * 1000 == i2;
        }
        if (i > 14) {
            return false;
        }
        int iM60010N = zwcVar.m60010N();
        if (i == 14) {
            iM60010N *= 10;
        }
        return iM60010N == i2;
    }

    /* renamed from: f */
    public static boolean m25964f(int i, j27 j27Var) {
        return i == 0 || i == j27Var.f29622i;
    }

    /* renamed from: g */
    public static boolean m25965g(int i, j27 j27Var) {
        return i <= 7 ? i == j27Var.f29620g - 1 : i <= 10 && j27Var.f29620g == 2;
    }

    /* renamed from: h */
    public static boolean m25966h(uq6 uq6Var, j27 j27Var, int i, C13314a c13314a) {
        long jMo40493g = uq6Var.mo40493g();
        byte[] bArr = new byte[2];
        uq6Var.mo40498m(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
            uq6Var.mo40490c();
            uq6Var.mo40494h((int) (jMo40493g - uq6Var.getPosition()));
            return false;
        }
        zwc zwcVar = new zwc(16);
        System.arraycopy(bArr, 0, zwcVar.m60024e(), 0, 2);
        zwcVar.m60016T(wq6.m54805c(uq6Var, zwcVar.m60024e(), 2, 14));
        uq6Var.mo40490c();
        uq6Var.mo40494h((int) (jMo40493g - uq6Var.getPosition()));
        return m25962d(zwcVar, j27Var, i, c13314a);
    }

    /* renamed from: i */
    public static long m25967i(uq6 uq6Var, j27 j27Var) throws byc {
        uq6Var.mo40490c();
        uq6Var.mo40494h(1);
        byte[] bArr = new byte[1];
        uq6Var.mo40498m(bArr, 0, 1);
        boolean z = (bArr[0] & 1) == 1;
        uq6Var.mo40494h(2);
        int i = z ? 7 : 6;
        zwc zwcVar = new zwc(i);
        zwcVar.m60016T(wq6.m54805c(uq6Var, zwcVar.m60024e(), 0, i));
        uq6Var.mo40490c();
        C13314a c13314a = new C13314a();
        if (m25961c(zwcVar, j27Var, z, c13314a)) {
            return c13314a.f22562a;
        }
        throw byc.m19921a(null, null);
    }

    /* renamed from: j */
    public static int m25968j(zwc zwcVar, int i) {
        switch (i) {
            case 1:
                return Opcodes.CHECKCAST;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return zwcVar.m60004H() + 1;
            case 7:
                return zwcVar.m60010N() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }
}
