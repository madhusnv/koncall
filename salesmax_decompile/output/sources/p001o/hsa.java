package p001o;

import com.google.android.gms.common.api.Api;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class hsa extends gsa {
    /* renamed from: b */
    public static final Map m31052b(Map map) {
        sq8.m48649h(map, "builder");
        return ((bqa) map).m19591s();
    }

    /* renamed from: c */
    public static final Map m31053c() {
        return new bqa();
    }

    /* renamed from: d */
    public static final Map m31054d(int i) {
        return new bqa(i);
    }

    /* renamed from: e */
    public static final int m31055e(int i) {
        return i < 0 ? i : i < 3 ? i + 1 : i < 1073741824 ? (int) ((i / 0.75f) + 1.0f) : Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    /* renamed from: f */
    public static final Map m31056f(hwc hwcVar) {
        sq8.m48649h(hwcVar, "pair");
        Map mapSingletonMap = Collections.singletonMap(hwcVar.m31229c(), hwcVar.m31230d());
        sq8.m48648g(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    /* renamed from: g */
    public static final Map m31057g(Map map) {
        sq8.m48649h(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        sq8.m48648g(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }
}
