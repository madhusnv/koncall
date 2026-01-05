package androidx.work.multiprocess;

import android.content.Context;
import androidx.work.Data;
import androidx.work.ProgressUpdater;
import java.util.UUID;
import p001o.zfa;

/* loaded from: classes2.dex */
public class RemoteProgressUpdater implements ProgressUpdater {
    @Override // androidx.work.ProgressUpdater
    public zfa updateProgress(Context context, UUID uuid, Data data) {
        return RemoteWorkManager.getInstance(context).setProgress(uuid, data);
    }
}
