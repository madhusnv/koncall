package nu;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import com.websoptimization.callyzerbiz.R;
import ex.InterfaceC2141e;
import h6.C2856l;
import io.C3328c;
import og.od;
import pg.f9;
import pu.C6033a;
import pu.C6036d;
import pu.C6037e;
import qw.C6361k;
import qw.a0;
import r5.AbstractC6468c;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import yv.C8803r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nu.e */
/* loaded from: classes3.dex */
public final class C5144e extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f25198a;

    /* renamed from: b */
    public final /* synthetic */ C3328c f25199b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5144e(C3328c c3328c, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f25198a = i10;
        this.f25199b = c3328c;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f25198a) {
            case 0:
                return new C5144e(this.f25199b, interfaceC7559c, 0);
            case 1:
                return new C5144e(this.f25199b, interfaceC7559c, 1);
            default:
                return new C5144e(this.f25199b, interfaceC7559c, 2);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f25198a) {
        }
        return ((C5144e) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        C6361k c6361k;
        NetworkCapabilities networkCapabilities;
        int i10 = this.f25198a;
        C3328c c3328c = this.f25199b;
        switch (i10) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                Context context = (Context) c3328c.f17617i;
                boolean z6 = AbstractC6468c.m12450a(context, "android.permission.READ_CALL_LOG") != 0;
                boolean z10 = AbstractC6468c.m12450a(context, "android.permission.READ_PHONE_STATE") != 0;
                return (z6 && z10) ? new C6036d(f9.m11628b(context, R.string.ts_permission_error_both), null) : z6 ? new C6036d(context.getString(R.string.ts_permission_error, "Call Log"), null) : z10 ? new C6036d(context.getString(R.string.ts_permission_error, "Phone State"), null) : new C6037e(f9.m11628b(context, R.string.ts_permission_suss_msg));
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                C2856l c2856l = (C2856l) c3328c.f17616h;
                Context context2 = (Context) c3328c.f17617i;
                return c2856l.m6988d() ? new C6037e(f9.m11628b(context2, R.string.ts_battery_success_msg)) : new C6036d(f9.m11628b(context2, R.string.ts_battery_error), null);
            default:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                C8803r c8803r = (C8803r) c3328c.f17612d;
                Context context3 = (Context) c3328c.f17617i;
                ConnectivityManager connectivityManager = c8803r.f42467b;
                if (Build.VERSION.SDK_INT >= 28) {
                    Network activeNetwork = connectivityManager.getActiveNetwork();
                    c6361k = (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) ? new C6361k(Boolean.FALSE, "No Connection") : networkCapabilities.hasTransport(1) ? new C6361k(Boolean.TRUE, "Wi-Fi") : networkCapabilities.hasTransport(0) ? new C6361k(Boolean.TRUE, "Mobile Data") : networkCapabilities.hasTransport(3) ? new C6361k(Boolean.TRUE, "Ethernet") : networkCapabilities.hasTransport(2) ? new C6361k(Boolean.TRUE, "Bluetooth") : networkCapabilities.hasTransport(4) ? new C6361k(Boolean.TRUE, "VPN") : new C6361k(Boolean.FALSE, "Unknown");
                } else {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                        c6361k = new C6361k(Boolean.FALSE, "No Connection");
                    } else {
                        int type = activeNetworkInfo.getType();
                        c6361k = type != 0 ? type != 1 ? type != 9 ? new C6361k(Boolean.TRUE, "Unknown") : new C6361k(Boolean.TRUE, "Ethernet") : new C6361k(Boolean.TRUE, "Wi-Fi") : new C6361k(Boolean.TRUE, "Mobile Data");
                    }
                }
                boolean zBooleanValue = ((Boolean) c6361k.f30755a).booleanValue();
                String str = (String) c6361k.f30756b;
                if (!zBooleanValue) {
                    return new C6036d(f9.m11628b(context3, R.string.ts_internet_error_internet), new C6033a(false));
                }
                int restrictBackgroundStatus = ((C8803r) c3328c.f17612d).f42467b.getRestrictBackgroundStatus();
                if (restrictBackgroundStatus != 1 && restrictBackgroundStatus != 2) {
                    return new C6036d(f9.m11628b(context3, R.string.ts_internet_error_bg_data), new C6033a(true));
                }
                return new C6037e(f9.m11628b(context3, R.string.ts_internet_success_msg) + " " + str + ".");
        }
    }
}
