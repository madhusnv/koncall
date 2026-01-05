package rv;

import com.websoptimization.callyzerbiz.data.model.response.AppSettings;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rv.a */
/* loaded from: classes3.dex */
public final class C6625a extends AbstractC6650z {

    /* renamed from: a */
    public final AppSettings f31817a;

    public C6625a(AppSettings appSettings) {
        AbstractC4154l.m8923f(appSettings, "appSettings");
        this.f31817a = appSettings;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6625a) && AbstractC4154l.m8918a(this.f31817a, ((C6625a) obj).f31817a);
    }

    public final int hashCode() {
        return this.f31817a.hashCode();
    }

    public final String toString() {
        return "AddAppSetting(appSettings=" + this.f31817a + ")";
    }
}
