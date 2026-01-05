package hv;

import kotlin.jvm.internal.AbstractC4154l;
import l4.C4381z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hv.h */
/* loaded from: classes3.dex */
public final class C3043h extends AbstractC3049n {

    /* renamed from: a */
    public final C4381z f16374a;

    public C3043h(C4381z c4381z) {
        this.f16374a = c4381z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3043h) && AbstractC4154l.m8918a(this.f16374a, ((C3043h) obj).f16374a);
    }

    public final int hashCode() {
        return this.f16374a.hashCode();
    }

    public final String toString() {
        return "SetOTPChar3(otp=" + this.f16374a + ")";
    }
}
