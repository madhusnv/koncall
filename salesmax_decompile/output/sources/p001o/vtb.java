package p001o;

import android.content.Context;

/* loaded from: classes.dex */
public final class vtb {

    /* renamed from: a */
    public final boolean f50869a;

    /* renamed from: b */
    public final boolean f50870b;

    /* renamed from: c */
    public final boolean f50871c;

    /* renamed from: d */
    public final Context f50872d;

    public vtb(boolean z, boolean z2, boolean z3, Context context) {
        sq8.m48649h(context, "context");
        this.f50869a = z;
        this.f50870b = z2;
        this.f50871c = z3;
        this.f50872d = context;
    }

    /* renamed from: a */
    public final boolean m53407a() {
        return this.f50871c;
    }

    /* renamed from: b */
    public final Context m53408b() {
        return this.f50872d;
    }

    /* renamed from: c */
    public final boolean m53409c() {
        return this.f50870b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vtb)) {
            return false;
        }
        vtb vtbVar = (vtb) obj;
        return this.f50869a == vtbVar.f50869a && this.f50870b == vtbVar.f50870b && this.f50871c == vtbVar.f50871c && sq8.m48644c(this.f50872d, vtbVar.f50872d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    public int hashCode() {
        boolean z = this.f50869a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r2 = this.f50870b;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        boolean z2 = this.f50871c;
        return ((i3 + (z2 ? 1 : z2 ? 1 : 0)) * 31) + this.f50872d.hashCode();
    }

    public String toString() {
        return "NetworkEvent(previous=" + this.f50869a + ", current=" + this.f50870b + ", changed=" + this.f50871c + ", context=" + this.f50872d + ")";
    }
}
