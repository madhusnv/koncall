package or;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: or.h */
/* loaded from: classes3.dex */
public final class C5445h extends AbstractC5453p {

    /* renamed from: b */
    public final List f27402b;

    /* renamed from: c */
    public final String f27403c;

    /* renamed from: d */
    public final String f27404d;

    /* renamed from: e */
    public String f27405e;

    /* renamed from: f */
    public final boolean f27406f;

    /* renamed from: g */
    public final ArrayList f27407g;

    public C5445h(List list, String str, String str2, String str3, boolean z6) {
        super(list);
        this.f27402b = list;
        this.f27403c = str;
        this.f27404d = str2;
        this.f27405e = str3;
        this.f27406f = z6;
        this.f27407g = new ArrayList();
    }

    /* renamed from: k */
    public static C5445h m11167k(C5445h c5445h, List list, boolean z6, int i10) {
        c5445h.getClass();
        c5445h.getClass();
        if ((i10 & 4) != 0) {
            list = c5445h.f27402b;
        }
        List fieldValue = list;
        c5445h.getClass();
        String str = c5445h.f27403c;
        String str2 = c5445h.f27404d;
        c5445h.getClass();
        String str3 = c5445h.f27405e;
        if ((i10 & 256) != 0) {
            z6 = c5445h.f27406f;
        }
        c5445h.getClass();
        AbstractC4154l.m8923f(fieldValue, "fieldValue");
        return new C5445h(fieldValue, str, str2, str3, z6);
    }

    @Override // or.AbstractC5453p
    /* renamed from: a */
    public final int mo11149a() {
        return 0;
    }

    @Override // or.AbstractC5453p
    /* renamed from: b */
    public final String mo11150b() {
        return this.f27405e;
    }

    @Override // or.AbstractC5453p
    /* renamed from: c */
    public final Object mo11151c() {
        return this.f27402b;
    }

    @Override // or.AbstractC5453p
    /* renamed from: d */
    public final String mo11152d() {
        return this.f27404d;
    }

    @Override // or.AbstractC5453p
    /* renamed from: e */
    public final String mo11153e() {
        return this.f27403c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5445h)) {
            return false;
        }
        C5445h c5445h = (C5445h) obj;
        return AbstractC4154l.m8918a(this.f27402b, c5445h.f27402b) && this.f27403c.equals(c5445h.f27403c) && this.f27404d.equals(c5445h.f27404d) && AbstractC4154l.m8918a(this.f27405e, c5445h.f27405e) && this.f27406f == c5445h.f27406f;
    }

    @Override // or.AbstractC5453p
    /* renamed from: f */
    public final List mo11154f() {
        return this.f27407g;
    }

    @Override // or.AbstractC5453p
    /* renamed from: g */
    public final boolean mo11155g() {
        return this.f27406f;
    }

    @Override // or.AbstractC5453p
    /* renamed from: h */
    public final AbstractC5453p mo11156h(boolean z6) {
        return m11167k(this, null, z6, 255);
    }

    public final int hashCode() {
        int iM4556c = AbstractC1452a.m4556c(0, AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC1452a.m4558e(AbstractC1452a.m4559f(this.f27402b, Boolean.hashCode(true) * 961, 31), 31, false), 31, this.f27403c), 31, this.f27404d), 31);
        String str = this.f27405e;
        return Boolean.hashCode(this.f27406f) + ((iM4556c + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // or.AbstractC5453p
    /* renamed from: i */
    public final void mo11157i(String str) {
        this.f27405e = str;
    }

    @Override // or.AbstractC5453p
    /* renamed from: j */
    public final AbstractC5453p mo11158j(Serializable serializable) {
        return m11167k(this, (List) serializable, false, 507);
    }

    public final String toString() {
        String str = this.f27405e;
        StringBuilder sb2 = new StringBuilder("FilterSorting(isFilterField=true, helpText=, fieldValue=");
        sb2.append(this.f27402b);
        sb2.append(", isRequired=false, modelId=");
        sb2.append(this.f27403c);
        sb2.append(", label=");
        a1.m14319B(sb2, this.f27404d, ", displayOrder=0, errorMessage=", str, ", isSelectedForFilter=");
        return AbstractC5601a.m11242m(sb2, this.f27406f, ")");
    }
}
