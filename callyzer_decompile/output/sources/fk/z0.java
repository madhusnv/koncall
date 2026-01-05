package fk;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: a */
    public final String f10529a;

    /* renamed from: b */
    public final String f10530b;

    /* renamed from: c */
    public final int f10531c;

    /* renamed from: d */
    public final long f10532d;

    /* renamed from: e */
    public final C2305k f10533e;

    /* renamed from: f */
    public final String f10534f;

    /* renamed from: g */
    public final String f10535g;

    public z0(String sessionId, String firstSessionId, int i10, long j6, C2305k c2305k, String str, String firebaseAuthenticationToken) {
        AbstractC4154l.m8923f(sessionId, "sessionId");
        AbstractC4154l.m8923f(firstSessionId, "firstSessionId");
        AbstractC4154l.m8923f(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        this.f10529a = sessionId;
        this.f10530b = firstSessionId;
        this.f10531c = i10;
        this.f10532d = j6;
        this.f10533e = c2305k;
        this.f10534f = str;
        this.f10535g = firebaseAuthenticationToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return AbstractC4154l.m8918a(this.f10529a, z0Var.f10529a) && AbstractC4154l.m8918a(this.f10530b, z0Var.f10530b) && this.f10531c == z0Var.f10531c && this.f10532d == z0Var.f10532d && AbstractC4154l.m8918a(this.f10533e, z0Var.f10533e) && AbstractC4154l.m8918a(this.f10534f, z0Var.f10534f) && AbstractC4154l.m8918a(this.f10535g, z0Var.f10535g);
    }

    public final int hashCode() {
        return this.f10535g.hashCode() + AbstractC0030c.m113d((this.f10533e.hashCode() + AbstractC1452a.m4557d(AbstractC1452a.m4556c(this.f10531c, AbstractC0030c.m113d(this.f10529a.hashCode() * 31, 31, this.f10530b), 31), 31, this.f10532d)) * 31, 31, this.f10534f);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SessionInfo(sessionId=");
        sb2.append(this.f10529a);
        sb2.append(", firstSessionId=");
        sb2.append(this.f10530b);
        sb2.append(", sessionIndex=");
        sb2.append(this.f10531c);
        sb2.append(", eventTimestampUs=");
        sb2.append(this.f10532d);
        sb2.append(", dataCollectionStatus=");
        sb2.append(this.f10533e);
        sb2.append(", firebaseInstallationId=");
        sb2.append(this.f10534f);
        sb2.append(", firebaseAuthenticationToken=");
        return AbstractC0030c.m123n(sb2, this.f10535g, ')');
    }
}
