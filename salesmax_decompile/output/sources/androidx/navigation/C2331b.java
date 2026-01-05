package androidx.navigation;

import android.os.Bundle;
import p001o.sq8;

/* renamed from: androidx.navigation.b */
/* loaded from: classes2.dex */
public final class C2331b {

    /* renamed from: a */
    public final AbstractC2347n f9423a;

    /* renamed from: b */
    public final boolean f9424b;

    /* renamed from: c */
    public final boolean f9425c;

    /* renamed from: d */
    public final boolean f9426d;

    /* renamed from: e */
    public final Object f9427e;

    /* renamed from: androidx.navigation.b$a */
    public static final class a {

        /* renamed from: a */
        public AbstractC2347n f9428a;

        /* renamed from: b */
        public boolean f9429b;

        /* renamed from: c */
        public Object f9430c;

        /* renamed from: d */
        public boolean f9431d;

        /* renamed from: e */
        public boolean f9432e;

        /* renamed from: a */
        public final C2331b m8545a() {
            AbstractC2347n abstractC2347nM8935c = this.f9428a;
            if (abstractC2347nM8935c == null) {
                abstractC2347nM8935c = AbstractC2347n.f9673c.m8935c(this.f9430c);
                sq8.m48647f(abstractC2347nM8935c, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any?>");
            }
            return new C2331b(abstractC2347nM8935c, this.f9429b, this.f9430c, this.f9431d, this.f9432e);
        }

        /* renamed from: b */
        public final a m8546b(Object obj) {
            this.f9430c = obj;
            this.f9431d = true;
            return this;
        }

        /* renamed from: c */
        public final a m8547c(boolean z) {
            this.f9429b = z;
            return this;
        }

        /* renamed from: d */
        public final a m8548d(AbstractC2347n abstractC2347n) {
            sq8.m48649h(abstractC2347n, "type");
            this.f9428a = abstractC2347n;
            return this;
        }
    }

    public C2331b(AbstractC2347n abstractC2347n, boolean z, Object obj, boolean z2, boolean z3) {
        sq8.m48649h(abstractC2347n, "type");
        if (!(abstractC2347n.m8834c() || !z)) {
            throw new IllegalArgumentException((abstractC2347n.mo8833b() + " does not allow nullable values").toString());
        }
        if (!((!z && z2 && obj == null) ? false : true)) {
            throw new IllegalArgumentException(("Argument with type " + abstractC2347n.mo8833b() + " has null value but is not nullable.").toString());
        }
        this.f9423a = abstractC2347n;
        this.f9424b = z;
        this.f9427e = obj;
        this.f9425c = z2 || z3;
        this.f9426d = z3;
    }

    /* renamed from: a */
    public final AbstractC2347n m8539a() {
        return this.f9423a;
    }

    /* renamed from: b */
    public final boolean m8540b() {
        return this.f9425c;
    }

    /* renamed from: c */
    public final boolean m8541c() {
        return this.f9426d;
    }

    /* renamed from: d */
    public final boolean m8542d() {
        return this.f9424b;
    }

    /* renamed from: e */
    public final void m8543e(String str, Bundle bundle) {
        Object obj;
        sq8.m48649h(str, "name");
        sq8.m48649h(bundle, "bundle");
        if (!this.f9425c || (obj = this.f9427e) == null) {
            return;
        }
        this.f9423a.mo8839h(bundle, str, obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !sq8.m48644c(C2331b.class, obj.getClass())) {
            return false;
        }
        C2331b c2331b = (C2331b) obj;
        if (this.f9424b != c2331b.f9424b || this.f9425c != c2331b.f9425c || !sq8.m48644c(this.f9423a, c2331b.f9423a)) {
            return false;
        }
        Object obj2 = this.f9427e;
        return obj2 != null ? sq8.m48644c(obj2, c2331b.f9427e) : c2331b.f9427e == null;
    }

    /* renamed from: f */
    public final boolean m8544f(String str, Bundle bundle) {
        sq8.m48649h(str, "name");
        sq8.m48649h(bundle, "bundle");
        if (!this.f9424b && bundle.containsKey(str) && bundle.get(str) == null) {
            return false;
        }
        try {
            this.f9423a.mo8832a(bundle, str);
            return true;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        int iHashCode = ((((this.f9423a.hashCode() * 31) + (this.f9424b ? 1 : 0)) * 31) + (this.f9425c ? 1 : 0)) * 31;
        Object obj = this.f9427e;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C2331b.class.getSimpleName());
        sb.append(" Type: " + this.f9423a);
        sb.append(" Nullable: " + this.f9424b);
        if (this.f9425c) {
            sb.append(" DefaultValue: " + this.f9427e);
        }
        String string = sb.toString();
        sq8.m48648g(string, "sb.toString()");
        return string;
    }
}
