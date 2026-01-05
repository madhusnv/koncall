package ss;

import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ss.x */
/* loaded from: classes3.dex */
public final class C6935x extends a0 {

    /* renamed from: a */
    public final String f33519a;

    public C6935x(String number) {
        AbstractC4154l.m8923f(number, "number");
        this.f33519a = number;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6935x) && AbstractC4154l.m8918a(this.f33519a, ((C6935x) obj).f33519a);
    }

    public final int hashCode() {
        return this.f33519a.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("SetNumber(number=", this.f33519a, ")");
    }
}
