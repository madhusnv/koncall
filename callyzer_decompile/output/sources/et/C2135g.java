package et;

import android.content.Context;
import kotlin.jvm.internal.AbstractC4154l;
import og.de;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: et.g */
/* loaded from: classes3.dex */
public final class C2135g extends de {

    /* renamed from: a */
    public final Context f9968a;

    public C2135g(Context context) {
        AbstractC4154l.m8923f(context, "context");
        this.f9968a = context;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2135g) && AbstractC4154l.m8918a(this.f9968a, ((C2135g) obj).f9968a);
    }

    public final int hashCode() {
        return this.f9968a.hashCode();
    }

    public final String toString() {
        return "SubmitForm(context=" + this.f9968a + ")";
    }
}
