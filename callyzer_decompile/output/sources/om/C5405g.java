package om;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import i0.m0;
import j$.time.LocalDateTime;
import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;
import p020v.a1;
import zm.EnumC8992b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: om.g */
/* loaded from: classes3.dex */
public final class C5405g {

    /* renamed from: a */
    public final int f27130a;

    /* renamed from: b */
    public final String f27131b;

    /* renamed from: c */
    public final String f27132c;

    /* renamed from: d */
    public final boolean f27133d;

    /* renamed from: e */
    public final LocalDateTime f27134e;

    /* renamed from: f */
    public final LocalDateTime f27135f;

    /* renamed from: g */
    public final EnumC8992b f27136g;

    /* renamed from: h */
    public final int f27137h;

    /* renamed from: i */
    public final String f27138i;

    /* renamed from: j */
    public final String f27139j;

    public C5405g(int i10, String title, String description, boolean z6, LocalDateTime localDateTime, LocalDateTime localDateTime2, EnumC8992b callNoteTemplateSyncStatus, int i11, String noteTemplateId, String simNumber) {
        AbstractC4154l.m8923f(title, "title");
        AbstractC4154l.m8923f(description, "description");
        AbstractC4154l.m8923f(callNoteTemplateSyncStatus, "callNoteTemplateSyncStatus");
        AbstractC4154l.m8923f(noteTemplateId, "noteTemplateId");
        AbstractC4154l.m8923f(simNumber, "simNumber");
        this.f27130a = i10;
        this.f27131b = title;
        this.f27132c = description;
        this.f27133d = z6;
        this.f27134e = localDateTime;
        this.f27135f = localDateTime2;
        this.f27136g = callNoteTemplateSyncStatus;
        this.f27137h = i11;
        this.f27138i = noteTemplateId;
        this.f27139j = simNumber;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5405g)) {
            return false;
        }
        C5405g c5405g = (C5405g) obj;
        return this.f27130a == c5405g.f27130a && AbstractC4154l.m8918a(this.f27131b, c5405g.f27131b) && AbstractC4154l.m8918a(this.f27132c, c5405g.f27132c) && this.f27133d == c5405g.f27133d && AbstractC4154l.m8918a(this.f27134e, c5405g.f27134e) && AbstractC4154l.m8918a(this.f27135f, c5405g.f27135f) && this.f27136g == c5405g.f27136g && this.f27137h == c5405g.f27137h && AbstractC4154l.m8918a(this.f27138i, c5405g.f27138i) && AbstractC4154l.m8918a(this.f27139j, c5405g.f27139j);
    }

    public final int hashCode() {
        int iM4558e = AbstractC1452a.m4558e(AbstractC0030c.m113d(AbstractC0030c.m113d(Integer.hashCode(this.f27130a) * 31, 31, this.f27131b), 31, this.f27132c), 31, this.f27133d);
        LocalDateTime localDateTime = this.f27134e;
        return this.f27139j.hashCode() + AbstractC0030c.m113d(AbstractC1452a.m4556c(this.f27137h, (this.f27136g.hashCode() + m0.m7370c(this.f27135f, (iM4558e + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31, 31)) * 31, 31), 31, this.f27138i);
    }

    public final String toString() {
        StringBuilder sbM14337q = a1.m14337q(this.f27130a, "CallNoteTemplate(id=", ", title=", this.f27131b, ", description=");
        AbstractC4801l.m9749w(sbM14337q, this.f27132c, ", isMaster=", this.f27133d, ", lastModifiedDateTime=");
        sbM14337q.append(this.f27134e);
        sbM14337q.append(", createdDateTime=");
        sbM14337q.append(this.f27135f);
        sbM14337q.append(", callNoteTemplateSyncStatus=");
        sbM14337q.append(this.f27136g);
        sbM14337q.append(", useCount=");
        sbM14337q.append(this.f27137h);
        sbM14337q.append(", noteTemplateId=");
        return AbstractC0030c.m124o(sbM14337q, this.f27138i, ", simNumber=", this.f27139j, ")");
    }
}
