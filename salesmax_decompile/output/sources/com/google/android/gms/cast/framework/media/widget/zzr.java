package com.google.android.gms.cast.framework.media.widget;

import com.google.android.gms.cast.framework.Session;
import com.google.android.gms.cast.framework.SessionManagerListener;

/* loaded from: classes5.dex */
final class zzr implements SessionManagerListener {
    final /* synthetic */ ExpandedControllerActivity zza;

    public /* synthetic */ zzr(ExpandedControllerActivity expandedControllerActivity, zzq zzqVar) {
        this.zza = expandedControllerActivity;
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* synthetic */ void onSessionEnded(Session session, int i) {
        this.zza.finish();
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void onSessionEnding(Session session) {
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void onSessionResumeFailed(Session session, int i) {
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void onSessionResumed(Session session, boolean z) {
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void onSessionResuming(Session session, String str) {
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void onSessionStartFailed(Session session, int i) {
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void onSessionStarted(Session session, String str) {
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void onSessionStarting(Session session) {
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void onSessionSuspended(Session session, int i) {
    }
}
