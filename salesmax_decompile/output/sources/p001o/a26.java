package p001o;

import android.hardware.camera2.params.DynamicRangeProfiles;
import com.google.android.gms.cast.MediaStatus;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class a26 {

    /* renamed from: a */
    public static final Map f14053a;

    /* renamed from: b */
    public static final Map f14054b;

    static {
        HashMap map = new HashMap();
        f14053a = map;
        HashMap map2 = new HashMap();
        f14054b = map2;
        y16 y16Var = y16.f54703d;
        map.put(1L, y16Var);
        map2.put(y16Var, Collections.singletonList(1L));
        map.put(2L, y16.f54705f);
        map2.put((y16) map.get(2L), Collections.singletonList(2L));
        y16 y16Var2 = y16.f54706g;
        map.put(4L, y16Var2);
        map2.put(y16Var2, Collections.singletonList(4L));
        y16 y16Var3 = y16.f54707h;
        map.put(8L, y16Var3);
        map2.put(y16Var3, Collections.singletonList(8L));
        List listAsList = Arrays.asList(64L, 128L, 16L, 32L);
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            f14053a.put((Long) it.next(), y16.f54708i);
        }
        f14054b.put(y16.f54708i, listAsList);
        List listAsList2 = Arrays.asList(Long.valueOf(MediaStatus.COMMAND_QUEUE_REPEAT_ALL), Long.valueOf(MediaStatus.COMMAND_QUEUE_REPEAT_ONE), 256L, 512L);
        Iterator it2 = listAsList2.iterator();
        while (it2.hasNext()) {
            f14053a.put((Long) it2.next(), y16.f54709j);
        }
        f14054b.put(y16.f54709j, listAsList2);
    }

    /* renamed from: a */
    public static Long m16355a(y16 y16Var, DynamicRangeProfiles dynamicRangeProfiles) {
        List<Long> list = (List) f14054b.get(y16Var);
        if (list == null) {
            return null;
        }
        Set supportedProfiles = dynamicRangeProfiles.getSupportedProfiles();
        for (Long l : list) {
            if (supportedProfiles.contains(l)) {
                return l;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static y16 m16356b(long j) {
        return (y16) f14053a.get(Long.valueOf(j));
    }
}
