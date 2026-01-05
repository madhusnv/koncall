package zc;

import ex.InterfaceC2139c;
import j$.time.LocalDateTime;
import k8.InterfaceC4024a;
import k8.InterfaceC4026c;
import kotlin.jvm.internal.AbstractC4154l;
import yv.C8800o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zc.g */
/* loaded from: classes.dex */
public final /* synthetic */ class C8930g implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f42894a;

    public /* synthetic */ C8930g(int i10) {
        this.f42894a = i10;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) throws Exception {
        switch (this.f42894a) {
            case 0:
                return String.valueOf(((Byte) obj).byteValue() & 255);
            default:
                InterfaceC4024a _connection = (InterfaceC4024a) obj;
                AbstractC4154l.m8923f(_connection, "_connection");
                InterfaceC4026c interfaceC4026cY0 = _connection.y0("SELECT MIN(sync_subscription_start_time) FROM UserSimDetails WHERE is_connect= '1' AND sync_subscription_start_time <> '' AND sync_subscription_start_time IS NOT NULL");
                try {
                    LocalDateTime localDateTimeM16183G = null;
                    if (interfaceC4026cY0.r0()) {
                        String strMo1777W = interfaceC4026cY0.isNull(0) ? null : interfaceC4026cY0.mo1777W(0);
                        if (strMo1777W != null) {
                            C8800o c8800o = C8800o.f42459a;
                            localDateTimeM16183G = C8800o.m16183G(strMo1777W);
                        }
                    }
                    return localDateTimeM16183G;
                } finally {
                    interfaceC4026cY0.close();
                }
        }
    }
}
