package zr;

import com.sun.mail.util.AbstractC1452a;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zr.c */
/* loaded from: classes3.dex */
public final class C9033c {

    /* renamed from: a */
    public final boolean f43533a;

    /* renamed from: b */
    public final boolean f43534b;

    /* renamed from: c */
    public final String f43535c;

    /* renamed from: d */
    public final Integer f43536d;

    /* renamed from: e */
    public final List f43537e;

    /* renamed from: f */
    public final List f43538f;

    /* renamed from: g */
    public final boolean f43539g;

    public C9033c(boolean z6, boolean z10, String str, Integer num, List visibleTagList, List selectedTagsList, boolean z11) {
        AbstractC4154l.m8923f(visibleTagList, "visibleTagList");
        AbstractC4154l.m8923f(selectedTagsList, "selectedTagsList");
        this.f43533a = z6;
        this.f43534b = z10;
        this.f43535c = str;
        this.f43536d = num;
        this.f43537e = visibleTagList;
        this.f43538f = selectedTagsList;
        this.f43539g = z11;
    }

    /* renamed from: a */
    public static C9033c m16497a(C9033c c9033c, boolean z6, boolean z10, String str, Integer num, List list, List list2, boolean z11, int i10) {
        if ((i10 & 1) != 0) {
            z6 = c9033c.f43533a;
        }
        boolean z12 = z6;
        if ((i10 & 2) != 0) {
            z10 = c9033c.f43534b;
        }
        boolean z13 = z10;
        if ((i10 & 4) != 0) {
            str = c9033c.f43535c;
        }
        String str2 = str;
        if ((i10 & 8) != 0) {
            num = c9033c.f43536d;
        }
        Integer num2 = num;
        if ((i10 & 16) != 0) {
            list = c9033c.f43537e;
        }
        List visibleTagList = list;
        if ((i10 & 32) != 0) {
            list2 = c9033c.f43538f;
        }
        List selectedTagsList = list2;
        if ((i10 & 64) != 0) {
            z11 = c9033c.f43539g;
        }
        c9033c.getClass();
        AbstractC4154l.m8923f(visibleTagList, "visibleTagList");
        AbstractC4154l.m8923f(selectedTagsList, "selectedTagsList");
        return new C9033c(z12, z13, str2, num2, visibleTagList, selectedTagsList, z11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9033c)) {
            return false;
        }
        C9033c c9033c = (C9033c) obj;
        return this.f43533a == c9033c.f43533a && this.f43534b == c9033c.f43534b && AbstractC4154l.m8918a(this.f43535c, c9033c.f43535c) && AbstractC4154l.m8918a(this.f43536d, c9033c.f43536d) && AbstractC4154l.m8918a(this.f43537e, c9033c.f43537e) && AbstractC4154l.m8918a(this.f43538f, c9033c.f43538f) && this.f43539g == c9033c.f43539g;
    }

    public final int hashCode() {
        int iM4558e = AbstractC1452a.m4558e(Boolean.hashCode(this.f43533a) * 31, 31, this.f43534b);
        String str = this.f43535c;
        int iHashCode = (iM4558e + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f43536d;
        return Boolean.hashCode(this.f43539g) + AbstractC1452a.m4559f(this.f43538f, AbstractC1452a.m4559f(this.f43537e, (iHashCode + (num != null ? num.hashCode() : 0)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LeadTagState(isInternet=");
        sb2.append(this.f43533a);
        sb2.append(", inProgress=");
        sb2.append(this.f43534b);
        sb2.append(", searchText=");
        sb2.append(this.f43535c);
        sb2.append(", tagError=");
        sb2.append(this.f43536d);
        sb2.append(", visibleTagList=");
        sb2.append(this.f43537e);
        sb2.append(", selectedTagsList=");
        sb2.append(this.f43538f);
        sb2.append(", isNewTag=");
        return AbstractC5601a.m11242m(sb2, this.f43539g, ")");
    }
}
