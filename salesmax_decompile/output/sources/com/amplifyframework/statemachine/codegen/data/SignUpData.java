package com.amplifyframework.statemachine.codegen.data;

import com.amplifyframework.statemachine.util.MaskUtilKt;
import java.util.Map;
import p001o.dc9;
import p001o.dff;
import p001o.fff;
import p001o.id5;
import p001o.lo3;
import p001o.p8g;
import p001o.sq8;
import p001o.tbd;
import p001o.uef;
import p001o.zda;

@dff
/* loaded from: classes5.dex */
public final class SignUpData {
    private static final dc9[] $childSerializers;
    public static final Companion Companion = new Companion(null);
    private final Map<String, String> clientMetadata;
    private final String session;
    private final String userId;
    private final String username;
    private final Map<String, String> validationData;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final dc9 serializer() {
            return SignUpData$$serializer.INSTANCE;
        }
    }

    static {
        p8g p8gVar = p8g.f39602a;
        $childSerializers = new dc9[]{null, new zda(p8gVar, p8gVar), new zda(p8gVar, p8gVar), null, null};
    }

    public /* synthetic */ SignUpData(int i, String str, Map map, Map map2, String str2, String str3, fff fffVar) {
        if (1 != (i & 1)) {
            tbd.m49692a(i, 1, SignUpData$$serializer.INSTANCE.getDescriptor());
        }
        this.username = str;
        if ((i & 2) == 0) {
            this.validationData = null;
        } else {
            this.validationData = map;
        }
        if ((i & 4) == 0) {
            this.clientMetadata = null;
        } else {
            this.clientMetadata = map2;
        }
        if ((i & 8) == 0) {
            this.session = null;
        } else {
            this.session = str2;
        }
        if ((i & 16) == 0) {
            this.userId = null;
        } else {
            this.userId = str3;
        }
    }

    public static /* synthetic */ SignUpData copy$default(SignUpData signUpData, String str, Map map, Map map2, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = signUpData.username;
        }
        if ((i & 2) != 0) {
            map = signUpData.validationData;
        }
        Map map3 = map;
        if ((i & 4) != 0) {
            map2 = signUpData.clientMetadata;
        }
        Map map4 = map2;
        if ((i & 8) != 0) {
            str2 = signUpData.session;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            str3 = signUpData.userId;
        }
        return signUpData.copy(str, map3, map4, str4, str3);
    }

    public static final /* synthetic */ void write$Self(SignUpData signUpData, lo3 lo3Var, uef uefVar) {
        dc9[] dc9VarArr = $childSerializers;
        lo3Var.mo37568p(uefVar, 0, signUpData.username);
        if (lo3Var.mo37569r(uefVar, 1) || signUpData.validationData != null) {
            lo3Var.mo37571z(uefVar, 1, dc9VarArr[1], signUpData.validationData);
        }
        if (lo3Var.mo37569r(uefVar, 2) || signUpData.clientMetadata != null) {
            lo3Var.mo37571z(uefVar, 2, dc9VarArr[2], signUpData.clientMetadata);
        }
        if (lo3Var.mo37569r(uefVar, 3) || signUpData.session != null) {
            lo3Var.mo37571z(uefVar, 3, p8g.f39602a, signUpData.session);
        }
        if (lo3Var.mo37569r(uefVar, 4) || signUpData.userId != null) {
            lo3Var.mo37571z(uefVar, 4, p8g.f39602a, signUpData.userId);
        }
    }

    public final String component1() {
        return this.username;
    }

    public final Map<String, String> component2() {
        return this.validationData;
    }

    public final Map<String, String> component3() {
        return this.clientMetadata;
    }

    public final String component4() {
        return this.session;
    }

    public final String component5() {
        return this.userId;
    }

    public final SignUpData copy(String str, Map<String, String> map, Map<String, String> map2, String str2, String str3) {
        sq8.m48649h(str, "username");
        return new SignUpData(str, map, map2, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignUpData)) {
            return false;
        }
        SignUpData signUpData = (SignUpData) obj;
        return sq8.m48644c(this.username, signUpData.username) && sq8.m48644c(this.validationData, signUpData.validationData) && sq8.m48644c(this.clientMetadata, signUpData.clientMetadata) && sq8.m48644c(this.session, signUpData.session) && sq8.m48644c(this.userId, signUpData.userId);
    }

    public final Map<String, String> getClientMetadata() {
        return this.clientMetadata;
    }

    public final String getSession() {
        return this.session;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUsername() {
        return this.username;
    }

    public final Map<String, String> getValidationData() {
        return this.validationData;
    }

    public int hashCode() {
        int iHashCode = this.username.hashCode() * 31;
        Map<String, String> map = this.validationData;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, String> map2 = this.clientMetadata;
        int iHashCode3 = (iHashCode2 + (map2 == null ? 0 : map2.hashCode())) * 31;
        String str = this.session;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.userId;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "SignUpData(username='" + this.username + "', validationData=" + this.validationData + ", clientMetadata=" + this.clientMetadata + ", session=" + MaskUtilKt.mask(this.session) + ", userId=" + this.userId + ")";
    }

    public SignUpData(String str, Map<String, String> map, Map<String, String> map2, String str2, String str3) {
        sq8.m48649h(str, "username");
        this.username = str;
        this.validationData = map;
        this.clientMetadata = map2;
        this.session = str2;
        this.userId = str3;
    }

    public /* synthetic */ SignUpData(String str, Map map, Map map2, String str2, String str3, int i, id5 id5Var) {
        this(str, (i & 2) != 0 ? null : map, (i & 4) != 0 ? null : map2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
    }
}
