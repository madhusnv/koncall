package ja;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class a0 implements b0 {

    /* renamed from: a */
    public final String f19237a;

    /* renamed from: b */
    public final String f19238b;

    public a0(String key, String value) {
        AbstractC4154l.m8923f(key, "key");
        AbstractC4154l.m8923f(value, "value");
        this.f19237a = key;
        this.f19238b = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return AbstractC4154l.m8918a(this.f19237a, a0Var.f19237a) && AbstractC4154l.m8918a(this.f19238b, a0Var.f19238b);
    }

    public final int hashCode() {
        return this.f19238b.hashCode() + (this.f19237a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SubProperty(key=");
        sb2.append(this.f19237a);
        sb2.append(", value=");
        return AbstractC0030c.m123n(sb2, this.f19238b, ')');
    }
}
