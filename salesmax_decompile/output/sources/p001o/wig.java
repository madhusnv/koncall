package p001o;

import android.util.ArrayMap;
import android.util.Pair;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class wig {

    /* renamed from: b */
    public static final wig f52217b = new wig(new ArrayMap());

    /* renamed from: a */
    public final Map f52218a;

    public wig(Map map) {
        this.f52218a = map;
    }

    /* renamed from: a */
    public static wig m54614a(Pair pair) {
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put((String) pair.first, pair.second);
        return new wig(arrayMap);
    }

    /* renamed from: b */
    public static wig m54615b() {
        return f52217b;
    }

    /* renamed from: c */
    public static wig m54616c(wig wigVar) {
        ArrayMap arrayMap = new ArrayMap();
        for (String str : wigVar.m54618e()) {
            arrayMap.put(str, wigVar.m54617d(str));
        }
        return new wig(arrayMap);
    }

    /* renamed from: d */
    public Object m54617d(String str) {
        return this.f52218a.get(str);
    }

    /* renamed from: e */
    public Set m54618e() {
        return this.f52218a.keySet();
    }

    public final String toString() {
        return "android.hardware.camera2.CaptureRequest.setTag.CX";
    }
}
