package p001o;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.util.CloseGuard;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes6.dex */
public final class xc0 extends e9d {

    /* renamed from: e */
    public static final C18107a f53477e = new C18107a(null);

    /* renamed from: f */
    public static final boolean f53478f;

    /* renamed from: d */
    public final List f53479d;

    /* renamed from: o.xc0$a */
    public static final class C18107a {
        public C18107a() {
        }

        public /* synthetic */ C18107a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final e9d m55963a() {
            if (m55964b()) {
                return new xc0();
            }
            return null;
        }

        /* renamed from: b */
        public final boolean m55964b() {
            return xc0.f53478f;
        }
    }

    static {
        f53478f = e9d.f21191a.m24583h() && Build.VERSION.SDK_INT >= 29;
    }

    public xc0() {
        List listM21251p = ch3.m21251p(ad0.f14521a.m16890a(), new kk5(pf0.f39972f.m43549d()), new kk5(nt3.f37282a.m41108a()), new kk5(cl1.f18286a.m21374a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM21251p) {
            if (((dyf) obj).mo16886a()) {
                arrayList.add(obj);
            }
        }
        this.f53479d = arrayList;
    }

    @Override // p001o.e9d
    /* renamed from: c */
    public of2 mo24568c(X509TrustManager x509TrustManager) {
        sq8.m48649h(x509TrustManager, "trustManager");
        nd0 nd0VarM40366a = nd0.f36693d.m40366a(x509TrustManager);
        return nd0VarM40366a != null ? nd0VarM40366a : super.mo24568c(x509TrustManager);
    }

    @Override // p001o.e9d
    /* renamed from: e */
    public void mo19310e(SSLSocket sSLSocket, String str, List list) {
        Object next;
        sq8.m48649h(sSLSocket, "sslSocket");
        sq8.m48649h(list, "protocols");
        Iterator it = this.f53479d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((dyf) next).mo16887b(sSLSocket)) {
                    break;
                }
            }
        }
        dyf dyfVar = (dyf) next;
        if (dyfVar != null) {
            dyfVar.mo16889d(sSLSocket, str, list);
        }
    }

    @Override // p001o.e9d
    /* renamed from: g */
    public String mo19311g(SSLSocket sSLSocket) {
        Object next;
        sq8.m48649h(sSLSocket, "sslSocket");
        Iterator it = this.f53479d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((dyf) next).mo16887b(sSLSocket)) {
                break;
            }
        }
        dyf dyfVar = (dyf) next;
        if (dyfVar != null) {
            return dyfVar.mo16888c(sSLSocket);
        }
        return null;
    }

    @Override // p001o.e9d
    /* renamed from: h */
    public Object mo24571h(String str) {
        sq8.m48649h(str, "closer");
        if (Build.VERSION.SDK_INT < 30) {
            return super.mo24571h(str);
        }
        CloseGuard closeGuardM54197a = wc0.m54197a();
        closeGuardM54197a.open(str);
        return closeGuardM54197a;
    }

    @Override // p001o.e9d
    /* renamed from: i */
    public boolean mo24572i(String str) {
        sq8.m48649h(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // p001o.e9d
    /* renamed from: l */
    public void mo24574l(String str, Object obj) {
        sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        if (Build.VERSION.SDK_INT < 30) {
            super.mo24574l(str, obj);
        } else {
            sq8.m48647f(obj, "null cannot be cast to non-null type android.util.CloseGuard");
            uc0.m51357a(obj).warnIfOpen();
        }
    }
}
