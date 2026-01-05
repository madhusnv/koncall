package com.amplifyframework.auth.cognito.asf;

import android.content.Context;
import android.view.Display;
import android.view.WindowManager;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import p001o.h8g;
import p001o.id5;
import p001o.isa;
import p001o.sq8;
import p001o.vyh;

/* loaded from: classes5.dex */
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

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }
    }

    public DeviceDataCollector(String str) {
        sq8.m48649h(str, "deviceId");
        this.deviceId = str;
        this.thirdPartyDeviceAgent = "android_id";
        String string = Locale.getDefault().toString();
        sq8.m48648g(string, "toString(...)");
        this.language = string;
        TimeZone timeZone = TimeZone.getDefault();
        sq8.m48648g(timeZone, "getDefault(...)");
        this.timezone = timeZone;
    }

    private final Display getDisplay(Context context) {
        Object systemService = context.getSystemService("window");
        sq8.m48647f(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        sq8.m48648g(defaultDisplay, "getDefaultDisplay(...)");
        return defaultDisplay;
    }

    private final String getTimezoneOffset() {
        long rawOffset = this.timezone.getRawOffset();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long hours = timeUnit.toHours(rawOffset);
        long minutes = timeUnit.toMinutes(rawOffset) - TimeUnit.HOURS.toMinutes(hours);
        String str = hours < 0 ? "-" : "";
        h8g h8gVar = h8g.f26398a;
        String str2 = String.format(Locale.US, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(Math.abs(hours)), Long.valueOf(minutes)}, 2));
        sq8.m48648g(str2, "format(...)");
        return str + str2;
    }

    @Override // com.amplifyframework.auth.cognito.asf.DataCollector
    public Map<String, String> collect(Context context) {
        sq8.m48649h(context, "context");
        Display display = getDisplay(context);
        return isa.m32684k(vyh.m53620a(TIMEZONE, getTimezoneOffset()), vyh.m53620a(PLATFORM_KEY, PLATFORM_VALUE), vyh.m53620a(THIRD_PARTY_DEVICE_AGENT, this.thirdPartyDeviceAgent), vyh.m53620a(DEVICE_AGENT, this.deviceId), vyh.m53620a(DEVICE_LANGUAGE, this.language), vyh.m53620a(DEVICE_HEIGHT, String.valueOf(display.getHeight())), vyh.m53620a(DEVICE_WIDTH, String.valueOf(display.getWidth())));
    }
}
