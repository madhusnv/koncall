package p001o;

/* loaded from: classes3.dex */
public final class e8f implements c8f {

    /* renamed from: a */
    public final Object f21165a;

    /* renamed from: b */
    public final nl7 f21166b;

    public e8f(Object obj, nl7 nl7Var) {
        sq8.m48649h(nl7Var, "serializeFn");
        this.f21165a = obj;
        this.f21166b = nl7Var;
    }

    @Override // p001o.c8f
    /* renamed from: a */
    public void mo20495a(tff tffVar) {
        sq8.m48649h(tffVar, "serializer");
        this.f21166b.invoke(tffVar, this.f21165a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8f)) {
            return false;
        }
        e8f e8fVar = (e8f) obj;
        return sq8.m48644c(this.f21165a, e8fVar.f21165a) && sq8.m48644c(this.f21166b, e8fVar.f21166b);
    }

    public int hashCode() {
        Object obj = this.f21165a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f21166b.hashCode();
    }

    public String toString() {
        return "SdkSerializableLambda(input=" + this.f21165a + ", serializeFn=" + this.f21166b + ')';
    }
}
