package rv;

import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rv.j */
/* loaded from: classes3.dex */
public final class C6634j extends AbstractC6650z {

    /* renamed from: a */
    public final String f31842a;

    public C6634j(String empCode) {
        AbstractC4154l.m8923f(empCode, "empCode");
        this.f31842a = empCode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6634j) && AbstractC4154l.m8918a(this.f31842a, ((C6634j) obj).f31842a);
    }

    public final int hashCode() {
        return this.f31842a.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("EmpCodeChange(empCode=", this.f31842a, ")");
    }
}
