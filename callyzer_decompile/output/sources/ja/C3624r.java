package ja;

import com.amplifyframework.core.model.ModelIdentifier;
import ex.InterfaceC2142f;
import kotlin.jvm.internal.AbstractC4152j;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5178p;
import pg.c8;
import pg.d8;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ja.r */
/* loaded from: classes.dex */
public final /* synthetic */ class C3624r extends AbstractC4152j implements InterfaceC2142f {

    /* renamed from: a */
    public static final C3624r f19266a = new C3624r(3, AbstractC3629w.class, "credentialProfile", "credentialProfile(Laws/sdk/kotlin/runtime/config/profile/FileLine;Laws/sdk/kotlin/runtime/config/profile/Token$Section;Laws/sdk/kotlin/runtime/config/profile/Token$Property;)Laws/sdk/kotlin/runtime/config/profile/Token$Section;", 1);

    @Override // ex.InterfaceC2142f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C3619m p02 = (C3619m) obj;
        AbstractC4154l.m8923f(p02, "p0");
        String str = p02.f19261b;
        if (!c8.m11570c(p02)) {
            return null;
        }
        if (c8.m11570c(p02) && AbstractC5178p.m10116x(str, "sso-session", false)) {
            return null;
        }
        AbstractC4154l.m8923f(str, "<this>");
        String strM11587e = d8.m11587e(d8.m11587e(str, " #"), " ;");
        AbstractC4154l.m8923f(strM11587e, "<this>");
        String string = AbstractC5178p.g0(AbstractC5178p.m10091B(AbstractC5178p.m10090A(1, d8.m11587e(d8.m11587e(strM11587e, ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER), ";")))).toString();
        return new C3632z(string, EnumC3618l.PROFILE, false, d8.m11585c(string));
    }
}
