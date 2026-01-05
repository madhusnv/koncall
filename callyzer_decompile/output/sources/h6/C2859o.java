package h6;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import cf.C0964b;
import cf.C0966d;
import cf.C0967e;
import df.C1710i;
import df.C1711j;
import ef.C2045e;
import ef.C2050j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import pw.InterfaceC6043a;
import rw.AbstractC6663m;
import xe.AbstractC8361m;
import xe.C8358j;
import ye.C8640e;
import ze.C8944a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: h6.o */
/* loaded from: classes.dex */
public final class C2859o {

    /* renamed from: a */
    public Context f15868a;

    public C2859o(Context context) {
        AbstractC4154l.m8923f(context, "context");
        this.f15868a = context;
    }

    /* renamed from: b */
    public static InterfaceC2858n m6989b(C2859o c2859o) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            C2861q c2861q = new C2861q(c2859o.f15868a);
            C2861q c2861q2 = c2861q.isAvailableOnDevice() ? c2861q : null;
            return c2861q2 == null ? c2859o.m6991c() : c2861q2;
        }
        if (i10 <= 33) {
            return c2859o.m6991c();
        }
        return null;
    }

    /* renamed from: a */
    public C8358j m6990a() {
        Context context = this.f15868a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        C8358j c8358j = new C8358j();
        c8358j.f40001a = C8944a.m16423a(AbstractC8361m.f40009a);
        C8640e c8640e = new C8640e(1, context);
        c8358j.f40002b = c8640e;
        c8358j.f40003c = C8944a.m16423a(new C2050j(c8640e, new C8640e(0, c8640e), 1));
        C8640e c8640e2 = c8358j.f40002b;
        c8358j.f40004d = new C2045e(c8640e2, 1);
        InterfaceC6043a interfaceC6043aM16423a = C8944a.m16423a(new C2050j(c8358j.f40004d, C8944a.m16423a(new C2045e(c8640e2, 0)), 0));
        c8358j.f40005e = interfaceC6043aM16423a;
        C0966d c0966d = new C0966d(0);
        C8640e c8640e3 = c8358j.f40002b;
        C0967e c0967e = new C0967e(c8640e3, interfaceC6043aM16423a, c0966d, 0);
        InterfaceC6043a interfaceC6043a = c8358j.f40001a;
        InterfaceC6043a interfaceC6043a2 = c8358j.f40003c;
        c8358j.f40006f = C8944a.m16423a(new C0967e(new C0964b(interfaceC6043a, interfaceC6043a2, c0967e, interfaceC6043aM16423a, interfaceC6043aM16423a), new C1710i(c8640e3, interfaceC6043a2, interfaceC6043aM16423a, c0967e, interfaceC6043a, interfaceC6043aM16423a, interfaceC6043aM16423a), new C1711j(interfaceC6043a, interfaceC6043aM16423a, c0967e, interfaceC6043aM16423a), 1));
        return c8358j;
    }

    /* renamed from: c */
    public InterfaceC2858n m6991c() throws PackageManager.NameNotFoundException {
        String string;
        Context context = this.f15868a;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 132);
        ArrayList arrayList = new ArrayList();
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                Bundle bundle = serviceInfo.metaData;
                if (bundle != null && (string = bundle.getString("androidx.credentials.CREDENTIAL_PROVIDER_KEY")) != null) {
                    arrayList.add(string);
                }
            }
        }
        List listC0 = AbstractC6663m.c0(arrayList);
        if (listC0.isEmpty()) {
            return null;
        }
        Iterator it = listC0.iterator();
        InterfaceC2858n interfaceC2858n = null;
        while (it.hasNext()) {
            try {
                Object objNewInstance = Class.forName((String) it.next()).getConstructor(Context.class).newInstance(context);
                AbstractC4154l.m8921d(objNewInstance, "null cannot be cast to non-null type androidx.credentials.CredentialProvider");
                InterfaceC2858n interfaceC2858n2 = (InterfaceC2858n) objNewInstance;
                if (!interfaceC2858n2.isAvailableOnDevice()) {
                    continue;
                } else {
                    if (interfaceC2858n != null) {
                        return null;
                    }
                    interfaceC2858n = interfaceC2858n2;
                }
            } catch (Throwable unused) {
            }
        }
        return interfaceC2858n;
    }
}
