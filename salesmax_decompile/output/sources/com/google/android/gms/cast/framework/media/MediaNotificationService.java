package com.google.android.gms.cast.framework.media;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.res.Resources;
import android.os.IBinder;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.framework.C10905R;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.gms.cast.framework.CastOptions;
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
public class MediaNotificationService extends Service {
    public static final String ACTION_UPDATE_NOTIFICATION = "com.google.android.gms.cast.framework.action.UPDATE_NOTIFICATION";
    private static final Logger zza = new Logger("MediaNotificationService");
    private static Runnable zzb;
    private NotificationOptions zzc;
    private ImagePicker zzd;
    private ComponentName zze;
    private ComponentName zzf;
    private List zzg = new ArrayList();
    private int[] zzh;
    private long zzi;
    private com.google.android.gms.cast.framework.media.internal.zzb zzj;
    private ImageHints zzk;
    private Resources zzl;
    private zzm zzm;
    private zzn zzn;
    private NotificationManager zzo;
    private Notification zzp;
    private CastContext zzq;

    public static boolean isNotificationOptionsValid(CastOptions castOptions) {
        NotificationOptions notificationOptions;
        CastMediaOptions castMediaOptions = castOptions.getCastMediaOptions();
        if (castMediaOptions == null || (notificationOptions = castMediaOptions.getNotificationOptions()) == null) {
            return false;
        }
        zzg zzgVarZzm = notificationOptions.zzm();
        if (zzgVarZzm == null) {
            return true;
        }
        List listZzf = com.google.android.gms.cast.framework.media.internal.zzw.zzf(zzgVarZzm);
        int[] iArrZzg = com.google.android.gms.cast.framework.media.internal.zzw.zzg(zzgVarZzm);
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
    private final o2c.C15690b zzc(String str) {
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
                zzm zzmVar = this.zzm;
                int i = zzmVar.zzc;
                boolean z = zzmVar.zzb;
                if (i == 2) {
                    pauseDrawableResId = this.zzc.getStopLiveStreamDrawableResId();
                    iZzf = this.zzc.getStopLiveStreamTitleResId();
                } else {
                    pauseDrawableResId = this.zzc.getPauseDrawableResId();
                    iZzf = this.zzc.zzf();
                }
                if (!z) {
                    pauseDrawableResId = this.zzc.getPlayDrawableResId();
                }
                if (!z) {
                    iZzf = this.zzc.zzg();
                }
                Intent intent = new Intent(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK);
                intent.setComponent(this.zze);
                return new o2c.C15690b.a(pauseDrawableResId, this.zzl.getString(iZzf), PendingIntent.getBroadcast(this, 0, intent, zzdx.zza)).m41365b();
            case 1:
                if (this.zzm.zzf) {
                    Intent intent2 = new Intent(MediaIntentReceiver.ACTION_SKIP_NEXT);
                    intent2.setComponent(this.zze);
                    broadcast = PendingIntent.getBroadcast(this, 0, intent2, zzdx.zza);
                }
                return new o2c.C15690b.a(this.zzc.getSkipNextDrawableResId(), this.zzl.getString(this.zzc.zzk()), broadcast).m41365b();
            case 2:
                if (this.zzm.zzg) {
                    Intent intent3 = new Intent(MediaIntentReceiver.ACTION_SKIP_PREV);
                    intent3.setComponent(this.zze);
                    broadcast = PendingIntent.getBroadcast(this, 0, intent3, zzdx.zza);
                }
                return new o2c.C15690b.a(this.zzc.getSkipPrevDrawableResId(), this.zzl.getString(this.zzc.zzl()), broadcast).m41365b();
            case 3:
                long j = this.zzi;
                Intent intent4 = new Intent(MediaIntentReceiver.ACTION_FORWARD);
                intent4.setComponent(this.zze);
                intent4.putExtra(MediaIntentReceiver.EXTRA_SKIP_STEP_MS, j);
                return new o2c.C15690b.a(com.google.android.gms.cast.framework.media.internal.zzw.zza(this.zzc, j), this.zzl.getString(com.google.android.gms.cast.framework.media.internal.zzw.zzb(this.zzc, j)), PendingIntent.getBroadcast(this, 0, intent4, zzdx.zza | 134217728)).m41365b();
            case 4:
                long j2 = this.zzi;
                Intent intent5 = new Intent(MediaIntentReceiver.ACTION_REWIND);
                intent5.setComponent(this.zze);
                intent5.putExtra(MediaIntentReceiver.EXTRA_SKIP_STEP_MS, j2);
                return new o2c.C15690b.a(com.google.android.gms.cast.framework.media.internal.zzw.zzc(this.zzc, j2), this.zzl.getString(com.google.android.gms.cast.framework.media.internal.zzw.zzd(this.zzc, j2)), PendingIntent.getBroadcast(this, 0, intent5, zzdx.zza | 134217728)).m41365b();
            case 5:
                Intent intent6 = new Intent(MediaIntentReceiver.ACTION_STOP_CASTING);
                intent6.setComponent(this.zze);
                return new o2c.C15690b.a(this.zzc.getDisconnectDrawableResId(), this.zzl.getString(this.zzc.zza()), PendingIntent.getBroadcast(this, 0, intent6, zzdx.zza)).m41365b();
            case 6:
                Intent intent7 = new Intent(MediaIntentReceiver.ACTION_DISCONNECT);
                intent7.setComponent(this.zze);
                return new o2c.C15690b.a(this.zzc.getDisconnectDrawableResId(), this.zzl.getString(this.zzc.zza(), ""), PendingIntent.getBroadcast(this, 0, intent7, zzdx.zza)).m41365b();
            default:
                zza.m13797e("Action: %s is not a pre-defined action.", str);
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd() {
        PendingIntent pendingIntentM36336n;
        o2c.C15690b c15690bZzc;
        if (this.zzm == null) {
            return;
        }
        zzn zznVar = this.zzn;
        o2c.C15694f c15694fM41405I = new o2c.C15694f(this, "cast_media_notification").m41425t(zznVar == null ? null : zznVar.zzb).m41399C(this.zzc.getSmallIconDrawableResId()).m41418m(this.zzm.zzd).m41417l(this.zzl.getString(this.zzc.getCastingToDeviceStringResId(), this.zzm.zze)).m41429x(true).m41398B(false).m41405I(1);
        ComponentName componentName = this.zzf;
        if (componentName == null) {
            pendingIntentM36336n = null;
        } else {
            Intent intent = new Intent();
            intent.putExtra("targetActivity", componentName);
            intent.setAction(componentName.flattenToString());
            intent.setComponent(componentName);
            kyg kygVarM36329j = kyg.m36329j(this);
            kygVarM36329j.m36331d(intent);
            pendingIntentM36336n = kygVarM36329j.m36336n(1, zzdx.zza | 134217728);
        }
        if (pendingIntentM36336n != null) {
            c15694fM41405I.m41416k(pendingIntentM36336n);
        }
        zzg zzgVarZzm = this.zzc.zzm();
        if (zzgVarZzm != null) {
            zza.m13799i("actionsProvider != null", new Object[0]);
            int[] iArrZzg = com.google.android.gms.cast.framework.media.internal.zzw.zzg(zzgVarZzm);
            this.zzh = iArrZzg != null ? (int[]) iArrZzg.clone() : null;
            List<NotificationAction> listZzf = com.google.android.gms.cast.framework.media.internal.zzw.zzf(zzgVarZzm);
            this.zzg = new ArrayList();
            if (listZzf != null) {
                for (NotificationAction notificationAction : listZzf) {
                    String action = notificationAction.getAction();
                    if (action.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) || action.equals(MediaIntentReceiver.ACTION_SKIP_NEXT) || action.equals(MediaIntentReceiver.ACTION_SKIP_PREV) || action.equals(MediaIntentReceiver.ACTION_FORWARD) || action.equals(MediaIntentReceiver.ACTION_REWIND) || action.equals(MediaIntentReceiver.ACTION_STOP_CASTING) || action.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                        c15690bZzc = zzc(notificationAction.getAction());
                    } else {
                        Intent intent2 = new Intent(notificationAction.getAction());
                        intent2.setComponent(this.zze);
                        c15690bZzc = new o2c.C15690b.a(notificationAction.getIconResId(), notificationAction.getContentDescription(), PendingIntent.getBroadcast(this, 0, intent2, zzdx.zza)).m41365b();
                    }
                    if (c15690bZzc != null) {
                        this.zzg.add(c15690bZzc);
                    }
                }
            }
        } else {
            zza.m13799i("actionsProvider == null", new Object[0]);
            this.zzg = new ArrayList();
            Iterator<String> it = this.zzc.getActions().iterator();
            while (it.hasNext()) {
                o2c.C15690b c15690bZzc2 = zzc(it.next());
                if (c15690bZzc2 != null) {
                    this.zzg.add(c15690bZzc2);
                }
            }
            this.zzh = (int[]) this.zzc.getCompatActionIndices().clone();
        }
        Iterator it2 = this.zzg.iterator();
        while (it2.hasNext()) {
            c15694fM41405I.m41408b((o2c.C15690b) it2.next());
        }
        r2c r2cVar = new r2c();
        int[] iArr = this.zzh;
        if (iArr != null) {
            r2cVar.m46068i(iArr);
        }
        MediaSessionCompat.Token token = this.zzm.zza;
        if (token != null) {
            r2cVar.m46067h(token);
        }
        c15694fM41405I.m41401E(r2cVar);
        Notification notificationM41409c = c15694fM41405I.m41409c();
        this.zzp = notificationM41409c;
        startForeground(1, notificationM41409c);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() throws Resources.NotFoundException {
        this.zzo = (NotificationManager) getSystemService(OneSignalDbContract.NotificationTable.TABLE_NAME);
        CastContext sharedInstance = CastContext.getSharedInstance(this);
        this.zzq = sharedInstance;
        CastMediaOptions castMediaOptions = (CastMediaOptions) Preconditions.checkNotNull(sharedInstance.getCastOptions().getCastMediaOptions());
        this.zzc = (NotificationOptions) Preconditions.checkNotNull(castMediaOptions.getNotificationOptions());
        this.zzd = castMediaOptions.getImagePicker();
        this.zzl = getResources();
        this.zze = new ComponentName(getApplicationContext(), castMediaOptions.getMediaIntentReceiverClassName());
        if (TextUtils.isEmpty(this.zzc.getTargetActivityClassName())) {
            this.zzf = null;
        } else {
            this.zzf = new ComponentName(getApplicationContext(), this.zzc.getTargetActivityClassName());
        }
        this.zzi = this.zzc.getSkipStepMs();
        int dimensionPixelSize = this.zzl.getDimensionPixelSize(this.zzc.zze());
        this.zzk = new ImageHints(1, dimensionPixelSize, dimensionPixelSize);
        this.zzj = new com.google.android.gms.cast.framework.media.internal.zzb(getApplicationContext(), this.zzk);
        if (PlatformVersion.isAtLeastO()) {
            NotificationChannel notificationChannelM43335a = pc7.m43335a("cast_media_notification", getResources().getString(C10905R.string.media_notification_channel_name), 2);
            notificationChannelM43335a.setShowBadge(false);
            this.zzo.createNotificationChannel(notificationChannelM43335a);
        }
        com.google.android.gms.internal.cast.zzr.zzd(zzln.CAF_NOTIFICATION_SERVICE);
    }

    @Override // android.app.Service
    public void onDestroy() {
        com.google.android.gms.cast.framework.media.internal.zzb zzbVar = this.zzj;
        if (zzbVar != null) {
            zzbVar.zza();
        }
        zzb = null;
        this.zzo.cancel(1);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, final int i2) {
        zzm zzmVar;
        MediaInfo mediaInfo = (MediaInfo) Preconditions.checkNotNull((MediaInfo) intent.getParcelableExtra("extra_media_info"));
        MediaMetadata mediaMetadata = (MediaMetadata) Preconditions.checkNotNull(mediaInfo.getMetadata());
        zzm zzmVar2 = new zzm(intent.getIntExtra("extra_remote_media_client_player_state", 0) == 2, mediaInfo.getStreamType(), mediaMetadata.getString(MediaMetadata.KEY_TITLE), ((CastDevice) Preconditions.checkNotNull((CastDevice) intent.getParcelableExtra("extra_cast_device"))).getFriendlyName(), (MediaSessionCompat.Token) intent.getParcelableExtra("extra_media_session_token"), intent.getBooleanExtra("extra_can_skip_next", false), intent.getBooleanExtra("extra_can_skip_prev", false));
        if (intent.getBooleanExtra("extra_media_notification_force_update", false) || (zzmVar = this.zzm) == null || zzmVar2.zzb != zzmVar.zzb || zzmVar2.zzc != zzmVar.zzc || !CastUtils.zze(zzmVar2.zzd, zzmVar.zzd) || !CastUtils.zze(zzmVar2.zze, zzmVar.zze) || zzmVar2.zzf != zzmVar.zzf || zzmVar2.zzg != zzmVar.zzg) {
            this.zzm = zzmVar2;
            zzd();
        }
        ImagePicker imagePicker = this.zzd;
        zzn zznVar = new zzn(imagePicker != null ? imagePicker.onPickImage(mediaMetadata, this.zzk) : mediaMetadata.hasImages() ? mediaMetadata.getImages().get(0) : null);
        zzn zznVar2 = this.zzn;
        if (zznVar2 == null || !CastUtils.zze(zznVar.zza, zznVar2.zza)) {
            this.zzj.zzc(new zzl(this, zznVar));
            this.zzj.zzd(zznVar.zza);
        }
        startForeground(1, this.zzp);
        zzb = new Runnable() { // from class: com.google.android.gms.cast.framework.media.zzk
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.stopSelf(i2);
            }
        };
        return 2;
    }
}
