package p001o;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes3.dex */
public final class pkj implements ServiceConnection {

    /* renamed from: a */
    public final /* synthetic */ rkj f40205a;

    public /* synthetic */ pkj(rkj rkjVar, nkj nkjVar) {
        this.f40205a = rkjVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f40205a.f43742b.m48398c("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        rkj rkjVar = this.f40205a;
        rkjVar.m46892c().post(new jkj(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f40205a.f43742b.m48398c("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        rkj rkjVar = this.f40205a;
        rkjVar.m46892c().post(new lkj(this));
    }
}
