package com.amplifyframework.statemachine.codegen.data;

import com.amplifyframework.statemachine.codegen.data.DeviceMetadata;
import com.amplifyframework.statemachine.codegen.data.SignInMethod;
import com.amplifyframework.storage.s3.transfer.TransferStatusUpdater;
import com.amplifyframework.util.AmplifyHttp;
import com.skydoves.balloon.Balloon;
import com.websoptimization.callyzerbiz.MainActivity;
import com.websoptimization.callyzerbiz.NotePopUpActivity;
import com.websoptimization.callyzerbiz.R;
import dy.AbstractC1856d;
import ex.InterfaceC2137a;
import h7.AbstractC2868a;
import k2.C3953b;
import k2.C3977z;
import k2.b1;
import og.pe;
import org.bouncycastle.iana.AEADAlgorithm;
import ps.C6002b;
import ps.C6003c;
import ps.C6004d;
import ps.C6005e;
import ps.C6006f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.amplifyframework.statemachine.codegen.data.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C1226a implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f5907a;

    public /* synthetic */ C1226a(int i10) {
        this.f5907a = i10;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f5907a) {
            case 0:
                return DeviceMetadata._init_$_anonymous_();
            case 1:
                return DeviceMetadata.Empty._init_$_anonymous_();
            case 2:
                return SignInMethod._init_$_anonymous_();
            case 3:
                return SignInMethod.ApiBased._childSerializers$_anonymous_();
            case 4:
                return SignUpData._childSerializers$_anonymous_();
            case 5:
                return SignUpData._childSerializers$_anonymous_$0();
            case 6:
                return SignedInData._childSerializers$_anonymous_();
            case 7:
                return TransferStatusUpdater.transferStatusListenerMap_delegate$lambda$0();
            case 8:
                return TransferStatusUpdater.transferWorkInfoIdMap_delegate$lambda$1();
            case 9:
                return TransferStatusUpdater.multiPartTransferStatusListener_delegate$lambda$2();
            case 10:
                return AmplifyHttp.availableVersion_delegate$lambda$0();
            case 11:
                return Balloon.handler_delegate$lambda$0();
            case 12:
                return Balloon.channel_delegate$lambda$56();
            case 13:
                return Balloon.scope_delegate$lambda$57();
            case 14:
                return 2;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return C3953b.m8517t(Boolean.FALSE);
            case 16:
                return C3953b.m8517t(Boolean.FALSE);
            case 17:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 18:
                int i10 = MainActivity.f7256m;
                return pe.m10834i(C6003c.f29336c.f29356a, C6002b.f29332c.f29356a, C6005e.f29347c.f29356a, C6004d.f29341c.f29356a, C6006f.f29354c.f29356a);
            case 19:
                int i11 = MainActivity.f7256m;
                return C3953b.m8517t(Boolean.FALSE);
            case 20:
                int i12 = MainActivity.f7256m;
                return new b1(R.color.background);
            case 21:
                int i13 = NotePopUpActivity.f7268g;
                return C3953b.m8517t(Boolean.FALSE);
            case 22:
                int i14 = NotePopUpActivity.f7268g;
                return new b1(R.color.background);
            case 23:
                return AbstractC1856d.m5490a();
            case 24:
                C3977z c3977z = AbstractC2868a.f15876a;
                return null;
            case 25:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case 26:
                return C3953b.m8517t(Boolean.FALSE);
            case 27:
                return C3953b.m8517t(null);
            case 28:
                return C3953b.m8517t("");
            default:
                return C3953b.m8517t(Boolean.FALSE);
        }
    }
}
