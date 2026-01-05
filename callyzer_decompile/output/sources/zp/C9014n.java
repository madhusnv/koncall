package zp;

import com.websoptimization.callyzerbiz.R;
import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;
import om.C5418t;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import yv.C8789d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zp.n */
/* loaded from: classes3.dex */
public final class C9014n {

    /* renamed from: a */
    public final C5418t f43419a;

    /* renamed from: b */
    public final String f43420b;

    /* renamed from: c */
    public final String f43421c;

    /* renamed from: d */
    public final String f43422d;

    /* renamed from: e */
    public final String f43423e;

    /* renamed from: f */
    public final String f43424f;

    /* renamed from: g */
    public final String f43425g;

    /* renamed from: h */
    public final int f43426h;

    public C9014n(C5418t data) {
        String strM16160g;
        AbstractC4154l.m8923f(data, "data");
        this.f43419a = data;
        this.f43420b = data.f27225a;
        int i10 = data.f27227c;
        String str = data.f27226b;
        this.f43421c = AbstractC5601a.m11232c(i10, "+", str);
        this.f43422d = AbstractC4801l.m9730d(i10, "+");
        this.f43423e = str;
        this.f43424f = String.valueOf(data.f27231g);
        Long l9 = data.f27230f;
        this.f43425g = (l9 == null || (strM16160g = C8789d.m16160g(false, l9.longValue())) == null) ? "0s" : strM16160g;
        int i11 = AbstractC9013m.f43418a[data.f27228d.ordinal()];
        int i12 = R.drawable.ic_incoming_call;
        if (i11 != 1 && i11 == 2) {
            i12 = R.drawable.ic_outgoing_call;
        }
        this.f43426h = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9014n) && AbstractC4154l.m8918a(this.f43419a, ((C9014n) obj).f43419a);
    }

    public final int hashCode() {
        return this.f43419a.hashCode();
    }

    public final String toString() {
        return "TopTenCallsUiModel(data=" + this.f43419a + ")";
    }
}
