package hv;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hv.j */
/* loaded from: classes3.dex */
public final class C3045j extends AbstractC3049n {

    /* renamed from: a */
    public final CharSequence f16376a;

    public C3045j(CharSequence otpText) {
        AbstractC4154l.m8923f(otpText, "otpText");
        this.f16376a = otpText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3045j) && AbstractC4154l.m8918a(this.f16376a, ((C3045j) obj).f16376a);
    }

    public final int hashCode() {
        return this.f16376a.hashCode();
    }

    public final String toString() {
        return "SetPastOTP(otpText=" + ((Object) this.f16376a) + ")";
    }
}
