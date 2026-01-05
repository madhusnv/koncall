package or;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import ho.C2989b;
import ho.C2991d;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import l4.C4369n;
import mm.AbstractC4801l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: or.i */
/* loaded from: classes3.dex */
public final class C5446i extends AbstractC5453p {

    /* renamed from: b */
    public final int f27408b;

    /* renamed from: c */
    public final Integer f27409c;

    /* renamed from: d */
    public final Integer f27410d;

    /* renamed from: e */
    public final String f27411e;

    /* renamed from: f */
    public final Double f27412f;

    /* renamed from: g */
    public final Double f27413g;

    /* renamed from: h */
    public final boolean f27414h;

    /* renamed from: i */
    public final String f27415i;

    /* renamed from: j */
    public final String f27416j;

    /* renamed from: k */
    public final boolean f27417k;

    /* renamed from: l */
    public final String f27418l;

    /* renamed from: m */
    public final String f27419m;

    /* renamed from: n */
    public final int f27420n;

    /* renamed from: o */
    public String f27421o;

    /* renamed from: p */
    public final boolean f27422p;

    /* renamed from: q */
    public final ArrayList f27423q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5446i(int i10, Integer num, Integer num2, String str, Double d2, Double d10, boolean z6, String str2, String str3, boolean z10, String modelId, String label, int i11, String str4, boolean z11) {
        super(str2);
        AbstractC4154l.m8923f(modelId, "modelId");
        AbstractC4154l.m8923f(label, "label");
        this.f27408b = i10;
        this.f27409c = num;
        this.f27410d = num2;
        this.f27411e = str;
        this.f27412f = d2;
        this.f27413g = d10;
        this.f27414h = z6;
        this.f27415i = str2;
        this.f27416j = str3;
        this.f27417k = z10;
        this.f27418l = modelId;
        this.f27419m = label;
        this.f27420n = i11;
        this.f27421o = str4;
        this.f27422p = z11;
        ArrayList arrayList = new ArrayList();
        this.f27423q = arrayList;
        if (z6) {
            return;
        }
        if (z10) {
            arrayList.add(new C2991d(1));
        }
        arrayList.add(new C2989b(num2 != null ? num2.intValue() : 0, num != null ? num.intValue() : 500));
    }

    /* renamed from: k */
    public static C5446i m11168k(C5446i c5446i, String str, String str2, boolean z6, int i10) {
        int i11 = c5446i.f27408b;
        Integer num = c5446i.f27409c;
        Integer num2 = c5446i.f27410d;
        String str3 = c5446i.f27411e;
        Double d2 = c5446i.f27412f;
        Double d10 = c5446i.f27413g;
        boolean z10 = c5446i.f27414h;
        String fieldValue = (i10 & 128) != 0 ? c5446i.f27415i : str;
        String str4 = c5446i.f27416j;
        boolean z11 = c5446i.f27417k;
        String modelId = c5446i.f27418l;
        String label = c5446i.f27419m;
        int i12 = c5446i.f27420n;
        String str5 = (i10 & 8192) != 0 ? c5446i.f27421o : str2;
        boolean z12 = (i10 & 16384) != 0 ? c5446i.f27422p : z6;
        c5446i.getClass();
        AbstractC4154l.m8923f(fieldValue, "fieldValue");
        AbstractC4154l.m8923f(modelId, "modelId");
        AbstractC4154l.m8923f(label, "label");
        return new C5446i(i11, num, num2, str3, d2, d10, z10, fieldValue, str4, z11, modelId, label, i12, str5, z12);
    }

    @Override // or.AbstractC5453p
    /* renamed from: a */
    public final int mo11149a() {
        return this.f27420n;
    }

    @Override // or.AbstractC5453p
    /* renamed from: b */
    public final String mo11150b() {
        return this.f27421o;
    }

    @Override // or.AbstractC5453p
    /* renamed from: c */
    public final Object mo11151c() {
        return this.f27415i;
    }

    @Override // or.AbstractC5453p
    /* renamed from: d */
    public final String mo11152d() {
        return this.f27419m;
    }

    @Override // or.AbstractC5453p
    /* renamed from: e */
    public final String mo11153e() {
        return this.f27418l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5446i)) {
            return false;
        }
        C5446i c5446i = (C5446i) obj;
        return this.f27408b == c5446i.f27408b && AbstractC4154l.m8918a(this.f27409c, c5446i.f27409c) && AbstractC4154l.m8918a(this.f27410d, c5446i.f27410d) && AbstractC4154l.m8918a(this.f27411e, c5446i.f27411e) && AbstractC4154l.m8918a(this.f27412f, c5446i.f27412f) && AbstractC4154l.m8918a(this.f27413g, c5446i.f27413g) && this.f27414h == c5446i.f27414h && AbstractC4154l.m8918a(this.f27415i, c5446i.f27415i) && AbstractC4154l.m8918a(this.f27416j, c5446i.f27416j) && this.f27417k == c5446i.f27417k && AbstractC4154l.m8918a(this.f27418l, c5446i.f27418l) && AbstractC4154l.m8918a(this.f27419m, c5446i.f27419m) && this.f27420n == c5446i.f27420n && AbstractC4154l.m8918a(this.f27421o, c5446i.f27421o) && this.f27422p == c5446i.f27422p;
    }

    @Override // or.AbstractC5453p
    /* renamed from: f */
    public final List mo11154f() {
        return this.f27423q;
    }

    @Override // or.AbstractC5453p
    /* renamed from: g */
    public final boolean mo11155g() {
        return this.f27422p;
    }

    @Override // or.AbstractC5453p
    /* renamed from: h */
    public final AbstractC5453p mo11156h(boolean z6) {
        return m11168k(this, null, null, z6, 16383);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f27408b) * 31;
        Integer num = this.f27409c;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f27410d;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f27411e;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Double d2 = this.f27412f;
        int iHashCode5 = (iHashCode4 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d10 = this.f27413g;
        int iM113d = AbstractC0030c.m113d(AbstractC1452a.m4558e((iHashCode5 + (d10 == null ? 0 : d10.hashCode())) * 31, 31, this.f27414h), 31, this.f27415i);
        String str2 = this.f27416j;
        int iM4556c = AbstractC1452a.m4556c(this.f27420n, AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC1452a.m4558e((iM113d + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f27417k), 31, this.f27418l), 31, this.f27419m), 31);
        String str3 = this.f27421o;
        return Boolean.hashCode(this.f27422p) + ((iM4556c + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // or.AbstractC5453p
    /* renamed from: i */
    public final void mo11157i(String str) {
        this.f27421o = str;
    }

    @Override // or.AbstractC5453p
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final AbstractC5453p mo11158j(String newValue) {
        AbstractC4154l.m8923f(newValue, "newValue");
        return m11168k(this, newValue, null, false, 32639);
    }

    public final String toString() {
        String strM9148a = C4369n.m9148a(this.f27408b);
        String str = this.f27421o;
        StringBuilder sb2 = new StringBuilder("InputField(keyboardType=");
        sb2.append(strM9148a);
        sb2.append(", maxLength=");
        sb2.append(this.f27409c);
        sb2.append(", minLength=");
        sb2.append(this.f27410d);
        sb2.append(", placeholder=");
        sb2.append(this.f27411e);
        sb2.append(", minValue=");
        sb2.append(this.f27412f);
        sb2.append(", maxValue=");
        sb2.append(this.f27413g);
        sb2.append(", isFilterField=");
        AbstractC4801l.m9751y(sb2, this.f27414h, ", fieldValue=", this.f27415i, ", helpText=");
        AbstractC4801l.m9749w(sb2, this.f27416j, ", isRequired=", this.f27417k, ", modelId=");
        a1.m14319B(sb2, this.f27418l, ", label=", this.f27419m, ", displayOrder=");
        AbstractC1452a.m4550A(sb2, this.f27420n, ", errorMessage=", str, ", isSelectedForFilter=");
        return AbstractC5601a.m11242m(sb2, this.f27422p, ")");
    }

    public /* synthetic */ C5446i(Integer num, Integer num2, String str, Double d2, Double d10, boolean z6, String str2, String str3, boolean z10, String str4, String str5, int i10, String str6, boolean z11, int i11) {
        this(1, (i11 & 2) != 0 ? null : num, (i11 & 4) != 0 ? null : num2, (i11 & 8) != 0 ? null : str, (i11 & 16) != 0 ? null : d2, (i11 & 32) != 0 ? null : d10, z6, str2, str3, z10, str4, str5, i10, str6, (i11 & 16384) != 0 ? false : z11);
    }
}
