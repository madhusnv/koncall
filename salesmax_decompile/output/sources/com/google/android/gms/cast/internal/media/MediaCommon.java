package com.google.android.gms.cast.internal.media;

import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* loaded from: classes5.dex */
public class MediaCommon {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    @KeepForSdk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Integer mediaRepeatModeFromString(String str) {
        char c;
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -1118317585:
                if (!str.equals("REPEAT_ALL_AND_SHUFFLE")) {
                    c = 65535;
                    break;
                } else {
                    c = 3;
                    break;
                }
            case -962896020:
                if (str.equals("REPEAT_SINGLE")) {
                    c = 2;
                    break;
                }
                break;
            case 1645938909:
                if (str.equals("REPEAT_ALL")) {
                    c = 1;
                    break;
                }
                break;
            case 1645952171:
                if (str.equals("REPEAT_OFF")) {
                    c = 0;
                    break;
                }
                break;
        }
        if (c == 0) {
            return 0;
        }
        if (c == 1) {
            return 1;
        }
        if (c != 2) {
            return c != 3 ? null : 3;
        }
        return 2;
    }

    public static String zza(Integer num) {
        if (num == null) {
            return null;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return "REPEAT_OFF";
        }
        if (iIntValue == 1) {
            return "REPEAT_ALL";
        }
        if (iIntValue == 2) {
            return "REPEAT_SINGLE";
        }
        if (iIntValue != 3) {
            return null;
        }
        return "REPEAT_ALL_AND_SHUFFLE";
    }
}
