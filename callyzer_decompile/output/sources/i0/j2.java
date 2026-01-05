package i0;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class j2 {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ j2[] $VALUES;
    private final long value;
    public static final j2 DEFAULT = new j2("DEFAULT", 0, 0);
    public static final j2 PREVIEW = new j2("PREVIEW", 1, 1);
    public static final j2 VIDEO_RECORD = new j2("VIDEO_RECORD", 2, 3);
    public static final j2 STILL_CAPTURE = new j2("STILL_CAPTURE", 3, 2);
    public static final j2 VIDEO_CALL = new j2("VIDEO_CALL", 4, 5);
    public static final j2 PREVIEW_VIDEO_STILL = new j2("PREVIEW_VIDEO_STILL", 5, 4);
    public static final j2 CROPPED_RAW = new j2("CROPPED_RAW", 6, 6);

    private static final /* synthetic */ j2[] $values() {
        return new j2[]{DEFAULT, PREVIEW, VIDEO_RECORD, STILL_CAPTURE, VIDEO_CALL, PREVIEW_VIDEO_STILL, CROPPED_RAW};
    }

    static {
        j2[] j2VarArr$values = $values();
        $VALUES = j2VarArr$values;
        $ENTRIES = b8.m11548b(j2VarArr$values);
    }

    private j2(String str, int i10, int i11) {
        this.value = i11;
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static j2 valueOf(String str) {
        return (j2) Enum.valueOf(j2.class, str);
    }

    public static j2[] values() {
        return (j2[]) $VALUES.clone();
    }

    public final long getValue() {
        return this.value;
    }
}
