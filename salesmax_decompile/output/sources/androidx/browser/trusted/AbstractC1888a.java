package androidx.browser.trusted;

import android.app.Notification;
import android.os.Bundle;
import android.os.Parcelable;

/* renamed from: androidx.browser.trusted.a */
/* loaded from: classes2.dex */
public abstract class AbstractC1888a {

    /* renamed from: androidx.browser.trusted.a$a */
    public static class a {

        /* renamed from: a */
        public final Parcelable[] f6048a;

        public a(Parcelable[] parcelableArr) {
            this.f6048a = parcelableArr;
        }

        /* renamed from: a */
        public Bundle m4511a() {
            Bundle bundle = new Bundle();
            bundle.putParcelableArray("android.support.customtabs.trusted.ACTIVE_NOTIFICATIONS", this.f6048a);
            return bundle;
        }
    }

    /* renamed from: androidx.browser.trusted.a$b */
    public static class b {

        /* renamed from: a */
        public final String f6049a;

        /* renamed from: b */
        public final int f6050b;

        public b(String str, int i) {
            this.f6049a = str;
            this.f6050b = i;
        }

        /* renamed from: a */
        public static b m4512a(Bundle bundle) {
            AbstractC1888a.m4510a(bundle, "android.support.customtabs.trusted.PLATFORM_TAG");
            AbstractC1888a.m4510a(bundle, "android.support.customtabs.trusted.PLATFORM_ID");
            return new b(bundle.getString("android.support.customtabs.trusted.PLATFORM_TAG"), bundle.getInt("android.support.customtabs.trusted.PLATFORM_ID"));
        }
    }

    /* renamed from: androidx.browser.trusted.a$c */
    public static class c {

        /* renamed from: a */
        public final String f6051a;

        public c(String str) {
            this.f6051a = str;
        }

        /* renamed from: a */
        public static c m4513a(Bundle bundle) {
            AbstractC1888a.m4510a(bundle, "android.support.customtabs.trusted.CHANNEL_NAME");
            return new c(bundle.getString("android.support.customtabs.trusted.CHANNEL_NAME"));
        }
    }

    /* renamed from: androidx.browser.trusted.a$d */
    public static class d {

        /* renamed from: a */
        public final String f6052a;

        /* renamed from: b */
        public final int f6053b;

        /* renamed from: c */
        public final Notification f6054c;

        /* renamed from: d */
        public final String f6055d;

        public d(String str, int i, Notification notification, String str2) {
            this.f6052a = str;
            this.f6053b = i;
            this.f6054c = notification;
            this.f6055d = str2;
        }

        /* renamed from: a */
        public static d m4514a(Bundle bundle) {
            AbstractC1888a.m4510a(bundle, "android.support.customtabs.trusted.PLATFORM_TAG");
            AbstractC1888a.m4510a(bundle, "android.support.customtabs.trusted.PLATFORM_ID");
            AbstractC1888a.m4510a(bundle, "android.support.customtabs.trusted.NOTIFICATION");
            AbstractC1888a.m4510a(bundle, "android.support.customtabs.trusted.CHANNEL_NAME");
            return new d(bundle.getString("android.support.customtabs.trusted.PLATFORM_TAG"), bundle.getInt("android.support.customtabs.trusted.PLATFORM_ID"), (Notification) bundle.getParcelable("android.support.customtabs.trusted.NOTIFICATION"), bundle.getString("android.support.customtabs.trusted.CHANNEL_NAME"));
        }
    }

    /* renamed from: androidx.browser.trusted.a$e */
    public static class e {

        /* renamed from: a */
        public final boolean f6056a;

        public e(boolean z) {
            this.f6056a = z;
        }

        /* renamed from: a */
        public Bundle m4515a() {
            Bundle bundle = new Bundle();
            bundle.putBoolean("android.support.customtabs.trusted.NOTIFICATION_SUCCESS", this.f6056a);
            return bundle;
        }
    }

    /* renamed from: a */
    public static void m4510a(Bundle bundle, String str) {
        if (bundle.containsKey(str)) {
            return;
        }
        throw new IllegalArgumentException("Bundle must contain " + str);
    }
}
