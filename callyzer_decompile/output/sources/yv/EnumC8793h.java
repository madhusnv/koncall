package yv;

import com.websoptimization.callyzerbiz.R;
import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yv.h */
/* loaded from: classes3.dex */
public final class EnumC8793h {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC8793h[] $VALUES;
    public static final C8792g Companion;
    private final int optionValue;
    private final int screenName;
    public static final EnumC8793h DEFAULT_CALL_HISTORY = new EnumC8793h("DEFAULT_CALL_HISTORY", 0, R.string.call_history, 111);
    public static final EnumC8793h DEFAULT_ANALYTICS = new EnumC8793h("DEFAULT_ANALYTICS", 1, R.string.analytics, 112);
    public static final EnumC8793h DEFAULT_LEAD = new EnumC8793h("DEFAULT_LEAD", 2, R.string.my_lead, 113);

    private static final /* synthetic */ EnumC8793h[] $values() {
        return new EnumC8793h[]{DEFAULT_CALL_HISTORY, DEFAULT_ANALYTICS, DEFAULT_LEAD};
    }

    static {
        EnumC8793h[] enumC8793hArr$values = $values();
        $VALUES = enumC8793hArr$values;
        $ENTRIES = b8.m11548b(enumC8793hArr$values);
        Companion = new C8792g();
    }

    private EnumC8793h(String str, int i10, int i11, int i12) {
        this.screenName = i11;
        this.optionValue = i12;
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC8793h valueOf(String str) {
        return (EnumC8793h) Enum.valueOf(EnumC8793h.class, str);
    }

    public static EnumC8793h[] values() {
        return (EnumC8793h[]) $VALUES.clone();
    }

    public final int getOptionValue() {
        return this.optionValue;
    }

    public final int getScreenName() {
        return this.screenName;
    }
}
