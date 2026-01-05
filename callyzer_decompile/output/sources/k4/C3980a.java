package k4;

import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: k4.a */
/* loaded from: classes.dex */
public final class C3980a implements InterfaceC4003x {

    /* renamed from: a */
    public final int f20645a;

    public C3980a(int i10) {
        this.f20645a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3980a) && this.f20645a == ((C3980a) obj).f20645a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f20645a);
    }

    public final String toString() {
        return AbstractC1452a.m4563j(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.f20645a, ')');
    }
}
