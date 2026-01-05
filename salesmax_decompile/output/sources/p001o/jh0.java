package p001o;

import android.content.ContentResolver;
import android.provider.Settings;

/* loaded from: classes3.dex */
public class jh0 {
    /* renamed from: a */
    public float m33830a(ContentResolver contentResolver) {
        return Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
    }
}
