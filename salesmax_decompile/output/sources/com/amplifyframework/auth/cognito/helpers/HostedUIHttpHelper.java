package com.amplifyframework.auth.cognito.helpers;

import com.amplifyframework.auth.cognito.exceptions.service.InvalidGrantException;
import com.amplifyframework.auth.cognito.exceptions.service.ParseTokenException;
import com.amplifyframework.auth.exceptions.ServiceException;
import com.amplifyframework.auth.exceptions.SessionExpiredException;
import com.amplifyframework.statemachine.codegen.data.CognitoUserPoolTokens;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.apache.http.protocol.HTTP;
import p001o.f99;
import p001o.kh3;
import p001o.p79;
import p001o.sh2;
import p001o.sq8;
import p001o.tb3;
import p001o.uih;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class HostedUIHttpHelper {
    public static final HostedUIHttpHelper INSTANCE = new HostedUIHttpHelper();
    private static final p79 json = f99.m26299b(null, HostedUIHttpHelper$json$1.INSTANCE, 1, null);

    private HostedUIHttpHelper() {
    }

    private final CognitoUserPoolTokens parseTokenResponse(String str) throws Exception {
        if (str.length() == 0) {
            throw new ParseTokenException();
        }
        try {
            p79 p79Var = json;
            p79Var.mo43085a();
            FetchTokenResponse fetchTokenResponse = (FetchTokenResponse) p79Var.m43086c(FetchTokenResponse.Companion.serializer(), str);
            String error = fetchTokenResponse.getError();
            if (error == null) {
                return new CognitoUserPoolTokens(fetchTokenResponse.getIdToken(), fetchTokenResponse.getAccessToken(), fetchTokenResponse.getRefreshToken(), fetchTokenResponse.getExpiration());
            }
            if (sq8.m48644c(error, "invalid_grant")) {
                throw new SessionExpiredException(error, null, new InvalidGrantException(error, fetchTokenResponse.getErrorDescription()), 2, null);
            }
            throw new ServiceException(error, "Sorry, we don’t have a recovery suggestion for this error.", null, 4, null);
        } catch (Exception e) {
            if ((e instanceof SessionExpiredException) || (e instanceof ServiceException)) {
                throw e;
            }
            String message = e.getMessage();
            if (message == null) {
                message = "An unknown service error has occurred";
            }
            throw new ServiceException(message, "Sorry, we don’t have a recovery suggestion for this error.", e);
        }
    }

    public final CognitoUserPoolTokens fetchTokens(URL url, Map<String, String> map, Map<String, String> map2) throws ServiceException, IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        sq8.m48649h(url, ImagesContract.URL);
        sq8.m48649h(map, "headerParams");
        sq8.m48649h(map2, "bodyParams");
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
        sq8.m48647f(uRLConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnection;
        httpsURLConnection.setRequestMethod("POST");
        httpsURLConnection.setDoOutput(true);
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            httpsURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
            arrayList.add(y3i.f54824a);
        }
        DataOutputStream dataOutputStream = new DataOutputStream(httpsURLConnection.getOutputStream());
        try {
            ArrayList arrayList2 = new ArrayList(map2.size());
            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                arrayList2.add(URLEncoder.encode(entry2.getKey(), HTTP.UTF_8) + "=" + URLEncoder.encode(entry2.getValue(), HTTP.UTF_8));
            }
            dataOutputStream.writeBytes(kh3.p0(arrayList2, "&", null, null, 0, null, null, 62, null));
            y3i y3iVar = y3i.f54824a;
            tb3.m49666a(dataOutputStream, null);
            int responseCode = httpsURLConnection.getResponseCode();
            if (responseCode < 200 || responseCode >= 500) {
                String responseMessage = httpsURLConnection.getResponseMessage();
                sq8.m48648g(responseMessage, "getResponseMessage(...)");
                throw new ServiceException(responseMessage, "Sorry, we don’t have a recovery suggestion for this error.", null, 4, null);
            }
            InputStream inputStream = responseCode < 300 ? httpsURLConnection.getInputStream() : httpsURLConnection.getErrorStream();
            sq8.m48646e(inputStream);
            Reader inputStreamReader = new InputStreamReader(inputStream, sh2.f45422b);
            BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
            try {
                String strM51644d = uih.m51644d(bufferedReader);
                tb3.m49666a(bufferedReader, null);
                return parseTokenResponse(strM51644d);
            } finally {
            }
        } finally {
        }
    }
}
