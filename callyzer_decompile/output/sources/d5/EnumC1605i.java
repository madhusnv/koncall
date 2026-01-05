package d5;

import java.util.HashMap;
import java.util.Map;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 d5.i, still in use, count: 1, list:
  (r0v0 d5.i) from 0x0044: INVOKE 
  (wrap:java.util.Map<java.lang.String, d5.i>:0x0040: SGET  A[WRAPPED] (LINE:65) d5.i.chainMap java.util.Map)
  ("spread")
  (r0v0 d5.i)
 INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(K, V):V (c)] (LINE:69)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: d5.i */
/* loaded from: classes.dex */
public final class EnumC1605i {
    SPREAD,
    SPREAD_INSIDE,
    PACKED;

    public static Map<String, EnumC1605i> chainMap = new HashMap();
    public static Map<String, Integer> valueMap = new HashMap();

    static {
        chainMap.put("packed", new EnumC1605i());
        chainMap.put("spread_inside", new EnumC1605i());
        chainMap.put("spread", new EnumC1605i());
        valueMap.put("packed", 2);
        valueMap.put("spread_inside", 1);
        valueMap.put("spread", 0);
    }

    private EnumC1605i() {
    }

    public static EnumC1605i getChainByString(String str) {
        if (chainMap.containsKey(str)) {
            return chainMap.get(str);
        }
        return null;
    }

    public static int getValueByString(String str) {
        if (valueMap.containsKey(str)) {
            return valueMap.get(str).intValue();
        }
        return -1;
    }

    public static EnumC1605i valueOf(String str) {
        return (EnumC1605i) Enum.valueOf(EnumC1605i.class, str);
    }

    public static EnumC1605i[] values() {
        return (EnumC1605i[]) $VALUES.clone();
    }
}
