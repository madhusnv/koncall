package p001o;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public final class pv8 {

    /* renamed from: a */
    public final Method f40651a;

    /* renamed from: b */
    public final List f40652b;

    public pv8(Method method, List list) {
        this.f40651a = method;
        this.f40652b = Collections.unmodifiableList(list);
    }

    /* renamed from: a */
    public Method m44239a() {
        return this.f40651a;
    }

    public String toString() {
        return String.format("%s.%s() %s", this.f40651a.getDeclaringClass().getName(), this.f40651a.getName(), this.f40652b);
    }
}
