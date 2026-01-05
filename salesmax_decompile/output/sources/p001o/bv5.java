package p001o;

import java.util.Map;

/* loaded from: classes2.dex */
public final class bv5 implements v0f {

    /* renamed from: a */
    public final uk7 f16853a;

    /* renamed from: b */
    public final /* synthetic */ v0f f16854b;

    public bv5(v0f v0fVar, uk7 uk7Var) {
        sq8.m48649h(v0fVar, "saveableStateRegistry");
        sq8.m48649h(uk7Var, "onDispose");
        this.f16853a = uk7Var;
        this.f16854b = v0fVar;
    }

    @Override // p001o.v0f
    /* renamed from: a */
    public Map mo19852a() {
        return this.f16854b.mo19852a();
    }

    /* renamed from: b */
    public final void m19853b() {
        this.f16853a.invoke();
    }
}
