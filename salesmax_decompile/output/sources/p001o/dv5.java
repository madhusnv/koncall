package p001o;

/* loaded from: classes6.dex */
public final class dv5 implements tb2 {

    /* renamed from: a */
    public final yu5 f20578a;

    public dv5(yu5 yu5Var) {
        this.f20578a = yu5Var;
    }

    @Override // p001o.tb2
    /* renamed from: a */
    public void mo23886a(Throwable th) {
        this.f20578a.dispose();
    }

    public String toString() {
        return "DisposeOnCancel[" + this.f20578a + ']';
    }
}
