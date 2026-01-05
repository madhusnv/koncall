package p001o;

import android.util.ArrayMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class eqb extends wig {
    public eqb(Map map) {
        super(map);
    }

    /* renamed from: g */
    public static eqb m25439g() {
        return new eqb(new ArrayMap());
    }

    /* renamed from: h */
    public static eqb m25440h(wig wigVar) {
        ArrayMap arrayMap = new ArrayMap();
        for (String str : wigVar.m54618e()) {
            arrayMap.put(str, wigVar.m54617d(str));
        }
        return new eqb(arrayMap);
    }

    /* renamed from: f */
    public void m25441f(wig wigVar) {
        Map map;
        Map map2 = this.f52218a;
        if (map2 == null || (map = wigVar.f52218a) == null) {
            return;
        }
        map2.putAll(map);
    }

    /* renamed from: i */
    public void m25442i(String str, Object obj) {
        this.f52218a.put(str, obj);
    }
}
