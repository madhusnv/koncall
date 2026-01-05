package pg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import rw.AbstractC6663m;
import rw.C6668r;
import rw.C6669s;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class h9 {
    /* renamed from: a */
    public static final int m11687a(int i10, int i11, int i12) {
        if (i12 > 0) {
            if (i10 < i11) {
                int i13 = i11 % i12;
                if (i13 < 0) {
                    i13 += i12;
                }
                int i14 = i10 % i12;
                if (i14 < 0) {
                    i14 += i12;
                }
                int i15 = (i13 - i14) % i12;
                if (i15 < 0) {
                    i15 += i12;
                }
                return i11 - i15;
            }
        } else {
            if (i12 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i10 > i11) {
                int i16 = -i12;
                int i17 = i10 % i16;
                if (i17 < 0) {
                    i17 += i16;
                }
                int i18 = i11 % i16;
                if (i18 < 0) {
                    i18 += i16;
                }
                int i19 = (i17 - i18) % i16;
                if (i19 < 0) {
                    i19 += i16;
                }
                return i19 + i11;
            }
        }
        return i11;
    }

    /* renamed from: b */
    public static final List m11688b(ArrayList arrayList) {
        int size = arrayList.size();
        return size != 0 ? size != 1 ? Collections.unmodifiableList(new ArrayList(arrayList)) : Collections.singletonList(AbstractC6663m.m12742F(arrayList)) : C6668r.f31943a;
    }

    /* renamed from: c */
    public static final Map m11689c(Map map) {
        int size = map.size();
        if (size == 0) {
            return C6669s.f31944a;
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) AbstractC6663m.m12741E(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }
}
