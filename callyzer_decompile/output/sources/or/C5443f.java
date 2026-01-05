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
/* renamed from: or.f */
/* loaded from: classes3.dex */
public final class C5443f extends AbstractC5453p {

    /* renamed from: b */
    public final String f27381b;

    /* renamed from: c */
    public final boolean f27382c;

    /* renamed from: d */
    public final String f27383d;

    /* renamed from: e */
    public final String f27384e;

    /* renamed from: f */
    public final int f27385f;

    /* renamed from: g */
    public final List f27386g;

    /* renamed from: h */
    public String f27387h;

    /* renamed from: i */
    public final boolean f27388i;

    /* renamed from: j */
    public final ArrayList f27389j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5443f(int i10, String str, String modelId, String label, String str2, List list, boolean z6, boolean z10) {
        super(list);
        AbstractC4154l.m8923f(modelId, "modelId");
        AbstractC4154l.m8923f(label, "label");
        this.f27381b = str;
        this.f27382c = z6;
        this.f27383d = modelId;
        this.f27384e = label;
        this.f27385f = i10;
        this.f27386g = list;
        this.f27387h = str2;
        this.f27388i = z10;
        ArrayList arrayList = new ArrayList();
        this.f27389j = arrayList;
        if (z6) {
            arrayList.add(new C2991d(1));
        }
    }

    /* renamed from: k */
    public static C5443f m11164k(C5443f c5443f, List list, String str, boolean z6, int i10) {
        String str2 = c5443f.f27381b;
        boolean z10 = c5443f.f27382c;
        String modelId = c5443f.f27383d;
        String label = c5443f.f27384e;
        int i11 = c5443f.f27385f;
        if ((i10 & 32) != 0) {
            list = c5443f.f27386g;
        }
        List fieldValue = list;
        if ((i10 & 64) != 0) {
            str = c5443f.f27387h;
        }
        String str3 = str;
        if ((i10 & 128) != 0) {
            z6 = c5443f.f27388i;
        }
        c5443f.getClass();
        AbstractC4154l.m8923f(modelId, "modelId");
        AbstractC4154l.m8923f(label, "label");
        AbstractC4154l.m8923f(fieldValue, "fieldValue");
        return new C5443f(i11, str2, modelId, label, str3, fieldValue, z10, z6);
    }

    @Override // or.AbstractC5453p
    /* renamed from: a */
    public final int mo11149a() {
        return this.f27385f;
    }

    @Override // or.AbstractC5453p
    /* renamed from: b */
    public final String mo11150b() {
        return this.f27387h;
    }

    @Override // or.AbstractC5453p
    /* renamed from: c */
    public final Object mo11151c() {
        return this.f27386g;
    }

    @Override // or.AbstractC5453p
    /* renamed from: d */
    public final String mo11152d() {
        return this.f27384e;
    }

    @Override // or.AbstractC5453p
    /* renamed from: e */
    public final String mo11153e() {
        return this.f27383d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5443f)) {
            return false;
        }
        C5443f c5443f = (C5443f) obj;
        return AbstractC4154l.m8918a(this.f27381b, c5443f.f27381b) && this.f27382c == c5443f.f27382c && AbstractC4154l.m8918a(this.f27383d, c5443f.f27383d) && AbstractC4154l.m8918a(this.f27384e, c5443f.f27384e) && this.f27385f == c5443f.f27385f && AbstractC4154l.m8918a(this.f27386g, c5443f.f27386g) && AbstractC4154l.m8918a(this.f27387h, c5443f.f27387h) && this.f27388i == c5443f.f27388i;
    }

    @Override // or.AbstractC5453p
    /* renamed from: f */
    public final List mo11154f() {
        return this.f27389j;
    }

    @Override // or.AbstractC5453p
    /* renamed from: g */
    public final boolean mo11155g() {
        return this.f27388i;
    }

    @Override // or.AbstractC5453p
    /* renamed from: h */
    public final AbstractC5453p mo11156h(boolean z6) {
        return m11164k(this, null, null, z6, 127);
    }

    public final int hashCode() {
        String str = this.f27381b;
        int iM4559f = AbstractC1452a.m4559f(this.f27386g, AbstractC1452a.m4556c(this.f27385f, AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC1452a.m4558e((str == null ? 0 : str.hashCode()) * 31, 31, this.f27382c), 31, this.f27383d), 31, this.f27384e), 31), 31);
        String str2 = this.f27387h;
        return Boolean.hashCode(this.f27388i) + ((iM4559f + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // or.AbstractC5453p
    /* renamed from: i */
    public final void mo11157i(String str) {
        this.f27387h = str;
    }

    @Override // or.AbstractC5453p
    /* renamed from: j */
    public final AbstractC5453p mo11158j(Serializable serializable) {
        return m11164k(this, (List) serializable, null, false, 223);
    }

    public final String toString() {
        String str = this.f27387h;
        StringBuilder sb2 = new StringBuilder("DropdownField(helpText=");
        sb2.append(this.f27381b);
        sb2.append(", isRequired=");
        sb2.append(this.f27382c);
        sb2.append(", modelId=");
        a1.m14319B(sb2, this.f27383d, ", label=", this.f27384e, ", displayOrder=");
        sb2.append(this.f27385f);
        sb2.append(", fieldValue=");
        sb2.append(this.f27386g);
        sb2.append(", errorMessage=");
        sb2.append(str);
        sb2.append(", isSelectedForFilter=");
        sb2.append(this.f27388i);
        sb2.append(")");
        return sb2.toString();
    }
}
