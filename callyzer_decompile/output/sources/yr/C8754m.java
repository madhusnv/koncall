package yr;

import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yr.m */
/* loaded from: classes3.dex */
public final class C8754m extends AbstractC8761t {

    /* renamed from: a */
    public final String f42373a;

    public C8754m(String lastName) {
        AbstractC4154l.m8923f(lastName, "lastName");
        this.f42373a = lastName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8754m) && AbstractC4154l.m8918a(this.f42373a, ((C8754m) obj).f42373a);
    }

    public final int hashCode() {
        return this.f42373a.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("LastNameChange(lastName=", this.f42373a, ")");
    }
}
