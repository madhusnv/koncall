package p001o;

import android.content.Context;

/* loaded from: classes5.dex */
public final class h41 extends va4 {

    /* renamed from: a */
    public final Context f26184a;

    /* renamed from: b */
    public final ib3 f26185b;

    /* renamed from: c */
    public final ib3 f26186c;

    /* renamed from: d */
    public final String f26187d;

    public h41(Context context, ib3 ib3Var, ib3 ib3Var2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f26184a = context;
        if (ib3Var == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f26185b = ib3Var;
        if (ib3Var2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f26186c = ib3Var2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f26187d = str;
    }

    @Override // p001o.va4
    /* renamed from: b */
    public Context mo29790b() {
        return this.f26184a;
    }

    @Override // p001o.va4
    /* renamed from: c */
    public String mo29791c() {
        return this.f26187d;
    }

    @Override // p001o.va4
    /* renamed from: d */
    public ib3 mo29792d() {
        return this.f26186c;
    }

    @Override // p001o.va4
    /* renamed from: e */
    public ib3 mo29793e() {
        return this.f26185b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof va4)) {
            return false;
        }
        va4 va4Var = (va4) obj;
        return this.f26184a.equals(va4Var.mo29790b()) && this.f26185b.equals(va4Var.mo29793e()) && this.f26186c.equals(va4Var.mo29792d()) && this.f26187d.equals(va4Var.mo29791c());
    }

    public int hashCode() {
        return ((((((this.f26184a.hashCode() ^ 1000003) * 1000003) ^ this.f26185b.hashCode()) * 1000003) ^ this.f26186c.hashCode()) * 1000003) ^ this.f26187d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f26184a + ", wallClock=" + this.f26185b + ", monotonicClock=" + this.f26186c + ", backendName=" + this.f26187d + "}";
    }
}
