package com.amplifyframework.core.plugin;

import android.content.Context;
import com.amplifyframework.AmplifyException;
import com.amplifyframework.annotations.InternalAmplifyApi;
import com.amplifyframework.core.category.CategoryTypeable;
import com.amplifyframework.core.configuration.AmplifyOutputsData;
import org.json.JSONObject;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public interface Plugin<E> extends CategoryTypeable {
    @InternalAmplifyApi
    default void configure(AmplifyOutputsData amplifyOutputsData, Context context) throws AmplifyException {
        throw new AmplifyException("This plugin version does not support the Gen2 configuration format", "Use a newer version of this plugin that has support for the Amplify Gen2 configuration format");
    }

    void configure(JSONObject jSONObject, Context context);

    E getEscapeHatch();

    String getPluginKey();

    String getVersion();

    void initialize(Context context);
}
