package rt;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rt.b */
/* loaded from: classes3.dex */
public final class C6618b {

    /* renamed from: a */
    public final List f31783a;

    /* renamed from: b */
    public final List f31784b;

    /* renamed from: c */
    public final String f31785c;

    /* renamed from: d */
    public final String f31786d;

    /* renamed from: e */
    public final String f31787e;

    /* renamed from: f */
    public final String f31788f;

    /* renamed from: g */
    public final String f31789g;

    /* renamed from: h */
    public final boolean f31790h;

    /* renamed from: i */
    public final boolean f31791i;

    /* renamed from: j */
    public final C6617a f31792j;

    /* renamed from: k */
    public final int f31793k;

    /* renamed from: l */
    public final int f31794l;

    /* renamed from: m */
    public final List f31795m;

    /* renamed from: n */
    public final String f31796n;

    /* renamed from: o */
    public final String f31797o;

    /* renamed from: p */
    public final String f31798p;

    /* renamed from: q */
    public final boolean f31799q;

    public C6618b(List messageTemplateList, List messageTemplateTag, String str, String str2, String str3, String str4, String str5, boolean z6, boolean z10, C6617a c6617a, int i10, int i11, List selectedTagList, String str6, String str7, String str8, boolean z11) {
        AbstractC4154l.m8923f(messageTemplateList, "messageTemplateList");
        AbstractC4154l.m8923f(messageTemplateTag, "messageTemplateTag");
        AbstractC4154l.m8923f(selectedTagList, "selectedTagList");
        this.f31783a = messageTemplateList;
        this.f31784b = messageTemplateTag;
        this.f31785c = str;
        this.f31786d = str2;
        this.f31787e = str3;
        this.f31788f = str4;
        this.f31789g = str5;
        this.f31790h = z6;
        this.f31791i = z10;
        this.f31792j = c6617a;
        this.f31793k = i10;
        this.f31794l = i11;
        this.f31795m = selectedTagList;
        this.f31796n = str6;
        this.f31797o = str7;
        this.f31798p = str8;
        this.f31799q = z11;
    }

    /* renamed from: a */
    public static C6618b m12669a(C6618b c6618b, List list, List list2, String str, String str2, String str3, String str4, String str5, boolean z6, boolean z10, C6617a c6617a, int i10, int i11, List list3, String str6, String str7, String str8, boolean z11, int i12) {
        List messageTemplateList = (i12 & 1) != 0 ? c6618b.f31783a : list;
        List messageTemplateTag = (i12 & 2) != 0 ? c6618b.f31784b : list2;
        String searchText = (i12 & 4) != 0 ? c6618b.f31785c : str;
        String whatsappNumber = (i12 & 8) != 0 ? c6618b.f31786d : str2;
        String whatsappNumberCountryCode = (i12 & 16) != 0 ? c6618b.f31787e : str3;
        String alternativeNumber = (i12 & 32) != 0 ? c6618b.f31788f : str4;
        String altCountryCode = (i12 & 64) != 0 ? c6618b.f31789g : str5;
        boolean z12 = (i12 & 128) != 0 ? c6618b.f31790h : z6;
        boolean z13 = (i12 & 256) != 0 ? c6618b.f31791i : z10;
        C6617a c6617a2 = (i12 & 512) != 0 ? c6618b.f31792j : c6617a;
        c6618b.getClass();
        int i13 = (i12 & NewHope.SENDB_BYTES) != 0 ? c6618b.f31793k : i10;
        int i14 = (i12 & 4096) != 0 ? c6618b.f31794l : i11;
        List selectedTagList = (i12 & 8192) != 0 ? c6618b.f31795m : list3;
        String messageTemplateId = (i12 & 16384) != 0 ? c6618b.f31796n : str6;
        String title = (i12 & 32768) != 0 ? c6618b.f31797o : str7;
        boolean z14 = z12;
        String appBarTitle = (i12 & 65536) != 0 ? c6618b.f31798p : str8;
        boolean z15 = z13;
        boolean z16 = (i12 & 131072) != 0 ? c6618b.f31799q : z11;
        c6618b.getClass();
        AbstractC4154l.m8923f(messageTemplateList, "messageTemplateList");
        AbstractC4154l.m8923f(messageTemplateTag, "messageTemplateTag");
        AbstractC4154l.m8923f(searchText, "searchText");
        AbstractC4154l.m8923f(whatsappNumber, "whatsappNumber");
        AbstractC4154l.m8923f(whatsappNumberCountryCode, "whatsappNumberCountryCode");
        AbstractC4154l.m8923f(alternativeNumber, "alternativeNumber");
        AbstractC4154l.m8923f(altCountryCode, "altCountryCode");
        AbstractC4154l.m8923f(selectedTagList, "selectedTagList");
        AbstractC4154l.m8923f(messageTemplateId, "messageTemplateId");
        AbstractC4154l.m8923f(title, "title");
        AbstractC4154l.m8923f(appBarTitle, "appBarTitle");
        return new C6618b(messageTemplateList, messageTemplateTag, searchText, whatsappNumber, whatsappNumberCountryCode, alternativeNumber, altCountryCode, z14, z15, c6617a2, i13, i14, selectedTagList, messageTemplateId, title, appBarTitle, z16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6618b)) {
            return false;
        }
        C6618b c6618b = (C6618b) obj;
        return AbstractC4154l.m8918a(this.f31783a, c6618b.f31783a) && AbstractC4154l.m8918a(this.f31784b, c6618b.f31784b) && this.f31785c.equals(c6618b.f31785c) && this.f31786d.equals(c6618b.f31786d) && this.f31787e.equals(c6618b.f31787e) && this.f31788f.equals(c6618b.f31788f) && this.f31789g.equals(c6618b.f31789g) && this.f31790h == c6618b.f31790h && this.f31791i == c6618b.f31791i && AbstractC4154l.m8918a(this.f31792j, c6618b.f31792j) && this.f31793k == c6618b.f31793k && this.f31794l == c6618b.f31794l && AbstractC4154l.m8918a(this.f31795m, c6618b.f31795m) && this.f31796n.equals(c6618b.f31796n) && this.f31797o.equals(c6618b.f31797o) && this.f31798p.equals(c6618b.f31798p) && this.f31799q == c6618b.f31799q;
    }

    public final int hashCode() {
        int iM4558e = AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC1452a.m4559f(this.f31784b, this.f31783a.hashCode() * 31, 31), 31, this.f31785c), 31, this.f31786d), 31, this.f31787e), 31, this.f31788f), 31, this.f31789g), 31, this.f31790h), 31, this.f31791i);
        C6617a c6617a = this.f31792j;
        return Boolean.hashCode(this.f31799q) + AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC1452a.m4559f(this.f31795m, AbstractC1452a.m4556c(this.f31794l, AbstractC1452a.m4556c(this.f31793k, AbstractC1452a.m4556c(-1, (iM4558e + (c6617a == null ? 0 : c6617a.hashCode())) * 31, 31), 31), 31), 31), 31, this.f31796n), 31, this.f31797o), 31, this.f31798p);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MessageTemplate(messageTemplateList=");
        sb2.append(this.f31783a);
        sb2.append(", messageTemplateTag=");
        sb2.append(this.f31784b);
        sb2.append(", searchText=");
        a1.m14319B(sb2, this.f31785c, ", whatsappNumber=", this.f31786d, ", whatsappNumberCountryCode=");
        a1.m14319B(sb2, this.f31787e, ", alternativeNumber=", this.f31788f, ", altCountryCode=");
        AbstractC4801l.m9749w(sb2, this.f31789g, ", isLoaderShow=", this.f31790h, ", isSimSelectionSheetVisible=");
        sb2.append(this.f31791i);
        sb2.append(", callLogData=");
        sb2.append(this.f31792j);
        sb2.append(", isNotFound=-1, notTemplateYet=");
        sb2.append(this.f31793k);
        sb2.append(", selectedIndex=");
        sb2.append(this.f31794l);
        sb2.append(", selectedTagList=");
        sb2.append(this.f31795m);
        sb2.append(", messageTemplateId=");
        sb2.append(this.f31796n);
        sb2.append(", title=");
        a1.m14319B(sb2, this.f31797o, ", appBarTitle=", this.f31798p, ", isInternetConnected=");
        return AbstractC5601a.m11242m(sb2, this.f31799q, ")");
    }
}
