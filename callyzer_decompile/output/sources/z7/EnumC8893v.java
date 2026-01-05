package z7;

import android.app.ActivityManager;
import android.content.Context;
import kotlin.jvm.internal.AbstractC4154l;
import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: z7.v */
/* loaded from: classes.dex */
public final class EnumC8893v {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC8893v[] $VALUES;
    public static final EnumC8893v AUTOMATIC = new EnumC8893v("AUTOMATIC", 0);
    public static final EnumC8893v TRUNCATE = new EnumC8893v("TRUNCATE", 1);
    public static final EnumC8893v WRITE_AHEAD_LOGGING = new EnumC8893v("WRITE_AHEAD_LOGGING", 2);

    private static final /* synthetic */ EnumC8893v[] $values() {
        return new EnumC8893v[]{AUTOMATIC, TRUNCATE, WRITE_AHEAD_LOGGING};
    }

    static {
        EnumC8893v[] enumC8893vArr$values = $values();
        $VALUES = enumC8893vArr$values;
        $ENTRIES = b8.m11548b(enumC8893vArr$values);
    }

    private EnumC8893v(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC8893v valueOf(String str) {
        return (EnumC8893v) Enum.valueOf(EnumC8893v.class, str);
    }

    public static EnumC8893v[] values() {
        return (EnumC8893v[]) $VALUES.clone();
    }

    public final EnumC8893v resolve$room_runtime_release(Context context) {
        AbstractC4154l.m8923f(context, "context");
        if (this != AUTOMATIC) {
            return this;
        }
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        return (activityManager == null || activityManager.isLowRamDevice()) ? TRUNCATE : WRITE_AHEAD_LOGGING;
    }
}
