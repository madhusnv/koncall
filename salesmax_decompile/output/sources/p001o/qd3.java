package p001o;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract /* synthetic */ class qd3 {
    /* renamed from: a */
    public static /* synthetic */ Map m45109a(Map.Entry[] entryArr) {
        HashMap map = new HashMap(entryArr.length);
        for (Map.Entry entry : entryArr) {
            Object key = entry.getKey();
            Objects.requireNonNull(key);
            Object value = entry.getValue();
            Objects.requireNonNull(value);
            if (map.put(key, value) != null) {
                throw new IllegalArgumentException("duplicate key: " + key);
            }
        }
        return Collections.unmodifiableMap(map);
    }
}
