package p001o;

/* loaded from: classes6.dex */
public final class w0c implements kce {

    /* renamed from: a */
    public Object f51241a;

    @Override // p001o.kce
    /* renamed from: a */
    public void mo35410a(Object obj, ac9 ac9Var, Object obj2) {
        sq8.m48649h(ac9Var, "property");
        sq8.m48649h(obj2, "value");
        this.f51241a = obj2;
    }

    @Override // p001o.kce
    /* renamed from: b */
    public Object mo35411b(Object obj, ac9 ac9Var) {
        sq8.m48649h(ac9Var, "property");
        Object obj2 = this.f51241a;
        if (obj2 != null) {
            return obj2;
        }
        throw new IllegalStateException("Property " + ac9Var.getName() + " should be initialized before get.");
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("NotNullProperty(");
        if (this.f51241a != null) {
            str = "value=" + this.f51241a;
        } else {
            str = "value not initialized yet";
        }
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }
}
