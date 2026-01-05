package com.google.firebase.remoteconfig;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class FirebaseRemoteConfigServerException extends FirebaseRemoteConfigException {

    /* renamed from: a */
    public final int f7174a;

    public FirebaseRemoteConfigServerException(int i10, String str) {
        super(str);
        this.f7174a = i10;
    }

    public FirebaseRemoteConfigServerException(int i10, String str, int i11) {
        super(str);
        this.f7174a = i10;
    }

    public FirebaseRemoteConfigServerException(int i10, String str, FirebaseRemoteConfigServerException firebaseRemoteConfigServerException) {
        super(str, firebaseRemoteConfigServerException);
        this.f7174a = i10;
    }

    public FirebaseRemoteConfigServerException(String str) {
        super(str);
        this.f7174a = -1;
    }
}
