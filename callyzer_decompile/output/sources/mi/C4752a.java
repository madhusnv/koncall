package mi;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.b1;
import com.google.android.gms.internal.measurement.d1;
import com.google.android.gms.internal.measurement.i0;
import com.google.android.gms.internal.measurement.l1;
import com.google.android.gms.internal.measurement.x0;
import com.google.android.gms.internal.measurement.y0;
import java.util.List;
import java.util.Map;
import java.util.Random;
import ug.r2;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mi.a */
/* loaded from: classes.dex */
public final class C4752a implements r2 {

    /* renamed from: a */
    public final /* synthetic */ l1 f23746a;

    public C4752a(l1 l1Var) {
        this.f23746a = l1Var;
    }

    @Override // ug.r2
    /* renamed from: a */
    public final String mo9662a() {
        i0 i0Var = new i0();
        l1 l1Var = this.f23746a;
        l1Var.m3482c(new d1(l1Var, i0Var, 3));
        return (String) i0.m3310g(i0Var.m3312f(500L), String.class);
    }

    @Override // ug.r2
    /* renamed from: b */
    public final String mo9663b() {
        i0 i0Var = new i0();
        l1 l1Var = this.f23746a;
        l1Var.m3482c(new d1(l1Var, i0Var, 4));
        return (String) i0.m3310g(i0Var.m3312f(500L), String.class);
    }

    @Override // ug.r2
    /* renamed from: c */
    public final void mo9664c(Bundle bundle) {
        l1 l1Var = this.f23746a;
        l1Var.m3482c(new x0(l1Var, bundle));
    }

    @Override // ug.r2
    /* renamed from: d */
    public final void mo9665d(String str) {
        l1 l1Var = this.f23746a;
        l1Var.m3482c(new b1(l1Var, str, 1));
    }

    @Override // ug.r2
    /* renamed from: e */
    public final void mo9666e(String str, String str2, Bundle bundle) {
        l1 l1Var = this.f23746a;
        l1Var.m3482c(new y0(l1Var, str, str2, bundle, 1));
    }

    @Override // ug.r2
    /* renamed from: f */
    public final void mo9667f(String str) {
        l1 l1Var = this.f23746a;
        l1Var.m3482c(new b1(l1Var, str, 0));
    }

    @Override // ug.r2
    /* renamed from: g */
    public final long mo9668g() {
        i0 i0Var = new i0();
        l1 l1Var = this.f23746a;
        l1Var.m3482c(new d1(l1Var, i0Var, 2));
        Long l9 = (Long) i0.m3310g(i0Var.m3312f(500L), Long.class);
        if (l9 != null) {
            return l9.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ System.currentTimeMillis()).nextLong();
        int i10 = l1Var.f6279d + 1;
        l1Var.f6279d = i10;
        return jNextLong + i10;
    }

    @Override // ug.r2
    /* renamed from: h */
    public final void mo9669h(String str, String str2, Bundle bundle) {
        l1 l1Var = this.f23746a;
        l1Var.m3482c(new y0(l1Var, str, str2, bundle, 0));
    }

    @Override // ug.r2
    /* renamed from: i */
    public final List mo9670i(String str, String str2) {
        return this.f23746a.m3484f(str, str2);
    }

    @Override // ug.r2
    /* renamed from: j */
    public final int mo9671j(String str) {
        return this.f23746a.m3481b(str);
    }

    @Override // ug.r2
    /* renamed from: k */
    public final String mo9672k() {
        i0 i0Var = new i0();
        l1 l1Var = this.f23746a;
        l1Var.m3482c(new d1(l1Var, i0Var, 1));
        return (String) i0.m3310g(i0Var.m3312f(50L), String.class);
    }

    @Override // ug.r2
    /* renamed from: l */
    public final String mo9673l() {
        i0 i0Var = new i0();
        l1 l1Var = this.f23746a;
        l1Var.m3482c(new d1(l1Var, i0Var, 0));
        return (String) i0.m3310g(i0Var.m3312f(500L), String.class);
    }

    @Override // ug.r2
    /* renamed from: m */
    public final Map mo9674m(String str, String str2, boolean z6) {
        return this.f23746a.m3480a(str, str2, z6);
    }
}
