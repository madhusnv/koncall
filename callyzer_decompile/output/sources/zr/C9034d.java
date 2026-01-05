package zr;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zr.d */
/* loaded from: classes3.dex */
public final class C9034d {

    /* renamed from: a */
    public final C9033c f43540a;

    /* renamed from: b */
    public final C9032b f43541b;

    /* renamed from: c */
    public final C9031a f43542c;

    public C9034d(C9033c leadTagState, C9032b leadState, C9031a employeeState) {
        AbstractC4154l.m8923f(leadTagState, "leadTagState");
        AbstractC4154l.m8923f(leadState, "leadState");
        AbstractC4154l.m8923f(employeeState, "employeeState");
        this.f43540a = leadTagState;
        this.f43541b = leadState;
        this.f43542c = employeeState;
    }

    /* renamed from: a */
    public static C9034d m16498a(C9034d c9034d, C9033c leadTagState, C9032b leadState, C9031a employeeState, int i10) {
        if ((i10 & 1) != 0) {
            leadTagState = c9034d.f43540a;
        }
        if ((i10 & 2) != 0) {
            leadState = c9034d.f43541b;
        }
        if ((i10 & 4) != 0) {
            employeeState = c9034d.f43542c;
        }
        c9034d.getClass();
        AbstractC4154l.m8923f(leadTagState, "leadTagState");
        AbstractC4154l.m8923f(leadState, "leadState");
        AbstractC4154l.m8923f(employeeState, "employeeState");
        return new C9034d(leadTagState, leadState, employeeState);
    }

    /* renamed from: b */
    public final C9032b m16499b() {
        return this.f43541b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9034d)) {
            return false;
        }
        C9034d c9034d = (C9034d) obj;
        return AbstractC4154l.m8918a(this.f43540a, c9034d.f43540a) && AbstractC4154l.m8918a(this.f43541b, c9034d.f43541b) && AbstractC4154l.m8918a(this.f43542c, c9034d.f43542c);
    }

    public final int hashCode() {
        return this.f43542c.hashCode() + ((this.f43541b.hashCode() + (this.f43540a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "State(leadTagState=" + this.f43540a + ", leadState=" + this.f43541b + ", employeeState=" + this.f43542c + ")";
    }
}
