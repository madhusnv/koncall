package i00;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i00.r */
/* loaded from: classes3.dex */
public final class C3113r {

    /* renamed from: a */
    public final Class f16739a;

    /* renamed from: b */
    public final Object f16740b;

    /* renamed from: c */
    public final Method f16741c;

    /* renamed from: d */
    public final List f16742d;

    public C3113r(Class cls, Object obj, Method method, ArrayList arrayList) {
        this.f16739a = cls;
        this.f16740b = obj;
        this.f16741c = method;
        this.f16742d = Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        return String.format("%s.%s() %s", this.f16739a.getName(), this.f16741c.getName(), this.f16742d);
    }
}
