package dv;

import kotlin.jvm.internal.AbstractC4154l;
import og.id;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dv.e */
/* loaded from: classes3.dex */
public final class C1844e extends id {

    /* renamed from: b */
    public String f8822b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1844e) && AbstractC4154l.m8918a(this.f8822b, ((C1844e) obj).f8822b);
    }

    public final int hashCode() {
        return this.f8822b.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("GetSearchTemplates(title=", this.f8822b, ")");
    }
}
