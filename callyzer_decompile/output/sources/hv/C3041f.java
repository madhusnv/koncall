package hv;

import kotlin.jvm.internal.AbstractC4154l;
import l4.C4381z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hv.f */
/* loaded from: classes3.dex */
public final class C3041f extends AbstractC3049n {

    /* renamed from: a */
    public final C4381z f16372a;

    public C3041f(C4381z c4381z) {
        this.f16372a = c4381z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3041f) && AbstractC4154l.m8918a(this.f16372a, ((C3041f) obj).f16372a);
    }

    public final int hashCode() {
        return this.f16372a.hashCode();
    }

    public final String toString() {
        return "SetOTPChar1(otp=" + this.f16372a + ")";
    }
}
