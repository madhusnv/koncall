package mq;

import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mq.t */
/* loaded from: classes3.dex */
public final class C4852t extends AbstractC4854v {

    /* renamed from: a */
    public final String f24317a;

    public C4852t(String newSearchText) {
        AbstractC4154l.m8923f(newSearchText, "newSearchText");
        this.f24317a = newSearchText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4852t) && AbstractC4154l.m8918a(this.f24317a, ((C4852t) obj).f24317a);
    }

    public final int hashCode() {
        return this.f24317a.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("UpdateSearch(newSearchText=", this.f24317a, ")");
    }
}
