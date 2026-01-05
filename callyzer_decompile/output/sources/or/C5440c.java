package or;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import ho.C2991d;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: or.c */
/* loaded from: classes3.dex */
public final class C5440c extends AbstractC5453p {

    /* renamed from: b */
    public final boolean f27350b;

    /* renamed from: c */
    public final String f27351c;

    /* renamed from: d */
    public final List f27352d;

    /* renamed from: e */
    public final boolean f27353e;

    /* renamed from: f */
    public final String f27354f;

    /* renamed from: g */
    public final String f27355g;

    /* renamed from: h */
    public final int f27356h;

    /* renamed from: i */
    public String f27357i;

    /* renamed from: j */
    public final boolean f27358j;

    /* renamed from: k */
    public final ArrayList f27359k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5440c(boolean z6, String str, List list, boolean z10, String modelId, String label, int i10, String str2, boolean z11) {
        super(list);
        AbstractC4154l.m8923f(modelId, "modelId");
        AbstractC4154l.m8923f(label, "label");
        this.f27350b = z6;
        this.f27351c = str;
        this.f27352d = list;
        this.f27353e = z10;
        this.f27354f = modelId;
        this.f27355g = label;
        this.f27356h = i10;
        this.f27357i = str2;
        this.f27358j = z11;
        ArrayList arrayList = new ArrayList();
        this.f27359k = arrayList;
        if (!z10 || z6) {
            return;
        }
        arrayList.add(new C2991d(1));
    }

    /* renamed from: k */
    public static C5440c m11148k(C5440c c5440c, List list, String str, boolean z6, int i10) {
        boolean z10 = c5440c.f27350b;
        String str2 = c5440c.f27351c;
        if ((i10 & 4) != 0) {
            list = c5440c.f27352d;
        }
        List fieldValue = list;
        boolean z11 = c5440c.f27353e;
        String modelId = c5440c.f27354f;
        String label = c5440c.f27355g;
        int i11 = c5440c.f27356h;
        if ((i10 & 128) != 0) {
            str = c5440c.f27357i;
        }
        String str3 = str;
        if ((i10 & 256) != 0) {
            z6 = c5440c.f27358j;
        }
        c5440c.getClass();
        AbstractC4154l.m8923f(fieldValue, "fieldValue");
        AbstractC4154l.m8923f(modelId, "modelId");
        AbstractC4154l.m8923f(label, "label");
        return new C5440c(z10, str2, fieldValue, z11, modelId, label, i11, str3, z6);
    }

    @Override // or.AbstractC5453p
    /* renamed from: a */
    public final int mo11149a() {
        return this.f27356h;
    }

    @Override // or.AbstractC5453p
    /* renamed from: b */
    public final String mo11150b() {
        return this.f27357i;
    }

    @Override // or.AbstractC5453p
    /* renamed from: c */
    public final Object mo11151c() {
        return this.f27352d;
    }

    @Override // or.AbstractC5453p
    /* renamed from: d */
    public final String mo11152d() {
        return this.f27355g;
    }

    @Override // or.AbstractC5453p
    /* renamed from: e */
    public final String mo11153e() {
        return this.f27354f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5440c)) {
            return false;
        }
        C5440c c5440c = (C5440c) obj;
        return this.f27350b == c5440c.f27350b && AbstractC4154l.m8918a(this.f27351c, c5440c.f27351c) && AbstractC4154l.m8918a(this.f27352d, c5440c.f27352d) && this.f27353e == c5440c.f27353e && AbstractC4154l.m8918a(this.f27354f, c5440c.f27354f) && AbstractC4154l.m8918a(this.f27355g, c5440c.f27355g) && this.f27356h == c5440c.f27356h && AbstractC4154l.m8918a(this.f27357i, c5440c.f27357i) && this.f27358j == c5440c.f27358j;
    }

    @Override // or.AbstractC5453p
    /* renamed from: f */
    public final List mo11154f() {
        return this.f27359k;
    }

    @Override // or.AbstractC5453p
    /* renamed from: g */
    public final boolean mo11155g() {
        return this.f27358j;
    }

    @Override // or.AbstractC5453p
    /* renamed from: h */
    public final AbstractC5453p mo11156h(boolean z6) {
        return m11148k(this, null, null, z6, 255);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f27350b) * 31;
        String str = this.f27351c;
        int iM4556c = AbstractC1452a.m4556c(this.f27356h, AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC1452a.m4558e(AbstractC1452a.m4559f(this.f27352d, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.f27353e), 31, this.f27354f), 31, this.f27355g), 31);
        String str2 = this.f27357i;
        return Boolean.hashCode(this.f27358j) + ((iM4556c + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // or.AbstractC5453p
    /* renamed from: i */
    public final void mo11157i(String str) {
        this.f27357i = str;
    }

    @Override // or.AbstractC5453p
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final AbstractC5453p mo11158j(List newValue) {
        AbstractC4154l.m8923f(newValue, "newValue");
        return m11148k(this, newValue, null, false, 507);
    }

    public final String toString() {
        String str = this.f27357i;
        StringBuilder sb2 = new StringBuilder("CheckBoxField(isFilterField=");
        sb2.append(this.f27350b);
        sb2.append(", helpText=");
        sb2.append(this.f27351c);
        sb2.append(", fieldValue=");
        sb2.append(this.f27352d);
        sb2.append(", isRequired=");
        sb2.append(this.f27353e);
        sb2.append(", modelId=");
        a1.m14319B(sb2, this.f27354f, ", label=", this.f27355g, ", displayOrder=");
        AbstractC1452a.m4550A(sb2, this.f27356h, ", errorMessage=", str, ", isSelectedForFilter=");
        return AbstractC5601a.m11242m(sb2, this.f27358j, ")");
    }
}
