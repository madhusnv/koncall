package fs;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fs.a */
/* loaded from: classes3.dex */
public final class C2370a {

    /* renamed from: a */
    public final boolean f10779a;

    /* renamed from: b */
    public final List f10780b;

    /* renamed from: c */
    public final String f10781c;

    /* renamed from: d */
    public final boolean f10782d;

    /* renamed from: e */
    public final String f10783e;

    /* renamed from: f */
    public final int f10784f;

    /* renamed from: g */
    public final boolean f10785g;

    /* renamed from: h */
    public final boolean f10786h;

    public C2370a(boolean z6, List leadHistoryList, String str, boolean z10, String str2, int i10, boolean z11, boolean z12) {
        AbstractC4154l.m8923f(leadHistoryList, "leadHistoryList");
        this.f10779a = z6;
        this.f10780b = leadHistoryList;
        this.f10781c = str;
        this.f10782d = z10;
        this.f10783e = str2;
        this.f10784f = i10;
        this.f10785g = z11;
        this.f10786h = z12;
    }

    /* renamed from: a */
    public static C2370a m6057a(C2370a c2370a, boolean z6, List list, String str, int i10, boolean z10, boolean z11, int i11) {
        if ((i11 & 1) != 0) {
            z6 = c2370a.f10779a;
        }
        boolean z12 = z6;
        if ((i11 & 2) != 0) {
            list = c2370a.f10780b;
        }
        List leadHistoryList = list;
        c2370a.getClass();
        c2370a.getClass();
        if ((i11 & 16) != 0) {
            str = c2370a.f10781c;
        }
        String str2 = str;
        boolean z13 = (i11 & 32) != 0 ? c2370a.f10782d : true;
        String str3 = c2370a.f10783e;
        int i12 = (i11 & 128) != 0 ? c2370a.f10784f : i10;
        boolean z14 = (i11 & 256) != 0 ? c2370a.f10785g : z10;
        boolean z15 = (i11 & 512) != 0 ? c2370a.f10786h : z11;
        c2370a.getClass();
        AbstractC4154l.m8923f(leadHistoryList, "leadHistoryList");
        return new C2370a(z12, leadHistoryList, str2, z13, str3, i12, z14, z15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2370a)) {
            return false;
        }
        C2370a c2370a = (C2370a) obj;
        return this.f10779a == c2370a.f10779a && AbstractC4154l.m8918a(this.f10780b, c2370a.f10780b) && AbstractC4154l.m8918a(this.f10781c, c2370a.f10781c) && this.f10782d == c2370a.f10782d && this.f10783e.equals(c2370a.f10783e) && this.f10784f == c2370a.f10784f && this.f10785g == c2370a.f10785g && this.f10786h == c2370a.f10786h;
    }

    public final int hashCode() {
        int iM4559f = AbstractC1452a.m4559f(this.f10780b, Boolean.hashCode(this.f10779a) * 31, 29791);
        String str = this.f10781c;
        return Boolean.hashCode(this.f10786h) + AbstractC1452a.m4558e(AbstractC1452a.m4556c(this.f10784f, AbstractC0030c.m113d(AbstractC1452a.m4558e((iM4559f + (str == null ? 0 : str.hashCode())) * 31, 31, this.f10782d), 31, this.f10783e), 31), 31, this.f10785g);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LeadCallHistoryUiState(isLoading=");
        sb2.append(this.f10779a);
        sb2.append(", leadHistoryList=");
        sb2.append(this.f10780b);
        sb2.append(", minCallDate=null, maxCallDate=null, errorMessage=");
        AbstractC4801l.m9749w(sb2, this.f10781c, ", loadedSuccessfully=", this.f10782d, ", summaryDateSpan=");
        AbstractC1452a.m4551B(sb2, this.f10783e, ", page=", this.f10784f, ", isEmpty=");
        sb2.append(this.f10785g);
        sb2.append(", endReached=");
        sb2.append(this.f10786h);
        sb2.append(")");
        return sb2.toString();
    }
}
