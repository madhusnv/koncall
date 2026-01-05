package tv;

import com.websoptimization.callyzerbiz.data.model.response.AppSettings;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tv.l */
/* loaded from: classes3.dex */
public final class C7238l extends AbstractC7239m {

    /* renamed from: a */
    public final AppSettings f34589a;

    public C7238l(AppSettings appSettings) {
        AbstractC4154l.m8923f(appSettings, "appSettings");
        this.f34589a = appSettings;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7238l) && AbstractC4154l.m8918a(this.f34589a, ((C7238l) obj).f34589a);
    }

    public final int hashCode() {
        return this.f34589a.hashCode();
    }

    public final String toString() {
        return "Success(appSettings=" + this.f34589a + ")";
    }
}
