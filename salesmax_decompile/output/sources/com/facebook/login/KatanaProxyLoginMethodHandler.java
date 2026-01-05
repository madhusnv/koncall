package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C10773c;
import com.facebook.login.LoginClient;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p001o.di4;
import p001o.id5;
import p001o.sq8;
import p001o.srb;
import p001o.ye3;
import p001o.za5;

/* loaded from: classes5.dex */
public final class KatanaProxyLoginMethodHandler extends NativeAppLoginMethodHandler {

    /* renamed from: e */
    public final String f11563e;

    /* renamed from: f */
    public static final C10807b f11562f = new C10807b(null);
    public static final Parcelable.Creator<KatanaProxyLoginMethodHandler> CREATOR = new C10806a();

    /* renamed from: com.facebook.login.KatanaProxyLoginMethodHandler$a */
    public static final class C10806a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public KatanaProxyLoginMethodHandler createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "source");
            return new KatanaProxyLoginMethodHandler(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public KatanaProxyLoginMethodHandler[] newArray(int i) {
            return new KatanaProxyLoginMethodHandler[i];
        }
    }

    /* renamed from: com.facebook.login.KatanaProxyLoginMethodHandler$b */
    public static final class C10807b {
        public C10807b() {
        }

        public /* synthetic */ C10807b(id5 id5Var) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KatanaProxyLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        sq8.m48649h(loginClient, "loginClient");
        this.f11563e = "katana_proxy_auth";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: f */
    public String mo13184f() {
        return this.f11563e;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: n */
    public boolean mo13233n() {
        return true;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: o */
    public int mo13188o(LoginClient.Request request) {
        sq8.m48649h(request, "request");
        boolean z = C10773c.f11413r && di4.m23197a() != null && request.m13274j().allowsCustomTabAuth();
        String strM13304a = LoginClient.f11564H.m13304a();
        FragmentActivity fragmentActivityM13246i = m13310d().m13246i();
        String strM13265a = request.m13265a();
        Set setM13278n = request.m13278n();
        boolean zM13283s = request.m13283s();
        boolean zM13280p = request.m13280p();
        za5 za5VarM13271g = request.m13271g();
        if (za5VarM13271g == null) {
            za5VarM13271g = za5.NONE;
        }
        za5 za5Var = za5VarM13271g;
        String strM13309c = m13309c(request.m13266b());
        String strM13267c = request.m13267c();
        String strM13276l = request.m13276l();
        boolean zM13279o = request.m13279o();
        boolean zM13281q = request.m13281q();
        boolean zM13264A = request.m13264A();
        String strM13277m = request.m13277m();
        String strM13268d = request.m13268d();
        ye3 ye3VarM13269e = request.m13269e();
        List listM48786n = srb.m48786n(fragmentActivityM13246i, strM13265a, setM13278n, strM13304a, zM13283s, zM13280p, za5Var, strM13309c, strM13267c, z, strM13276l, zM13279o, zM13281q, zM13264A, strM13277m, strM13268d, ye3VarM13269e != null ? ye3VarM13269e.name() : null);
        m13308a("e2e", strM13304a);
        Iterator it = listM48786n.iterator();
        int i = 0;
        while (it.hasNext()) {
            i++;
            if (m13323A((Intent) it.next(), LoginClient.f11564H.m13305b())) {
                return i;
            }
        }
        return 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KatanaProxyLoginMethodHandler(Parcel parcel) {
        super(parcel);
        sq8.m48649h(parcel, "source");
        this.f11563e = "katana_proxy_auth";
    }
}
