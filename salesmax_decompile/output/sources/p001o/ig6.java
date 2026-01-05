package p001o;

/* loaded from: classes5.dex */
public class ig6 implements zne {

    /* renamed from: a */
    public final boolean f28635a;

    /* renamed from: b */
    public final boolean f28636b;

    /* renamed from: c */
    public final zne f28637c;

    /* renamed from: d */
    public final InterfaceC14285a f28638d;

    /* renamed from: e */
    public final ic9 f28639e;

    /* renamed from: f */
    public int f28640f;

    /* renamed from: g */
    public boolean f28641g;

    /* renamed from: o.ig6$a */
    public interface InterfaceC14285a {
        /* renamed from: b */
        void mo32109b(ic9 ic9Var, ig6 ig6Var);
    }

    public ig6(zne zneVar, boolean z, boolean z2, ic9 ic9Var, InterfaceC14285a interfaceC14285a) {
        this.f28637c = (zne) bgd.m18886d(zneVar);
        this.f28635a = z;
        this.f28636b = z2;
        this.f28639e = ic9Var;
        this.f28638d = (InterfaceC14285a) bgd.m18886d(interfaceC14285a);
    }

    /* renamed from: a */
    public synchronized void m32105a() {
        if (this.f28641g) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f28640f++;
    }

    @Override // p001o.zne
    /* renamed from: b */
    public synchronized void mo19618b() {
        if (this.f28640f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f28641g) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f28641g = true;
        if (this.f28636b) {
            this.f28637c.mo19618b();
        }
    }

    /* renamed from: c */
    public zne m32106c() {
        return this.f28637c;
    }

    /* renamed from: d */
    public boolean m32107d() {
        return this.f28635a;
    }

    /* renamed from: e */
    public void m32108e() {
        boolean z;
        synchronized (this) {
            int i = this.f28640f;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z = true;
            int i2 = i - 1;
            this.f28640f = i2;
            if (i2 != 0) {
                z = false;
            }
        }
        if (z) {
            this.f28638d.mo32109b(this.f28639e, this);
        }
    }

    @Override // p001o.zne
    public Object get() {
        return this.f28637c.get();
    }

    @Override // p001o.zne
    /* renamed from: j */
    public int mo19619j() {
        return this.f28637c.mo19619j();
    }

    @Override // p001o.zne
    /* renamed from: k */
    public Class mo19620k() {
        return this.f28637c.mo19620k();
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f28635a + ", listener=" + this.f28638d + ", key=" + this.f28639e + ", acquired=" + this.f28640f + ", isRecycled=" + this.f28641g + ", resource=" + this.f28637c + '}';
    }
}
