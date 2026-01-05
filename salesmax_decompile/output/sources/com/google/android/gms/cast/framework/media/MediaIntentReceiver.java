package com.google.android.gms.cast.framework.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.annotation.Keep;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.Session;
import com.google.android.gms.cast.framework.SessionManager;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.Preconditions;

@Keep
/* loaded from: classes5.dex */
public class MediaIntentReceiver extends BroadcastReceiver {
    public static final String ACTION_DISCONNECT = "com.google.android.gms.cast.framework.action.DISCONNECT";
    public static final String ACTION_FORWARD = "com.google.android.gms.cast.framework.action.FORWARD";
    public static final String ACTION_REWIND = "com.google.android.gms.cast.framework.action.REWIND";
    public static final String ACTION_SKIP_NEXT = "com.google.android.gms.cast.framework.action.SKIP_NEXT";
    public static final String ACTION_SKIP_PREV = "com.google.android.gms.cast.framework.action.SKIP_PREV";
    public static final String ACTION_STOP_CASTING = "com.google.android.gms.cast.framework.action.STOP_CASTING";
    public static final String ACTION_TOGGLE_PLAYBACK = "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK";
    public static final String EXTRA_SKIP_STEP_MS = "googlecast-extra_skip_step_ms";
    private static final String TAG = "MediaIntentReceiver";
    private static final Logger log = new Logger(TAG);

    private static RemoteMediaClient getRemoteMediaClient(CastSession castSession) {
        if (castSession == null || !castSession.isConnected()) {
            return null;
        }
        return castSession.getRemoteMediaClient();
    }

    private void seek(CastSession castSession, long j) {
        RemoteMediaClient remoteMediaClient;
        if (j == 0 || (remoteMediaClient = getRemoteMediaClient(castSession)) == null || remoteMediaClient.isLiveStream() || remoteMediaClient.isPlayingAd()) {
            return;
        }
        remoteMediaClient.seek(remoteMediaClient.getApproximateStreamPosition() + j);
    }

    private void togglePlayback(CastSession castSession) {
        RemoteMediaClient remoteMediaClient = getRemoteMediaClient(castSession);
        if (remoteMediaClient == null) {
            return;
        }
        remoteMediaClient.togglePlayback();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007b  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onReceive(Context context, Intent intent) {
        SessionManager sessionManager;
        Session currentSession;
        String action = intent.getAction();
        log.m13795d("onReceive action: %s", action);
        if (action == null || (currentSession = (sessionManager = CastContext.getSharedInstance(context).getSessionManager()).getCurrentSession()) == null) {
            return;
        }
        switch (action) {
            case "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK":
                onReceiveActionTogglePlayback(currentSession);
                break;
            case "com.google.android.gms.cast.framework.action.SKIP_NEXT":
                onReceiveActionSkipNext(currentSession);
                break;
            case "com.google.android.gms.cast.framework.action.SKIP_PREV":
                onReceiveActionSkipPrev(currentSession);
                break;
            case "com.google.android.gms.cast.framework.action.FORWARD":
                onReceiveActionForward(currentSession, intent.getLongExtra(EXTRA_SKIP_STEP_MS, 0L));
                break;
            case "com.google.android.gms.cast.framework.action.REWIND":
                onReceiveActionRewind(currentSession, intent.getLongExtra(EXTRA_SKIP_STEP_MS, 0L));
                break;
            case "com.google.android.gms.cast.framework.action.STOP_CASTING":
                sessionManager.endCurrentSession(true);
                break;
            case "com.google.android.gms.cast.framework.action.DISCONNECT":
                sessionManager.endCurrentSession(false);
                break;
            case "android.intent.action.MEDIA_BUTTON":
                onReceiveActionMediaButton(currentSession, intent);
                break;
            default:
                onReceiveOtherAction(context, action, intent);
                break;
        }
    }

    public void onReceiveActionForward(Session session, long j) {
        if (session instanceof CastSession) {
            seek((CastSession) session, j);
        }
    }

    public void onReceiveActionMediaButton(Session session, Intent intent) {
        KeyEvent keyEvent;
        if ((session instanceof CastSession) && intent.hasExtra("android.intent.extra.KEY_EVENT") && (keyEvent = (KeyEvent) ((Bundle) Preconditions.checkNotNull(intent.getExtras())).get("android.intent.extra.KEY_EVENT")) != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 85) {
            togglePlayback((CastSession) session);
        }
    }

    public void onReceiveActionRewind(Session session, long j) {
        if (session instanceof CastSession) {
            seek((CastSession) session, -j);
        }
    }

    public void onReceiveActionSkipNext(Session session) {
        RemoteMediaClient remoteMediaClient;
        if (!(session instanceof CastSession) || (remoteMediaClient = getRemoteMediaClient((CastSession) session)) == null || remoteMediaClient.isPlayingAd()) {
            return;
        }
        remoteMediaClient.queueNext(null);
    }

    public void onReceiveActionSkipPrev(Session session) {
        RemoteMediaClient remoteMediaClient;
        if (!(session instanceof CastSession) || (remoteMediaClient = getRemoteMediaClient((CastSession) session)) == null || remoteMediaClient.isPlayingAd()) {
            return;
        }
        remoteMediaClient.queuePrev(null);
    }

    public void onReceiveActionTogglePlayback(Session session) {
        if (session instanceof CastSession) {
            togglePlayback((CastSession) session);
        }
    }

    public void onReceiveOtherAction(Context context, String str, Intent intent) {
    }

    @Deprecated
    public void onReceiveOtherAction(String str, Intent intent) {
        onReceiveOtherAction(null, str, intent);
    }
}
