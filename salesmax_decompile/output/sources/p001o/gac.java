package p001o;

/* loaded from: classes3.dex */
public final class gac extends o18 {

    /* renamed from: f */
    public final bt1 f24838f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gac(y38 y38Var, g48 g48Var, gk8 gk8Var, gk8 gk8Var2, q74 q74Var, bt1 bt1Var) {
        super(y38Var, g48Var, gk8Var, gk8Var2, q74Var);
        sq8.m48649h(y38Var, "request");
        sq8.m48649h(g48Var, "response");
        sq8.m48649h(gk8Var, "requestTime");
        sq8.m48649h(gk8Var2, "responseTime");
        sq8.m48649h(q74Var, "coroutineContext");
        sq8.m48649h(bt1Var, "call");
        this.f24838f = bt1Var;
    }

    @Override // p001o.o18
    /* renamed from: a */
    public void mo28289a() {
        super.mo28289a();
        this.f24838f.cancel();
    }

    @Override // p001o.o18
    /* renamed from: b */
    public o18 mo28290b(y38 y38Var, g48 g48Var) {
        sq8.m48649h(y38Var, "request");
        sq8.m48649h(g48Var, "response");
        return new gac(y38Var, g48Var, m41346e(), m41348g(), mo6529D(), this.f24838f);
    }
}
