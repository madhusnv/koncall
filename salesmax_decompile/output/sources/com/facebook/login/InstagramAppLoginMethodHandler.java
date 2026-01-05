package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.C10773c;
import com.facebook.login.LoginClient;
import java.util.Set;
import p001o.id5;
import p001o.sq8;
import p001o.srb;
import p001o.za;
import p001o.za5;

/* loaded from: classes5.dex */
public final class InstagramAppLoginMethodHandler extends NativeAppLoginMethodHandler {

    /* renamed from: e */
    public final String f11560e;

    /* renamed from: f */
    public final za f11561f;

    /* renamed from: g */
    public static final C10805b f11559g = new C10805b(null);
    public static final Parcelable.Creator<InstagramAppLoginMethodHandler> CREATOR = new C10804a();

    /* renamed from: com.facebook.login.InstagramAppLoginMethodHandler$a */
    public static final class C10804a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public InstagramAppLoginMethodHandler createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "source");
            return new InstagramAppLoginMethodHandler(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InstagramAppLoginMethodHandler[] newArray(int i) {
            return new InstagramAppLoginMethodHandler[i];
        }
    }

    /* renamed from: com.facebook.login.InstagramAppLoginMethodHandler$b */
    public static final class C10805b {
        public C10805b() {
        }

        public /* synthetic */ C10805b(id5 id5Var) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstagramAppLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        sq8.m48649h(loginClient, "loginClient");
        this.f11560e = "instagram_login";
        this.f11561f = za.INSTAGRAM_APPLICATION_WEB;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: f */
    public String mo13184f() {
        return this.f11560e;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: o */
    public int mo13188o(LoginClient.Request request) {
        sq8.m48649h(request, "request");
        LoginClient.C10815c c10815c = LoginClient.f11564H;
        String strM13304a = c10815c.m13304a();
        Context contextM13246i = m13310d().m13246i();
        if (contextM13246i == null) {
            contextM13246i = C10773c.m13019l();
        }
        String strM13265a = request.m13265a();
        Set setM13278n = request.m13278n();
        boolean zM13283s = request.m13283s();
        boolean zM13280p = request.m13280p();
        za5 za5VarM13271g = request.m13271g();
        if (za5VarM13271g == null) {
            za5VarM13271g = za5.NONE;
        }
        Intent intentM48783j = srb.m48783j(contextM13246i, strM13265a, setM13278n, strM13304a, zM13283s, zM13280p, za5VarM13271g, m13309c(request.m13266b()), request.m13267c(), request.m13276l(), request.m13279o(), request.m13281q(), request.m13264A());
        m13308a("e2e", strM13304a);
        return m13323A(intentM48783j, c10815c.m13305b()) ? 1 : 0;
    }

    @Override // com.facebook.login.NativeAppLoginMethodHandler
    /* renamed from: t */
    public za mo13230t() {
        return this.f11561f;
    }

    @Override // com.facebook.login.LoginMethodHandler, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "dest");
        super.writeToParcel(parcel, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstagramAppLoginMethodHandler(Parcel parcel) {
        super(parcel);
        sq8.m48649h(parcel, "source");
        this.f11560e = "instagram_login";
        this.f11561f = za.INSTAGRAM_APPLICATION_WEB;
    }
}
