package com.amplifyframework.auth.cognito.helpers;

import android.util.Base64;
import com.amplifyframework.auth.exceptions.UnknownException;
import org.json.JSONObject;
import p001o.f9g;
import p001o.sh2;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class JWTParser {
    private static final int HEADER = 0;
    public static final JWTParser INSTANCE = new JWTParser();
    private static final int JWT_PARTS = 3;
    private static final int PAYLOAD = 1;
    private static final int SIGNATURE = 2;

    private JWTParser() {
    }

    public final String getClaim(String str, String str2) throws UnknownException {
        sq8.m48649h(str, "jwt");
        if (str.length() == 0) {
            return str;
        }
        try {
            return String.valueOf(str2 != null ? getPayload(str).get(str2) : null);
        } catch (Exception e) {
            String localizedMessage = e.getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = "";
            }
            throw new UnknownException(localizedMessage + ", Invalid token", null, 2, null);
        }
    }

    public final JSONObject getHeader(String str) throws UnknownException {
        sq8.m48649h(str, "jwt");
        try {
            validateJWT(str);
            byte[] bArrDecode = Base64.decode(((String[]) f9g.D0(str, new String[]{"."}, false, 0, 6, null).toArray(new String[0]))[0], 8);
            sq8.m48646e(bArrDecode);
            return new JSONObject(new String(bArrDecode, sh2.f45422b));
        } catch (Exception e) {
            String localizedMessage = e.getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = "";
            }
            throw new UnknownException(localizedMessage + ", error in parsing JSON", null, 2, null);
        }
    }

    public final JSONObject getPayload(String str) throws UnknownException {
        sq8.m48649h(str, "jwt");
        try {
            validateJWT(str);
            byte[] bArrDecode = Base64.decode(((String[]) f9g.D0(str, new String[]{"."}, false, 0, 6, null).toArray(new String[0]))[1], 8);
            sq8.m48646e(bArrDecode);
            return new JSONObject(new String(bArrDecode, sh2.f45422b));
        } catch (Exception e) {
            String localizedMessage = e.getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = "";
            }
            throw new UnknownException(localizedMessage + ", error in parsing JSON", null, 2, null);
        }
    }

    public final String getSignature(String str) throws UnknownException {
        sq8.m48649h(str, "jwt");
        try {
            validateJWT(str);
            byte[] bArrDecode = Base64.decode(((String[]) f9g.D0(str, new String[]{"."}, false, 0, 6, null).toArray(new String[0]))[2], 8);
            sq8.m48646e(bArrDecode);
            return new String(bArrDecode, sh2.f45422b);
        } catch (Exception e) {
            String localizedMessage = e.getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = "";
            }
            throw new UnknownException(localizedMessage + ", error in parsing JSON", null, 2, null);
        }
    }

    public final boolean hasClaim(String str, String str2) {
        sq8.m48649h(str, "jwt");
        try {
            return getPayload(str).has(str2);
        } catch (Exception unused) {
            return false;
        }
    }

    public final void validateJWT(String str) throws UnknownException {
        sq8.m48649h(str, "jwt");
        if (((String[]) f9g.D0(str, new String[]{"."}, false, 0, 6, null).toArray(new String[0])).length != 3) {
            throw new UnknownException("Not a JSON web token. Error in parsing JSON", null, 2, null);
        }
    }
}
