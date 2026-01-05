package or;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import p020v.a1;
import qw.C6361k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: or.k */
/* loaded from: classes3.dex */
public final class C5448k extends AbstractC5453p {

    /* renamed from: b */
    public final C6361k f27433b;

    /* renamed from: c */
    public final String f27434c;

    /* renamed from: d */
    public final String f27435d;

    /* renamed from: e */
    public String f27436e;

    /* renamed from: f */
    public final boolean f27437f;

    /* renamed from: g */
    public final ArrayList f27438g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5448k(C6361k fieldValue, String str, String label, String str2, boolean z6) {
        super(fieldValue);
        AbstractC4154l.m8923f(fieldValue, "fieldValue");
        AbstractC4154l.m8923f(label, "label");
        this.f27433b = fieldValue;
        this.f27434c = str;
        this.f27435d = label;
        this.f27436e = str2;
        this.f27437f = z6;
        this.f27438g = new ArrayList();
    }

    /* renamed from: k */
    public static C5448k m11171k(C5448k c5448k, C6361k c6361k, boolean z6, int i10) {
        if ((i10 & 4) != 0) {
            c6361k = c5448k.f27433b;
        }
        C6361k fieldValue = c6361k;
        String str = c5448k.f27434c;
        String label = c5448k.f27435d;
        String str2 = c5448k.f27436e;
        if ((i10 & 256) != 0) {
            z6 = c5448k.f27437f;
        }
        AbstractC4154l.m8923f(fieldValue, "fieldValue");
        AbstractC4154l.m8923f(label, "label");
        return new C5448k(fieldValue, str, label, str2, z6);
    }

    @Override // or.AbstractC5453p
    /* renamed from: a */
    public final int mo11149a() {
        return 0;
    }

    @Override // or.AbstractC5453p
    /* renamed from: b */
    public final String mo11150b() {
        return this.f27436e;
    }

    @Override // or.AbstractC5453p
    /* renamed from: c */
    public final Object mo11151c() {
        return this.f27433b;
    }

    @Override // or.AbstractC5453p
    /* renamed from: d */
    public final String mo11152d() {
        return this.f27435d;
    }

    @Override // or.AbstractC5453p
    /* renamed from: e */
    public final String mo11153e() {
        return this.f27434c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5448k)) {
            return false;
        }
        C5448k c5448k = (C5448k) obj;
        return AbstractC4154l.m8918a(this.f27433b, c5448k.f27433b) && this.f27434c.equals(c5448k.f27434c) && AbstractC4154l.m8918a(this.f27435d, c5448k.f27435d) && AbstractC4154l.m8918a(this.f27436e, c5448k.f27436e) && this.f27437f == c5448k.f27437f;
    }

    @Override // or.AbstractC5453p
    /* renamed from: f */
    public final List mo11154f() {
        return this.f27438g;
    }

    @Override // or.AbstractC5453p
    /* renamed from: g */
    public final boolean mo11155g() {
        return this.f27437f;
    }

    @Override // or.AbstractC5453p
    /* renamed from: h */
    public final AbstractC5453p mo11156h(boolean z6) {
        return m11171k(this, null, z6, 255);
    }

    public final int hashCode() {
        int iM4556c = AbstractC1452a.m4556c(0, AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC1452a.m4558e((this.f27433b.hashCode() + (Boolean.hashCode(true) * 961)) * 31, 31, false), 31, this.f27434c), 31, this.f27435d), 31);
        String str = this.f27436e;
        return Boolean.hashCode(this.f27437f) + ((iM4556c + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // or.AbstractC5453p
    /* renamed from: i */
    public final void mo11157i(String str) {
        this.f27436e = str;
    }

    @Override // or.AbstractC5453p
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final AbstractC5453p mo11158j(C6361k newValue) {
        AbstractC4154l.m8923f(newValue, "newValue");
        return m11171k(this, newValue, false, 507);
    }

    public final String toString() {
        String str = this.f27436e;
        StringBuilder sb2 = new StringBuilder("NotContactedFilter(isFilterField=true, helpText=null, fieldValue=");
        sb2.append(this.f27433b);
        sb2.append(", isRequired=false, modelId=");
        sb2.append(this.f27434c);
        sb2.append(", label=");
        a1.m14319B(sb2, this.f27435d, ", displayOrder=0, errorMessage=", str, ", isSelectedForFilter=");
        return AbstractC5601a.m11242m(sb2, this.f27437f, ")");
    }
}
