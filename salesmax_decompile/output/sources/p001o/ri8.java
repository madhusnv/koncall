package p001o;

import androidx.lifecycle.b0;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class ri8 {

    /* renamed from: a */
    public final Map f43673a = new LinkedHashMap();

    /* renamed from: a */
    public final void m46815a(ob9 ob9Var, xk7 xk7Var) {
        sq8.m48649h(ob9Var, "clazz");
        sq8.m48649h(xk7Var, "initializer");
        if (!this.f43673a.containsKey(ob9Var)) {
            this.f43673a.put(ob9Var, new fxi(ob9Var, xk7Var));
            return;
        }
        throw new IllegalArgumentException(("A `initializer` with the same `clazz` has already been added: " + jxi.m34667a(ob9Var) + '.').toString());
    }

    /* renamed from: b */
    public final b0.InterfaceC2131c m46816b() {
        return ixi.f29351a.m32898a(this.f43673a.values());
    }
}
