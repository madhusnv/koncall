package com.amplifyframework.core.model;

import com.amplifyframework.AmplifyException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public interface ModelProvider {
    default Set<String> customTypeNames() {
        return new HashSet();
    }

    default Map<String, CustomTypeSchema> customTypeSchemas() {
        return new HashMap();
    }

    default Set<String> modelNames() {
        HashSet hashSet = new HashSet();
        if (models() != null) {
            Iterator<Class<? extends Model>> it = models().iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().getSimpleName());
            }
        }
        return hashSet;
    }

    default Map<String, ModelSchema> modelSchemas() {
        HashMap map = new HashMap();
        if (models() != null) {
            for (Class<? extends Model> cls : models()) {
                try {
                    map.put(cls.getSimpleName(), ModelSchema.fromModelClass(cls));
                } catch (AmplifyException e2) {
                    e2.printStackTrace();
                }
            }
        }
        return map;
    }

    Set<Class<? extends Model>> models();

    String version();
}
