package d7;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: d7.c */
/* loaded from: classes.dex */
public final class C1630c {

    /* renamed from: a */
    public final int f8073a;

    /* renamed from: b */
    public final Method f8074b;

    public C1630c(int i10, Method method) throws SecurityException {
        this.f8073a = i10;
        this.f8074b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1630c)) {
            return false;
        }
        C1630c c1630c = (C1630c) obj;
        return this.f8073a == c1630c.f8073a && this.f8074b.getName().equals(c1630c.f8074b.getName());
    }

    public final int hashCode() {
        return this.f8074b.getName().hashCode() + (this.f8073a * 31);
    }
}
