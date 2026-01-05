package dv;

import kotlin.jvm.internal.AbstractC4154l;
import og.id;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dv.b */
/* loaded from: classes3.dex */
public final class C1841b extends id {

    /* renamed from: b */
    public final String f8819b;

    public C1841b(String statusName) {
        AbstractC4154l.m8923f(statusName, "statusName");
        this.f8819b = statusName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1841b) && AbstractC4154l.m8918a(this.f8819b, ((C1841b) obj).f8819b);
    }

    public final int hashCode() {
        return this.f8819b.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("ChangeSelectedLeadStatus(statusName=", this.f8819b, ")");
    }
}
