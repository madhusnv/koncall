package uh;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: uh.m */
/* loaded from: classes.dex */
public final class ServiceConnectionC7468m implements ServiceConnection {

    /* renamed from: a */
    public final /* synthetic */ C7469n f36059a;

    public /* synthetic */ ServiceConnectionC7468m(C7469n c7469n) {
        this.f36059a = c7469n;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C7469n c7469n = this.f36059a;
        c7469n.f36062b.m5720e("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        c7469n.m14273a().post(new C7467l(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C7469n c7469n = this.f36059a;
        c7469n.f36062b.m5720e("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        c7469n.m14273a().post(new C7466k(1, this));
    }
}
