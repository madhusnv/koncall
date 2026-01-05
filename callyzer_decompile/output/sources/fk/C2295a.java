package fk;

import a2.AbstractC0030c;
import android.os.Build;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fk.a */
/* loaded from: classes.dex */
public final class C2295a {

    /* renamed from: a */
    public final String f10333a;

    /* renamed from: b */
    public final String f10334b;

    /* renamed from: c */
    public final String f10335c;

    /* renamed from: d */
    public final g0 f10336d;

    /* renamed from: e */
    public final ArrayList f10337e;

    public C2295a(String str, String versionName, String appBuildVersion, g0 g0Var, ArrayList arrayList) {
        String deviceManufacturer = Build.MANUFACTURER;
        AbstractC4154l.m8923f(versionName, "versionName");
        AbstractC4154l.m8923f(appBuildVersion, "appBuildVersion");
        AbstractC4154l.m8923f(deviceManufacturer, "deviceManufacturer");
        this.f10333a = str;
        this.f10334b = versionName;
        this.f10335c = appBuildVersion;
        this.f10336d = g0Var;
        this.f10337e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2295a)) {
            return false;
        }
        C2295a c2295a = (C2295a) obj;
        if (!this.f10333a.equals(c2295a.f10333a) || !AbstractC4154l.m8918a(this.f10334b, c2295a.f10334b) || !AbstractC4154l.m8918a(this.f10335c, c2295a.f10335c)) {
            return false;
        }
        String str = Build.MANUFACTURER;
        return AbstractC4154l.m8918a(str, str) && this.f10336d.equals(c2295a.f10336d) && this.f10337e.equals(c2295a.f10337e);
    }

    public final int hashCode() {
        return this.f10337e.hashCode() + ((this.f10336d.hashCode() + AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC0030c.m113d(this.f10333a.hashCode() * 31, 31, this.f10334b), 31, this.f10335c), 31, Build.MANUFACTURER)) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f10333a + ", versionName=" + this.f10334b + ", appBuildVersion=" + this.f10335c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.f10336d + ", appProcessDetails=" + this.f10337e + ')';
    }
}
