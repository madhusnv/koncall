package com.amplifyframework.auth.cognito.helpers;

import android.util.Base64;
import com.amplifyframework.auth.exceptions.UnknownException;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5163a;
import nx.AbstractC5178p;
import org.json.JSONObject;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class JWTParser {
    private static final int HEADER = 0;
    public static final JWTParser INSTANCE = new JWTParser();
    private static final int JWT_PARTS = 3;
    private static final int PAYLOAD = 1;
    private static final int SIGNATURE = 2;

    private JWTParser() {
    }

    public final String getClaim(String jwt, String str) throws UnknownException {
        AbstractC4154l.m8923f(jwt, "jwt");
        if (jwt.length() == 0) {
            return jwt;
        }
        try {
            return String.valueOf(str != null ? getPayload(jwt).get(str) : null);
        } catch (Exception e2) {
            String localizedMessage = e2.getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = "";
            }
            throw new UnknownException(localizedMessage.concat(", Invalid token"), null, 2, null);
        }
    }

    public final JSONObject getHeader(String jwt) throws UnknownException {
        AbstractC4154l.m8923f(jwt, "jwt");
        try {
            validateJWT(jwt);
            byte[] bArrDecode = Base64.decode(((String[]) AbstractC5178p.m10112W(jwt, new String[]{"."}, 6).toArray(new String[0]))[0], 8);
            AbstractC4154l.m8920c(bArrDecode);
            return new JSONObject(new String(bArrDecode, AbstractC5163a.f25245a));
        } catch (Exception e2) {
            String localizedMessage = e2.getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = "";
            }
            throw new UnknownException(localizedMessage.concat(", error in parsing JSON"), null, 2, null);
        }
    }

    public final JSONObject getPayload(String jwt) throws UnknownException {
        AbstractC4154l.m8923f(jwt, "jwt");
        try {
            validateJWT(jwt);
            byte[] bArrDecode = Base64.decode(((String[]) AbstractC5178p.m10112W(jwt, new String[]{"."}, 6).toArray(new String[0]))[1], 8);
            AbstractC4154l.m8920c(bArrDecode);
            return new JSONObject(new String(bArrDecode, AbstractC5163a.f25245a));
        } catch (Exception e2) {
            String localizedMessage = e2.getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = "";
            }
            throw new UnknownException(localizedMessage.concat(", error in parsing JSON"), null, 2, null);
        }
    }

    public final String getSignature(String jwt) throws UnknownException {
        AbstractC4154l.m8923f(jwt, "jwt");
        try {
            validateJWT(jwt);
            byte[] bArrDecode = Base64.decode(((String[]) AbstractC5178p.m10112W(jwt, new String[]{"."}, 6).toArray(new String[0]))[2], 8);
            AbstractC4154l.m8920c(bArrDecode);
            return new String(bArrDecode, AbstractC5163a.f25245a);
        } catch (Exception e2) {
            String localizedMessage = e2.getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = "";
            }
            throw new UnknownException(localizedMessage.concat(", error in parsing JSON"), null, 2, null);
        }
    }

    public final boolean hasClaim(String jwt, String str) {
        AbstractC4154l.m8923f(jwt, "jwt");
        try {
            return getPayload(jwt).has(str);
        } catch (Exception unused) {
            return false;
        }
    }

    public final void validateJWT(String jwt) throws UnknownException {
        AbstractC4154l.m8923f(jwt, "jwt");
        if (((String[]) AbstractC5178p.m10112W(jwt, new String[]{"."}, 6).toArray(new String[0])).length != 3) {
            throw new UnknownException("Not a JSON web token. Error in parsing JSON", null, 2, null);
        }
    }
}
