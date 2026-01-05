package com.amplifyframework.devmenu;

import a2.AbstractC0030c;
import android.content.Context;
import com.amplifyframework.AmplifyException;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.Resources;
import com.amplifyframework.core.category.Category;
import com.amplifyframework.core.plugin.Plugin;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class EnvironmentInfo {
    private static final String DEV_ENV_INFO_FILE_NAME = "localenvinfo";
    private final Map<String, String> devEnvironmentItems;

    public EnvironmentInfo() {
        HashMap map = new HashMap();
        this.devEnvironmentItems = map;
        map.put("nodejsVersion", "Node.js Version");
        map.put("npmVersion", "NPM Version");
        map.put("amplifyCliVersion", "Amplify CLI Version");
        map.put("androidStudioVersion", "Android Studio Version");
        map.put("osName", "OS");
        map.put("osVersion", "OS Version");
    }

    private String getCategoryPluginVersions(Category<?> category) {
        StringBuilder sb2 = new StringBuilder();
        for (P p4 : category.getPlugins()) {
            sb2.append(p4.getPluginKey() + ": " + p4.getVersion() + "\n");
        }
        return sb2.toString();
    }

    public String getDeveloperEnvironmentInfo(Context context) {
        Objects.requireNonNull(context);
        try {
            JSONObject jsonResource = Resources.readJsonResource(context.getApplicationContext(), DEV_ENV_INFO_FILE_NAME);
            StringBuilder sb2 = new StringBuilder();
            for (String str : this.devEnvironmentItems.keySet()) {
                if (jsonResource.has(str)) {
                    try {
                        sb2.append(AbstractC0030c.m124o(new StringBuilder(), this.devEnvironmentItems.get(str), ": ", jsonResource.getString(str), "\n"));
                    } catch (JSONException e2) {
                        throw new AmplifyException("Error reading the developer environment information.", e2, "Check that localenvinfo.json is properly formatted");
                    }
                }
            }
            return sb2.toString();
        } catch (Resources.ResourceLoadingException e10) {
            throw new AmplifyException("Failed to find localenvinfo.", e10, "Please ensure it is present in your project.");
        }
    }

    public String getPluginVersions() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<Category<? extends Plugin<?>>> it = Amplify.getCategoriesMap().values().iterator();
        while (it.hasNext()) {
            sb2.append(getCategoryPluginVersions(it.next()));
        }
        String string = sb2.toString();
        return string.isEmpty() ? "No plugins added." : string;
    }
}
