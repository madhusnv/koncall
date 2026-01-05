package com.google.android.gms.cast.framework.media.internal;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.framework.C10905R;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.cast.framework.media.ImageHints;
import com.google.android.gms.cast.framework.media.ImagePicker;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import com.google.android.gms.cast.framework.media.NotificationAction;
import com.google.android.gms.cast.framework.media.NotificationActionsProvider;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.cast.zzdx;
import com.google.android.gms.internal.cast.zzln;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001o.kyg;
import p001o.o2c;
import p001o.pc7;
import p001o.r2c;

/* loaded from: classes5.dex */
final class zzo {
    private static final Logger zza = new Logger("MediaNotificationProxy");
    private final Context zzb;
    private final NotificationManager zzc;
    private final CastContext zzd;
    private final NotificationOptions zze;
    private final ImagePicker zzf;
    private final ComponentName zzg;
    private final ComponentName zzh;
    private List zzi = new ArrayList();
    private int[] zzj;
    private final long zzk;
    private final zzb zzl;
    private final ImageHints zzm;
    private final Resources zzn;
    private zzm zzo;
    private zzn zzp;
    private Notification zzq;
    private o2c.C15690b zzr;
    private o2c.C15690b zzs;
    private o2c.C15690b zzt;
    private o2c.C15690b zzu;
    private o2c.C15690b zzv;
    private o2c.C15690b zzw;
    private o2c.C15690b zzx;
    private o2c.C15690b zzy;

    public zzo(Context context) throws Resources.NotFoundException {
        this.zzb = context;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(OneSignalDbContract.NotificationTable.TABLE_NAME);
        this.zzc = notificationManager;
        CastContext castContext = (CastContext) Preconditions.checkNotNull(CastContext.getSharedInstance());
        this.zzd = castContext;
        CastMediaOptions castMediaOptions = (CastMediaOptions) Preconditions.checkNotNull(((CastOptions) Preconditions.checkNotNull(castContext.getCastOptions())).getCastMediaOptions());
        NotificationOptions notificationOptions = (NotificationOptions) Preconditions.checkNotNull(castMediaOptions.getNotificationOptions());
        this.zze = notificationOptions;
        this.zzf = castMediaOptions.getImagePicker();
        Resources resources = context.getResources();
        this.zzn = resources;
        this.zzg = new ComponentName(context.getApplicationContext(), castMediaOptions.getMediaIntentReceiverClassName());
        if (TextUtils.isEmpty(notificationOptions.getTargetActivityClassName())) {
            this.zzh = null;
        } else {
            this.zzh = new ComponentName(context.getApplicationContext(), notificationOptions.getTargetActivityClassName());
        }
        this.zzk = notificationOptions.getSkipStepMs();
        int dimensionPixelSize = resources.getDimensionPixelSize(notificationOptions.zze());
        ImageHints imageHints = new ImageHints(1, dimensionPixelSize, dimensionPixelSize);
        this.zzm = imageHints;
        this.zzl = new zzb(context.getApplicationContext(), imageHints);
        if (PlatformVersion.isAtLeastO() && notificationManager != null) {
            NotificationChannel notificationChannelM43335a = pc7.m43335a("cast_media_notification", ((Context) Preconditions.checkNotNull(context)).getResources().getString(C10905R.string.media_notification_channel_name), 2);
            notificationChannelM43335a.setShowBadge(false);
            notificationManager.createNotificationChannel(notificationChannelM43335a);
        }
        com.google.android.gms.internal.cast.zzr.zzd(zzln.CAF_MEDIA_NOTIFICATION_PROXY);
    }

    public static boolean zze(CastOptions castOptions) {
        NotificationOptions notificationOptions;
        CastMediaOptions castMediaOptions = castOptions.getCastMediaOptions();
        if (castMediaOptions == null || (notificationOptions = castMediaOptions.getNotificationOptions()) == null) {
            return false;
        }
        com.google.android.gms.cast.framework.media.zzg zzgVarZzm = notificationOptions.zzm();
        if (zzgVarZzm == null) {
            return true;
        }
        List listZzf = zzw.zzf(zzgVarZzm);
        int[] iArrZzg = zzw.zzg(zzgVarZzm);
        int size = listZzf == null ? 0 : listZzf.size();
        if (listZzf == null || listZzf.isEmpty()) {
            zza.m13797e(NotificationActionsProvider.class.getSimpleName().concat(" doesn't provide any action."), new Object[0]);
        } else if (listZzf.size() > 5) {
            zza.m13797e(NotificationActionsProvider.class.getSimpleName().concat(" provides more than 5 actions."), new Object[0]);
        } else {
            if (iArrZzg != null && (iArrZzg.length) != 0) {
                for (int i : iArrZzg) {
                    if (i < 0 || i >= size) {
                        zza.m13797e(NotificationActionsProvider.class.getSimpleName().concat("provides a compact view action whose index is out of bounds."), new Object[0]);
                    }
                }
                return true;
            }
            zza.m13797e(NotificationActionsProvider.class.getSimpleName().concat(" doesn't provide any actions for compact view."), new Object[0]);
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final o2c.C15690b zzf(String str) {
        char c;
        int pauseDrawableResId;
        int iZzf;
        switch (str.hashCode()) {
            case -1699820260:
                if (!str.equals(MediaIntentReceiver.ACTION_REWIND)) {
                    c = 65535;
                    break;
                } else {
                    c = 4;
                    break;
                }
            case -945151566:
                if (str.equals(MediaIntentReceiver.ACTION_SKIP_NEXT)) {
                    c = 1;
                    break;
                }
                break;
            case -945080078:
                if (str.equals(MediaIntentReceiver.ACTION_SKIP_PREV)) {
                    c = 2;
                    break;
                }
                break;
            case -668151673:
                if (str.equals(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                    c = 5;
                    break;
                }
                break;
            case -124479363:
                if (str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                    c = 6;
                    break;
                }
                break;
            case 235550565:
                if (str.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK)) {
                    c = 0;
                    break;
                }
                break;
            case 1362116196:
                if (str.equals(MediaIntentReceiver.ACTION_FORWARD)) {
                    c = 3;
                    break;
                }
                break;
        }
        PendingIntent broadcast = null;
        switch (c) {
            case 0:
                zzm zzmVar = this.zzo;
                int i = zzmVar.zzc;
                if (!zzmVar.zzb) {
                    if (this.zzr == null) {
                        Intent intent = new Intent(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK);
                        intent.setComponent(this.zzg);
                        this.zzr = new o2c.C15690b.a(this.zze.getPlayDrawableResId(), this.zzn.getString(this.zze.zzg()), PendingIntent.getBroadcast(this.zzb, 0, intent, zzdx.zza)).m41365b();
                    }
                    return this.zzr;
                }
                if (this.zzs == null) {
                    if (i == 2) {
                        pauseDrawableResId = this.zze.getStopLiveStreamDrawableResId();
                        iZzf = this.zze.getStopLiveStreamTitleResId();
                    } else {
                        pauseDrawableResId = this.zze.getPauseDrawableResId();
                        iZzf = this.zze.zzf();
                    }
                    Intent intent2 = new Intent(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK);
                    intent2.setComponent(this.zzg);
                    this.zzs = new o2c.C15690b.a(pauseDrawableResId, this.zzn.getString(iZzf), PendingIntent.getBroadcast(this.zzb, 0, intent2, zzdx.zza)).m41365b();
                }
                return this.zzs;
            case 1:
                boolean z = this.zzo.zzf;
                if (this.zzt == null) {
                    if (z) {
                        Intent intent3 = new Intent(MediaIntentReceiver.ACTION_SKIP_NEXT);
                        intent3.setComponent(this.zzg);
                        broadcast = PendingIntent.getBroadcast(this.zzb, 0, intent3, zzdx.zza);
                    }
                    this.zzt = new o2c.C15690b.a(this.zze.getSkipNextDrawableResId(), this.zzn.getString(this.zze.zzk()), broadcast).m41365b();
                }
                return this.zzt;
            case 2:
                boolean z2 = this.zzo.zzg;
                if (this.zzu == null) {
                    if (z2) {
                        Intent intent4 = new Intent(MediaIntentReceiver.ACTION_SKIP_PREV);
                        intent4.setComponent(this.zzg);
                        broadcast = PendingIntent.getBroadcast(this.zzb, 0, intent4, zzdx.zza);
                    }
                    this.zzu = new o2c.C15690b.a(this.zze.getSkipPrevDrawableResId(), this.zzn.getString(this.zze.zzl()), broadcast).m41365b();
                }
                return this.zzu;
            case 3:
                long j = this.zzk;
                if (this.zzv == null) {
                    Intent intent5 = new Intent(MediaIntentReceiver.ACTION_FORWARD);
                    intent5.setComponent(this.zzg);
                    intent5.putExtra(MediaIntentReceiver.EXTRA_SKIP_STEP_MS, j);
                    this.zzv = new o2c.C15690b.a(zzw.zza(this.zze, j), this.zzn.getString(zzw.zzb(this.zze, j)), PendingIntent.getBroadcast(this.zzb, 0, intent5, zzdx.zza | 134217728)).m41365b();
                }
                return this.zzv;
            case 4:
                long j2 = this.zzk;
                if (this.zzw == null) {
                    Intent intent6 = new Intent(MediaIntentReceiver.ACTION_REWIND);
                    intent6.setComponent(this.zzg);
                    intent6.putExtra(MediaIntentReceiver.EXTRA_SKIP_STEP_MS, j2);
                    this.zzw = new o2c.C15690b.a(zzw.zzc(this.zze, j2), this.zzn.getString(zzw.zzd(this.zze, j2)), PendingIntent.getBroadcast(this.zzb, 0, intent6, zzdx.zza | 134217728)).m41365b();
                }
                return this.zzw;
            case 5:
                if (this.zzy == null) {
                    Intent intent7 = new Intent(MediaIntentReceiver.ACTION_STOP_CASTING);
                    intent7.setComponent(this.zzg);
                    this.zzy = new o2c.C15690b.a(this.zze.getDisconnectDrawableResId(), this.zzn.getString(this.zze.zza()), PendingIntent.getBroadcast(this.zzb, 0, intent7, zzdx.zza)).m41365b();
                }
                return this.zzy;
            case 6:
                if (this.zzx == null) {
                    Intent intent8 = new Intent(MediaIntentReceiver.ACTION_DISCONNECT);
                    intent8.setComponent(this.zzg);
                    this.zzx = new o2c.C15690b.a(this.zze.getDisconnectDrawableResId(), this.zzn.getString(this.zze.zza(), ""), PendingIntent.getBroadcast(this.zzb, 0, intent8, zzdx.zza)).m41365b();
                }
                return this.zzx;
            default:
                zza.m13797e("Action: %s is not a pre-defined action.", str);
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg() {
        PendingIntent pendingIntentM36336n;
        o2c.C15690b c15690bZzf;
        if (this.zzc == null || this.zzo == null) {
            return;
        }
        zzn zznVar = this.zzp;
        o2c.C15694f c15694fM41405I = new o2c.C15694f(this.zzb, "cast_media_notification").m41425t(zznVar == null ? null : zznVar.zzb).m41399C(this.zze.getSmallIconDrawableResId()).m41418m(this.zzo.zzd).m41417l(this.zzn.getString(this.zze.getCastingToDeviceStringResId(), this.zzo.zze)).m41429x(true).m41398B(false).m41405I(1);
        ComponentName componentName = this.zzh;
        if (componentName == null) {
            pendingIntentM36336n = null;
        } else {
            Intent intent = new Intent();
            intent.putExtra("targetActivity", componentName);
            intent.setAction(componentName.flattenToString());
            intent.setComponent(componentName);
            kyg kygVarM36329j = kyg.m36329j(this.zzb);
            kygVarM36329j.m36331d(intent);
            pendingIntentM36336n = kygVarM36329j.m36336n(1, zzdx.zza | 134217728);
        }
        if (pendingIntentM36336n != null) {
            c15694fM41405I.m41416k(pendingIntentM36336n);
        }
        com.google.android.gms.cast.framework.media.zzg zzgVarZzm = this.zze.zzm();
        if (zzgVarZzm != null) {
            zza.m13795d("actionsProvider != null", new Object[0]);
            int[] iArrZzg = zzw.zzg(zzgVarZzm);
            this.zzj = iArrZzg != null ? (int[]) iArrZzg.clone() : null;
            List<NotificationAction> listZzf = zzw.zzf(zzgVarZzm);
            this.zzi = new ArrayList();
            if (listZzf != null) {
                for (NotificationAction notificationAction : listZzf) {
                    String action = notificationAction.getAction();
                    if (action.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) || action.equals(MediaIntentReceiver.ACTION_SKIP_NEXT) || action.equals(MediaIntentReceiver.ACTION_SKIP_PREV) || action.equals(MediaIntentReceiver.ACTION_FORWARD) || action.equals(MediaIntentReceiver.ACTION_REWIND) || action.equals(MediaIntentReceiver.ACTION_STOP_CASTING) || action.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                        c15690bZzf = zzf(notificationAction.getAction());
                    } else {
                        Intent intent2 = new Intent(notificationAction.getAction());
                        intent2.setComponent(this.zzg);
                        c15690bZzf = new o2c.C15690b.a(notificationAction.getIconResId(), notificationAction.getContentDescription(), PendingIntent.getBroadcast(this.zzb, 0, intent2, zzdx.zza)).m41365b();
                    }
                    if (c15690bZzf != null) {
                        this.zzi.add(c15690bZzf);
                    }
                }
            }
        } else {
            zza.m13795d("actionsProvider == null", new Object[0]);
            this.zzi = new ArrayList();
            Iterator<String> it = this.zze.getActions().iterator();
            while (it.hasNext()) {
                o2c.C15690b c15690bZzf2 = zzf(it.next());
                if (c15690bZzf2 != null) {
                    this.zzi.add(c15690bZzf2);
                }
            }
            this.zzj = (int[]) this.zze.getCompatActionIndices().clone();
        }
        Iterator it2 = this.zzi.iterator();
        while (it2.hasNext()) {
            c15694fM41405I.m41408b((o2c.C15690b) it2.next());
        }
        r2c r2cVar = new r2c();
        int[] iArr = this.zzj;
        if (iArr != null) {
            r2cVar.m46068i(iArr);
        }
        MediaSessionCompat.Token token = this.zzo.zza;
        if (token != null) {
            r2cVar.m46067h(token);
        }
        c15694fM41405I.m41401E(r2cVar);
        Notification notificationM41409c = c15694fM41405I.m41409c();
        this.zzq = notificationM41409c;
        this.zzc.notify("castMediaNotification", 1, notificationM41409c);
    }

    public final void zzc() {
        this.zzl.zza();
        NotificationManager notificationManager = this.zzc;
        if (notificationManager != null) {
            notificationManager.cancel("castMediaNotification", 1);
        }
    }

    public final void zzd(CastDevice castDevice, RemoteMediaClient remoteMediaClient, MediaSessionCompat mediaSessionCompat, boolean z) {
        MediaInfo mediaInfo;
        MediaMetadata metadata;
        boolean z2;
        boolean z3;
        zzm zzmVar;
        if (castDevice == null || remoteMediaClient == null || mediaSessionCompat == null || (mediaInfo = remoteMediaClient.getMediaInfo()) == null || (metadata = mediaInfo.getMetadata()) == null) {
            return;
        }
        MediaStatus mediaStatus = remoteMediaClient.getMediaStatus();
        if (mediaStatus == null) {
            z2 = false;
            z3 = z2;
        } else {
            int queueRepeatMode = mediaStatus.getQueueRepeatMode();
            if (queueRepeatMode == 1 || queueRepeatMode == 2 || queueRepeatMode == 3) {
                z2 = true;
                z3 = z2;
            } else {
                Integer indexById = mediaStatus.getIndexById(mediaStatus.getCurrentItemId());
                if (indexById != null) {
                    boolean z4 = indexById.intValue() > 0;
                    z2 = indexById.intValue() < mediaStatus.getQueueItemCount() + (-1);
                    z3 = z4;
                }
                z2 = false;
                z3 = z2;
            }
        }
        zzm zzmVar2 = new zzm(remoteMediaClient.getPlayerState() == 2, mediaInfo.getStreamType(), metadata.getString(MediaMetadata.KEY_TITLE), castDevice.getFriendlyName(), mediaSessionCompat.m3564d(), z2, z3);
        if (z || (zzmVar = this.zzo) == null || zzmVar2.zzb != zzmVar.zzb || zzmVar2.zzc != zzmVar.zzc || !CastUtils.zze(zzmVar2.zzd, zzmVar.zzd) || !CastUtils.zze(zzmVar2.zze, zzmVar.zze) || zzmVar2.zzf != zzmVar.zzf || zzmVar2.zzg != zzmVar.zzg) {
            this.zzo = zzmVar2;
            zzg();
        }
        ImagePicker imagePicker = this.zzf;
        zzn zznVar = new zzn(imagePicker != null ? imagePicker.onPickImage(metadata, this.zzm) : metadata.hasImages() ? metadata.getImages().get(0) : null);
        zzn zznVar2 = this.zzp;
        if (zznVar2 == null || !CastUtils.zze(zznVar.zza, zznVar2.zza)) {
            this.zzl.zzc(new zzl(this, zznVar));
            this.zzl.zzd(zznVar.zza);
        }
    }
}
