package of;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzt;
import yg.C8650g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: of.m */
/* loaded from: classes.dex */
public final class C5358m {

    /* renamed from: a */
    public final int f26297a;

    /* renamed from: b */
    public final C8650g f26298b = new C8650g();

    /* renamed from: c */
    public final int f26299c;

    /* renamed from: d */
    public final Bundle f26300d;

    /* renamed from: e */
    public final /* synthetic */ int f26301e;

    public C5358m(int i10, int i11, Bundle bundle, int i12) {
        this.f26301e = i12;
        this.f26297a = i10;
        this.f26299c = i11;
        this.f26300d = bundle;
    }

    /* renamed from: a */
    public final boolean m10482a() {
        switch (this.f26301e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: b */
    public final void m10483b(zzt zztVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            toString();
            zztVar.toString();
        }
        this.f26298b.m15968a(zztVar);
    }

    public final String toString() {
        return "Request { what=" + this.f26299c + " id=" + this.f26297a + " oneWay=" + m10482a() + "}";
    }
}
