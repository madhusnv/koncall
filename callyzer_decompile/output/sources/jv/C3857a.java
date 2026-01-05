package jv;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jv.a */
/* loaded from: classes3.dex */
public final class C3857a {

    /* renamed from: a */
    public final int f19856a;

    /* renamed from: b */
    public final String f19857b;

    /* renamed from: c */
    public final boolean f19858c;

    /* renamed from: d */
    public final String f19859d;

    public C3857a(int i10, String simName, String errorMessage, boolean z6) {
        AbstractC4154l.m8923f(simName, "simName");
        AbstractC4154l.m8923f(errorMessage, "errorMessage");
        this.f19856a = i10;
        this.f19857b = simName;
        this.f19858c = z6;
        this.f19859d = errorMessage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3857a)) {
            return false;
        }
        C3857a c3857a = (C3857a) obj;
        return this.f19856a == c3857a.f19856a && AbstractC4154l.m8918a(this.f19857b, c3857a.f19857b) && this.f19858c == c3857a.f19858c && AbstractC4154l.m8918a(this.f19859d, c3857a.f19859d);
    }

    public final int hashCode() {
        return this.f19859d.hashCode() + AbstractC1452a.m4558e(AbstractC0030c.m113d(Integer.hashCode(this.f19856a) * 31, 31, this.f19857b), 31, this.f19858c);
    }

    public final String toString() {
        StringBuilder sbM14337q = a1.m14337q(this.f19856a, "RegistrationResult(simSlot=", ", simName=", this.f19857b, ", isSuccess=");
        sbM14337q.append(this.f19858c);
        sbM14337q.append(", errorMessage=");
        sbM14337q.append(this.f19859d);
        sbM14337q.append(")");
        return sbM14337q.toString();
    }

    public /* synthetic */ C3857a(int i10, String str) {
        this(i10, str, "", true);
    }
}
