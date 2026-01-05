package ja;

import i0.m0;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ja.k */
/* loaded from: classes.dex */
public final class C3617k {

    /* renamed from: a */
    public final String f19257a;

    /* renamed from: b */
    public final Map f19258b;

    /* renamed from: c */
    public final EnumC3618l f19259c;

    public C3617k(String name, Map properties, EnumC3618l sectionType) {
        AbstractC4154l.m8923f(name, "name");
        AbstractC4154l.m8923f(properties, "properties");
        AbstractC4154l.m8923f(sectionType, "sectionType");
        this.f19257a = name;
        this.f19258b = properties;
        this.f19259c = sectionType;
    }

    /* renamed from: a */
    public final String m8168a(String str, String str2) {
        AbstractC3613g abstractC3613g = (AbstractC3613g) this.f19258b.get(str);
        if (abstractC3613g == null) {
            return null;
        }
        if (abstractC3613g instanceof C3612f) {
            if (str2 == null) {
                return ((C3612f) abstractC3613g).f19247a;
            }
            throw new IllegalArgumentException(AbstractC5601a.m11238i("property '", str, "' is a string, but caller specified a sub-key").toString());
        }
        if (!(abstractC3613g instanceof C3611e)) {
            throw new NoWhenBranchMatchedException();
        }
        if (str2 != null) {
            return (String) ((C3611e) abstractC3613g).get(str2);
        }
        throw new IllegalArgumentException(AbstractC5601a.m11238i("property '", str, "' has sub-properties, caller must specify a sub-key").toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3617k)) {
            return false;
        }
        C3617k c3617k = (C3617k) obj;
        return AbstractC4154l.m8918a(this.f19257a, c3617k.f19257a) && AbstractC4154l.m8918a(this.f19258b, c3617k.f19258b) && this.f19259c == c3617k.f19259c;
    }

    public final int hashCode() {
        return this.f19259c.hashCode() + m0.m7369b(this.f19257a.hashCode() * 31, 31, this.f19258b);
    }

    public final String toString() {
        return "ConfigSection(name=" + this.f19257a + ", properties=" + this.f19258b + ", sectionType=" + this.f19259c + ')';
    }
}
