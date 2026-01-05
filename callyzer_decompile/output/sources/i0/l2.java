package i0;

import android.util.Size;
import kotlin.jvm.internal.AbstractC4148f;
import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class l2 {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ l2[] $VALUES;
    public static final l2 PREVIEW;
    public static final l2 RECORD;

    /* renamed from: id, reason: collision with root package name */
    private final int f44342id;
    private final Size relatedFixedSize;
    public static final l2 VGA = new l2("VGA", 0, 0, new Size(640, 480));
    public static final l2 X_VGA = new l2("X_VGA", 1, 1, new Size(1024, 768));
    public static final l2 S720P_16_9 = new l2("S720P_16_9", 2, 2, new Size(1280, 720));
    public static final l2 S1080P_4_3 = new l2("S1080P_4_3", 4, 4, new Size(1440, 1080));
    public static final l2 S1080P_16_9 = new l2("S1080P_16_9", 5, 5, new Size(1920, 1080));
    public static final l2 S1440P_4_3 = new l2("S1440P_4_3", 6, 6, new Size(1920, 1440));
    public static final l2 S1440P_16_9 = new l2("S1440P_16_9", 7, 7, new Size(2560, 1440));
    public static final l2 UHD = new l2("UHD", 8, 8, new Size(3840, 2160));
    public static final l2 MAXIMUM = new l2("MAXIMUM", 10, 10, null, 2, null);
    public static final l2 MAXIMUM_4_3 = new l2("MAXIMUM_4_3", 11, 11, null, 2, null);
    public static final l2 MAXIMUM_16_9 = new l2("MAXIMUM_16_9", 12, 12, null, 2, null);
    public static final l2 ULTRA_MAXIMUM = new l2("ULTRA_MAXIMUM", 13, 13, null, 2, null);
    public static final l2 NOT_SUPPORT = new l2("NOT_SUPPORT", 14, 14, null, 2, null);

    private static final /* synthetic */ l2[] $values() {
        return new l2[]{VGA, X_VGA, S720P_16_9, PREVIEW, S1080P_4_3, S1080P_16_9, S1440P_4_3, S1440P_16_9, UHD, RECORD, MAXIMUM, MAXIMUM_4_3, MAXIMUM_16_9, ULTRA_MAXIMUM, NOT_SUPPORT};
    }

    static {
        int i10 = 2;
        AbstractC4148f abstractC4148f = null;
        Size size = null;
        PREVIEW = new l2("PREVIEW", 3, 3, size, i10, abstractC4148f);
        RECORD = new l2("RECORD", 9, 9, size, i10, abstractC4148f);
        l2[] l2VarArr$values = $values();
        $VALUES = l2VarArr$values;
        $ENTRIES = b8.m11548b(l2VarArr$values);
    }

    private l2(String str, int i10, int i11, Size size) {
        this.f44342id = i11;
        this.relatedFixedSize = size;
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static l2 valueOf(String str) {
        return (l2) Enum.valueOf(l2.class, str);
    }

    public static l2[] values() {
        return (l2[]) $VALUES.clone();
    }

    public final int getId() {
        return this.f44342id;
    }

    public final Size getRelatedFixedSize() {
        return this.relatedFixedSize;
    }

    public /* synthetic */ l2(String str, int i10, int i11, Size size, int i12, AbstractC4148f abstractC4148f) {
        this(str, i10, i11, (i12 & 2) != 0 ? null : size);
    }
}
