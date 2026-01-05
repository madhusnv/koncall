package br;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import i0.m0;
import j$.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import kq.C4184n;
import mm.AbstractC4801l;
import p020v.a1;
import tq.EnumC7204p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: br.c */
/* loaded from: classes3.dex */
public final class C0740c {

    /* renamed from: a */
    public final boolean f4667a;

    /* renamed from: b */
    public final boolean f4668b;

    /* renamed from: c */
    public final C0739b f4669c;

    /* renamed from: d */
    public final C0742e f4670d;

    /* renamed from: e */
    public final C0738a f4671e;

    /* renamed from: f */
    public final List f4672f;

    /* renamed from: g */
    public final LocalDateTime f4673g;

    /* renamed from: h */
    public final LocalDateTime f4674h;

    /* renamed from: i */
    public final EnumC7204p f4675i;

    /* renamed from: j */
    public final LocalDateTime f4676j;

    /* renamed from: k */
    public final LocalDateTime f4677k;

    /* renamed from: l */
    public final List f4678l;

    /* renamed from: m */
    public final String f4679m;

    /* renamed from: n */
    public final String f4680n;

    /* renamed from: o */
    public final String f4681o;

    /* renamed from: p */
    public final C4184n f4682p;

    /* renamed from: q */
    public final boolean f4683q;

    /* renamed from: r */
    public final String f4684r;

    /* renamed from: s */
    public final C0741d f4685s;

    /* renamed from: t */
    public final boolean f4686t;

    public C0740c(boolean z6, boolean z10, C0739b c0739b, C0742e c0742e, C0738a c0738a, List selectedCallTypeList, LocalDateTime localDateTime, LocalDateTime localDateTime2, EnumC7204p simSelectionMode, LocalDateTime localDateTime3, LocalDateTime localDateTime4, List excludeNumbers, String str, String str2, String str3, C4184n c4184n, boolean z11, String str4, C0741d c0741d, boolean z12) {
        AbstractC4154l.m8923f(selectedCallTypeList, "selectedCallTypeList");
        AbstractC4154l.m8923f(simSelectionMode, "simSelectionMode");
        AbstractC4154l.m8923f(excludeNumbers, "excludeNumbers");
        this.f4667a = z6;
        this.f4668b = z10;
        this.f4669c = c0739b;
        this.f4670d = c0742e;
        this.f4671e = c0738a;
        this.f4672f = selectedCallTypeList;
        this.f4673g = localDateTime;
        this.f4674h = localDateTime2;
        this.f4675i = simSelectionMode;
        this.f4676j = localDateTime3;
        this.f4677k = localDateTime4;
        this.f4678l = excludeNumbers;
        this.f4679m = str;
        this.f4680n = str2;
        this.f4681o = str3;
        this.f4682p = c4184n;
        this.f4683q = z11;
        this.f4684r = str4;
        this.f4685s = c0741d;
        this.f4686t = z12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.util.List] */
    /* renamed from: a */
    public static C0740c m2037a(C0740c c0740c, boolean z6, C0739b c0739b, C0742e c0742e, C0738a c0738a, ArrayList arrayList, EnumC7204p enumC7204p, LocalDateTime localDateTime, LocalDateTime localDateTime2, C4184n c4184n, boolean z10, String str, C0741d c0741d, boolean z11, int i10) {
        boolean z12 = (i10 & 1) != 0 ? c0740c.f4667a : true;
        boolean z13 = (i10 & 2) != 0 ? c0740c.f4668b : z6;
        C0739b c0739b2 = (i10 & 4) != 0 ? c0740c.f4669c : c0739b;
        C0742e c0742e2 = (i10 & 8) != 0 ? c0740c.f4670d : c0742e;
        C0738a c0738a2 = (i10 & 16) != 0 ? c0740c.f4671e : c0738a;
        ArrayList selectedCallTypeList = (i10 & 32) != 0 ? c0740c.f4672f : arrayList;
        LocalDateTime localDateTime3 = c0740c.f4673g;
        LocalDateTime localDateTime4 = c0740c.f4674h;
        EnumC7204p simSelectionMode = (i10 & 256) != 0 ? c0740c.f4675i : enumC7204p;
        LocalDateTime startDate = (i10 & 512) != 0 ? c0740c.f4676j : localDateTime;
        LocalDateTime endDate = (i10 & 1024) != 0 ? c0740c.f4677k : localDateTime2;
        List excludeNumbers = c0740c.f4678l;
        String str2 = c0740c.f4679m;
        String str3 = c0740c.f4680n;
        String str4 = c0740c.f4681o;
        C4184n c4184n2 = (i10 & 32768) != 0 ? c0740c.f4682p : c4184n;
        boolean z14 = (i10 & 65536) != 0 ? c0740c.f4683q : z10;
        String str5 = (i10 & 131072) != 0 ? c0740c.f4684r : str;
        C0741d c0741d2 = (i10 & 262144) != 0 ? c0740c.f4685s : c0741d;
        boolean z15 = (i10 & 524288) != 0 ? c0740c.f4686t : z11;
        c0740c.getClass();
        AbstractC4154l.m8923f(selectedCallTypeList, "selectedCallTypeList");
        AbstractC4154l.m8923f(simSelectionMode, "simSelectionMode");
        AbstractC4154l.m8923f(startDate, "startDate");
        AbstractC4154l.m8923f(endDate, "endDate");
        AbstractC4154l.m8923f(excludeNumbers, "excludeNumbers");
        return new C0740c(z12, z13, c0739b2, c0742e2, c0738a2, selectedCallTypeList, localDateTime3, localDateTime4, simSelectionMode, startDate, endDate, excludeNumbers, str2, str3, str4, c4184n2, z14, str5, c0741d2, z15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0740c)) {
            return false;
        }
        C0740c c0740c = (C0740c) obj;
        return this.f4667a == c0740c.f4667a && this.f4668b == c0740c.f4668b && AbstractC4154l.m8918a(this.f4669c, c0740c.f4669c) && AbstractC4154l.m8918a(this.f4670d, c0740c.f4670d) && AbstractC4154l.m8918a(this.f4671e, c0740c.f4671e) && AbstractC4154l.m8918a(this.f4672f, c0740c.f4672f) && AbstractC4154l.m8918a(this.f4673g, c0740c.f4673g) && AbstractC4154l.m8918a(this.f4674h, c0740c.f4674h) && this.f4675i == c0740c.f4675i && AbstractC4154l.m8918a(this.f4676j, c0740c.f4676j) && AbstractC4154l.m8918a(this.f4677k, c0740c.f4677k) && AbstractC4154l.m8918a(this.f4678l, c0740c.f4678l) && AbstractC4154l.m8918a(this.f4679m, c0740c.f4679m) && AbstractC4154l.m8918a(this.f4680n, c0740c.f4680n) && AbstractC4154l.m8918a(this.f4681o, c0740c.f4681o) && AbstractC4154l.m8918a(this.f4682p, c0740c.f4682p) && this.f4683q == c0740c.f4683q && AbstractC4154l.m8918a(this.f4684r, c0740c.f4684r) && AbstractC4154l.m8918a(this.f4685s, c0740c.f4685s) && this.f4686t == c0740c.f4686t;
    }

    public final int hashCode() {
        int iM4558e = AbstractC1452a.m4558e((this.f4682p.hashCode() + AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC1452a.m4559f(this.f4678l, m0.m7370c(this.f4677k, m0.m7370c(this.f4676j, (this.f4675i.hashCode() + m0.m7370c(this.f4674h, m0.m7370c(this.f4673g, AbstractC1452a.m4559f(this.f4672f, (this.f4671e.f4657a.hashCode() + AbstractC1452a.m4559f(this.f4670d.f4690a, (this.f4669c.hashCode() + AbstractC1452a.m4558e(Boolean.hashCode(this.f4667a) * 31, 31, this.f4668b)) * 31, 31)) * 31, 31), 31), 31)) * 31, 31), 31), 31), 31, this.f4679m), 31, this.f4680n), 31, this.f4681o)) * 31, 31, this.f4683q);
        String str = this.f4684r;
        return Boolean.hashCode(this.f4686t) + ((this.f4685s.hashCode() + ((iM4558e + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ContactDetailState(isEmpty=");
        sb2.append(this.f4667a);
        sb2.append(", isLoading=");
        sb2.append(this.f4668b);
        sb2.append(", callHistoryContactDetailState=");
        sb2.append(this.f4669c);
        sb2.append(", summaryContactDetailState=");
        sb2.append(this.f4670d);
        sb2.append(", analysisContactDetailState=");
        sb2.append(this.f4671e);
        sb2.append(", selectedCallTypeList=");
        sb2.append(this.f4672f);
        sb2.append(", customDateFilterFromDate=");
        sb2.append(this.f4673g);
        sb2.append(", customDateFilterToDate=");
        sb2.append(this.f4674h);
        sb2.append(", simSelectionMode=");
        sb2.append(this.f4675i);
        sb2.append(", startDate=");
        sb2.append(this.f4676j);
        sb2.append(", endDate=");
        sb2.append(this.f4677k);
        sb2.append(", excludeNumbers=");
        sb2.append(this.f4678l);
        sb2.append(", contactName=");
        a1.m14319B(sb2, this.f4679m, ", countryCode=", this.f4680n, ", number=");
        sb2.append(this.f4681o);
        sb2.append(", downloadDialogState=");
        sb2.append(this.f4682p);
        sb2.append(", isExportReport=");
        AbstractC4801l.m9751y(sb2, this.f4683q, ", exportToCsvFileName=", this.f4684r, ", exportCSVResultState=");
        sb2.append(this.f4685s);
        sb2.append(", isSubscription=");
        sb2.append(this.f4686t);
        sb2.append(")");
        return sb2.toString();
    }
}
