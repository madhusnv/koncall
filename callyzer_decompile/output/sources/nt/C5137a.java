package nt;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nt.a */
/* loaded from: classes3.dex */
public final class C5137a {

    /* renamed from: a */
    public final List f25151a;

    /* renamed from: b */
    public final List f25152b;

    /* renamed from: c */
    public final List f25153c;

    /* renamed from: d */
    public final boolean f25154d;

    /* renamed from: e */
    public final boolean f25155e;

    /* renamed from: f */
    public final List f25156f;

    /* renamed from: g */
    public final List f25157g;

    /* renamed from: h */
    public final String f25158h;

    /* renamed from: i */
    public final String f25159i;

    /* renamed from: j */
    public final boolean f25160j;

    /* renamed from: k */
    public final String f25161k;

    /* renamed from: l */
    public final String f25162l;

    /* renamed from: m */
    public final boolean f25163m;

    /* renamed from: n */
    public final boolean f25164n;

    /* renamed from: o */
    public final boolean f25165o;

    /* renamed from: p */
    public final String f25166p;

    /* renamed from: q */
    public final boolean f25167q;

    /* renamed from: r */
    public final String f25168r;

    public C5137a(List messageSubTemplateList, List selectedSubTemplate, List allMissingFields, boolean z6, boolean z10, List imageUriList, List selectedSubTemplateIds, String str, String str2, boolean z11, String str3, String str4, boolean z12, boolean z13, boolean z14, String str5, boolean z15, String str6) {
        AbstractC4154l.m8923f(messageSubTemplateList, "messageSubTemplateList");
        AbstractC4154l.m8923f(selectedSubTemplate, "selectedSubTemplate");
        AbstractC4154l.m8923f(allMissingFields, "allMissingFields");
        AbstractC4154l.m8923f(imageUriList, "imageUriList");
        AbstractC4154l.m8923f(selectedSubTemplateIds, "selectedSubTemplateIds");
        this.f25151a = messageSubTemplateList;
        this.f25152b = selectedSubTemplate;
        this.f25153c = allMissingFields;
        this.f25154d = z6;
        this.f25155e = z10;
        this.f25156f = imageUriList;
        this.f25157g = selectedSubTemplateIds;
        this.f25158h = str;
        this.f25159i = str2;
        this.f25160j = z11;
        this.f25161k = str3;
        this.f25162l = str4;
        this.f25163m = z12;
        this.f25164n = z13;
        this.f25165o = z14;
        this.f25166p = str5;
        this.f25167q = z15;
        this.f25168r = str6;
    }

    /* renamed from: a */
    public static C5137a m10057a(C5137a c5137a, List list, List list2, List list3, boolean z6, boolean z10, List list4, String str, String str2, boolean z11, String str3, String str4, boolean z12, boolean z13, String str5, boolean z14, String str6, int i10) {
        List messageSubTemplateList = (i10 & 1) != 0 ? c5137a.f25151a : list;
        List selectedSubTemplate = (i10 & 2) != 0 ? c5137a.f25152b : list2;
        List allMissingFields = (i10 & 4) != 0 ? c5137a.f25153c : list3;
        boolean z15 = (i10 & 8) != 0 ? c5137a.f25154d : z6;
        boolean z16 = (i10 & 16) != 0 ? c5137a.f25155e : z10;
        c5137a.getClass();
        List imageUriList = (i10 & 64) != 0 ? c5137a.f25156f : list4;
        List selectedSubTemplateIds = c5137a.f25157g;
        c5137a.getClass();
        String description = (i10 & 512) != 0 ? c5137a.f25158h : str;
        String allDescription = (i10 & 1024) != 0 ? c5137a.f25159i : str2;
        boolean z17 = (i10 & NewHope.SENDB_BYTES) != 0 ? c5137a.f25160j : z11;
        String whatsAppContactNumber = (i10 & 4096) != 0 ? c5137a.f25161k : str3;
        String whatsappNumberCountryCode = (i10 & 8192) != 0 ? c5137a.f25162l : str4;
        boolean z18 = (i10 & 16384) != 0 ? c5137a.f25163m : z12;
        boolean z19 = (32768 & i10) != 0 ? c5137a.f25164n : false;
        boolean z20 = (65536 & i10) != 0 ? c5137a.f25165o : z13;
        String messageTemplateId = (131072 & i10) != 0 ? c5137a.f25166p : str5;
        boolean z21 = (262144 & i10) != 0 ? c5137a.f25167q : z14;
        String str7 = (i10 & 524288) != 0 ? c5137a.f25168r : str6;
        c5137a.getClass();
        AbstractC4154l.m8923f(messageSubTemplateList, "messageSubTemplateList");
        AbstractC4154l.m8923f(selectedSubTemplate, "selectedSubTemplate");
        AbstractC4154l.m8923f(allMissingFields, "allMissingFields");
        AbstractC4154l.m8923f(imageUriList, "imageUriList");
        AbstractC4154l.m8923f(selectedSubTemplateIds, "selectedSubTemplateIds");
        AbstractC4154l.m8923f(description, "description");
        AbstractC4154l.m8923f(allDescription, "allDescription");
        AbstractC4154l.m8923f(whatsAppContactNumber, "whatsAppContactNumber");
        AbstractC4154l.m8923f(whatsappNumberCountryCode, "whatsappNumberCountryCode");
        AbstractC4154l.m8923f(messageTemplateId, "messageTemplateId");
        return new C5137a(messageSubTemplateList, selectedSubTemplate, allMissingFields, z15, z16, imageUriList, selectedSubTemplateIds, description, allDescription, z17, whatsAppContactNumber, whatsappNumberCountryCode, z18, z19, z20, messageTemplateId, z21, str7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5137a)) {
            return false;
        }
        C5137a c5137a = (C5137a) obj;
        return AbstractC4154l.m8918a(this.f25151a, c5137a.f25151a) && AbstractC4154l.m8918a(this.f25152b, c5137a.f25152b) && AbstractC4154l.m8918a(this.f25153c, c5137a.f25153c) && this.f25154d == c5137a.f25154d && this.f25155e == c5137a.f25155e && AbstractC4154l.m8918a(this.f25156f, c5137a.f25156f) && AbstractC4154l.m8918a(this.f25157g, c5137a.f25157g) && this.f25158h.equals(c5137a.f25158h) && this.f25159i.equals(c5137a.f25159i) && this.f25160j == c5137a.f25160j && this.f25161k.equals(c5137a.f25161k) && this.f25162l.equals(c5137a.f25162l) && this.f25163m == c5137a.f25163m && this.f25164n == c5137a.f25164n && this.f25165o == c5137a.f25165o && this.f25166p.equals(c5137a.f25166p) && this.f25167q == c5137a.f25167q && AbstractC4154l.m8918a(this.f25168r, c5137a.f25168r);
    }

    public final int hashCode() {
        int iM4558e = AbstractC1452a.m4558e(AbstractC0030c.m113d(AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC1452a.m4558e(AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC1452a.m4558e(AbstractC1452a.m4559f(this.f25157g, AbstractC1452a.m4559f(this.f25156f, AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4559f(this.f25153c, AbstractC1452a.m4559f(this.f25152b, this.f25151a.hashCode() * 31, 31), 31), 31, this.f25154d), 31, this.f25155e), 31, false), 31), 31), 31, false), 31, this.f25158h), 31, this.f25159i), 31, this.f25160j), 31, this.f25161k), 31, this.f25162l), 31, this.f25163m), 31, this.f25164n), 31, this.f25165o), 31, this.f25166p), 31, this.f25167q);
        String str = this.f25168r;
        return iM4558e + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MessageSubTemplate(messageSubTemplateList=");
        sb2.append(this.f25151a);
        sb2.append(", selectedSubTemplate=");
        sb2.append(this.f25152b);
        sb2.append(", allMissingFields=");
        sb2.append(this.f25153c);
        sb2.append(", isDownloadBottomSheetVisible=");
        sb2.append(this.f25154d);
        sb2.append(", isConfirmationBottomSheetVisible=");
        sb2.append(this.f25155e);
        sb2.append(", isSendBottomSheetVisible=false, imageUriList=");
        sb2.append(this.f25156f);
        sb2.append(", selectedSubTemplateIds=");
        sb2.append(this.f25157g);
        sb2.append(", isShowDynamicValueBottomSheet=false, description=");
        sb2.append(this.f25158h);
        sb2.append(", allDescription=");
        AbstractC4801l.m9749w(sb2, this.f25159i, ", isSingleTemplate=", this.f25160j, ", whatsAppContactNumber=");
        a1.m14319B(sb2, this.f25161k, ", whatsappNumberCountryCode=", this.f25162l, ", isFromMoreScreen=");
        AbstractC0030c.m133x(sb2, this.f25163m, ", isLoaded=", this.f25164n, ", showInternetBelt=");
        AbstractC4801l.m9751y(sb2, this.f25165o, ", messageTemplateId=", this.f25166p, ", isSubTemplateIsEmpty=");
        sb2.append(this.f25167q);
        sb2.append(", appBarTitle=");
        sb2.append(this.f25168r);
        sb2.append(")");
        return sb2.toString();
    }
}
