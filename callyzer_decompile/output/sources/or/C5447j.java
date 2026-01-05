package or;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import ho.C2991d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: or.j */
/* loaded from: classes3.dex */
public final class C5447j extends AbstractC5453p {

    /* renamed from: b */
    public final String f27424b;

    /* renamed from: c */
    public final boolean f27425c;

    /* renamed from: d */
    public final String f27426d;

    /* renamed from: e */
    public final String f27427e;

    /* renamed from: f */
    public final int f27428f;

    /* renamed from: g */
    public final List f27429g;

    /* renamed from: h */
    public String f27430h;

    /* renamed from: i */
    public final boolean f27431i;

    /* renamed from: j */
    public final ArrayList f27432j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5447j(int i10, String str, String modelId, String label, String str2, List list, boolean z6, boolean z10) {
        super(list);
        AbstractC4154l.m8923f(modelId, "modelId");
        AbstractC4154l.m8923f(label, "label");
        this.f27424b = str;
        this.f27425c = z6;
        this.f27426d = modelId;
        this.f27427e = label;
        this.f27428f = i10;
        this.f27429g = list;
        this.f27430h = str2;
        this.f27431i = z10;
        ArrayList arrayList = new ArrayList();
        this.f27432j = arrayList;
        if (z6) {
            arrayList.add(new C2991d(1));
        }
    }

    /* renamed from: k */
    public static C5447j m11170k(C5447j c5447j, List list, String str, boolean z6, int i10) {
        String str2 = c5447j.f27424b;
        boolean z10 = c5447j.f27425c;
        String modelId = c5447j.f27426d;
        String label = c5447j.f27427e;
        int i11 = c5447j.f27428f;
        if ((i10 & 32) != 0) {
            list = c5447j.f27429g;
        }
        List fieldValue = list;
        if ((i10 & 64) != 0) {
            str = c5447j.f27430h;
        }
        String str3 = str;
        if ((i10 & 128) != 0) {
            z6 = c5447j.f27431i;
        }
        c5447j.getClass();
        AbstractC4154l.m8923f(modelId, "modelId");
        AbstractC4154l.m8923f(label, "label");
        AbstractC4154l.m8923f(fieldValue, "fieldValue");
        return new C5447j(i11, str2, modelId, label, str3, fieldValue, z10, z6);
    }

    @Override // or.AbstractC5453p
    /* renamed from: a */
    public final int mo11149a() {
        return this.f27428f;
    }

    @Override // or.AbstractC5453p
    /* renamed from: b */
    public final String mo11150b() {
        return this.f27430h;
    }

    @Override // or.AbstractC5453p
    /* renamed from: c */
    public final Object mo11151c() {
        return this.f27429g;
    }

    @Override // or.AbstractC5453p
    /* renamed from: d */
    public final String mo11152d() {
        return this.f27427e;
    }

    @Override // or.AbstractC5453p
    /* renamed from: e */
    public final String mo11153e() {
        return this.f27426d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5447j)) {
            return false;
        }
        C5447j c5447j = (C5447j) obj;
        return AbstractC4154l.m8918a(this.f27424b, c5447j.f27424b) && this.f27425c == c5447j.f27425c && AbstractC4154l.m8918a(this.f27426d, c5447j.f27426d) && AbstractC4154l.m8918a(this.f27427e, c5447j.f27427e) && this.f27428f == c5447j.f27428f && AbstractC4154l.m8918a(this.f27429g, c5447j.f27429g) && AbstractC4154l.m8918a(this.f27430h, c5447j.f27430h) && this.f27431i == c5447j.f27431i;
    }

    @Override // or.AbstractC5453p
    /* renamed from: f */
    public final List mo11154f() {
        return this.f27432j;
    }

    @Override // or.AbstractC5453p
    /* renamed from: g */
    public final boolean mo11155g() {
        return this.f27431i;
    }

    @Override // or.AbstractC5453p
    /* renamed from: h */
    public final AbstractC5453p mo11156h(boolean z6) {
        return m11170k(this, null, null, z6, 127);
    }

    public final int hashCode() {
        String str = this.f27424b;
        int iM4559f = AbstractC1452a.m4559f(this.f27429g, AbstractC1452a.m4556c(this.f27428f, AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC1452a.m4558e((str == null ? 0 : str.hashCode()) * 31, 31, this.f27425c), 31, this.f27426d), 31, this.f27427e), 31), 31);
        String str2 = this.f27430h;
        return Boolean.hashCode(this.f27431i) + ((iM4559f + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // or.AbstractC5453p
    /* renamed from: i */
    public final void mo11157i(String str) {
        this.f27430h = str;
    }

    @Override // or.AbstractC5453p
    /* renamed from: j */
    public final AbstractC5453p mo11158j(Serializable serializable) {
        return m11170k(this, (List) serializable, null, false, 223);
    }

    public final String toString() {
        String str = this.f27430h;
        StringBuilder sb2 = new StringBuilder("MultiDropdownField(helpText=");
        sb2.append(this.f27424b);
        sb2.append(", isRequired=");
        sb2.append(this.f27425c);
        sb2.append(", modelId=");
        a1.m14319B(sb2, this.f27426d, ", label=", this.f27427e, ", displayOrder=");
        sb2.append(this.f27428f);
        sb2.append(", fieldValue=");
        sb2.append(this.f27429g);
        sb2.append(", errorMessage=");
        sb2.append(str);
        sb2.append(", isSelectedForFilter=");
        sb2.append(this.f27431i);
        sb2.append(")");
        return sb2.toString();
    }
}
