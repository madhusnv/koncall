package fk;

import a2.AbstractC0030c;
import android.os.Build;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fk.b */
/* loaded from: classes.dex */
public final class C2296b {

    /* renamed from: a */
    public final String f10339a;

    /* renamed from: b */
    public final a0 f10340b;

    /* renamed from: c */
    public final C2295a f10341c;

    public C2296b(String appId, a0 logEnvironment, C2295a c2295a) {
        String deviceModel = Build.MODEL;
        String osVersion = Build.VERSION.RELEASE;
        AbstractC4154l.m8923f(appId, "appId");
        AbstractC4154l.m8923f(deviceModel, "deviceModel");
        AbstractC4154l.m8923f(osVersion, "osVersion");
        AbstractC4154l.m8923f(logEnvironment, "logEnvironment");
        this.f10339a = appId;
        this.f10340b = logEnvironment;
        this.f10341c = c2295a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2296b)) {
            return false;
        }
        C2296b c2296b = (C2296b) obj;
        if (!AbstractC4154l.m8918a(this.f10339a, c2296b.f10339a)) {
            return false;
        }
        String str = Build.MODEL;
        if (!AbstractC4154l.m8918a(str, str)) {
            return false;
        }
        String str2 = Build.VERSION.RELEASE;
        return AbstractC4154l.m8918a(str2, str2) && this.f10340b == c2296b.f10340b && this.f10341c.equals(c2296b.f10341c);
    }

    public final int hashCode() {
        return this.f10341c.hashCode() + ((this.f10340b.hashCode() + AbstractC0030c.m113d((((Build.MODEL.hashCode() + (this.f10339a.hashCode() * 31)) * 31) + 48517559) * 31, 31, Build.VERSION.RELEASE)) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.f10339a + ", deviceModel=" + Build.MODEL + ", sessionSdkVersion=3.0.0, osVersion=" + Build.VERSION.RELEASE + ", logEnvironment=" + this.f10340b + ", androidAppInfo=" + this.f10341c + ')';
    }
}
