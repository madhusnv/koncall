package qv;

import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qv.v */
/* loaded from: classes3.dex */
public final class C6347v extends AbstractC6349x {

    /* renamed from: a */
    public final String f30741a;

    public C6347v(String str) {
        this.f30741a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6347v) && AbstractC4154l.m8918a(this.f30741a, ((C6347v) obj).f30741a);
    }

    public final int hashCode() {
        return this.f30741a.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("UpdateDCC(dccCode=", this.f30741a, ")");
    }
}
