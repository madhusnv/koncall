package vt;

import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import pg.m6;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vt.j */
/* loaded from: classes3.dex */
public final class C7779j extends m6 {

    /* renamed from: a */
    public final String f37442a;

    public C7779j(String name) {
        AbstractC4154l.m8923f(name, "name");
        this.f37442a = name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7779j) && AbstractC4154l.m8918a(this.f37442a, ((C7779j) obj).f37442a);
    }

    public final int hashCode() {
        return this.f37442a.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("ExtensionIsValid(name=", this.f37442a, ")");
    }
}
