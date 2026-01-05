package a9;

import a1.C0005d;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import kotlin.jvm.internal.AbstractC4154l;
import t8.C7077w;
import wr.C8158n;
import wx.m1;
import y8.AbstractC8600i;
import y8.C8592a;
import y8.C8593b;
import y8.C8596e;
import yv.C8801p;
import yv.C8803r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: a9.h */
/* loaded from: classes.dex */
public final class C0069h extends ConnectivityManager.NetworkCallback {

    /* renamed from: c */
    public static final /* synthetic */ int f257c = 0;

    /* renamed from: a */
    public final /* synthetic */ int f258a;

    /* renamed from: b */
    public final Object f259b;

    public /* synthetic */ C0069h(int i10, Object obj) {
        this.f258a = i10;
        this.f259b = obj;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        switch (this.f258a) {
            case 1:
                C0005d.m31l((C0005d) this.f259b, network, true);
                break;
            default:
                super.onAvailable(network);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities capabilities) {
        Object value;
        boolean z6;
        int i10 = this.f258a;
        Object obj = this.f259b;
        switch (i10) {
            case 0:
                AbstractC4154l.m8923f(network, "network");
                AbstractC4154l.m8923f(capabilities, "capabilities");
                C7077w c7077wM13371a = C7077w.m13371a();
                int i11 = AbstractC0071j.f262a;
                capabilities.toString();
                c7077wM13371a.getClass();
                C0070i c0070i = (C0070i) obj;
                c0070i.m188d(Build.VERSION.SDK_INT >= 28 ? new C8596e(capabilities.hasCapability(12), capabilities.hasCapability(16), !capabilities.hasCapability(11), capabilities.hasCapability(18)) : AbstractC0071j.m189a(c0070i.f260f));
                break;
            case 1:
            default:
                super.onCapabilitiesChanged(network, capabilities);
                break;
            case 2:
                AbstractC4154l.m8923f(network, "network");
                AbstractC4154l.m8923f(capabilities, "networkCapabilities");
                C7077w c7077wM13371a2 = C7077w.m13371a();
                int i12 = AbstractC8600i.f41852a;
                c7077wM13371a2.getClass();
                ((C8158n) obj).invoke(C8592a.f41839a);
                break;
            case 3:
                C8803r c8803r = (C8803r) obj;
                AbstractC4154l.m8923f(network, "network");
                AbstractC4154l.m8923f(capabilities, "networkCapabilities");
                super.onCapabilitiesChanged(network, capabilities);
                boolean z10 = capabilities.hasCapability(12) && capabilities.hasCapability(16) && (capabilities.hasTransport(1) || capabilities.hasTransport(0) || capabilities.hasTransport(3));
                boolean z11 = c8803r.f42467b.getActiveNetwork() != null;
                m1 m1Var = c8803r.f42470e;
                do {
                    value = m1Var.getValue();
                    C8801p c8801p = (C8801p) value;
                    z6 = z10 && z11;
                    c8801p.getClass();
                } while (!m1Var.m15397i(value, new C8801p(z6)));
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        Object value;
        int i10 = this.f258a;
        Object obj = this.f259b;
        switch (i10) {
            case 0:
                AbstractC4154l.m8923f(network, "network");
                C7077w c7077wM13371a = C7077w.m13371a();
                int i11 = AbstractC0071j.f262a;
                c7077wM13371a.getClass();
                C0070i c0070i = (C0070i) obj;
                c0070i.m188d(AbstractC0071j.m189a(c0070i.f260f));
                break;
            case 1:
                C0005d.m31l((C0005d) obj, network, false);
                break;
            case 2:
                AbstractC4154l.m8923f(network, "network");
                C7077w c7077wM13371a2 = C7077w.m13371a();
                int i12 = AbstractC8600i.f41852a;
                c7077wM13371a2.getClass();
                ((C8158n) obj).invoke(new C8593b(7));
                break;
            default:
                AbstractC4154l.m8923f(network, "network");
                super.onLost(network);
                m1 m1Var = ((C8803r) obj).f42470e;
                do {
                    value = m1Var.getValue();
                    ((C8801p) value).getClass();
                } while (!m1Var.m15397i(value, new C8801p(false)));
        }
    }

    public C0069h(C8158n c8158n) {
        this.f258a = 2;
        this.f259b = c8158n;
    }
}
