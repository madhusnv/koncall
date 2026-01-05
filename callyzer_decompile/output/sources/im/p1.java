package im;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class p1 {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ p1[] $VALUES;
    public static final p1 SHOW_LEAD_SUBSCRIPTION_BELT = new p1("SHOW_LEAD_SUBSCRIPTION_BELT", 0);
    public static final p1 NOT_VERIFIED_CALL_COUNT = new p1("NOT_VERIFIED_CALL_COUNT", 1);
    public static final p1 NOTE_POPUP_CALL_DETAILS = new p1("NOTE_POPUP_CALL_DETAILS", 2);
    public static final p1 IS_LEAD_NUMBER_API_SUCCESS = new p1("IS_LEAD_NUMBER_API_SUCCESS", 3);
    public static final p1 IS_SHOW_RETRY_BUTTON = new p1("IS_SHOW_RETRY_BUTTON", 4);
    public static final p1 LEAD_NUMBERS_LIST = new p1("LEAD_NUMBERS_LIST", 5);
    public static final p1 LOG_FILE_UPLOAD_STATE = new p1("LOG_FILE_UPLOAD_STATE", 6);
    public static final p1 MESSAGE_TEMPLATE_CALL_LOG_DATA = new p1("MESSAGE_TEMPLATE_CALL_LOG_DATA", 7);
    public static final p1 READ_CONTACT_STATES = new p1("READ_CONTACT_STATES", 8);
    public static final p1 EXCLUDE_NUMBERS = new p1("EXCLUDE_NUMBERS", 9);
    public static final p1 STOP_CALL_MONITOR_SERVICE = new p1("STOP_CALL_MONITOR_SERVICE", 10);
    public static final p1 CALL_RECORDING_PATH_SUGGESTIONS = new p1("CALL_RECORDING_PATH_SUGGESTIONS", 11);
    public static final p1 MESSAGE_TEMPLATE_DATA_UPDATE = new p1("MESSAGE_TEMPLATE_DATA_UPDATE", 12);

    private static final /* synthetic */ p1[] $values() {
        return new p1[]{SHOW_LEAD_SUBSCRIPTION_BELT, NOT_VERIFIED_CALL_COUNT, NOTE_POPUP_CALL_DETAILS, IS_LEAD_NUMBER_API_SUCCESS, IS_SHOW_RETRY_BUTTON, LEAD_NUMBERS_LIST, LOG_FILE_UPLOAD_STATE, MESSAGE_TEMPLATE_CALL_LOG_DATA, READ_CONTACT_STATES, EXCLUDE_NUMBERS, STOP_CALL_MONITOR_SERVICE, CALL_RECORDING_PATH_SUGGESTIONS, MESSAGE_TEMPLATE_DATA_UPDATE};
    }

    static {
        p1[] p1VarArr$values = $values();
        $VALUES = p1VarArr$values;
        $ENTRIES = b8.m11548b(p1VarArr$values);
    }

    private p1(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static p1 valueOf(String str) {
        return (p1) Enum.valueOf(p1.class, str);
    }

    public static p1[] values() {
        return (p1[]) $VALUES.clone();
    }
}
