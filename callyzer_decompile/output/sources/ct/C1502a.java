package ct;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ct.a */
/* loaded from: classes3.dex */
public final class C1502a {

    /* renamed from: a */
    public final String f7588a;

    /* renamed from: b */
    public final String f7589b;

    /* renamed from: c */
    public final boolean f7590c;

    /* renamed from: d */
    public final int f7591d;

    /* renamed from: e */
    public final int f7592e;

    /* renamed from: f */
    public final String f7593f;

    /* renamed from: g */
    public final String f7594g;

    /* renamed from: h */
    public final Integer f7595h;

    public C1502a(String title, String message, boolean z6, int i10, int i11, String noteTemplateId, String simNumber, Integer num, int i12) {
        z6 = (i12 & 4) != 0 ? false : z6;
        i10 = (i12 & 8) != 0 ? 0 : i10;
        i11 = (i12 & 16) != 0 ? 0 : i11;
        noteTemplateId = (i12 & 32) != 0 ? "" : noteTemplateId;
        num = (i12 & 128) != 0 ? 1 : num;
        AbstractC4154l.m8923f(title, "title");
        AbstractC4154l.m8923f(message, "message");
        AbstractC4154l.m8923f(noteTemplateId, "noteTemplateId");
        AbstractC4154l.m8923f(simNumber, "simNumber");
        this.f7588a = title;
        this.f7589b = message;
        this.f7590c = z6;
        this.f7591d = i10;
        this.f7592e = i11;
        this.f7593f = noteTemplateId;
        this.f7594g = simNumber;
        this.f7595h = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1502a)) {
            return false;
        }
        C1502a c1502a = (C1502a) obj;
        return AbstractC4154l.m8918a(this.f7588a, c1502a.f7588a) && AbstractC4154l.m8918a(this.f7589b, c1502a.f7589b) && this.f7590c == c1502a.f7590c && this.f7591d == c1502a.f7591d && this.f7592e == c1502a.f7592e && this.f7593f.equals(c1502a.f7593f) && AbstractC4154l.m8918a(this.f7594g, c1502a.f7594g) && AbstractC4154l.m8918a(this.f7595h, c1502a.f7595h);
    }

    public final int hashCode() {
        int iM113d = AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC1452a.m4556c(this.f7592e, AbstractC1452a.m4556c(this.f7591d, AbstractC1452a.m4558e(AbstractC0030c.m113d(this.f7588a.hashCode() * 31, 31, this.f7589b), 31, this.f7590c), 31), 31), 31, this.f7593f), 31, this.f7594g);
        Integer num = this.f7595h;
        return (iM113d + (num == null ? 0 : num.hashCode())) * 31;
    }

    public final String toString() {
        StringBuilder sbM127r = AbstractC0030c.m127r("CallNoteTemplateItem(title=", this.f7588a, ", message=", this.f7589b, ", isMaster=");
        sbM127r.append(this.f7590c);
        sbM127r.append(", id=");
        sbM127r.append(this.f7591d);
        sbM127r.append(", useCount=");
        AbstractC1452a.m4550A(sbM127r, this.f7592e, ", noteTemplateId=", this.f7593f, ", simNumber=");
        sbM127r.append(this.f7594g);
        sbM127r.append(", simSlot=");
        sbM127r.append(this.f7595h);
        sbM127r.append(", lastModified=null)");
        return sbM127r.toString();
    }
}
