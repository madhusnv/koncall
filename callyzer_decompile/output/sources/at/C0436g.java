package at;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;
import zm.EnumC8992b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: at.g */
/* loaded from: classes3.dex */
public final class C0436g {

    /* renamed from: a */
    public final String f3204a;

    /* renamed from: b */
    public final int f3205b;

    /* renamed from: c */
    public final EnumC8992b f3206c;

    public C0436g(String noteTemplateId, int i10, EnumC8992b isSync) {
        AbstractC4154l.m8923f(noteTemplateId, "noteTemplateId");
        AbstractC4154l.m8923f(isSync, "isSync");
        this.f3204a = noteTemplateId;
        this.f3205b = i10;
        this.f3206c = isSync;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0436g)) {
            return false;
        }
        C0436g c0436g = (C0436g) obj;
        return AbstractC4154l.m8918a(this.f3204a, c0436g.f3204a) && this.f3205b == c0436g.f3205b && this.f3206c == c0436g.f3206c;
    }

    public final int hashCode() {
        return this.f3206c.hashCode() + AbstractC1452a.m4556c(this.f3205b, this.f3204a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sbM125p = AbstractC0030c.m125p(this.f3205b, "UpdateSyncedCallNoteTemplates(noteTemplateId=", this.f3204a, ", appNoteTemplateId=", ", isSync=");
        sbM125p.append(this.f3206c);
        sbM125p.append(")");
        return sbM125p.toString();
    }
}
