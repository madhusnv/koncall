package jd;

import java.util.LinkedHashMap;
import java.util.Map;
import nx.C5176n;
import qw.C6361k;
import rw.AbstractC6674x;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jd.f */
/* loaded from: classes.dex */
public abstract class AbstractC3756f {

    /* renamed from: a */
    public static final C5176n f19621a = new C5176n("#([0-9]+)");

    /* renamed from: b */
    public static final C5176n f19622b = new C5176n("#x([0-9a-fA-F]+)");

    /* renamed from: c */
    public static final LinkedHashMap f19623c;

    static {
        Map mapM12778f = AbstractC6674x.m12778f(new C6361k("lt", '<'), new C6361k("gt", '>'), new C6361k("amp", '&'), new C6361k("apos", '\''), new C6361k("quot", '\"'));
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC6674x.m12776d(mapM12778f.size()));
        for (Map.Entry entry : mapM12778f.entrySet()) {
            linkedHashMap.put(entry.getKey(), new char[]{((Character) entry.getValue()).charValue()});
        }
        f19623c = linkedHashMap;
    }
}
