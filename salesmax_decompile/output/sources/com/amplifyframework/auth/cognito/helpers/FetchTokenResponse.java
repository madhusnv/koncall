package com.amplifyframework.auth.cognito.helpers;

import p001o.dc9;
import p001o.dff;
import p001o.fff;
import p001o.gk8;
import p001o.id5;
import p001o.k16;
import p001o.ll8;
import p001o.lo3;
import p001o.m16;
import p001o.o16;
import p001o.p8g;
import p001o.qla;
import p001o.sq8;
import p001o.tbd;
import p001o.uef;

@dff
/* loaded from: classes5.dex */
public final class FetchTokenResponse {
    public static final Companion Companion = new Companion(null);
    private final String accessToken;
    private final String error;
    private final String errorDescription;
    private final Long expiration;
    private final Integer expiresIn;
    private final String idToken;
    private final String refreshToken;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final dc9 serializer() {
            return FetchTokenResponse$$serializer.INSTANCE;
        }
    }

    public FetchTokenResponse() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ void getAccessToken$annotations() {
    }

    public static /* synthetic */ void getError$annotations() {
    }

    public static /* synthetic */ void getErrorDescription$annotations() {
    }

    private static /* synthetic */ void getExpiresIn$annotations() {
    }

    public static /* synthetic */ void getIdToken$annotations() {
    }

    public static /* synthetic */ void getRefreshToken$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void write$Self(FetchTokenResponse fetchTokenResponse, lo3 lo3Var, uef uefVar) {
        Long lValueOf;
        boolean z = false;
        if (lo3Var.mo37569r(uefVar, 0) || fetchTokenResponse.accessToken != null) {
            lo3Var.mo37571z(uefVar, 0, p8g.f39602a, fetchTokenResponse.accessToken);
        }
        if (lo3Var.mo37569r(uefVar, 1) || fetchTokenResponse.idToken != null) {
            lo3Var.mo37571z(uefVar, 1, p8g.f39602a, fetchTokenResponse.idToken);
        }
        if (lo3Var.mo37569r(uefVar, 2) || fetchTokenResponse.refreshToken != null) {
            lo3Var.mo37571z(uefVar, 2, p8g.f39602a, fetchTokenResponse.refreshToken);
        }
        if (lo3Var.mo37569r(uefVar, 3) || fetchTokenResponse.expiresIn != null) {
            lo3Var.mo37571z(uefVar, 3, ll8.f34006a, fetchTokenResponse.expiresIn);
        }
        if (lo3Var.mo37569r(uefVar, 4) || fetchTokenResponse.error != null) {
            lo3Var.mo37571z(uefVar, 4, p8g.f39602a, fetchTokenResponse.error);
        }
        if (lo3Var.mo37569r(uefVar, 5) || fetchTokenResponse.errorDescription != null) {
            lo3Var.mo37571z(uefVar, 5, p8g.f39602a, fetchTokenResponse.errorDescription);
        }
        if (lo3Var.mo37569r(uefVar, 6)) {
            z = true;
        } else {
            Long l = fetchTokenResponse.expiration;
            Integer num = fetchTokenResponse.expiresIn;
            if (num != null) {
                int iIntValue = num.intValue();
                gk8 gk8VarM28963g = gk8.f25374b.m28963g();
                k16.C14700a c14700a = k16.f31358b;
                lValueOf = Long.valueOf(gk8VarM28963g.m28956m(m16.m38175s(iIntValue, o16.SECONDS)).m28952e());
            } else {
                lValueOf = null;
            }
            if (!sq8.m48644c(l, lValueOf)) {
            }
        }
        if (z) {
            lo3Var.mo37571z(uefVar, 6, qla.f42120a, fetchTokenResponse.expiration);
        }
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final String getError() {
        return this.error;
    }

    public final String getErrorDescription() {
        return this.errorDescription;
    }

    public final Long getExpiration() {
        return this.expiration;
    }

    public final String getIdToken() {
        return this.idToken;
    }

    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public /* synthetic */ FetchTokenResponse(int i, String str, String str2, String str3, Integer num, String str4, String str5, Long l, fff fffVar) {
        if ((i & 0) != 0) {
            tbd.m49692a(i, 0, FetchTokenResponse$$serializer.INSTANCE.getDescriptor());
        }
        Long lValueOf = null;
        if ((i & 1) == 0) {
            this.accessToken = null;
        } else {
            this.accessToken = str;
        }
        if ((i & 2) == 0) {
            this.idToken = null;
        } else {
            this.idToken = str2;
        }
        if ((i & 4) == 0) {
            this.refreshToken = null;
        } else {
            this.refreshToken = str3;
        }
        if ((i & 8) == 0) {
            this.expiresIn = null;
        } else {
            this.expiresIn = num;
        }
        if ((i & 16) == 0) {
            this.error = null;
        } else {
            this.error = str4;
        }
        if ((i & 32) == 0) {
            this.errorDescription = null;
        } else {
            this.errorDescription = str5;
        }
        if ((i & 64) != 0) {
            this.expiration = l;
            return;
        }
        Integer num2 = this.expiresIn;
        if (num2 != null) {
            int iIntValue = num2.intValue();
            gk8 gk8VarM28963g = gk8.f25374b.m28963g();
            k16.C14700a c14700a = k16.f31358b;
            lValueOf = Long.valueOf(gk8VarM28963g.m28956m(m16.m38175s(iIntValue, o16.SECONDS)).m28952e());
        }
        this.expiration = lValueOf;
    }

    public FetchTokenResponse(String str, String str2, String str3, Integer num, String str4, String str5) {
        Long lValueOf;
        this.accessToken = str;
        this.idToken = str2;
        this.refreshToken = str3;
        this.expiresIn = num;
        this.error = str4;
        this.errorDescription = str5;
        if (num != null) {
            int iIntValue = num.intValue();
            gk8 gk8VarM28963g = gk8.f25374b.m28963g();
            k16.C14700a c14700a = k16.f31358b;
            lValueOf = Long.valueOf(gk8VarM28963g.m28956m(m16.m38175s(iIntValue, o16.SECONDS)).m28952e());
        } else {
            lValueOf = null;
        }
        this.expiration = lValueOf;
    }

    public /* synthetic */ FetchTokenResponse(String str, String str2, String str3, Integer num, String str4, String str5, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5);
    }
}
