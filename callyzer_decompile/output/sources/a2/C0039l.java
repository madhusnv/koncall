package a2;

import com.sun.mail.util.AbstractC1452a;
import i0.m0;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: a2.l */
/* loaded from: classes.dex */
public final class C0039l {

    /* renamed from: a */
    public final String f175a;

    /* renamed from: b */
    public String f176b;

    /* renamed from: c */
    public boolean f177c = false;

    /* renamed from: d */
    public C0033f f178d = null;

    public C0039l(String str, String str2) {
        this.f175a = str;
        this.f176b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0039l)) {
            return false;
        }
        C0039l c0039l = (C0039l) obj;
        return AbstractC4154l.m8918a(this.f175a, c0039l.f175a) && AbstractC4154l.m8918a(this.f176b, c0039l.f176b) && this.f177c == c0039l.f177c && AbstractC4154l.m8918a(this.f178d, c0039l.f178d);
    }

    public final int hashCode() {
        int iM4558e = AbstractC1452a.m4558e(AbstractC0030c.m113d(this.f175a.hashCode() * 31, 31, this.f176b), 31, this.f177c);
        C0033f c0033f = this.f178d;
        return iM4558e + (c0033f == null ? 0 : c0033f.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextSubstitution(layoutCache=");
        sb2.append(this.f178d);
        sb2.append(", isShowingSubstitution=");
        return m0.m7382o(sb2, this.f177c, ')');
    }
}
