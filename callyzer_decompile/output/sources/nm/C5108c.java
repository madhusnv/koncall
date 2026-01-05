package nm;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nm.c */
/* loaded from: classes3.dex */
public final class C5108c {

    /* renamed from: a */
    public final String f25014a;

    /* renamed from: b */
    public final String f25015b;

    /* renamed from: c */
    public final String f25016c;

    public C5108c(String supportEmail, String smtpEmail, String str) {
        AbstractC4154l.m8923f(supportEmail, "supportEmail");
        AbstractC4154l.m8923f(smtpEmail, "smtpEmail");
        this.f25014a = supportEmail;
        this.f25015b = smtpEmail;
        this.f25016c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5108c)) {
            return false;
        }
        C5108c c5108c = (C5108c) obj;
        return AbstractC4154l.m8918a(this.f25014a, c5108c.f25014a) && AbstractC4154l.m8918a(this.f25015b, c5108c.f25015b) && AbstractC4154l.m8918a(this.f25016c, c5108c.f25016c);
    }

    public final int hashCode() {
        return this.f25016c.hashCode() + AbstractC0030c.m113d(this.f25014a.hashCode() * 31, 31, this.f25015b);
    }

    public final String toString() {
        return AbstractC1452a.m4564k(AbstractC0030c.m127r("RemoteConfigParams(supportEmail=", this.f25014a, ", smtpEmail=", this.f25015b, ", smtpPassword="), this.f25016c, ")");
    }
}
