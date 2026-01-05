package as;

import com.websoptimization.callyzerbiz.data.model.response.AllEmployeeResponse;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: as.a */
/* loaded from: classes3.dex */
public final class C0428a {

    /* renamed from: a */
    public final AllEmployeeResponse f3147a;

    /* renamed from: b */
    public final boolean f3148b;

    /* renamed from: c */
    public final String f3149c;

    /* renamed from: d */
    public final String f3150d;

    public C0428a(AllEmployeeResponse employee, boolean z6) {
        AbstractC4154l.m8923f(employee, "employee");
        this.f3147a = employee;
        this.f3148b = z6;
        this.f3149c = employee.m4718d();
        this.f3150d = AbstractC5601a.m11232c(employee.m4715a(), "+", employee.m4717c());
    }

    /* renamed from: a */
    public static C0428a m1451a(C0428a c0428a, boolean z6) {
        AllEmployeeResponse employee = c0428a.f3147a;
        c0428a.getClass();
        AbstractC4154l.m8923f(employee, "employee");
        return new C0428a(employee, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0428a)) {
            return false;
        }
        C0428a c0428a = (C0428a) obj;
        return AbstractC4154l.m8918a(this.f3147a, c0428a.f3147a) && this.f3148b == c0428a.f3148b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3148b) + (this.f3147a.hashCode() * 31);
    }

    public final String toString() {
        return "EmployeeUiModel(employee=" + this.f3147a + ", isSelected=" + this.f3148b + ")";
    }
}
