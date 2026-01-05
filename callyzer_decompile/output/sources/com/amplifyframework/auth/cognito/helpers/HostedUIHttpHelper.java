package com.amplifyframework.auth.cognito.helpers;

import an.j5;
import com.amplifyframework.auth.cognito.exceptions.service.InvalidGrantException;
import com.amplifyframework.auth.cognito.exceptions.service.ParseTokenException;
import com.amplifyframework.auth.exceptions.ServiceException;
import com.amplifyframework.auth.exceptions.SessionExpiredException;
import com.amplifyframework.statemachine.codegen.data.CognitoUserPoolTokens;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.AbstractC4154l;
import ky.AbstractC4271c;
import ky.C4276h;
import nx.AbstractC5163a;
import og.s1;
import pg.y9;
import qw.a0;
import rw.AbstractC6663m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class HostedUIHttpHelper {
    public static final HostedUIHttpHelper INSTANCE = new HostedUIHttpHelper();
    private static final AbstractC4271c json = y9.m11954a(new j5(26));

    private HostedUIHttpHelper() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a0 json$lambda$0(C4276h Json) {
        AbstractC4154l.m8923f(Json, "$this$Json");
        Json.f21679b = true;
        return a0.f30746a;
    }

    private final CognitoUserPoolTokens parseTokenResponse(String str) throws Exception {
        if (str.length() == 0) {
            throw new ParseTokenException();
        }
        try {
            AbstractC4271c abstractC4271c = json;
            abstractC4271c.getClass();
            FetchTokenResponse fetchTokenResponse = (FetchTokenResponse) abstractC4271c.m8987a(FetchTokenResponse.Companion.serializer(), str);
            String error = fetchTokenResponse.getError();
            if (error == null) {
                return new CognitoUserPoolTokens(fetchTokenResponse.getIdToken(), fetchTokenResponse.getAccessToken(), fetchTokenResponse.getRefreshToken(), fetchTokenResponse.getExpiration());
            }
            if (error.equals("invalid_grant")) {
                throw new SessionExpiredException(error, null, new InvalidGrantException(error, fetchTokenResponse.getErrorDescription()), 2, null);
            }
            throw new ServiceException(error, "Sorry, we don’t have a recovery suggestion for this error.", null, 4, null);
        } catch (Exception e2) {
            if ((e2 instanceof SessionExpiredException) || (e2 instanceof ServiceException)) {
                throw e2;
            }
            String message = e2.getMessage();
            if (message == null) {
                message = "An unknown service error has occurred";
            }
            throw new ServiceException(message, "Sorry, we don’t have a recovery suggestion for this error.", e2);
        }
    }

    public final CognitoUserPoolTokens fetchTokens(URL url, Map<String, String> headerParams, Map<String, String> bodyParams) throws ServiceException, IOException {
        AbstractC4154l.m8923f(url, "url");
        AbstractC4154l.m8923f(headerParams, "headerParams");
        AbstractC4154l.m8923f(bodyParams, "bodyParams");
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        AbstractC4154l.m8921d(uRLConnectionOpenConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
        httpsURLConnection.setRequestMethod("POST");
        httpsURLConnection.setDoOutput(true);
        ArrayList arrayList = new ArrayList(headerParams.size());
        for (Map.Entry<String, String> entry : headerParams.entrySet()) {
            httpsURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
            arrayList.add(a0.f30746a);
        }
        DataOutputStream dataOutputStream = new DataOutputStream(httpsURLConnection.getOutputStream());
        try {
            ArrayList arrayList2 = new ArrayList(bodyParams.size());
            for (Map.Entry<String, String> entry2 : bodyParams.entrySet()) {
                arrayList2.add(URLEncoder.encode(entry2.getKey(), "UTF-8") + "=" + URLEncoder.encode(entry2.getValue(), "UTF-8"));
            }
            dataOutputStream.writeBytes(AbstractC6663m.m12748L(arrayList2, "&", null, null, null, 62));
            dataOutputStream.close();
            int responseCode = httpsURLConnection.getResponseCode();
            if (responseCode < 200 || responseCode >= 500) {
                String responseMessage = httpsURLConnection.getResponseMessage();
                AbstractC4154l.m8922e(responseMessage, "getResponseMessage(...)");
                throw new ServiceException(responseMessage, "Sorry, we don’t have a recovery suggestion for this error.", null, 4, null);
            }
            InputStream inputStream = responseCode < 300 ? httpsURLConnection.getInputStream() : httpsURLConnection.getErrorStream();
            AbstractC4154l.m8920c(inputStream);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, AbstractC5163a.f25245a), 8192);
            try {
                String strM10887b = s1.m10887b(bufferedReader);
                bufferedReader.close();
                return parseTokenResponse(strM10887b);
            } finally {
            }
        } finally {
        }
    }
}
