package qm;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import i0.m0;
import j$.time.LocalDateTime;
import kotlin.jvm.internal.AbstractC4154l;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qm.b */
/* loaded from: classes3.dex */
public final class C6246b {

    /* renamed from: a */
    public final int f30275a;

    /* renamed from: b */
    public final String f30276b;

    /* renamed from: c */
    public final LocalDateTime f30277c;

    /* renamed from: d */
    public final LocalDateTime f30278d;

    /* renamed from: e */
    public final String f30279e;

    public C6246b(int i10, String title, LocalDateTime createdTime, LocalDateTime localDateTime, String messageTemplateId) {
        AbstractC4154l.m8923f(title, "title");
        AbstractC4154l.m8923f(createdTime, "createdTime");
        AbstractC4154l.m8923f(messageTemplateId, "messageTemplateId");
        this.f30275a = i10;
        this.f30276b = title;
        this.f30277c = createdTime;
        this.f30278d = localDateTime;
        this.f30279e = messageTemplateId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6246b)) {
            return false;
        }
        C6246b c6246b = (C6246b) obj;
        return this.f30275a == c6246b.f30275a && AbstractC4154l.m8918a(this.f30276b, c6246b.f30276b) && AbstractC4154l.m8918a(this.f30277c, c6246b.f30277c) && AbstractC4154l.m8918a(this.f30278d, c6246b.f30278d) && AbstractC4154l.m8918a(this.f30279e, c6246b.f30279e);
    }

    public final int hashCode() {
        int iM7370c = m0.m7370c(this.f30277c, AbstractC0030c.m113d(Integer.hashCode(this.f30275a) * 31, 31, this.f30276b), 31);
        LocalDateTime localDateTime = this.f30278d;
        return this.f30279e.hashCode() + ((iM7370c + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbM14337q = a1.m14337q(this.f30275a, "MessageTemplate(id=", ", title=", this.f30276b, ", createdTime=");
        sbM14337q.append(this.f30277c);
        sbM14337q.append(", modifyDateTime=");
        sbM14337q.append(this.f30278d);
        sbM14337q.append(", messageTemplateId=");
        return AbstractC1452a.m4564k(sbM14337q, this.f30279e, ")");
    }
}
