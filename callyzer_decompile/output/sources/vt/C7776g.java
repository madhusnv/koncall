package vt;

import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vt.g */
/* loaded from: classes3.dex */
public final class C7776g extends AbstractC7777h {

    /* renamed from: a */
    public final String f37440a;

    public C7776g(String str) {
        this.f37440a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7776g) && AbstractC4154l.m8918a(this.f37440a, ((C7776g) obj).f37440a);
    }

    public final int hashCode() {
        return this.f37440a.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("WrongQRScan(errorMessage=", this.f37440a, ")");
    }
}
