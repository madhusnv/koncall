package zs;

import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import pg.ma;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zs.h */
/* loaded from: classes3.dex */
public final class C9043h extends ma {

    /* renamed from: b */
    public final String f43553b;

    public C9043h(String searchString) {
        AbstractC4154l.m8923f(searchString, "searchString");
        this.f43553b = searchString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9043h) && AbstractC4154l.m8918a(this.f43553b, ((C9043h) obj).f43553b);
    }

    public final int hashCode() {
        return this.f43553b.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("SearchStringUpdate(searchString=", this.f43553b, ")");
    }
}
