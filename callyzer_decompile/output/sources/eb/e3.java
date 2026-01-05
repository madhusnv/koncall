package eb;

import hc.AbstractC2887j;
import kotlin.jvm.internal.AbstractC4154l;
import nf.C5047i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class e3 {

    /* renamed from: a */
    public final AbstractC2887j f9306a;

    public e3(C5047i c5047i) {
        this.f9306a = (AbstractC2887j) c5047i.f24823b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && e3.class == obj.getClass() && AbstractC4154l.m8918a(this.f9306a, ((e3) obj).f9306a);
    }

    public final int hashCode() {
        AbstractC2887j abstractC2887j = this.f9306a;
        if (abstractC2887j != null) {
            return abstractC2887j.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StartWebAuthnRegistrationResponse(");
        sb2.append("credentialCreationOptions=" + this.f9306a);
        sb2.append(")");
        return sb2.toString();
    }
}
