package p001o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import java.util.List;
import p001o.k68;

/* loaded from: classes5.dex */
public class zj8 extends InstallReferrerClient {

    /* renamed from: a */
    public int f57286a = 0;

    /* renamed from: b */
    public final Context f57287b;

    /* renamed from: c */
    public k68 f57288c;

    /* renamed from: d */
    public ServiceConnection f57289d;

    /* renamed from: o.zj8$b */
    public final class ServiceConnectionC18660b implements ServiceConnection {

        /* renamed from: a */
        public final InstallReferrerStateListener f57290a;

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            ak8.m17330a("InstallReferrerClient", "Install Referrer service connected.");
            zj8.this.f57288c = k68.AbstractBinderC14718a.L0(iBinder);
            zj8.this.f57286a = 2;
            this.f57290a.mo12626a(0);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            ak8.m17331b("InstallReferrerClient", "Install Referrer service disconnected.");
            zj8.this.f57288c = null;
            zj8.this.f57286a = 0;
            this.f57290a.mo12627b();
        }

        public ServiceConnectionC18660b(InstallReferrerStateListener installReferrerStateListener) {
            if (installReferrerStateListener == null) {
                throw new RuntimeException("Please specify a listener to know when setup is done.");
            }
            this.f57290a = installReferrerStateListener;
        }
    }

    public zj8(Context context) {
        this.f57287b = context.getApplicationContext();
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    /* renamed from: a */
    public void mo12622a() {
        this.f57286a = 3;
        if (this.f57289d != null) {
            ak8.m17330a("InstallReferrerClient", "Unbinding from service.");
            this.f57287b.unbindService(this.f57289d);
            this.f57289d = null;
        }
        this.f57288c = null;
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    /* renamed from: b */
    public ReferrerDetails mo12623b() throws RemoteException {
        if (!m59518h()) {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", this.f57287b.getPackageName());
        try {
            return new ReferrerDetails(this.f57288c.mo35035u(bundle));
        } catch (RemoteException e) {
            ak8.m17331b("InstallReferrerClient", "RemoteException getting install referrer information");
            this.f57286a = 0;
            throw e;
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    /* renamed from: d */
    public void mo12624d(InstallReferrerStateListener installReferrerStateListener) {
        ServiceInfo serviceInfo;
        if (m59518h()) {
            ak8.m17330a("InstallReferrerClient", "Service connection is valid. No need to re-initialize.");
            installReferrerStateListener.mo12626a(0);
            return;
        }
        int i = this.f57286a;
        if (i == 1) {
            ak8.m17331b("InstallReferrerClient", "Client is already in the process of connecting to the service.");
            installReferrerStateListener.mo12626a(3);
            return;
        }
        if (i == 3) {
            ak8.m17331b("InstallReferrerClient", "Client was already closed and can't be reused. Please create another instance.");
            installReferrerStateListener.mo12626a(3);
            return;
        }
        ak8.m17330a("InstallReferrerClient", "Starting install referrer service setup.");
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        List<ResolveInfo> listQueryIntentServices = this.f57287b.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty() || (serviceInfo = listQueryIntentServices.get(0).serviceInfo) == null) {
            this.f57286a = 0;
            ak8.m17330a("InstallReferrerClient", "Install Referrer service unavailable on device.");
            installReferrerStateListener.mo12626a(2);
            return;
        }
        String str = serviceInfo.packageName;
        String str2 = serviceInfo.name;
        if (!"com.android.vending".equals(str) || str2 == null || !m59517g()) {
            ak8.m17331b("InstallReferrerClient", "Play Store missing or incompatible. Version 8.3.73 or later required.");
            this.f57286a = 0;
            installReferrerStateListener.mo12626a(2);
            return;
        }
        Intent intent2 = new Intent(intent);
        ServiceConnectionC18660b serviceConnectionC18660b = new ServiceConnectionC18660b(installReferrerStateListener);
        this.f57289d = serviceConnectionC18660b;
        try {
            if (this.f57287b.bindService(intent2, serviceConnectionC18660b, 1)) {
                ak8.m17330a("InstallReferrerClient", "Service was bonded successfully.");
                return;
            }
            ak8.m17331b("InstallReferrerClient", "Connection to service is blocked.");
            this.f57286a = 0;
            installReferrerStateListener.mo12626a(1);
        } catch (SecurityException unused) {
            ak8.m17331b("InstallReferrerClient", "No permission to connect to service.");
            this.f57286a = 0;
            installReferrerStateListener.mo12626a(4);
        }
    }

    /* renamed from: g */
    public final boolean m59517g() {
        return this.f57287b.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300;
    }

    /* renamed from: h */
    public boolean m59518h() {
        return (this.f57286a != 2 || this.f57288c == null || this.f57289d == null) ? false : true;
    }
}
