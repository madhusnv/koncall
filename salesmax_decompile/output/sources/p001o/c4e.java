package p001o;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class c4e {

    /* renamed from: a */
    public Map f17272a;

    /* renamed from: a */
    public d4e m20197a(int[] iArr, int i) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i2 : iArr) {
            Integer num = (Integer) linkedHashMap.get(Integer.valueOf(i2));
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            linkedHashMap.put(Integer.valueOf(i2), Integer.valueOf(iIntValue));
        }
        this.f17272a = linkedHashMap;
        return new d4e(linkedHashMap);
    }
}
