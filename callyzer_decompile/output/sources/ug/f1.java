package ug;

import bg.C0657b;
import bg.C0658c;
import java.util.Map;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class f1 implements s2 {

    /* renamed from: a */
    public final n1 f35432a;

    public /* synthetic */ f1(n1 n1Var) {
        this.f35432a = n1Var;
    }

    @Override // ug.s2
    /* renamed from: a */
    public /* synthetic */ void mo13878a(String str, int i10, Throwable th2, byte[] bArr, Map map) {
        this.f35432a.m14090g(i10, th2, bArr);
    }

    /* renamed from: b */
    public boolean m13879b() {
        n1 n1Var = this.f35432a;
        try {
            C0657b c0657bM1928a = C0658c.m1928a(n1Var.f35664a);
            if (c0657bM1928a != null) {
                return c0657bM1928a.m1920c(128, "com.android.vending").versionCode >= 80837300;
            }
            v0 v0Var = n1Var.f35669f;
            n1.m14085m(v0Var);
            v0Var.f35870p.m14140a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e2) {
            v0 v0Var2 = n1Var.f35669f;
            n1.m14085m(v0Var2);
            v0Var2.f35870p.m14141b(e2, "Failed to retrieve Play Store version for Install Referrer");
            return false;
        }
    }

    public f1(h4 h4Var) {
        this.f35432a = h4Var.f35497m;
    }
}
