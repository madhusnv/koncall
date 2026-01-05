package nt;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nt.c */
/* loaded from: classes3.dex */
public final class C5139c {

    /* renamed from: a */
    public final int f25176a;

    /* renamed from: b */
    public final String f25177b;

    /* renamed from: c */
    public final String f25178c;

    /* renamed from: d */
    public final String f25179d;

    /* renamed from: e */
    public final boolean f25180e;

    /* renamed from: f */
    public final long f25181f;

    public C5139c(int i10, String name, String uri, String messageTemplateId, boolean z6, long j6) {
        AbstractC4154l.m8923f(name, "name");
        AbstractC4154l.m8923f(uri, "uri");
        AbstractC4154l.m8923f(messageTemplateId, "messageTemplateId");
        this.f25176a = i10;
        this.f25177b = name;
        this.f25178c = uri;
        this.f25179d = messageTemplateId;
        this.f25180e = z6;
        this.f25181f = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5139c)) {
            return false;
        }
        C5139c c5139c = (C5139c) obj;
        return this.f25176a == c5139c.f25176a && AbstractC4154l.m8918a(this.f25177b, c5139c.f25177b) && AbstractC4154l.m8918a(this.f25178c, c5139c.f25178c) && AbstractC4154l.m8918a(this.f25179d, c5139c.f25179d) && this.f25180e == c5139c.f25180e && this.f25181f == c5139c.f25181f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f25181f) + AbstractC1452a.m4558e(AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC0030c.m113d(Integer.hashCode(this.f25176a) * 31, 31, this.f25177b), 31, this.f25178c), 31, this.f25179d), 31, this.f25180e);
    }

    public final String toString() {
        StringBuilder sbM14337q = a1.m14337q(this.f25176a, "MessageTemplateDocumentsData(id=", ", name=", this.f25177b, ", uri=");
        a1.m14319B(sbM14337q, this.f25178c, ", messageTemplateId=", this.f25179d, ", isDownloading=");
        sbM14337q.append(this.f25180e);
        sbM14337q.append(", downloadId=");
        sbM14337q.append(this.f25181f);
        sbM14337q.append(")");
        return sbM14337q.toString();
    }
}
