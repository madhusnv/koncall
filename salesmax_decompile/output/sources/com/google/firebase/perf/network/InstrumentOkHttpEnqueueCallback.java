package com.google.firebase.perf.network;

import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import p001o.bt1;
import p001o.ule;
import p001o.w48;
import p001o.z22;
import p001o.zqe;

/* loaded from: classes6.dex */
public class InstrumentOkHttpEnqueueCallback implements z22 {
    private final z22 callback;
    private final NetworkRequestMetricBuilder networkMetricBuilder;
    private final long startTimeMicros;
    private final Timer timer;

    public InstrumentOkHttpEnqueueCallback(z22 z22Var, TransportManager transportManager, Timer timer, long j) {
        this.callback = z22Var;
        this.networkMetricBuilder = NetworkRequestMetricBuilder.builder(transportManager);
        this.startTimeMicros = j;
        this.timer = timer;
    }

    @Override // p001o.z22
    public void onFailure(bt1 bt1Var, IOException iOException) {
        ule uleVarRequest = bt1Var.request();
        if (uleVarRequest != null) {
            w48 w48VarM51741l = uleVarRequest.m51741l();
            if (w48VarM51741l != null) {
                this.networkMetricBuilder.setUrl(w48VarM51741l.m53888t().toString());
            }
            if (uleVarRequest.m51737h() != null) {
                this.networkMetricBuilder.setHttpMethod(uleVarRequest.m51737h());
            }
        }
        this.networkMetricBuilder.setRequestStartTimeMicros(this.startTimeMicros);
        this.networkMetricBuilder.setTimeToResponseCompletedMicros(this.timer.getDurationMicros());
        NetworkRequestMetricBuilderUtil.logError(this.networkMetricBuilder);
        this.callback.onFailure(bt1Var, iOException);
    }

    @Override // p001o.z22
    public void onResponse(bt1 bt1Var, zqe zqeVar) {
        FirebasePerfOkHttpClient.sendNetworkMetric(zqeVar, this.networkMetricBuilder, this.startTimeMicros, this.timer.getDurationMicros());
        this.callback.onResponse(bt1Var, zqeVar);
    }
}
