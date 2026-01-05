package yr;

import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yr.b */
/* loaded from: classes3.dex */
public final class C8743b extends AbstractC8761t {

    /* renamed from: a */
    public final String f42352a;

    public C8743b(String alterNativeNumber) {
        AbstractC4154l.m8923f(alterNativeNumber, "alterNativeNumber");
        this.f42352a = alterNativeNumber;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8743b) && AbstractC4154l.m8918a(this.f42352a, ((C8743b) obj).f42352a);
    }

    public final int hashCode() {
        return this.f42352a.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("AlterNativeNumberChange(alterNativeNumber=", this.f42352a, ")");
    }
}
