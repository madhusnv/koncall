package p001o;

import com.google.android.gms.location.DeviceOrientationRequest;
import p001o.qh1;

/* loaded from: classes2.dex */
public final class z2e extends qh1 {

    /* renamed from: o.z2e$b */
    public static final class C18547b implements qh1.InterfaceC16407f {

        /* renamed from: a */
        public final umh f56441a;

        /* renamed from: b */
        public final zwc f56442b;

        /* renamed from: d */
        public static void m58662d(zwc zwcVar) {
            int iM58661k;
            int iM60026g = zwcVar.m60026g();
            if (zwcVar.m60020a() < 10) {
                zwcVar.m60017U(iM60026g);
                return;
            }
            zwcVar.m60018V(9);
            int iM60004H = zwcVar.m60004H() & 7;
            if (zwcVar.m60020a() < iM60004H) {
                zwcVar.m60017U(iM60026g);
                return;
            }
            zwcVar.m60018V(iM60004H);
            if (zwcVar.m60020a() < 4) {
                zwcVar.m60017U(iM60026g);
                return;
            }
            if (z2e.m58661k(zwcVar.m60024e(), zwcVar.m60025f()) == 443) {
                zwcVar.m60018V(4);
                int iM60010N = zwcVar.m60010N();
                if (zwcVar.m60020a() < iM60010N) {
                    zwcVar.m60017U(iM60026g);
                    return;
                }
                zwcVar.m60018V(iM60010N);
            }
            while (zwcVar.m60020a() >= 4 && (iM58661k = z2e.m58661k(zwcVar.m60024e(), zwcVar.m60025f())) != 442 && iM58661k != 441 && (iM58661k >>> 8) == 1) {
                zwcVar.m60018V(4);
                if (zwcVar.m60020a() < 2) {
                    zwcVar.m60017U(iM60026g);
                    return;
                }
                zwcVar.m60017U(Math.min(zwcVar.m60026g(), zwcVar.m60025f() + zwcVar.m60010N()));
            }
        }

        @Override // p001o.qh1.InterfaceC16407f
        /* renamed from: a */
        public qh1.C16406e mo20094a(uq6 uq6Var, long j) {
            long position = uq6Var.getPosition();
            int iMin = (int) Math.min(DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT, uq6Var.getLength() - position);
            this.f56442b.m60013Q(iMin);
            uq6Var.mo40498m(this.f56442b.m60024e(), 0, iMin);
            return m58663c(this.f56442b, j, position);
        }

        @Override // p001o.qh1.InterfaceC16407f
        /* renamed from: b */
        public void mo23957b() {
            this.f56442b.m60014R(sqi.f45795f);
        }

        /* renamed from: c */
        public final qh1.C16406e m58663c(zwc zwcVar, long j, long j2) {
            int iM60025f = -1;
            int iM60025f2 = -1;
            long j3 = -9223372036854775807L;
            while (zwcVar.m60020a() >= 4) {
                if (z2e.m58661k(zwcVar.m60024e(), zwcVar.m60025f()) != 442) {
                    zwcVar.m60018V(1);
                } else {
                    zwcVar.m60018V(4);
                    long jM16387l = a3e.m16387l(zwcVar);
                    if (jM16387l != -9223372036854775807L) {
                        long jM51795b = this.f56441a.m51795b(jM16387l);
                        if (jM51795b > j) {
                            return j3 == -9223372036854775807L ? qh1.C16406e.m45482d(jM51795b, j2) : qh1.C16406e.m45483e(j2 + iM60025f2);
                        }
                        if (100000 + jM51795b > j) {
                            return qh1.C16406e.m45483e(j2 + zwcVar.m60025f());
                        }
                        iM60025f2 = zwcVar.m60025f();
                        j3 = jM51795b;
                    }
                    m58662d(zwcVar);
                    iM60025f = zwcVar.m60025f();
                }
            }
            return j3 != -9223372036854775807L ? qh1.C16406e.m45484f(j3, j2 + iM60025f) : qh1.C16406e.f42003d;
        }

        public C18547b(umh umhVar) {
            this.f56441a = umhVar;
            this.f56442b = new zwc();
        }
    }

    public z2e(umh umhVar, long j, long j2) {
        super(new qh1.C16403b(), new C18547b(umhVar), j, 0L, j + 1, 0L, j2, 188L, 1000);
    }

    /* renamed from: k */
    public static int m58661k(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
