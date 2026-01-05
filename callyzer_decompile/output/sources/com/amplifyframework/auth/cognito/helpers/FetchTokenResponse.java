package com.amplifyframework.auth.cognito.helpers;

import fy.InterfaceC2401a;
import hy.InterfaceC3055f;
import iy.InterfaceC3365b;
import j$.time.format.DateTimeFormatter;
import jy.a1;
import jy.d0;
import jy.j0;
import jy.w0;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import og.bb;
import ox.C5770a;
import ox.EnumC5772c;
import td.C7124a;
import td.C7126c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class FetchTokenResponse {
    public static final Companion Companion = new Companion(null);
    private final String accessToken;
    private final String error;
    private final String errorDescription;
    private final Long expiration;
    private final Integer expiresIn;
    private final String idToken;
    private final String refreshToken;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC2401a serializer() {
            return FetchTokenResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }
    }

    public FetchTokenResponse() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static final void write$Self$aws_auth_cognito_release(FetchTokenResponse fetchTokenResponse, InterfaceC3365b interfaceC3365b, InterfaceC3055f interfaceC3055f) {
        Long lValueOf;
        if (interfaceC3365b.mo7694i(interfaceC3055f) || fetchTokenResponse.accessToken != null) {
            interfaceC3365b.mo7695n(interfaceC3055f, 0, a1.f19869a, fetchTokenResponse.accessToken);
        }
        if (interfaceC3365b.mo7694i(interfaceC3055f) || fetchTokenResponse.idToken != null) {
            interfaceC3365b.mo7695n(interfaceC3055f, 1, a1.f19869a, fetchTokenResponse.idToken);
        }
        if (interfaceC3365b.mo7694i(interfaceC3055f) || fetchTokenResponse.refreshToken != null) {
            interfaceC3365b.mo7695n(interfaceC3055f, 2, a1.f19869a, fetchTokenResponse.refreshToken);
        }
        if (interfaceC3365b.mo7694i(interfaceC3055f) || fetchTokenResponse.expiresIn != null) {
            interfaceC3365b.mo7695n(interfaceC3055f, 3, d0.f19882a, fetchTokenResponse.expiresIn);
        }
        if (interfaceC3365b.mo7694i(interfaceC3055f) || fetchTokenResponse.error != null) {
            interfaceC3365b.mo7695n(interfaceC3055f, 4, a1.f19869a, fetchTokenResponse.error);
        }
        if (interfaceC3365b.mo7694i(interfaceC3055f) || fetchTokenResponse.errorDescription != null) {
            interfaceC3365b.mo7695n(interfaceC3055f, 5, a1.f19869a, fetchTokenResponse.errorDescription);
        }
        if (!interfaceC3365b.mo7694i(interfaceC3055f)) {
            Long l9 = fetchTokenResponse.expiration;
            Integer num = fetchTokenResponse.expiresIn;
            if (num != null) {
                int iIntValue = num.intValue();
                DateTimeFormatter dateTimeFormatter = C7126c.f34342b;
                C7126c c7126cM13407e = C7124a.m13407e();
                int i10 = C5770a.f28335d;
                lValueOf = Long.valueOf(c7126cM13407e.m13410c(bb.m10551g(iIntValue, EnumC5772c.SECONDS)).f34346a.getEpochSecond());
            } else {
                lValueOf = null;
            }
            if (AbstractC4154l.m8918a(l9, lValueOf)) {
                return;
            }
        }
        interfaceC3365b.mo7695n(interfaceC3055f, 6, j0.f19910a, fetchTokenResponse.expiration);
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

    public FetchTokenResponse(int i10, String str, String str2, String str3, Integer num, String str4, String str5, Long l9, w0 w0Var) {
        Long lValueOf = null;
        if ((i10 & 1) == 0) {
            this.accessToken = null;
        } else {
            this.accessToken = str;
        }
        if ((i10 & 2) == 0) {
            this.idToken = null;
        } else {
            this.idToken = str2;
        }
        if ((i10 & 4) == 0) {
            this.refreshToken = null;
        } else {
            this.refreshToken = str3;
        }
        if ((i10 & 8) == 0) {
            this.expiresIn = null;
        } else {
            this.expiresIn = num;
        }
        if ((i10 & 16) == 0) {
            this.error = null;
        } else {
            this.error = str4;
        }
        if ((i10 & 32) == 0) {
            this.errorDescription = null;
        } else {
            this.errorDescription = str5;
        }
        if ((i10 & 64) != 0) {
            this.expiration = l9;
            return;
        }
        Integer num2 = this.expiresIn;
        if (num2 != null) {
            int iIntValue = num2.intValue();
            DateTimeFormatter dateTimeFormatter = C7126c.f34342b;
            C7126c c7126cM13407e = C7124a.m13407e();
            int i11 = C5770a.f28335d;
            lValueOf = Long.valueOf(c7126cM13407e.m13410c(bb.m10551g(iIntValue, EnumC5772c.SECONDS)).f34346a.getEpochSecond());
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
            DateTimeFormatter dateTimeFormatter = C7126c.f34342b;
            C7126c c7126cM13407e = C7124a.m13407e();
            int i10 = C5770a.f28335d;
            lValueOf = Long.valueOf(c7126cM13407e.m13410c(bb.m10551g(iIntValue, EnumC5772c.SECONDS)).f34346a.getEpochSecond());
        } else {
            lValueOf = null;
        }
        this.expiration = lValueOf;
    }

    public /* synthetic */ FetchTokenResponse(String str, String str2, String str3, Integer num, String str4, String str5, int i10, AbstractC4148f abstractC4148f) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : num, (i10 & 16) != 0 ? null : str4, (i10 & 32) != 0 ? null : str5);
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
}
