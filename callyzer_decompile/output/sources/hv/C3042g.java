package hv;

import kotlin.jvm.internal.AbstractC4154l;
import l4.C4381z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hv.g */
/* loaded from: classes3.dex */
public final class C3042g extends AbstractC3049n {

    /* renamed from: a */
    public final C4381z f16373a;

    public C3042g(C4381z c4381z) {
        this.f16373a = c4381z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3042g) && AbstractC4154l.m8918a(this.f16373a, ((C3042g) obj).f16373a);
    }

    public final int hashCode() {
        return this.f16373a.hashCode();
    }

    public final String toString() {
        return "SetOTPChar2(otp=" + this.f16373a + ")";
    }
}
