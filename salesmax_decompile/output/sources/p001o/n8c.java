package p001o;

/* loaded from: classes6.dex */
public abstract class n8c implements kce {

    /* renamed from: a */
    public Object f36568a;

    public n8c(Object obj) {
        this.f36568a = obj;
    }

    @Override // p001o.kce
    /* renamed from: a */
    public void mo35410a(Object obj, ac9 ac9Var, Object obj2) {
        sq8.m48649h(ac9Var, "property");
        Object obj3 = this.f36568a;
        if (m40248d(ac9Var, obj3, obj2)) {
            this.f36568a = obj2;
            mo2072c(ac9Var, obj3, obj2);
        }
    }

    @Override // p001o.kce
    /* renamed from: b */
    public Object mo35411b(Object obj, ac9 ac9Var) {
        sq8.m48649h(ac9Var, "property");
        return this.f36568a;
    }

    /* renamed from: c */
    public abstract void mo2072c(ac9 ac9Var, Object obj, Object obj2);

    /* renamed from: d */
    public boolean m40248d(ac9 ac9Var, Object obj, Object obj2) {
        sq8.m48649h(ac9Var, "property");
        return true;
    }

    public String toString() {
        return "ObservableProperty(value=" + this.f36568a + ')';
    }
}
