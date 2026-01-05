package com.google.android.gms.cast.internal;

import android.os.SystemClock;
import com.google.android.gms.cast.AdBreakStatus;
import com.google.android.gms.cast.CastStatusCodes;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaLiveSeekableRange;
import com.google.android.gms.cast.MediaLoadRequestData;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaSeekOptions;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.RemoteMediaPlayer;
import com.google.android.gms.cast.TextTrackStyle;
import com.google.android.gms.cast.internal.media.MediaCommon;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;

/* loaded from: classes5.dex */
public final class zzaq extends zzd {
    public static final String zzb;

    @VisibleForTesting
    final zzav zzc;

    @VisibleForTesting
    final zzav zzd;

    @VisibleForTesting
    final zzav zze;

    @VisibleForTesting
    final zzav zzf;

    @VisibleForTesting
    final zzav zzg;

    @VisibleForTesting
    final zzav zzh;

    @VisibleForTesting
    final zzav zzi;

    @VisibleForTesting
    final zzav zzj;

    @VisibleForTesting
    final zzav zzk;

    @VisibleForTesting
    final zzav zzl;

    @VisibleForTesting
    final zzav zzm;

    @VisibleForTesting
    final zzav zzn;

    @VisibleForTesting
    final zzav zzo;

    @VisibleForTesting
    final zzav zzp;

    @VisibleForTesting
    final zzav zzq;

    @VisibleForTesting
    final zzav zzr;

    @VisibleForTesting
    final zzav zzs;

    @VisibleForTesting
    final zzav zzt;

    @VisibleForTesting
    final zzav zzu;
    private long zzv;
    private MediaStatus zzw;
    private Long zzx;
    private zzan zzy;
    private int zzz;

    static {
        int i = CastUtils.zza;
        zzb = "urn:x-cast:com.google.cast.media";
    }

    public zzaq(String str) {
        super(zzb, "MediaControlChannel", null);
        this.zzz = -1;
        zzav zzavVar = new zzav(86400000L);
        this.zzc = zzavVar;
        zzav zzavVar2 = new zzav(86400000L);
        this.zzd = zzavVar2;
        zzav zzavVar3 = new zzav(86400000L);
        this.zze = zzavVar3;
        zzav zzavVar4 = new zzav(86400000L);
        this.zzf = zzavVar4;
        zzav zzavVar5 = new zzav(10000L);
        this.zzg = zzavVar5;
        zzav zzavVar6 = new zzav(86400000L);
        this.zzh = zzavVar6;
        zzav zzavVar7 = new zzav(86400000L);
        this.zzi = zzavVar7;
        zzav zzavVar8 = new zzav(86400000L);
        this.zzj = zzavVar8;
        zzav zzavVar9 = new zzav(86400000L);
        this.zzk = zzavVar9;
        zzav zzavVar10 = new zzav(86400000L);
        this.zzl = zzavVar10;
        zzav zzavVar11 = new zzav(86400000L);
        this.zzm = zzavVar11;
        zzav zzavVar12 = new zzav(86400000L);
        this.zzn = zzavVar12;
        zzav zzavVar13 = new zzav(86400000L);
        this.zzo = zzavVar13;
        zzav zzavVar14 = new zzav(86400000L);
        this.zzp = zzavVar14;
        zzav zzavVar15 = new zzav(86400000L);
        this.zzq = zzavVar15;
        zzav zzavVar16 = new zzav(86400000L);
        this.zzs = zzavVar16;
        this.zzr = new zzav(86400000L);
        zzav zzavVar17 = new zzav(86400000L);
        this.zzt = zzavVar17;
        zzav zzavVar18 = new zzav(86400000L);
        this.zzu = zzavVar18;
        zzc(zzavVar);
        zzc(zzavVar2);
        zzc(zzavVar3);
        zzc(zzavVar4);
        zzc(zzavVar5);
        zzc(zzavVar6);
        zzc(zzavVar7);
        zzc(zzavVar8);
        zzc(zzavVar9);
        zzc(zzavVar10);
        zzc(zzavVar11);
        zzc(zzavVar12);
        zzc(zzavVar13);
        zzc(zzavVar14);
        zzc(zzavVar15);
        zzc(zzavVar16);
        zzc(zzavVar16);
        zzc(zzavVar17);
        zzc(zzavVar18);
        zzT();
    }

    private final long zzR(double d, long j, long j2) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.zzv;
        if (jElapsedRealtime < 0) {
            jElapsedRealtime = 0;
        }
        if (jElapsedRealtime == 0) {
            return j;
        }
        long j3 = j + ((long) (jElapsedRealtime * d));
        if (j2 > 0 && j3 > j2) {
            return j2;
        }
        if (j3 >= 0) {
            return j3;
        }
        return 0L;
    }

    private static zzap zzS(JSONObject jSONObject) {
        MediaError mediaErrorZza = MediaError.zza(jSONObject);
        zzap zzapVar = new zzap();
        int i = CastUtils.zza;
        zzapVar.zza = jSONObject.has("customData") ? jSONObject.optJSONObject("customData") : null;
        zzapVar.zzb = mediaErrorZza;
        return zzapVar;
    }

    private final void zzT() {
        this.zzv = 0L;
        this.zzw = null;
        Iterator it = zza().iterator();
        while (it.hasNext()) {
            ((zzav) it.next()).zzc(CastStatusCodes.CANCELED);
        }
    }

    private final void zzU(JSONObject jSONObject, String str) {
        if (jSONObject.has("sequenceNumber")) {
            this.zzz = jSONObject.optInt("sequenceNumber", -1);
        } else {
            this.zza.m13802w(str.concat(" message is missing a sequence number."), new Object[0]);
        }
    }

    private final void zzV() {
        zzan zzanVar = this.zzy;
        if (zzanVar != null) {
            zzanVar.zzc();
        }
    }

    private final void zzW() {
        zzan zzanVar = this.zzy;
        if (zzanVar != null) {
            zzanVar.zzd();
        }
    }

    private final void zzX() {
        zzan zzanVar = this.zzy;
        if (zzanVar != null) {
            zzanVar.zzk();
        }
    }

    private final void zzY() {
        zzan zzanVar = this.zzy;
        if (zzanVar != null) {
            zzanVar.zzm();
        }
    }

    private final boolean zzZ() {
        return this.zzz != -1;
    }

    private static int[] zzaa(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int[] iArr = new int[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            iArr[i] = jSONArray.getInt(i);
        }
        return iArr;
    }

    public final long zzA(zzat zzatVar, int i, long j, MediaQueueItem[] mediaQueueItemArr, int i2, Boolean bool, Integer num, JSONObject jSONObject) throws JSONException {
        if (j != -1 && j < 0) {
            throw new IllegalArgumentException("playPosition cannot be negative: " + j);
        }
        JSONObject jSONObject2 = new JSONObject();
        long jZzd = zzd();
        try {
            jSONObject2.put("requestId", jZzd);
            jSONObject2.put("type", "QUEUE_UPDATE");
            jSONObject2.put("mediaSessionId", zzn());
            if (i != 0) {
                jSONObject2.put("currentItemId", i);
            }
            if (i2 != 0) {
                jSONObject2.put("jump", i2);
            }
            if (mediaQueueItemArr != null && mediaQueueItemArr.length > 0) {
                JSONArray jSONArray = new JSONArray();
                for (int i3 = 0; i3 < mediaQueueItemArr.length; i3++) {
                    jSONArray.put(i3, mediaQueueItemArr[i3].toJson());
                }
                jSONObject2.put("items", jSONArray);
            }
            if (bool != null) {
                jSONObject2.put("shuffle", bool);
            }
            String strZza = MediaCommon.zza(num);
            if (strZza != null) {
                jSONObject2.put("repeatMode", strZza);
            }
            if (j != -1) {
                jSONObject2.put("currentTime", CastUtils.millisecToSec(j));
            }
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
            if (zzZ()) {
                jSONObject2.put("sequenceNumber", this.zzz);
            }
        } catch (JSONException unused) {
        }
        zzg(jSONObject2.toString(), jZzd, null);
        this.zzn.zzb(jZzd, new zzam(this, zzatVar));
        return jZzd;
    }

    public final long zzB(zzat zzatVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        long jZzd = zzd();
        try {
            jSONObject.put("requestId", jZzd);
            jSONObject.put("type", "GET_STATUS");
            MediaStatus mediaStatus = this.zzw;
            if (mediaStatus != null) {
                jSONObject.put("mediaSessionId", mediaStatus.zzb());
            }
        } catch (JSONException unused) {
        }
        zzg(jSONObject.toString(), jZzd, null);
        this.zzj.zzb(jZzd, zzatVar);
        return jZzd;
    }

    public final long zzC(zzat zzatVar, MediaSeekOptions mediaSeekOptions) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        long jZzd = zzd();
        long position = mediaSeekOptions.isSeekToInfinite() ? 4294967296000L : mediaSeekOptions.getPosition();
        try {
            jSONObject.put("requestId", jZzd);
            jSONObject.put("type", "SEEK");
            jSONObject.put("mediaSessionId", zzn());
            jSONObject.put("currentTime", CastUtils.millisecToSec(position));
            if (mediaSeekOptions.getResumeState() == 1) {
                jSONObject.put("resumeState", "PLAYBACK_START");
            } else if (mediaSeekOptions.getResumeState() == 2) {
                jSONObject.put("resumeState", "PLAYBACK_PAUSE");
            }
            if (mediaSeekOptions.getCustomData() != null) {
                jSONObject.put("customData", mediaSeekOptions.getCustomData());
            }
        } catch (JSONException unused) {
        }
        zzg(jSONObject.toString(), jZzd, null);
        this.zzx = Long.valueOf(position);
        this.zzg.zzb(jZzd, new zzal(this, zzatVar));
        return jZzd;
    }

    public final long zzD(zzat zzatVar, long[] jArr) throws JSONException {
        if (jArr == null) {
            throw new IllegalArgumentException("trackIds cannot be null");
        }
        JSONObject jSONObject = new JSONObject();
        long jZzd = zzd();
        try {
            jSONObject.put("requestId", jZzd);
            jSONObject.put("type", "EDIT_TRACKS_INFO");
            jSONObject.put("mediaSessionId", zzn());
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < jArr.length; i++) {
                jSONArray.put(i, jArr[i]);
            }
            jSONObject.put("activeTrackIds", jSONArray);
        } catch (JSONException unused) {
        }
        zzg(jSONObject.toString(), jZzd, null);
        this.zzk.zzb(jZzd, zzatVar);
        return jZzd;
    }

    public final long zzE(zzat zzatVar, double d, JSONObject jSONObject) throws JSONException, zzao {
        if (this.zzw == null) {
            throw new zzao();
        }
        JSONObject jSONObject2 = new JSONObject();
        long jZzd = zzd();
        try {
            jSONObject2.put("requestId", jZzd);
            jSONObject2.put("type", "SET_PLAYBACK_RATE");
            jSONObject2.put("playbackRate", d);
            Preconditions.checkNotNull(this.zzw, "mediaStatus should not be null");
            jSONObject2.put("mediaSessionId", this.zzw.zzb());
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException unused) {
        }
        zzg(jSONObject2.toString(), jZzd, null);
        this.zzt.zzb(jZzd, zzatVar);
        return jZzd;
    }

    public final long zzF(zzat zzatVar, boolean z, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        long jZzd = zzd();
        try {
            jSONObject2.put("requestId", jZzd);
            jSONObject2.put("type", "SET_VOLUME");
            jSONObject2.put("mediaSessionId", zzn());
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("muted", z);
            jSONObject2.put("volume", jSONObject3);
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException unused) {
        }
        zzg(jSONObject2.toString(), jZzd, null);
        this.zzi.zzb(jZzd, zzatVar);
        return jZzd;
    }

    public final long zzG(zzat zzatVar, double d, JSONObject jSONObject) throws JSONException {
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            throw new IllegalArgumentException("Volume cannot be " + d);
        }
        JSONObject jSONObject2 = new JSONObject();
        long jZzd = zzd();
        try {
            jSONObject2.put("requestId", jZzd);
            jSONObject2.put("type", "SET_VOLUME");
            jSONObject2.put("mediaSessionId", zzn());
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(FirebaseAnalytics.Param.LEVEL, d);
            jSONObject2.put("volume", jSONObject3);
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException unused) {
        }
        zzg(jSONObject2.toString(), jZzd, null);
        this.zzh.zzb(jZzd, zzatVar);
        return jZzd;
    }

    public final long zzH(zzat zzatVar, TextTrackStyle textTrackStyle) throws JSONException {
        if (textTrackStyle == null) {
            throw new IllegalArgumentException("trackStyle cannot be null");
        }
        JSONObject jSONObject = new JSONObject();
        long jZzd = zzd();
        try {
            jSONObject.put("requestId", jZzd);
            jSONObject.put("type", "EDIT_TRACKS_INFO");
            jSONObject.put("textTrackStyle", textTrackStyle.zza());
            jSONObject.put("mediaSessionId", zzn());
        } catch (JSONException unused) {
        }
        zzg(jSONObject.toString(), jZzd, null);
        this.zzl.zzb(jZzd, zzatVar);
        return jZzd;
    }

    public final long zzI(zzat zzatVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        long jZzd = zzd();
        try {
            jSONObject.put("requestId", jZzd);
            jSONObject.put("type", "SKIP_AD");
            jSONObject.put("mediaSessionId", zzn());
        } catch (JSONException e) {
            this.zza.m13802w(String.format(Locale.ROOT, "Error creating SkipAd message: %s", e.getMessage()), new Object[0]);
        }
        zzg(jSONObject.toString(), jZzd, null);
        this.zzu.zzb(jZzd, zzatVar);
        return jZzd;
    }

    public final long zzJ(zzat zzatVar, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        long jZzd = zzd();
        try {
            jSONObject2.put("requestId", jZzd);
            jSONObject2.put("type", "STOP");
            jSONObject2.put("mediaSessionId", zzn());
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException unused) {
        }
        zzg(jSONObject2.toString(), jZzd, null);
        this.zzf.zzb(jZzd, zzatVar);
        return jZzd;
    }

    public final MediaInfo zzK() {
        MediaStatus mediaStatus = this.zzw;
        if (mediaStatus == null) {
            return null;
        }
        return mediaStatus.getMediaInfo();
    }

    public final MediaStatus zzL() {
        return this.zzw;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzO(String str) {
        JSONObject jSONObject;
        long jOptLong;
        int i;
        int i2;
        int iZza;
        MediaStatus mediaStatus;
        int[] iArrZzaa;
        char c;
        this.zza.m13795d("message received: %s", str);
        try {
            jSONObject = new JSONObject(str);
            String string = jSONObject.getString("type");
            jOptLong = jSONObject.optLong("requestId", -1L);
            i = 1;
            switch (string) {
                case "MEDIA_STATUS":
                    JSONArray jSONArray = jSONObject.getJSONArray("status");
                    if (jSONArray.length() > 0) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(0);
                        boolean zZzf = this.zzc.zzf(jOptLong);
                        if ((!this.zzh.zze() || this.zzh.zzf(jOptLong)) && (!this.zzi.zze() || this.zzi.zzf(jOptLong))) {
                            i = 0;
                        }
                        if (zZzf || (mediaStatus = this.zzw) == null) {
                            this.zzw = new MediaStatus(jSONObject2);
                            this.zzv = SystemClock.elapsedRealtime();
                            iZza = Opcodes.LAND;
                        } else {
                            iZza = mediaStatus.zza(jSONObject2, i);
                        }
                        if ((iZza & 1) != 0) {
                            this.zzv = SystemClock.elapsedRealtime();
                            this.zzz = -1;
                            zzY();
                        }
                        if ((iZza & 2) != 0) {
                            this.zzv = SystemClock.elapsedRealtime();
                            zzY();
                        }
                        if ((iZza & 128) != 0) {
                            this.zzv = SystemClock.elapsedRealtime();
                        }
                        if ((iZza & 4) != 0) {
                            zzV();
                        }
                        if ((iZza & 8) != 0) {
                            zzX();
                        }
                        if ((iZza & 16) != 0) {
                            zzW();
                        }
                        if ((iZza & 32) != 0) {
                            this.zzv = SystemClock.elapsedRealtime();
                            zzan zzanVar = this.zzy;
                            if (zzanVar != null) {
                                zzanVar.zza();
                            }
                        }
                        if ((iZza & 64) != 0) {
                            this.zzv = SystemClock.elapsedRealtime();
                            zzY();
                        }
                    } else {
                        this.zzw = null;
                        zzY();
                        zzV();
                        zzX();
                        zzW();
                    }
                    Iterator it = zza().iterator();
                    while (it.hasNext()) {
                        ((zzav) it.next()).zzd(jOptLong, 0, null);
                    }
                    break;
                case "INVALID_PLAYER_STATE":
                    this.zza.m13802w("received unexpected error: Invalid Player State.", new Object[0]);
                    Iterator it2 = zza().iterator();
                    while (it2.hasNext()) {
                        ((zzav) it2.next()).zzd(jOptLong, 2100, zzS(jSONObject));
                    }
                    break;
                case "LOAD_FAILED":
                    this.zzc.zzd(jOptLong, 2100, zzS(jSONObject));
                    break;
                case "LOAD_CANCELLED":
                    this.zzc.zzd(jOptLong, RemoteMediaPlayer.STATUS_CANCELED, zzS(jSONObject));
                    break;
                case "INVALID_REQUEST":
                    this.zza.m13802w("received unexpected error: Invalid Request.", new Object[0]);
                    Iterator it3 = zza().iterator();
                    while (it3.hasNext()) {
                        ((zzav) it3.next()).zzd(jOptLong, CastStatusCodes.INVALID_REQUEST, zzS(jSONObject));
                    }
                    break;
                case "ERROR":
                    Iterator it4 = zza().iterator();
                    while (it4.hasNext()) {
                        ((zzav) it4.next()).zzd(jOptLong, 2100, zzS(jSONObject));
                    }
                    if (this.zzy == null) {
                        break;
                    } else {
                        this.zzy.zzb(MediaError.zza(jSONObject));
                        break;
                    }
                case "QUEUE_ITEM_IDS":
                    this.zzq.zzd(jOptLong, 0, null);
                    zzU(jSONObject, "QUEUE_ITEM_IDS");
                    if (this.zzy != null && (iArrZzaa = zzaa(jSONObject.getJSONArray("itemIds"))) != null) {
                        this.zzy.zze(iArrZzaa);
                        break;
                    }
                    break;
                case "QUEUE_CHANGE":
                    this.zzs.zzd(jOptLong, 0, null);
                    zzU(jSONObject, "QUEUE_CHANGE");
                    if (this.zzy != null) {
                        String string2 = jSONObject.getString("changeType");
                        int[] iArrZzaa2 = zzaa(jSONObject.getJSONArray("itemIds"));
                        int iOptInt = jSONObject.optInt("insertBefore", 0);
                        if (iArrZzaa2 != null) {
                            switch (string2.hashCode()) {
                                case -2130463047:
                                    if (string2.equals("INSERT")) {
                                        c = 0;
                                        break;
                                    } else {
                                        c = 65535;
                                        break;
                                    }
                                case -1881281404:
                                    if (string2.equals("REMOVE")) {
                                        c = 2;
                                        break;
                                    }
                                    break;
                                case -1785516855:
                                    if (string2.equals("UPDATE")) {
                                        c = 3;
                                        break;
                                    }
                                    break;
                                case 1122976047:
                                    if (string2.equals("ITEMS_CHANGE")) {
                                        c = 1;
                                        break;
                                    }
                                    break;
                            }
                            if (c == 0) {
                                this.zzy.zzf(iArrZzaa2, iOptInt);
                                break;
                            } else if (c == 1) {
                                this.zzy.zzj(iArrZzaa2);
                                break;
                            } else if (c == 2) {
                                this.zzy.zzh(iArrZzaa2);
                                break;
                            } else if (c == 3) {
                                int[] iArrZzaa3 = zzaa(jSONObject.getJSONArray("itemIds"));
                                Preconditions.checkNotNull(iArrZzaa3, "A list of item IDs is expected in a QUEUE UPDATE message.");
                                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("reorderItemIds");
                                if (jSONArrayOptJSONArray != null) {
                                    this.zzy.zzi(CastUtils.zzd(iArrZzaa3), CastUtils.zzd((int[]) Preconditions.checkNotNull(zzaa(jSONArrayOptJSONArray))), jSONObject.optInt("insertBefore", 0));
                                    break;
                                } else {
                                    this.zzy.zze(iArrZzaa3);
                                    break;
                                }
                            }
                        }
                    }
                    break;
                case "QUEUE_ITEMS":
                    this.zzr.zzd(jOptLong, 0, null);
                    zzU(jSONObject, "QUEUE_ITEMS");
                    if (this.zzy != null) {
                        JSONArray jSONArray2 = jSONObject.getJSONArray("items");
                        MediaQueueItem[] mediaQueueItemArr = new MediaQueueItem[jSONArray2.length()];
                        for (i2 = 0; i2 < jSONArray2.length(); i2++) {
                            mediaQueueItemArr[i2] = new MediaQueueItem.Builder(jSONArray2.getJSONObject(i2)).build();
                        }
                        this.zzy.zzg(mediaQueueItemArr);
                        break;
                    }
                    break;
            }
        } catch (JSONException e) {
            this.zza.m13802w("Message is malformed (%s); ignoring: %s", e.getMessage(), str);
        }
    }

    public final void zzP(long j, int i) {
        Iterator it = zza().iterator();
        while (it.hasNext()) {
            ((zzav) it.next()).zzd(j, i, null);
        }
    }

    public final void zzQ(zzan zzanVar) {
        this.zzy = zzanVar;
    }

    @Override // com.google.android.gms.cast.internal.zzp
    public final void zzf() {
        zzb();
        zzT();
    }

    public final long zzj() {
        MediaStatus mediaStatus;
        AdBreakStatus adBreakStatus;
        if (this.zzv == 0 || (mediaStatus = this.zzw) == null || (adBreakStatus = mediaStatus.getAdBreakStatus()) == null) {
            return 0L;
        }
        double playbackRate = mediaStatus.getPlaybackRate();
        if (playbackRate == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            playbackRate = 1.0d;
        }
        return zzR(mediaStatus.getPlayerState() != 2 ? 0.0d : playbackRate, adBreakStatus.getCurrentBreakClipTimeInMs(), 0L);
    }

    public final long zzk() {
        MediaLiveSeekableRange liveSeekableRange;
        MediaStatus mediaStatus = this.zzw;
        if (mediaStatus == null || (liveSeekableRange = mediaStatus.getLiveSeekableRange()) == null) {
            return 0L;
        }
        long endTime = liveSeekableRange.getEndTime();
        return !liveSeekableRange.isLiveDone() ? zzR(1.0d, endTime, -1L) : endTime;
    }

    public final long zzl() {
        MediaLiveSeekableRange liveSeekableRange;
        MediaStatus mediaStatus = this.zzw;
        if (mediaStatus == null || (liveSeekableRange = mediaStatus.getLiveSeekableRange()) == null) {
            return 0L;
        }
        long startTime = liveSeekableRange.getStartTime();
        if (liveSeekableRange.isMovingWindow()) {
            startTime = zzR(1.0d, startTime, -1L);
        }
        return liveSeekableRange.isLiveDone() ? Math.min(startTime, liveSeekableRange.getEndTime()) : startTime;
    }

    public final long zzm() {
        MediaStatus mediaStatus;
        MediaInfo mediaInfoZzK = zzK();
        if (mediaInfoZzK == null || (mediaStatus = this.zzw) == null) {
            return 0L;
        }
        Long l = this.zzx;
        if (l == null) {
            if (this.zzv == 0) {
                return 0L;
            }
            double playbackRate = mediaStatus.getPlaybackRate();
            long streamPosition = mediaStatus.getStreamPosition();
            return (playbackRate == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || mediaStatus.getPlayerState() != 2) ? streamPosition : zzR(playbackRate, streamPosition, mediaInfoZzK.getStreamDuration());
        }
        if (l.equals(4294967296000L)) {
            if (this.zzw.getLiveSeekableRange() != null) {
                return Math.min(l.longValue(), zzk());
            }
            if (zzo() >= 0) {
                return Math.min(l.longValue(), zzo());
            }
        }
        return l.longValue();
    }

    public final long zzn() throws zzao {
        MediaStatus mediaStatus = this.zzw;
        if (mediaStatus != null) {
            return mediaStatus.zzb();
        }
        throw new zzao();
    }

    public final long zzo() {
        MediaInfo mediaInfoZzK = zzK();
        if (mediaInfoZzK != null) {
            return mediaInfoZzK.getStreamDuration();
        }
        return 0L;
    }

    public final long zzp(zzat zzatVar, MediaLoadRequestData mediaLoadRequestData) throws JSONException {
        if (mediaLoadRequestData.getMediaInfo() == null && mediaLoadRequestData.getQueueData() == null) {
            throw new IllegalArgumentException("MediaInfo and MediaQueueData should not be both null");
        }
        JSONObject json = mediaLoadRequestData.toJson();
        if (json == null) {
            throw new IllegalArgumentException("Failed to jsonify the load request due to malformed request");
        }
        long jZzd = zzd();
        try {
            json.put("requestId", jZzd);
            json.put("type", "LOAD");
        } catch (JSONException unused) {
        }
        zzg(json.toString(), jZzd, null);
        this.zzc.zzb(jZzd, zzatVar);
        return jZzd;
    }

    public final long zzq(zzat zzatVar, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        long jZzd = zzd();
        try {
            jSONObject2.put("requestId", jZzd);
            jSONObject2.put("type", "PAUSE");
            jSONObject2.put("mediaSessionId", zzn());
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException unused) {
        }
        zzg(jSONObject2.toString(), jZzd, null);
        this.zzd.zzb(jZzd, zzatVar);
        return jZzd;
    }

    public final long zzr(zzat zzatVar, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        long jZzd = zzd();
        try {
            jSONObject2.put("requestId", jZzd);
            jSONObject2.put("type", "PLAY");
            jSONObject2.put("mediaSessionId", zzn());
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException unused) {
        }
        zzg(jSONObject2.toString(), jZzd, null);
        this.zze.zzb(jZzd, zzatVar);
        return jZzd;
    }

    public final long zzs(String str, List list) throws JSONException {
        long jZzd = zzd();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("requestId", jZzd);
            jSONObject.put("type", "PRECACHE");
            jSONObject.put("precacheData", str);
        } catch (JSONException unused) {
        }
        zzg(jSONObject.toString(), jZzd, null);
        return jZzd;
    }

    public final long zzt(zzat zzatVar, int i, int i2, int i3) throws JSONException {
        if (i2 > 0 && i3 == 0) {
            i3 = 0;
        } else if (i2 != 0 || i3 <= 0) {
            throw new IllegalArgumentException("Exactly one of nextCount and prevCount must be positive and the other must be zero");
        }
        JSONObject jSONObject = new JSONObject();
        long jZzd = zzd();
        try {
            jSONObject.put("requestId", jZzd);
            jSONObject.put("type", "QUEUE_GET_ITEM_RANGE");
            jSONObject.put("mediaSessionId", zzn());
            jSONObject.put("itemId", i);
            if (i2 > 0) {
                jSONObject.put("nextCount", i2);
            }
            if (i3 > 0) {
                jSONObject.put("prevCount", i3);
            }
        } catch (JSONException unused) {
        }
        zzg(jSONObject.toString(), jZzd, null);
        this.zzs.zzb(jZzd, zzatVar);
        return jZzd;
    }

    public final long zzu(zzat zzatVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        long jZzd = zzd();
        try {
            jSONObject.put("requestId", jZzd);
            jSONObject.put("type", "QUEUE_GET_ITEM_IDS");
            jSONObject.put("mediaSessionId", zzn());
        } catch (JSONException unused) {
        }
        zzg(jSONObject.toString(), jZzd, null);
        this.zzq.zzb(jZzd, zzatVar);
        return jZzd;
    }

    public final long zzv(zzat zzatVar, int[] iArr) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        long jZzd = zzd();
        try {
            jSONObject.put("requestId", jZzd);
            jSONObject.put("type", "QUEUE_GET_ITEMS");
            jSONObject.put("mediaSessionId", zzn());
            JSONArray jSONArray = new JSONArray();
            for (int i : iArr) {
                jSONArray.put(i);
            }
            jSONObject.put("itemIds", jSONArray);
        } catch (JSONException unused) {
        }
        zzg(jSONObject.toString(), jZzd, null);
        this.zzr.zzb(jZzd, zzatVar);
        return jZzd;
    }

    public final long zzw(zzat zzatVar, MediaQueueItem[] mediaQueueItemArr, int i, int i2, int i3, long j, JSONObject jSONObject) throws JSONException {
        if (mediaQueueItemArr == null || mediaQueueItemArr.length == 0) {
            throw new IllegalArgumentException("itemsToInsert must not be null or empty.");
        }
        if (j != -1 && j < 0) {
            throw new IllegalArgumentException("playPosition can not be negative: " + j);
        }
        JSONObject jSONObject2 = new JSONObject();
        long jZzd = zzd();
        try {
            jSONObject2.put("requestId", jZzd);
            jSONObject2.put("type", "QUEUE_INSERT");
            jSONObject2.put("mediaSessionId", zzn());
            JSONArray jSONArray = new JSONArray();
            for (int i4 = 0; i4 < mediaQueueItemArr.length; i4++) {
                jSONArray.put(i4, mediaQueueItemArr[i4].toJson());
            }
            jSONObject2.put("items", jSONArray);
            if (i != 0) {
                jSONObject2.put("insertBefore", i);
            }
            if (i3 != -1) {
                jSONObject2.put("currentItemIndex", 0);
            }
            if (j != -1) {
                jSONObject2.put("currentTime", CastUtils.millisecToSec(j));
            }
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
            if (zzZ()) {
                jSONObject2.put("sequenceNumber", this.zzz);
            }
        } catch (JSONException unused) {
        }
        zzg(jSONObject2.toString(), jZzd, null);
        this.zzm.zzb(jZzd, new zzam(this, zzatVar));
        return jZzd;
    }

    public final long zzx(zzat zzatVar, MediaQueueItem[] mediaQueueItemArr, int i, int i2, long j, JSONObject jSONObject) throws JSONException {
        int length;
        String strZza;
        if (mediaQueueItemArr == null || (length = mediaQueueItemArr.length) == 0) {
            throw new IllegalArgumentException("items must not be null or empty.");
        }
        if (i < 0 || i >= length) {
            throw new IllegalArgumentException("Invalid startIndex: " + i);
        }
        if (j != -1 && j < 0) {
            throw new IllegalArgumentException("playPosition can not be negative: " + j);
        }
        JSONObject jSONObject2 = new JSONObject();
        long jZzd = zzd();
        this.zzc.zzb(jZzd, zzatVar);
        try {
            jSONObject2.put("requestId", jZzd);
            jSONObject2.put("type", "QUEUE_LOAD");
            JSONArray jSONArray = new JSONArray();
            for (int i3 = 0; i3 < mediaQueueItemArr.length; i3++) {
                jSONArray.put(i3, mediaQueueItemArr[i3].toJson());
            }
            jSONObject2.put("items", jSONArray);
            strZza = MediaCommon.zza(Integer.valueOf(i2));
        } catch (JSONException unused) {
        }
        if (strZza == null) {
            throw new IllegalArgumentException("Invalid repeat mode: " + i2);
        }
        jSONObject2.put("repeatMode", strZza);
        jSONObject2.put("startIndex", i);
        if (j != -1) {
            jSONObject2.put("currentTime", CastUtils.millisecToSec(j));
        }
        if (jSONObject != null) {
            jSONObject2.put("customData", jSONObject);
        }
        if (zzZ()) {
            jSONObject2.put("sequenceNumber", this.zzz);
        }
        zzg(jSONObject2.toString(), jZzd, null);
        return jZzd;
    }

    public final long zzy(zzat zzatVar, int[] iArr, JSONObject jSONObject) throws JSONException {
        if (iArr == null || iArr.length == 0) {
            throw new IllegalArgumentException("itemIdsToRemove must not be null or empty.");
        }
        JSONObject jSONObject2 = new JSONObject();
        long jZzd = zzd();
        try {
            jSONObject2.put("requestId", jZzd);
            jSONObject2.put("type", "QUEUE_REMOVE");
            jSONObject2.put("mediaSessionId", zzn());
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < iArr.length; i++) {
                jSONArray.put(i, iArr[i]);
            }
            jSONObject2.put("itemIds", jSONArray);
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
            if (zzZ()) {
                jSONObject2.put("sequenceNumber", this.zzz);
            }
        } catch (JSONException unused) {
        }
        zzg(jSONObject2.toString(), jZzd, null);
        this.zzo.zzb(jZzd, new zzam(this, zzatVar));
        return jZzd;
    }

    public final long zzz(zzat zzatVar, int[] iArr, int i, JSONObject jSONObject) throws JSONException {
        if (iArr == null || iArr.length == 0) {
            throw new IllegalArgumentException("itemIdsToReorder must not be null or empty.");
        }
        JSONObject jSONObject2 = new JSONObject();
        long jZzd = zzd();
        try {
            jSONObject2.put("requestId", jZzd);
            jSONObject2.put("type", "QUEUE_REORDER");
            jSONObject2.put("mediaSessionId", zzn());
            JSONArray jSONArray = new JSONArray();
            for (int i2 = 0; i2 < iArr.length; i2++) {
                jSONArray.put(i2, iArr[i2]);
            }
            jSONObject2.put("itemIds", jSONArray);
            if (i != 0) {
                jSONObject2.put("insertBefore", i);
            }
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
            if (zzZ()) {
                jSONObject2.put("sequenceNumber", this.zzz);
            }
        } catch (JSONException unused) {
        }
        zzg(jSONObject2.toString(), jZzd, null);
        this.zzp.zzb(jZzd, new zzam(this, zzatVar));
        return jZzd;
    }
}
