package or;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import ho.C2991d;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: or.m */
/* loaded from: classes3.dex */
public final class C5450m extends AbstractC5453p {

    /* renamed from: b */
    public final String f27455b;

    /* renamed from: c */
    public final boolean f27456c;

    /* renamed from: d */
    public final List f27457d;

    /* renamed from: e */
    public final String f27458e;

    /* renamed from: f */
    public final String f27459f;

    /* renamed from: g */
    public final int f27460g;

    /* renamed from: h */
    public String f27461h;

    /* renamed from: i */
    public final boolean f27462i;

    /* renamed from: j */
    public final ArrayList f27463j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5450m(int i10, String str, String modelId, String label, String str2, List list, boolean z6, boolean z10) {
        super(list);
        AbstractC4154l.m8923f(modelId, "modelId");
        AbstractC4154l.m8923f(label, "label");
        this.f27455b = str;
        this.f27456c = z6;
        this.f27457d = list;
        this.f27458e = modelId;
        this.f27459f = label;
        this.f27460g = i10;
        this.f27461h = str2;
        this.f27462i = z10;
        ArrayList arrayList = new ArrayList();
        this.f27463j = arrayList;
        if (z6) {
            arrayList.add(new C2991d(1));
        }
    }

    /* renamed from: k */
    public static C5450m m11175k(C5450m c5450m, List list, String str, boolean z6, int i10) {
        String str2 = c5450m.f27455b;
        boolean z10 = c5450m.f27456c;
        if ((i10 & 4) != 0) {
            list = c5450m.f27457d;
        }
        List fieldValue = list;
        String modelId = c5450m.f27458e;
        String label = c5450m.f27459f;
        int i11 = c5450m.f27460g;
        if ((i10 & 64) != 0) {
            str = c5450m.f27461h;
        }
        String str3 = str;
        if ((i10 & 128) != 0) {
            z6 = c5450m.f27462i;
        }
        c5450m.getClass();
        AbstractC4154l.m8923f(fieldValue, "fieldValue");
        AbstractC4154l.m8923f(modelId, "modelId");
        AbstractC4154l.m8923f(label, "label");
        return new C5450m(i11, str2, modelId, label, str3, fieldValue, z10, z6);
    }

    @Override // or.AbstractC5453p
    /* renamed from: a */
    public final int mo11149a() {
        return this.f27460g;
    }

    @Override // or.AbstractC5453p
    /* renamed from: b */
    public final String mo11150b() {
        return this.f27461h;
    }

    @Override // or.AbstractC5453p
    /* renamed from: c */
    public final Object mo11151c() {
        return this.f27457d;
    }

    @Override // or.AbstractC5453p
    /* renamed from: d */
    public final String mo11152d() {
        return this.f27459f;
    }

    @Override // or.AbstractC5453p
    /* renamed from: e */
    public final String mo11153e() {
        return this.f27458e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5450m)) {
            return false;
        }
        C5450m c5450m = (C5450m) obj;
        return AbstractC4154l.m8918a(this.f27455b, c5450m.f27455b) && this.f27456c == c5450m.f27456c && AbstractC4154l.m8918a(this.f27457d, c5450m.f27457d) && AbstractC4154l.m8918a(this.f27458e, c5450m.f27458e) && AbstractC4154l.m8918a(this.f27459f, c5450m.f27459f) && this.f27460g == c5450m.f27460g && AbstractC4154l.m8918a(this.f27461h, c5450m.f27461h) && this.f27462i == c5450m.f27462i;
    }

    @Override // or.AbstractC5453p
    /* renamed from: f */
    public final List mo11154f() {
        return this.f27463j;
    }

    @Override // or.AbstractC5453p
    /* renamed from: g */
    public final boolean mo11155g() {
        return this.f27462i;
    }

    @Override // or.AbstractC5453p
    /* renamed from: h */
    public final AbstractC5453p mo11156h(boolean z6) {
        return m11175k(this, null, null, z6, 127);
    }

    public final int hashCode() {
        String str = this.f27455b;
        int iM4556c = AbstractC1452a.m4556c(this.f27460g, AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC1452a.m4559f(this.f27457d, AbstractC1452a.m4558e((str == null ? 0 : str.hashCode()) * 31, 31, this.f27456c), 31), 31, this.f27458e), 31, this.f27459f), 31);
        String str2 = this.f27461h;
        return Boolean.hashCode(this.f27462i) + ((iM4556c + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // or.AbstractC5453p
    /* renamed from: i */
    public final void mo11157i(String str) {
        this.f27461h = str;
    }

    @Override // or.AbstractC5453p
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final AbstractC5453p mo11158j(List newValue) {
        AbstractC4154l.m8923f(newValue, "newValue");
        return m11175k(this, newValue, null, false, 251);
    }

    public final String toString() {
        String str = this.f27461h;
        StringBuilder sb2 = new StringBuilder("RadioButtonField(helpText=");
        sb2.append(this.f27455b);
        sb2.append(", isRequired=");
        sb2.append(this.f27456c);
        sb2.append(", fieldValue=");
        sb2.append(this.f27457d);
        sb2.append(", modelId=");
        sb2.append(this.f27458e);
        sb2.append(", label=");
        AbstractC1452a.m4551B(sb2, this.f27459f, ", displayOrder=", this.f27460g, ", errorMessage=");
        sb2.append(str);
        sb2.append(", isSelectedForFilter=");
        sb2.append(this.f27462i);
        sb2.append(")");
        return sb2.toString();
    }
}
