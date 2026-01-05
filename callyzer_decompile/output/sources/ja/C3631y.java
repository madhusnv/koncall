package ja;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ja.y */
/* loaded from: classes.dex */
public final class C3631y implements b0 {

    /* renamed from: a */
    public final String f19271a;

    /* renamed from: b */
    public final String f19272b;

    public C3631y(String key, String value) {
        AbstractC4154l.m8923f(key, "key");
        AbstractC4154l.m8923f(value, "value");
        this.f19271a = key;
        this.f19272b = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3631y)) {
            return false;
        }
        C3631y c3631y = (C3631y) obj;
        return AbstractC4154l.m8918a(this.f19271a, c3631y.f19271a) && AbstractC4154l.m8918a(this.f19272b, c3631y.f19272b);
    }

    public final int hashCode() {
        return this.f19272b.hashCode() + (this.f19271a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Property(key=");
        sb2.append(this.f19271a);
        sb2.append(", value=");
        return AbstractC0030c.m123n(sb2, this.f19272b, ')');
    }
}
