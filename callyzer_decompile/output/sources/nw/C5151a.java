package nw;

import jakarta.activation.MimeTypeParseException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nw.a */
/* loaded from: classes3.dex */
public final class C5151a {

    /* renamed from: a */
    public final String f25220a;

    /* renamed from: b */
    public C5160j f25221b = null;

    /* renamed from: c */
    public final Class f25222c;

    public C5151a(Class cls, String str) {
        this.f25220a = str;
        this.f25222c = cls;
    }

    /* renamed from: a */
    public final boolean m10059a(C5151a c5151a) {
        boolean zEqualsIgnoreCase;
        String str = c5151a.f25220a;
        String str2 = this.f25220a;
        try {
            if (this.f25221b == null) {
                this.f25221b = new C5160j(str2);
            }
            C5160j c5160j = new C5160j(str);
            C5160j c5160j2 = this.f25221b;
            zEqualsIgnoreCase = c5160j2.f25237a.equals(c5160j.f25237a) && (c5160j2.f25238b.equals("*") || c5160j.f25238b.equals("*") || c5160j2.f25238b.equals(c5160j.f25238b));
        } catch (MimeTypeParseException unused) {
            zEqualsIgnoreCase = str2.equalsIgnoreCase(str);
        }
        return zEqualsIgnoreCase && c5151a.f25222c == this.f25222c;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C5151a) && m10059a((C5151a) obj);
    }

    public final int hashCode() {
        Class cls = this.f25222c;
        if (cls != null) {
            return cls.hashCode();
        }
        return 0;
    }
}
