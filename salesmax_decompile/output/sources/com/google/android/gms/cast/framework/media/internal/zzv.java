package com.google.android.gms.cast.framework.media.internal;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.framework.C10905R;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.ReconnectionService;
import com.google.android.gms.cast.framework.SessionManager;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.cast.framework.media.ImagePicker;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import com.google.android.gms.cast.framework.media.NotificationAction;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.cast.zzbf;
import com.google.android.gms.internal.cast.zzdx;
import com.google.android.gms.internal.cast.zzdy;
import java.util.List;

/* loaded from: classes5.dex */
public final class zzv {
    public static final /* synthetic */ int zza = 0;
    private static final Logger zzb = new Logger("MediaSessionManager");
    private final Context zzc;
    private final CastOptions zzd;
    private final zzbf zze;
    private final SessionManager zzf;
    private final NotificationOptions zzg;
    private final ComponentName zzh;
    private final ComponentName zzi;
    private final zzb zzj;
    private final zzb zzk;
    private final zzo zzl;
    private final Handler zzm;
    private final Runnable zzn;
    private final RemoteMediaClient.Callback zzo;
    private RemoteMediaClient zzp;
    private CastDevice zzq;
    private MediaSessionCompat zzr;
    private MediaSessionCompat.AbstractC1719b zzs;
    private boolean zzt;
    private PlaybackStateCompat.CustomAction zzu;
    private PlaybackStateCompat.CustomAction zzv;
    private PlaybackStateCompat.CustomAction zzw;
    private PlaybackStateCompat.CustomAction zzx;

    /* JADX WARN: Multi-variable type inference failed */
    public zzv(Context context, CastOptions castOptions, zzbf zzbfVar) {
        this.zzc = context;
        this.zzd = castOptions;
        this.zze = zzbfVar;
        CastContext sharedInstance = CastContext.getSharedInstance();
        Object[] objArr = 0;
        this.zzf = sharedInstance != null ? sharedInstance.getSessionManager() : null;
        CastMediaOptions castMediaOptions = castOptions.getCastMediaOptions();
        this.zzg = castMediaOptions == null ? null : castMediaOptions.getNotificationOptions();
        this.zzo = new zzu(this, objArr == true ? 1 : 0);
        String expandedControllerActivityClassName = castMediaOptions == null ? null : castMediaOptions.getExpandedControllerActivityClassName();
        this.zzh = !TextUtils.isEmpty(expandedControllerActivityClassName) ? new ComponentName(context, expandedControllerActivityClassName) : null;
        String mediaIntentReceiverClassName = castMediaOptions == null ? null : castMediaOptions.getMediaIntentReceiverClassName();
        this.zzi = !TextUtils.isEmpty(mediaIntentReceiverClassName) ? new ComponentName(context, mediaIntentReceiverClassName) : null;
        zzb zzbVar = new zzb(context);
        this.zzj = zzbVar;
        zzbVar.zzc(new zzq(this));
        zzb zzbVar2 = new zzb(context);
        this.zzk = zzbVar2;
        zzbVar2.zzc(new zzr(this));
        this.zzm = new zzdy(Looper.getMainLooper());
        this.zzl = zzo.zze(castOptions) ? new zzo(context) : null;
        this.zzn = new Runnable() { // from class: com.google.android.gms.cast.framework.media.internal.zzp
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzj();
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final long zzm(String str, int i, Bundle bundle) {
        char c;
        long j;
        int iHashCode = str.hashCode();
        if (iHashCode != -945151566) {
            if (iHashCode != -945080078) {
                c = (iHashCode == 235550565 && str.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK)) ? (char) 0 : (char) 65535;
            } else if (str.equals(MediaIntentReceiver.ACTION_SKIP_PREV)) {
                c = 1;
            }
        } else if (str.equals(MediaIntentReceiver.ACTION_SKIP_NEXT)) {
            c = 2;
        }
        if (c == 0) {
            if (i == 3) {
                j = 514;
                i = 3;
            } else {
                j = 512;
            }
            if (i != 2) {
                return j;
            }
            return 516L;
        }
        if (c == 1) {
            RemoteMediaClient remoteMediaClient = this.zzp;
            if (remoteMediaClient != null && remoteMediaClient.zzt()) {
                return 16L;
            }
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
            return 0L;
        }
        if (c != 2) {
            return 0L;
        }
        RemoteMediaClient remoteMediaClient2 = this.zzp;
        if (remoteMediaClient2 != null && remoteMediaClient2.zzs()) {
            return 32L;
        }
        bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
        return 0L;
    }

    private final Uri zzn(MediaMetadata mediaMetadata, int i) {
        CastMediaOptions castMediaOptions = this.zzd.getCastMediaOptions();
        ImagePicker imagePicker = castMediaOptions == null ? null : castMediaOptions.getImagePicker();
        WebImage webImageOnPickImage = imagePicker != null ? imagePicker.onPickImage(mediaMetadata, i) : mediaMetadata.hasImages() ? mediaMetadata.getImages().get(0) : null;
        if (webImageOnPickImage == null) {
            return null;
        }
        return webImageOnPickImage.getUrl();
    }

    private final MediaMetadataCompat.C1701b zzo() {
        MediaSessionCompat mediaSessionCompat = this.zzr;
        MediaMetadataCompat mediaMetadataCompatM3520b = mediaSessionCompat == null ? null : mediaSessionCompat.m3562b().m3520b();
        return mediaMetadataCompatM3520b == null ? new MediaMetadataCompat.C1701b() : new MediaMetadataCompat.C1701b(mediaMetadataCompatM3520b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzp(Bitmap bitmap, int i) {
        MediaSessionCompat mediaSessionCompat = this.zzr;
        if (mediaSessionCompat == null) {
            return;
        }
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            bitmap.eraseColor(0);
        }
        mediaSessionCompat.m3571l(zzo().m3497b(i == 0 ? "android.media.metadata.DISPLAY_ICON" : "android.media.metadata.ALBUM_ART", bitmap).m3496a());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzq(PlaybackStateCompat.C1732d c1732d, String str, NotificationAction notificationAction) {
        char c;
        PlaybackStateCompat.CustomAction customActionM3659a;
        NotificationOptions notificationOptions;
        NotificationOptions notificationOptions2;
        switch (str.hashCode()) {
            case -1699820260:
                if (!str.equals(MediaIntentReceiver.ACTION_REWIND)) {
                    c = 65535;
                    break;
                } else {
                    c = 1;
                    break;
                }
            case -668151673:
                if (str.equals(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                    c = 2;
                    break;
                }
                break;
            case -124479363:
                if (str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                    c = 3;
                    break;
                }
                break;
            case 1362116196:
                if (str.equals(MediaIntentReceiver.ACTION_FORWARD)) {
                    c = 0;
                    break;
                }
                break;
        }
        if (c == 0) {
            if (this.zzu == null && (notificationOptions = this.zzg) != null) {
                long skipStepMs = notificationOptions.getSkipStepMs();
                this.zzu = new PlaybackStateCompat.CustomAction.C1728b(MediaIntentReceiver.ACTION_FORWARD, this.zzc.getResources().getString(zzw.zzb(this.zzg, skipStepMs)), zzw.zza(this.zzg, skipStepMs)).m3659a();
            }
            customActionM3659a = this.zzu;
        } else if (c == 1) {
            if (this.zzv == null && (notificationOptions2 = this.zzg) != null) {
                long skipStepMs2 = notificationOptions2.getSkipStepMs();
                this.zzv = new PlaybackStateCompat.CustomAction.C1728b(MediaIntentReceiver.ACTION_REWIND, this.zzc.getResources().getString(zzw.zzd(this.zzg, skipStepMs2)), zzw.zzc(this.zzg, skipStepMs2)).m3659a();
            }
            customActionM3659a = this.zzv;
        } else if (c == 2) {
            if (this.zzw == null && this.zzg != null) {
                this.zzw = new PlaybackStateCompat.CustomAction.C1728b(MediaIntentReceiver.ACTION_STOP_CASTING, this.zzc.getResources().getString(this.zzg.zza()), this.zzg.getDisconnectDrawableResId()).m3659a();
            }
            customActionM3659a = this.zzw;
        } else if (c != 3) {
            customActionM3659a = notificationAction != null ? new PlaybackStateCompat.CustomAction.C1728b(str, notificationAction.getContentDescription(), notificationAction.getIconResId()).m3659a() : null;
        } else {
            if (this.zzx == null && this.zzg != null) {
                this.zzx = new PlaybackStateCompat.CustomAction.C1728b(MediaIntentReceiver.ACTION_DISCONNECT, this.zzc.getResources().getString(this.zzg.zza()), this.zzg.getDisconnectDrawableResId()).m3659a();
            }
            customActionM3659a = this.zzx;
        }
        if (customActionM3659a != null) {
            c1732d.m3688a(customActionM3659a);
        }
    }

    private final void zzr(boolean z) {
        if (this.zzd.getEnableReconnectionService()) {
            Runnable runnable = this.zzn;
            if (runnable != null) {
                this.zzm.removeCallbacks(runnable);
            }
            Intent intent = new Intent(this.zzc, (Class<?>) ReconnectionService.class);
            intent.setPackage(this.zzc.getPackageName());
            try {
                this.zzc.startService(intent);
            } catch (IllegalStateException unused) {
                if (z) {
                    this.zzm.postDelayed(this.zzn, 1000L);
                }
            }
        }
    }

    private final void zzs() {
        zzo zzoVar = this.zzl;
        if (zzoVar != null) {
            zzb.m13795d("Stopping media notification.", new Object[0]);
            zzoVar.zzc();
        }
    }

    private final void zzt() {
        if (this.zzd.getEnableReconnectionService()) {
            this.zzm.removeCallbacks(this.zzn);
            Intent intent = new Intent(this.zzc, (Class<?>) ReconnectionService.class);
            intent.setPackage(this.zzc.getPackageName());
            this.zzc.stopService(intent);
        }
    }

    private final void zzu(int i, MediaInfo mediaInfo) {
        PlaybackStateCompat playbackStateCompatM3689b;
        MediaSessionCompat mediaSessionCompat;
        MediaMetadata metadata;
        PendingIntent activity;
        MediaSessionCompat mediaSessionCompat2 = this.zzr;
        if (mediaSessionCompat2 == null) {
            return;
        }
        Bundle bundle = new Bundle();
        PlaybackStateCompat.C1732d c1732d = new PlaybackStateCompat.C1732d();
        RemoteMediaClient remoteMediaClient = this.zzp;
        if (remoteMediaClient == null || this.zzl == null) {
            playbackStateCompatM3689b = c1732d.m3689b();
        } else {
            c1732d.m3691d(i, (remoteMediaClient.zza() == 0 || remoteMediaClient.isLiveStream()) ? 0L : remoteMediaClient.getApproximateStreamPosition(), 1.0f);
            if (i == 0) {
                playbackStateCompatM3689b = c1732d.m3689b();
            } else {
                NotificationOptions notificationOptions = this.zzg;
                com.google.android.gms.cast.framework.media.zzg zzgVarZzm = notificationOptions != null ? notificationOptions.zzm() : null;
                RemoteMediaClient remoteMediaClient2 = this.zzp;
                long jZzm = (remoteMediaClient2 == null || remoteMediaClient2.isLiveStream() || this.zzp.isPlayingAd()) ? 0L : 256L;
                if (zzgVarZzm != null) {
                    List<NotificationAction> listZzf = zzw.zzf(zzgVarZzm);
                    if (listZzf != null) {
                        for (NotificationAction notificationAction : listZzf) {
                            String action = notificationAction.getAction();
                            if (zzv(action)) {
                                jZzm |= zzm(action, i, bundle);
                            } else {
                                zzq(c1732d, action, notificationAction);
                            }
                        }
                    }
                } else {
                    NotificationOptions notificationOptions2 = this.zzg;
                    if (notificationOptions2 != null) {
                        for (String str : notificationOptions2.getActions()) {
                            if (zzv(str)) {
                                jZzm |= zzm(str, i, bundle);
                            } else {
                                zzq(c1732d, str, null);
                            }
                        }
                    }
                }
                playbackStateCompatM3689b = c1732d.m3690c(jZzm).m3689b();
            }
        }
        mediaSessionCompat2.m3572m(playbackStateCompatM3689b);
        NotificationOptions notificationOptions3 = this.zzg;
        if (notificationOptions3 != null && notificationOptions3.zzp()) {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
        }
        NotificationOptions notificationOptions4 = this.zzg;
        if (notificationOptions4 != null && notificationOptions4.zzo()) {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
        }
        if (bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS") || bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT")) {
            mediaSessionCompat2.m3570k(bundle);
        }
        if (i == 0) {
            mediaSessionCompat2.m3571l(new MediaMetadataCompat.C1701b().m3496a());
            return;
        }
        if (this.zzp != null) {
            if (this.zzh == null) {
                activity = null;
            } else {
                Intent intent = new Intent();
                intent.setComponent(this.zzh);
                activity = PendingIntent.getActivity(this.zzc, 0, intent, zzdx.zza | 134217728);
            }
            if (activity != null) {
                mediaSessionCompat2.m3575p(activity);
            }
        }
        if (this.zzp == null || (mediaSessionCompat = this.zzr) == null || mediaInfo == null || (metadata = mediaInfo.getMetadata()) == null) {
            return;
        }
        RemoteMediaClient remoteMediaClient3 = this.zzp;
        long streamDuration = (remoteMediaClient3 == null || !remoteMediaClient3.isLiveStream()) ? mediaInfo.getStreamDuration() : 0L;
        String string = metadata.getString(MediaMetadata.KEY_TITLE);
        String string2 = metadata.getString(MediaMetadata.KEY_SUBTITLE);
        MediaMetadataCompat.C1701b c1701bM3498c = zzo().m3498c("android.media.metadata.DURATION", streamDuration);
        if (string != null) {
            c1701bM3498c.m3499d("android.media.metadata.TITLE", string);
            c1701bM3498c.m3499d("android.media.metadata.DISPLAY_TITLE", string);
        }
        if (string2 != null) {
            c1701bM3498c.m3499d("android.media.metadata.DISPLAY_SUBTITLE", string2);
        }
        mediaSessionCompat.m3571l(c1701bM3498c.m3496a());
        Uri uriZzn = zzn(metadata, 0);
        if (uriZzn != null) {
            this.zzj.zzd(uriZzn);
        } else {
            zzp(null, 0);
        }
        Uri uriZzn2 = zzn(metadata, 3);
        if (uriZzn2 != null) {
            this.zzk.zzd(uriZzn2);
        } else {
            zzp(null, 3);
        }
    }

    private static final boolean zzv(String str) {
        return TextUtils.equals(str, MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) || TextUtils.equals(str, MediaIntentReceiver.ACTION_SKIP_PREV) || TextUtils.equals(str, MediaIntentReceiver.ACTION_SKIP_NEXT);
    }

    public final void zzh(RemoteMediaClient remoteMediaClient, CastDevice castDevice) {
        AudioManager audioManager;
        CastOptions castOptions = this.zzd;
        CastMediaOptions castMediaOptions = castOptions == null ? null : castOptions.getCastMediaOptions();
        if (this.zzt || this.zzd == null || castMediaOptions == null || this.zzg == null || remoteMediaClient == null || castDevice == null || this.zzi == null) {
            zzb.m13795d("skip attaching media session", new Object[0]);
            return;
        }
        this.zzp = remoteMediaClient;
        remoteMediaClient.registerCallback(this.zzo);
        this.zzq = castDevice;
        if (!PlatformVersion.isAtLeastLollipop() && (audioManager = (AudioManager) this.zzc.getSystemService("audio")) != null) {
            audioManager.requestAudioFocus(null, 3, 3);
        }
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setComponent(this.zzi);
        PendingIntent broadcast = PendingIntent.getBroadcast(this.zzc, 0, intent, zzdx.zza);
        if (castMediaOptions.getMediaSessionEnabled()) {
            MediaSessionCompat mediaSessionCompat = new MediaSessionCompat(this.zzc, "CastMediaSession", this.zzi, broadcast);
            this.zzr = mediaSessionCompat;
            zzu(0, null);
            CastDevice castDevice2 = this.zzq;
            if (castDevice2 != null && !TextUtils.isEmpty(castDevice2.getFriendlyName())) {
                mediaSessionCompat.m3571l(new MediaMetadataCompat.C1701b().m3499d("android.media.metadata.ALBUM_ARTIST", this.zzc.getResources().getString(C10905R.string.cast_casting_to_device, this.zzq.getFriendlyName())).m3496a());
            }
            zzs zzsVar = new zzs(this);
            this.zzs = zzsVar;
            mediaSessionCompat.m3568i(zzsVar);
            mediaSessionCompat.m3567h(true);
            this.zze.zzr(mediaSessionCompat);
        }
        this.zzt = true;
        zzl(false);
    }

    public final void zzi(int i) {
        AudioManager audioManager;
        if (this.zzt) {
            this.zzt = false;
            RemoteMediaClient remoteMediaClient = this.zzp;
            if (remoteMediaClient != null) {
                remoteMediaClient.unregisterCallback(this.zzo);
            }
            if (!PlatformVersion.isAtLeastLollipop() && (audioManager = (AudioManager) this.zzc.getSystemService("audio")) != null) {
                audioManager.abandonAudioFocus(null);
            }
            this.zze.zzr(null);
            zzb zzbVar = this.zzj;
            if (zzbVar != null) {
                zzbVar.zza();
            }
            zzb zzbVar2 = this.zzk;
            if (zzbVar2 != null) {
                zzbVar2.zza();
            }
            MediaSessionCompat mediaSessionCompat = this.zzr;
            if (mediaSessionCompat != null) {
                mediaSessionCompat.m3568i(null);
                this.zzr.m3571l(new MediaMetadataCompat.C1701b().m3496a());
                zzu(0, null);
            }
            MediaSessionCompat mediaSessionCompat2 = this.zzr;
            if (mediaSessionCompat2 != null) {
                mediaSessionCompat2.m3567h(false);
                this.zzr.m3566g();
                this.zzr = null;
            }
            this.zzp = null;
            this.zzq = null;
            this.zzs = null;
            zzs();
            if (i == 0) {
                zzt();
            }
        }
    }

    public final /* synthetic */ void zzj() {
        zzr(false);
    }

    public final void zzk(CastDevice castDevice) {
        zzb.m13799i("update Cast device to %s", castDevice);
        this.zzq = castDevice;
        zzl(false);
    }

    public final void zzl(boolean z) {
        MediaQueueItem loadingItem;
        RemoteMediaClient remoteMediaClient = this.zzp;
        if (remoteMediaClient == null) {
            return;
        }
        int iZza = remoteMediaClient.zza();
        MediaInfo mediaInfo = remoteMediaClient.getMediaInfo();
        if (remoteMediaClient.isLoadingNextItem() && (loadingItem = remoteMediaClient.getLoadingItem()) != null && loadingItem.getMedia() != null) {
            mediaInfo = loadingItem.getMedia();
        }
        zzu(iZza, mediaInfo);
        if (!remoteMediaClient.hasMediaSession()) {
            zzs();
            zzt();
        } else if (iZza != 0) {
            zzo zzoVar = this.zzl;
            if (zzoVar != null) {
                zzb.m13795d("Update media notification.", new Object[0]);
                zzoVar.zzd(this.zzq, this.zzp, this.zzr, z);
            }
            if (remoteMediaClient.isLoadingNextItem()) {
                return;
            }
            zzr(true);
        }
    }
}
