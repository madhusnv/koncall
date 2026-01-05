package at;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: at.b */
/* loaded from: classes3.dex */
public final class C0431b {

    /* renamed from: a */
    public final String f3169a;

    /* renamed from: b */
    public final int f3170b;

    /* renamed from: c */
    public final String f3171c;

    /* renamed from: d */
    public final int f3172d;

    /* renamed from: e */
    public final boolean f3173e;

    /* renamed from: f */
    public final boolean f3174f;

    /* renamed from: g */
    public final Integer f3175g;

    /* renamed from: h */
    public final Integer f3176h;

    /* renamed from: i */
    public final String f3177i;

    /* renamed from: j */
    public final boolean f3178j;

    /* renamed from: k */
    public final String f3179k;

    /* renamed from: l */
    public final Integer f3180l;

    /* renamed from: m */
    public final EnumC0434e f3181m;

    /* renamed from: n */
    public final List f3182n;

    /* renamed from: o */
    public final List f3183o;

    /* renamed from: p */
    public final String f3184p;

    /* renamed from: q */
    public final String f3185q;

    /* renamed from: r */
    public final String f3186r;

    /* renamed from: s */
    public final boolean f3187s;

    /* renamed from: t */
    public final boolean f3188t;

    /* renamed from: u */
    public final boolean f3189u;

    public C0431b(String str, int i10, String str2, int i11, boolean z6, boolean z10, Integer num, Integer num2, String str3, boolean z11, String str4, Integer num3, EnumC0434e appBarTitleType, List simSelectionItems, List connectedSimSize, String str5, String str6, String str7, boolean z12, boolean z13, boolean z14) {
        AbstractC4154l.m8923f(appBarTitleType, "appBarTitleType");
        AbstractC4154l.m8923f(simSelectionItems, "simSelectionItems");
        AbstractC4154l.m8923f(connectedSimSize, "connectedSimSize");
        this.f3169a = str;
        this.f3170b = i10;
        this.f3171c = str2;
        this.f3172d = i11;
        this.f3173e = z6;
        this.f3174f = z10;
        this.f3175g = num;
        this.f3176h = num2;
        this.f3177i = str3;
        this.f3178j = z11;
        this.f3179k = str4;
        this.f3180l = num3;
        this.f3181m = appBarTitleType;
        this.f3182n = simSelectionItems;
        this.f3183o = connectedSimSize;
        this.f3184p = str5;
        this.f3185q = str6;
        this.f3186r = str7;
        this.f3187s = z12;
        this.f3188t = z13;
        this.f3189u = z14;
    }

    /* renamed from: a */
    public static C0431b m1454a(C0431b c0431b, String str, int i10, String str2, int i11, boolean z6, boolean z10, Integer num, Integer num2, String str3, boolean z11, String str4, Integer num3, EnumC0434e enumC0434e, List list, List list2, String str5, String str6, String str7, boolean z12, int i12) {
        String title = (i12 & 1) != 0 ? c0431b.f3169a : str;
        int i13 = (i12 & 2) != 0 ? c0431b.f3170b : i10;
        String description = (i12 & 4) != 0 ? c0431b.f3171c : str2;
        int i14 = (i12 & 8) != 0 ? c0431b.f3172d : i11;
        boolean z13 = (i12 & 16) != 0 ? c0431b.f3173e : z6;
        boolean z14 = (i12 & 32) != 0 ? c0431b.f3174f : z10;
        Integer num4 = (i12 & 64) != 0 ? c0431b.f3175g : num;
        Integer num5 = (i12 & 128) != 0 ? c0431b.f3176h : num2;
        String str8 = (i12 & 256) != 0 ? c0431b.f3177i : str3;
        boolean z15 = (i12 & 512) != 0 ? c0431b.f3178j : z11;
        String simNumber = (i12 & 1024) != 0 ? c0431b.f3179k : str4;
        Integer num6 = (i12 & NewHope.SENDB_BYTES) != 0 ? c0431b.f3180l : num3;
        EnumC0434e appBarTitleType = (i12 & 4096) != 0 ? c0431b.f3181m : enumC0434e;
        List simSelectionItems = (i12 & 8192) != 0 ? c0431b.f3182n : list;
        int i15 = i13;
        List connectedSimSize = (i12 & 16384) != 0 ? c0431b.f3183o : list2;
        String selectedSimTitle = (i12 & 32768) != 0 ? c0431b.f3184p : str5;
        int i16 = i14;
        String titleCopy = (i12 & 65536) != 0 ? c0431b.f3185q : str6;
        boolean z16 = z13;
        String descriptionCopy = (i12 & 131072) != 0 ? c0431b.f3186r : str7;
        boolean z17 = z14;
        boolean z18 = (i12 & 262144) != 0 ? c0431b.f3187s : z12;
        boolean z19 = (i12 & 524288) != 0 ? c0431b.f3188t : true;
        boolean z20 = (i12 & 1048576) != 0 ? c0431b.f3189u : true;
        c0431b.getClass();
        AbstractC4154l.m8923f(title, "title");
        AbstractC4154l.m8923f(description, "description");
        AbstractC4154l.m8923f(simNumber, "simNumber");
        AbstractC4154l.m8923f(appBarTitleType, "appBarTitleType");
        AbstractC4154l.m8923f(simSelectionItems, "simSelectionItems");
        AbstractC4154l.m8923f(connectedSimSize, "connectedSimSize");
        AbstractC4154l.m8923f(selectedSimTitle, "selectedSimTitle");
        AbstractC4154l.m8923f(titleCopy, "titleCopy");
        AbstractC4154l.m8923f(descriptionCopy, "descriptionCopy");
        return new C0431b(title, i15, description, i16, z16, z17, num4, num5, str8, z15, simNumber, num6, appBarTitleType, simSelectionItems, connectedSimSize, selectedSimTitle, titleCopy, descriptionCopy, z18, z19, z20);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0431b)) {
            return false;
        }
        C0431b c0431b = (C0431b) obj;
        return AbstractC4154l.m8918a(this.f3169a, c0431b.f3169a) && this.f3170b == c0431b.f3170b && AbstractC4154l.m8918a(this.f3171c, c0431b.f3171c) && this.f3172d == c0431b.f3172d && this.f3173e == c0431b.f3173e && this.f3174f == c0431b.f3174f && AbstractC4154l.m8918a(this.f3175g, c0431b.f3175g) && AbstractC4154l.m8918a(this.f3176h, c0431b.f3176h) && AbstractC4154l.m8918a(this.f3177i, c0431b.f3177i) && this.f3178j == c0431b.f3178j && AbstractC4154l.m8918a(this.f3179k, c0431b.f3179k) && AbstractC4154l.m8918a(this.f3180l, c0431b.f3180l) && this.f3181m == c0431b.f3181m && AbstractC4154l.m8918a(this.f3182n, c0431b.f3182n) && AbstractC4154l.m8918a(this.f3183o, c0431b.f3183o) && AbstractC4154l.m8918a(this.f3184p, c0431b.f3184p) && AbstractC4154l.m8918a(this.f3185q, c0431b.f3185q) && AbstractC4154l.m8918a(this.f3186r, c0431b.f3186r) && this.f3187s == c0431b.f3187s && this.f3188t == c0431b.f3188t && this.f3189u == c0431b.f3189u;
    }

    public final int hashCode() {
        int iM4558e = AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4556c(this.f3172d, AbstractC0030c.m113d(AbstractC1452a.m4556c(this.f3170b, this.f3169a.hashCode() * 31, 31), 31, this.f3171c), 31), 31, this.f3173e), 31, this.f3174f);
        Integer num = this.f3175g;
        int iHashCode = (iM4558e + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f3176h;
        int iM113d = AbstractC0030c.m113d(AbstractC1452a.m4558e(AbstractC0030c.m113d((iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.f3177i), 31, this.f3178j), 31, this.f3179k);
        Integer num3 = this.f3180l;
        return Boolean.hashCode(this.f3189u) + AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC1452a.m4559f(this.f3183o, AbstractC1452a.m4559f(this.f3182n, (this.f3181m.hashCode() + ((iM113d + (num3 != null ? num3.hashCode() : 0)) * 31)) * 31, 31), 31), 31, this.f3184p), 31, this.f3185q), 31, this.f3186r), 31, this.f3187s), 31, this.f3188t);
    }

    public final String toString() {
        StringBuilder sbM125p = AbstractC0030c.m125p(this.f3170b, "CreateEditCloneTemplateState(title=", this.f3169a, ", id=", ", description=");
        AbstractC1452a.m4551B(sbM125p, this.f3171c, ", useCount=", this.f3172d, ", isTitleValid=");
        AbstractC0030c.m133x(sbM125p, this.f3173e, ", isDescriptionValid=", this.f3174f, ", isTitleError=");
        sbM125p.append(this.f3175g);
        sbM125p.append(", isDescriptionError=");
        sbM125p.append(this.f3176h);
        sbM125p.append(", noteTemplateId=");
        AbstractC4801l.m9749w(sbM125p, this.f3177i, ", disCardChanges=", this.f3178j, ", simNumber=");
        sbM125p.append(this.f3179k);
        sbM125p.append(", simSlot=");
        sbM125p.append(this.f3180l);
        sbM125p.append(", appBarTitleType=");
        sbM125p.append(this.f3181m);
        sbM125p.append(", simSelectionItems=");
        sbM125p.append(this.f3182n);
        sbM125p.append(", connectedSimSize=");
        sbM125p.append(this.f3183o);
        sbM125p.append(", selectedSimTitle=");
        sbM125p.append(this.f3184p);
        sbM125p.append(", titleCopy=");
        a1.m14319B(sbM125p, this.f3185q, ", descriptionCopy=", this.f3186r, ", isLoading=");
        AbstractC0030c.m133x(sbM125p, this.f3187s, ", isDoublePopBack=", this.f3188t, ", isErrorBottomSheetVisible=");
        return AbstractC5601a.m11242m(sbM125p, this.f3189u, ")");
    }
}
