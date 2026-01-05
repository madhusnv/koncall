package androidx.mediarouter.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes2.dex */
public final class MediaTransferReceiver extends BroadcastReceiver {
    /* renamed from: a */
    public static boolean m8078a(Context context) {
        Intent intent = new Intent(context, (Class<?>) MediaTransferReceiver.class);
        intent.setPackage(context.getPackageName());
        return context.getPackageManager().queryBroadcastReceivers(intent, 0).size() > 0;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
    }
}
