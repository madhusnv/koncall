package p001o;

import java.io.Serializable;

/* loaded from: classes6.dex */
public final class ghg implements gi9, Serializable {

    /* renamed from: a */
    public uk7 f25227a;

    /* renamed from: b */
    public volatile Object f25228b;

    /* renamed from: c */
    public final Object f25229c;

    public ghg(uk7 uk7Var, Object obj) {
        sq8.m48649h(uk7Var, "initializer");
        this.f25227a = uk7Var;
        this.f25228b = u0i.f48151a;
        this.f25229c = obj == null ? this : obj;
    }

    private final Object writeReplace() {
        return new oi8(getValue());
    }

    @Override // p001o.gi9
    public Object getValue() {
        Object objInvoke;
        Object obj = this.f25228b;
        u0i u0iVar = u0i.f48151a;
        if (obj != u0iVar) {
            return obj;
        }
        synchronized (this.f25229c) {
            objInvoke = this.f25228b;
            if (objInvoke == u0iVar) {
                uk7 uk7Var = this.f25227a;
                sq8.m48646e(uk7Var);
                objInvoke = uk7Var.invoke();
                this.f25228b = objInvoke;
                this.f25227a = null;
            }
        }
        return objInvoke;
    }

    @Override // p001o.gi9
    public boolean isInitialized() {
        return this.f25228b != u0i.f48151a;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ ghg(uk7 uk7Var, Object obj, int i, id5 id5Var) {
        this(uk7Var, (i & 2) != 0 ? null : obj);
    }
}
