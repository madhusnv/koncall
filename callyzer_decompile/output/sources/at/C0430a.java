package at;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import ct.C1502a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import tq.EnumC7204p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: at.a */
/* loaded from: classes3.dex */
public final class C0430a {

    /* renamed from: a */
    public final boolean f3153a;

    /* renamed from: b */
    public final boolean f3154b;

    /* renamed from: c */
    public final String f3155c;

    /* renamed from: d */
    public final boolean f3156d;

    /* renamed from: e */
    public final boolean f3157e;

    /* renamed from: f */
    public final boolean f3158f;

    /* renamed from: g */
    public final EnumC7204p f3159g;

    /* renamed from: h */
    public final String f3160h;

    /* renamed from: i */
    public final String f3161i;

    /* renamed from: j */
    public final int f3162j;

    /* renamed from: k */
    public final boolean f3163k;

    /* renamed from: l */
    public final boolean f3164l;

    /* renamed from: m */
    public final int f3165m;

    /* renamed from: n */
    public final C1502a f3166n;

    /* renamed from: o */
    public final List f3167o;

    /* renamed from: p */
    public final List f3168p;

    public C0430a(boolean z6, boolean z10, String str, boolean z11, boolean z12, boolean z13, EnumC7204p selectedSimOptionMode, String str2, String str3, int i10, boolean z14, boolean z15, int i11, C1502a c1502a, List list, List connectedSimDetails) {
        AbstractC4154l.m8923f(selectedSimOptionMode, "selectedSimOptionMode");
        AbstractC4154l.m8923f(connectedSimDetails, "connectedSimDetails");
        this.f3153a = z6;
        this.f3154b = z10;
        this.f3155c = str;
        this.f3156d = z11;
        this.f3157e = z12;
        this.f3158f = z13;
        this.f3159g = selectedSimOptionMode;
        this.f3160h = str2;
        this.f3161i = str3;
        this.f3162j = i10;
        this.f3163k = z14;
        this.f3164l = z15;
        this.f3165m = i11;
        this.f3166n = c1502a;
        this.f3167o = list;
        this.f3168p = connectedSimDetails;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.util.List] */
    /* renamed from: a */
    public static C0430a m1453a(C0430a c0430a, boolean z6, boolean z10, String str, boolean z11, boolean z12, boolean z13, EnumC7204p enumC7204p, int i10, boolean z14, int i11, C1502a c1502a, ArrayList arrayList, List list, int i12) {
        boolean z15 = (i12 & 1) != 0 ? c0430a.f3153a : z6;
        c0430a.getClass();
        boolean z16 = (i12 & 4) != 0 ? c0430a.f3154b : z10;
        String simNumber = (i12 & 8) != 0 ? c0430a.f3155c : str;
        boolean z17 = (i12 & 16) != 0 ? c0430a.f3156d : z11;
        boolean z18 = (i12 & 32) != 0 ? c0430a.f3157e : z12;
        boolean z19 = (i12 & 64) != 0 ? c0430a.f3158f : z13;
        EnumC7204p selectedSimOptionMode = (i12 & 128) != 0 ? c0430a.f3159g : enumC7204p;
        String str2 = c0430a.f3160h;
        String str3 = c0430a.f3161i;
        int i13 = (i12 & 1024) != 0 ? c0430a.f3162j : i10;
        boolean z20 = (i12 & NewHope.SENDB_BYTES) != 0 ? c0430a.f3163k : z14;
        boolean z21 = (i12 & 4096) != 0 ? c0430a.f3164l : false;
        int i14 = (i12 & 8192) != 0 ? c0430a.f3165m : i11;
        C1502a c1502a2 = (i12 & 16384) != 0 ? c0430a.f3166n : c1502a;
        ArrayList arrayList2 = (32768 & i12) != 0 ? c0430a.f3167o : arrayList;
        List connectedSimDetails = (i12 & 65536) != 0 ? c0430a.f3168p : list;
        c0430a.getClass();
        AbstractC4154l.m8923f(simNumber, "simNumber");
        AbstractC4154l.m8923f(selectedSimOptionMode, "selectedSimOptionMode");
        AbstractC4154l.m8923f(connectedSimDetails, "connectedSimDetails");
        return new C0430a(z15, z16, simNumber, z17, z18, z19, selectedSimOptionMode, str2, str3, i13, z20, z21, i14, c1502a2, arrayList2, connectedSimDetails);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0430a)) {
            return false;
        }
        C0430a c0430a = (C0430a) obj;
        return this.f3153a == c0430a.f3153a && this.f3154b == c0430a.f3154b && this.f3155c.equals(c0430a.f3155c) && this.f3156d == c0430a.f3156d && this.f3157e == c0430a.f3157e && this.f3158f == c0430a.f3158f && this.f3159g == c0430a.f3159g && this.f3160h.equals(c0430a.f3160h) && this.f3161i.equals(c0430a.f3161i) && this.f3162j == c0430a.f3162j && this.f3163k == c0430a.f3163k && this.f3164l == c0430a.f3164l && this.f3165m == c0430a.f3165m && AbstractC4154l.m8918a(this.f3166n, c0430a.f3166n) && this.f3167o.equals(c0430a.f3167o) && AbstractC4154l.m8918a(this.f3168p, c0430a.f3168p);
    }

    public final int hashCode() {
        int iM4556c = AbstractC1452a.m4556c(this.f3165m, AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4556c(this.f3162j, AbstractC0030c.m113d(AbstractC0030c.m113d((this.f3159g.hashCode() + AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC0030c.m113d(AbstractC1452a.m4558e(AbstractC1452a.m4556c(0, Boolean.hashCode(this.f3153a) * 31, 31), 31, this.f3154b), 31, this.f3155c), 31, this.f3156d), 31, this.f3157e), 31, this.f3158f)) * 31, 31, this.f3160h), 31, this.f3161i), 31), 31, this.f3163k), 31, this.f3164l), 31);
        C1502a c1502a = this.f3166n;
        return this.f3168p.hashCode() + AbstractC1452a.m4559f(this.f3167o, (iM4556c + (c1502a != null ? c1502a.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CallNoteTemplateState(isShowDeleteDialog=");
        sb2.append(this.f3153a);
        sb2.append(", useCount=0, userCreatedTemplate=");
        sb2.append(this.f3154b);
        sb2.append(", simNumber=");
        AbstractC4801l.m9749w(sb2, this.f3155c, ", isLoading=", this.f3156d, ", isLoadingOnAdd=");
        AbstractC0030c.m133x(sb2, this.f3157e, ", simSelection=", this.f3158f, ", selectedSimOptionMode=");
        sb2.append(this.f3159g);
        sb2.append(", searchString=");
        sb2.append(this.f3160h);
        sb2.append(", clearSearch=");
        AbstractC1452a.m4551B(sb2, this.f3161i, ", notFound=", this.f3162j, ", isSubscriptionActive=");
        AbstractC0030c.m133x(sb2, this.f3163k, ", apiLoader=", this.f3164l, ", simIcon=");
        sb2.append(this.f3165m);
        sb2.append(", toDeleteTemplate=");
        sb2.append(this.f3166n);
        sb2.append(", callNoteTemplatesItems=");
        sb2.append(this.f3167o);
        sb2.append(", connectedSimDetails=");
        sb2.append(this.f3168p);
        sb2.append(")");
        return sb2.toString();
    }
}
