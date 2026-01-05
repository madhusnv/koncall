package iv;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import l4.C4381z;
import org.bouncycastle.pqc.crypto.newhope.NewHope;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: iv.a */
/* loaded from: classes3.dex */
public final class C3357a {

    /* renamed from: a */
    public final int f17754a;

    /* renamed from: b */
    public final C4381z f17755b;

    /* renamed from: c */
    public final C4381z f17756c;

    /* renamed from: d */
    public final C4381z f17757d;

    /* renamed from: e */
    public final C4381z f17758e;

    /* renamed from: f */
    public final String f17759f;

    /* renamed from: g */
    public final List f17760g;

    /* renamed from: h */
    public final String f17761h;

    /* renamed from: i */
    public final boolean f17762i;

    /* renamed from: j */
    public final boolean f17763j;

    /* renamed from: k */
    public final String f17764k;

    /* renamed from: l */
    public final List f17765l;

    /* renamed from: m */
    public final List f17766m;

    /* renamed from: n */
    public final Integer f17767n;

    /* renamed from: o */
    public final boolean f17768o;

    /* renamed from: p */
    public final boolean f17769p;

    public C3357a(int i10, C4381z c4381z, C4381z c4381z2, C4381z c4381z3, C4381z c4381z4, String str, List list, String str2, boolean z6, boolean z10, String str3, List list2, List list3, Integer num, boolean z11, boolean z12) {
        this.f17754a = i10;
        this.f17755b = c4381z;
        this.f17756c = c4381z2;
        this.f17757d = c4381z3;
        this.f17758e = c4381z4;
        this.f17759f = str;
        this.f17760g = list;
        this.f17761h = str2;
        this.f17762i = z6;
        this.f17763j = z10;
        this.f17764k = str3;
        this.f17765l = list2;
        this.f17766m = list3;
        this.f17767n = num;
        this.f17768o = z11;
        this.f17769p = z12;
    }

    /* renamed from: a */
    public static C3357a m7671a(C3357a c3357a, int i10, C4381z c4381z, C4381z c4381z2, C4381z c4381z3, C4381z c4381z4, String str, ArrayList arrayList, String str2, boolean z6, boolean z10, String str3, List list, List list2, Integer num, boolean z11, boolean z12, int i11) {
        int i12 = (i11 & 1) != 0 ? c3357a.f17754a : i10;
        C4381z o12 = (i11 & 2) != 0 ? c3357a.f17755b : c4381z;
        C4381z o22 = (i11 & 4) != 0 ? c3357a.f17756c : c4381z2;
        C4381z o32 = (i11 & 8) != 0 ? c3357a.f17757d : c4381z3;
        C4381z o42 = (i11 & 16) != 0 ? c3357a.f17758e : c4381z4;
        String dcc = (i11 & 32) != 0 ? c3357a.f17759f : str;
        List registerResult = (i11 & 64) != 0 ? c3357a.f17760g : arrayList;
        String str4 = (i11 & 128) != 0 ? c3357a.f17761h : str2;
        boolean z13 = (i11 & 256) != 0 ? c3357a.f17762i : z6;
        boolean z14 = (i11 & 512) != 0 ? c3357a.f17763j : z10;
        String progressMsg = (i11 & 1024) != 0 ? c3357a.f17764k : str3;
        List simUiModel = (i11 & NewHope.SENDB_BYTES) != 0 ? c3357a.f17765l : list;
        List deviceRequest = (i11 & 4096) != 0 ? c3357a.f17766m : list2;
        Integer num2 = (i11 & 8192) != 0 ? c3357a.f17767n : num;
        int i13 = i12;
        boolean z15 = (i11 & 16384) != 0 ? c3357a.f17768o : z11;
        boolean z16 = (i11 & 32768) != 0 ? c3357a.f17769p : z12;
        c3357a.getClass();
        AbstractC4154l.m8923f(o12, "o1");
        AbstractC4154l.m8923f(o22, "o2");
        AbstractC4154l.m8923f(o32, "o3");
        AbstractC4154l.m8923f(o42, "o4");
        AbstractC4154l.m8923f(dcc, "dcc");
        AbstractC4154l.m8923f(registerResult, "registerResult");
        AbstractC4154l.m8923f(progressMsg, "progressMsg");
        AbstractC4154l.m8923f(simUiModel, "simUiModel");
        AbstractC4154l.m8923f(deviceRequest, "deviceRequest");
        return new C3357a(i13, o12, o22, o32, o42, dcc, registerResult, str4, z13, z14, progressMsg, simUiModel, deviceRequest, num2, z15, z16);
    }

    /* renamed from: b */
    public final String m7672b() {
        return this.f17755b.f21945a.f13620b + this.f17756c.f21945a.f13620b + this.f17757d.f21945a.f13620b + this.f17758e.f21945a.f13620b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3357a)) {
            return false;
        }
        C3357a c3357a = (C3357a) obj;
        return this.f17754a == c3357a.f17754a && AbstractC4154l.m8918a(this.f17755b, c3357a.f17755b) && AbstractC4154l.m8918a(this.f17756c, c3357a.f17756c) && AbstractC4154l.m8918a(this.f17757d, c3357a.f17757d) && AbstractC4154l.m8918a(this.f17758e, c3357a.f17758e) && AbstractC4154l.m8918a(this.f17759f, c3357a.f17759f) && AbstractC4154l.m8918a(this.f17760g, c3357a.f17760g) && AbstractC4154l.m8918a(this.f17761h, c3357a.f17761h) && this.f17762i == c3357a.f17762i && this.f17763j == c3357a.f17763j && AbstractC4154l.m8918a(this.f17764k, c3357a.f17764k) && AbstractC4154l.m8918a(this.f17765l, c3357a.f17765l) && AbstractC4154l.m8918a(this.f17766m, c3357a.f17766m) && AbstractC4154l.m8918a(this.f17767n, c3357a.f17767n) && this.f17768o == c3357a.f17768o && this.f17769p == c3357a.f17769p;
    }

    public final int hashCode() {
        int iM4559f = AbstractC1452a.m4559f(this.f17760g, AbstractC0030c.m113d((this.f17758e.hashCode() + ((this.f17757d.hashCode() + ((this.f17756c.hashCode() + ((this.f17755b.hashCode() + (Integer.hashCode(this.f17754a) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.f17759f), 31);
        String str = this.f17761h;
        int iM4559f2 = AbstractC1452a.m4559f(this.f17766m, AbstractC1452a.m4559f(this.f17765l, AbstractC0030c.m113d(AbstractC1452a.m4558e(AbstractC1452a.m4558e((iM4559f + (str == null ? 0 : str.hashCode())) * 31, 31, this.f17762i), 31, this.f17763j), 31, this.f17764k), 31), 31);
        Integer num = this.f17767n;
        return Boolean.hashCode(this.f17769p) + AbstractC1452a.m4558e((iM4559f2 + (num != null ? num.hashCode() : 0)) * 31, 31, this.f17768o);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TwoFactorAuthState(countDown=");
        sb2.append(this.f17754a);
        sb2.append(", o1=");
        sb2.append(this.f17755b);
        sb2.append(", o2=");
        sb2.append(this.f17756c);
        sb2.append(", o3=");
        sb2.append(this.f17757d);
        sb2.append(", o4=");
        sb2.append(this.f17758e);
        sb2.append(", dcc=");
        sb2.append(this.f17759f);
        sb2.append(", registerResult=");
        sb2.append(this.f17760g);
        sb2.append(", apiFailure=");
        sb2.append(this.f17761h);
        sb2.append(", openErrorBottomSheet=");
        AbstractC0030c.m133x(sb2, this.f17762i, ", inProcess=", this.f17763j, ", progressMsg=");
        sb2.append(this.f17764k);
        sb2.append(", simUiModel=");
        sb2.append(this.f17765l);
        sb2.append(", deviceRequest=");
        sb2.append(this.f17766m);
        sb2.append(", errorMessage=");
        sb2.append(this.f17767n);
        sb2.append(", isInternetConnected=");
        sb2.append(this.f17768o);
        sb2.append(", isOtpVerify=");
        sb2.append(this.f17769p);
        sb2.append(")");
        return sb2.toString();
    }
}
