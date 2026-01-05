package p001o;

/* loaded from: classes2.dex */
public final class j41 extends s06 {

    /* renamed from: a */
    public final wfc f29731a;

    /* renamed from: b */
    public final wfc f29732b;

    public j41(wfc wfcVar, wfc wfcVar2) {
        if (wfcVar == null) {
            throw new NullPointerException("Null primaryOutConfig");
        }
        this.f29731a = wfcVar;
        if (wfcVar2 == null) {
            throw new NullPointerException("Null secondaryOutConfig");
        }
        this.f29732b = wfcVar2;
    }

    @Override // p001o.s06
    /* renamed from: a */
    public wfc mo33179a() {
        return this.f29731a;
    }

    @Override // p001o.s06
    /* renamed from: b */
    public wfc mo33180b() {
        return this.f29732b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s06)) {
            return false;
        }
        s06 s06Var = (s06) obj;
        return this.f29731a.equals(s06Var.mo33179a()) && this.f29732b.equals(s06Var.mo33180b());
    }

    public int hashCode() {
        return ((this.f29731a.hashCode() ^ 1000003) * 1000003) ^ this.f29732b.hashCode();
    }

    public String toString() {
        return "DualOutConfig{primaryOutConfig=" + this.f29731a + ", secondaryOutConfig=" + this.f29732b + "}";
    }
}
