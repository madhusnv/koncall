package su;

import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: su.a */
/* loaded from: classes3.dex */
public final class C6942a extends AbstractC6944c {

    /* renamed from: a */
    public final String f33577a;

    public C6942a(String str) {
        this.f33577a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6942a) && AbstractC4154l.m8918a(this.f33577a, ((C6942a) obj).f33577a);
    }

    public final int hashCode() {
        return this.f33577a.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("SyncFailedDataNotFound(failMessage=", this.f33577a, ")");
    }
}
