package p001o;

import p001o.bme;

/* loaded from: classes5.dex */
public class plh implements bme, wle {

    /* renamed from: a */
    public final bme f40242a;

    /* renamed from: b */
    public final Object f40243b;

    /* renamed from: c */
    public volatile wle f40244c;

    /* renamed from: d */
    public volatile wle f40245d;

    /* renamed from: e */
    public bme.EnumC12455a f40246e;

    /* renamed from: f */
    public bme.EnumC12455a f40247f;

    /* renamed from: g */
    public boolean f40248g;

    public plh(Object obj, bme bmeVar) {
        bme.EnumC12455a enumC12455a = bme.EnumC12455a.CLEARED;
        this.f40246e = enumC12455a;
        this.f40247f = enumC12455a;
        this.f40243b = obj;
        this.f40242a = bmeVar;
    }

    @Override // p001o.bme, p001o.wle
    /* renamed from: a */
    public boolean mo19377a() {
        boolean z;
        synchronized (this.f40243b) {
            z = this.f40245d.mo19377a() || this.f40244c.mo19377a();
        }
        return z;
    }

    @Override // p001o.bme
    /* renamed from: b */
    public bme mo19378b() {
        bme bmeVarMo19378b;
        synchronized (this.f40243b) {
            bme bmeVar = this.f40242a;
            bmeVarMo19378b = bmeVar != null ? bmeVar.mo19378b() : this;
        }
        return bmeVarMo19378b;
    }

    @Override // p001o.bme
    /* renamed from: c */
    public void mo19379c(wle wleVar) {
        synchronized (this.f40243b) {
            if (wleVar.equals(this.f40245d)) {
                this.f40247f = bme.EnumC12455a.SUCCESS;
                return;
            }
            this.f40246e = bme.EnumC12455a.SUCCESS;
            bme bmeVar = this.f40242a;
            if (bmeVar != null) {
                bmeVar.mo19379c(this);
            }
            if (!this.f40247f.isComplete()) {
                this.f40245d.clear();
            }
        }
    }

    @Override // p001o.wle
    public void clear() {
        synchronized (this.f40243b) {
            this.f40248g = false;
            bme.EnumC12455a enumC12455a = bme.EnumC12455a.CLEARED;
            this.f40246e = enumC12455a;
            this.f40247f = enumC12455a;
            this.f40245d.clear();
            this.f40244c.clear();
        }
    }

    @Override // p001o.wle
    /* renamed from: d */
    public boolean mo43854d(wle wleVar) {
        if (!(wleVar instanceof plh)) {
            return false;
        }
        plh plhVar = (plh) wleVar;
        if (this.f40244c == null) {
            if (plhVar.f40244c != null) {
                return false;
            }
        } else if (!this.f40244c.mo43854d(plhVar.f40244c)) {
            return false;
        }
        if (this.f40245d == null) {
            if (plhVar.f40245d != null) {
                return false;
            }
        } else if (!this.f40245d.mo43854d(plhVar.f40245d)) {
            return false;
        }
        return true;
    }

    @Override // p001o.bme
    /* renamed from: e */
    public void mo19380e(wle wleVar) {
        synchronized (this.f40243b) {
            if (!wleVar.equals(this.f40244c)) {
                this.f40247f = bme.EnumC12455a.FAILED;
                return;
            }
            this.f40246e = bme.EnumC12455a.FAILED;
            bme bmeVar = this.f40242a;
            if (bmeVar != null) {
                bmeVar.mo19380e(this);
            }
        }
    }

    @Override // p001o.wle
    /* renamed from: f */
    public boolean mo43855f() {
        boolean z;
        synchronized (this.f40243b) {
            z = this.f40246e == bme.EnumC12455a.CLEARED;
        }
        return z;
    }

    @Override // p001o.bme
    /* renamed from: g */
    public boolean mo19381g(wle wleVar) {
        boolean z;
        synchronized (this.f40243b) {
            z = m43859m() && (wleVar.equals(this.f40244c) || this.f40246e != bme.EnumC12455a.SUCCESS);
        }
        return z;
    }

    @Override // p001o.bme
    /* renamed from: h */
    public boolean mo19382h(wle wleVar) {
        boolean z;
        synchronized (this.f40243b) {
            z = m43858l() && wleVar.equals(this.f40244c) && !mo19377a();
        }
        return z;
    }

    @Override // p001o.bme
    /* renamed from: i */
    public boolean mo19383i(wle wleVar) {
        boolean z;
        synchronized (this.f40243b) {
            z = m43857k() && wleVar.equals(this.f40244c) && this.f40246e != bme.EnumC12455a.PAUSED;
        }
        return z;
    }

    @Override // p001o.wle
    public boolean isComplete() {
        boolean z;
        synchronized (this.f40243b) {
            z = this.f40246e == bme.EnumC12455a.SUCCESS;
        }
        return z;
    }

    @Override // p001o.wle
    public boolean isRunning() {
        boolean z;
        synchronized (this.f40243b) {
            z = this.f40246e == bme.EnumC12455a.RUNNING;
        }
        return z;
    }

    @Override // p001o.wle
    /* renamed from: j */
    public void mo43856j() {
        synchronized (this.f40243b) {
            this.f40248g = true;
            try {
                if (this.f40246e != bme.EnumC12455a.SUCCESS) {
                    bme.EnumC12455a enumC12455a = this.f40247f;
                    bme.EnumC12455a enumC12455a2 = bme.EnumC12455a.RUNNING;
                    if (enumC12455a != enumC12455a2) {
                        this.f40247f = enumC12455a2;
                        this.f40245d.mo43856j();
                    }
                }
                if (this.f40248g) {
                    bme.EnumC12455a enumC12455a3 = this.f40246e;
                    bme.EnumC12455a enumC12455a4 = bme.EnumC12455a.RUNNING;
                    if (enumC12455a3 != enumC12455a4) {
                        this.f40246e = enumC12455a4;
                        this.f40244c.mo43856j();
                    }
                }
            } finally {
                this.f40248g = false;
            }
        }
    }

    /* renamed from: k */
    public final boolean m43857k() {
        bme bmeVar = this.f40242a;
        return bmeVar == null || bmeVar.mo19383i(this);
    }

    /* renamed from: l */
    public final boolean m43858l() {
        bme bmeVar = this.f40242a;
        return bmeVar == null || bmeVar.mo19382h(this);
    }

    /* renamed from: m */
    public final boolean m43859m() {
        bme bmeVar = this.f40242a;
        return bmeVar == null || bmeVar.mo19381g(this);
    }

    /* renamed from: n */
    public void m43860n(wle wleVar, wle wleVar2) {
        this.f40244c = wleVar;
        this.f40245d = wleVar2;
    }

    @Override // p001o.wle
    public void pause() {
        synchronized (this.f40243b) {
            if (!this.f40247f.isComplete()) {
                this.f40247f = bme.EnumC12455a.PAUSED;
                this.f40245d.pause();
            }
            if (!this.f40246e.isComplete()) {
                this.f40246e = bme.EnumC12455a.PAUSED;
                this.f40244c.pause();
            }
        }
    }
}
