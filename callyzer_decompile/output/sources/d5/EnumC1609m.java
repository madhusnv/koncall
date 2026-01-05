package d5;

import java.util.HashMap;
import java.util.Map;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 d5.m, still in use, count: 1, list:
  (r0v0 d5.m) from 0x0036: INVOKE 
  (wrap:java.util.Map<java.lang.String, d5.m>:0x0032: SGET  A[WRAPPED] (LINE:51) d5.m.wrapMap java.util.Map)
  ("none")
  (r0v0 d5.m)
 INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(K, V):V (c)] (LINE:55)
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
/* renamed from: d5.m */
/* loaded from: classes.dex */
public final class EnumC1609m {
    NONE,
    CHAIN,
    ALIGNED;

    public static Map<String, EnumC1609m> wrapMap = new HashMap();
    public static Map<String, Integer> valueMap = new HashMap();

    static {
        wrapMap.put("none", new EnumC1609m());
        wrapMap.put("chain", new EnumC1609m());
        wrapMap.put("aligned", new EnumC1609m());
        valueMap.put("none", 0);
        valueMap.put("chain", 3);
        valueMap.put("aligned", 2);
    }

    private EnumC1609m() {
    }

    public static EnumC1609m getChainByString(String str) {
        if (wrapMap.containsKey(str)) {
            return wrapMap.get(str);
        }
        return null;
    }

    public static int getValueByString(String str) {
        if (valueMap.containsKey(str)) {
            return valueMap.get(str).intValue();
        }
        return -1;
    }

    public static EnumC1609m valueOf(String str) {
        return (EnumC1609m) Enum.valueOf(EnumC1609m.class, str);
    }

    public static EnumC1609m[] values() {
        return (EnumC1609m[]) $VALUES.clone();
    }
}
