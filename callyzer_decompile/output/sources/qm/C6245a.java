package qm;

import a2.AbstractC0030c;
import j$.time.LocalDateTime;
import kotlin.jvm.internal.AbstractC4154l;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qm.a */
/* loaded from: classes3.dex */
public final class C6245a {

    /* renamed from: a */
    public final int f30268a;

    /* renamed from: b */
    public final String f30269b;

    /* renamed from: c */
    public final String f30270c;

    /* renamed from: d */
    public final String f30271d;

    /* renamed from: e */
    public final String f30272e;

    /* renamed from: f */
    public final String f30273f;

    /* renamed from: g */
    public final LocalDateTime f30274g;

    public C6245a(int i10, String title, String description, String str, String messageSubTemplateId, String messageTemplateId, LocalDateTime createdTime) {
        AbstractC4154l.m8923f(title, "title");
        AbstractC4154l.m8923f(description, "description");
        AbstractC4154l.m8923f(messageSubTemplateId, "messageSubTemplateId");
        AbstractC4154l.m8923f(messageTemplateId, "messageTemplateId");
        AbstractC4154l.m8923f(createdTime, "createdTime");
        this.f30268a = i10;
        this.f30269b = title;
        this.f30270c = description;
        this.f30271d = str;
        this.f30272e = messageSubTemplateId;
        this.f30273f = messageTemplateId;
        this.f30274g = createdTime;
    }

    /* renamed from: a */
    public static C6245a m12251a(C6245a c6245a, String str, String str2, int i10) {
        int i11 = c6245a.f30268a;
        String title = c6245a.f30269b;
        if ((i10 & 4) != 0) {
            str = c6245a.f30270c;
        }
        String description = str;
        String str3 = c6245a.f30271d;
        String messageSubTemplateId = c6245a.f30272e;
        if ((i10 & 32) != 0) {
            str2 = c6245a.f30273f;
        }
        String messageTemplateId = str2;
        LocalDateTime createdTime = c6245a.f30274g;
        AbstractC4154l.m8923f(title, "title");
        AbstractC4154l.m8923f(description, "description");
        AbstractC4154l.m8923f(messageSubTemplateId, "messageSubTemplateId");
        AbstractC4154l.m8923f(messageTemplateId, "messageTemplateId");
        AbstractC4154l.m8923f(createdTime, "createdTime");
        return new C6245a(i11, title, description, str3, messageSubTemplateId, messageTemplateId, createdTime);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6245a)) {
            return false;
        }
        C6245a c6245a = (C6245a) obj;
        return this.f30268a == c6245a.f30268a && AbstractC4154l.m8918a(this.f30269b, c6245a.f30269b) && AbstractC4154l.m8918a(this.f30270c, c6245a.f30270c) && AbstractC4154l.m8918a(this.f30271d, c6245a.f30271d) && AbstractC4154l.m8918a(this.f30272e, c6245a.f30272e) && AbstractC4154l.m8918a(this.f30273f, c6245a.f30273f) && AbstractC4154l.m8918a(this.f30274g, c6245a.f30274g);
    }

    public final int hashCode() {
        int iM113d = AbstractC0030c.m113d(AbstractC0030c.m113d(Integer.hashCode(this.f30268a) * 31, 31, this.f30269b), 31, this.f30270c);
        String str = this.f30271d;
        return this.f30274g.hashCode() + AbstractC0030c.m113d(AbstractC0030c.m113d((iM113d + (str == null ? 0 : str.hashCode())) * 31, 31, this.f30272e), 31, this.f30273f);
    }

    public final String toString() {
        StringBuilder sbM14337q = a1.m14337q(this.f30268a, "MessageSubTemplate(id=", ", title=", this.f30269b, ", description=");
        a1.m14319B(sbM14337q, this.f30270c, ", instruction=", this.f30271d, ", messageSubTemplateId=");
        a1.m14319B(sbM14337q, this.f30272e, ", messageTemplateId=", this.f30273f, ", createdTime=");
        sbM14337q.append(this.f30274g);
        sbM14337q.append(")");
        return sbM14337q.toString();
    }
}
