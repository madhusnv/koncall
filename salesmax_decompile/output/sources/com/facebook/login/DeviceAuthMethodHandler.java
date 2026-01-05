package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import com.facebook.AccessToken;
import com.facebook.login.LoginClient;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import p001o.id5;
import p001o.sq8;
import p001o.za;

/* loaded from: classes5.dex */
public class DeviceAuthMethodHandler extends LoginMethodHandler {

    /* renamed from: f */
    public static ScheduledThreadPoolExecutor f11551f;

    /* renamed from: d */
    public final String f11552d;

    /* renamed from: e */
    public static final C10800b f11550e = new C10800b(null);
    public static final Parcelable.Creator<DeviceAuthMethodHandler> CREATOR = new C10799a();

    /* renamed from: com.facebook.login.DeviceAuthMethodHandler$a */
    public static final class C10799a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public DeviceAuthMethodHandler createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "source");
            return new DeviceAuthMethodHandler(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public DeviceAuthMethodHandler[] newArray(int i) {
            return new DeviceAuthMethodHandler[i];
        }
    }

    /* renamed from: com.facebook.login.DeviceAuthMethodHandler$b */
    public static final class C10800b {
        public C10800b() {
        }

        public /* synthetic */ C10800b(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final synchronized ScheduledThreadPoolExecutor m13221a() {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
            if (DeviceAuthMethodHandler.f11551f == null) {
                DeviceAuthMethodHandler.f11551f = new ScheduledThreadPoolExecutor(1);
            }
            scheduledThreadPoolExecutor = DeviceAuthMethodHandler.f11551f;
            if (scheduledThreadPoolExecutor == null) {
                sq8.m48667z("backgroundExecutor");
                scheduledThreadPoolExecutor = null;
            }
            return scheduledThreadPoolExecutor;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceAuthMethodHandler(LoginClient loginClient) {
        super(loginClient);
        sq8.m48649h(loginClient, "loginClient");
        this.f11552d = "device_auth";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: f */
    public String mo13184f() {
        return this.f11552d;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: o */
    public int mo13188o(LoginClient.Request request) {
        sq8.m48649h(request, "request");
        m13218v(request);
        return 1;
    }

    /* renamed from: r */
    public DeviceAuthDialog m13214r() {
        return new DeviceAuthDialog();
    }

    /* renamed from: s */
    public void m13215s() {
        m13310d().m13244g(LoginClient.Result.f11596q.m13296a(m13310d().m13252o(), "User canceled log in."));
    }

    /* renamed from: t */
    public void m13216t(Exception exc) {
        sq8.m48649h(exc, "ex");
        m13310d().m13244g(LoginClient.Result.C10812c.m13295d(LoginClient.Result.f11596q, m13310d().m13252o(), null, exc.getMessage(), null, 8, null));
    }

    /* renamed from: u */
    public void m13217u(String str, String str2, String str3, Collection collection, Collection collection2, Collection collection3, za zaVar, Date date, Date date2, Date date3) {
        sq8.m48649h(str, "accessToken");
        sq8.m48649h(str2, "applicationId");
        sq8.m48649h(str3, "userId");
        m13310d().m13244g(LoginClient.Result.f11596q.m13299e(m13310d().m13252o(), new AccessToken(str, str2, str3, collection, collection2, collection3, zaVar, date, date2, date3, null, 1024, null)));
    }

    /* renamed from: v */
    public final void m13218v(LoginClient.Request request) {
        FragmentActivity fragmentActivityM13246i = m13310d().m13246i();
        if (fragmentActivityM13246i == null || fragmentActivityM13246i.isFinishing()) {
            return;
        }
        DeviceAuthDialog deviceAuthDialogM13214r = m13214r();
        deviceAuthDialogM13214r.show(fragmentActivityM13246i.getSupportFragmentManager(), "login_with_facebook");
        deviceAuthDialogM13214r.i1(request);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceAuthMethodHandler(Parcel parcel) {
        super(parcel);
        sq8.m48649h(parcel, "parcel");
        this.f11552d = "device_auth";
    }
}
