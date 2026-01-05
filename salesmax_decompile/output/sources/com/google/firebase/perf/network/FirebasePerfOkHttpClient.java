package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import p001o.bt1;
import p001o.cre;
import p001o.ule;
import p001o.w48;
import p001o.y9b;
import p001o.z22;
import p001o.zqe;

/* loaded from: classes6.dex */
public class FirebasePerfOkHttpClient {
    private FirebasePerfOkHttpClient() {
    }

    @Keep
    public static void enqueue(bt1 bt1Var, z22 z22Var) {
        Timer timer = new Timer();
        bt1Var.v1(new InstrumentOkHttpEnqueueCallback(z22Var, TransportManager.getInstance(), timer, timer.getMicros()));
    }

    @Keep
    public static zqe execute(bt1 bt1Var) throws IOException {
        NetworkRequestMetricBuilder networkRequestMetricBuilderBuilder = NetworkRequestMetricBuilder.builder(TransportManager.getInstance());
        Timer timer = new Timer();
        long micros = timer.getMicros();
        try {
            zqe zqeVarExecute = bt1Var.execute();
            sendNetworkMetric(zqeVarExecute, networkRequestMetricBuilderBuilder, micros, timer.getDurationMicros());
            return zqeVarExecute;
        } catch (IOException e) {
            ule uleVarRequest = bt1Var.request();
            if (uleVarRequest != null) {
                w48 w48VarM51741l = uleVarRequest.m51741l();
                if (w48VarM51741l != null) {
                    networkRequestMetricBuilderBuilder.setUrl(w48VarM51741l.m53888t().toString());
                }
                if (uleVarRequest.m51737h() != null) {
                    networkRequestMetricBuilderBuilder.setHttpMethod(uleVarRequest.m51737h());
                }
            }
            networkRequestMetricBuilderBuilder.setRequestStartTimeMicros(micros);
            networkRequestMetricBuilderBuilder.setTimeToResponseCompletedMicros(timer.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(networkRequestMetricBuilderBuilder);
            throw e;
        }
    }

    public static void sendNetworkMetric(zqe zqeVar, NetworkRequestMetricBuilder networkRequestMetricBuilder, long j, long j2) {
        ule uleVarM59732Q = zqeVar.m59732Q();
        if (uleVarM59732Q == null) {
            return;
        }
        networkRequestMetricBuilder.setUrl(uleVarM59732Q.m51741l().m53888t().toString());
        networkRequestMetricBuilder.setHttpMethod(uleVarM59732Q.m51737h());
        if (uleVarM59732Q.m51730a() != null) {
            long jMo18953a = uleVarM59732Q.m51730a().mo18953a();
            if (jMo18953a != -1) {
                networkRequestMetricBuilder.setRequestPayloadBytes(jMo18953a);
            }
        }
        cre creVarM59735c = zqeVar.m59735c();
        if (creVarM59735c != null) {
            long jMo21617g = creVarM59735c.mo21617g();
            if (jMo21617g != -1) {
                networkRequestMetricBuilder.setResponsePayloadBytes(jMo21617g);
            }
            y9b y9bVarMo21618h = creVarM59735c.mo21618h();
            if (y9bVarMo21618h != null) {
                networkRequestMetricBuilder.setResponseContentType(y9bVarMo21618h.toString());
            }
        }
        networkRequestMetricBuilder.setHttpResponseCode(zqeVar.m59739h());
        networkRequestMetricBuilder.setRequestStartTimeMicros(j);
        networkRequestMetricBuilder.setTimeToResponseCompletedMicros(j2);
        networkRequestMetricBuilder.build();
    }
}
