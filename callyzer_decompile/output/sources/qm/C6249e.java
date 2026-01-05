package qm;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qm.e */
/* loaded from: classes3.dex */
public final class C6249e {

    /* renamed from: a */
    public final int f30288a;

    /* renamed from: b */
    public final String f30289b;

    /* renamed from: c */
    public final String f30290c;

    public C6249e(int i10, String messageTemplateId, String tagId) {
        AbstractC4154l.m8923f(messageTemplateId, "messageTemplateId");
        AbstractC4154l.m8923f(tagId, "tagId");
        this.f30288a = i10;
        this.f30289b = messageTemplateId;
        this.f30290c = tagId;
    }

    /* renamed from: a */
    public static C6249e m12254a(C6249e c6249e, String messageTemplateId) {
        int i10 = c6249e.f30288a;
        String tagId = c6249e.f30290c;
        c6249e.getClass();
        AbstractC4154l.m8923f(messageTemplateId, "messageTemplateId");
        AbstractC4154l.m8923f(tagId, "tagId");
        return new C6249e(i10, messageTemplateId, tagId);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6249e)) {
            return false;
        }
        C6249e c6249e = (C6249e) obj;
        return this.f30288a == c6249e.f30288a && AbstractC4154l.m8918a(this.f30289b, c6249e.f30289b) && AbstractC4154l.m8918a(this.f30290c, c6249e.f30290c);
    }

    public final int hashCode() {
        return this.f30290c.hashCode() + AbstractC0030c.m113d(Integer.hashCode(this.f30288a) * 31, 31, this.f30289b);
    }

    public final String toString() {
        return AbstractC1452a.m4564k(a1.m14337q(this.f30288a, "MessageTemplateIdTagId(id=", ", messageTemplateId=", this.f30289b, ", tagId="), this.f30290c, ")");
    }
}
