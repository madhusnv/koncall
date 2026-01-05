package vt;

import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vt.f */
/* loaded from: classes3.dex */
public final class C7775f extends AbstractC7777h {

    /* renamed from: a */
    public final String f37439a;

    public C7775f(String toastMessage) {
        AbstractC4154l.m8923f(toastMessage, "toastMessage");
        this.f37439a = toastMessage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7775f) && AbstractC4154l.m8918a(this.f37439a, ((C7775f) obj).f37439a);
    }

    public final int hashCode() {
        return this.f37439a.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("UpdateExtensionList(toastMessage=", this.f37439a, ")");
    }
}
