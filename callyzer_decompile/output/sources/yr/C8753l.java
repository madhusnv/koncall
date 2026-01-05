package yr;

import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yr.l */
/* loaded from: classes3.dex */
public final class C8753l extends AbstractC8761t {

    /* renamed from: a */
    public final String f42372a;

    public C8753l(String firstName) {
        AbstractC4154l.m8923f(firstName, "firstName");
        this.f42372a = firstName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8753l) && AbstractC4154l.m8918a(this.f42372a, ((C8753l) obj).f42372a);
    }

    public final int hashCode() {
        return this.f42372a.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("FirstNameChange(firstName=", this.f42372a, ")");
    }
}
