package androidx.work;

import android.content.Context;
import java.util.UUID;
import p001o.zfa;

/* loaded from: classes2.dex */
public interface ForegroundUpdater {
    zfa setForegroundAsync(Context context, UUID uuid, ForegroundInfo foregroundInfo);
}
