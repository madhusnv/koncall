package ug;

import com.google.android.gms.internal.measurement.t5;
import java.util.HashMap;
import java.util.concurrent.Callable;
import z1.C8849i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final /* synthetic */ class h1 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ int f35459a;

    /* renamed from: b */
    public final /* synthetic */ i1 f35460b;

    /* renamed from: c */
    public final /* synthetic */ String f35461c;

    public /* synthetic */ h1(i1 i1Var, String str, int i10) {
        this.f35459a = i10;
        this.f35460b = i1Var;
        this.f35461c = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f35459a) {
            case 0:
                return new com.google.android.gms.internal.measurement.l4(new h1(this.f35460b, this.f35461c, 1));
            case 1:
                i1 i1Var = this.f35460b;
                C7443n c7443n = i1Var.f35959b.f35488c;
                h4.m13944U(c7443n);
                String str = this.f35461c;
                z0 z0VarO0 = c7443n.O0(str);
                HashMap map = new HashMap();
                map.put("platform", "android");
                map.put("package_name", str);
                ((n1) i1Var.f482a).f35667d.m13884R();
                map.put("gmp_version", 133005L);
                if (z0VarO0 != null) {
                    String strM14231N = z0VarO0.m14231N();
                    if (strM14231N != null) {
                        map.put("app_version", strM14231N);
                    }
                    map.put("app_version_int", Long.valueOf(z0VarO0.m14233P()));
                    map.put("dynamite_version", Long.valueOf(z0VarO0.m14238b()));
                }
                return map;
            default:
                C8849i c8849i = new C8849i(18, this.f35460b, this.f35461c, false);
                t5 t5Var = new t5("internal.remoteConfig", 0);
                t5Var.f6223b.put("getValue", new com.google.android.gms.internal.measurement.l4(t5Var, c8849i));
                return t5Var;
        }
    }
}
