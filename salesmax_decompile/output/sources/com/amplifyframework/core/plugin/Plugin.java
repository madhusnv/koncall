package com.amplifyframework.core.plugin;

import android.content.Context;
import com.amplifyframework.AmplifyException;
import com.amplifyframework.annotations.InternalAmplifyApi;
import com.amplifyframework.core.category.CategoryTypeable;
import com.amplifyframework.core.configuration.AmplifyOutputsData;
import org.json.JSONObject;

/* loaded from: classes5.dex */
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
