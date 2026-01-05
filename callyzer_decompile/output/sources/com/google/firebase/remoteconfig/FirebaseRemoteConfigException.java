package com.google.firebase.remoteconfig;

import com.google.firebase.FirebaseException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class FirebaseRemoteConfigException extends FirebaseException {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    /* renamed from: com.google.firebase.remoteconfig.FirebaseRemoteConfigException$a */
    public enum EnumC1402a {
        UNKNOWN(0),
        CONFIG_UPDATE_STREAM_ERROR(1),
        CONFIG_UPDATE_MESSAGE_INVALID(2),
        CONFIG_UPDATE_NOT_FETCHED(3),
        CONFIG_UPDATE_UNAVAILABLE(4);

        private final int value;

        EnumC1402a(int i10) {
            this.value = i10;
        }

        public int value() {
            return this.value;
        }
    }

    public FirebaseRemoteConfigException(String str) {
        super(str);
        EnumC1402a enumC1402a = EnumC1402a.UNKNOWN;
    }

    public FirebaseRemoteConfigException(String str, Exception exc) {
        super(str, exc);
        EnumC1402a enumC1402a = EnumC1402a.UNKNOWN;
    }
}
