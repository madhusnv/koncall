package ra;

import ec.C2003a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;
import rw.AbstractC6663m;
import rw.AbstractC6674x;
import rw.C6668r;
import rw.C6669s;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ra.a */
/* loaded from: classes.dex */
public final class C6487a {

    /* renamed from: c */
    public static final C2003a f31162c = new C2003a("CustomUserAgentMetadata");

    /* renamed from: a */
    public final LinkedHashMap f31163a;

    /* renamed from: b */
    public final ArrayList f31164b;

    public C6487a(Map extras, List list) {
        AbstractC4154l.m8923f(extras, "extras");
        this.f31163a = AbstractC6674x.m12786n(extras);
        this.f31164b = AbstractC6663m.d0(list);
    }

    /* renamed from: a */
    public final void m12496a(String key, String value) {
        AbstractC4154l.m8923f(key, "key");
        AbstractC4154l.m8923f(value, "value");
        this.f31163a.put(key, value);
    }

    public /* synthetic */ C6487a(LinkedHashMap linkedHashMap, int i10) {
        this((i10 & 1) != 0 ? C6669s.f31944a : linkedHashMap, C6668r.f31943a);
    }
}
