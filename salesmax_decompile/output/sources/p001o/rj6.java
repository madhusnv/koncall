package p001o;

import p001o.bme;

/* loaded from: classes5.dex */
public final class rj6 implements bme, wle {

    /* renamed from: a */
    public final Object f43706a;

    /* renamed from: b */
    public final bme f43707b;

    /* renamed from: c */
    public volatile wle f43708c;

    /* renamed from: d */
    public volatile wle f43709d;

    /* renamed from: e */
    public bme.EnumC12455a f43710e;

    /* renamed from: f */
    public bme.EnumC12455a f43711f;

    public rj6(Object obj, bme bmeVar) {
        bme.EnumC12455a enumC12455a = bme.EnumC12455a.CLEARED;
        this.f43710e = enumC12455a;
        this.f43711f = enumC12455a;
        this.f43706a = obj;
        this.f43707b = bmeVar;
    }

    @Override // p001o.bme, p001o.wle
    /* renamed from: a */
    public boolean mo19377a() {
        boolean z;
        synchronized (this.f43706a) {
            z = this.f43708c.mo19377a() || this.f43709d.mo19377a();
        }
        return z;
    }

    @Override // p001o.bme
    /* renamed from: b */
    public bme mo19378b() {
        bme bmeVarMo19378b;
        synchronized (this.f43706a) {
            bme bmeVar = this.f43707b;
            bmeVarMo19378b = bmeVar != null ? bmeVar.mo19378b() : this;
        }
        return bmeVarMo19378b;
    }

    @Override // p001o.bme
    /* renamed from: c */
    public void mo19379c(wle wleVar) {
        synchronized (this.f43706a) {
            if (wleVar.equals(this.f43708c)) {
                this.f43710e = bme.EnumC12455a.SUCCESS;
            } else if (wleVar.equals(this.f43709d)) {
                this.f43711f = bme.EnumC12455a.SUCCESS;
            }
            bme bmeVar = this.f43707b;
            if (bmeVar != null) {
                bmeVar.mo19379c(this);
            }
        }
    }

    @Override // p001o.wle
    public void clear() {
        synchronized (this.f43706a) {
            bme.EnumC12455a enumC12455a = bme.EnumC12455a.CLEARED;
            this.f43710e = enumC12455a;
            this.f43708c.clear();
            if (this.f43711f != enumC12455a) {
                this.f43711f = enumC12455a;
                this.f43709d.clear();
            }
        }
    }

    @Override // p001o.wle
    /* renamed from: d */
    public boolean mo43854d(wle wleVar) {
        if (!(wleVar instanceof rj6)) {
            return false;
        }
        rj6 rj6Var = (rj6) wleVar;
        return this.f43708c.mo43854d(rj6Var.f43708c) && this.f43709d.mo43854d(rj6Var.f43709d);
    }

    @Override // p001o.bme
    /* renamed from: e */
    public void mo19380e(wle wleVar) {
        synchronized (this.f43706a) {
            if (wleVar.equals(this.f43709d)) {
                this.f43711f = bme.EnumC12455a.FAILED;
                bme bmeVar = this.f43707b;
                if (bmeVar != null) {
                    bmeVar.mo19380e(this);
                }
                return;
            }
            this.f43710e = bme.EnumC12455a.FAILED;
            bme.EnumC12455a enumC12455a = this.f43711f;
            bme.EnumC12455a enumC12455a2 = bme.EnumC12455a.RUNNING;
            if (enumC12455a != enumC12455a2) {
                this.f43711f = enumC12455a2;
                this.f43709d.mo43856j();
            }
        }
    }

    @Override // p001o.wle
    /* renamed from: f */
    public boolean mo43855f() {
        boolean z;
        synchronized (this.f43706a) {
            bme.EnumC12455a enumC12455a = this.f43710e;
            bme.EnumC12455a enumC12455a2 = bme.EnumC12455a.CLEARED;
            z = enumC12455a == enumC12455a2 && this.f43711f == enumC12455a2;
        }
        return z;
    }

    @Override // p001o.bme
    /* renamed from: g */
    public boolean mo19381g(wle wleVar) {
        boolean zM46862n;
        synchronized (this.f43706a) {
            zM46862n = m46862n();
        }
        return zM46862n;
    }

    @Override // p001o.bme
    /* renamed from: h */
    public boolean mo19382h(wle wleVar) {
        boolean z;
        synchronized (this.f43706a) {
            z = m46861m() && m46859k(wleVar);
        }
        return z;
    }

    @Override // p001o.bme
    /* renamed from: i */
    public boolean mo19383i(wle wleVar) {
        boolean z;
        synchronized (this.f43706a) {
            z = m46860l() && wleVar.equals(this.f43708c);
        }
        return z;
    }

    @Override // p001o.wle
    public boolean isComplete() {
        boolean z;
        synchronized (this.f43706a) {
            bme.EnumC12455a enumC12455a = this.f43710e;
            bme.EnumC12455a enumC12455a2 = bme.EnumC12455a.SUCCESS;
            z = enumC12455a == enumC12455a2 || this.f43711f == enumC12455a2;
        }
        return z;
    }

    @Override // p001o.wle
    public boolean isRunning() {
        boolean z;
        synchronized (this.f43706a) {
            bme.EnumC12455a enumC12455a = this.f43710e;
            bme.EnumC12455a enumC12455a2 = bme.EnumC12455a.RUNNING;
            z = enumC12455a == enumC12455a2 || this.f43711f == enumC12455a2;
        }
        return z;
    }

    @Override // p001o.wle
    /* renamed from: j */
    public void mo43856j() {
        synchronized (this.f43706a) {
            bme.EnumC12455a enumC12455a = this.f43710e;
            bme.EnumC12455a enumC12455a2 = bme.EnumC12455a.RUNNING;
            if (enumC12455a != enumC12455a2) {
                this.f43710e = enumC12455a2;
                this.f43708c.mo43856j();
            }
        }
    }

    /* renamed from: k */
    public final boolean m46859k(wle wleVar) {
        bme.EnumC12455a enumC12455a;
        bme.EnumC12455a enumC12455a2 = this.f43710e;
        bme.EnumC12455a enumC12455a3 = bme.EnumC12455a.FAILED;
        return enumC12455a2 != enumC12455a3 ? wleVar.equals(this.f43708c) : wleVar.equals(this.f43709d) && ((enumC12455a = this.f43711f) == bme.EnumC12455a.SUCCESS || enumC12455a == enumC12455a3);
    }

    /* renamed from: l */
    public final boolean m46860l() {
        bme bmeVar = this.f43707b;
        return bmeVar == null || bmeVar.mo19383i(this);
    }

    /* renamed from: m */
    public final boolean m46861m() {
        bme bmeVar = this.f43707b;
        return bmeVar == null || bmeVar.mo19382h(this);
    }

    /* renamed from: n */
    public final boolean m46862n() {
        bme bmeVar = this.f43707b;
        return bmeVar == null || bmeVar.mo19381g(this);
    }

    /* renamed from: o */
    public void m46863o(wle wleVar, wle wleVar2) {
        this.f43708c = wleVar;
        this.f43709d = wleVar2;
    }

    @Override // p001o.wle
    public void pause() {
        synchronized (this.f43706a) {
            bme.EnumC12455a enumC12455a = this.f43710e;
            bme.EnumC12455a enumC12455a2 = bme.EnumC12455a.RUNNING;
            if (enumC12455a == enumC12455a2) {
                this.f43710e = bme.EnumC12455a.PAUSED;
                this.f43708c.pause();
            }
            if (this.f43711f == enumC12455a2) {
                this.f43711f = bme.EnumC12455a.PAUSED;
                this.f43709d.pause();
            }
        }
    }
}
