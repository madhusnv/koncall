package ts;

import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import tq.EnumC7204p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ts.d */
/* loaded from: classes3.dex */
public final class C7217d {

    /* renamed from: a */
    public final List f34523a;

    /* renamed from: b */
    public final EnumC7204p f34524b;

    /* renamed from: c */
    public final EnumC7204p f34525c;

    public C7217d(List simOptionList, EnumC7204p selectedSimOptionMode, EnumC7204p leadSimOptionsMode) {
        AbstractC4154l.m8923f(simOptionList, "simOptionList");
        AbstractC4154l.m8923f(selectedSimOptionMode, "selectedSimOptionMode");
        AbstractC4154l.m8923f(leadSimOptionsMode, "leadSimOptionsMode");
        this.f34523a = simOptionList;
        this.f34524b = selectedSimOptionMode;
        this.f34525c = leadSimOptionsMode;
    }

    /* renamed from: a */
    public static C7217d m13449a(C7217d c7217d, List simOptionList, EnumC7204p selectedSimOptionMode, EnumC7204p leadSimOptionsMode, int i10) {
        if ((i10 & 1) != 0) {
            simOptionList = c7217d.f34523a;
        }
        if ((i10 & 2) != 0) {
            selectedSimOptionMode = c7217d.f34524b;
        }
        if ((i10 & 4) != 0) {
            leadSimOptionsMode = c7217d.f34525c;
        }
        c7217d.getClass();
        AbstractC4154l.m8923f(simOptionList, "simOptionList");
        AbstractC4154l.m8923f(selectedSimOptionMode, "selectedSimOptionMode");
        AbstractC4154l.m8923f(leadSimOptionsMode, "leadSimOptionsMode");
        return new C7217d(simOptionList, selectedSimOptionMode, leadSimOptionsMode);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7217d)) {
            return false;
        }
        C7217d c7217d = (C7217d) obj;
        return AbstractC4154l.m8918a(this.f34523a, c7217d.f34523a) && this.f34524b == c7217d.f34524b && this.f34525c == c7217d.f34525c;
    }

    public final int hashCode() {
        return this.f34525c.hashCode() + ((this.f34524b.hashCode() + (this.f34523a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SimOptionState(simOptionList=" + this.f34523a + ", selectedSimOptionMode=" + this.f34524b + ", leadSimOptionsMode=" + this.f34525c + ")";
    }
}
