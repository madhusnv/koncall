package jakarta.mail;

import com.sun.mail.util.AbstractC1452a;
import java.io.File;
import java.security.PrivilegedAction;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jakarta.mail.x */
/* loaded from: classes3.dex */
public final class C3696x implements PrivilegedAction {

    /* renamed from: a */
    public final /* synthetic */ int f19431a;

    public /* synthetic */ C3696x(int i10) {
        this.f19431a = i10;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        switch (this.f19431a) {
            case 0:
                String property = System.getProperty("java.home");
                StringBuilder sbM4568o = AbstractC1452a.m4568o(property);
                String str = File.separator;
                String strM4564k = AbstractC1452a.m4564k(sbM4568o, str, "conf");
                if (new File(strM4564k).exists()) {
                    return AbstractC1452a.m4561h(strM4564k, str);
                }
                return property + str + "lib" + str;
            case 1:
                try {
                    return Thread.currentThread().getContextClassLoader();
                } catch (SecurityException unused) {
                    return null;
                }
            case 2:
                String property2 = System.getProperty("java.home");
                StringBuilder sbM4568o2 = AbstractC1452a.m4568o(property2);
                String str2 = File.separator;
                String strM4564k2 = AbstractC1452a.m4564k(sbM4568o2, str2, "conf");
                if (new File(strM4564k2).exists()) {
                    return AbstractC1452a.m4561h(strM4564k2, str2);
                }
                return property2 + str2 + "lib" + str2;
            case 3:
                String property3 = System.getProperty("java.home");
                StringBuilder sbM4568o3 = AbstractC1452a.m4568o(property3);
                String str3 = File.separator;
                String strM4564k3 = AbstractC1452a.m4564k(sbM4568o3, str3, "conf");
                if (new File(strM4564k3).exists()) {
                    return AbstractC1452a.m4561h(strM4564k3, str3);
                }
                return property3 + str3 + "lib" + str3;
            default:
                try {
                    return Thread.currentThread().getContextClassLoader();
                } catch (SecurityException unused2) {
                    return null;
                }
        }
    }
}
