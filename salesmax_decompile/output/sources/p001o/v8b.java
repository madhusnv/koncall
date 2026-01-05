package p001o;

import android.media.session.MediaSessionManager;

/* loaded from: classes2.dex */
public final class v8b extends w8b {

    /* renamed from: d */
    public final MediaSessionManager.RemoteUserInfo f50015d;

    public v8b(String str, int i, int i2) {
        super(str, i, i2);
        this.f50015d = r8b.m46342a(str, i, i2);
    }

    /* renamed from: a */
    public static String m52456a(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        return remoteUserInfo.getPackageName();
    }

    public v8b(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        super(remoteUserInfo.getPackageName(), remoteUserInfo.getPid(), remoteUserInfo.getUid());
        this.f50015d = remoteUserInfo;
    }
}
