package yv;

import com.websoptimization.callyzerbiz.R;
import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yv.l */
/* loaded from: classes3.dex */
public final class EnumC8797l {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC8797l[] $VALUES;
    public static final C8796k Companion;
    private final int notPopupOption;
    private final int notePopUpName;
    public static final EnumC8797l OPTION_ALWAYS = new EnumC8797l("OPTION_ALWAYS", 0, R.string.always, 114);
    public static final EnumC8797l OPTION_NEVER = new EnumC8797l("OPTION_NEVER", 1, R.string.never, 115);
    public static final EnumC8797l OPTION_FOR_LEADS = new EnumC8797l("OPTION_FOR_LEADS", 2, R.string.only_for_leads, 116);

    private static final /* synthetic */ EnumC8797l[] $values() {
        return new EnumC8797l[]{OPTION_ALWAYS, OPTION_NEVER, OPTION_FOR_LEADS};
    }

    static {
        EnumC8797l[] enumC8797lArr$values = $values();
        $VALUES = enumC8797lArr$values;
        $ENTRIES = b8.m11548b(enumC8797lArr$values);
        Companion = new C8796k();
    }

    private EnumC8797l(String str, int i10, int i11, int i12) {
        this.notePopUpName = i11;
        this.notPopupOption = i12;
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC8797l valueOf(String str) {
        return (EnumC8797l) Enum.valueOf(EnumC8797l.class, str);
    }

    public static EnumC8797l[] values() {
        return (EnumC8797l[]) $VALUES.clone();
    }

    public final int getNotPopupOption() {
        return this.notPopupOption;
    }

    public final int getNotePopUpName() {
        return this.notePopUpName;
    }
}
