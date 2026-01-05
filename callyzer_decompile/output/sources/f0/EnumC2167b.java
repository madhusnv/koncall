package f0;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: f0.b */
/* loaded from: classes.dex */
public final class EnumC2167b {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC2167b[] $VALUES;
    public static final EnumC2167b DYNAMIC_RANGE = new EnumC2167b("DYNAMIC_RANGE", 0);
    public static final EnumC2167b FPS_RANGE = new EnumC2167b("FPS_RANGE", 1);
    public static final EnumC2167b VIDEO_STABILIZATION = new EnumC2167b("VIDEO_STABILIZATION", 2);
    public static final EnumC2167b IMAGE_FORMAT = new EnumC2167b("IMAGE_FORMAT", 3);

    private static final /* synthetic */ EnumC2167b[] $values() {
        return new EnumC2167b[]{DYNAMIC_RANGE, FPS_RANGE, VIDEO_STABILIZATION, IMAGE_FORMAT};
    }

    static {
        EnumC2167b[] enumC2167bArr$values = $values();
        $VALUES = enumC2167bArr$values;
        $ENTRIES = b8.m11548b(enumC2167bArr$values);
    }

    private EnumC2167b(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC2167b valueOf(String str) {
        return (EnumC2167b) Enum.valueOf(EnumC2167b.class, str);
    }

    public static EnumC2167b[] values() {
        return (EnumC2167b[]) $VALUES.clone();
    }
}
