package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import cg.InterfaceC0968a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class j0 extends AbstractC1308x implements l0 {
    @Override // com.google.android.gms.internal.measurement.l0
    public final void beginAdUnitExposure(String str, long j6) {
        Parcel parcelM3750Q = m3750Q();
        parcelM3750Q.writeString(str);
        parcelM3750Q.writeLong(j6);
        m3752S(parcelM3750Q, 23);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel parcelM3750Q = m3750Q();
        parcelM3750Q.writeString(str);
        parcelM3750Q.writeString(str2);
        AbstractC1310z.m3796b(parcelM3750Q, bundle);
        m3752S(parcelM3750Q, 9);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void endAdUnitExposure(String str, long j6) {
        Parcel parcelM3750Q = m3750Q();
        parcelM3750Q.writeString(str);
        parcelM3750Q.writeLong(j6);
        m3752S(parcelM3750Q, 24);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void generateEventId(n0 n0Var) {
        Parcel parcelM3750Q = m3750Q();
        AbstractC1310z.m3797c(parcelM3750Q, n0Var);
        m3752S(parcelM3750Q, 22);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void getCachedAppInstanceId(n0 n0Var) {
        Parcel parcelM3750Q = m3750Q();
        AbstractC1310z.m3797c(parcelM3750Q, n0Var);
        m3752S(parcelM3750Q, 19);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void getConditionalUserProperties(String str, String str2, n0 n0Var) {
        Parcel parcelM3750Q = m3750Q();
        parcelM3750Q.writeString(str);
        parcelM3750Q.writeString(str2);
        AbstractC1310z.m3797c(parcelM3750Q, n0Var);
        m3752S(parcelM3750Q, 10);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void getCurrentScreenClass(n0 n0Var) {
        Parcel parcelM3750Q = m3750Q();
        AbstractC1310z.m3797c(parcelM3750Q, n0Var);
        m3752S(parcelM3750Q, 17);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void getCurrentScreenName(n0 n0Var) {
        Parcel parcelM3750Q = m3750Q();
        AbstractC1310z.m3797c(parcelM3750Q, n0Var);
        m3752S(parcelM3750Q, 16);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void getGmpAppId(n0 n0Var) {
        Parcel parcelM3750Q = m3750Q();
        AbstractC1310z.m3797c(parcelM3750Q, n0Var);
        m3752S(parcelM3750Q, 21);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void getMaxUserProperties(String str, n0 n0Var) {
        Parcel parcelM3750Q = m3750Q();
        parcelM3750Q.writeString(str);
        AbstractC1310z.m3797c(parcelM3750Q, n0Var);
        m3752S(parcelM3750Q, 6);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void getUserProperties(String str, String str2, boolean z6, n0 n0Var) {
        Parcel parcelM3750Q = m3750Q();
        parcelM3750Q.writeString(str);
        parcelM3750Q.writeString(str2);
        ClassLoader classLoader = AbstractC1310z.f6461a;
        parcelM3750Q.writeInt(z6 ? 1 : 0);
        AbstractC1310z.m3797c(parcelM3750Q, n0Var);
        m3752S(parcelM3750Q, 5);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void initialize(InterfaceC0968a interfaceC0968a, u0 u0Var, long j6) {
        Parcel parcelM3750Q = m3750Q();
        AbstractC1310z.m3797c(parcelM3750Q, interfaceC0968a);
        AbstractC1310z.m3796b(parcelM3750Q, u0Var);
        parcelM3750Q.writeLong(j6);
        m3752S(parcelM3750Q, 1);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void logEvent(String str, String str2, Bundle bundle, boolean z6, boolean z10, long j6) {
        Parcel parcelM3750Q = m3750Q();
        parcelM3750Q.writeString(str);
        parcelM3750Q.writeString(str2);
        AbstractC1310z.m3796b(parcelM3750Q, bundle);
        parcelM3750Q.writeInt(1);
        parcelM3750Q.writeInt(1);
        parcelM3750Q.writeLong(j6);
        m3752S(parcelM3750Q, 2);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void logHealthData(int i10, String str, InterfaceC0968a interfaceC0968a, InterfaceC0968a interfaceC0968a2, InterfaceC0968a interfaceC0968a3) {
        Parcel parcelM3750Q = m3750Q();
        parcelM3750Q.writeInt(5);
        parcelM3750Q.writeString("Error with data collection. Data lost.");
        AbstractC1310z.m3797c(parcelM3750Q, interfaceC0968a);
        AbstractC1310z.m3797c(parcelM3750Q, interfaceC0968a2);
        AbstractC1310z.m3797c(parcelM3750Q, interfaceC0968a3);
        m3752S(parcelM3750Q, 33);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void onActivityCreatedByScionActivityInfo(w0 w0Var, Bundle bundle, long j6) {
        Parcel parcelM3750Q = m3750Q();
        AbstractC1310z.m3796b(parcelM3750Q, w0Var);
        AbstractC1310z.m3796b(parcelM3750Q, bundle);
        parcelM3750Q.writeLong(j6);
        m3752S(parcelM3750Q, 53);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void onActivityDestroyedByScionActivityInfo(w0 w0Var, long j6) {
        Parcel parcelM3750Q = m3750Q();
        AbstractC1310z.m3796b(parcelM3750Q, w0Var);
        parcelM3750Q.writeLong(j6);
        m3752S(parcelM3750Q, 54);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void onActivityPausedByScionActivityInfo(w0 w0Var, long j6) {
        Parcel parcelM3750Q = m3750Q();
        AbstractC1310z.m3796b(parcelM3750Q, w0Var);
        parcelM3750Q.writeLong(j6);
        m3752S(parcelM3750Q, 55);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void onActivityResumedByScionActivityInfo(w0 w0Var, long j6) {
        Parcel parcelM3750Q = m3750Q();
        AbstractC1310z.m3796b(parcelM3750Q, w0Var);
        parcelM3750Q.writeLong(j6);
        m3752S(parcelM3750Q, 56);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void onActivitySaveInstanceStateByScionActivityInfo(w0 w0Var, n0 n0Var, long j6) {
        Parcel parcelM3750Q = m3750Q();
        AbstractC1310z.m3796b(parcelM3750Q, w0Var);
        AbstractC1310z.m3797c(parcelM3750Q, n0Var);
        parcelM3750Q.writeLong(j6);
        m3752S(parcelM3750Q, 57);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void onActivityStartedByScionActivityInfo(w0 w0Var, long j6) {
        Parcel parcelM3750Q = m3750Q();
        AbstractC1310z.m3796b(parcelM3750Q, w0Var);
        parcelM3750Q.writeLong(j6);
        m3752S(parcelM3750Q, 51);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void onActivityStoppedByScionActivityInfo(w0 w0Var, long j6) {
        Parcel parcelM3750Q = m3750Q();
        AbstractC1310z.m3796b(parcelM3750Q, w0Var);
        parcelM3750Q.writeLong(j6);
        m3752S(parcelM3750Q, 52);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void registerOnMeasurementEventListener(r0 r0Var) {
        Parcel parcelM3750Q = m3750Q();
        AbstractC1310z.m3797c(parcelM3750Q, r0Var);
        m3752S(parcelM3750Q, 35);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void retrieveAndUploadBatches(p0 p0Var) {
        Parcel parcelM3750Q = m3750Q();
        AbstractC1310z.m3797c(parcelM3750Q, p0Var);
        m3752S(parcelM3750Q, 58);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void setConditionalUserProperty(Bundle bundle, long j6) {
        Parcel parcelM3750Q = m3750Q();
        AbstractC1310z.m3796b(parcelM3750Q, bundle);
        parcelM3750Q.writeLong(j6);
        m3752S(parcelM3750Q, 8);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void setCurrentScreenByScionActivityInfo(w0 w0Var, String str, String str2, long j6) {
        Parcel parcelM3750Q = m3750Q();
        AbstractC1310z.m3796b(parcelM3750Q, w0Var);
        parcelM3750Q.writeString(str);
        parcelM3750Q.writeString(str2);
        parcelM3750Q.writeLong(j6);
        m3752S(parcelM3750Q, 50);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void setDataCollectionEnabled(boolean z6) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void setUserProperty(String str, String str2, InterfaceC0968a interfaceC0968a, boolean z6, long j6) {
        Parcel parcelM3750Q = m3750Q();
        parcelM3750Q.writeString("fcm");
        parcelM3750Q.writeString("_ln");
        AbstractC1310z.m3797c(parcelM3750Q, interfaceC0968a);
        parcelM3750Q.writeInt(1);
        parcelM3750Q.writeLong(j6);
        m3752S(parcelM3750Q, 4);
    }
}
