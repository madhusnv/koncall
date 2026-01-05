package androidx.appcompat.app;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ServiceInfo;
import android.os.IBinder;

/* loaded from: classes2.dex */
public final class AppLocalesMetadataHolderService extends Service {

    /* renamed from: androidx.appcompat.app.AppLocalesMetadataHolderService$a */
    public static class C1781a {
        /* renamed from: a */
        public static int m3863a() {
            return 512;
        }
    }

    /* renamed from: a */
    public static ServiceInfo m3862a(Context context) {
        return context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AppLocalesMetadataHolderService.class), C1781a.m3863a() | 128);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }
}
