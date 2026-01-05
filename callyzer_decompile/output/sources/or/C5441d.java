package or;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import ho.C2990c;
import ho.C2991d;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: or.d */
/* loaded from: classes3.dex */
public final class C5441d extends AbstractC5453p {

    /* renamed from: b */
    public final String f27360b;

    /* renamed from: c */
    public final LocalDateTime f27361c;

    /* renamed from: d */
    public final LocalDateTime f27362d;

    /* renamed from: e */
    public final String f27363e;

    /* renamed from: f */
    public final long f27364f;

    /* renamed from: g */
    public final boolean f27365g;

    /* renamed from: h */
    public final String f27366h;

    /* renamed from: i */
    public final String f27367i;

    /* renamed from: j */
    public final int f27368j;

    /* renamed from: k */
    public String f27369k;

    /* renamed from: l */
    public final boolean f27370l;

    /* renamed from: m */
    public final ArrayList f27371m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5441d(String str, LocalDateTime localDateTime, LocalDateTime localDateTime2, String str2, long j6, boolean z6, String modelId, String label, int i10, String str3, boolean z10) {
        super(Long.valueOf(j6));
        AbstractC4154l.m8923f(modelId, "modelId");
        AbstractC4154l.m8923f(label, "label");
        this.f27360b = str;
        this.f27361c = localDateTime;
        this.f27362d = localDateTime2;
        this.f27363e = str2;
        this.f27364f = j6;
        this.f27365g = z6;
        this.f27366h = modelId;
        this.f27367i = label;
        this.f27368j = i10;
        this.f27369k = str3;
        this.f27370l = z10;
        ArrayList arrayList = new ArrayList();
        this.f27371m = arrayList;
        if (z6) {
            arrayList.add(new C2991d(1));
        }
        LocalDate localDateMo7846m = (localDateTime == null || (localDateMo7846m = localDateTime.mo7846m()) == null) ? LocalDate.MIN : localDateMo7846m;
        AbstractC4154l.m8920c(localDateMo7846m);
        LocalDate localDateMo7846m2 = (localDateTime2 == null || (localDateMo7846m2 = localDateTime2.mo7846m()) == null) ? LocalDate.MAX : localDateMo7846m2;
        AbstractC4154l.m8920c(localDateMo7846m2);
        arrayList.add(new C2990c(localDateMo7846m, localDateMo7846m2));
    }

    /* renamed from: k */
    public static C5441d m11160k(C5441d c5441d, long j6, String str, boolean z6, int i10) {
        String str2 = c5441d.f27360b;
        LocalDateTime localDateTime = c5441d.f27361c;
        LocalDateTime localDateTime2 = c5441d.f27362d;
        String str3 = c5441d.f27363e;
        long j10 = (i10 & 16) != 0 ? c5441d.f27364f : j6;
        boolean z10 = c5441d.f27365g;
        String modelId = c5441d.f27366h;
        String label = c5441d.f27367i;
        int i11 = c5441d.f27368j;
        String str4 = (i10 & 512) != 0 ? c5441d.f27369k : str;
        boolean z11 = (i10 & 1024) != 0 ? c5441d.f27370l : z6;
        c5441d.getClass();
        AbstractC4154l.m8923f(modelId, "modelId");
        AbstractC4154l.m8923f(label, "label");
        return new C5441d(str2, localDateTime, localDateTime2, str3, j10, z10, modelId, label, i11, str4, z11);
    }

    @Override // or.AbstractC5453p
    /* renamed from: a */
    public final int mo11149a() {
        return this.f27368j;
    }

    @Override // or.AbstractC5453p
    /* renamed from: b */
    public final String mo11150b() {
        return this.f27369k;
    }

    @Override // or.AbstractC5453p
    /* renamed from: c */
    public final Object mo11151c() {
        return Long.valueOf(this.f27364f);
    }

    @Override // or.AbstractC5453p
    /* renamed from: d */
    public final String mo11152d() {
        return this.f27367i;
    }

    @Override // or.AbstractC5453p
    /* renamed from: e */
    public final String mo11153e() {
        return this.f27366h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5441d)) {
            return false;
        }
        C5441d c5441d = (C5441d) obj;
        return AbstractC4154l.m8918a(this.f27360b, c5441d.f27360b) && AbstractC4154l.m8918a(this.f27361c, c5441d.f27361c) && AbstractC4154l.m8918a(this.f27362d, c5441d.f27362d) && AbstractC4154l.m8918a(this.f27363e, c5441d.f27363e) && this.f27364f == c5441d.f27364f && this.f27365g == c5441d.f27365g && AbstractC4154l.m8918a(this.f27366h, c5441d.f27366h) && AbstractC4154l.m8918a(this.f27367i, c5441d.f27367i) && this.f27368j == c5441d.f27368j && AbstractC4154l.m8918a(this.f27369k, c5441d.f27369k) && this.f27370l == c5441d.f27370l;
    }

    @Override // or.AbstractC5453p
    /* renamed from: f */
    public final List mo11154f() {
        return this.f27371m;
    }

    @Override // or.AbstractC5453p
    /* renamed from: g */
    public final boolean mo11155g() {
        return this.f27370l;
    }

    @Override // or.AbstractC5453p
    /* renamed from: h */
    public final AbstractC5453p mo11156h(boolean z6) {
        return m11160k(this, 0L, null, z6, 1023);
    }

    public final int hashCode() {
        int iHashCode = this.f27360b.hashCode() * 31;
        LocalDateTime localDateTime = this.f27361c;
        int iHashCode2 = (iHashCode + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31;
        LocalDateTime localDateTime2 = this.f27362d;
        int iHashCode3 = (iHashCode2 + (localDateTime2 == null ? 0 : localDateTime2.hashCode())) * 31;
        String str = this.f27363e;
        int iM4556c = AbstractC1452a.m4556c(this.f27368j, AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC1452a.m4558e(AbstractC1452a.m4557d((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f27364f), 31, this.f27365g), 31, this.f27366h), 31, this.f27367i), 31);
        String str2 = this.f27369k;
        return Boolean.hashCode(this.f27370l) + ((iM4556c + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // or.AbstractC5453p
    /* renamed from: i */
    public final void mo11157i(String str) {
        this.f27369k = str;
    }

    @Override // or.AbstractC5453p
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ AbstractC5453p mo11158j(Serializable serializable) {
        return m11161l(((Number) serializable).longValue());
    }

    /* renamed from: l */
    public final C5441d m11161l(long j6) {
        return m11160k(this, j6, null, false, 2031);
    }

    public final String toString() {
        String str = this.f27369k;
        StringBuilder sb2 = new StringBuilder("DateField(dateFormat=");
        sb2.append(this.f27360b);
        sb2.append(", minDate=");
        sb2.append(this.f27361c);
        sb2.append(", maxDate=");
        sb2.append(this.f27362d);
        sb2.append(", helpText=");
        sb2.append(this.f27363e);
        sb2.append(", fieldValue=");
        sb2.append(this.f27364f);
        sb2.append(", isRequired=");
        sb2.append(this.f27365g);
        a1.m14319B(sb2, ", modelId=", this.f27366h, ", label=", this.f27367i);
        sb2.append(", displayOrder=");
        sb2.append(this.f27368j);
        sb2.append(", errorMessage=");
        sb2.append(str);
        sb2.append(", isSelectedForFilter=");
        sb2.append(this.f27370l);
        sb2.append(")");
        return sb2.toString();
    }
}
