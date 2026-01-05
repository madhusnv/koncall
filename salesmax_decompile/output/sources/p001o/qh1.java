package p001o;

import com.google.android.gms.cast.MediaStatus;
import p001o.zaf;

/* loaded from: classes2.dex */
public abstract class qh1 {

    /* renamed from: a */
    public final C16402a f41984a;

    /* renamed from: b */
    public final InterfaceC16407f f41985b;

    /* renamed from: c */
    public C16404c f41986c;

    /* renamed from: d */
    public final int f41987d;

    /* renamed from: o.qh1$a */
    public static class C16402a implements zaf {

        /* renamed from: a */
        public final InterfaceC16405d f41988a;

        /* renamed from: b */
        public final long f41989b;

        /* renamed from: c */
        public final long f41990c;

        /* renamed from: d */
        public final long f41991d;

        /* renamed from: e */
        public final long f41992e;

        /* renamed from: f */
        public final long f41993f;

        /* renamed from: g */
        public final long f41994g;

        public C16402a(InterfaceC16405d interfaceC16405d, long j, long j2, long j3, long j4, long j5, long j6) {
            this.f41988a = interfaceC16405d;
            this.f41989b = j;
            this.f41990c = j2;
            this.f41991d = j3;
            this.f41992e = j4;
            this.f41993f = j5;
            this.f41994g = j6;
        }

        @Override // p001o.zaf
        /* renamed from: e */
        public zaf.C18603a mo25530e(long j) {
            return new zaf.C18603a(new bbf(j, C16404c.m45470h(this.f41988a.mo18114a(j), this.f41990c, this.f41991d, this.f41992e, this.f41993f, this.f41994g)));
        }

        @Override // p001o.zaf
        public long getDurationUs() {
            return this.f41989b;
        }

        @Override // p001o.zaf
        /* renamed from: h */
        public boolean mo25531h() {
            return true;
        }

        /* renamed from: k */
        public long m45462k(long j) {
            return this.f41988a.mo18114a(j);
        }
    }

    /* renamed from: o.qh1$b */
    public static final class C16403b implements InterfaceC16405d {
        @Override // p001o.qh1.InterfaceC16405d
        /* renamed from: a */
        public long mo18114a(long j) {
            return j;
        }
    }

    /* renamed from: o.qh1$c */
    public static class C16404c {

        /* renamed from: a */
        public final long f41995a;

        /* renamed from: b */
        public final long f41996b;

        /* renamed from: c */
        public final long f41997c;

        /* renamed from: d */
        public long f41998d;

        /* renamed from: e */
        public long f41999e;

        /* renamed from: f */
        public long f42000f;

        /* renamed from: g */
        public long f42001g;

        /* renamed from: h */
        public long f42002h;

        public C16404c(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
            this.f41995a = j;
            this.f41996b = j2;
            this.f41998d = j3;
            this.f41999e = j4;
            this.f42000f = j5;
            this.f42001g = j6;
            this.f41997c = j7;
            this.f42002h = m45470h(j2, j3, j4, j5, j6, j7);
        }

        /* renamed from: h */
        public static long m45470h(long j, long j2, long j3, long j4, long j5, long j6) {
            if (j4 + 1 >= j5 || j2 + 1 >= j3) {
                return j4;
            }
            long j7 = (long) ((j - j2) * ((j5 - j4) / (j3 - j2)));
            return sqi.m48737p(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
        }

        /* renamed from: i */
        public final long m45471i() {
            return this.f42001g;
        }

        /* renamed from: j */
        public final long m45472j() {
            return this.f42000f;
        }

        /* renamed from: k */
        public final long m45473k() {
            return this.f42002h;
        }

        /* renamed from: l */
        public final long m45474l() {
            return this.f41995a;
        }

        /* renamed from: m */
        public final long m45475m() {
            return this.f41996b;
        }

        /* renamed from: n */
        public final void m45476n() {
            this.f42002h = m45470h(this.f41996b, this.f41998d, this.f41999e, this.f42000f, this.f42001g, this.f41997c);
        }

        /* renamed from: o */
        public final void m45477o(long j, long j2) {
            this.f41999e = j;
            this.f42001g = j2;
            m45476n();
        }

        /* renamed from: p */
        public final void m45478p(long j, long j2) {
            this.f41998d = j;
            this.f42000f = j2;
            m45476n();
        }
    }

    /* renamed from: o.qh1$d */
    public interface InterfaceC16405d {
        /* renamed from: a */
        long mo18114a(long j);
    }

    /* renamed from: o.qh1$e */
    public static final class C16406e {

        /* renamed from: d */
        public static final C16406e f42003d = new C16406e(-3, -9223372036854775807L, -1);

        /* renamed from: a */
        public final int f42004a;

        /* renamed from: b */
        public final long f42005b;

        /* renamed from: c */
        public final long f42006c;

        public C16406e(int i, long j, long j2) {
            this.f42004a = i;
            this.f42005b = j;
            this.f42006c = j2;
        }

        /* renamed from: d */
        public static C16406e m45482d(long j, long j2) {
            return new C16406e(-1, j, j2);
        }

        /* renamed from: e */
        public static C16406e m45483e(long j) {
            return new C16406e(0, -9223372036854775807L, j);
        }

        /* renamed from: f */
        public static C16406e m45484f(long j, long j2) {
            return new C16406e(-2, j, j2);
        }
    }

    /* renamed from: o.qh1$f */
    public interface InterfaceC16407f {
        /* renamed from: a */
        C16406e mo20094a(uq6 uq6Var, long j);

        /* renamed from: b */
        default void mo23957b() {
        }
    }

    public qh1(InterfaceC16405d interfaceC16405d, InterfaceC16407f interfaceC16407f, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.f41985b = interfaceC16407f;
        this.f41987d = i;
        this.f41984a = new C16402a(interfaceC16405d, j, j2, j3, j4, j5, j6);
    }

    /* renamed from: a */
    public C16404c m45448a(long j) {
        return new C16404c(j, this.f41984a.m45462k(j), this.f41984a.f41990c, this.f41984a.f41991d, this.f41984a.f41992e, this.f41984a.f41993f, this.f41984a.f41994g);
    }

    /* renamed from: b */
    public final zaf m45449b() {
        return this.f41984a;
    }

    /* renamed from: c */
    public int m45450c(uq6 uq6Var, ued uedVar) {
        while (true) {
            C16404c c16404c = (C16404c) op0.m42519i(this.f41986c);
            long jM45472j = c16404c.m45472j();
            long jM45471i = c16404c.m45471i();
            long jM45473k = c16404c.m45473k();
            if (jM45471i - jM45472j <= this.f41987d) {
                m45452e(false, jM45472j);
                return m45454g(uq6Var, jM45472j, uedVar);
            }
            if (!m45456i(uq6Var, jM45473k)) {
                return m45454g(uq6Var, jM45473k, uedVar);
            }
            uq6Var.mo40490c();
            C16406e c16406eMo20094a = this.f41985b.mo20094a(uq6Var, c16404c.m45475m());
            int i = c16406eMo20094a.f42004a;
            if (i == -3) {
                m45452e(false, jM45473k);
                return m45454g(uq6Var, jM45473k, uedVar);
            }
            if (i == -2) {
                c16404c.m45478p(c16406eMo20094a.f42005b, c16406eMo20094a.f42006c);
            } else {
                if (i != -1) {
                    if (i != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    m45456i(uq6Var, c16406eMo20094a.f42006c);
                    m45452e(true, c16406eMo20094a.f42006c);
                    return m45454g(uq6Var, c16406eMo20094a.f42006c, uedVar);
                }
                c16404c.m45477o(c16406eMo20094a.f42005b, c16406eMo20094a.f42006c);
            }
        }
    }

    /* renamed from: d */
    public final boolean m45451d() {
        return this.f41986c != null;
    }

    /* renamed from: e */
    public final void m45452e(boolean z, long j) {
        this.f41986c = null;
        this.f41985b.mo23957b();
        m45453f(z, j);
    }

    /* renamed from: f */
    public void m45453f(boolean z, long j) {
    }

    /* renamed from: g */
    public final int m45454g(uq6 uq6Var, long j, ued uedVar) {
        if (j == uq6Var.getPosition()) {
            return 0;
        }
        uedVar.f48772a = j;
        return 1;
    }

    /* renamed from: h */
    public final void m45455h(long j) {
        C16404c c16404c = this.f41986c;
        if (c16404c == null || c16404c.m45474l() != j) {
            this.f41986c = m45448a(j);
        }
    }

    /* renamed from: i */
    public final boolean m45456i(uq6 uq6Var, long j) {
        long position = j - uq6Var.getPosition();
        if (position < 0 || position > MediaStatus.COMMAND_STREAM_TRANSFER) {
            return false;
        }
        uq6Var.mo40496k((int) position);
        return true;
    }
}
