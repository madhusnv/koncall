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
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: or.o */
/* loaded from: classes3.dex */
public final class C5452o extends AbstractC5453p {

    /* renamed from: b */
    public final Integer f27478b;

    /* renamed from: c */
    public final Integer f27479c;

    /* renamed from: d */
    public final String f27480d;

    /* renamed from: e */
    public final String f27481e;

    /* renamed from: f */
    public final String f27482f;

    /* renamed from: g */
    public final boolean f27483g;

    /* renamed from: h */
    public final String f27484h;

    /* renamed from: i */
    public final String f27485i;

    /* renamed from: j */
    public final int f27486j;

    /* renamed from: k */
    public String f27487k;

    /* renamed from: l */
    public final boolean f27488l;

    /* renamed from: m */
    public final ArrayList f27489m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5452o(Integer num, Integer num2, String str, String str2, String str3, boolean z6, String modelId, String label, int i10, String str4, boolean z10) {
        super(str2);
        AbstractC4154l.m8923f(modelId, "modelId");
        AbstractC4154l.m8923f(label, "label");
        this.f27478b = num;
        this.f27479c = num2;
        this.f27480d = str;
        this.f27481e = str2;
        this.f27482f = str3;
        this.f27483g = z6;
        this.f27484h = modelId;
        this.f27485i = label;
        this.f27486j = i10;
        this.f27487k = str4;
        this.f27488l = z10;
        ArrayList arrayList = new ArrayList();
        this.f27489m = arrayList;
        if (z6) {
            arrayList.add(new C2991d(1));
        }
        arrayList.add(new C2989b(num2 != null ? num2.intValue() : 0, num != null ? num.intValue() : 500));
        arrayList.add(new C2991d(3));
    }

    /* renamed from: k */
    public static C5452o m11179k(C5452o c5452o, String str, String str2, boolean z6, int i10) {
        c5452o.getClass();
        Integer num = c5452o.f27478b;
        Integer num2 = c5452o.f27479c;
        String str3 = c5452o.f27480d;
        if ((i10 & 16) != 0) {
            str = c5452o.f27481e;
        }
        String fieldValue = str;
        String str4 = c5452o.f27482f;
        boolean z10 = c5452o.f27483g;
        String modelId = c5452o.f27484h;
        String label = c5452o.f27485i;
        int i11 = c5452o.f27486j;
        if ((i10 & 1024) != 0) {
            str2 = c5452o.f27487k;
        }
        String str5 = str2;
        boolean z11 = (i10 & NewHope.SENDB_BYTES) != 0 ? c5452o.f27488l : z6;
        c5452o.getClass();
        AbstractC4154l.m8923f(fieldValue, "fieldValue");
        AbstractC4154l.m8923f(modelId, "modelId");
        AbstractC4154l.m8923f(label, "label");
        return new C5452o(num, num2, str3, fieldValue, str4, z10, modelId, label, i11, str5, z11);
    }

    @Override // or.AbstractC5453p
    /* renamed from: a */
    public final int mo11149a() {
        return this.f27486j;
    }

    @Override // or.AbstractC5453p
    /* renamed from: b */
    public final String mo11150b() {
        return this.f27487k;
    }

    @Override // or.AbstractC5453p
    /* renamed from: c */
    public final Object mo11151c() {
        return this.f27481e;
    }

    @Override // or.AbstractC5453p
    /* renamed from: d */
    public final String mo11152d() {
        return this.f27485i;
    }

    @Override // or.AbstractC5453p
    /* renamed from: e */
    public final String mo11153e() {
        return this.f27484h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5452o)) {
            return false;
        }
        C5452o c5452o = (C5452o) obj;
        return AbstractC4154l.m8918a(this.f27478b, c5452o.f27478b) && AbstractC4154l.m8918a(this.f27479c, c5452o.f27479c) && AbstractC4154l.m8918a(this.f27480d, c5452o.f27480d) && AbstractC4154l.m8918a(this.f27481e, c5452o.f27481e) && AbstractC4154l.m8918a(this.f27482f, c5452o.f27482f) && this.f27483g == c5452o.f27483g && AbstractC4154l.m8918a(this.f27484h, c5452o.f27484h) && AbstractC4154l.m8918a(this.f27485i, c5452o.f27485i) && this.f27486j == c5452o.f27486j && AbstractC4154l.m8918a(this.f27487k, c5452o.f27487k) && this.f27488l == c5452o.f27488l;
    }

    @Override // or.AbstractC5453p
    /* renamed from: f */
    public final List mo11154f() {
        return this.f27489m;
    }

    @Override // or.AbstractC5453p
    /* renamed from: g */
    public final boolean mo11155g() {
        return this.f27488l;
    }

    @Override // or.AbstractC5453p
    /* renamed from: h */
    public final AbstractC5453p mo11156h(boolean z6) {
        return m11179k(this, null, null, z6, 2047);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(5) * 31;
        Integer num = this.f27478b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f27479c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f27480d;
        int iM113d = AbstractC0030c.m113d((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f27481e);
        String str2 = this.f27482f;
        int iM4556c = AbstractC1452a.m4556c(this.f27486j, AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC1452a.m4558e((iM113d + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f27483g), 31, this.f27484h), 31, this.f27485i), 31);
        String str3 = this.f27487k;
        return Boolean.hashCode(this.f27488l) + ((iM4556c + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // or.AbstractC5453p
    /* renamed from: i */
    public final void mo11157i(String str) {
        this.f27487k = str;
    }

    @Override // or.AbstractC5453p
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final AbstractC5453p mo11158j(String newValue) {
        AbstractC4154l.m8923f(newValue, "newValue");
        return m11179k(this, newValue, null, false, 4079);
    }

    public final String toString() {
        String strM9148a = C4369n.m9148a(5);
        String str = this.f27487k;
        StringBuilder sb2 = new StringBuilder("WebsiteField(keyboardType=");
        sb2.append(strM9148a);
        sb2.append(", maxLength=");
        sb2.append(this.f27478b);
        sb2.append(", minLength=");
        sb2.append(this.f27479c);
        sb2.append(", placeholder=");
        sb2.append(this.f27480d);
        sb2.append(", fieldValue=");
        a1.m14319B(sb2, this.f27481e, ", helpText=", this.f27482f, ", isRequired=");
        AbstractC4801l.m9751y(sb2, this.f27483g, ", modelId=", this.f27484h, ", label=");
        AbstractC1452a.m4551B(sb2, this.f27485i, ", displayOrder=", this.f27486j, ", errorMessage=");
        sb2.append(str);
        sb2.append(", isSelectedForFilter=");
        sb2.append(this.f27488l);
        sb2.append(")");
        return sb2.toString();
    }
}
