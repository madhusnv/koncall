package or;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: or.q */
/* loaded from: classes3.dex */
public final class C5454q {

    /* renamed from: a */
    public final String f27491a;

    /* renamed from: b */
    public final String f27492b;

    /* renamed from: c */
    public final boolean f27493c;

    public C5454q(String name, String value, boolean z6) {
        AbstractC4154l.m8923f(name, "name");
        AbstractC4154l.m8923f(value, "value");
        this.f27491a = name;
        this.f27492b = value;
        this.f27493c = z6;
    }

    /* renamed from: a */
    public static C5454q m11181a(C5454q c5454q, boolean z6) {
        String name = c5454q.f27491a;
        String value = c5454q.f27492b;
        c5454q.getClass();
        AbstractC4154l.m8923f(name, "name");
        AbstractC4154l.m8923f(value, "value");
        return new C5454q(name, value, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5454q)) {
            return false;
        }
        C5454q c5454q = (C5454q) obj;
        return AbstractC4154l.m8918a(this.f27491a, c5454q.f27491a) && AbstractC4154l.m8918a(this.f27492b, c5454q.f27492b) && this.f27493c == c5454q.f27493c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f27493c) + AbstractC0030c.m113d(this.f27491a.hashCode() * 31, 31, this.f27492b);
    }

    public final String toString() {
        return AbstractC5601a.m11242m(AbstractC0030c.m127r("OptionsUIModel(name=", this.f27491a, ", value=", this.f27492b, ", isSelected="), this.f27493c, ")");
    }
}
