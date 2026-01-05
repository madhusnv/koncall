package zu;

import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zu.b */
/* loaded from: classes3.dex */
public final class C9072b extends AbstractC9092v {

    /* renamed from: a */
    public final String f43604a;

    public C9072b(String statusName) {
        AbstractC4154l.m8923f(statusName, "statusName");
        this.f43604a = statusName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9072b) && AbstractC4154l.m8918a(this.f43604a, ((C9072b) obj).f43604a);
    }

    public final int hashCode() {
        return this.f43604a.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("ChangeSelectedLeadStatus(statusName=", this.f43604a, ")");
    }
}
