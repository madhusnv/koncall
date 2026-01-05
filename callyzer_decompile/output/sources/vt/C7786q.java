package vt;

import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import pg.m6;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vt.q */
/* loaded from: classes3.dex */
public final class C7786q extends m6 {

    /* renamed from: a */
    public final String f37450a;

    public C7786q(String name) {
        AbstractC4154l.m8923f(name, "name");
        this.f37450a = name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7786q) && AbstractC4154l.m8918a(this.f37450a, ((C7786q) obj).f37450a);
    }

    public final int hashCode() {
        return this.f37450a.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("UpdateName(name=", this.f37450a, ")");
    }
}
