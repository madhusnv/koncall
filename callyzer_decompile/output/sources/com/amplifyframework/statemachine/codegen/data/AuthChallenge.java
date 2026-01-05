package com.amplifyframework.statemachine.codegen.data;

import a2.AbstractC0030c;
import aw.C0466f;
import com.amplifyframework.statemachine.util.MaskUtilKt;
import fy.InterfaceC2401a;
import hy.InterfaceC3055f;
import iy.InterfaceC3365b;
import java.util.List;
import java.util.Map;
import jy.C3866c;
import jy.a1;
import jy.f0;
import jy.n0;
import jy.w0;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import ly.C4597u;
import og.nd;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import qw.EnumC6359i;
import qw.InterfaceC6357g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AuthChallenge {
    private static final InterfaceC6357g[] $childSerializers;
    public static final Companion Companion = new Companion(null);
    private final List<String> availableChallenges;
    private final String challengeName;
    private final Map<String, String> parameters;
    private final String session;
    private final String username;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC2401a serializer() {
            return AuthChallenge$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }
    }

    static {
        EnumC6359i enumC6359i = EnumC6359i.PUBLICATION;
        $childSerializers = new InterfaceC6357g[]{null, null, null, nd.m10781b(enumC6359i, new C0466f(28)), nd.m10781b(enumC6359i, new C0466f(29))};
    }

    public /* synthetic */ AuthChallenge(int i10, String str, String str2, String str3, Map map, List list, w0 w0Var) {
        if (13 != (i10 & 13)) {
            n0.m8426g(i10, 13, AuthChallenge$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.challengeName = str;
        if ((i10 & 2) == 0) {
            this.username = null;
        } else {
            this.username = str2;
        }
        this.session = str3;
        this.parameters = map;
        if ((i10 & 16) == 0) {
            this.availableChallenges = null;
        } else {
            this.availableChallenges = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC2401a _childSerializers$_anonymous_() {
        return new f0(a1.f19869a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC2401a _childSerializers$_anonymous_$0() {
        return new C3866c(a1.f19869a);
    }

    public static /* synthetic */ AuthChallenge copy$default(AuthChallenge authChallenge, String str, String str2, String str3, Map map, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = authChallenge.challengeName;
        }
        if ((i10 & 2) != 0) {
            str2 = authChallenge.username;
        }
        if ((i10 & 4) != 0) {
            str3 = authChallenge.session;
        }
        if ((i10 & 8) != 0) {
            map = authChallenge.parameters;
        }
        if ((i10 & 16) != 0) {
            list = authChallenge.availableChallenges;
        }
        List list2 = list;
        String str4 = str3;
        return authChallenge.copy(str, str2, str4, map, list2);
    }

    public static final /* synthetic */ void write$Self$aws_auth_cognito_release(AuthChallenge authChallenge, InterfaceC3365b interfaceC3365b, InterfaceC3055f interfaceC3055f) {
        InterfaceC6357g[] interfaceC6357gArr = $childSerializers;
        C4597u c4597u = (C4597u) interfaceC3365b;
        c4597u.m9444w(interfaceC3055f, 0, authChallenge.challengeName);
        if (c4597u.mo7694i(interfaceC3055f) || authChallenge.username != null) {
            c4597u.mo7695n(interfaceC3055f, 1, a1.f19869a, authChallenge.username);
        }
        c4597u.mo7695n(interfaceC3055f, 2, a1.f19869a, authChallenge.session);
        c4597u.mo7695n(interfaceC3055f, 3, (InterfaceC2401a) interfaceC6357gArr[3].getValue(), authChallenge.parameters);
        if (!c4597u.mo7694i(interfaceC3055f) && authChallenge.availableChallenges == null) {
            return;
        }
        c4597u.mo7695n(interfaceC3055f, 4, (InterfaceC2401a) interfaceC6357gArr[4].getValue(), authChallenge.availableChallenges);
    }

    public final String component1() {
        return this.challengeName;
    }

    public final String component2() {
        return this.username;
    }

    public final String component3() {
        return this.session;
    }

    public final Map<String, String> component4() {
        return this.parameters;
    }

    public final List<String> component5() {
        return this.availableChallenges;
    }

    public final AuthChallenge copy(String challengeName, String str, String str2, Map<String, String> map, List<String> list) {
        AbstractC4154l.m8923f(challengeName, "challengeName");
        return new AuthChallenge(challengeName, str, str2, map, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthChallenge)) {
            return false;
        }
        AuthChallenge authChallenge = (AuthChallenge) obj;
        return AbstractC4154l.m8918a(this.challengeName, authChallenge.challengeName) && AbstractC4154l.m8918a(this.username, authChallenge.username) && AbstractC4154l.m8918a(this.session, authChallenge.session) && AbstractC4154l.m8918a(this.parameters, authChallenge.parameters) && AbstractC4154l.m8918a(this.availableChallenges, authChallenge.availableChallenges);
    }

    public final List<String> getAvailableChallenges() {
        return this.availableChallenges;
    }

    public final String getChallengeName() {
        return this.challengeName;
    }

    public final Map<String, String> getParameters() {
        return this.parameters;
    }

    public final String getSession() {
        return this.session;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        int iHashCode = this.challengeName.hashCode() * 31;
        String str = this.username;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.session;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, String> map = this.parameters;
        int iHashCode4 = (iHashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        List<String> list = this.availableChallenges;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.challengeName;
        String str2 = this.username;
        String strMask = MaskUtilKt.mask(this.session);
        Map<String, String> map = this.parameters;
        Map<String, String> mapMaskSensitiveChallengeParameters = map != null ? AuthChallengeKt.maskSensitiveChallengeParameters(map) : null;
        List<String> list = this.availableChallenges;
        StringBuilder sbM127r = AbstractC0030c.m127r("AuthChallenge(challengeName='", str, "', username=", str2, ", session=");
        sbM127r.append(strMask);
        sbM127r.append(", parameters=");
        sbM127r.append(mapMaskSensitiveChallengeParameters);
        sbM127r.append(", availableChallenges=");
        return AbstractC5601a.m11240k(")", sbM127r, list);
    }

    public AuthChallenge(String challengeName, String str, String str2, Map<String, String> map, List<String> list) {
        AbstractC4154l.m8923f(challengeName, "challengeName");
        this.challengeName = challengeName;
        this.username = str;
        this.session = str2;
        this.parameters = map;
        this.availableChallenges = list;
    }

    public /* synthetic */ AuthChallenge(String str, String str2, String str3, Map map, List list, int i10, AbstractC4148f abstractC4148f) {
        this(str, (i10 & 2) != 0 ? null : str2, str3, map, (i10 & 16) != 0 ? null : list);
    }
}
