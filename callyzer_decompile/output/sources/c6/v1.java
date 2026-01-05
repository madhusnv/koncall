package c6;

import android.os.Build;
import android.view.View;
import java.util.Objects;
import u5.C7340b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class v1 {

    /* renamed from: b */
    public static final y1 f5532b;

    /* renamed from: a */
    public final y1 f5533a;

    static {
        int i10 = Build.VERSION.SDK_INT;
        f5532b = (i10 >= 34 ? new n1() : i10 >= 30 ? new m1() : i10 >= 29 ? new l1() : new j1()).mo2430b().f5541a.mo2500a().f5541a.mo2493b().f5541a.mo2494c();
    }

    public v1(y1 y1Var) {
        this.f5533a = y1Var;
    }

    /* renamed from: a */
    public y1 mo2500a() {
        return this.f5533a;
    }

    /* renamed from: b */
    public y1 mo2493b() {
        return this.f5533a;
    }

    /* renamed from: c */
    public y1 mo2494c() {
        return this.f5533a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1)) {
            return false;
        }
        v1 v1Var = (v1) obj;
        return mo2479p() == v1Var.mo2479p() && mo2496o() == v1Var.mo2496o() && Objects.equals(mo2477l(), v1Var.mo2477l()) && Objects.equals(mo2495j(), v1Var.mo2495j()) && Objects.equals(mo2501f(), v1Var.mo2501f());
    }

    /* renamed from: f */
    public C0881k mo2501f() {
        return null;
    }

    /* renamed from: g */
    public C7340b mo2475g(int i10) {
        return C7340b.f34956e;
    }

    /* renamed from: h */
    public C7340b mo2476h(int i10) {
        if ((i10 & 8) == 0) {
            return C7340b.f34956e;
        }
        throw new IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(mo2479p()), Boolean.valueOf(mo2496o()), mo2477l(), mo2495j(), mo2501f());
    }

    /* renamed from: i */
    public C7340b mo2512i() {
        return mo2477l();
    }

    /* renamed from: j */
    public C7340b mo2495j() {
        return C7340b.f34956e;
    }

    /* renamed from: k */
    public C7340b mo2513k() {
        return mo2477l();
    }

    /* renamed from: l */
    public C7340b mo2477l() {
        return C7340b.f34956e;
    }

    /* renamed from: m */
    public C7340b mo2514m() {
        return mo2477l();
    }

    /* renamed from: n */
    public y1 mo2478n(int i10, int i11, int i12, int i13) {
        return f5532b;
    }

    /* renamed from: o */
    public boolean mo2496o() {
        return false;
    }

    /* renamed from: p */
    public boolean mo2479p() {
        return false;
    }

    /* renamed from: q */
    public boolean mo2480q(int i10) {
        return true;
    }

    /* renamed from: d */
    public void mo2473d(View view) {
    }

    /* renamed from: e */
    public void mo2474e(y1 y1Var) {
    }

    /* renamed from: r */
    public void mo2481r(C7340b[] c7340bArr) {
    }

    /* renamed from: s */
    public void mo2482s(C7340b c7340b) {
    }

    /* renamed from: t */
    public void mo2483t(y1 y1Var) {
    }

    /* renamed from: u */
    public void mo2497u(C7340b c7340b) {
    }

    /* renamed from: v */
    public void mo2484v(int i10) {
    }
}
