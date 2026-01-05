package com.amplifyframework.auth.cognito.asf;

import android.content.Context;
import android.util.DisplayMetrics;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import qw.C6361k;
import rw.AbstractC6674x;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class DeviceDataCollector implements DataCollector {
    public static final Companion Companion = new Companion(null);
    public static final String DEVICE_AGENT = "DeviceId";
    public static final String DEVICE_HEIGHT = "ScreenHeightPixels";
    public static final String DEVICE_LANGUAGE = "DeviceLanguage";
    public static final String DEVICE_WIDTH = "ScreenWidthPixels";
    public static final String PLATFORM_KEY = "Platform";
    private static final String PLATFORM_VALUE = "ANDROID";
    public static final String THIRD_PARTY_DEVICE_AGENT = "ThirdPartyDeviceId";
    public static final String TIMEZONE = "ClientTimezone";
    private final String deviceId;
    private final String language;
    private final String thirdPartyDeviceAgent;
    private final TimeZone timezone;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }

        private Companion() {
        }
    }

    public DeviceDataCollector(String deviceId) {
        AbstractC4154l.m8923f(deviceId, "deviceId");
        this.deviceId = deviceId;
        this.thirdPartyDeviceAgent = "android_id";
        String string = Locale.getDefault().toString();
        AbstractC4154l.m8922e(string, "toString(...)");
        this.language = string;
        TimeZone timeZone = TimeZone.getDefault();
        AbstractC4154l.m8922e(timeZone, "getDefault(...)");
        this.timezone = timeZone;
    }

    private final String getTimezoneOffset() {
        long rawOffset = this.timezone.getRawOffset();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long hours = timeUnit.toHours(rawOffset);
        return (hours < 0 ? "-" : "").concat(String.format(Locale.US, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(Math.abs(hours)), Long.valueOf(timeUnit.toMinutes(rawOffset) - TimeUnit.HOURS.toMinutes(hours))}, 2)));
    }

    @Override // com.amplifyframework.auth.cognito.asf.DataCollector
    public Map<String, String> collect(Context context) {
        AbstractC4154l.m8923f(context, "context");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return AbstractC6674x.m12778f(new C6361k(TIMEZONE, getTimezoneOffset()), new C6361k(PLATFORM_KEY, PLATFORM_VALUE), new C6361k(THIRD_PARTY_DEVICE_AGENT, this.thirdPartyDeviceAgent), new C6361k(DEVICE_AGENT, this.deviceId), new C6361k(DEVICE_LANGUAGE, this.language), new C6361k(DEVICE_HEIGHT, String.valueOf(displayMetrics.heightPixels)), new C6361k(DEVICE_WIDTH, String.valueOf(displayMetrics.widthPixels)));
    }
}
