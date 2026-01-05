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
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: or.n */
/* loaded from: classes3.dex */
public final class C5451n extends AbstractC5453p {

    /* renamed from: b */
    public final Integer f27464b;

    /* renamed from: c */
    public final Integer f27465c;

    /* renamed from: d */
    public final String f27466d;

    /* renamed from: e */
    public final Double f27467e;

    /* renamed from: f */
    public final Double f27468f;

    /* renamed from: g */
    public final String f27469g;

    /* renamed from: h */
    public final String f27470h;

    /* renamed from: i */
    public final boolean f27471i;

    /* renamed from: j */
    public final String f27472j;

    /* renamed from: k */
    public final String f27473k;

    /* renamed from: l */
    public final int f27474l;

    /* renamed from: m */
    public String f27475m;

    /* renamed from: n */
    public final boolean f27476n;

    /* renamed from: o */
    public final ArrayList f27477o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5451n(Integer num, Integer num2, String str, Double d2, Double d10, String str2, String str3, boolean z6, String modelId, String label, int i10, String str4, boolean z10) {
        super(str2);
        AbstractC4154l.m8923f(modelId, "modelId");
        AbstractC4154l.m8923f(label, "label");
        this.f27464b = num;
        this.f27465c = num2;
        this.f27466d = str;
        this.f27467e = d2;
        this.f27468f = d10;
        this.f27469g = str2;
        this.f27470h = str3;
        this.f27471i = z6;
        this.f27472j = modelId;
        this.f27473k = label;
        this.f27474l = i10;
        this.f27475m = str4;
        this.f27476n = z10;
        ArrayList arrayList = new ArrayList();
        this.f27477o = arrayList;
        if (z6) {
            arrayList.add(new C2991d(1));
        }
        arrayList.add(new C2989b(num2 != null ? num2.intValue() : 0, num != null ? num.intValue() : 500));
    }

    /* renamed from: k */
    public static C5451n m11177k(C5451n c5451n, String str, String str2, boolean z6, int i10) {
        c5451n.getClass();
        Integer num = c5451n.f27464b;
        Integer num2 = c5451n.f27465c;
        String str3 = c5451n.f27466d;
        Double d2 = c5451n.f27467e;
        Double d10 = c5451n.f27468f;
        String fieldValue = (i10 & 64) != 0 ? c5451n.f27469g : str;
        String str4 = c5451n.f27470h;
        boolean z10 = c5451n.f27471i;
        String modelId = c5451n.f27472j;
        String label = c5451n.f27473k;
        int i11 = c5451n.f27474l;
        String str5 = (i10 & 4096) != 0 ? c5451n.f27475m : str2;
        boolean z11 = (i10 & 8192) != 0 ? c5451n.f27476n : z6;
        c5451n.getClass();
        AbstractC4154l.m8923f(fieldValue, "fieldValue");
        AbstractC4154l.m8923f(modelId, "modelId");
        AbstractC4154l.m8923f(label, "label");
        return new C5451n(num, num2, str3, d2, d10, fieldValue, str4, z10, modelId, label, i11, str5, z11);
    }

    @Override // or.AbstractC5453p
    /* renamed from: a */
    public final int mo11149a() {
        return this.f27474l;
    }

    @Override // or.AbstractC5453p
    /* renamed from: b */
    public final String mo11150b() {
        return this.f27475m;
    }

    @Override // or.AbstractC5453p
    /* renamed from: c */
    public final Object mo11151c() {
        return this.f27469g;
    }

    @Override // or.AbstractC5453p
    /* renamed from: d */
    public final String mo11152d() {
        return this.f27473k;
    }

    @Override // or.AbstractC5453p
    /* renamed from: e */
    public final String mo11153e() {
        return this.f27472j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5451n)) {
            return false;
        }
        C5451n c5451n = (C5451n) obj;
        return AbstractC4154l.m8918a(this.f27464b, c5451n.f27464b) && AbstractC4154l.m8918a(this.f27465c, c5451n.f27465c) && AbstractC4154l.m8918a(this.f27466d, c5451n.f27466d) && AbstractC4154l.m8918a(this.f27467e, c5451n.f27467e) && AbstractC4154l.m8918a(this.f27468f, c5451n.f27468f) && AbstractC4154l.m8918a(this.f27469g, c5451n.f27469g) && AbstractC4154l.m8918a(this.f27470h, c5451n.f27470h) && this.f27471i == c5451n.f27471i && AbstractC4154l.m8918a(this.f27472j, c5451n.f27472j) && AbstractC4154l.m8918a(this.f27473k, c5451n.f27473k) && this.f27474l == c5451n.f27474l && AbstractC4154l.m8918a(this.f27475m, c5451n.f27475m) && this.f27476n == c5451n.f27476n;
    }

    @Override // or.AbstractC5453p
    /* renamed from: f */
    public final List mo11154f() {
        return this.f27477o;
    }

    @Override // or.AbstractC5453p
    /* renamed from: g */
    public final boolean mo11155g() {
        return this.f27476n;
    }

    @Override // or.AbstractC5453p
    /* renamed from: h */
    public final AbstractC5453p mo11156h(boolean z6) {
        return m11177k(this, null, null, z6, 8191);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(1) * 31;
        Integer num = this.f27464b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f27465c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f27466d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Double d2 = this.f27467e;
        int iHashCode5 = (iHashCode4 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d10 = this.f27468f;
        int iM113d = AbstractC0030c.m113d((iHashCode5 + (d10 == null ? 0 : d10.hashCode())) * 31, 31, this.f27469g);
        String str2 = this.f27470h;
        int iM4556c = AbstractC1452a.m4556c(this.f27474l, AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC1452a.m4558e((iM113d + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f27471i), 31, this.f27472j), 31, this.f27473k), 31);
        String str3 = this.f27475m;
        return Boolean.hashCode(this.f27476n) + ((iM4556c + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // or.AbstractC5453p
    /* renamed from: i */
    public final void mo11157i(String str) {
        this.f27475m = str;
    }

    @Override // or.AbstractC5453p
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final AbstractC5453p mo11158j(String newValue) {
        AbstractC4154l.m8923f(newValue, "newValue");
        return m11177k(this, newValue, null, false, 16319);
    }

    public final String toString() {
        String strM9148a = C4369n.m9148a(1);
        String str = this.f27475m;
        StringBuilder sb2 = new StringBuilder("TextAreaField(keyboardType=");
        sb2.append(strM9148a);
        sb2.append(", maxLength=");
        sb2.append(this.f27464b);
        sb2.append(", minLength=");
        sb2.append(this.f27465c);
        sb2.append(", placeholder=");
        sb2.append(this.f27466d);
        sb2.append(", minValue=");
        sb2.append(this.f27467e);
        sb2.append(", maxValue=");
        sb2.append(this.f27468f);
        sb2.append(", fieldValue=");
        a1.m14319B(sb2, this.f27469g, ", helpText=", this.f27470h, ", isRequired=");
        AbstractC4801l.m9751y(sb2, this.f27471i, ", modelId=", this.f27472j, ", label=");
        AbstractC1452a.m4551B(sb2, this.f27473k, ", displayOrder=", this.f27474l, ", errorMessage=");
        sb2.append(str);
        sb2.append(", isSelectedForFilter=");
        sb2.append(this.f27476n);
        sb2.append(")");
        return sb2.toString();
    }
}
