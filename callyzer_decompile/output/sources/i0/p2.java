package i0;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4154l;
import qw.C6361k;
import rw.AbstractC6664n;
import rw.AbstractC6674x;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class p2 {

    /* renamed from: e */
    public static final j2 f16554e = j2.DEFAULT;

    /* renamed from: f */
    public static final l2[] f16555f = {l2.S720P_16_9, l2.S1080P_4_3, l2.S1080P_16_9, l2.S1440P_16_9, l2.UHD, l2.X_VGA};

    /* renamed from: g */
    public static final Object f16556g;

    /* renamed from: h */
    public static final LinkedHashMap f16557h;

    /* renamed from: a */
    public final n2 f16558a;

    /* renamed from: b */
    public final l2 f16559b;

    /* renamed from: c */
    public final j2 f16560c;

    /* renamed from: d */
    public final int f16561d;

    static {
        Map mapM12778f = AbstractC6674x.m12778f(new C6361k(n2.YUV, 35), new C6361k(n2.JPEG, 256), new C6361k(n2.JPEG_R, 4101), new C6361k(n2.RAW, 32), new C6361k(n2.PRIV, 34));
        f16556g = mapM12778f;
        Set<Map.Entry> setEntrySet = mapM12778f.entrySet();
        int iM12776d = AbstractC6674x.m12776d(AbstractC6664n.m12768r(setEntrySet, 10));
        if (iM12776d < 16) {
            iM12776d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM12776d);
        for (Map.Entry entry : setEntrySet) {
            linkedHashMap.put(Integer.valueOf(((Number) entry.getValue()).intValue()), (n2) entry.getKey());
        }
        f16557h = linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    public p2(n2 configType, l2 configSize, j2 streamUseCase) {
        AbstractC4154l.m8923f(configType, "configType");
        AbstractC4154l.m8923f(configSize, "configSize");
        AbstractC4154l.m8923f(streamUseCase, "streamUseCase");
        this.f16558a = configType;
        this.f16559b = configSize;
        this.f16560c = streamUseCase;
        Integer num = (Integer) f16556g.get(configType);
        this.f16561d = num != null ? num.intValue() : 0;
    }

    /* renamed from: a */
    public static final p2 m7409a(n2 type, l2 size) {
        AbstractC4154l.m8923f(type, "type");
        AbstractC4154l.m8923f(size, "size");
        return pg.a0.m11530a(type, size, f16554e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2)) {
            return false;
        }
        p2 p2Var = (p2) obj;
        return this.f16558a == p2Var.f16558a && this.f16559b == p2Var.f16559b && this.f16560c == p2Var.f16560c;
    }

    public final int hashCode() {
        return this.f16560c.hashCode() + ((this.f16559b.hashCode() + (this.f16558a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SurfaceConfig(configType=" + this.f16558a + ", configSize=" + this.f16559b + ", streamUseCase=" + this.f16560c + ')';
    }
}
