package p001o;

import android.content.Context;
import android.content.res.loader.ResourcesLoader;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class qqe {
    /* renamed from: a */
    public static boolean m45769a(Context context, Map map) {
        ResourcesLoader resourcesLoaderM19122a = bi3.m19122a(context, map);
        if (resourcesLoaderM19122a == null) {
            return false;
        }
        context.getResources().addLoaders(resourcesLoaderM19122a);
        return true;
    }
}
