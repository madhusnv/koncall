package com.google.api.client.googleapis.util;

import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.util.Beta;

@Beta
/* loaded from: classes3.dex */
public final class Utils {

    public static class JsonFactoryInstanceHolder {
        static final JsonFactory INSTANCE = new JacksonFactory();

        private JsonFactoryInstanceHolder() {
        }
    }

    public static class TransportInstanceHolder {
        static final HttpTransport INSTANCE = new NetHttpTransport();

        private TransportInstanceHolder() {
        }
    }

    private Utils() {
    }

    public static JsonFactory getDefaultJsonFactory() {
        return JsonFactoryInstanceHolder.INSTANCE;
    }

    public static HttpTransport getDefaultTransport() {
        return TransportInstanceHolder.INSTANCE;
    }
}
