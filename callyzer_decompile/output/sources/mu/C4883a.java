package mu;

import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mu.a */
/* loaded from: classes3.dex */
public final class C4883a extends AbstractC4886d {

    /* renamed from: a */
    public final String f24397a;

    public C4883a(String str) {
        this.f24397a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4883a) && AbstractC4154l.m8918a(this.f24397a, ((C4883a) obj).f24397a);
    }

    public final int hashCode() {
        return this.f24397a.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("NavigateToScreen(route=", this.f24397a, ")");
    }
}
