package com.amplifyframework.api.aws.auth;

import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import org.apache.http.protocol.HTTP;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.f9g;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class CognitoJWTParser {
    public static final Companion Companion = new Companion(null);
    private static final int JWT_PARTS = 3;
    private static final int PAYLOAD = 1;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        private final void validateJWT(String str) {
            if (f9g.D0(str, new String[]{"."}, false, 0, 6, null).size() != 3) {
                throw new CognitoParameterInvalidException("not a JSON Web Token", null, 2, null);
            }
        }

        public final String getClaim(String str, String str2) {
            sq8.m48649h(str, "jwt");
            sq8.m48649h(str2, "claim");
            try {
                return getPayload(str).get(str2).toString();
            } catch (Exception unused) {
                throw new CognitoParameterInvalidException("invalid token", null, 2, null);
            }
        }

        public final JSONObject getPayload(String str) {
            sq8.m48649h(str, "jwt");
            try {
                validateJWT(str);
                byte[] bArrDecode = Base64.decode((String) f9g.D0(str, new String[]{"."}, false, 0, 6, null).get(1), 8);
                sq8.m48646e(bArrDecode);
                Charset charsetForName = Charset.forName(HTTP.UTF_8);
                sq8.m48648g(charsetForName, "forName(...)");
                return new JSONObject(new String(bArrDecode, charsetForName));
            } catch (UnsupportedEncodingException e) {
                throw new CognitoParameterInvalidException(e.getMessage(), null, 2, null);
            } catch (JSONException e2) {
                throw new CognitoParameterInvalidException(e2.getMessage(), null, 2, null);
            } catch (Exception unused) {
                throw new CognitoParameterInvalidException("error in parsing JSON", null, 2, null);
            }
        }
    }
}
