package p001o;

/* loaded from: classes6.dex */
public final class eo3 extends vn3 {

    /* renamed from: c */
    public final boolean f21976c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eo3(up8 up8Var, boolean z) {
        super(up8Var);
        sq8.m48649h(up8Var, "writer");
        this.f21976c = z;
    }

    @Override // p001o.vn3
    /* renamed from: e */
    public void mo25362e(byte b) {
        boolean z = this.f21976c;
        String strM55514g = wzh.m55514g(wzh.m55511c(b));
        if (z) {
            mo53032n(strM55514g);
        } else {
            m53030k(strM55514g);
        }
    }

    @Override // p001o.vn3
    /* renamed from: i */
    public void mo25363i(int i) {
        boolean z = this.f21976c;
        int iM33018c = j0i.m33018c(i);
        if (z) {
            mo53032n(Long.toString(iM33018c & 4294967295L, 10));
        } else {
            m53030k(Long.toString(iM33018c & 4294967295L, 10));
        }
    }

    @Override // p001o.vn3
    /* renamed from: j */
    public void mo25364j(long j) {
        boolean z = this.f21976c;
        long jM42841c = p0i.m42841c(j);
        if (z) {
            mo53032n(do3.m23635a(jM42841c, 10));
        } else {
            m53030k(co3.m21543a(jM42841c, 10));
        }
    }

    @Override // p001o.vn3
    /* renamed from: l */
    public void mo25365l(short s) {
        boolean z = this.f21976c;
        String strM22249g = d1i.m22249g(d1i.m22246c(s));
        if (z) {
            mo53032n(strM22249g);
        } else {
            m53030k(strM22249g);
        }
    }
}
