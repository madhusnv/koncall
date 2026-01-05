package aw;

import com.amplifyframework.core.configuration.AmplifyOutputsData;
import com.amplifyframework.core.configuration.AmplifyOutputsDataImpl;
import com.amplifyframework.statemachine.codegen.data.AmplifyCredential;
import com.amplifyframework.statemachine.codegen.data.AuthChallenge;
import ex.InterfaceC2137a;
import org.bouncycastle.iana.AEADAlgorithm;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: aw.f */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0466f implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f3347a;

    public /* synthetic */ C0466f(int i10) {
        this.f3347a = i10;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f3347a) {
            case 0:
                return 1000000000;
            case 1:
                return new StringBuilder(">>>>>>>>>>SyncNotificationManager<<<<<<<<\n");
            case 2:
                return qw.a0.f30746a;
            case 3:
                return qw.a0.f30746a;
            case 4:
                return qw.a0.f30746a;
            case 5:
                return AmplifyOutputsData.Auth.Oauth.ResponseType._init_$_anonymous_();
            case 6:
                return AmplifyOutputsData.Auth.UserVerificationTypes._init_$_anonymous_();
            case 7:
                return AmplifyOutputsData.Auth.UsernameAttributes._init_$_anonymous_();
            case 8:
                return AmplifyOutputsDataImpl.Auth._childSerializers$_anonymous_();
            case 9:
                return AmplifyOutputsDataImpl.Auth._childSerializers$_anonymous_$0();
            case 10:
                return AmplifyOutputsDataImpl.Auth._childSerializers$_anonymous_$1();
            case 11:
                return AmplifyOutputsDataImpl.Auth._childSerializers$_anonymous_$2();
            case 12:
                return AmplifyOutputsDataImpl.Auth._childSerializers$_anonymous_$3();
            case 13:
                return AmplifyOutputsDataImpl.Auth.Oauth._childSerializers$_anonymous_();
            case 14:
                return AmplifyOutputsDataImpl.Auth.Oauth._childSerializers$_anonymous_$0();
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return AmplifyOutputsDataImpl.Auth.Oauth._childSerializers$_anonymous_$1();
            case 16:
                return AmplifyOutputsDataImpl.Auth.Oauth._childSerializers$_anonymous_$2();
            case 17:
                return AmplifyOutputsDataImpl.Auth.Oauth._childSerializers$_anonymous_$3();
            case 18:
                return AmplifyOutputsDataImpl.Data._childSerializers$_anonymous_();
            case 19:
                return AmplifyOutputsDataImpl.Data._childSerializers$_anonymous_$0();
            case 20:
                return AmplifyOutputsDataImpl.Geo.GeofenceCollections._childSerializers$_anonymous_();
            case 21:
                return AmplifyOutputsDataImpl.Geo.Maps._childSerializers$_anonymous_();
            case 22:
                return AmplifyOutputsDataImpl.Geo.SearchIndices._childSerializers$_anonymous_();
            case 23:
                return AmplifyOutputsDataImpl.Notifications._childSerializers$_anonymous_();
            case 24:
                return AmplifyOutputsDataImpl.Storage._childSerializers$_anonymous_();
            case 25:
                return AmplifyCredential._init_$_anonymous_();
            case 26:
                return AmplifyCredential.DeviceData._childSerializers$_anonymous_();
            case 27:
                return AmplifyCredential.Empty._init_$_anonymous_();
            case 28:
                return AuthChallenge._childSerializers$_anonymous_();
            default:
                return AuthChallenge._childSerializers$_anonymous_$0();
        }
    }
}
