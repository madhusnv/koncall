package androidx.work.multiprocess;

import android.content.Context;
import androidx.work.ForegroundInfo;
import androidx.work.ForegroundUpdater;
import java.util.UUID;
import p001o.zfa;

/* loaded from: classes2.dex */
public class RemoteForegroundUpdater implements ForegroundUpdater {
    @Override // androidx.work.ForegroundUpdater
    public zfa setForegroundAsync(Context context, UUID uuid, ForegroundInfo foregroundInfo) {
        return RemoteWorkManager.getInstance(context).setForegroundAsync(uuid.toString(), foregroundInfo);
    }
}
