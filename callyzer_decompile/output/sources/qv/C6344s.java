package qv;

import com.websoptimization.callyzerbiz.data.model.response.AppSettings;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qv.s */
/* loaded from: classes3.dex */
public final class C6344s extends AbstractC6349x {

    /* renamed from: a */
    public final AppSettings f30738a;

    public C6344s(AppSettings appSettings) {
        AbstractC4154l.m8923f(appSettings, "appSettings");
        this.f30738a = appSettings;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6344s) && AbstractC4154l.m8918a(this.f30738a, ((C6344s) obj).f30738a);
    }

    public final int hashCode() {
        return this.f30738a.hashCode();
    }

    public final String toString() {
        return "SaveAppSetting(appSettings=" + this.f30738a + ")";
    }
}
