package p022x;

import android.hardware.camera2.params.DynamicRangeProfiles;
import c0.a0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: x.a */
/* loaded from: classes.dex */
public abstract class AbstractC8231a {

    /* renamed from: a */
    public static final HashMap f39370a;

    /* renamed from: b */
    public static final HashMap f39371b;

    static {
        a0 a0Var;
        HashMap map = new HashMap();
        f39370a = map;
        HashMap map2 = new HashMap();
        f39371b = map2;
        a0 a0Var2 = a0.f5035d;
        map.put(1L, a0Var2);
        map2.put(a0Var2, Collections.singletonList(1L));
        map.put(2L, a0.f5036e);
        map2.put((a0) map.get(2L), Collections.singletonList(2L));
        a0 a0Var3 = a0.f5037f;
        map.put(4L, a0Var3);
        map2.put(a0Var3, Collections.singletonList(4L));
        a0 a0Var4 = a0.f5038g;
        map.put(8L, a0Var4);
        map2.put(a0Var4, Collections.singletonList(8L));
        List listAsList = Arrays.asList(64L, 128L, 16L, 32L);
        Iterator it = listAsList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            a0Var = a0.f5039h;
            if (!zHasNext) {
                break;
            }
            f39370a.put((Long) it.next(), a0Var);
        }
        f39371b.put(a0Var, listAsList);
        List listAsList2 = Arrays.asList(1024L, 2048L, 256L, 512L);
        Iterator it2 = listAsList2.iterator();
        while (true) {
            boolean zHasNext2 = it2.hasNext();
            a0 a0Var5 = a0.f5040i;
            if (!zHasNext2) {
                f39371b.put(a0Var5, listAsList2);
                return;
            } else {
                f39370a.put((Long) it2.next(), a0Var5);
            }
        }
    }

    /* renamed from: a */
    public static Long m15404a(a0 a0Var, DynamicRangeProfiles dynamicRangeProfiles) {
        List<Long> list = (List) f39371b.get(a0Var);
        if (list == null) {
            return null;
        }
        Set<Long> supportedProfiles = dynamicRangeProfiles.getSupportedProfiles();
        for (Long l9 : list) {
            if (supportedProfiles.contains(l9)) {
                return l9;
            }
        }
        return null;
    }
}
