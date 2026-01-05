package mt;

import kotlin.jvm.internal.AbstractC4154l;
import og.c1;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mt.e */
/* loaded from: classes3.dex */
public final class C4876e extends c1 {

    /* renamed from: a */
    public final String f24388a;

    public C4876e(String message) {
        AbstractC4154l.m8923f(message, "message");
        this.f24388a = message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4876e) && AbstractC4154l.m8918a(this.f24388a, ((C4876e) obj).f24388a);
    }

    public final int hashCode() {
        return this.f24388a.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("RedirectToWhatsapp(message=", this.f24388a, ")");
    }
}
