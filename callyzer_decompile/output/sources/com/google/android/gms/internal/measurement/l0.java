package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import cg.InterfaceC0968a;
import java.util.Map;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public interface l0 extends IInterface {
    void beginAdUnitExposure(String str, long j6);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j6);

    void endAdUnitExposure(String str, long j6);

    void generateEventId(n0 n0Var);

    void getAppInstanceId(n0 n0Var);

    void getCachedAppInstanceId(n0 n0Var);

    void getConditionalUserProperties(String str, String str2, n0 n0Var);

    void getCurrentScreenClass(n0 n0Var);

    void getCurrentScreenName(n0 n0Var);

    void getGmpAppId(n0 n0Var);

    void getMaxUserProperties(String str, n0 n0Var);

    void getSessionId(n0 n0Var);

    void getTestFlag(n0 n0Var, int i10);

    void getUserProperties(String str, String str2, boolean z6, n0 n0Var);

    void initForTests(Map map);

    void initialize(InterfaceC0968a interfaceC0968a, u0 u0Var, long j6);

    void isDataCollectionEnabled(n0 n0Var);

    void logEvent(String str, String str2, Bundle bundle, boolean z6, boolean z10, long j6);

    void logEventAndBundle(String str, String str2, Bundle bundle, n0 n0Var, long j6);

    void logHealthData(int i10, String str, InterfaceC0968a interfaceC0968a, InterfaceC0968a interfaceC0968a2, InterfaceC0968a interfaceC0968a3);

    void onActivityCreated(InterfaceC0968a interfaceC0968a, Bundle bundle, long j6);

    void onActivityCreatedByScionActivityInfo(w0 w0Var, Bundle bundle, long j6);

    void onActivityDestroyed(InterfaceC0968a interfaceC0968a, long j6);

    void onActivityDestroyedByScionActivityInfo(w0 w0Var, long j6);

    void onActivityPaused(InterfaceC0968a interfaceC0968a, long j6);

    void onActivityPausedByScionActivityInfo(w0 w0Var, long j6);

    void onActivityResumed(InterfaceC0968a interfaceC0968a, long j6);

    void onActivityResumedByScionActivityInfo(w0 w0Var, long j6);

    void onActivitySaveInstanceState(InterfaceC0968a interfaceC0968a, n0 n0Var, long j6);

    void onActivitySaveInstanceStateByScionActivityInfo(w0 w0Var, n0 n0Var, long j6);

    void onActivityStarted(InterfaceC0968a interfaceC0968a, long j6);

    void onActivityStartedByScionActivityInfo(w0 w0Var, long j6);

    void onActivityStopped(InterfaceC0968a interfaceC0968a, long j6);

    void onActivityStoppedByScionActivityInfo(w0 w0Var, long j6);

    void performAction(Bundle bundle, n0 n0Var, long j6);

    void registerOnMeasurementEventListener(r0 r0Var);

    void resetAnalyticsData(long j6);

    void retrieveAndUploadBatches(p0 p0Var);

    void setConditionalUserProperty(Bundle bundle, long j6);

    void setConsent(Bundle bundle, long j6);

    void setConsentThirdParty(Bundle bundle, long j6);

    void setCurrentScreen(InterfaceC0968a interfaceC0968a, String str, String str2, long j6);

    void setCurrentScreenByScionActivityInfo(w0 w0Var, String str, String str2, long j6);

    void setDataCollectionEnabled(boolean z6);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(r0 r0Var);

    void setInstanceIdProvider(t0 t0Var);

    void setMeasurementEnabled(boolean z6, long j6);

    void setMinimumSessionDuration(long j6);

    void setSessionTimeoutDuration(long j6);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j6);

    void setUserProperty(String str, String str2, InterfaceC0968a interfaceC0968a, boolean z6, long j6);

    void unregisterOnMeasurementEventListener(r0 r0Var);
}
