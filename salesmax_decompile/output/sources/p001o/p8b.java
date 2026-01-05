package p001o;

import android.media.session.MediaSessionManager;
import android.os.Build;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class p8b {

    /* renamed from: a */
    public q8b f39589a;

    public p8b(String str, int i, int i2) {
        if (str == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        if (Build.VERSION.SDK_INT >= 28) {
            this.f39589a = new v8b(str, i, i2);
        } else {
            this.f39589a = new w8b(str, i, i2);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p8b) {
            return this.f39589a.equals(((p8b) obj).f39589a);
        }
        return false;
    }

    public int hashCode() {
        return this.f39589a.hashCode();
    }

    public p8b(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        String strM52456a = v8b.m52456a(remoteUserInfo);
        if (strM52456a != null) {
            if (!TextUtils.isEmpty(strM52456a)) {
                this.f39589a = new v8b(remoteUserInfo);
                return;
            }
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        throw new NullPointerException("package shouldn't be null");
    }
}
