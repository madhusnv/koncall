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
/* renamed from: or.g */
/* loaded from: classes3.dex */
public final class C5444g extends AbstractC5453p {

    /* renamed from: b */
    public final Integer f27390b;

    /* renamed from: c */
    public final Integer f27391c;

    /* renamed from: d */
    public final String f27392d;

    /* renamed from: e */
    public final String f27393e;

    /* renamed from: f */
    public final String f27394f;

    /* renamed from: g */
    public final boolean f27395g;

    /* renamed from: h */
    public final String f27396h;

    /* renamed from: i */
    public final String f27397i;

    /* renamed from: j */
    public final int f27398j;

    /* renamed from: k */
    public String f27399k;

    /* renamed from: l */
    public final boolean f27400l;

    /* renamed from: m */
    public final ArrayList f27401m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5444g(Integer num, Integer num2, String str, String str2, String str3, boolean z6, String modelId, String label, int i10, String str4, boolean z10) {
        super(str2);
        AbstractC4154l.m8923f(modelId, "modelId");
        AbstractC4154l.m8923f(label, "label");
        this.f27390b = num;
        this.f27391c = num2;
        this.f27392d = str;
        this.f27393e = str2;
        this.f27394f = str3;
        this.f27395g = z6;
        this.f27396h = modelId;
        this.f27397i = label;
        this.f27398j = i10;
        this.f27399k = str4;
        this.f27400l = z10;
        ArrayList arrayList = new ArrayList();
        this.f27401m = arrayList;
        if (z6) {
            arrayList.add(new C2991d(1));
        }
        arrayList.add(new C2989b(num2 != null ? num2.intValue() : 0, num != null ? num.intValue() : 500));
        arrayList.add(new C2991d(0));
    }

    /* renamed from: k */
    public static C5444g m11165k(C5444g c5444g, String str, String str2, boolean z6, int i10) {
        c5444g.getClass();
        Integer num = c5444g.f27390b;
        Integer num2 = c5444g.f27391c;
        String str3 = c5444g.f27392d;
        if ((i10 & 16) != 0) {
            str = c5444g.f27393e;
        }
        String fieldValue = str;
        String str4 = c5444g.f27394f;
        boolean z10 = c5444g.f27395g;
        String modelId = c5444g.f27396h;
        String label = c5444g.f27397i;
        int i11 = c5444g.f27398j;
        if ((i10 & 1024) != 0) {
            str2 = c5444g.f27399k;
        }
        String str5 = str2;
        boolean z11 = (i10 & NewHope.SENDB_BYTES) != 0 ? c5444g.f27400l : z6;
        c5444g.getClass();
        AbstractC4154l.m8923f(fieldValue, "fieldValue");
        AbstractC4154l.m8923f(modelId, "modelId");
        AbstractC4154l.m8923f(label, "label");
        return new C5444g(num, num2, str3, fieldValue, str4, z10, modelId, label, i11, str5, z11);
    }

    @Override // or.AbstractC5453p
    /* renamed from: a */
    public final int mo11149a() {
        return this.f27398j;
    }

    @Override // or.AbstractC5453p
    /* renamed from: b */
    public final String mo11150b() {
        return this.f27399k;
    }

    @Override // or.AbstractC5453p
    /* renamed from: c */
    public final Object mo11151c() {
        return this.f27393e;
    }

    @Override // or.AbstractC5453p
    /* renamed from: d */
    public final String mo11152d() {
        return this.f27397i;
    }

    @Override // or.AbstractC5453p
    /* renamed from: e */
    public final String mo11153e() {
        return this.f27396h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5444g)) {
            return false;
        }
        C5444g c5444g = (C5444g) obj;
        return AbstractC4154l.m8918a(this.f27390b, c5444g.f27390b) && AbstractC4154l.m8918a(this.f27391c, c5444g.f27391c) && AbstractC4154l.m8918a(this.f27392d, c5444g.f27392d) && AbstractC4154l.m8918a(this.f27393e, c5444g.f27393e) && AbstractC4154l.m8918a(this.f27394f, c5444g.f27394f) && this.f27395g == c5444g.f27395g && AbstractC4154l.m8918a(this.f27396h, c5444g.f27396h) && AbstractC4154l.m8918a(this.f27397i, c5444g.f27397i) && this.f27398j == c5444g.f27398j && AbstractC4154l.m8918a(this.f27399k, c5444g.f27399k) && this.f27400l == c5444g.f27400l;
    }

    @Override // or.AbstractC5453p
    /* renamed from: f */
    public final List mo11154f() {
        return this.f27401m;
    }

    @Override // or.AbstractC5453p
    /* renamed from: g */
    public final boolean mo11155g() {
        return this.f27400l;
    }

    @Override // or.AbstractC5453p
    /* renamed from: h */
    public final AbstractC5453p mo11156h(boolean z6) {
        return m11165k(this, null, null, z6, 2047);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(6) * 31;
        Integer num = this.f27390b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f27391c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f27392d;
        int iM113d = AbstractC0030c.m113d((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f27393e);
        String str2 = this.f27394f;
        int iM4556c = AbstractC1452a.m4556c(this.f27398j, AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC1452a.m4558e((iM113d + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f27395g), 31, this.f27396h), 31, this.f27397i), 31);
        String str3 = this.f27399k;
        return Boolean.hashCode(this.f27400l) + ((iM4556c + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // or.AbstractC5453p
    /* renamed from: i */
    public final void mo11157i(String str) {
        this.f27399k = str;
    }

    @Override // or.AbstractC5453p
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final AbstractC5453p mo11158j(String newValue) {
        AbstractC4154l.m8923f(newValue, "newValue");
        return m11165k(this, newValue, null, false, 4079);
    }

    public final String toString() {
        String strM9148a = C4369n.m9148a(6);
        String str = this.f27399k;
        StringBuilder sb2 = new StringBuilder("EmailField(keyboardType=");
        sb2.append(strM9148a);
        sb2.append(", maxLength=");
        sb2.append(this.f27390b);
        sb2.append(", minLength=");
        sb2.append(this.f27391c);
        sb2.append(", placeholder=");
        sb2.append(this.f27392d);
        sb2.append(", fieldValue=");
        a1.m14319B(sb2, this.f27393e, ", helpText=", this.f27394f, ", isRequired=");
        AbstractC4801l.m9751y(sb2, this.f27395g, ", modelId=", this.f27396h, ", label=");
        AbstractC1452a.m4551B(sb2, this.f27397i, ", displayOrder=", this.f27398j, ", errorMessage=");
        sb2.append(str);
        sb2.append(", isSelectedForFilter=");
        sb2.append(this.f27400l);
        sb2.append(")");
        return sb2.toString();
    }
}
