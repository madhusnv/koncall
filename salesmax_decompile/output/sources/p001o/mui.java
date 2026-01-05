package p001o;

import p001o.jui;

/* loaded from: classes2.dex */
public final class mui {

    /* renamed from: a */
    public final InterfaceC15435a f36007a;

    /* renamed from: b */
    public final jui f36008b;

    /* renamed from: g */
    public bvi f36013g;

    /* renamed from: i */
    public long f36015i;

    /* renamed from: c */
    public final jui.C14667a f36009c = new jui.C14667a();

    /* renamed from: d */
    public final kmh f36010d = new kmh();

    /* renamed from: e */
    public final kmh f36011e = new kmh();

    /* renamed from: f */
    public final fla f36012f = new fla();

    /* renamed from: h */
    public bvi f36014h = bvi.f16878e;

    /* renamed from: j */
    public long f36016j = -9223372036854775807L;

    /* renamed from: o.mui$a */
    public interface InterfaceC15435a {
        /* renamed from: a */
        void mo39711a();

        /* renamed from: b */
        void mo39712b(long j, long j2, long j3, boolean z);

        /* renamed from: c */
        void mo39713c(bvi bviVar);
    }

    public mui(InterfaceC15435a interfaceC15435a, jui juiVar) {
        this.f36007a = interfaceC15435a;
        this.f36008b = juiVar;
    }

    /* renamed from: c */
    public static Object m39701c(kmh kmhVar) {
        op0.m42511a(kmhVar.m35943l() > 0);
        while (kmhVar.m35943l() > 1) {
            kmhVar.m35940i();
        }
        return op0.m42515e(kmhVar.m35940i());
    }

    /* renamed from: a */
    public final void m39702a() {
        op0.m42519i(Long.valueOf(this.f36012f.m27026d()));
        this.f36007a.mo39711a();
    }

    /* renamed from: b */
    public void m39703b() {
        this.f36012f.m27023a();
        this.f36016j = -9223372036854775807L;
        if (this.f36011e.m35943l() > 0) {
            this.f36011e.m35933a(0L, Long.valueOf(((Long) m39701c(this.f36011e)).longValue()));
        }
        if (this.f36013g != null) {
            this.f36010d.m35935c();
        } else if (this.f36010d.m35943l() > 0) {
            this.f36013g = (bvi) m39701c(this.f36010d);
        }
    }

    /* renamed from: d */
    public boolean m39704d(long j) {
        long j2 = this.f36016j;
        return j2 != -9223372036854775807L && j2 >= j;
    }

    /* renamed from: e */
    public boolean m39705e() {
        return this.f36008b.m34543d(true);
    }

    /* renamed from: f */
    public final boolean m39706f(long j) {
        Long l = (Long) this.f36011e.m35941j(j);
        if (l == null || l.longValue() == this.f36015i) {
            return false;
        }
        this.f36015i = l.longValue();
        return true;
    }

    /* renamed from: g */
    public final boolean m39707g(long j) {
        bvi bviVar = (bvi) this.f36010d.m35941j(j);
        if (bviVar == null || bviVar.equals(bvi.f16878e) || bviVar.equals(this.f36014h)) {
            return false;
        }
        this.f36014h = bviVar;
        return true;
    }

    /* renamed from: h */
    public void m39708h(long j, long j2) {
        while (!this.f36012f.m27025c()) {
            long jM27024b = this.f36012f.m27024b();
            if (m39706f(jM27024b)) {
                this.f36008b.m34549j();
            }
            int iM34542c = this.f36008b.m34542c(jM27024b, j, j2, this.f36015i, false, this.f36009c);
            if (iM34542c == 0 || iM34542c == 1) {
                this.f36016j = jM27024b;
                m39709i(iM34542c == 0);
            } else if (iM34542c != 2 && iM34542c != 3 && iM34542c != 4) {
                if (iM34542c != 5) {
                    throw new IllegalStateException(String.valueOf(iM34542c));
                }
                return;
            } else {
                this.f36016j = jM27024b;
                m39702a();
            }
        }
    }

    /* renamed from: i */
    public final void m39709i(boolean z) {
        long jLongValue = ((Long) op0.m42519i(Long.valueOf(this.f36012f.m27026d()))).longValue();
        if (m39707g(jLongValue)) {
            this.f36007a.mo39713c(this.f36014h);
        }
        this.f36007a.mo39712b(z ? -1L : this.f36009c.m34565g(), jLongValue, this.f36015i, this.f36008b.m34548i());
    }

    /* renamed from: j */
    public void m39710j(float f) {
        op0.m42511a(f > 0.0f);
        this.f36008b.m34557r(f);
    }
}
