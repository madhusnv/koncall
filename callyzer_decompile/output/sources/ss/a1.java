package ss;

import kotlin.jvm.internal.AbstractC4154l;
import l4.C4381z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class a1 {

    /* renamed from: a */
    public final C4381z f33399a;

    public a1(C4381z number) {
        AbstractC4154l.m8923f(number, "number");
        this.f33399a = number;
    }

    /* renamed from: a */
    public static a1 m13178a(C4381z number) {
        AbstractC4154l.m8923f(number, "number");
        return new a1(number);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a1) && AbstractC4154l.m8918a(this.f33399a, ((a1) obj).f33399a);
    }

    public final int hashCode() {
        return this.f33399a.hashCode();
    }

    public final String toString() {
        return "PhoneNumberState(number=" + this.f33399a + ")";
    }
}
