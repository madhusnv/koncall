package ai.salesmax.model.event;

import android.content.Context;

/* loaded from: classes.dex */
public interface PreferenceChangeEventListener {
    void onPreferenceChangeEvent(PreferenceChangeEvent preferenceChangeEvent);

    default void onPreferenceChangeEvent(Context context, PreferenceChangeEvent preferenceChangeEvent) {
    }
}
