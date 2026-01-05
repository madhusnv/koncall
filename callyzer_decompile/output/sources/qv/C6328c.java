package qv;

import com.sun.mail.util.AbstractC1452a;
import com.websoptimization.callyzerbiz.data.model.response.AppSettings;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qv.c */
/* loaded from: classes3.dex */
public final class C6328c {

    /* renamed from: a */
    public final String f30685a;

    /* renamed from: b */
    public final AppSettings f30686b;

    /* renamed from: c */
    public final List f30687c;

    /* renamed from: d */
    public final List f30688d;

    public C6328c(String str, AppSettings appSettings, List addDeviceRequest, List simList) {
        AbstractC4154l.m8923f(addDeviceRequest, "addDeviceRequest");
        AbstractC4154l.m8923f(simList, "simList");
        this.f30685a = str;
        this.f30686b = appSettings;
        this.f30687c = addDeviceRequest;
        this.f30688d = simList;
    }

    /* renamed from: a */
    public static C6328c m12361a(C6328c c6328c, String str, AppSettings appSettings, List addDeviceRequest, List simList, int i10) {
        if ((i10 & 1) != 0) {
            str = c6328c.f30685a;
        }
        if ((i10 & 2) != 0) {
            appSettings = c6328c.f30686b;
        }
        if ((i10 & 4) != 0) {
            addDeviceRequest = c6328c.f30687c;
        }
        if ((i10 & 8) != 0) {
            simList = c6328c.f30688d;
        }
        c6328c.getClass();
        AbstractC4154l.m8923f(addDeviceRequest, "addDeviceRequest");
        AbstractC4154l.m8923f(simList, "simList");
        return new C6328c(str, appSettings, addDeviceRequest, simList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6328c)) {
            return false;
        }
        C6328c c6328c = (C6328c) obj;
        return AbstractC4154l.m8918a(this.f30685a, c6328c.f30685a) && AbstractC4154l.m8918a(this.f30686b, c6328c.f30686b) && AbstractC4154l.m8918a(this.f30687c, c6328c.f30687c) && AbstractC4154l.m8918a(this.f30688d, c6328c.f30688d);
    }

    public final int hashCode() {
        int iHashCode = this.f30685a.hashCode() * 31;
        AppSettings appSettings = this.f30686b;
        return this.f30688d.hashCode() + AbstractC1452a.m4559f(this.f30687c, (iHashCode + (appSettings == null ? 0 : appSettings.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "RegistrationDataState(dcc=" + this.f30685a + ", appSettings=" + this.f30686b + ", addDeviceRequest=" + this.f30687c + ", simList=" + this.f30688d + ")";
    }
}
