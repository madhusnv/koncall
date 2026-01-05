package qm;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qm.f */
/* loaded from: classes3.dex */
public final class C6250f {

    /* renamed from: a */
    public final int f30291a;

    /* renamed from: b */
    public final String f30292b;

    public C6250f(int i10, String messageTemplateTagName) {
        AbstractC4154l.m8923f(messageTemplateTagName, "messageTemplateTagName");
        this.f30291a = i10;
        this.f30292b = messageTemplateTagName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6250f)) {
            return false;
        }
        C6250f c6250f = (C6250f) obj;
        return this.f30291a == c6250f.f30291a && AbstractC4154l.m8918a(this.f30292b, c6250f.f30292b);
    }

    public final int hashCode() {
        return this.f30292b.hashCode() + (Integer.hashCode(this.f30291a) * 31);
    }

    public final String toString() {
        return "MessageTemplateTag(id=" + this.f30291a + ", messageTemplateTagName=" + this.f30292b + ")";
    }
}
