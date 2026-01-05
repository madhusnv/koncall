package com.amplifyframework.statemachine.codegen.data;

import com.amplifyframework.statemachine.util.MaskUtilKt;
import java.util.List;
import java.util.Map;
import p001o.dc9;
import p001o.dff;
import p001o.fff;
import p001o.id5;
import p001o.lo3;
import p001o.p8g;
import p001o.sq8;
import p001o.tbd;
import p001o.to0;
import p001o.uef;
import p001o.zda;

@dff
/* loaded from: classes5.dex */
public final class AuthChallenge {
    private static final dc9[] $childSerializers;
    public static final Companion Companion = new Companion(null);
    private final List<String> availableChallenges;
    private final String challengeName;
    private final Map<String, String> parameters;
    private final String session;
    private final String username;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final dc9 serializer() {
            return AuthChallenge$$serializer.INSTANCE;
        }
    }

    static {
        p8g p8gVar = p8g.f39602a;
        $childSerializers = new dc9[]{null, null, null, new zda(p8gVar, p8gVar), new to0(p8gVar)};
    }

    public /* synthetic */ AuthChallenge(int i, String str, String str2, String str3, Map map, List list, fff fffVar) {
        if (13 != (i & 13)) {
            tbd.m49692a(i, 13, AuthChallenge$$serializer.INSTANCE.getDescriptor());
        }
        this.challengeName = str;
        if ((i & 2) == 0) {
            this.username = null;
        } else {
            this.username = str2;
        }
        this.session = str3;
        this.parameters = map;
        if ((i & 16) == 0) {
            this.availableChallenges = null;
        } else {
            this.availableChallenges = list;
        }
    }

    public static /* synthetic */ AuthChallenge copy$default(AuthChallenge authChallenge, String str, String str2, String str3, Map map, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authChallenge.challengeName;
        }
        if ((i & 2) != 0) {
            str2 = authChallenge.username;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = authChallenge.session;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            map = authChallenge.parameters;
        }
        Map map2 = map;
        if ((i & 16) != 0) {
            list = authChallenge.availableChallenges;
        }
        return authChallenge.copy(str, str4, str5, map2, list);
    }

    public static final /* synthetic */ void write$Self(AuthChallenge authChallenge, lo3 lo3Var, uef uefVar) {
        dc9[] dc9VarArr = $childSerializers;
        lo3Var.mo37568p(uefVar, 0, authChallenge.challengeName);
        if (lo3Var.mo37569r(uefVar, 1) || authChallenge.username != null) {
            lo3Var.mo37571z(uefVar, 1, p8g.f39602a, authChallenge.username);
        }
        lo3Var.mo37571z(uefVar, 2, p8g.f39602a, authChallenge.session);
        lo3Var.mo37571z(uefVar, 3, dc9VarArr[3], authChallenge.parameters);
        if (lo3Var.mo37569r(uefVar, 4) || authChallenge.availableChallenges != null) {
            lo3Var.mo37571z(uefVar, 4, dc9VarArr[4], authChallenge.availableChallenges);
        }
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

    public final AuthChallenge copy(String str, String str2, String str3, Map<String, String> map, List<String> list) {
        sq8.m48649h(str, "challengeName");
        return new AuthChallenge(str, str2, str3, map, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthChallenge)) {
            return false;
        }
        AuthChallenge authChallenge = (AuthChallenge) obj;
        return sq8.m48644c(this.challengeName, authChallenge.challengeName) && sq8.m48644c(this.username, authChallenge.username) && sq8.m48644c(this.session, authChallenge.session) && sq8.m48644c(this.parameters, authChallenge.parameters) && sq8.m48644c(this.availableChallenges, authChallenge.availableChallenges);
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
        return "AuthChallenge(challengeName='" + str + "', username=" + str2 + ", session=" + strMask + ", parameters=" + (map != null ? AuthChallengeKt.maskSensitiveChallengeParameters(map) : null) + ", availableChallenges=" + this.availableChallenges + ")";
    }

    public AuthChallenge(String str, String str2, String str3, Map<String, String> map, List<String> list) {
        sq8.m48649h(str, "challengeName");
        this.challengeName = str;
        this.username = str2;
        this.session = str3;
        this.parameters = map;
        this.availableChallenges = list;
    }

    public /* synthetic */ AuthChallenge(String str, String str2, String str3, Map map, List list, int i, id5 id5Var) {
        this(str, (i & 2) != 0 ? null : str2, str3, map, (i & 16) != 0 ? null : list);
    }
}
