package p001o;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.objectweb.asm.Opcodes;

/* loaded from: classes2.dex */
public final class gb4 {

    /* renamed from: e */
    public static final C13665a f24856e = new C13665a(null);

    /* renamed from: a */
    public final Context f24857a;

    /* renamed from: b */
    public boolean f24858b;

    /* renamed from: c */
    public fb4 f24859c;

    /* renamed from: d */
    public fb4 f24860d;

    /* renamed from: o.gb4$a */
    public static final class C13665a {
        public C13665a() {
        }

        public /* synthetic */ C13665a(id5 id5Var) {
            this();
        }
    }

    public gb4(Context context) {
        sq8.m48649h(context, "context");
        this.f24857a = context;
    }

    /* renamed from: c */
    public static /* synthetic */ fb4 m28300c(gb4 gb4Var, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return gb4Var.m28302b(z);
    }

    /* renamed from: a */
    public final List m28301a(Context context) throws PackageManager.NameNotFoundException {
        String string;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), Opcodes.IINC);
        ArrayList arrayList = new ArrayList();
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            sq8.m48648g(serviceInfoArr, "packageInfo.services");
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                Bundle bundle = serviceInfo.metaData;
                if (bundle != null && (string = bundle.getString("androidx.credentials.CREDENTIAL_PROVIDER_KEY")) != null) {
                    arrayList.add(string);
                }
            }
        }
        return kh3.Q0(arrayList);
    }

    /* renamed from: b */
    public final fb4 m28302b(boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            fb4 fb4VarM28304e = m28304e();
            return (fb4VarM28304e == null && z) ? m28305f() : fb4VarM28304e;
        }
        if (i <= 33) {
            return m28305f();
        }
        return null;
    }

    /* renamed from: d */
    public final fb4 m28303d(List list, Context context) {
        Iterator it = list.iterator();
        fb4 fb4Var = null;
        while (it.hasNext()) {
            try {
                Object objNewInstance = Class.forName((String) it.next()).getConstructor(Context.class).newInstance(context);
                sq8.m48647f(objNewInstance, "null cannot be cast to non-null type androidx.credentials.CredentialProvider");
                fb4 fb4Var2 = (fb4) objNewInstance;
                if (!fb4Var2.mo26376b()) {
                    continue;
                } else {
                    if (fb4Var != null) {
                        return null;
                    }
                    fb4Var = fb4Var2;
                }
            } catch (Throwable unused) {
            }
        }
        return fb4Var;
    }

    /* renamed from: e */
    public final fb4 m28304e() {
        if (!this.f24858b) {
            tb4 tb4Var = new tb4(this.f24857a);
            if (tb4Var.mo26376b()) {
                return tb4Var;
            }
            return null;
        }
        fb4 fb4Var = this.f24859c;
        if (fb4Var == null) {
            return null;
        }
        sq8.m48646e(fb4Var);
        if (fb4Var.mo26376b()) {
            return this.f24859c;
        }
        return null;
    }

    /* renamed from: f */
    public final fb4 m28305f() throws PackageManager.NameNotFoundException {
        if (!this.f24858b) {
            List listM28301a = m28301a(this.f24857a);
            if (listM28301a.isEmpty()) {
                return null;
            }
            return m28303d(listM28301a, this.f24857a);
        }
        fb4 fb4Var = this.f24860d;
        if (fb4Var == null) {
            return null;
        }
        sq8.m48646e(fb4Var);
        if (fb4Var.mo26376b()) {
            return this.f24860d;
        }
        return null;
    }
}
