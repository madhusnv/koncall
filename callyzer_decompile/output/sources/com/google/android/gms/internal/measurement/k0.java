package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import cg.BinderC0969b;
import cg.InterfaceC0968a;
import java.util.HashMap;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.agreement.jpake.JPAKEParticipant;
import org.bouncycastle.iana.AEADAlgorithm;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class k0 extends AbstractBinderC1309y implements l0 {
    public static l0 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return iInterfaceQueryLocalInterface instanceof l0 ? (l0) iInterfaceQueryLocalInterface : new j0(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService", 0);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractBinderC1309y
    /* renamed from: d */
    public final boolean mo3185d(int i10, Parcel parcel, Parcel parcel2) {
        boolean z6;
        n0 m0Var = null;
        p0 o0Var = null;
        n0 m0Var2 = null;
        n0 m0Var3 = null;
        n0 m0Var4 = null;
        n0 m0Var5 = null;
        r0 q0Var = null;
        r0 q0Var2 = null;
        r0 q0Var3 = null;
        n0 m0Var6 = null;
        n0 m0Var7 = null;
        n0 m0Var8 = null;
        n0 m0Var9 = null;
        n0 m0Var10 = null;
        n0 m0Var11 = null;
        t0 s0Var = null;
        n0 m0Var12 = null;
        n0 m0Var13 = null;
        n0 m0Var14 = null;
        n0 m0Var15 = null;
        n0 m0Var16 = null;
        switch (i10) {
            case 1:
                InterfaceC0968a interfaceC0968aM2726R = BinderC0969b.m2726R(parcel.readStrongBinder());
                u0 u0Var = (u0) AbstractC1310z.m3795a(parcel, u0.CREATOR);
                long j6 = parcel.readLong();
                AbstractC1310z.m3798d(parcel);
                initialize(interfaceC0968aM2726R, u0Var, j6);
                break;
            case 2:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle = (Bundle) AbstractC1310z.m3795a(parcel, Bundle.CREATOR);
                boolean z10 = parcel.readInt() != 0;
                boolean z11 = parcel.readInt() != 0;
                long j10 = parcel.readLong();
                AbstractC1310z.m3798d(parcel);
                logEvent(string, string2, bundle, z10, z11, j10);
                break;
            case 3:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                Bundle bundle2 = (Bundle) AbstractC1310z.m3795a(parcel, Bundle.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    m0Var = iInterfaceQueryLocalInterface instanceof n0 ? (n0) iInterfaceQueryLocalInterface : new m0(strongBinder);
                }
                n0 n0Var = m0Var;
                long j11 = parcel.readLong();
                AbstractC1310z.m3798d(parcel);
                logEventAndBundle(string3, string4, bundle2, n0Var, j11);
                break;
            case 4:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                InterfaceC0968a interfaceC0968aM2726R2 = BinderC0969b.m2726R(parcel.readStrongBinder());
                ClassLoader classLoader = AbstractC1310z.f6461a;
                z6 = parcel.readInt() != 0;
                long j12 = parcel.readLong();
                AbstractC1310z.m3798d(parcel);
                setUserProperty(string5, string6, interfaceC0968aM2726R2, z6, j12);
                break;
            case 5:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                ClassLoader classLoader2 = AbstractC1310z.f6461a;
                z6 = parcel.readInt() != 0;
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    m0Var16 = iInterfaceQueryLocalInterface2 instanceof n0 ? (n0) iInterfaceQueryLocalInterface2 : new m0(strongBinder2);
                }
                AbstractC1310z.m3798d(parcel);
                getUserProperties(string7, string8, z6, m0Var16);
                break;
            case 6:
                String string9 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    m0Var15 = iInterfaceQueryLocalInterface3 instanceof n0 ? (n0) iInterfaceQueryLocalInterface3 : new m0(strongBinder3);
                }
                AbstractC1310z.m3798d(parcel);
                getMaxUserProperties(string9, m0Var15);
                break;
            case 7:
                String string10 = parcel.readString();
                long j13 = parcel.readLong();
                AbstractC1310z.m3798d(parcel);
                setUserId(string10, j13);
                break;
            case 8:
                Bundle bundle3 = (Bundle) AbstractC1310z.m3795a(parcel, Bundle.CREATOR);
                long j14 = parcel.readLong();
                AbstractC1310z.m3798d(parcel);
                setConditionalUserProperty(bundle3, j14);
                break;
            case 9:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                Bundle bundle4 = (Bundle) AbstractC1310z.m3795a(parcel, Bundle.CREATOR);
                AbstractC1310z.m3798d(parcel);
                clearConditionalUserProperty(string11, string12, bundle4);
                break;
            case 10:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    m0Var14 = iInterfaceQueryLocalInterface4 instanceof n0 ? (n0) iInterfaceQueryLocalInterface4 : new m0(strongBinder4);
                }
                AbstractC1310z.m3798d(parcel);
                getConditionalUserProperties(string13, string14, m0Var14);
                break;
            case 11:
                ClassLoader classLoader3 = AbstractC1310z.f6461a;
                z6 = parcel.readInt() != 0;
                long j15 = parcel.readLong();
                AbstractC1310z.m3798d(parcel);
                setMeasurementEnabled(z6, j15);
                break;
            case 12:
                long j16 = parcel.readLong();
                AbstractC1310z.m3798d(parcel);
                resetAnalyticsData(j16);
                break;
            case 13:
                long j17 = parcel.readLong();
                AbstractC1310z.m3798d(parcel);
                setMinimumSessionDuration(j17);
                break;
            case 14:
                long j18 = parcel.readLong();
                AbstractC1310z.m3798d(parcel);
                setSessionTimeoutDuration(j18);
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                InterfaceC0968a interfaceC0968aM2726R3 = BinderC0969b.m2726R(parcel.readStrongBinder());
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                long j19 = parcel.readLong();
                AbstractC1310z.m3798d(parcel);
                setCurrentScreen(interfaceC0968aM2726R3, string15, string16, j19);
                break;
            case 16:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    m0Var13 = iInterfaceQueryLocalInterface5 instanceof n0 ? (n0) iInterfaceQueryLocalInterface5 : new m0(strongBinder5);
                }
                AbstractC1310z.m3798d(parcel);
                getCurrentScreenName(m0Var13);
                break;
            case 17:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    m0Var12 = iInterfaceQueryLocalInterface6 instanceof n0 ? (n0) iInterfaceQueryLocalInterface6 : new m0(strongBinder6);
                }
                AbstractC1310z.m3798d(parcel);
                getCurrentScreenClass(m0Var12);
                break;
            case 18:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    s0Var = iInterfaceQueryLocalInterface7 instanceof t0 ? (t0) iInterfaceQueryLocalInterface7 : new s0(strongBinder7, "com.google.android.gms.measurement.api.internal.IStringProvider", 0);
                }
                AbstractC1310z.m3798d(parcel);
                setInstanceIdProvider(s0Var);
                break;
            case 19:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    m0Var11 = iInterfaceQueryLocalInterface8 instanceof n0 ? (n0) iInterfaceQueryLocalInterface8 : new m0(strongBinder8);
                }
                AbstractC1310z.m3798d(parcel);
                getCachedAppInstanceId(m0Var11);
                break;
            case 20:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    m0Var10 = iInterfaceQueryLocalInterface9 instanceof n0 ? (n0) iInterfaceQueryLocalInterface9 : new m0(strongBinder9);
                }
                AbstractC1310z.m3798d(parcel);
                getAppInstanceId(m0Var10);
                break;
            case 21:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    m0Var9 = iInterfaceQueryLocalInterface10 instanceof n0 ? (n0) iInterfaceQueryLocalInterface10 : new m0(strongBinder10);
                }
                AbstractC1310z.m3798d(parcel);
                getGmpAppId(m0Var9);
                break;
            case 22:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    m0Var8 = iInterfaceQueryLocalInterface11 instanceof n0 ? (n0) iInterfaceQueryLocalInterface11 : new m0(strongBinder11);
                }
                AbstractC1310z.m3798d(parcel);
                generateEventId(m0Var8);
                break;
            case 23:
                String string17 = parcel.readString();
                long j20 = parcel.readLong();
                AbstractC1310z.m3798d(parcel);
                beginAdUnitExposure(string17, j20);
                break;
            case 24:
                String string18 = parcel.readString();
                long j21 = parcel.readLong();
                AbstractC1310z.m3798d(parcel);
                endAdUnitExposure(string18, j21);
                break;
            case 25:
                InterfaceC0968a interfaceC0968aM2726R4 = BinderC0969b.m2726R(parcel.readStrongBinder());
                long j22 = parcel.readLong();
                AbstractC1310z.m3798d(parcel);
                onActivityStarted(interfaceC0968aM2726R4, j22);
                break;
            case 26:
                InterfaceC0968a interfaceC0968aM2726R5 = BinderC0969b.m2726R(parcel.readStrongBinder());
                long j23 = parcel.readLong();
                AbstractC1310z.m3798d(parcel);
                onActivityStopped(interfaceC0968aM2726R5, j23);
                break;
            case 27:
                InterfaceC0968a interfaceC0968aM2726R6 = BinderC0969b.m2726R(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) AbstractC1310z.m3795a(parcel, Bundle.CREATOR);
                long j24 = parcel.readLong();
                AbstractC1310z.m3798d(parcel);
                onActivityCreated(interfaceC0968aM2726R6, bundle5, j24);
                break;
            case 28:
                InterfaceC0968a interfaceC0968aM2726R7 = BinderC0969b.m2726R(parcel.readStrongBinder());
                long j25 = parcel.readLong();
                AbstractC1310z.m3798d(parcel);
                onActivityDestroyed(interfaceC0968aM2726R7, j25);
                break;
            case 29:
                InterfaceC0968a interfaceC0968aM2726R8 = BinderC0969b.m2726R(parcel.readStrongBinder());
                long j26 = parcel.readLong();
                AbstractC1310z.m3798d(parcel);
                onActivityPaused(interfaceC0968aM2726R8, j26);
                break;
            case 30:
                InterfaceC0968a interfaceC0968aM2726R9 = BinderC0969b.m2726R(parcel.readStrongBinder());
                long j27 = parcel.readLong();
                AbstractC1310z.m3798d(parcel);
                onActivityResumed(interfaceC0968aM2726R9, j27);
                break;
            case BERTags.DATE /* 31 */:
                InterfaceC0968a interfaceC0968aM2726R10 = BinderC0969b.m2726R(parcel.readStrongBinder());
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    m0Var7 = iInterfaceQueryLocalInterface12 instanceof n0 ? (n0) iInterfaceQueryLocalInterface12 : new m0(strongBinder12);
                }
                long j28 = parcel.readLong();
                AbstractC1310z.m3798d(parcel);
                onActivitySaveInstanceState(interfaceC0968aM2726R10, m0Var7, j28);
                break;
            case 32:
                Bundle bundle6 = (Bundle) AbstractC1310z.m3795a(parcel, Bundle.CREATOR);
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    m0Var6 = iInterfaceQueryLocalInterface13 instanceof n0 ? (n0) iInterfaceQueryLocalInterface13 : new m0(strongBinder13);
                }
                long j29 = parcel.readLong();
                AbstractC1310z.m3798d(parcel);
                performAction(bundle6, m0Var6, j29);
                break;
            case BERTags.DATE_TIME /* 33 */:
                int i11 = parcel.readInt();
                String string19 = parcel.readString();
                InterfaceC0968a interfaceC0968aM2726R11 = BinderC0969b.m2726R(parcel.readStrongBinder());
                InterfaceC0968a interfaceC0968aM2726R12 = BinderC0969b.m2726R(parcel.readStrongBinder());
                InterfaceC0968a interfaceC0968aM2726R13 = BinderC0969b.m2726R(parcel.readStrongBinder());
                AbstractC1310z.m3798d(parcel);
                logHealthData(i11, string19, interfaceC0968aM2726R11, interfaceC0968aM2726R12, interfaceC0968aM2726R13);
                break;
            case BERTags.DURATION /* 34 */:
                IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    q0Var3 = iInterfaceQueryLocalInterface14 instanceof r0 ? (r0) iInterfaceQueryLocalInterface14 : new q0(strongBinder14);
                }
                AbstractC1310z.m3798d(parcel);
                setEventInterceptor(q0Var3);
                break;
            case BERTags.OBJECT_IDENTIFIER_IRI /* 35 */:
                IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    q0Var2 = iInterfaceQueryLocalInterface15 instanceof r0 ? (r0) iInterfaceQueryLocalInterface15 : new q0(strongBinder15);
                }
                AbstractC1310z.m3798d(parcel);
                registerOnMeasurementEventListener(q0Var2);
                break;
            case BERTags.RELATIVE_OID_IRI /* 36 */:
                IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    q0Var = iInterfaceQueryLocalInterface16 instanceof r0 ? (r0) iInterfaceQueryLocalInterface16 : new q0(strongBinder16);
                }
                AbstractC1310z.m3798d(parcel);
                unregisterOnMeasurementEventListener(q0Var);
                break;
            case 37:
                HashMap hashMap = parcel.readHashMap(AbstractC1310z.f6461a);
                AbstractC1310z.m3798d(parcel);
                initForTests(hashMap);
                break;
            case 38:
                IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    m0Var5 = iInterfaceQueryLocalInterface17 instanceof n0 ? (n0) iInterfaceQueryLocalInterface17 : new m0(strongBinder17);
                }
                int i12 = parcel.readInt();
                AbstractC1310z.m3798d(parcel);
                getTestFlag(m0Var5, i12);
                break;
            case 39:
                ClassLoader classLoader4 = AbstractC1310z.f6461a;
                z6 = parcel.readInt() != 0;
                AbstractC1310z.m3798d(parcel);
                setDataCollectionEnabled(z6);
                break;
            case JPAKEParticipant.STATE_ROUND_2_VALIDATED /* 40 */:
                IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 != null) {
                    IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    m0Var4 = iInterfaceQueryLocalInterface18 instanceof n0 ? (n0) iInterfaceQueryLocalInterface18 : new m0(strongBinder18);
                }
                AbstractC1310z.m3798d(parcel);
                isDataCollectionEnabled(m0Var4);
                break;
            case 41:
            case 47:
            case 49:
            default:
                return false;
            case 42:
                Bundle bundle7 = (Bundle) AbstractC1310z.m3795a(parcel, Bundle.CREATOR);
                AbstractC1310z.m3798d(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case 43:
                long j30 = parcel.readLong();
                AbstractC1310z.m3798d(parcel);
                clearMeasurementEnabled(j30);
                break;
            case 44:
                Bundle bundle8 = (Bundle) AbstractC1310z.m3795a(parcel, Bundle.CREATOR);
                long j31 = parcel.readLong();
                AbstractC1310z.m3798d(parcel);
                setConsent(bundle8, j31);
                break;
            case 45:
                Bundle bundle9 = (Bundle) AbstractC1310z.m3795a(parcel, Bundle.CREATOR);
                long j32 = parcel.readLong();
                AbstractC1310z.m3798d(parcel);
                setConsentThirdParty(bundle9, j32);
                break;
            case 46:
                IBinder strongBinder19 = parcel.readStrongBinder();
                if (strongBinder19 != null) {
                    IInterface iInterfaceQueryLocalInterface19 = strongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    m0Var3 = iInterfaceQueryLocalInterface19 instanceof n0 ? (n0) iInterfaceQueryLocalInterface19 : new m0(strongBinder19);
                }
                AbstractC1310z.m3798d(parcel);
                getSessionId(m0Var3);
                break;
            case 48:
                Intent intent = (Intent) AbstractC1310z.m3795a(parcel, Intent.CREATOR);
                AbstractC1310z.m3798d(parcel);
                setSgtmDebugInfo(intent);
                break;
            case 50:
                w0 w0Var = (w0) AbstractC1310z.m3795a(parcel, w0.CREATOR);
                String string20 = parcel.readString();
                String string21 = parcel.readString();
                long j33 = parcel.readLong();
                AbstractC1310z.m3798d(parcel);
                setCurrentScreenByScionActivityInfo(w0Var, string20, string21, j33);
                break;
            case 51:
                w0 w0Var2 = (w0) AbstractC1310z.m3795a(parcel, w0.CREATOR);
                long j34 = parcel.readLong();
                AbstractC1310z.m3798d(parcel);
                onActivityStartedByScionActivityInfo(w0Var2, j34);
                break;
            case 52:
                w0 w0Var3 = (w0) AbstractC1310z.m3795a(parcel, w0.CREATOR);
                long j35 = parcel.readLong();
                AbstractC1310z.m3798d(parcel);
                onActivityStoppedByScionActivityInfo(w0Var3, j35);
                break;
            case 53:
                w0 w0Var4 = (w0) AbstractC1310z.m3795a(parcel, w0.CREATOR);
                Bundle bundle10 = (Bundle) AbstractC1310z.m3795a(parcel, Bundle.CREATOR);
                long j36 = parcel.readLong();
                AbstractC1310z.m3798d(parcel);
                onActivityCreatedByScionActivityInfo(w0Var4, bundle10, j36);
                break;
            case 54:
                w0 w0Var5 = (w0) AbstractC1310z.m3795a(parcel, w0.CREATOR);
                long j37 = parcel.readLong();
                AbstractC1310z.m3798d(parcel);
                onActivityDestroyedByScionActivityInfo(w0Var5, j37);
                break;
            case 55:
                w0 w0Var6 = (w0) AbstractC1310z.m3795a(parcel, w0.CREATOR);
                long j38 = parcel.readLong();
                AbstractC1310z.m3798d(parcel);
                onActivityPausedByScionActivityInfo(w0Var6, j38);
                break;
            case 56:
                w0 w0Var7 = (w0) AbstractC1310z.m3795a(parcel, w0.CREATOR);
                long j39 = parcel.readLong();
                AbstractC1310z.m3798d(parcel);
                onActivityResumedByScionActivityInfo(w0Var7, j39);
                break;
            case 57:
                w0 w0Var8 = (w0) AbstractC1310z.m3795a(parcel, w0.CREATOR);
                IBinder strongBinder20 = parcel.readStrongBinder();
                if (strongBinder20 != null) {
                    IInterface iInterfaceQueryLocalInterface20 = strongBinder20.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    m0Var2 = iInterfaceQueryLocalInterface20 instanceof n0 ? (n0) iInterfaceQueryLocalInterface20 : new m0(strongBinder20);
                }
                long j40 = parcel.readLong();
                AbstractC1310z.m3798d(parcel);
                onActivitySaveInstanceStateByScionActivityInfo(w0Var8, m0Var2, j40);
                break;
            case 58:
                IBinder strongBinder21 = parcel.readStrongBinder();
                if (strongBinder21 != null) {
                    IInterface iInterfaceQueryLocalInterface21 = strongBinder21.queryLocalInterface("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
                    o0Var = iInterfaceQueryLocalInterface21 instanceof p0 ? (p0) iInterfaceQueryLocalInterface21 : new o0(strongBinder21, "com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback", 0);
                }
                AbstractC1310z.m3798d(parcel);
                retrieveAndUploadBatches(o0Var);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
