package wi;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 wi.f, still in use, count: 1, list:
  (r0v0 wi.f) from 0x0084: INVOKE (r5v5 java.util.HashMap), ("x86"), (r0v0 wi.f) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(K, V):V (c)] (LINE:133)
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
/* renamed from: wi.f */
/* loaded from: classes.dex */
public final class EnumC8056f {
    X86_32,
    X86_64,
    ARM_UNKNOWN,
    PPC,
    PPC64,
    ARMV6,
    ARMV7,
    UNKNOWN,
    ARMV7S,
    ARM64;

    private static final Map<String, EnumC8056f> matcher;

    static {
        HashMap map = new HashMap(4);
        matcher = map;
        map.put("armeabi-v7a", new EnumC8056f());
        map.put("armeabi", new EnumC8056f());
        map.put("arm64-v8a", new EnumC8056f());
        map.put("x86", new EnumC8056f());
    }

    private EnumC8056f() {
    }

    public static EnumC8056f getValue() {
        String str = Build.CPU_ABI;
        if (TextUtils.isEmpty(str)) {
            Log.isLoggable("FirebaseCrashlytics", 2);
            return UNKNOWN;
        }
        EnumC8056f enumC8056f = matcher.get(str.toLowerCase(Locale.US));
        return enumC8056f == null ? UNKNOWN : enumC8056f;
    }

    public static EnumC8056f valueOf(String str) {
        return (EnumC8056f) Enum.valueOf(EnumC8056f.class, str);
    }

    public static EnumC8056f[] values() {
        return (EnumC8056f[]) $VALUES.clone();
    }
}
