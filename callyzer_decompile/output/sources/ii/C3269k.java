package ii;

import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import oj.C5392d;
import ph.C5950e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ii.k */
/* loaded from: classes.dex */
public final class C3269k {

    /* renamed from: c */
    public static final Logger f17464c = Logger.getLogger(C3269k.class.getName());

    /* renamed from: d */
    public static final ArrayList f17465d;

    /* renamed from: e */
    public static final C3269k f17466e;

    /* renamed from: f */
    public static final C3269k f17467f;

    /* renamed from: a */
    public final InterfaceC3270l f17468a;

    /* renamed from: b */
    public final List f17469b = f17465d;

    static {
        try {
            Class.forName("android.app.Application", false, null);
            String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < 2; i10++) {
                String str = strArr[i10];
                Provider provider = Security.getProvider(str);
                if (provider != null) {
                    arrayList.add(provider);
                } else {
                    f17464c.info("Provider " + str + " not available");
                }
            }
            f17465d = arrayList;
        } catch (Exception unused) {
            f17465d = new ArrayList();
        }
        int i11 = 17;
        f17466e = new C3269k(new C5392d(i11));
        f17467f = new C3269k(new C5950e(i11));
    }

    public C3269k(InterfaceC3270l interfaceC3270l) {
        this.f17468a = interfaceC3270l;
    }

    /* renamed from: a */
    public final Object m7622a(String str) {
        Iterator it = this.f17469b.iterator();
        Exception exc = null;
        while (true) {
            boolean zHasNext = it.hasNext();
            InterfaceC3270l interfaceC3270l = this.f17468a;
            if (!zHasNext) {
                return interfaceC3270l.mo7623a(str, null);
            }
            try {
                return interfaceC3270l.mo7623a(str, (Provider) it.next());
            } catch (Exception e2) {
                if (exc == null) {
                    exc = e2;
                }
            }
        }
    }
}
