package qt;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qt.m */
/* loaded from: classes3.dex */
public final class EnumC6318m {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC6318m[] $VALUES;
    public static final C6317l Companion;
    private final String token;
    public static final EnumC6318m CLIENT_NAME = new EnumC6318m("CLIENT_NAME", 0, "[{client_name}]");
    public static final EnumC6318m CLIENT_NUMBER = new EnumC6318m("CLIENT_NUMBER", 1, "[{client_number}]");
    public static final EnumC6318m EMP_NAME = new EnumC6318m("EMP_NAME", 2, "[{emp_name}]");
    public static final EnumC6318m EMP_NUMBER = new EnumC6318m("EMP_NUMBER", 3, "[{emp_number}]");
    public static final EnumC6318m TODAY_DATE = new EnumC6318m("TODAY_DATE", 4, "[{today_date}]");
    public static final EnumC6318m TODAY_DAY = new EnumC6318m("TODAY_DAY", 5, "[{today_day}]");
    public static final EnumC6318m TOMORROW_DATE = new EnumC6318m("TOMORROW_DATE", 6, "[{tomorrow_date}]");
    public static final EnumC6318m TOMORROW_DAY = new EnumC6318m("TOMORROW_DAY", 7, "[{tomorrow_day}]");
    public static final EnumC6318m YESTERDAY_DATE = new EnumC6318m("YESTERDAY_DATE", 8, "[{yesterday_date}]");
    public static final EnumC6318m YESTERDAY_DAY = new EnumC6318m("YESTERDAY_DAY", 9, "[{yesterday_day}]");
    public static final EnumC6318m CALL_TYPE = new EnumC6318m("CALL_TYPE", 10, "[{call_type}]");
    public static final EnumC6318m CALL_DATETIME = new EnumC6318m("CALL_DATETIME", 11, "[{call_datetime}]");
    public static final EnumC6318m CALL_DATE = new EnumC6318m("CALL_DATE", 12, "[{call_date}]");
    public static final EnumC6318m CALL_TIME = new EnumC6318m("CALL_TIME", 13, "[{call_time}]");
    public static final EnumC6318m CALL_DURATION = new EnumC6318m("CALL_DURATION", 14, "[{call_duration}]");
    public static final EnumC6318m CALL_RECORDING_URL = new EnumC6318m("CALL_RECORDING_URL", 15, "[{call_recording_url}]");

    private static final /* synthetic */ EnumC6318m[] $values() {
        return new EnumC6318m[]{CLIENT_NAME, CLIENT_NUMBER, EMP_NAME, EMP_NUMBER, TODAY_DATE, TODAY_DAY, TOMORROW_DATE, TOMORROW_DAY, YESTERDAY_DATE, YESTERDAY_DAY, CALL_TYPE, CALL_DATETIME, CALL_DATE, CALL_TIME, CALL_DURATION, CALL_RECORDING_URL};
    }

    static {
        EnumC6318m[] enumC6318mArr$values = $values();
        $VALUES = enumC6318mArr$values;
        $ENTRIES = b8.m11548b(enumC6318mArr$values);
        Companion = new C6317l();
    }

    private EnumC6318m(String str, int i10, String str2) {
        this.token = str2;
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC6318m valueOf(String str) {
        return (EnumC6318m) Enum.valueOf(EnumC6318m.class, str);
    }

    public static EnumC6318m[] values() {
        return (EnumC6318m[]) $VALUES.clone();
    }

    public final String getToken() {
        return this.token;
    }
}
