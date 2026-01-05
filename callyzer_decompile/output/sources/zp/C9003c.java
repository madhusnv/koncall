package zp;

import a2.AbstractC0030c;
import eb.i0;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zp.c */
/* loaded from: classes3.dex */
public final class C9003c {

    /* renamed from: a */
    public final String f43361a;

    /* renamed from: b */
    public final String f43362b;

    /* renamed from: c */
    public final String f43363c;

    /* renamed from: d */
    public final i0 f43364d;

    /* renamed from: e */
    public final i0 f43365e;

    /* renamed from: f */
    public final i0 f43366f;

    public C9003c(String noOfDay, String totalDuration, String avgDuration, i0 i0Var, i0 i0Var2, i0 i0Var3) {
        AbstractC4154l.m8923f(noOfDay, "noOfDay");
        AbstractC4154l.m8923f(totalDuration, "totalDuration");
        AbstractC4154l.m8923f(avgDuration, "avgDuration");
        this.f43361a = noOfDay;
        this.f43362b = totalDuration;
        this.f43363c = avgDuration;
        this.f43364d = i0Var;
        this.f43365e = i0Var2;
        this.f43366f = i0Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9003c)) {
            return false;
        }
        C9003c c9003c = (C9003c) obj;
        return AbstractC4154l.m8918a(this.f43361a, c9003c.f43361a) && AbstractC4154l.m8918a(this.f43362b, c9003c.f43362b) && AbstractC4154l.m8918a(this.f43363c, c9003c.f43363c) && AbstractC4154l.m8918a(this.f43364d, c9003c.f43364d) && AbstractC4154l.m8918a(this.f43365e, c9003c.f43365e) && AbstractC4154l.m8918a(this.f43366f, c9003c.f43366f);
    }

    public final int hashCode() {
        return this.f43366f.hashCode() + ((this.f43365e.hashCode() + ((this.f43364d.hashCode() + AbstractC0030c.m113d(AbstractC0030c.m113d(this.f43361a.hashCode() * 31, 31, this.f43362b), 31, this.f43363c)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbM127r = AbstractC0030c.m127r("AverageUiModel(noOfDay=", this.f43361a, ", totalDuration=", this.f43362b, ", avgDuration=");
        sbM127r.append(this.f43363c);
        sbM127r.append(", incomingData=");
        sbM127r.append(this.f43364d);
        sbM127r.append(", outGoingData=");
        sbM127r.append(this.f43365e);
        sbM127r.append(", totalData=");
        sbM127r.append(this.f43366f);
        sbM127r.append(")");
        return sbM127r.toString();
    }
}
