package p001o;

/* loaded from: classes6.dex */
public final class s57 extends o7 {

    /* renamed from: o.s57$a */
    public static final class C16748a extends ouf {
        public C16748a(qag qagVar) {
            super(qagVar);
        }

        @Override // p001o.ouf
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo42709c(u1c u1cVar) {
            if (u1cVar.m50853g()) {
                fwe.m27599r(u1cVar.m50850d());
            }
        }

        @Override // p001o.qag
        /* renamed from: e */
        public void mo18166e(Object obj) {
            this.f38945d++;
            this.f38942a.mo18166e(u1c.m50849c(obj));
        }

        @Override // p001o.qag
        public void onComplete() {
            m42708a(u1c.m50847a());
        }

        @Override // p001o.qag
        public void onError(Throwable th) {
            m42708a(u1c.m50848b(th));
        }
    }

    public s57(s47 s47Var) {
        super(s47Var);
    }

    @Override // p001o.s47
    public void c0(qag qagVar) {
        this.f37840b.b0(new C16748a(qagVar));
    }
}
