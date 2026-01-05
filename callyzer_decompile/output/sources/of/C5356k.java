package of;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzt;
import o2.C5271d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: of.k */
/* loaded from: classes.dex */
public final /* synthetic */ class C5356k implements Handler.Callback {

    /* renamed from: a */
    public final /* synthetic */ int f26289a;

    /* renamed from: b */
    public final /* synthetic */ Object f26290b;

    public /* synthetic */ C5356k(int i10, Object obj) {
        this.f26289a = i10;
        this.f26290b = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f26289a) {
            case 0:
                int i10 = message.arg1;
                Log.isLoggable("MessengerIpcClient", 3);
                ServiceConnectionC5357l serviceConnectionC5357l = (ServiceConnectionC5357l) this.f26290b;
                synchronized (serviceConnectionC5357l) {
                    try {
                        C5358m c5358m = (C5358m) serviceConnectionC5357l.f26295e.get(i10);
                        if (c5358m == null) {
                            return true;
                        }
                        serviceConnectionC5357l.f26295e.remove(i10);
                        serviceConnectionC5357l.m10480c();
                        Bundle data = message.getData();
                        if (data.getBoolean("unsupported", false)) {
                            c5358m.m10483b(new zzt("Not supported by GmsCore", null));
                            return true;
                        }
                        switch (c5358m.f26301e) {
                            case 0:
                                if (!data.getBoolean("ack", false)) {
                                    c5358m.m10483b(new zzt("Invalid response to one way request", null));
                                    return true;
                                }
                                if (Log.isLoggable("MessengerIpcClient", 3)) {
                                    c5358m.toString();
                                }
                                c5358m.f26298b.m15969b(null);
                                return true;
                            default:
                                Bundle bundle = data.getBundle("data");
                                if (bundle == null) {
                                    bundle = Bundle.EMPTY;
                                }
                                if (Log.isLoggable("MessengerIpcClient", 3)) {
                                    c5358m.toString();
                                    String.valueOf(bundle);
                                }
                                c5358m.f26298b.m15969b(bundle);
                                return true;
                        }
                    } finally {
                    }
                }
            default:
                if (message.what != 0) {
                    return false;
                }
                C5271d c5271d = (C5271d) this.f26290b;
                if (message.obj != null) {
                    throw new ClassCastException();
                }
                synchronized (c5271d.f25905a) {
                    throw null;
                }
        }
    }
}
