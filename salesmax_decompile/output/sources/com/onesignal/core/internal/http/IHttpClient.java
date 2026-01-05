package com.onesignal.core.internal.http;

import com.onesignal.core.internal.http.impl.OptionalHeaders;
import org.json.JSONObject;
import p001o.n64;

/* loaded from: classes6.dex */
public interface IHttpClient {

    public static final class DefaultImpls {
        public static /* synthetic */ Object delete$default(IHttpClient iHttpClient, String str, OptionalHeaders optionalHeaders, n64 n64Var, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
            }
            if ((i & 2) != 0) {
                optionalHeaders = null;
            }
            return iHttpClient.delete(str, optionalHeaders, n64Var);
        }

        public static /* synthetic */ Object get$default(IHttpClient iHttpClient, String str, OptionalHeaders optionalHeaders, n64 n64Var, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: get");
            }
            if ((i & 2) != 0) {
                optionalHeaders = null;
            }
            return iHttpClient.get(str, optionalHeaders, n64Var);
        }

        public static /* synthetic */ Object patch$default(IHttpClient iHttpClient, String str, JSONObject jSONObject, OptionalHeaders optionalHeaders, n64 n64Var, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: patch");
            }
            if ((i & 4) != 0) {
                optionalHeaders = null;
            }
            return iHttpClient.patch(str, jSONObject, optionalHeaders, n64Var);
        }

        public static /* synthetic */ Object post$default(IHttpClient iHttpClient, String str, JSONObject jSONObject, OptionalHeaders optionalHeaders, n64 n64Var, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: post");
            }
            if ((i & 4) != 0) {
                optionalHeaders = null;
            }
            return iHttpClient.post(str, jSONObject, optionalHeaders, n64Var);
        }

        public static /* synthetic */ Object put$default(IHttpClient iHttpClient, String str, JSONObject jSONObject, OptionalHeaders optionalHeaders, n64 n64Var, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: put");
            }
            if ((i & 4) != 0) {
                optionalHeaders = null;
            }
            return iHttpClient.put(str, jSONObject, optionalHeaders, n64Var);
        }
    }

    Object delete(String str, OptionalHeaders optionalHeaders, n64 n64Var);

    Object get(String str, OptionalHeaders optionalHeaders, n64 n64Var);

    Object patch(String str, JSONObject jSONObject, OptionalHeaders optionalHeaders, n64 n64Var);

    Object post(String str, JSONObject jSONObject, OptionalHeaders optionalHeaders, n64 n64Var);

    Object put(String str, JSONObject jSONObject, OptionalHeaders optionalHeaders, n64 n64Var);
}
