package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.util.URLWrapper;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes6.dex */
public class FirebasePerfUrlConnection {
    private FirebasePerfUrlConnection() {
    }

    @Keep
    public static Object getContent(URL url) {
        return getContent(new URLWrapper(url), TransportManager.getInstance(), new Timer());
    }

    @Keep
    public static Object instrument(Object obj) {
        return obj instanceof HttpsURLConnection ? new InstrHttpsURLConnection((HttpsURLConnection) obj, new Timer(), NetworkRequestMetricBuilder.builder(TransportManager.getInstance())) : obj instanceof HttpURLConnection ? new InstrHttpURLConnection((HttpURLConnection) obj, new Timer(), NetworkRequestMetricBuilder.builder(TransportManager.getInstance())) : obj;
    }

    @Keep
    public static InputStream openStream(URL url) {
        return openStream(new URLWrapper(url), TransportManager.getInstance(), new Timer());
    }

    @Keep
    public static Object getContent(URL url, Class[] clsArr) {
        return getContent(new URLWrapper(url), clsArr, TransportManager.getInstance(), new Timer());
    }

    public static InputStream openStream(URLWrapper uRLWrapper, TransportManager transportManager, Timer timer) throws IOException {
        timer.reset();
        long micros = timer.getMicros();
        NetworkRequestMetricBuilder networkRequestMetricBuilderBuilder = NetworkRequestMetricBuilder.builder(transportManager);
        try {
            URLConnection uRLConnectionOpenConnection = uRLWrapper.openConnection();
            return uRLConnectionOpenConnection instanceof HttpsURLConnection ? new InstrHttpsURLConnection((HttpsURLConnection) uRLConnectionOpenConnection, timer, networkRequestMetricBuilderBuilder).getInputStream() : uRLConnectionOpenConnection instanceof HttpURLConnection ? new InstrHttpURLConnection((HttpURLConnection) uRLConnectionOpenConnection, timer, networkRequestMetricBuilderBuilder).getInputStream() : uRLConnectionOpenConnection.getInputStream();
        } catch (IOException e) {
            networkRequestMetricBuilderBuilder.setRequestStartTimeMicros(micros);
            networkRequestMetricBuilderBuilder.setTimeToResponseCompletedMicros(timer.getDurationMicros());
            networkRequestMetricBuilderBuilder.setUrl(uRLWrapper.toString());
            NetworkRequestMetricBuilderUtil.logError(networkRequestMetricBuilderBuilder);
            throw e;
        }
    }

    public static Object getContent(URLWrapper uRLWrapper, TransportManager transportManager, Timer timer) throws IOException {
        timer.reset();
        long micros = timer.getMicros();
        NetworkRequestMetricBuilder networkRequestMetricBuilderBuilder = NetworkRequestMetricBuilder.builder(transportManager);
        try {
            URLConnection uRLConnectionOpenConnection = uRLWrapper.openConnection();
            if (uRLConnectionOpenConnection instanceof HttpsURLConnection) {
                return new InstrHttpsURLConnection((HttpsURLConnection) uRLConnectionOpenConnection, timer, networkRequestMetricBuilderBuilder).getContent();
            }
            if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                return new InstrHttpURLConnection((HttpURLConnection) uRLConnectionOpenConnection, timer, networkRequestMetricBuilderBuilder).getContent();
            }
            return uRLConnectionOpenConnection.getContent();
        } catch (IOException e) {
            networkRequestMetricBuilderBuilder.setRequestStartTimeMicros(micros);
            networkRequestMetricBuilderBuilder.setTimeToResponseCompletedMicros(timer.getDurationMicros());
            networkRequestMetricBuilderBuilder.setUrl(uRLWrapper.toString());
            NetworkRequestMetricBuilderUtil.logError(networkRequestMetricBuilderBuilder);
            throw e;
        }
    }

    public static Object getContent(URLWrapper uRLWrapper, Class[] clsArr, TransportManager transportManager, Timer timer) throws IOException {
        timer.reset();
        long micros = timer.getMicros();
        NetworkRequestMetricBuilder networkRequestMetricBuilderBuilder = NetworkRequestMetricBuilder.builder(transportManager);
        try {
            URLConnection uRLConnectionOpenConnection = uRLWrapper.openConnection();
            if (uRLConnectionOpenConnection instanceof HttpsURLConnection) {
                return new InstrHttpsURLConnection((HttpsURLConnection) uRLConnectionOpenConnection, timer, networkRequestMetricBuilderBuilder).getContent(clsArr);
            }
            if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                return new InstrHttpURLConnection((HttpURLConnection) uRLConnectionOpenConnection, timer, networkRequestMetricBuilderBuilder).getContent(clsArr);
            }
            return uRLConnectionOpenConnection.getContent(clsArr);
        } catch (IOException e) {
            networkRequestMetricBuilderBuilder.setRequestStartTimeMicros(micros);
            networkRequestMetricBuilderBuilder.setTimeToResponseCompletedMicros(timer.getDurationMicros());
            networkRequestMetricBuilderBuilder.setUrl(uRLWrapper.toString());
            NetworkRequestMetricBuilderUtil.logError(networkRequestMetricBuilderBuilder);
            throw e;
        }
    }
}
