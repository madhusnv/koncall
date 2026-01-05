package or;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import ho.C2991d;
import ho.C2993f;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import l4.C4369n;
import mm.AbstractC4801l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: or.l */
/* loaded from: classes3.dex */
public final class C5449l extends AbstractC5453p {

    /* renamed from: b */
    public final int f27439b;

    /* renamed from: c */
    public final Integer f27440c;

    /* renamed from: d */
    public final Integer f27441d;

    /* renamed from: e */
    public final String f27442e;

    /* renamed from: f */
    public final Double f27443f;

    /* renamed from: g */
    public final Double f27444g;

    /* renamed from: h */
    public final boolean f27445h;

    /* renamed from: i */
    public final String f27446i;

    /* renamed from: j */
    public final String f27447j;

    /* renamed from: k */
    public final boolean f27448k;

    /* renamed from: l */
    public final String f27449l;

    /* renamed from: m */
    public final String f27450m;

    /* renamed from: n */
    public final int f27451n;

    /* renamed from: o */
    public String f27452o;

    /* renamed from: p */
    public final boolean f27453p;

    /* renamed from: q */
    public final ArrayList f27454q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5449l(int i10, Integer num, Integer num2, String str, Double d2, Double d10, boolean z6, String str2, String str3, boolean z10, String modelId, String label, int i11, String str4, boolean z11) {
        super(str2);
        AbstractC4154l.m8923f(modelId, "modelId");
        AbstractC4154l.m8923f(label, "label");
        this.f27439b = i10;
        this.f27440c = num;
        this.f27441d = num2;
        this.f27442e = str;
        this.f27443f = d2;
        this.f27444g = d10;
        this.f27445h = z6;
        this.f27446i = str2;
        this.f27447j = str3;
        this.f27448k = z10;
        this.f27449l = modelId;
        this.f27450m = label;
        this.f27451n = i11;
        this.f27452o = str4;
        this.f27453p = z11;
        ArrayList arrayList = new ArrayList();
        this.f27454q = arrayList;
        if (z6) {
            arrayList.add(new C2991d(2));
            return;
        }
        if (z10) {
            arrayList.add(new C2991d(1));
        }
        arrayList.add(new C2991d(2));
        arrayList.add(new C2993f(d2 != null ? d2.doubleValue() : 0.0d, d10 != null ? d10.doubleValue() : Double.MAX_VALUE));
    }

    /* renamed from: k */
    public static C5449l m11173k(C5449l c5449l, String str, String str2, boolean z6, int i10) {
        int i11 = c5449l.f27439b;
        Integer num = c5449l.f27440c;
        Integer num2 = c5449l.f27441d;
        String str3 = c5449l.f27442e;
        Double d2 = c5449l.f27443f;
        Double d10 = c5449l.f27444g;
        boolean z10 = c5449l.f27445h;
        String fieldValue = (i10 & 128) != 0 ? c5449l.f27446i : str;
        String str4 = c5449l.f27447j;
        boolean z11 = c5449l.f27448k;
        String modelId = c5449l.f27449l;
        String label = c5449l.f27450m;
        int i12 = c5449l.f27451n;
        String str5 = (i10 & 8192) != 0 ? c5449l.f27452o : str2;
        boolean z12 = (i10 & 16384) != 0 ? c5449l.f27453p : z6;
        c5449l.getClass();
        AbstractC4154l.m8923f(fieldValue, "fieldValue");
        AbstractC4154l.m8923f(modelId, "modelId");
        AbstractC4154l.m8923f(label, "label");
        return new C5449l(i11, num, num2, str3, d2, d10, z10, fieldValue, str4, z11, modelId, label, i12, str5, z12);
    }

    @Override // or.AbstractC5453p
    /* renamed from: a */
    public final int mo11149a() {
        return this.f27451n;
    }

    @Override // or.AbstractC5453p
    /* renamed from: b */
    public final String mo11150b() {
        return this.f27452o;
    }

    @Override // or.AbstractC5453p
    /* renamed from: c */
    public final Object mo11151c() {
        return this.f27446i;
    }

    @Override // or.AbstractC5453p
    /* renamed from: d */
    public final String mo11152d() {
        return this.f27450m;
    }

    @Override // or.AbstractC5453p
    /* renamed from: e */
    public final String mo11153e() {
        return this.f27449l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5449l)) {
            return false;
        }
        C5449l c5449l = (C5449l) obj;
        return this.f27439b == c5449l.f27439b && AbstractC4154l.m8918a(this.f27440c, c5449l.f27440c) && AbstractC4154l.m8918a(this.f27441d, c5449l.f27441d) && AbstractC4154l.m8918a(this.f27442e, c5449l.f27442e) && AbstractC4154l.m8918a(this.f27443f, c5449l.f27443f) && AbstractC4154l.m8918a(this.f27444g, c5449l.f27444g) && this.f27445h == c5449l.f27445h && AbstractC4154l.m8918a(this.f27446i, c5449l.f27446i) && AbstractC4154l.m8918a(this.f27447j, c5449l.f27447j) && this.f27448k == c5449l.f27448k && AbstractC4154l.m8918a(this.f27449l, c5449l.f27449l) && AbstractC4154l.m8918a(this.f27450m, c5449l.f27450m) && this.f27451n == c5449l.f27451n && AbstractC4154l.m8918a(this.f27452o, c5449l.f27452o) && this.f27453p == c5449l.f27453p;
    }

    @Override // or.AbstractC5453p
    /* renamed from: f */
    public final List mo11154f() {
        return this.f27454q;
    }

    @Override // or.AbstractC5453p
    /* renamed from: g */
    public final boolean mo11155g() {
        return this.f27453p;
    }

    @Override // or.AbstractC5453p
    /* renamed from: h */
    public final AbstractC5453p mo11156h(boolean z6) {
        return m11173k(this, null, null, z6, 16383);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f27439b) * 31;
        Integer num = this.f27440c;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f27441d;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f27442e;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Double d2 = this.f27443f;
        int iHashCode5 = (iHashCode4 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d10 = this.f27444g;
        int iM113d = AbstractC0030c.m113d(AbstractC1452a.m4558e((iHashCode5 + (d10 == null ? 0 : d10.hashCode())) * 31, 31, this.f27445h), 31, this.f27446i);
        String str2 = this.f27447j;
        int iM4556c = AbstractC1452a.m4556c(this.f27451n, AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC1452a.m4558e((iM113d + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f27448k), 31, this.f27449l), 31, this.f27450m), 31);
        String str3 = this.f27452o;
        return Boolean.hashCode(this.f27453p) + ((iM4556c + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // or.AbstractC5453p
    /* renamed from: i */
    public final void mo11157i(String str) {
        this.f27452o = str;
    }

    @Override // or.AbstractC5453p
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final AbstractC5453p mo11158j(String newValue) {
        AbstractC4154l.m8923f(newValue, "newValue");
        return m11173k(this, newValue, null, false, 32639);
    }

    public final String toString() {
        String strM9148a = C4369n.m9148a(this.f27439b);
        String str = this.f27452o;
        StringBuilder sb2 = new StringBuilder("NumericField(keyboardType=");
        sb2.append(strM9148a);
        sb2.append(", maxLength=");
        sb2.append(this.f27440c);
        sb2.append(", minLength=");
        sb2.append(this.f27441d);
        sb2.append(", placeholder=");
        sb2.append(this.f27442e);
        sb2.append(", minValue=");
        sb2.append(this.f27443f);
        sb2.append(", maxValue=");
        sb2.append(this.f27444g);
        sb2.append(", isFilterField=");
        AbstractC4801l.m9751y(sb2, this.f27445h, ", fieldValue=", this.f27446i, ", helpText=");
        AbstractC4801l.m9749w(sb2, this.f27447j, ", isRequired=", this.f27448k, ", modelId=");
        a1.m14319B(sb2, this.f27449l, ", label=", this.f27450m, ", displayOrder=");
        AbstractC1452a.m4550A(sb2, this.f27451n, ", errorMessage=", str, ", isSelectedForFilter=");
        return AbstractC5601a.m11242m(sb2, this.f27453p, ")");
    }

    public /* synthetic */ C5449l(Integer num, Integer num2, String str, Double d2, Double d10, boolean z6, String str2, String str3, boolean z10, String str4, String str5, int i10, boolean z11, int i11) {
        this(9, (i11 & 2) != 0 ? null : num, (i11 & 4) != 0 ? null : num2, (i11 & 8) != 0 ? null : str, (i11 & 16) != 0 ? null : d2, (i11 & 32) != 0 ? null : d10, z6, str2, str3, z10, str4, str5, i10, null, (i11 & 16384) != 0 ? false : z11);
    }
}
