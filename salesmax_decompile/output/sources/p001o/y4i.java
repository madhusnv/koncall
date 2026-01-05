package p001o;

import java.io.Serializable;

/* loaded from: classes6.dex */
public final class y4i implements gi9, Serializable {

    /* renamed from: a */
    public uk7 f54895a;

    /* renamed from: b */
    public Object f54896b;

    public y4i(uk7 uk7Var) {
        sq8.m48649h(uk7Var, "initializer");
        this.f54895a = uk7Var;
        this.f54896b = u0i.f48151a;
    }

    private final Object writeReplace() {
        return new oi8(getValue());
    }

    @Override // p001o.gi9
    public Object getValue() {
        if (this.f54896b == u0i.f48151a) {
            uk7 uk7Var = this.f54895a;
            sq8.m48646e(uk7Var);
            this.f54896b = uk7Var.invoke();
            this.f54895a = null;
        }
        return this.f54896b;
    }

    @Override // p001o.gi9
    public boolean isInitialized() {
        return this.f54896b != u0i.f48151a;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
