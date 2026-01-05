package p001o;

import ai.salesmax.SuperfoneApplication;
import ai.salesmax.util.Prefs;
import java.util.Optional;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public class nt6 {

    /* renamed from: f */
    public static nt6 f37285f;

    /* renamed from: a */
    public boolean f37286a = false;

    /* renamed from: b */
    public boolean f37287b = false;

    /* renamed from: c */
    public boolean f37288c = false;

    /* renamed from: d */
    public boolean f37289d = false;

    /* renamed from: e */
    public boolean f37290e = false;

    /* renamed from: f */
    public static synchronized nt6 m41112f() {
        nt6 nt6Var = f37285f;
        if (nt6Var != null) {
            return nt6Var;
        }
        nt6 nt6Var2 = new nt6();
        f37285f = nt6Var2;
        return nt6Var2;
    }

    /* renamed from: i */
    public static /* synthetic */ void m41113i(boolean z, Prefs prefs) {
        if (prefs.m3254p() != z) {
            prefs.Q0(z);
        }
    }

    /* renamed from: j */
    public static /* synthetic */ void m41114j(boolean z, Prefs prefs) {
        if (prefs.m3229Q() != z) {
            prefs.t1(z);
        }
    }

    /* renamed from: k */
    public static /* synthetic */ void m41115k(boolean z, Prefs prefs) {
        if (prefs.p0() != z) {
            prefs.S1(z);
        }
    }

    /* renamed from: d */
    public Boolean m41116d() {
        return Boolean.valueOf(this.f37287b);
    }

    /* renamed from: e */
    public Boolean m41117e() {
        return Boolean.FALSE;
    }

    /* renamed from: g */
    public boolean m41118g() {
        return this.f37288c;
    }

    /* renamed from: h */
    public boolean m41119h() {
        return this.f37289d;
    }

    /* renamed from: l */
    public void m41120l(final boolean z) {
        try {
            this.f37288c = z;
            Optional.ofNullable(SuperfoneApplication.f225c.m127c()).ifPresent(new Consumer() { // from class: o.kt6
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    nt6.m41113i(z, (Prefs) obj);
                }
            });
        } catch (Exception unused) {
        }
    }

    /* renamed from: m */
    public void m41121m(boolean z) {
        this.f37287b = z;
    }

    /* renamed from: n */
    public void m41122n(final boolean z) {
        try {
            this.f37289d = z;
            Optional.ofNullable(SuperfoneApplication.f225c.m127c()).ifPresent(new Consumer() { // from class: o.lt6
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    nt6.m41114j(z, (Prefs) obj);
                }
            });
        } catch (Exception unused) {
        }
    }

    /* renamed from: o */
    public void m41123o(final boolean z) {
        try {
            this.f37290e = z;
            Optional.ofNullable(SuperfoneApplication.f225c.m127c()).ifPresent(new Consumer() { // from class: o.jt6
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    nt6.m41115k(z, (Prefs) obj);
                }
            });
        } catch (Exception unused) {
        }
    }

    /* renamed from: p */
    public boolean m41124p() {
        return this.f37290e;
    }
}
