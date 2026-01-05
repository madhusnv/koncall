package qm;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qm.d */
/* loaded from: classes3.dex */
public final class C6248d {

    /* renamed from: a */
    public final int f30284a;

    /* renamed from: b */
    public final String f30285b;

    /* renamed from: c */
    public final List f30286c;

    /* renamed from: d */
    public final String f30287d;

    public C6248d(int i10, String title, List list, String messageSubTemplateId) {
        AbstractC4154l.m8923f(title, "title");
        AbstractC4154l.m8923f(messageSubTemplateId, "messageSubTemplateId");
        this.f30284a = i10;
        this.f30285b = title;
        this.f30286c = list;
        this.f30287d = messageSubTemplateId;
    }

    /* renamed from: a */
    public static C6248d m12253a(C6248d c6248d, int i10) {
        String title = c6248d.f30285b;
        List list = c6248d.f30286c;
        String messageSubTemplateId = c6248d.f30287d;
        c6248d.getClass();
        AbstractC4154l.m8923f(title, "title");
        AbstractC4154l.m8923f(messageSubTemplateId, "messageSubTemplateId");
        return new C6248d(i10, title, list, messageSubTemplateId);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6248d)) {
            return false;
        }
        C6248d c6248d = (C6248d) obj;
        return this.f30284a == c6248d.f30284a && AbstractC4154l.m8918a(this.f30285b, c6248d.f30285b) && AbstractC4154l.m8918a(this.f30286c, c6248d.f30286c) && AbstractC4154l.m8918a(this.f30287d, c6248d.f30287d);
    }

    public final int hashCode() {
        return this.f30287d.hashCode() + AbstractC1452a.m4559f(this.f30286c, AbstractC0030c.m113d(Integer.hashCode(this.f30284a) * 31, 31, this.f30285b), 31);
    }

    public final String toString() {
        StringBuilder sbM14337q = a1.m14337q(this.f30284a, "MessageTemplateDynamicFields(id=", ", title=", this.f30285b, ", valueType=");
        sbM14337q.append(this.f30286c);
        sbM14337q.append(", messageSubTemplateId=");
        sbM14337q.append(this.f30287d);
        sbM14337q.append(")");
        return sbM14337q.toString();
    }
}
