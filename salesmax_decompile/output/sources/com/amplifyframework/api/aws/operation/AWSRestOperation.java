package com.amplifyframework.api.aws.operation;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.amplifyframework.api.ApiException;
import com.amplifyframework.api.aws.utils.RestRequestFactory;
import com.amplifyframework.api.rest.RestOperation;
import com.amplifyframework.api.rest.RestOperationRequest;
import com.amplifyframework.api.rest.RestResponse;
import com.amplifyframework.core.Consumer;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p001o.bt1;
import p001o.cre;
import p001o.hac;
import p001o.z22;
import p001o.zqe;

@SuppressLint({"SyntheticAccessor"})
/* loaded from: classes5.dex */
public final class AWSRestOperation extends RestOperation {
    private final hac client;
    private final String endpoint;
    private final Consumer<ApiException> onFailure;
    private final Consumer<RestResponse> onResponse;
    private bt1 ongoingCall;

    public final class OkHttpCallback implements z22 {
        @Override // p001o.z22
        public void onFailure(bt1 bt1Var, IOException iOException) {
            if (AWSRestOperation.this.ongoingCall == null || !AWSRestOperation.this.ongoingCall.isCanceled()) {
                AWSRestOperation.this.onFailure.accept(new ApiException("Received an IO exception while making the request.", iOException, "Retry the request."));
            }
        }

        @Override // p001o.z22
        public void onResponse(bt1 bt1Var, zqe zqeVar) {
            cre creVarM59735c = zqeVar.m59735c();
            int iM59739h = zqeVar.m59739h();
            HashMap map = new HashMap();
            Map mapM55332v = zqeVar.m59744u().m55332v();
            for (String str : mapM55332v.keySet()) {
                List list = (List) mapM55332v.get(str);
                if (list.size() > 0) {
                    map.put(str, TextUtils.join(",", list));
                }
            }
            AWSRestOperation.this.onResponse.accept(creVarM59735c != null ? new RestResponse(iM59739h, map, creVarM59735c.m21614c()) : new RestResponse(iM59739h, map));
        }

        private OkHttpCallback() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AWSRestOperation(RestOperationRequest restOperationRequest, String str, hac hacVar, Consumer<RestResponse> consumer, Consumer<ApiException> consumer2) {
        super(restOperationRequest);
        Objects.requireNonNull(restOperationRequest);
        Objects.requireNonNull(str);
        this.endpoint = str;
        Objects.requireNonNull(hacVar);
        this.client = hacVar;
        Objects.requireNonNull(consumer);
        this.onResponse = consumer;
        Objects.requireNonNull(consumer2);
        this.onFailure = consumer2;
    }

    @Override // com.amplifyframework.core.async.Cancelable
    public synchronized void cancel() {
        bt1 bt1Var = this.ongoingCall;
        if (bt1Var != null) {
            bt1Var.cancel();
        }
    }

    @Override // com.amplifyframework.core.async.AmplifyOperation
    public void start() {
        bt1 bt1Var = this.ongoingCall;
        if (bt1Var == null || !bt1Var.isExecuted()) {
            try {
                bt1 bt1VarMo19702a = this.client.mo19702a(RestRequestFactory.createRequest(RestRequestFactory.createURL(this.endpoint, getRequest().getPath(), getRequest().getQueryParameters()), getRequest().getData(), getRequest().getHeaders(), getRequest().getHttpMethod()));
                this.ongoingCall = bt1VarMo19702a;
                FirebasePerfOkHttpClient.enqueue(bt1VarMo19702a, new OkHttpCallback());
            } catch (Exception e) {
                bt1 bt1Var2 = this.ongoingCall;
                if (bt1Var2 != null) {
                    bt1Var2.cancel();
                }
                this.onFailure.accept(new ApiException("OkHttp client failed to make a successful request.", e, "Sorry, we don’t have a recovery suggestion for this error."));
            }
        }
    }
}
