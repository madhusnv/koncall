package com.google.android.gms.cast.framework.media.internal;

import androidx.annotation.Keep;
import com.google.android.gms.cast.framework.C10905R;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class ResourceProvider {

    /* renamed from: a */
    public static final /* synthetic */ int f11949a = 0;
    private static final Map zza;

    static {
        HashMap map = new HashMap();
        map.put("smallIconDrawableResId", Integer.valueOf(C10905R.drawable.cast_ic_notification_small_icon));
        map.put("stopLiveStreamDrawableResId", Integer.valueOf(C10905R.drawable.cast_ic_notification_stop_live_stream));
        map.put("pauseDrawableResId", Integer.valueOf(C10905R.drawable.cast_ic_notification_pause));
        map.put("playDrawableResId", Integer.valueOf(C10905R.drawable.cast_ic_notification_play));
        map.put("skipNextDrawableResId", Integer.valueOf(C10905R.drawable.cast_ic_notification_skip_next));
        map.put("skipPrevDrawableResId", Integer.valueOf(C10905R.drawable.cast_ic_notification_skip_prev));
        map.put("forwardDrawableResId", Integer.valueOf(C10905R.drawable.cast_ic_notification_forward));
        map.put("forward10DrawableResId", Integer.valueOf(C10905R.drawable.cast_ic_notification_forward10));
        map.put("forward30DrawableResId", Integer.valueOf(C10905R.drawable.cast_ic_notification_forward30));
        map.put("rewindDrawableResId", Integer.valueOf(C10905R.drawable.cast_ic_notification_rewind));
        map.put("rewind10DrawableResId", Integer.valueOf(C10905R.drawable.cast_ic_notification_rewind10));
        map.put("rewind30DrawableResId", Integer.valueOf(C10905R.drawable.cast_ic_notification_rewind30));
        map.put("disconnectDrawableResId", Integer.valueOf(C10905R.drawable.cast_ic_notification_disconnect));
        map.put("notificationImageSizeDimenResId", Integer.valueOf(C10905R.dimen.cast_notification_image_size));
        map.put("castingToDeviceStringResId", Integer.valueOf(C10905R.string.cast_casting_to_device));
        map.put("stopLiveStreamStringResId", Integer.valueOf(C10905R.string.cast_stop_live_stream));
        map.put("pauseStringResId", Integer.valueOf(C10905R.string.cast_pause));
        map.put("playStringResId", Integer.valueOf(C10905R.string.cast_play));
        map.put("skipNextStringResId", Integer.valueOf(C10905R.string.cast_skip_next));
        map.put("skipPrevStringResId", Integer.valueOf(C10905R.string.cast_skip_prev));
        map.put("forwardStringResId", Integer.valueOf(C10905R.string.cast_forward));
        map.put("forward10StringResId", Integer.valueOf(C10905R.string.cast_forward_10));
        map.put("forward30StringResId", Integer.valueOf(C10905R.string.cast_forward_30));
        map.put("rewindStringResId", Integer.valueOf(C10905R.string.cast_rewind));
        map.put("rewind10StringResId", Integer.valueOf(C10905R.string.cast_rewind_10));
        map.put("rewind30StringResId", Integer.valueOf(C10905R.string.cast_rewind_30));
        map.put("disconnectStringResId", Integer.valueOf(C10905R.string.cast_disconnect));
        zza = Collections.unmodifiableMap(map);
    }

    @Keep
    public static Integer findResourceByName(String str) {
        if (str == null) {
            return null;
        }
        return (Integer) zza.get(str);
    }
}
