package d7;

import a1.C0005d;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: d7.x */
/* loaded from: classes.dex */
public abstract class AbstractServiceC1652x extends Service implements InterfaceC1649u {

    /* renamed from: a */
    public final C0005d f8156a = new C0005d(this);

    @Override // d7.InterfaceC1649u
    public final AbstractC1646r getLifecycle() {
        return (C1651w) this.f8156a.f24b;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        AbstractC4154l.m8923f(intent, "intent");
        C0005d c0005d = this.f8156a;
        c0005d.getClass();
        c0005d.m58Z(EnumC1644p.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        C0005d c0005d = this.f8156a;
        c0005d.getClass();
        c0005d.m58Z(EnumC1644p.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        C0005d c0005d = this.f8156a;
        c0005d.getClass();
        c0005d.m58Z(EnumC1644p.ON_STOP);
        c0005d.m58Z(EnumC1644p.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i10) {
        C0005d c0005d = this.f8156a;
        c0005d.getClass();
        c0005d.m58Z(EnumC1644p.ON_START);
        super.onStart(intent, i10);
    }
}
