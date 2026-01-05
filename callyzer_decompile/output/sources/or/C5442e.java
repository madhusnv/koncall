package or;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import qw.C6361k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: or.e */
/* loaded from: classes3.dex */
public final class C5442e extends AbstractC5453p {

    /* renamed from: b */
    public final String f27372b;

    /* renamed from: c */
    public final String f27373c;

    /* renamed from: d */
    public final C6361k f27374d;

    /* renamed from: e */
    public final String f27375e;

    /* renamed from: f */
    public final String f27376f;

    /* renamed from: g */
    public final int f27377g;

    /* renamed from: h */
    public String f27378h;

    /* renamed from: i */
    public final boolean f27379i;

    /* renamed from: j */
    public final ArrayList f27380j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5442e(String str, String str2, C6361k c6361k, String modelId, String label, int i10, String str3, boolean z6) {
        super(c6361k);
        AbstractC4154l.m8923f(modelId, "modelId");
        AbstractC4154l.m8923f(label, "label");
        this.f27372b = str;
        this.f27373c = str2;
        this.f27374d = c6361k;
        this.f27375e = modelId;
        this.f27376f = label;
        this.f27377g = i10;
        this.f27378h = str3;
        this.f27379i = z6;
        this.f27380j = new ArrayList();
    }

    /* renamed from: k */
    public static C5442e m11162k(C5442e c5442e, C6361k c6361k, boolean z6, int i10) {
        String dateFormat = c5442e.f27372b;
        String str = c5442e.f27373c;
        if ((i10 & 16) != 0) {
            c6361k = c5442e.f27374d;
        }
        C6361k c6361k2 = c6361k;
        String modelId = c5442e.f27375e;
        String label = c5442e.f27376f;
        int i11 = c5442e.f27377g;
        String str2 = c5442e.f27378h;
        if ((i10 & 1024) != 0) {
            z6 = c5442e.f27379i;
        }
        AbstractC4154l.m8923f(dateFormat, "dateFormat");
        AbstractC4154l.m8923f(modelId, "modelId");
        AbstractC4154l.m8923f(label, "label");
        return new C5442e(dateFormat, str, c6361k2, modelId, label, i11, str2, z6);
    }

    @Override // or.AbstractC5453p
    /* renamed from: a */
    public final int mo11149a() {
        return this.f27377g;
    }

    @Override // or.AbstractC5453p
    /* renamed from: b */
    public final String mo11150b() {
        return this.f27378h;
    }

    @Override // or.AbstractC5453p
    /* renamed from: c */
    public final Object mo11151c() {
        return this.f27374d;
    }

    @Override // or.AbstractC5453p
    /* renamed from: d */
    public final String mo11152d() {
        return this.f27376f;
    }

    @Override // or.AbstractC5453p
    /* renamed from: e */
    public final String mo11153e() {
        return this.f27375e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5442e)) {
            return false;
        }
        C5442e c5442e = (C5442e) obj;
        return AbstractC4154l.m8918a(this.f27372b, c5442e.f27372b) && AbstractC4154l.m8918a(this.f27373c, c5442e.f27373c) && AbstractC4154l.m8918a(this.f27374d, c5442e.f27374d) && AbstractC4154l.m8918a(this.f27375e, c5442e.f27375e) && AbstractC4154l.m8918a(this.f27376f, c5442e.f27376f) && this.f27377g == c5442e.f27377g && AbstractC4154l.m8918a(this.f27378h, c5442e.f27378h) && this.f27379i == c5442e.f27379i;
    }

    @Override // or.AbstractC5453p
    /* renamed from: f */
    public final List mo11154f() {
        return this.f27380j;
    }

    @Override // or.AbstractC5453p
    /* renamed from: g */
    public final boolean mo11155g() {
        return this.f27379i;
    }

    @Override // or.AbstractC5453p
    /* renamed from: h */
    public final AbstractC5453p mo11156h(boolean z6) {
        return m11162k(this, null, z6, 1023);
    }

    public final int hashCode() {
        int iHashCode = this.f27372b.hashCode() * 29791;
        String str = this.f27373c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C6361k c6361k = this.f27374d;
        int iM4556c = AbstractC1452a.m4556c(this.f27377g, AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC1452a.m4558e((iHashCode2 + (c6361k == null ? 0 : c6361k.hashCode())) * 31, 31, false), 31, this.f27375e), 31, this.f27376f), 31);
        String str2 = this.f27378h;
        return Boolean.hashCode(this.f27379i) + ((iM4556c + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // or.AbstractC5453p
    /* renamed from: i */
    public final void mo11157i(String str) {
        this.f27378h = str;
    }

    @Override // or.AbstractC5453p
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final AbstractC5453p mo11158j(C6361k c6361k) {
        return m11162k(this, c6361k, false, 2031);
    }

    public final String toString() {
        String str = this.f27378h;
        StringBuilder sbM127r = AbstractC0030c.m127r("DateFilterField(dateFormat=", this.f27372b, ", minDate=null, maxDate=null, helpText=", this.f27373c, ", fieldValue=");
        sbM127r.append(this.f27374d);
        sbM127r.append(", isRequired=false, modelId=");
        sbM127r.append(this.f27375e);
        sbM127r.append(", label=");
        AbstractC1452a.m4551B(sbM127r, this.f27376f, ", displayOrder=", this.f27377g, ", errorMessage=");
        sbM127r.append(str);
        sbM127r.append(", isSelectedForFilter=");
        sbM127r.append(this.f27379i);
        sbM127r.append(")");
        return sbM127r.toString();
    }

    public /* synthetic */ C5442e(String str, String str2, C6361k c6361k, String str3, String str4, int i10, String str5, boolean z6, int i11) {
        this(str, str2, c6361k, str3, str4, i10, str5, (i11 & 1024) != 0 ? false : z6);
    }
}
