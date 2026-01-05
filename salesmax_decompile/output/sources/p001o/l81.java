package p001o;

/* loaded from: classes2.dex */
public final class l81 implements kqb {

    /* renamed from: a */
    public int f33426a;

    /* renamed from: b */
    public Integer f33427b;

    @Override // p001o.kqb
    /* renamed from: a */
    public void mo36053a(j7f j7fVar) {
        sq8.m48649h(j7fVar, "op");
        this.f33427b = Integer.valueOf(j7fVar.m33383c().m51148h().getConfig().mo38265b());
        n6d.m40146f(j7fVar.m33383c().m51145e(), this, null, 2, null);
    }

    @Override // p001o.ueb
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Object mo36732b(zdc zdcVar, jw7 jw7Var, n64 n64Var) {
        this.f33426a++;
        a48.m16408d((z38) zdcVar.m59255d(), "amz-sdk-invocation-id", l7f.m36670d(zdcVar.m59254c()));
        m36734d(zdcVar, this.f33426a);
        return jw7Var.mo21441a(zdcVar, n64Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001b  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m36734d(zdc zdcVar, int i) {
        String str;
        Integer num = this.f33427b;
        if (num != null) {
            str = "; max=" + num.intValue();
            if (str == null) {
                str = "";
            }
        }
        a48.m16408d((z38) zdcVar.m59255d(), "amz-sdk-request", "attempt=" + i + str);
    }
}
