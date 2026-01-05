package p001o;

import android.app.Notification;
import android.media.session.MediaSession;
import android.support.v4.media.session.MediaSessionCompat;

/* loaded from: classes2.dex */
public abstract class p2c {
    /* renamed from: a */
    public static Notification.MediaStyle m42883a() {
        return new Notification.MediaStyle();
    }

    /* renamed from: b */
    public static Notification.MediaStyle m42884b(Notification.MediaStyle mediaStyle, int[] iArr, MediaSessionCompat.Token token) {
        if (iArr != null) {
            m42887e(mediaStyle, iArr);
        }
        if (token != null) {
            m42885c(mediaStyle, (MediaSession.Token) token.m3590e());
        }
        return mediaStyle;
    }

    /* renamed from: c */
    public static void m42885c(Notification.MediaStyle mediaStyle, MediaSession.Token token) {
        mediaStyle.setMediaSession(token);
    }

    /* renamed from: d */
    public static void m42886d(Notification.Builder builder, Notification.MediaStyle mediaStyle) {
        builder.setStyle(mediaStyle);
    }

    /* renamed from: e */
    public static void m42887e(Notification.MediaStyle mediaStyle, int... iArr) {
        mediaStyle.setShowActionsInCompactView(iArr);
    }
}
