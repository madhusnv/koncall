package ja;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ja.x */
/* loaded from: classes.dex */
public final class C3630x implements b0 {

    /* renamed from: a */
    public final String f19270a;

    public C3630x(String value) {
        AbstractC4154l.m8923f(value, "value");
        this.f19270a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3630x) && AbstractC4154l.m8918a(this.f19270a, ((C3630x) obj).f19270a);
    }

    public final int hashCode() {
        return this.f19270a.hashCode();
    }

    public final String toString() {
        return AbstractC0030c.m123n(new StringBuilder("Continuation(value="), this.f19270a, ')');
    }
}
