package nt;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nt.b */
/* loaded from: classes3.dex */
public final class C5138b {

    /* renamed from: a */
    public final int f25169a;

    /* renamed from: b */
    public final String f25170b;

    /* renamed from: c */
    public final String f25171c;

    /* renamed from: d */
    public final String f25172d;

    /* renamed from: e */
    public final boolean f25173e;

    /* renamed from: f */
    public final boolean f25174f;

    /* renamed from: g */
    public final List f25175g;

    public /* synthetic */ C5138b(int i10, String str, String str2, String str3, boolean z6, List list, int i11) {
        this(i10, str, str2, str3, (i11 & 16) != 0 ? false : z6, false, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5138b)) {
            return false;
        }
        C5138b c5138b = (C5138b) obj;
        return this.f25169a == c5138b.f25169a && AbstractC4154l.m8918a(this.f25170b, c5138b.f25170b) && AbstractC4154l.m8918a(this.f25171c, c5138b.f25171c) && AbstractC4154l.m8918a(this.f25172d, c5138b.f25172d) && this.f25173e == c5138b.f25173e && this.f25174f == c5138b.f25174f && AbstractC4154l.m8918a(this.f25175g, c5138b.f25175g);
    }

    public final int hashCode() {
        int iM113d = AbstractC0030c.m113d(AbstractC0030c.m113d(Integer.hashCode(this.f25169a) * 31, 31, this.f25170b), 31, this.f25171c);
        String str = this.f25172d;
        return this.f25175g.hashCode() + AbstractC1452a.m4558e(AbstractC1452a.m4558e((iM113d + (str == null ? 0 : str.hashCode())) * 31, 31, this.f25173e), 31, this.f25174f);
    }

    public final String toString() {
        StringBuilder sbM14337q = a1.m14337q(this.f25169a, "MessageSubTemplateData(id=", ", title=", this.f25170b, ", description=");
        a1.m14319B(sbM14337q, this.f25171c, ", instruction=", this.f25172d, ", isChecked=");
        AbstractC0030c.m133x(sbM14337q, this.f25173e, ", isExpend=", this.f25174f, ", missingDynamicFields=");
        return AbstractC5601a.m11240k(")", sbM14337q, this.f25175g);
    }

    public C5138b(int i10, String title, String description, String str, boolean z6, boolean z10, List missingDynamicFields) {
        AbstractC4154l.m8923f(title, "title");
        AbstractC4154l.m8923f(description, "description");
        AbstractC4154l.m8923f(missingDynamicFields, "missingDynamicFields");
        this.f25169a = i10;
        this.f25170b = title;
        this.f25171c = description;
        this.f25172d = str;
        this.f25173e = z6;
        this.f25174f = z10;
        this.f25175g = missingDynamicFields;
    }
}
