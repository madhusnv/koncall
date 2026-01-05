package p001o;

import p001o.ms6;

/* loaded from: classes5.dex */
public final class pia implements zne, ms6.InterfaceC15418f {

    /* renamed from: e */
    public static final ged f40143e = ms6.m39603d(20, new C16122a());

    /* renamed from: a */
    public final h5g f40144a = h5g.m29827a();

    /* renamed from: b */
    public zne f40145b;

    /* renamed from: c */
    public boolean f40146c;

    /* renamed from: d */
    public boolean f40147d;

    /* renamed from: o.pia$a */
    public class C16122a implements ms6.InterfaceC15416d {
        @Override // p001o.ms6.InterfaceC15416d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public pia create() {
            return new pia();
        }
    }

    /* renamed from: c */
    public static pia m43729c(zne zneVar) {
        pia piaVar = (pia) bgd.m18886d((pia) f40143e.mo28526b());
        piaVar.m43730a(zneVar);
        return piaVar;
    }

    /* renamed from: a */
    public final void m43730a(zne zneVar) {
        this.f40147d = false;
        this.f40146c = true;
        this.f40145b = zneVar;
    }

    @Override // p001o.zne
    /* renamed from: b */
    public synchronized void mo19618b() {
        this.f40144a.mo29829c();
        this.f40147d = true;
        if (!this.f40146c) {
            this.f40145b.mo19618b();
            m43731e();
        }
    }

    @Override // p001o.ms6.InterfaceC15418f
    /* renamed from: d */
    public h5g mo18850d() {
        return this.f40144a;
    }

    /* renamed from: e */
    public final void m43731e() {
        this.f40145b = null;
        f40143e.mo28525a(this);
    }

    /* renamed from: f */
    public synchronized void m43732f() {
        this.f40144a.mo29829c();
        if (!this.f40146c) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f40146c = false;
        if (this.f40147d) {
            mo19618b();
        }
    }

    @Override // p001o.zne
    public Object get() {
        return this.f40145b.get();
    }

    @Override // p001o.zne
    /* renamed from: j */
    public int mo19619j() {
        return this.f40145b.mo19619j();
    }

    @Override // p001o.zne
    /* renamed from: k */
    public Class mo19620k() {
        return this.f40145b.mo19620k();
    }
}
