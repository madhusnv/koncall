package p017s;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import p001b.AbstractBinderC0507b;
import p001b.C0506a;
import p001b.InterfaceC0508c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: s.d */
/* loaded from: classes.dex */
public abstract class AbstractServiceConnectionC6695d implements ServiceConnection {
    private Context mApplicationContext;

    public Context getApplicationContext() {
        return this.mApplicationContext;
    }

    public abstract void onCustomTabsServiceConnected(ComponentName componentName, AbstractC6693b abstractC6693b);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC0508c interfaceC0508c;
        if (this.mApplicationContext == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        int i10 = AbstractBinderC0507b.f3565e;
        if (iBinder == null) {
            interfaceC0508c = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0508c)) {
                C0506a c0506a = new C0506a();
                c0506a.f3564e = iBinder;
                interfaceC0508c = c0506a;
            } else {
                interfaceC0508c = (InterfaceC0508c) iInterfaceQueryLocalInterface;
            }
        }
        onCustomTabsServiceConnected(componentName, new C6694c(interfaceC0508c, componentName));
    }

    public void setApplicationContext(Context context) {
        this.mApplicationContext = context;
    }
}
