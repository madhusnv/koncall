package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.cast.CredentialsData;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zznt;
import com.google.android.gms.internal.measurement.zzoi;
import com.google.android.gms.internal.measurement.zzox;
import com.google.android.gms.internal.measurement.zzpd;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.zip.GZIPInputStream;
import org.apache.http.HttpHeaders;
import p001o.vo0;

/* loaded from: classes3.dex */
public final class zzkt implements zzgm {
    private static volatile zzkt zzb;
    private long zzA;
    private final Map zzB;
    private final Map zzC;
    private zzie zzD;
    private String zzE;

    @VisibleForTesting
    long zza;
    private final zzfi zzc;
    private final zzen zzd;
    private zzam zze;
    private zzep zzf;
    private zzkf zzg;
    private zzaa zzh;
    private final zzkv zzi;
    private zzic zzj;
    private zzjo zzk;
    private final zzki zzl;
    private zzez zzm;
    private final zzfr zzn;
    private boolean zzp;
    private List zzq;
    private int zzr;
    private int zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private FileLock zzw;
    private FileChannel zzx;
    private List zzy;
    private List zzz;
    private boolean zzo = false;
    private final zzla zzF = new zzko(this);

    public zzkt(zzku zzkuVar, zzfr zzfrVar) {
        Preconditions.checkNotNull(zzkuVar);
        this.zzn = zzfr.zzp(zzkuVar.zza, null, null);
        this.zzA = -1L;
        this.zzl = new zzki(this);
        zzkv zzkvVar = new zzkv(this);
        zzkvVar.zzX();
        this.zzi = zzkvVar;
        zzen zzenVar = new zzen(this);
        zzenVar.zzX();
        this.zzd = zzenVar;
        zzfi zzfiVar = new zzfi(this);
        zzfiVar.zzX();
        this.zzc = zzfiVar;
        this.zzB = new HashMap();
        this.zzC = new HashMap();
        zzaz().zzp(new zzkj(this, zzkuVar));
    }

    @VisibleForTesting
    public static final void zzaa(com.google.android.gms.internal.measurement.zzfs zzfsVar, int i, String str) {
        List listZzp = zzfsVar.zzp();
        for (int i2 = 0; i2 < listZzp.size(); i2++) {
            if ("_err".equals(((com.google.android.gms.internal.measurement.zzfx) listZzp.get(i2)).zzg())) {
                return;
            }
        }
        com.google.android.gms.internal.measurement.zzfw zzfwVarZze = com.google.android.gms.internal.measurement.zzfx.zze();
        zzfwVarZze.zzj("_err");
        zzfwVarZze.zzi(Long.valueOf(i).longValue());
        com.google.android.gms.internal.measurement.zzfx zzfxVar = (com.google.android.gms.internal.measurement.zzfx) zzfwVarZze.zzaC();
        com.google.android.gms.internal.measurement.zzfw zzfwVarZze2 = com.google.android.gms.internal.measurement.zzfx.zze();
        zzfwVarZze2.zzj("_ev");
        zzfwVarZze2.zzk(str);
        com.google.android.gms.internal.measurement.zzfx zzfxVar2 = (com.google.android.gms.internal.measurement.zzfx) zzfwVarZze2.zzaC();
        zzfsVar.zzf(zzfxVar);
        zzfsVar.zzf(zzfxVar2);
    }

    @VisibleForTesting
    public static final void zzab(com.google.android.gms.internal.measurement.zzfs zzfsVar, String str) {
        List listZzp = zzfsVar.zzp();
        for (int i = 0; i < listZzp.size(); i++) {
            if (str.equals(((com.google.android.gms.internal.measurement.zzfx) listZzp.get(i)).zzg())) {
                zzfsVar.zzh(i);
                return;
            }
        }
    }

    private final zzq zzac(String str) {
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        zzh zzhVarZzj = zzamVar.zzj(str);
        if (zzhVarZzj == null || TextUtils.isEmpty(zzhVarZzj.zzw())) {
            zzay().zzc().zzb("No app data available; dropping", str);
            return null;
        }
        Boolean boolZzad = zzad(zzhVarZzj);
        if (boolZzad != null && !boolZzad.booleanValue()) {
            zzay().zzd().zzb("App version does not match; dropping. appId", zzeh.zzn(str));
            return null;
        }
        String strZzy = zzhVarZzj.zzy();
        String strZzw = zzhVarZzj.zzw();
        long jZzb = zzhVarZzj.zzb();
        String strZzv = zzhVarZzj.zzv();
        long jZzm = zzhVarZzj.zzm();
        long jZzj = zzhVarZzj.zzj();
        boolean zZzai = zzhVarZzj.zzai();
        String strZzx = zzhVarZzj.zzx();
        zzhVarZzj.zza();
        return new zzq(str, strZzy, strZzw, jZzb, strZzv, jZzm, jZzj, (String) null, zZzai, false, strZzx, 0L, 0L, 0, zzhVarZzj.zzah(), false, zzhVarZzj.zzr(), zzhVarZzj.zzq(), zzhVarZzj.zzk(), zzhVarZzj.zzC(), (String) null, zzh(str).zzh(), "", (String) null);
    }

    private final Boolean zzad(zzh zzhVar) {
        try {
            if (zzhVar.zzb() != -2147483648L) {
                if (zzhVar.zzb() == Wrappers.packageManager(this.zzn.zzau()).getPackageInfo(zzhVar.zzt(), 0).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = Wrappers.packageManager(this.zzn.zzau()).getPackageInfo(zzhVar.zzt(), 0).versionName;
                String strZzw = zzhVar.zzw();
                if (strZzw != null && strZzw.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private final void zzae() {
        zzaz().zzg();
        if (this.zzt || this.zzu || this.zzv) {
            zzay().zzj().zzd("Not stopping services. fetch, network, upload", Boolean.valueOf(this.zzt), Boolean.valueOf(this.zzu), Boolean.valueOf(this.zzv));
            return;
        }
        zzay().zzj().zza("Stopping uploading service(s)");
        List list = this.zzq;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        ((List) Preconditions.checkNotNull(this.zzq)).clear();
    }

    @VisibleForTesting
    private final void zzaf(com.google.android.gms.internal.measurement.zzgc zzgcVar, long j, boolean z) {
        String str = true != z ? "_lte" : "_se";
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        zzky zzkyVarZzp = zzamVar.zzp(zzgcVar.zzap(), str);
        zzky zzkyVar = (zzkyVarZzp == null || zzkyVarZzp.zze == null) ? new zzky(zzgcVar.zzap(), "auto", str, zzav().currentTimeMillis(), Long.valueOf(j)) : new zzky(zzgcVar.zzap(), "auto", str, zzav().currentTimeMillis(), Long.valueOf(((Long) zzkyVarZzp.zze).longValue() + j));
        com.google.android.gms.internal.measurement.zzgl zzglVarZzd = com.google.android.gms.internal.measurement.zzgm.zzd();
        zzglVarZzd.zzf(str);
        zzglVarZzd.zzg(zzav().currentTimeMillis());
        zzglVarZzd.zze(((Long) zzkyVar.zze).longValue());
        com.google.android.gms.internal.measurement.zzgm zzgmVar = (com.google.android.gms.internal.measurement.zzgm) zzglVarZzd.zzaC();
        int iZza = zzkv.zza(zzgcVar, str);
        if (iZza >= 0) {
            zzgcVar.zzam(iZza, zzgmVar);
        } else {
            zzgcVar.zzm(zzgmVar);
        }
        if (j > 0) {
            zzam zzamVar2 = this.zze;
            zzal(zzamVar2);
            zzamVar2.zzL(zzkyVar);
            zzay().zzj().zzc("Updated engagement user property. scope, value", true != z ? "lifetime" : "session-scoped", zzkyVar.zze);
        }
    }

    private final void zzag() {
        long jMax;
        long jMax2;
        zzaz().zzg();
        zzB();
        if (this.zza > 0) {
            long jAbs = 3600000 - Math.abs(zzav().elapsedRealtime() - this.zza);
            if (jAbs > 0) {
                zzay().zzj().zzb("Upload has been suspended. Will update scheduling later in approximately ms", Long.valueOf(jAbs));
                zzm().zzc();
                zzkf zzkfVar = this.zzg;
                zzal(zzkfVar);
                zzkfVar.zza();
                return;
            }
            this.zza = 0L;
        }
        if (!this.zzn.zzM() || !zzai()) {
            zzay().zzj().zza("Nothing to upload or uploading impossible");
            zzm().zzc();
            zzkf zzkfVar2 = this.zzg;
            zzal(zzkfVar2);
            zzkfVar2.zza();
            return;
        }
        long jCurrentTimeMillis = zzav().currentTimeMillis();
        zzg();
        long jMax3 = Math.max(0L, ((Long) zzdu.zzz.zza(null)).longValue());
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        boolean z = true;
        if (!zzamVar.zzH()) {
            zzam zzamVar2 = this.zze;
            zzal(zzamVar2);
            if (!zzamVar2.zzG()) {
                z = false;
            }
        }
        if (z) {
            String strZzl = zzg().zzl();
            if (TextUtils.isEmpty(strZzl) || ".none.".equals(strZzl)) {
                zzg();
                jMax = Math.max(0L, ((Long) zzdu.zzt.zza(null)).longValue());
            } else {
                zzg();
                jMax = Math.max(0L, ((Long) zzdu.zzu.zza(null)).longValue());
            }
        } else {
            zzg();
            jMax = Math.max(0L, ((Long) zzdu.zzs.zza(null)).longValue());
        }
        long jZza = this.zzk.zzc.zza();
        long jZza2 = this.zzk.zzd.zza();
        zzam zzamVar3 = this.zze;
        zzal(zzamVar3);
        boolean z2 = z;
        long jZzd = zzamVar3.zzd();
        zzam zzamVar4 = this.zze;
        zzal(zzamVar4);
        long jMax4 = Math.max(jZzd, zzamVar4.zze());
        if (jMax4 == 0) {
            jMax2 = 0;
        } else {
            long jAbs2 = jCurrentTimeMillis - Math.abs(jMax4 - jCurrentTimeMillis);
            long jAbs3 = Math.abs(jZza - jCurrentTimeMillis);
            long jAbs4 = jCurrentTimeMillis - Math.abs(jZza2 - jCurrentTimeMillis);
            long jMax5 = Math.max(jCurrentTimeMillis - jAbs3, jAbs4);
            jMax2 = jAbs2 + jMax3;
            if (z2 && jMax5 > 0) {
                jMax2 = Math.min(jAbs2, jMax5) + jMax;
            }
            zzkv zzkvVar = this.zzi;
            zzal(zzkvVar);
            if (!zzkvVar.zzw(jMax5, jMax)) {
                jMax2 = jMax5 + jMax;
            }
            if (jAbs4 != 0 && jAbs4 >= jAbs2) {
                int i = 0;
                while (true) {
                    zzg();
                    if (i >= Math.min(20, Math.max(0, ((Integer) zzdu.zzB.zza(null)).intValue()))) {
                        break;
                    }
                    zzg();
                    jMax2 += Math.max(0L, ((Long) zzdu.zzA.zza(null)).longValue()) * (1 << i);
                    if (jMax2 > jAbs4) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        if (jMax2 == 0) {
            zzay().zzj().zza("Next upload time is 0");
            zzm().zzc();
            zzkf zzkfVar3 = this.zzg;
            zzal(zzkfVar3);
            zzkfVar3.zza();
            return;
        }
        zzen zzenVar = this.zzd;
        zzal(zzenVar);
        if (!zzenVar.zza()) {
            zzay().zzj().zza("No network");
            zzm().zzb();
            zzkf zzkfVar4 = this.zzg;
            zzal(zzkfVar4);
            zzkfVar4.zza();
            return;
        }
        long jZza3 = this.zzk.zzb.zza();
        zzg();
        long jMax6 = Math.max(0L, ((Long) zzdu.zzq.zza(null)).longValue());
        zzkv zzkvVar2 = this.zzi;
        zzal(zzkvVar2);
        if (!zzkvVar2.zzw(jZza3, jMax6)) {
            jMax2 = Math.max(jMax2, jZza3 + jMax6);
        }
        zzm().zzc();
        long jCurrentTimeMillis2 = jMax2 - zzav().currentTimeMillis();
        if (jCurrentTimeMillis2 <= 0) {
            zzg();
            jCurrentTimeMillis2 = Math.max(0L, ((Long) zzdu.zzv.zza(null)).longValue());
            this.zzk.zzc.zzb(zzav().currentTimeMillis());
        }
        zzay().zzj().zzb("Upload scheduled in approximately ms", Long.valueOf(jCurrentTimeMillis2));
        zzkf zzkfVar5 = this.zzg;
        zzal(zzkfVar5);
        zzkfVar5.zzd(jCurrentTimeMillis2);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x036f A[Catch: all -> 0x0cfd, TryCatch #4 {all -> 0x0cfd, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:172:0x0528, B:24:0x00f5, B:26:0x0103, B:29:0x0123, B:31:0x0129, B:33:0x013b, B:35:0x0149, B:37:0x0159, B:38:0x0166, B:39:0x016b, B:42:0x0184, B:110:0x03a0, B:111:0x03ac, B:114:0x03b6, B:120:0x03d9, B:117:0x03c8, B:142:0x0458, B:144:0x0464, B:147:0x0477, B:149:0x0488, B:151:0x0494, B:171:0x0512, B:156:0x04b4, B:158:0x04c2, B:161:0x04d7, B:163:0x04e9, B:165:0x04f5, B:124:0x03e1, B:126:0x03ed, B:128:0x03f9, B:140:0x043e, B:132:0x0416, B:135:0x0428, B:137:0x042e, B:139:0x0438, B:67:0x01e1, B:70:0x01eb, B:72:0x01f9, B:76:0x023e, B:73:0x0215, B:75:0x0225, B:80:0x024b, B:82:0x0277, B:83:0x02a1, B:85:0x02d7, B:87:0x02dd, B:90:0x02e9, B:92:0x031f, B:93:0x033a, B:95:0x0340, B:97:0x034e, B:101:0x0361, B:98:0x0356, B:104:0x0368, B:107:0x036f, B:108:0x0387, B:175:0x053d, B:177:0x054b, B:179:0x0556, B:190:0x0588, B:180:0x055e, B:182:0x0569, B:184:0x056f, B:187:0x057b, B:189:0x0583, B:191:0x058b, B:192:0x0597, B:195:0x059f, B:197:0x05b1, B:198:0x05bd, B:200:0x05c5, B:204:0x05ea, B:206:0x060f, B:208:0x0620, B:210:0x0626, B:212:0x0632, B:213:0x0663, B:215:0x0669, B:217:0x0677, B:218:0x067b, B:219:0x067e, B:220:0x0681, B:221:0x068f, B:223:0x0695, B:225:0x06a5, B:226:0x06ac, B:228:0x06b8, B:229:0x06bf, B:230:0x06c2, B:232:0x0700, B:233:0x0713, B:235:0x0719, B:238:0x0733, B:240:0x074e, B:242:0x0767, B:244:0x076c, B:246:0x0770, B:248:0x0774, B:250:0x077e, B:251:0x0788, B:253:0x078c, B:255:0x0792, B:256:0x07a0, B:257:0x07a9, B:325:0x09f8, B:259:0x07b6, B:261:0x07cd, B:267:0x07e9, B:269:0x080d, B:270:0x0815, B:272:0x081b, B:274:0x082d, B:281:0x0857, B:282:0x087a, B:284:0x0886, B:286:0x089b, B:288:0x08dc, B:292:0x08f4, B:294:0x08fb, B:296:0x090a, B:298:0x090e, B:300:0x0912, B:302:0x0916, B:303:0x0922, B:304:0x0927, B:306:0x092d, B:308:0x0949, B:309:0x094e, B:324:0x09f5, B:310:0x0969, B:312:0x0971, B:316:0x0998, B:318:0x09c4, B:319:0x09cb, B:320:0x09db, B:322:0x09e3, B:313:0x097e, B:279:0x0841, B:265:0x07d4, B:326:0x0a03, B:328:0x0a10, B:329:0x0a16, B:330:0x0a1e, B:332:0x0a24, B:335:0x0a3e, B:337:0x0a4f, B:357:0x0ac3, B:359:0x0ac9, B:361:0x0ae1, B:364:0x0ae8, B:369:0x0b17, B:371:0x0b59, B:374:0x0b8e, B:375:0x0b92, B:376:0x0b9d, B:378:0x0be0, B:379:0x0bed, B:381:0x0bfc, B:385:0x0c16, B:387:0x0c2f, B:373:0x0b6b, B:365:0x0af0, B:367:0x0afc, B:368:0x0b00, B:388:0x0c47, B:389:0x0c5f, B:392:0x0c67, B:393:0x0c6c, B:394:0x0c7c, B:396:0x0c96, B:397:0x0cb1, B:398:0x0cba, B:403:0x0cd9, B:402:0x0cc6, B:338:0x0a67, B:340:0x0a6d, B:342:0x0a77, B:344:0x0a7e, B:350:0x0a8e, B:352:0x0a95, B:354:0x0ab4, B:356:0x0abb, B:355:0x0ab8, B:351:0x0a92, B:343:0x0a7b, B:201:0x05ca, B:203:0x05d0, B:406:0x0ceb), top: B:420:0x000e, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0387 A[Catch: all -> 0x0cfd, TryCatch #4 {all -> 0x0cfd, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:172:0x0528, B:24:0x00f5, B:26:0x0103, B:29:0x0123, B:31:0x0129, B:33:0x013b, B:35:0x0149, B:37:0x0159, B:38:0x0166, B:39:0x016b, B:42:0x0184, B:110:0x03a0, B:111:0x03ac, B:114:0x03b6, B:120:0x03d9, B:117:0x03c8, B:142:0x0458, B:144:0x0464, B:147:0x0477, B:149:0x0488, B:151:0x0494, B:171:0x0512, B:156:0x04b4, B:158:0x04c2, B:161:0x04d7, B:163:0x04e9, B:165:0x04f5, B:124:0x03e1, B:126:0x03ed, B:128:0x03f9, B:140:0x043e, B:132:0x0416, B:135:0x0428, B:137:0x042e, B:139:0x0438, B:67:0x01e1, B:70:0x01eb, B:72:0x01f9, B:76:0x023e, B:73:0x0215, B:75:0x0225, B:80:0x024b, B:82:0x0277, B:83:0x02a1, B:85:0x02d7, B:87:0x02dd, B:90:0x02e9, B:92:0x031f, B:93:0x033a, B:95:0x0340, B:97:0x034e, B:101:0x0361, B:98:0x0356, B:104:0x0368, B:107:0x036f, B:108:0x0387, B:175:0x053d, B:177:0x054b, B:179:0x0556, B:190:0x0588, B:180:0x055e, B:182:0x0569, B:184:0x056f, B:187:0x057b, B:189:0x0583, B:191:0x058b, B:192:0x0597, B:195:0x059f, B:197:0x05b1, B:198:0x05bd, B:200:0x05c5, B:204:0x05ea, B:206:0x060f, B:208:0x0620, B:210:0x0626, B:212:0x0632, B:213:0x0663, B:215:0x0669, B:217:0x0677, B:218:0x067b, B:219:0x067e, B:220:0x0681, B:221:0x068f, B:223:0x0695, B:225:0x06a5, B:226:0x06ac, B:228:0x06b8, B:229:0x06bf, B:230:0x06c2, B:232:0x0700, B:233:0x0713, B:235:0x0719, B:238:0x0733, B:240:0x074e, B:242:0x0767, B:244:0x076c, B:246:0x0770, B:248:0x0774, B:250:0x077e, B:251:0x0788, B:253:0x078c, B:255:0x0792, B:256:0x07a0, B:257:0x07a9, B:325:0x09f8, B:259:0x07b6, B:261:0x07cd, B:267:0x07e9, B:269:0x080d, B:270:0x0815, B:272:0x081b, B:274:0x082d, B:281:0x0857, B:282:0x087a, B:284:0x0886, B:286:0x089b, B:288:0x08dc, B:292:0x08f4, B:294:0x08fb, B:296:0x090a, B:298:0x090e, B:300:0x0912, B:302:0x0916, B:303:0x0922, B:304:0x0927, B:306:0x092d, B:308:0x0949, B:309:0x094e, B:324:0x09f5, B:310:0x0969, B:312:0x0971, B:316:0x0998, B:318:0x09c4, B:319:0x09cb, B:320:0x09db, B:322:0x09e3, B:313:0x097e, B:279:0x0841, B:265:0x07d4, B:326:0x0a03, B:328:0x0a10, B:329:0x0a16, B:330:0x0a1e, B:332:0x0a24, B:335:0x0a3e, B:337:0x0a4f, B:357:0x0ac3, B:359:0x0ac9, B:361:0x0ae1, B:364:0x0ae8, B:369:0x0b17, B:371:0x0b59, B:374:0x0b8e, B:375:0x0b92, B:376:0x0b9d, B:378:0x0be0, B:379:0x0bed, B:381:0x0bfc, B:385:0x0c16, B:387:0x0c2f, B:373:0x0b6b, B:365:0x0af0, B:367:0x0afc, B:368:0x0b00, B:388:0x0c47, B:389:0x0c5f, B:392:0x0c67, B:393:0x0c6c, B:394:0x0c7c, B:396:0x0c96, B:397:0x0cb1, B:398:0x0cba, B:403:0x0cd9, B:402:0x0cc6, B:338:0x0a67, B:340:0x0a6d, B:342:0x0a77, B:344:0x0a7e, B:350:0x0a8e, B:352:0x0a95, B:354:0x0ab4, B:356:0x0abb, B:355:0x0ab8, B:351:0x0a92, B:343:0x0a7b, B:201:0x05ca, B:203:0x05d0, B:406:0x0ceb), top: B:420:0x000e, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03a0 A[Catch: all -> 0x0cfd, TryCatch #4 {all -> 0x0cfd, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:172:0x0528, B:24:0x00f5, B:26:0x0103, B:29:0x0123, B:31:0x0129, B:33:0x013b, B:35:0x0149, B:37:0x0159, B:38:0x0166, B:39:0x016b, B:42:0x0184, B:110:0x03a0, B:111:0x03ac, B:114:0x03b6, B:120:0x03d9, B:117:0x03c8, B:142:0x0458, B:144:0x0464, B:147:0x0477, B:149:0x0488, B:151:0x0494, B:171:0x0512, B:156:0x04b4, B:158:0x04c2, B:161:0x04d7, B:163:0x04e9, B:165:0x04f5, B:124:0x03e1, B:126:0x03ed, B:128:0x03f9, B:140:0x043e, B:132:0x0416, B:135:0x0428, B:137:0x042e, B:139:0x0438, B:67:0x01e1, B:70:0x01eb, B:72:0x01f9, B:76:0x023e, B:73:0x0215, B:75:0x0225, B:80:0x024b, B:82:0x0277, B:83:0x02a1, B:85:0x02d7, B:87:0x02dd, B:90:0x02e9, B:92:0x031f, B:93:0x033a, B:95:0x0340, B:97:0x034e, B:101:0x0361, B:98:0x0356, B:104:0x0368, B:107:0x036f, B:108:0x0387, B:175:0x053d, B:177:0x054b, B:179:0x0556, B:190:0x0588, B:180:0x055e, B:182:0x0569, B:184:0x056f, B:187:0x057b, B:189:0x0583, B:191:0x058b, B:192:0x0597, B:195:0x059f, B:197:0x05b1, B:198:0x05bd, B:200:0x05c5, B:204:0x05ea, B:206:0x060f, B:208:0x0620, B:210:0x0626, B:212:0x0632, B:213:0x0663, B:215:0x0669, B:217:0x0677, B:218:0x067b, B:219:0x067e, B:220:0x0681, B:221:0x068f, B:223:0x0695, B:225:0x06a5, B:226:0x06ac, B:228:0x06b8, B:229:0x06bf, B:230:0x06c2, B:232:0x0700, B:233:0x0713, B:235:0x0719, B:238:0x0733, B:240:0x074e, B:242:0x0767, B:244:0x076c, B:246:0x0770, B:248:0x0774, B:250:0x077e, B:251:0x0788, B:253:0x078c, B:255:0x0792, B:256:0x07a0, B:257:0x07a9, B:325:0x09f8, B:259:0x07b6, B:261:0x07cd, B:267:0x07e9, B:269:0x080d, B:270:0x0815, B:272:0x081b, B:274:0x082d, B:281:0x0857, B:282:0x087a, B:284:0x0886, B:286:0x089b, B:288:0x08dc, B:292:0x08f4, B:294:0x08fb, B:296:0x090a, B:298:0x090e, B:300:0x0912, B:302:0x0916, B:303:0x0922, B:304:0x0927, B:306:0x092d, B:308:0x0949, B:309:0x094e, B:324:0x09f5, B:310:0x0969, B:312:0x0971, B:316:0x0998, B:318:0x09c4, B:319:0x09cb, B:320:0x09db, B:322:0x09e3, B:313:0x097e, B:279:0x0841, B:265:0x07d4, B:326:0x0a03, B:328:0x0a10, B:329:0x0a16, B:330:0x0a1e, B:332:0x0a24, B:335:0x0a3e, B:337:0x0a4f, B:357:0x0ac3, B:359:0x0ac9, B:361:0x0ae1, B:364:0x0ae8, B:369:0x0b17, B:371:0x0b59, B:374:0x0b8e, B:375:0x0b92, B:376:0x0b9d, B:378:0x0be0, B:379:0x0bed, B:381:0x0bfc, B:385:0x0c16, B:387:0x0c2f, B:373:0x0b6b, B:365:0x0af0, B:367:0x0afc, B:368:0x0b00, B:388:0x0c47, B:389:0x0c5f, B:392:0x0c67, B:393:0x0c6c, B:394:0x0c7c, B:396:0x0c96, B:397:0x0cb1, B:398:0x0cba, B:403:0x0cd9, B:402:0x0cc6, B:338:0x0a67, B:340:0x0a6d, B:342:0x0a77, B:344:0x0a7e, B:350:0x0a8e, B:352:0x0a95, B:354:0x0ab4, B:356:0x0abb, B:355:0x0ab8, B:351:0x0a92, B:343:0x0a7b, B:201:0x05ca, B:203:0x05d0, B:406:0x0ceb), top: B:420:0x000e, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0464 A[Catch: all -> 0x0cfd, TryCatch #4 {all -> 0x0cfd, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:172:0x0528, B:24:0x00f5, B:26:0x0103, B:29:0x0123, B:31:0x0129, B:33:0x013b, B:35:0x0149, B:37:0x0159, B:38:0x0166, B:39:0x016b, B:42:0x0184, B:110:0x03a0, B:111:0x03ac, B:114:0x03b6, B:120:0x03d9, B:117:0x03c8, B:142:0x0458, B:144:0x0464, B:147:0x0477, B:149:0x0488, B:151:0x0494, B:171:0x0512, B:156:0x04b4, B:158:0x04c2, B:161:0x04d7, B:163:0x04e9, B:165:0x04f5, B:124:0x03e1, B:126:0x03ed, B:128:0x03f9, B:140:0x043e, B:132:0x0416, B:135:0x0428, B:137:0x042e, B:139:0x0438, B:67:0x01e1, B:70:0x01eb, B:72:0x01f9, B:76:0x023e, B:73:0x0215, B:75:0x0225, B:80:0x024b, B:82:0x0277, B:83:0x02a1, B:85:0x02d7, B:87:0x02dd, B:90:0x02e9, B:92:0x031f, B:93:0x033a, B:95:0x0340, B:97:0x034e, B:101:0x0361, B:98:0x0356, B:104:0x0368, B:107:0x036f, B:108:0x0387, B:175:0x053d, B:177:0x054b, B:179:0x0556, B:190:0x0588, B:180:0x055e, B:182:0x0569, B:184:0x056f, B:187:0x057b, B:189:0x0583, B:191:0x058b, B:192:0x0597, B:195:0x059f, B:197:0x05b1, B:198:0x05bd, B:200:0x05c5, B:204:0x05ea, B:206:0x060f, B:208:0x0620, B:210:0x0626, B:212:0x0632, B:213:0x0663, B:215:0x0669, B:217:0x0677, B:218:0x067b, B:219:0x067e, B:220:0x0681, B:221:0x068f, B:223:0x0695, B:225:0x06a5, B:226:0x06ac, B:228:0x06b8, B:229:0x06bf, B:230:0x06c2, B:232:0x0700, B:233:0x0713, B:235:0x0719, B:238:0x0733, B:240:0x074e, B:242:0x0767, B:244:0x076c, B:246:0x0770, B:248:0x0774, B:250:0x077e, B:251:0x0788, B:253:0x078c, B:255:0x0792, B:256:0x07a0, B:257:0x07a9, B:325:0x09f8, B:259:0x07b6, B:261:0x07cd, B:267:0x07e9, B:269:0x080d, B:270:0x0815, B:272:0x081b, B:274:0x082d, B:281:0x0857, B:282:0x087a, B:284:0x0886, B:286:0x089b, B:288:0x08dc, B:292:0x08f4, B:294:0x08fb, B:296:0x090a, B:298:0x090e, B:300:0x0912, B:302:0x0916, B:303:0x0922, B:304:0x0927, B:306:0x092d, B:308:0x0949, B:309:0x094e, B:324:0x09f5, B:310:0x0969, B:312:0x0971, B:316:0x0998, B:318:0x09c4, B:319:0x09cb, B:320:0x09db, B:322:0x09e3, B:313:0x097e, B:279:0x0841, B:265:0x07d4, B:326:0x0a03, B:328:0x0a10, B:329:0x0a16, B:330:0x0a1e, B:332:0x0a24, B:335:0x0a3e, B:337:0x0a4f, B:357:0x0ac3, B:359:0x0ac9, B:361:0x0ae1, B:364:0x0ae8, B:369:0x0b17, B:371:0x0b59, B:374:0x0b8e, B:375:0x0b92, B:376:0x0b9d, B:378:0x0be0, B:379:0x0bed, B:381:0x0bfc, B:385:0x0c16, B:387:0x0c2f, B:373:0x0b6b, B:365:0x0af0, B:367:0x0afc, B:368:0x0b00, B:388:0x0c47, B:389:0x0c5f, B:392:0x0c67, B:393:0x0c6c, B:394:0x0c7c, B:396:0x0c96, B:397:0x0cb1, B:398:0x0cba, B:403:0x0cd9, B:402:0x0cc6, B:338:0x0a67, B:340:0x0a6d, B:342:0x0a77, B:344:0x0a7e, B:350:0x0a8e, B:352:0x0a95, B:354:0x0ab4, B:356:0x0abb, B:355:0x0ab8, B:351:0x0a92, B:343:0x0a7b, B:201:0x05ca, B:203:0x05d0, B:406:0x0ceb), top: B:420:0x000e, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04b4 A[Catch: all -> 0x0cfd, TryCatch #4 {all -> 0x0cfd, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:172:0x0528, B:24:0x00f5, B:26:0x0103, B:29:0x0123, B:31:0x0129, B:33:0x013b, B:35:0x0149, B:37:0x0159, B:38:0x0166, B:39:0x016b, B:42:0x0184, B:110:0x03a0, B:111:0x03ac, B:114:0x03b6, B:120:0x03d9, B:117:0x03c8, B:142:0x0458, B:144:0x0464, B:147:0x0477, B:149:0x0488, B:151:0x0494, B:171:0x0512, B:156:0x04b4, B:158:0x04c2, B:161:0x04d7, B:163:0x04e9, B:165:0x04f5, B:124:0x03e1, B:126:0x03ed, B:128:0x03f9, B:140:0x043e, B:132:0x0416, B:135:0x0428, B:137:0x042e, B:139:0x0438, B:67:0x01e1, B:70:0x01eb, B:72:0x01f9, B:76:0x023e, B:73:0x0215, B:75:0x0225, B:80:0x024b, B:82:0x0277, B:83:0x02a1, B:85:0x02d7, B:87:0x02dd, B:90:0x02e9, B:92:0x031f, B:93:0x033a, B:95:0x0340, B:97:0x034e, B:101:0x0361, B:98:0x0356, B:104:0x0368, B:107:0x036f, B:108:0x0387, B:175:0x053d, B:177:0x054b, B:179:0x0556, B:190:0x0588, B:180:0x055e, B:182:0x0569, B:184:0x056f, B:187:0x057b, B:189:0x0583, B:191:0x058b, B:192:0x0597, B:195:0x059f, B:197:0x05b1, B:198:0x05bd, B:200:0x05c5, B:204:0x05ea, B:206:0x060f, B:208:0x0620, B:210:0x0626, B:212:0x0632, B:213:0x0663, B:215:0x0669, B:217:0x0677, B:218:0x067b, B:219:0x067e, B:220:0x0681, B:221:0x068f, B:223:0x0695, B:225:0x06a5, B:226:0x06ac, B:228:0x06b8, B:229:0x06bf, B:230:0x06c2, B:232:0x0700, B:233:0x0713, B:235:0x0719, B:238:0x0733, B:240:0x074e, B:242:0x0767, B:244:0x076c, B:246:0x0770, B:248:0x0774, B:250:0x077e, B:251:0x0788, B:253:0x078c, B:255:0x0792, B:256:0x07a0, B:257:0x07a9, B:325:0x09f8, B:259:0x07b6, B:261:0x07cd, B:267:0x07e9, B:269:0x080d, B:270:0x0815, B:272:0x081b, B:274:0x082d, B:281:0x0857, B:282:0x087a, B:284:0x0886, B:286:0x089b, B:288:0x08dc, B:292:0x08f4, B:294:0x08fb, B:296:0x090a, B:298:0x090e, B:300:0x0912, B:302:0x0916, B:303:0x0922, B:304:0x0927, B:306:0x092d, B:308:0x0949, B:309:0x094e, B:324:0x09f5, B:310:0x0969, B:312:0x0971, B:316:0x0998, B:318:0x09c4, B:319:0x09cb, B:320:0x09db, B:322:0x09e3, B:313:0x097e, B:279:0x0841, B:265:0x07d4, B:326:0x0a03, B:328:0x0a10, B:329:0x0a16, B:330:0x0a1e, B:332:0x0a24, B:335:0x0a3e, B:337:0x0a4f, B:357:0x0ac3, B:359:0x0ac9, B:361:0x0ae1, B:364:0x0ae8, B:369:0x0b17, B:371:0x0b59, B:374:0x0b8e, B:375:0x0b92, B:376:0x0b9d, B:378:0x0be0, B:379:0x0bed, B:381:0x0bfc, B:385:0x0c16, B:387:0x0c2f, B:373:0x0b6b, B:365:0x0af0, B:367:0x0afc, B:368:0x0b00, B:388:0x0c47, B:389:0x0c5f, B:392:0x0c67, B:393:0x0c6c, B:394:0x0c7c, B:396:0x0c96, B:397:0x0cb1, B:398:0x0cba, B:403:0x0cd9, B:402:0x0cc6, B:338:0x0a67, B:340:0x0a6d, B:342:0x0a77, B:344:0x0a7e, B:350:0x0a8e, B:352:0x0a95, B:354:0x0ab4, B:356:0x0abb, B:355:0x0ab8, B:351:0x0a92, B:343:0x0a7b, B:201:0x05ca, B:203:0x05d0, B:406:0x0ceb), top: B:420:0x000e, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x055e A[Catch: all -> 0x0cfd, TryCatch #4 {all -> 0x0cfd, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:172:0x0528, B:24:0x00f5, B:26:0x0103, B:29:0x0123, B:31:0x0129, B:33:0x013b, B:35:0x0149, B:37:0x0159, B:38:0x0166, B:39:0x016b, B:42:0x0184, B:110:0x03a0, B:111:0x03ac, B:114:0x03b6, B:120:0x03d9, B:117:0x03c8, B:142:0x0458, B:144:0x0464, B:147:0x0477, B:149:0x0488, B:151:0x0494, B:171:0x0512, B:156:0x04b4, B:158:0x04c2, B:161:0x04d7, B:163:0x04e9, B:165:0x04f5, B:124:0x03e1, B:126:0x03ed, B:128:0x03f9, B:140:0x043e, B:132:0x0416, B:135:0x0428, B:137:0x042e, B:139:0x0438, B:67:0x01e1, B:70:0x01eb, B:72:0x01f9, B:76:0x023e, B:73:0x0215, B:75:0x0225, B:80:0x024b, B:82:0x0277, B:83:0x02a1, B:85:0x02d7, B:87:0x02dd, B:90:0x02e9, B:92:0x031f, B:93:0x033a, B:95:0x0340, B:97:0x034e, B:101:0x0361, B:98:0x0356, B:104:0x0368, B:107:0x036f, B:108:0x0387, B:175:0x053d, B:177:0x054b, B:179:0x0556, B:190:0x0588, B:180:0x055e, B:182:0x0569, B:184:0x056f, B:187:0x057b, B:189:0x0583, B:191:0x058b, B:192:0x0597, B:195:0x059f, B:197:0x05b1, B:198:0x05bd, B:200:0x05c5, B:204:0x05ea, B:206:0x060f, B:208:0x0620, B:210:0x0626, B:212:0x0632, B:213:0x0663, B:215:0x0669, B:217:0x0677, B:218:0x067b, B:219:0x067e, B:220:0x0681, B:221:0x068f, B:223:0x0695, B:225:0x06a5, B:226:0x06ac, B:228:0x06b8, B:229:0x06bf, B:230:0x06c2, B:232:0x0700, B:233:0x0713, B:235:0x0719, B:238:0x0733, B:240:0x074e, B:242:0x0767, B:244:0x076c, B:246:0x0770, B:248:0x0774, B:250:0x077e, B:251:0x0788, B:253:0x078c, B:255:0x0792, B:256:0x07a0, B:257:0x07a9, B:325:0x09f8, B:259:0x07b6, B:261:0x07cd, B:267:0x07e9, B:269:0x080d, B:270:0x0815, B:272:0x081b, B:274:0x082d, B:281:0x0857, B:282:0x087a, B:284:0x0886, B:286:0x089b, B:288:0x08dc, B:292:0x08f4, B:294:0x08fb, B:296:0x090a, B:298:0x090e, B:300:0x0912, B:302:0x0916, B:303:0x0922, B:304:0x0927, B:306:0x092d, B:308:0x0949, B:309:0x094e, B:324:0x09f5, B:310:0x0969, B:312:0x0971, B:316:0x0998, B:318:0x09c4, B:319:0x09cb, B:320:0x09db, B:322:0x09e3, B:313:0x097e, B:279:0x0841, B:265:0x07d4, B:326:0x0a03, B:328:0x0a10, B:329:0x0a16, B:330:0x0a1e, B:332:0x0a24, B:335:0x0a3e, B:337:0x0a4f, B:357:0x0ac3, B:359:0x0ac9, B:361:0x0ae1, B:364:0x0ae8, B:369:0x0b17, B:371:0x0b59, B:374:0x0b8e, B:375:0x0b92, B:376:0x0b9d, B:378:0x0be0, B:379:0x0bed, B:381:0x0bfc, B:385:0x0c16, B:387:0x0c2f, B:373:0x0b6b, B:365:0x0af0, B:367:0x0afc, B:368:0x0b00, B:388:0x0c47, B:389:0x0c5f, B:392:0x0c67, B:393:0x0c6c, B:394:0x0c7c, B:396:0x0c96, B:397:0x0cb1, B:398:0x0cba, B:403:0x0cd9, B:402:0x0cc6, B:338:0x0a67, B:340:0x0a6d, B:342:0x0a77, B:344:0x0a7e, B:350:0x0a8e, B:352:0x0a95, B:354:0x0ab4, B:356:0x0abb, B:355:0x0ab8, B:351:0x0a92, B:343:0x0a7b, B:201:0x05ca, B:203:0x05d0, B:406:0x0ceb), top: B:420:0x000e, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x080d A[Catch: all -> 0x0cfd, TryCatch #4 {all -> 0x0cfd, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:172:0x0528, B:24:0x00f5, B:26:0x0103, B:29:0x0123, B:31:0x0129, B:33:0x013b, B:35:0x0149, B:37:0x0159, B:38:0x0166, B:39:0x016b, B:42:0x0184, B:110:0x03a0, B:111:0x03ac, B:114:0x03b6, B:120:0x03d9, B:117:0x03c8, B:142:0x0458, B:144:0x0464, B:147:0x0477, B:149:0x0488, B:151:0x0494, B:171:0x0512, B:156:0x04b4, B:158:0x04c2, B:161:0x04d7, B:163:0x04e9, B:165:0x04f5, B:124:0x03e1, B:126:0x03ed, B:128:0x03f9, B:140:0x043e, B:132:0x0416, B:135:0x0428, B:137:0x042e, B:139:0x0438, B:67:0x01e1, B:70:0x01eb, B:72:0x01f9, B:76:0x023e, B:73:0x0215, B:75:0x0225, B:80:0x024b, B:82:0x0277, B:83:0x02a1, B:85:0x02d7, B:87:0x02dd, B:90:0x02e9, B:92:0x031f, B:93:0x033a, B:95:0x0340, B:97:0x034e, B:101:0x0361, B:98:0x0356, B:104:0x0368, B:107:0x036f, B:108:0x0387, B:175:0x053d, B:177:0x054b, B:179:0x0556, B:190:0x0588, B:180:0x055e, B:182:0x0569, B:184:0x056f, B:187:0x057b, B:189:0x0583, B:191:0x058b, B:192:0x0597, B:195:0x059f, B:197:0x05b1, B:198:0x05bd, B:200:0x05c5, B:204:0x05ea, B:206:0x060f, B:208:0x0620, B:210:0x0626, B:212:0x0632, B:213:0x0663, B:215:0x0669, B:217:0x0677, B:218:0x067b, B:219:0x067e, B:220:0x0681, B:221:0x068f, B:223:0x0695, B:225:0x06a5, B:226:0x06ac, B:228:0x06b8, B:229:0x06bf, B:230:0x06c2, B:232:0x0700, B:233:0x0713, B:235:0x0719, B:238:0x0733, B:240:0x074e, B:242:0x0767, B:244:0x076c, B:246:0x0770, B:248:0x0774, B:250:0x077e, B:251:0x0788, B:253:0x078c, B:255:0x0792, B:256:0x07a0, B:257:0x07a9, B:325:0x09f8, B:259:0x07b6, B:261:0x07cd, B:267:0x07e9, B:269:0x080d, B:270:0x0815, B:272:0x081b, B:274:0x082d, B:281:0x0857, B:282:0x087a, B:284:0x0886, B:286:0x089b, B:288:0x08dc, B:292:0x08f4, B:294:0x08fb, B:296:0x090a, B:298:0x090e, B:300:0x0912, B:302:0x0916, B:303:0x0922, B:304:0x0927, B:306:0x092d, B:308:0x0949, B:309:0x094e, B:324:0x09f5, B:310:0x0969, B:312:0x0971, B:316:0x0998, B:318:0x09c4, B:319:0x09cb, B:320:0x09db, B:322:0x09e3, B:313:0x097e, B:279:0x0841, B:265:0x07d4, B:326:0x0a03, B:328:0x0a10, B:329:0x0a16, B:330:0x0a1e, B:332:0x0a24, B:335:0x0a3e, B:337:0x0a4f, B:357:0x0ac3, B:359:0x0ac9, B:361:0x0ae1, B:364:0x0ae8, B:369:0x0b17, B:371:0x0b59, B:374:0x0b8e, B:375:0x0b92, B:376:0x0b9d, B:378:0x0be0, B:379:0x0bed, B:381:0x0bfc, B:385:0x0c16, B:387:0x0c2f, B:373:0x0b6b, B:365:0x0af0, B:367:0x0afc, B:368:0x0b00, B:388:0x0c47, B:389:0x0c5f, B:392:0x0c67, B:393:0x0c6c, B:394:0x0c7c, B:396:0x0c96, B:397:0x0cb1, B:398:0x0cba, B:403:0x0cd9, B:402:0x0cc6, B:338:0x0a67, B:340:0x0a6d, B:342:0x0a77, B:344:0x0a7e, B:350:0x0a8e, B:352:0x0a95, B:354:0x0ab4, B:356:0x0abb, B:355:0x0ab8, B:351:0x0a92, B:343:0x0a7b, B:201:0x05ca, B:203:0x05d0, B:406:0x0ceb), top: B:420:0x000e, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0841 A[Catch: all -> 0x0cfd, EDGE_INSN: B:461:0x0841->B:279:0x0841 BREAK  A[LOOP:11: B:270:0x0815->B:278:0x083e], TryCatch #4 {all -> 0x0cfd, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:172:0x0528, B:24:0x00f5, B:26:0x0103, B:29:0x0123, B:31:0x0129, B:33:0x013b, B:35:0x0149, B:37:0x0159, B:38:0x0166, B:39:0x016b, B:42:0x0184, B:110:0x03a0, B:111:0x03ac, B:114:0x03b6, B:120:0x03d9, B:117:0x03c8, B:142:0x0458, B:144:0x0464, B:147:0x0477, B:149:0x0488, B:151:0x0494, B:171:0x0512, B:156:0x04b4, B:158:0x04c2, B:161:0x04d7, B:163:0x04e9, B:165:0x04f5, B:124:0x03e1, B:126:0x03ed, B:128:0x03f9, B:140:0x043e, B:132:0x0416, B:135:0x0428, B:137:0x042e, B:139:0x0438, B:67:0x01e1, B:70:0x01eb, B:72:0x01f9, B:76:0x023e, B:73:0x0215, B:75:0x0225, B:80:0x024b, B:82:0x0277, B:83:0x02a1, B:85:0x02d7, B:87:0x02dd, B:90:0x02e9, B:92:0x031f, B:93:0x033a, B:95:0x0340, B:97:0x034e, B:101:0x0361, B:98:0x0356, B:104:0x0368, B:107:0x036f, B:108:0x0387, B:175:0x053d, B:177:0x054b, B:179:0x0556, B:190:0x0588, B:180:0x055e, B:182:0x0569, B:184:0x056f, B:187:0x057b, B:189:0x0583, B:191:0x058b, B:192:0x0597, B:195:0x059f, B:197:0x05b1, B:198:0x05bd, B:200:0x05c5, B:204:0x05ea, B:206:0x060f, B:208:0x0620, B:210:0x0626, B:212:0x0632, B:213:0x0663, B:215:0x0669, B:217:0x0677, B:218:0x067b, B:219:0x067e, B:220:0x0681, B:221:0x068f, B:223:0x0695, B:225:0x06a5, B:226:0x06ac, B:228:0x06b8, B:229:0x06bf, B:230:0x06c2, B:232:0x0700, B:233:0x0713, B:235:0x0719, B:238:0x0733, B:240:0x074e, B:242:0x0767, B:244:0x076c, B:246:0x0770, B:248:0x0774, B:250:0x077e, B:251:0x0788, B:253:0x078c, B:255:0x0792, B:256:0x07a0, B:257:0x07a9, B:325:0x09f8, B:259:0x07b6, B:261:0x07cd, B:267:0x07e9, B:269:0x080d, B:270:0x0815, B:272:0x081b, B:274:0x082d, B:281:0x0857, B:282:0x087a, B:284:0x0886, B:286:0x089b, B:288:0x08dc, B:292:0x08f4, B:294:0x08fb, B:296:0x090a, B:298:0x090e, B:300:0x0912, B:302:0x0916, B:303:0x0922, B:304:0x0927, B:306:0x092d, B:308:0x0949, B:309:0x094e, B:324:0x09f5, B:310:0x0969, B:312:0x0971, B:316:0x0998, B:318:0x09c4, B:319:0x09cb, B:320:0x09db, B:322:0x09e3, B:313:0x097e, B:279:0x0841, B:265:0x07d4, B:326:0x0a03, B:328:0x0a10, B:329:0x0a16, B:330:0x0a1e, B:332:0x0a24, B:335:0x0a3e, B:337:0x0a4f, B:357:0x0ac3, B:359:0x0ac9, B:361:0x0ae1, B:364:0x0ae8, B:369:0x0b17, B:371:0x0b59, B:374:0x0b8e, B:375:0x0b92, B:376:0x0b9d, B:378:0x0be0, B:379:0x0bed, B:381:0x0bfc, B:385:0x0c16, B:387:0x0c2f, B:373:0x0b6b, B:365:0x0af0, B:367:0x0afc, B:368:0x0b00, B:388:0x0c47, B:389:0x0c5f, B:392:0x0c67, B:393:0x0c6c, B:394:0x0c7c, B:396:0x0c96, B:397:0x0cb1, B:398:0x0cba, B:403:0x0cd9, B:402:0x0cc6, B:338:0x0a67, B:340:0x0a6d, B:342:0x0a77, B:344:0x0a7e, B:350:0x0a8e, B:352:0x0a95, B:354:0x0ab4, B:356:0x0abb, B:355:0x0ab8, B:351:0x0a92, B:343:0x0a7b, B:201:0x05ca, B:203:0x05d0, B:406:0x0ceb), top: B:420:0x000e, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0857 A[Catch: all -> 0x0cfd, TryCatch #4 {all -> 0x0cfd, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:172:0x0528, B:24:0x00f5, B:26:0x0103, B:29:0x0123, B:31:0x0129, B:33:0x013b, B:35:0x0149, B:37:0x0159, B:38:0x0166, B:39:0x016b, B:42:0x0184, B:110:0x03a0, B:111:0x03ac, B:114:0x03b6, B:120:0x03d9, B:117:0x03c8, B:142:0x0458, B:144:0x0464, B:147:0x0477, B:149:0x0488, B:151:0x0494, B:171:0x0512, B:156:0x04b4, B:158:0x04c2, B:161:0x04d7, B:163:0x04e9, B:165:0x04f5, B:124:0x03e1, B:126:0x03ed, B:128:0x03f9, B:140:0x043e, B:132:0x0416, B:135:0x0428, B:137:0x042e, B:139:0x0438, B:67:0x01e1, B:70:0x01eb, B:72:0x01f9, B:76:0x023e, B:73:0x0215, B:75:0x0225, B:80:0x024b, B:82:0x0277, B:83:0x02a1, B:85:0x02d7, B:87:0x02dd, B:90:0x02e9, B:92:0x031f, B:93:0x033a, B:95:0x0340, B:97:0x034e, B:101:0x0361, B:98:0x0356, B:104:0x0368, B:107:0x036f, B:108:0x0387, B:175:0x053d, B:177:0x054b, B:179:0x0556, B:190:0x0588, B:180:0x055e, B:182:0x0569, B:184:0x056f, B:187:0x057b, B:189:0x0583, B:191:0x058b, B:192:0x0597, B:195:0x059f, B:197:0x05b1, B:198:0x05bd, B:200:0x05c5, B:204:0x05ea, B:206:0x060f, B:208:0x0620, B:210:0x0626, B:212:0x0632, B:213:0x0663, B:215:0x0669, B:217:0x0677, B:218:0x067b, B:219:0x067e, B:220:0x0681, B:221:0x068f, B:223:0x0695, B:225:0x06a5, B:226:0x06ac, B:228:0x06b8, B:229:0x06bf, B:230:0x06c2, B:232:0x0700, B:233:0x0713, B:235:0x0719, B:238:0x0733, B:240:0x074e, B:242:0x0767, B:244:0x076c, B:246:0x0770, B:248:0x0774, B:250:0x077e, B:251:0x0788, B:253:0x078c, B:255:0x0792, B:256:0x07a0, B:257:0x07a9, B:325:0x09f8, B:259:0x07b6, B:261:0x07cd, B:267:0x07e9, B:269:0x080d, B:270:0x0815, B:272:0x081b, B:274:0x082d, B:281:0x0857, B:282:0x087a, B:284:0x0886, B:286:0x089b, B:288:0x08dc, B:292:0x08f4, B:294:0x08fb, B:296:0x090a, B:298:0x090e, B:300:0x0912, B:302:0x0916, B:303:0x0922, B:304:0x0927, B:306:0x092d, B:308:0x0949, B:309:0x094e, B:324:0x09f5, B:310:0x0969, B:312:0x0971, B:316:0x0998, B:318:0x09c4, B:319:0x09cb, B:320:0x09db, B:322:0x09e3, B:313:0x097e, B:279:0x0841, B:265:0x07d4, B:326:0x0a03, B:328:0x0a10, B:329:0x0a16, B:330:0x0a1e, B:332:0x0a24, B:335:0x0a3e, B:337:0x0a4f, B:357:0x0ac3, B:359:0x0ac9, B:361:0x0ae1, B:364:0x0ae8, B:369:0x0b17, B:371:0x0b59, B:374:0x0b8e, B:375:0x0b92, B:376:0x0b9d, B:378:0x0be0, B:379:0x0bed, B:381:0x0bfc, B:385:0x0c16, B:387:0x0c2f, B:373:0x0b6b, B:365:0x0af0, B:367:0x0afc, B:368:0x0b00, B:388:0x0c47, B:389:0x0c5f, B:392:0x0c67, B:393:0x0c6c, B:394:0x0c7c, B:396:0x0c96, B:397:0x0cb1, B:398:0x0cba, B:403:0x0cd9, B:402:0x0cc6, B:338:0x0a67, B:340:0x0a6d, B:342:0x0a77, B:344:0x0a7e, B:350:0x0a8e, B:352:0x0a95, B:354:0x0ab4, B:356:0x0abb, B:355:0x0ab8, B:351:0x0a92, B:343:0x0a7b, B:201:0x05ca, B:203:0x05d0, B:406:0x0ceb), top: B:420:0x000e, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x087a A[Catch: all -> 0x0cfd, TryCatch #4 {all -> 0x0cfd, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:172:0x0528, B:24:0x00f5, B:26:0x0103, B:29:0x0123, B:31:0x0129, B:33:0x013b, B:35:0x0149, B:37:0x0159, B:38:0x0166, B:39:0x016b, B:42:0x0184, B:110:0x03a0, B:111:0x03ac, B:114:0x03b6, B:120:0x03d9, B:117:0x03c8, B:142:0x0458, B:144:0x0464, B:147:0x0477, B:149:0x0488, B:151:0x0494, B:171:0x0512, B:156:0x04b4, B:158:0x04c2, B:161:0x04d7, B:163:0x04e9, B:165:0x04f5, B:124:0x03e1, B:126:0x03ed, B:128:0x03f9, B:140:0x043e, B:132:0x0416, B:135:0x0428, B:137:0x042e, B:139:0x0438, B:67:0x01e1, B:70:0x01eb, B:72:0x01f9, B:76:0x023e, B:73:0x0215, B:75:0x0225, B:80:0x024b, B:82:0x0277, B:83:0x02a1, B:85:0x02d7, B:87:0x02dd, B:90:0x02e9, B:92:0x031f, B:93:0x033a, B:95:0x0340, B:97:0x034e, B:101:0x0361, B:98:0x0356, B:104:0x0368, B:107:0x036f, B:108:0x0387, B:175:0x053d, B:177:0x054b, B:179:0x0556, B:190:0x0588, B:180:0x055e, B:182:0x0569, B:184:0x056f, B:187:0x057b, B:189:0x0583, B:191:0x058b, B:192:0x0597, B:195:0x059f, B:197:0x05b1, B:198:0x05bd, B:200:0x05c5, B:204:0x05ea, B:206:0x060f, B:208:0x0620, B:210:0x0626, B:212:0x0632, B:213:0x0663, B:215:0x0669, B:217:0x0677, B:218:0x067b, B:219:0x067e, B:220:0x0681, B:221:0x068f, B:223:0x0695, B:225:0x06a5, B:226:0x06ac, B:228:0x06b8, B:229:0x06bf, B:230:0x06c2, B:232:0x0700, B:233:0x0713, B:235:0x0719, B:238:0x0733, B:240:0x074e, B:242:0x0767, B:244:0x076c, B:246:0x0770, B:248:0x0774, B:250:0x077e, B:251:0x0788, B:253:0x078c, B:255:0x0792, B:256:0x07a0, B:257:0x07a9, B:325:0x09f8, B:259:0x07b6, B:261:0x07cd, B:267:0x07e9, B:269:0x080d, B:270:0x0815, B:272:0x081b, B:274:0x082d, B:281:0x0857, B:282:0x087a, B:284:0x0886, B:286:0x089b, B:288:0x08dc, B:292:0x08f4, B:294:0x08fb, B:296:0x090a, B:298:0x090e, B:300:0x0912, B:302:0x0916, B:303:0x0922, B:304:0x0927, B:306:0x092d, B:308:0x0949, B:309:0x094e, B:324:0x09f5, B:310:0x0969, B:312:0x0971, B:316:0x0998, B:318:0x09c4, B:319:0x09cb, B:320:0x09db, B:322:0x09e3, B:313:0x097e, B:279:0x0841, B:265:0x07d4, B:326:0x0a03, B:328:0x0a10, B:329:0x0a16, B:330:0x0a1e, B:332:0x0a24, B:335:0x0a3e, B:337:0x0a4f, B:357:0x0ac3, B:359:0x0ac9, B:361:0x0ae1, B:364:0x0ae8, B:369:0x0b17, B:371:0x0b59, B:374:0x0b8e, B:375:0x0b92, B:376:0x0b9d, B:378:0x0be0, B:379:0x0bed, B:381:0x0bfc, B:385:0x0c16, B:387:0x0c2f, B:373:0x0b6b, B:365:0x0af0, B:367:0x0afc, B:368:0x0b00, B:388:0x0c47, B:389:0x0c5f, B:392:0x0c67, B:393:0x0c6c, B:394:0x0c7c, B:396:0x0c96, B:397:0x0cb1, B:398:0x0cba, B:403:0x0cd9, B:402:0x0cc6, B:338:0x0a67, B:340:0x0a6d, B:342:0x0a77, B:344:0x0a7e, B:350:0x0a8e, B:352:0x0a95, B:354:0x0ab4, B:356:0x0abb, B:355:0x0ab8, B:351:0x0a92, B:343:0x0a7b, B:201:0x05ca, B:203:0x05d0, B:406:0x0ceb), top: B:420:0x000e, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x08da A[PHI: r7
      0x08da: PHI (r7v35 com.google.android.gms.measurement.internal.zzas) = (r7v34 com.google.android.gms.measurement.internal.zzas), (r7v49 com.google.android.gms.measurement.internal.zzas) binds: [B:283:0x0884, B:285:0x0899] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0b6b A[Catch: all -> 0x0cfd, TryCatch #4 {all -> 0x0cfd, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:172:0x0528, B:24:0x00f5, B:26:0x0103, B:29:0x0123, B:31:0x0129, B:33:0x013b, B:35:0x0149, B:37:0x0159, B:38:0x0166, B:39:0x016b, B:42:0x0184, B:110:0x03a0, B:111:0x03ac, B:114:0x03b6, B:120:0x03d9, B:117:0x03c8, B:142:0x0458, B:144:0x0464, B:147:0x0477, B:149:0x0488, B:151:0x0494, B:171:0x0512, B:156:0x04b4, B:158:0x04c2, B:161:0x04d7, B:163:0x04e9, B:165:0x04f5, B:124:0x03e1, B:126:0x03ed, B:128:0x03f9, B:140:0x043e, B:132:0x0416, B:135:0x0428, B:137:0x042e, B:139:0x0438, B:67:0x01e1, B:70:0x01eb, B:72:0x01f9, B:76:0x023e, B:73:0x0215, B:75:0x0225, B:80:0x024b, B:82:0x0277, B:83:0x02a1, B:85:0x02d7, B:87:0x02dd, B:90:0x02e9, B:92:0x031f, B:93:0x033a, B:95:0x0340, B:97:0x034e, B:101:0x0361, B:98:0x0356, B:104:0x0368, B:107:0x036f, B:108:0x0387, B:175:0x053d, B:177:0x054b, B:179:0x0556, B:190:0x0588, B:180:0x055e, B:182:0x0569, B:184:0x056f, B:187:0x057b, B:189:0x0583, B:191:0x058b, B:192:0x0597, B:195:0x059f, B:197:0x05b1, B:198:0x05bd, B:200:0x05c5, B:204:0x05ea, B:206:0x060f, B:208:0x0620, B:210:0x0626, B:212:0x0632, B:213:0x0663, B:215:0x0669, B:217:0x0677, B:218:0x067b, B:219:0x067e, B:220:0x0681, B:221:0x068f, B:223:0x0695, B:225:0x06a5, B:226:0x06ac, B:228:0x06b8, B:229:0x06bf, B:230:0x06c2, B:232:0x0700, B:233:0x0713, B:235:0x0719, B:238:0x0733, B:240:0x074e, B:242:0x0767, B:244:0x076c, B:246:0x0770, B:248:0x0774, B:250:0x077e, B:251:0x0788, B:253:0x078c, B:255:0x0792, B:256:0x07a0, B:257:0x07a9, B:325:0x09f8, B:259:0x07b6, B:261:0x07cd, B:267:0x07e9, B:269:0x080d, B:270:0x0815, B:272:0x081b, B:274:0x082d, B:281:0x0857, B:282:0x087a, B:284:0x0886, B:286:0x089b, B:288:0x08dc, B:292:0x08f4, B:294:0x08fb, B:296:0x090a, B:298:0x090e, B:300:0x0912, B:302:0x0916, B:303:0x0922, B:304:0x0927, B:306:0x092d, B:308:0x0949, B:309:0x094e, B:324:0x09f5, B:310:0x0969, B:312:0x0971, B:316:0x0998, B:318:0x09c4, B:319:0x09cb, B:320:0x09db, B:322:0x09e3, B:313:0x097e, B:279:0x0841, B:265:0x07d4, B:326:0x0a03, B:328:0x0a10, B:329:0x0a16, B:330:0x0a1e, B:332:0x0a24, B:335:0x0a3e, B:337:0x0a4f, B:357:0x0ac3, B:359:0x0ac9, B:361:0x0ae1, B:364:0x0ae8, B:369:0x0b17, B:371:0x0b59, B:374:0x0b8e, B:375:0x0b92, B:376:0x0b9d, B:378:0x0be0, B:379:0x0bed, B:381:0x0bfc, B:385:0x0c16, B:387:0x0c2f, B:373:0x0b6b, B:365:0x0af0, B:367:0x0afc, B:368:0x0b00, B:388:0x0c47, B:389:0x0c5f, B:392:0x0c67, B:393:0x0c6c, B:394:0x0c7c, B:396:0x0c96, B:397:0x0cb1, B:398:0x0cba, B:403:0x0cd9, B:402:0x0cc6, B:338:0x0a67, B:340:0x0a6d, B:342:0x0a77, B:344:0x0a7e, B:350:0x0a8e, B:352:0x0a95, B:354:0x0ab4, B:356:0x0abb, B:355:0x0ab8, B:351:0x0a92, B:343:0x0a7b, B:201:0x05ca, B:203:0x05d0, B:406:0x0ceb), top: B:420:0x000e, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean zzah(String str, long j) {
        int i;
        int i2;
        com.google.android.gms.internal.measurement.zzgc zzgcVar;
        zzkq zzkqVar;
        long j2;
        int iZzc;
        long j3;
        SecureRandom secureRandom;
        com.google.android.gms.internal.measurement.zzgc zzgcVar2;
        zzkq zzkqVar2;
        Long l;
        int i3;
        long jZzr;
        int i4;
        com.google.android.gms.internal.measurement.zzgc zzgcVar3;
        String str2;
        String str3;
        int i5;
        int i6;
        com.google.android.gms.internal.measurement.zzgc zzgcVar4;
        com.google.android.gms.internal.measurement.zzfs zzfsVar;
        com.google.android.gms.internal.measurement.zzfs zzfsVar2;
        com.google.android.gms.internal.measurement.zzgc zzgcVar5;
        int i7;
        com.google.android.gms.internal.measurement.zzfs zzfsVar3;
        int i8;
        com.google.android.gms.internal.measurement.zzfs zzfsVar4;
        char c;
        String str4 = "_npa";
        String str5 = "_ai";
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        zzamVar.zzw();
        try {
            zzkq zzkqVar3 = new zzkq(this, null);
            zzam zzamVar2 = this.zze;
            zzal(zzamVar2);
            zzamVar2.zzU(null, j, this.zzA, zzkqVar3);
            List list = zzkqVar3.zzc;
            if (list != null && !list.isEmpty()) {
                com.google.android.gms.internal.measurement.zzgc zzgcVar6 = (com.google.android.gms.internal.measurement.zzgc) zzkqVar3.zza.zzby();
                zzgcVar6.zzr();
                com.google.android.gms.internal.measurement.zzfs zzfsVar5 = null;
                com.google.android.gms.internal.measurement.zzfs zzfsVar6 = null;
                int i9 = 0;
                int i10 = 0;
                int i11 = -1;
                int i12 = -1;
                int i13 = 0;
                while (true) {
                    i = i13;
                    i2 = i10;
                    com.google.android.gms.internal.measurement.zzfs zzfsVar7 = zzfsVar5;
                    if (i9 >= zzkqVar3.zzc.size()) {
                        break;
                    }
                    com.google.android.gms.internal.measurement.zzfs zzfsVar8 = (com.google.android.gms.internal.measurement.zzfs) ((com.google.android.gms.internal.measurement.zzft) zzkqVar3.zzc.get(i9)).zzby();
                    zzfi zzfiVar = this.zzc;
                    zzal(zzfiVar);
                    String str6 = str4;
                    if (zzfiVar.zzr(zzkqVar3.zza.zzx(), zzfsVar8.zzo())) {
                        zzay().zzk().zzc("Dropping blocked raw event. appId", zzeh.zzn(zzkqVar3.zza.zzx()), this.zzn.zzj().zzd(zzfsVar8.zzo()));
                        zzfi zzfiVar2 = this.zzc;
                        zzal(zzfiVar2);
                        if (!zzfiVar2.zzp(zzkqVar3.zza.zzx())) {
                            zzfi zzfiVar3 = this.zzc;
                            zzal(zzfiVar3);
                            if (!zzfiVar3.zzs(zzkqVar3.zza.zzx()) && !"_err".equals(zzfsVar8.zzo())) {
                                zzv().zzN(this.zzF, zzkqVar3.zza.zzx(), 11, "_ev", zzfsVar8.zzo(), 0);
                            }
                        }
                        str2 = str5;
                        zzgcVar5 = zzgcVar6;
                        i8 = i9;
                        i13 = i;
                        i10 = i2;
                        zzfsVar5 = zzfsVar7;
                    } else {
                        if (zzfsVar8.zzo().equals(zzgo.zza(str5))) {
                            zzfsVar8.zzi(str5);
                            zzay().zzj().zza("Renaming ad_impression to _ai");
                            if (Log.isLoggable(zzay().zzq(), 5)) {
                                int i14 = 0;
                                while (i14 < zzfsVar8.zza()) {
                                    String str7 = str5;
                                    if (FirebaseAnalytics.Param.AD_PLATFORM.equals(zzfsVar8.zzn(i14).zzg()) && !zzfsVar8.zzn(i14).zzh().isEmpty() && "admob".equalsIgnoreCase(zzfsVar8.zzn(i14).zzh())) {
                                        zzay().zzl().zza("AdMob ad impression logged from app. Potentially duplicative.");
                                    }
                                    i14++;
                                    str5 = str7;
                                }
                            }
                        }
                        str2 = str5;
                        zzfi zzfiVar4 = this.zzc;
                        zzal(zzfiVar4);
                        boolean zZzq = zzfiVar4.zzq(zzkqVar3.zza.zzx(), zzfsVar8.zzo());
                        if (zZzq) {
                            str3 = "_et";
                            i5 = i9;
                            i6 = i11;
                        } else {
                            zzal(this.zzi);
                            String strZzo = zzfsVar8.zzo();
                            Preconditions.checkNotEmpty(strZzo);
                            i5 = i9;
                            int iHashCode = strZzo.hashCode();
                            i6 = i11;
                            str3 = "_et";
                            if (iHashCode == 94660) {
                                if (strZzo.equals("_in")) {
                                    c = 0;
                                }
                                if (c != 0) {
                                }
                            } else if (iHashCode != 95025) {
                                c = (iHashCode == 95027 && strZzo.equals("_ui")) ? (char) 1 : (char) 65535;
                                if (c != 0 && c != 1 && c != 2) {
                                    zzgcVar4 = zzgcVar6;
                                    zzfsVar = zzfsVar6;
                                    zZzq = false;
                                }
                                if (zZzq) {
                                    if ("_e".equals(zzfsVar8.zzo())) {
                                    }
                                    i8 = i5;
                                    zzkqVar3.zzc.set(i8, (com.google.android.gms.internal.measurement.zzft) zzfsVar8.zzaC());
                                    i10 = i2 + 1;
                                    zzgcVar5.zzk(zzfsVar8);
                                    i13 = i;
                                    zzfsVar5 = zzfsVar7;
                                } else {
                                    ArrayList arrayList = new ArrayList(zzfsVar8.zzp());
                                    int i15 = -1;
                                    int i16 = -1;
                                    for (int i17 = 0; i17 < arrayList.size(); i17++) {
                                        if ("value".equals(((com.google.android.gms.internal.measurement.zzfx) arrayList.get(i17)).zzg())) {
                                            i15 = i17;
                                        } else if (FirebaseAnalytics.Param.CURRENCY.equals(((com.google.android.gms.internal.measurement.zzfx) arrayList.get(i17)).zzg())) {
                                            i16 = i17;
                                        }
                                    }
                                    if (i15 != -1) {
                                        if (((com.google.android.gms.internal.measurement.zzfx) arrayList.get(i15)).zzw() || ((com.google.android.gms.internal.measurement.zzfx) arrayList.get(i15)).zzu()) {
                                            if (i16 != -1) {
                                                String strZzh = ((com.google.android.gms.internal.measurement.zzfx) arrayList.get(i16)).zzh();
                                                if (strZzh.length() == 3) {
                                                    int iCharCount = 0;
                                                    while (iCharCount < strZzh.length()) {
                                                        int iCodePointAt = strZzh.codePointAt(iCharCount);
                                                        if (Character.isLetter(iCodePointAt)) {
                                                            iCharCount += Character.charCount(iCodePointAt);
                                                        }
                                                    }
                                                }
                                            }
                                            zzay().zzl().zza("Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter.");
                                            zzfsVar8.zzh(i15);
                                            zzab(zzfsVar8, "_c");
                                            zzaa(zzfsVar8, 19, FirebaseAnalytics.Param.CURRENCY);
                                            break;
                                        }
                                        zzay().zzl().zza("Value must be specified with a numeric type.");
                                        zzfsVar8.zzh(i15);
                                        zzab(zzfsVar8, "_c");
                                        zzaa(zzfsVar8, 18, "value");
                                    }
                                    if ("_e".equals(zzfsVar8.zzo())) {
                                        zzgcVar5 = zzgcVar4;
                                        if ("_vs".equals(zzfsVar8.zzo())) {
                                            zzal(this.zzi);
                                            if (zzkv.zzB((com.google.android.gms.internal.measurement.zzft) zzfsVar8.zzaC(), str3) == null) {
                                                if (zzfsVar7 == null || Math.abs(zzfsVar7.zzc() - zzfsVar8.zzc()) > 1000) {
                                                    i11 = i6;
                                                    zzfsVar6 = zzfsVar8;
                                                    i12 = i2;
                                                } else {
                                                    com.google.android.gms.internal.measurement.zzfs zzfsVar9 = (com.google.android.gms.internal.measurement.zzfs) zzfsVar7.clone();
                                                    if (zzaj(zzfsVar9, zzfsVar8)) {
                                                        i7 = i6;
                                                        zzgcVar5.zzS(i7, zzfsVar9);
                                                        zzfsVar3 = null;
                                                        zzfsVar7 = null;
                                                    } else {
                                                        i7 = i6;
                                                        zzfsVar3 = zzfsVar8;
                                                        i12 = i2;
                                                    }
                                                    zzfsVar6 = zzfsVar3;
                                                    i11 = i7;
                                                }
                                            }
                                        }
                                        i11 = i6;
                                        zzfsVar6 = zzfsVar;
                                    } else {
                                        zzal(this.zzi);
                                        if (zzkv.zzB((com.google.android.gms.internal.measurement.zzft) zzfsVar8.zzaC(), "_fr") != null) {
                                            zzgcVar5 = zzgcVar4;
                                            i11 = i6;
                                            zzfsVar6 = zzfsVar;
                                        } else if (zzfsVar == null || Math.abs(zzfsVar.zzc() - zzfsVar8.zzc()) > 1000) {
                                            zzgcVar5 = zzgcVar4;
                                            zzfsVar7 = zzfsVar8;
                                            i11 = i2;
                                            zzfsVar6 = zzfsVar;
                                        } else {
                                            com.google.android.gms.internal.measurement.zzfs zzfsVar10 = (com.google.android.gms.internal.measurement.zzfs) zzfsVar.clone();
                                            if (zzaj(zzfsVar8, zzfsVar10)) {
                                                zzgcVar5 = zzgcVar4;
                                                zzgcVar5.zzS(i12, zzfsVar10);
                                                i11 = i6;
                                                zzfsVar4 = null;
                                                zzfsVar6 = null;
                                            } else {
                                                zzgcVar5 = zzgcVar4;
                                                zzfsVar4 = zzfsVar8;
                                                i11 = i2;
                                                zzfsVar6 = zzfsVar;
                                            }
                                            zzfsVar7 = zzfsVar4;
                                        }
                                    }
                                    i8 = i5;
                                    zzkqVar3.zzc.set(i8, (com.google.android.gms.internal.measurement.zzft) zzfsVar8.zzaC());
                                    i10 = i2 + 1;
                                    zzgcVar5.zzk(zzfsVar8);
                                    i13 = i;
                                    zzfsVar5 = zzfsVar7;
                                }
                            } else {
                                if (strZzo.equals("_ug")) {
                                    c = 2;
                                }
                                if (c != 0) {
                                }
                            }
                        }
                        int i18 = 0;
                        boolean z = false;
                        boolean z2 = false;
                        while (true) {
                            zzgcVar4 = zzgcVar6;
                            if (i18 >= zzfsVar8.zza()) {
                                break;
                            }
                            if ("_c".equals(zzfsVar8.zzn(i18).zzg())) {
                                com.google.android.gms.internal.measurement.zzfw zzfwVar = (com.google.android.gms.internal.measurement.zzfw) zzfsVar8.zzn(i18).zzby();
                                zzfsVar2 = zzfsVar6;
                                zzfwVar.zzi(1L);
                                zzfsVar8.zzk(i18, (com.google.android.gms.internal.measurement.zzfx) zzfwVar.zzaC());
                                z = true;
                            } else {
                                zzfsVar2 = zzfsVar6;
                                if ("_r".equals(zzfsVar8.zzn(i18).zzg())) {
                                    com.google.android.gms.internal.measurement.zzfw zzfwVar2 = (com.google.android.gms.internal.measurement.zzfw) zzfsVar8.zzn(i18).zzby();
                                    zzfwVar2.zzi(1L);
                                    zzfsVar8.zzk(i18, (com.google.android.gms.internal.measurement.zzfx) zzfwVar2.zzaC());
                                    z2 = true;
                                }
                            }
                            i18++;
                            zzgcVar6 = zzgcVar4;
                            zzfsVar6 = zzfsVar2;
                        }
                        zzfsVar = zzfsVar6;
                        if (!z && zZzq) {
                            zzay().zzj().zzb("Marking event as conversion", this.zzn.zzj().zzd(zzfsVar8.zzo()));
                            com.google.android.gms.internal.measurement.zzfw zzfwVarZze = com.google.android.gms.internal.measurement.zzfx.zze();
                            zzfwVarZze.zzj("_c");
                            zzfwVarZze.zzi(1L);
                            zzfsVar8.zze(zzfwVarZze);
                        }
                        if (!z2) {
                            zzay().zzj().zzb("Marking event as real-time", this.zzn.zzj().zzd(zzfsVar8.zzo()));
                            com.google.android.gms.internal.measurement.zzfw zzfwVarZze2 = com.google.android.gms.internal.measurement.zzfx.zze();
                            zzfwVarZze2.zzj("_r");
                            zzfwVarZze2.zzi(1L);
                            zzfsVar8.zze(zzfwVarZze2);
                        }
                        zzam zzamVar3 = this.zze;
                        zzal(zzamVar3);
                        if (zzamVar3.zzl(zza(), zzkqVar3.zza.zzx(), false, false, false, false, true).zze > zzg().zze(zzkqVar3.zza.zzx(), zzdu.zzn)) {
                            zzab(zzfsVar8, "_r");
                        } else {
                            i = 1;
                        }
                        if (zzlb.zzai(zzfsVar8.zzo()) && zZzq) {
                            zzam zzamVar4 = this.zze;
                            zzal(zzamVar4);
                            if (zzamVar4.zzl(zza(), zzkqVar3.zza.zzx(), false, false, true, false, false).zzc > zzg().zze(zzkqVar3.zza.zzx(), zzdu.zzm)) {
                                zzay().zzk().zzb("Too many conversions. Not logging as conversion. appId", zzeh.zzn(zzkqVar3.zza.zzx()));
                                com.google.android.gms.internal.measurement.zzfw zzfwVar3 = null;
                                boolean z3 = false;
                                int i19 = -1;
                                for (int i20 = 0; i20 < zzfsVar8.zza(); i20++) {
                                    com.google.android.gms.internal.measurement.zzfx zzfxVarZzn = zzfsVar8.zzn(i20);
                                    if ("_c".equals(zzfxVarZzn.zzg())) {
                                        zzfwVar3 = (com.google.android.gms.internal.measurement.zzfw) zzfxVarZzn.zzby();
                                        i19 = i20;
                                    } else if ("_err".equals(zzfxVarZzn.zzg())) {
                                        z3 = true;
                                    }
                                }
                                if (z3) {
                                    if (zzfwVar3 != null) {
                                        zzfsVar8.zzh(i19);
                                    } else {
                                        zzfwVar3 = null;
                                        if (zzfwVar3 == null) {
                                        }
                                    }
                                } else if (zzfwVar3 == null) {
                                    com.google.android.gms.internal.measurement.zzfw zzfwVar4 = (com.google.android.gms.internal.measurement.zzfw) zzfwVar3.clone();
                                    zzfwVar4.zzj("_err");
                                    zzfwVar4.zzi(10L);
                                    zzfsVar8.zzk(i19, (com.google.android.gms.internal.measurement.zzfx) zzfwVar4.zzaC());
                                } else {
                                    zzay().zzd().zzb("Did not find conversion parameter. appId", zzeh.zzn(zzkqVar3.zza.zzx()));
                                }
                            }
                        }
                        if (zZzq) {
                        }
                    }
                    i9 = i8 + 1;
                    zzgcVar6 = zzgcVar5;
                    str4 = str6;
                    str5 = str2;
                }
                String str8 = str4;
                com.google.android.gms.internal.measurement.zzgc zzgcVar7 = zzgcVar6;
                long jLongValue = 0;
                int i21 = i2;
                int i22 = 0;
                while (i22 < i21) {
                    com.google.android.gms.internal.measurement.zzft zzftVarZze = zzgcVar7.zze(i22);
                    if ("_e".equals(zzftVarZze.zzh())) {
                        zzal(this.zzi);
                        if (zzkv.zzB(zzftVarZze, "_fr") != null) {
                            zzgcVar7.zzA(i22);
                            i21--;
                            i22--;
                        } else {
                            zzal(this.zzi);
                            com.google.android.gms.internal.measurement.zzfx zzfxVarZzB = zzkv.zzB(zzftVarZze, "_et");
                            if (zzfxVarZzB != null) {
                                Long lValueOf = zzfxVarZzB.zzw() ? Long.valueOf(zzfxVarZzB.zzd()) : null;
                                if (lValueOf != null && lValueOf.longValue() > 0) {
                                    jLongValue += lValueOf.longValue();
                                }
                            }
                        }
                    }
                    i22++;
                }
                zzaf(zzgcVar7, jLongValue, false);
                Iterator it = zzgcVar7.zzas().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if ("_s".equals(((com.google.android.gms.internal.measurement.zzft) it.next()).zzh())) {
                        zzam zzamVar5 = this.zze;
                        zzal(zzamVar5);
                        zzamVar5.zzA(zzgcVar7.zzap(), "_se");
                        break;
                    }
                }
                if (zzkv.zza(zzgcVar7, "_sid") >= 0) {
                    zzaf(zzgcVar7, jLongValue, true);
                } else {
                    int iZza = zzkv.zza(zzgcVar7, "_se");
                    if (iZza >= 0) {
                        zzgcVar7.zzB(iZza);
                        zzay().zzd().zzb("Session engagement user property is in the bundle without session ID. appId", zzeh.zzn(zzkqVar3.zza.zzx()));
                    }
                }
                zzkv zzkvVar = this.zzi;
                zzal(zzkvVar);
                zzkvVar.zzt.zzay().zzj().zza("Checking account type status for ad personalization signals");
                zzfi zzfiVar5 = zzkvVar.zzf.zzc;
                zzal(zzfiVar5);
                if (zzfiVar5.zzn(zzgcVar7.zzap())) {
                    zzam zzamVar6 = zzkvVar.zzf.zze;
                    zzal(zzamVar6);
                    zzh zzhVarZzj = zzamVar6.zzj(zzgcVar7.zzap());
                    if (zzhVarZzj != null && zzhVarZzj.zzah() && zzkvVar.zzt.zzg().zze()) {
                        zzkvVar.zzt.zzay().zzc().zza("Turning off ad personalization due to account type");
                        com.google.android.gms.internal.measurement.zzgl zzglVarZzd = com.google.android.gms.internal.measurement.zzgm.zzd();
                        zzglVarZzd.zzf(str8);
                        zzglVarZzd.zzg(zzkvVar.zzt.zzg().zza());
                        zzglVarZzd.zze(1L);
                        com.google.android.gms.internal.measurement.zzgm zzgmVar = (com.google.android.gms.internal.measurement.zzgm) zzglVarZzd.zzaC();
                        int i23 = 0;
                        while (true) {
                            if (i23 >= zzgcVar7.zzb()) {
                                zzgcVar7.zzm(zzgmVar);
                                break;
                            }
                            if (str8.equals(zzgcVar7.zzao(i23).zzf())) {
                                zzgcVar7.zzam(i23, zzgmVar);
                                break;
                            }
                            i23++;
                        }
                    }
                }
                zzgcVar7.zzai(Long.MAX_VALUE);
                zzgcVar7.zzQ(Long.MIN_VALUE);
                for (int i24 = 0; i24 < zzgcVar7.zza(); i24++) {
                    com.google.android.gms.internal.measurement.zzft zzftVarZze2 = zzgcVar7.zze(i24);
                    if (zzftVarZze2.zzd() < zzgcVar7.zzd()) {
                        zzgcVar7.zzai(zzftVarZze2.zzd());
                    }
                    if (zzftVarZze2.zzd() > zzgcVar7.zzc()) {
                        zzgcVar7.zzQ(zzftVarZze2.zzd());
                    }
                }
                zzgcVar7.zzz();
                zzgcVar7.zzo();
                zzaa zzaaVar = this.zzh;
                zzal(zzaaVar);
                zzgcVar7.zzf(zzaaVar.zza(zzgcVar7.zzap(), zzgcVar7.zzas(), zzgcVar7.zzat(), Long.valueOf(zzgcVar7.zzd()), Long.valueOf(zzgcVar7.zzc())));
                if (zzg().zzw(zzkqVar3.zza.zzx())) {
                    HashMap map = new HashMap();
                    ArrayList arrayList2 = new ArrayList();
                    SecureRandom secureRandomZzG = zzv().zzG();
                    int i25 = 0;
                    while (i25 < zzgcVar7.zza()) {
                        com.google.android.gms.internal.measurement.zzfs zzfsVar11 = (com.google.android.gms.internal.measurement.zzfs) zzgcVar7.zze(i25).zzby();
                        if (zzfsVar11.zzo().equals("_ep")) {
                            zzal(this.zzi);
                            String str9 = (String) zzkv.zzC((com.google.android.gms.internal.measurement.zzft) zzfsVar11.zzaC(), "_en");
                            zzas zzasVarZzn = (zzas) map.get(str9);
                            if (zzasVarZzn == null) {
                                zzam zzamVar7 = this.zze;
                                zzal(zzamVar7);
                                zzasVarZzn = zzamVar7.zzn(zzkqVar3.zza.zzx(), (String) Preconditions.checkNotNull(str9));
                                if (zzasVarZzn != null) {
                                    map.put(str9, zzasVarZzn);
                                }
                            }
                            if (zzasVarZzn != null && zzasVarZzn.zzi == null) {
                                Long l2 = zzasVarZzn.zzj;
                                if (l2 != null && l2.longValue() > 1) {
                                    zzal(this.zzi);
                                    zzkv.zzz(zzfsVar11, "_sr", zzasVarZzn.zzj);
                                }
                                Boolean bool = zzasVarZzn.zzk;
                                if (bool != null && bool.booleanValue()) {
                                    zzal(this.zzi);
                                    zzkv.zzz(zzfsVar11, "_efs", 1L);
                                }
                                arrayList2.add((com.google.android.gms.internal.measurement.zzft) zzfsVar11.zzaC());
                            }
                            zzgcVar7.zzS(i25, zzfsVar11);
                        } else {
                            zzfi zzfiVar6 = this.zzc;
                            zzal(zzfiVar6);
                            String strZzx = zzkqVar3.zza.zzx();
                            String strZza = zzfiVar6.zza(strZzx, "measurement.account.time_zone_offset_minutes");
                            if (TextUtils.isEmpty(strZza)) {
                                j2 = 0;
                                long jZzr2 = zzv().zzr(zzfsVar11.zzc(), j2);
                                com.google.android.gms.internal.measurement.zzft zzftVar = (com.google.android.gms.internal.measurement.zzft) zzfsVar11.zzaC();
                                Long l3 = 1L;
                                long j4 = j2;
                                if (TextUtils.isEmpty("_dbg")) {
                                }
                            } else {
                                try {
                                    j2 = Long.parseLong(strZza);
                                } catch (NumberFormatException e) {
                                    zzfiVar6.zzt.zzay().zzk().zzc("Unable to parse timezone offset. appId", zzeh.zzn(strZzx), e);
                                }
                                long jZzr22 = zzv().zzr(zzfsVar11.zzc(), j2);
                                com.google.android.gms.internal.measurement.zzft zzftVar2 = (com.google.android.gms.internal.measurement.zzft) zzfsVar11.zzaC();
                                Long l32 = 1L;
                                long j42 = j2;
                                if (TextUtils.isEmpty("_dbg")) {
                                    Iterator it2 = zzftVar2.zzi().iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            break;
                                        }
                                        com.google.android.gms.internal.measurement.zzfx zzfxVar = (com.google.android.gms.internal.measurement.zzfx) it2.next();
                                        Iterator it3 = it2;
                                        if (!"_dbg".equals(zzfxVar.zzg())) {
                                            it2 = it3;
                                        } else if (l32.equals(Long.valueOf(zzfxVar.zzd()))) {
                                            iZzc = 1;
                                        }
                                    }
                                    zzfi zzfiVar7 = this.zzc;
                                    zzal(zzfiVar7);
                                    iZzc = zzfiVar7.zzc(zzkqVar3.zza.zzx(), zzfsVar11.zzo());
                                    if (iZzc > 0) {
                                        zzay().zzk().zzc("Sample rate must be positive. event, rate", zzfsVar11.zzo(), Integer.valueOf(iZzc));
                                        arrayList2.add((com.google.android.gms.internal.measurement.zzft) zzfsVar11.zzaC());
                                        zzgcVar7.zzS(i25, zzfsVar11);
                                    } else {
                                        zzas zzasVarZza = (zzas) map.get(zzfsVar11.zzo());
                                        if (zzasVarZza == null) {
                                            zzam zzamVar8 = this.zze;
                                            zzal(zzamVar8);
                                            zzasVarZza = zzamVar8.zzn(zzkqVar3.zza.zzx(), zzfsVar11.zzo());
                                            if (zzasVarZza == null) {
                                                j3 = jZzr22;
                                                zzay().zzk().zzc("Event being bundled has no eventAggregate. appId, eventName", zzkqVar3.zza.zzx(), zzfsVar11.zzo());
                                                zzasVarZza = new zzas(zzkqVar3.zza.zzx(), zzfsVar11.zzo(), 1L, 1L, 1L, zzfsVar11.zzc(), 0L, null, null, null, null);
                                            } else {
                                                j3 = jZzr22;
                                            }
                                            zzal(this.zzi);
                                            Long l4 = (Long) zzkv.zzC((com.google.android.gms.internal.measurement.zzft) zzfsVar11.zzaC(), "_eid");
                                            Boolean boolValueOf = Boolean.valueOf(l4 != null);
                                            if (iZzc == 1) {
                                                arrayList2.add((com.google.android.gms.internal.measurement.zzft) zzfsVar11.zzaC());
                                                if (boolValueOf.booleanValue() && (zzasVarZza.zzi != null || zzasVarZza.zzj != null || zzasVarZza.zzk != null)) {
                                                    map.put(zzfsVar11.zzo(), zzasVarZza.zza(null, null, null));
                                                }
                                                zzgcVar7.zzS(i25, zzfsVar11);
                                            } else {
                                                if (secureRandomZzG.nextInt(iZzc) == 0) {
                                                    zzal(this.zzi);
                                                    Long lValueOf2 = Long.valueOf(iZzc);
                                                    zzkv.zzz(zzfsVar11, "_sr", lValueOf2);
                                                    arrayList2.add((com.google.android.gms.internal.measurement.zzft) zzfsVar11.zzaC());
                                                    if (boolValueOf.booleanValue()) {
                                                        zzasVarZza = zzasVarZza.zza(null, lValueOf2, null);
                                                    }
                                                    map.put(zzfsVar11.zzo(), zzasVarZza.zzb(zzfsVar11.zzc(), j3));
                                                    zzkqVar2 = zzkqVar3;
                                                    secureRandom = secureRandomZzG;
                                                    i4 = i25;
                                                    zzgcVar3 = zzgcVar7;
                                                } else {
                                                    long j5 = j3;
                                                    secureRandom = secureRandomZzG;
                                                    Long l5 = zzasVarZza.zzh;
                                                    if (l5 != null) {
                                                        jZzr = l5.longValue();
                                                        zzgcVar2 = zzgcVar7;
                                                        zzkqVar2 = zzkqVar3;
                                                        l = l4;
                                                        i3 = i25;
                                                    } else {
                                                        zzgcVar2 = zzgcVar7;
                                                        zzkqVar2 = zzkqVar3;
                                                        l = l4;
                                                        i3 = i25;
                                                        jZzr = zzv().zzr(zzfsVar11.zzb(), j42);
                                                    }
                                                    if (jZzr != j5) {
                                                        zzal(this.zzi);
                                                        zzkv.zzz(zzfsVar11, "_efs", 1L);
                                                        zzal(this.zzi);
                                                        Long lValueOf3 = Long.valueOf(iZzc);
                                                        zzkv.zzz(zzfsVar11, "_sr", lValueOf3);
                                                        arrayList2.add((com.google.android.gms.internal.measurement.zzft) zzfsVar11.zzaC());
                                                        if (boolValueOf.booleanValue()) {
                                                            zzasVarZza = zzasVarZza.zza(null, lValueOf3, Boolean.TRUE);
                                                        }
                                                        map.put(zzfsVar11.zzo(), zzasVarZza.zzb(zzfsVar11.zzc(), j5));
                                                    } else if (boolValueOf.booleanValue()) {
                                                        map.put(zzfsVar11.zzo(), zzasVarZza.zza(l, null, null));
                                                    }
                                                    i4 = i3;
                                                    zzgcVar3 = zzgcVar2;
                                                }
                                                zzgcVar3.zzS(i4, zzfsVar11);
                                            }
                                        }
                                    }
                                } else {
                                    zzfi zzfiVar72 = this.zzc;
                                    zzal(zzfiVar72);
                                    iZzc = zzfiVar72.zzc(zzkqVar3.zza.zzx(), zzfsVar11.zzo());
                                    if (iZzc > 0) {
                                    }
                                }
                            }
                            i25 = i4 + 1;
                            zzgcVar7 = zzgcVar3;
                            secureRandomZzG = secureRandom;
                            zzkqVar3 = zzkqVar2;
                        }
                        zzkqVar2 = zzkqVar3;
                        secureRandom = secureRandomZzG;
                        i4 = i25;
                        zzgcVar3 = zzgcVar7;
                        i25 = i4 + 1;
                        zzgcVar7 = zzgcVar3;
                        secureRandomZzG = secureRandom;
                        zzkqVar3 = zzkqVar2;
                    }
                    zzgcVar = zzgcVar7;
                    zzkq zzkqVar4 = zzkqVar3;
                    if (arrayList2.size() < zzgcVar.zza()) {
                        zzgcVar.zzr();
                        zzgcVar.zzg(arrayList2);
                    }
                    for (Map.Entry entry : map.entrySet()) {
                        zzam zzamVar9 = this.zze;
                        zzal(zzamVar9);
                        zzamVar9.zzE((zzas) entry.getValue());
                    }
                    zzkqVar = zzkqVar4;
                } else {
                    zzgcVar = zzgcVar7;
                    zzkqVar = zzkqVar3;
                }
                String strZzx2 = zzkqVar.zza.zzx();
                zzam zzamVar10 = this.zze;
                zzal(zzamVar10);
                zzh zzhVarZzj2 = zzamVar10.zzj(strZzx2);
                if (zzhVarZzj2 == null) {
                    zzay().zzd().zzb("Bundling raw events w/o app info. appId", zzeh.zzn(zzkqVar.zza.zzx()));
                } else if (zzgcVar.zza() > 0) {
                    long jZzn = zzhVarZzj2.zzn();
                    if (jZzn != 0) {
                        zzgcVar.zzab(jZzn);
                    } else {
                        zzgcVar.zzv();
                    }
                    long jZzp = zzhVarZzj2.zzp();
                    if (jZzp != 0) {
                        jZzn = jZzp;
                    }
                    if (jZzn != 0) {
                        zzgcVar.zzac(jZzn);
                    } else {
                        zzgcVar.zzw();
                    }
                    zzhVarZzj2.zzE();
                    zzgcVar.zzI((int) zzhVarZzj2.zzo());
                    zzhVarZzj2.zzab(zzgcVar.zzd());
                    zzhVarZzj2.zzZ(zzgcVar.zzc());
                    String strZzs = zzhVarZzj2.zzs();
                    if (strZzs != null) {
                        zzgcVar.zzW(strZzs);
                    } else {
                        zzgcVar.zzs();
                    }
                    zzam zzamVar11 = this.zze;
                    zzal(zzamVar11);
                    zzamVar11.zzD(zzhVarZzj2);
                }
                if (zzgcVar.zza() > 0) {
                    this.zzn.zzaw();
                    zzfi zzfiVar8 = this.zzc;
                    zzal(zzfiVar8);
                    com.google.android.gms.internal.measurement.zzff zzffVarZze = zzfiVar8.zze(zzkqVar.zza.zzx());
                    if (zzffVarZze != null && zzffVarZze.zzs()) {
                        zzgcVar.zzK(zzffVarZze.zzc());
                    } else if (zzkqVar.zza.zzF().isEmpty()) {
                        zzgcVar.zzK(-1L);
                    } else {
                        zzay().zzk().zzb("Did not find measurement config or missing version info. appId", zzeh.zzn(zzkqVar.zza.zzx()));
                    }
                    zzam zzamVar12 = this.zze;
                    zzal(zzamVar12);
                    com.google.android.gms.internal.measurement.zzgd zzgdVar = (com.google.android.gms.internal.measurement.zzgd) zzgcVar.zzaC();
                    zzamVar12.zzg();
                    zzamVar12.zzW();
                    Preconditions.checkNotNull(zzgdVar);
                    Preconditions.checkNotEmpty(zzgdVar.zzx());
                    Preconditions.checkState(zzgdVar.zzbe());
                    zzamVar12.zzz();
                    long jCurrentTimeMillis = zzamVar12.zzt.zzav().currentTimeMillis();
                    long jZzk = zzgdVar.zzk();
                    zzamVar12.zzt.zzf();
                    if (jZzk >= jCurrentTimeMillis - zzag.zzA()) {
                        long jZzk2 = zzgdVar.zzk();
                        zzamVar12.zzt.zzf();
                        if (jZzk2 > zzag.zzA() + jCurrentTimeMillis) {
                            zzamVar12.zzt.zzay().zzk().zzd("Storing bundle outside of the max uploading time span. appId, now, timestamp", zzeh.zzn(zzgdVar.zzx()), Long.valueOf(jCurrentTimeMillis), Long.valueOf(zzgdVar.zzk()));
                        }
                        byte[] bArrZzbu = zzgdVar.zzbu();
                        try {
                            zzkv zzkvVar2 = zzamVar12.zzf.zzi;
                            zzal(zzkvVar2);
                            byte[] bArrZzy = zzkvVar2.zzy(bArrZzbu);
                            zzamVar12.zzt.zzay().zzj().zzb("Saving bundle, size", Integer.valueOf(bArrZzy.length));
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("app_id", zzgdVar.zzx());
                            contentValues.put("bundle_end_timestamp", Long.valueOf(zzgdVar.zzk()));
                            contentValues.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, bArrZzy);
                            contentValues.put("has_realtime", Integer.valueOf(i));
                            if (zzgdVar.zzbk()) {
                                contentValues.put("retry_count", Integer.valueOf(zzgdVar.zze()));
                            }
                            try {
                                if (zzamVar12.zzh().insert("queue", null, contentValues) == -1) {
                                    zzamVar12.zzt.zzay().zzd().zzb("Failed to insert bundle (got -1). appId", zzeh.zzn(zzgdVar.zzx()));
                                }
                            } catch (SQLiteException e2) {
                                zzamVar12.zzt.zzay().zzd().zzc("Error storing bundle. appId", zzeh.zzn(zzgdVar.zzx()), e2);
                            }
                        } catch (IOException e3) {
                            zzamVar12.zzt.zzay().zzd().zzc("Data loss. Failed to serialize bundle. appId", zzeh.zzn(zzgdVar.zzx()), e3);
                        }
                    }
                }
                zzam zzamVar13 = this.zze;
                zzal(zzamVar13);
                List list2 = zzkqVar.zzb;
                Preconditions.checkNotNull(list2);
                zzamVar13.zzg();
                zzamVar13.zzW();
                StringBuilder sb = new StringBuilder("rowid in (");
                for (int i26 = 0; i26 < list2.size(); i26++) {
                    if (i26 != 0) {
                        sb.append(",");
                    }
                    sb.append(((Long) list2.get(i26)).longValue());
                }
                sb.append(")");
                int iDelete = zzamVar13.zzh().delete("raw_events", sb.toString(), null);
                if (iDelete != list2.size()) {
                    zzamVar13.zzt.zzay().zzd().zzc("Deleted fewer rows from raw events table than expected", Integer.valueOf(iDelete), Integer.valueOf(list2.size()));
                }
                zzam zzamVar14 = this.zze;
                zzal(zzamVar14);
                try {
                    zzamVar14.zzh().execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[]{strZzx2, strZzx2});
                } catch (SQLiteException e4) {
                    zzamVar14.zzt.zzay().zzd().zzc("Failed to remove unused event metadata. appId", zzeh.zzn(strZzx2), e4);
                }
                zzam zzamVar15 = this.zze;
                zzal(zzamVar15);
                zzamVar15.zzC();
                zzam zzamVar16 = this.zze;
                zzal(zzamVar16);
                zzamVar16.zzx();
                return true;
            }
            zzam zzamVar17 = this.zze;
            zzal(zzamVar17);
            zzamVar17.zzC();
            zzam zzamVar18 = this.zze;
            zzal(zzamVar18);
            zzamVar18.zzx();
            return false;
        } catch (Throwable th) {
            zzam zzamVar19 = this.zze;
            zzal(zzamVar19);
            zzamVar19.zzx();
            throw th;
        }
    }

    private final boolean zzai() {
        zzaz().zzg();
        zzB();
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        if (zzamVar.zzF()) {
            return true;
        }
        zzam zzamVar2 = this.zze;
        zzal(zzamVar2);
        return !TextUtils.isEmpty(zzamVar2.zzr());
    }

    private final boolean zzaj(com.google.android.gms.internal.measurement.zzfs zzfsVar, com.google.android.gms.internal.measurement.zzfs zzfsVar2) {
        Preconditions.checkArgument("_e".equals(zzfsVar.zzo()));
        zzal(this.zzi);
        com.google.android.gms.internal.measurement.zzfx zzfxVarZzB = zzkv.zzB((com.google.android.gms.internal.measurement.zzft) zzfsVar.zzaC(), "_sc");
        String strZzh = zzfxVarZzB == null ? null : zzfxVarZzB.zzh();
        zzal(this.zzi);
        com.google.android.gms.internal.measurement.zzfx zzfxVarZzB2 = zzkv.zzB((com.google.android.gms.internal.measurement.zzft) zzfsVar2.zzaC(), "_pc");
        String strZzh2 = zzfxVarZzB2 != null ? zzfxVarZzB2.zzh() : null;
        if (strZzh2 == null || !strZzh2.equals(strZzh)) {
            return false;
        }
        Preconditions.checkArgument("_e".equals(zzfsVar.zzo()));
        zzal(this.zzi);
        com.google.android.gms.internal.measurement.zzfx zzfxVarZzB3 = zzkv.zzB((com.google.android.gms.internal.measurement.zzft) zzfsVar.zzaC(), "_et");
        if (zzfxVarZzB3 == null || !zzfxVarZzB3.zzw() || zzfxVarZzB3.zzd() <= 0) {
            return true;
        }
        long jZzd = zzfxVarZzB3.zzd();
        zzal(this.zzi);
        com.google.android.gms.internal.measurement.zzfx zzfxVarZzB4 = zzkv.zzB((com.google.android.gms.internal.measurement.zzft) zzfsVar2.zzaC(), "_et");
        if (zzfxVarZzB4 != null && zzfxVarZzB4.zzd() > 0) {
            jZzd += zzfxVarZzB4.zzd();
        }
        zzal(this.zzi);
        zzkv.zzz(zzfsVar2, "_et", Long.valueOf(jZzd));
        zzal(this.zzi);
        zzkv.zzz(zzfsVar, "_fr", 1L);
        return true;
    }

    private static final boolean zzak(zzq zzqVar) {
        return (TextUtils.isEmpty(zzqVar.zzb) && TextUtils.isEmpty(zzqVar.zzq)) ? false : true;
    }

    private static final zzkh zzal(zzkh zzkhVar) {
        if (zzkhVar == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (zzkhVar.zzY()) {
            return zzkhVar;
        }
        throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(zzkhVar.getClass())));
    }

    public static zzkt zzt(Context context) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (zzb == null) {
            synchronized (zzkt.class) {
                if (zzb == null) {
                    zzb = new zzkt((zzku) Preconditions.checkNotNull(new zzku(context)), null);
                }
            }
        }
        return zzb;
    }

    public static /* bridge */ /* synthetic */ void zzy(zzkt zzktVar, zzku zzkuVar) {
        zzktVar.zzaz().zzg();
        zzktVar.zzm = new zzez(zzktVar);
        zzam zzamVar = new zzam(zzktVar);
        zzamVar.zzX();
        zzktVar.zze = zzamVar;
        zzktVar.zzg().zzq((zzaf) Preconditions.checkNotNull(zzktVar.zzc));
        zzjo zzjoVar = new zzjo(zzktVar);
        zzjoVar.zzX();
        zzktVar.zzk = zzjoVar;
        zzaa zzaaVar = new zzaa(zzktVar);
        zzaaVar.zzX();
        zzktVar.zzh = zzaaVar;
        zzic zzicVar = new zzic(zzktVar);
        zzicVar.zzX();
        zzktVar.zzj = zzicVar;
        zzkf zzkfVar = new zzkf(zzktVar);
        zzkfVar.zzX();
        zzktVar.zzg = zzkfVar;
        zzktVar.zzf = new zzep(zzktVar);
        if (zzktVar.zzr != zzktVar.zzs) {
            zzktVar.zzay().zzd().zzc("Not all upload components initialized", Integer.valueOf(zzktVar.zzr), Integer.valueOf(zzktVar.zzs));
        }
        zzktVar.zzo = true;
    }

    @VisibleForTesting
    public final void zzA() {
        zzaz().zzg();
        zzB();
        if (this.zzp) {
            return;
        }
        this.zzp = true;
        if (zzZ()) {
            FileChannel fileChannel = this.zzx;
            zzaz().zzg();
            int i = 0;
            if (fileChannel == null || !fileChannel.isOpen()) {
                zzay().zzd().zza("Bad channel to read from");
            } else {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
                try {
                    fileChannel.position(0L);
                    int i2 = fileChannel.read(byteBufferAllocate);
                    if (i2 == 4) {
                        byteBufferAllocate.flip();
                        i = byteBufferAllocate.getInt();
                    } else if (i2 != -1) {
                        zzay().zzk().zzb("Unexpected data length. Bytes read", Integer.valueOf(i2));
                    }
                } catch (IOException e) {
                    zzay().zzd().zzb("Failed to read from channel", e);
                }
            }
            int iZzi = this.zzn.zzh().zzi();
            zzaz().zzg();
            if (i > iZzi) {
                zzay().zzd().zzc("Panic: can't downgrade version. Previous, current version", Integer.valueOf(i), Integer.valueOf(iZzi));
                return;
            }
            if (i < iZzi) {
                FileChannel fileChannel2 = this.zzx;
                zzaz().zzg();
                if (fileChannel2 == null || !fileChannel2.isOpen()) {
                    zzay().zzd().zza("Bad channel to read from");
                } else {
                    ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(4);
                    byteBufferAllocate2.putInt(iZzi);
                    byteBufferAllocate2.flip();
                    try {
                        fileChannel2.truncate(0L);
                        fileChannel2.write(byteBufferAllocate2);
                        fileChannel2.force(true);
                        if (fileChannel2.size() != 4) {
                            zzay().zzd().zzb("Error writing to channel. Bytes written", Long.valueOf(fileChannel2.size()));
                        }
                        zzay().zzj().zzc("Storage version upgraded. Previous, current version", Integer.valueOf(i), Integer.valueOf(iZzi));
                        return;
                    } catch (IOException e2) {
                        zzay().zzd().zzb("Failed to write to channel", e2);
                    }
                }
                zzay().zzd().zzc("Storage version upgrade failed. Previous, current version", Integer.valueOf(i), Integer.valueOf(iZzi));
            }
        }
    }

    public final void zzB() {
        if (!this.zzo) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    public final void zzC(String str, com.google.android.gms.internal.measurement.zzgc zzgcVar) {
        int iZza;
        int iIndexOf;
        zzfi zzfiVar = this.zzc;
        zzal(zzfiVar);
        Set setZzk = zzfiVar.zzk(str);
        if (setZzk != null) {
            zzgcVar.zzi(setZzk);
        }
        zzfi zzfiVar2 = this.zzc;
        zzal(zzfiVar2);
        if (zzfiVar2.zzv(str)) {
            zzgcVar.zzp();
        }
        zzfi zzfiVar3 = this.zzc;
        zzal(zzfiVar3);
        if (zzfiVar3.zzy(str)) {
            if (zzg().zzs(str, zzdu.zzaq)) {
                String strZzar = zzgcVar.zzar();
                if (!TextUtils.isEmpty(strZzar) && (iIndexOf = strZzar.indexOf(".")) != -1) {
                    zzgcVar.zzY(strZzar.substring(0, iIndexOf));
                }
            } else {
                zzgcVar.zzu();
            }
        }
        zzfi zzfiVar4 = this.zzc;
        zzal(zzfiVar4);
        if (zzfiVar4.zzz(str) && (iZza = zzkv.zza(zzgcVar, "_id")) != -1) {
            zzgcVar.zzB(iZza);
        }
        zzfi zzfiVar5 = this.zzc;
        zzal(zzfiVar5);
        if (zzfiVar5.zzx(str)) {
            zzgcVar.zzq();
        }
        zzfi zzfiVar6 = this.zzc;
        zzal(zzfiVar6);
        if (zzfiVar6.zzu(str)) {
            zzgcVar.zzn();
            zzks zzksVar = (zzks) this.zzC.get(str);
            if (zzksVar == null || zzksVar.zzb + zzg().zzi(str, zzdu.zzR) < zzav().elapsedRealtime()) {
                zzksVar = new zzks(this);
                this.zzC.put(str, zzksVar);
            }
            zzgcVar.zzR(zzksVar.zza);
        }
        zzfi zzfiVar7 = this.zzc;
        zzal(zzfiVar7);
        if (zzfiVar7.zzw(str)) {
            zzgcVar.zzy();
        }
    }

    public final void zzD(zzh zzhVar) {
        vo0 vo0Var;
        vo0 vo0Var2;
        zzaz().zzg();
        if (TextUtils.isEmpty(zzhVar.zzy()) && TextUtils.isEmpty(zzhVar.zzr())) {
            zzI((String) Preconditions.checkNotNull(zzhVar.zzt()), 204, null, null, null);
            return;
        }
        zzki zzkiVar = this.zzl;
        Uri.Builder builder = new Uri.Builder();
        String strZzy = zzhVar.zzy();
        if (TextUtils.isEmpty(strZzy)) {
            strZzy = zzhVar.zzr();
        }
        vo0 vo0Var3 = null;
        Uri.Builder builderAppendQueryParameter = builder.scheme((String) zzdu.zzd.zza(null)).encodedAuthority((String) zzdu.zze.zza(null)).path("config/app/".concat(String.valueOf(strZzy))).appendQueryParameter("platform", CredentialsData.CREDENTIALS_TYPE_ANDROID);
        zzkiVar.zzt.zzf().zzh();
        builderAppendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(74029L)).appendQueryParameter("runtime_version", "0");
        String string = builder.build().toString();
        try {
            String str = (String) Preconditions.checkNotNull(zzhVar.zzt());
            URL url = new URL(string);
            zzay().zzj().zzb("Fetching remote configuration", str);
            zzfi zzfiVar = this.zzc;
            zzal(zzfiVar);
            com.google.android.gms.internal.measurement.zzff zzffVarZze = zzfiVar.zze(str);
            zzfi zzfiVar2 = this.zzc;
            zzal(zzfiVar2);
            String strZzh = zzfiVar2.zzh(str);
            if (zzffVarZze == null) {
                vo0Var = vo0Var3;
            } else {
                if (TextUtils.isEmpty(strZzh)) {
                    vo0Var2 = null;
                } else {
                    vo0Var2 = new vo0();
                    vo0Var2.put(HttpHeaders.IF_MODIFIED_SINCE, strZzh);
                }
                zzox.zzc();
                if (zzg().zzs(null, zzdu.zzao)) {
                    zzfi zzfiVar3 = this.zzc;
                    zzal(zzfiVar3);
                    String strZzf = zzfiVar3.zzf(str);
                    if (!TextUtils.isEmpty(strZzf)) {
                        if (vo0Var2 == null) {
                            vo0Var2 = new vo0();
                        }
                        vo0Var3 = vo0Var2;
                        vo0Var3.put(HttpHeaders.IF_NONE_MATCH, strZzf);
                        vo0Var = vo0Var3;
                    }
                }
                vo0Var = vo0Var2;
            }
            this.zzt = true;
            zzen zzenVar = this.zzd;
            zzal(zzenVar);
            zzkl zzklVar = new zzkl(this);
            zzenVar.zzg();
            zzenVar.zzW();
            Preconditions.checkNotNull(url);
            Preconditions.checkNotNull(zzklVar);
            zzenVar.zzt.zzaz().zzo(new zzem(zzenVar, str, url, null, vo0Var, zzklVar));
        } catch (MalformedURLException unused) {
            zzay().zzd().zzc("Failed to parse config URL. Not fetching. appId", zzeh.zzn(zzhVar.zzt()), string);
        }
    }

    public final void zzE(zzaw zzawVar, zzq zzqVar) {
        zzaw zzawVar2;
        List<zzac> listZzt;
        List<zzac> listZzt2;
        List<zzac> listZzt3;
        String str;
        Preconditions.checkNotNull(zzqVar);
        Preconditions.checkNotEmpty(zzqVar.zza);
        zzaz().zzg();
        zzB();
        String str2 = zzqVar.zza;
        long j = zzawVar.zzd;
        zzei zzeiVarZzb = zzei.zzb(zzawVar);
        zzaz().zzg();
        zzie zzieVar = null;
        if (this.zzD != null && (str = this.zzE) != null && str.equals(str2)) {
            zzieVar = this.zzD;
        }
        zzlb.zzK(zzieVar, zzeiVarZzb.zzd, false);
        zzaw zzawVarZza = zzeiVarZzb.zza();
        zzal(this.zzi);
        if (zzkv.zzA(zzawVarZza, zzqVar)) {
            if (!zzqVar.zzh) {
                zzd(zzqVar);
                return;
            }
            List list = zzqVar.zzt;
            if (list == null) {
                zzawVar2 = zzawVarZza;
            } else if (!list.contains(zzawVarZza.zza)) {
                zzay().zzc().zzd("Dropping non-safelisted event. appId, event name, origin", str2, zzawVarZza.zza, zzawVarZza.zzc);
                return;
            } else {
                Bundle bundleZzc = zzawVarZza.zzb.zzc();
                bundleZzc.putLong("ga_safelisted", 1L);
                zzawVar2 = new zzaw(zzawVarZza.zza, new zzau(bundleZzc), zzawVarZza.zzc, zzawVarZza.zzd);
            }
            zzam zzamVar = this.zze;
            zzal(zzamVar);
            zzamVar.zzw();
            try {
                zzam zzamVar2 = this.zze;
                zzal(zzamVar2);
                Preconditions.checkNotEmpty(str2);
                zzamVar2.zzg();
                zzamVar2.zzW();
                if (j < 0) {
                    zzamVar2.zzt.zzay().zzk().zzc("Invalid time querying timed out conditional properties", zzeh.zzn(str2), Long.valueOf(j));
                    listZzt = Collections.emptyList();
                } else {
                    listZzt = zzamVar2.zzt("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j)});
                }
                for (zzac zzacVar : listZzt) {
                    if (zzacVar != null) {
                        zzay().zzj().zzd("User property timed out", zzacVar.zza, this.zzn.zzj().zzf(zzacVar.zzc.zzb), zzacVar.zzc.zza());
                        zzaw zzawVar3 = zzacVar.zzg;
                        if (zzawVar3 != null) {
                            zzY(new zzaw(zzawVar3, j), zzqVar);
                        }
                        zzam zzamVar3 = this.zze;
                        zzal(zzamVar3);
                        zzamVar3.zza(str2, zzacVar.zzc.zzb);
                    }
                }
                zzam zzamVar4 = this.zze;
                zzal(zzamVar4);
                Preconditions.checkNotEmpty(str2);
                zzamVar4.zzg();
                zzamVar4.zzW();
                if (j < 0) {
                    zzamVar4.zzt.zzay().zzk().zzc("Invalid time querying expired conditional properties", zzeh.zzn(str2), Long.valueOf(j));
                    listZzt2 = Collections.emptyList();
                } else {
                    listZzt2 = zzamVar4.zzt("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j)});
                }
                ArrayList arrayList = new ArrayList(listZzt2.size());
                for (zzac zzacVar2 : listZzt2) {
                    if (zzacVar2 != null) {
                        zzay().zzj().zzd("User property expired", zzacVar2.zza, this.zzn.zzj().zzf(zzacVar2.zzc.zzb), zzacVar2.zzc.zza());
                        zzam zzamVar5 = this.zze;
                        zzal(zzamVar5);
                        zzamVar5.zzA(str2, zzacVar2.zzc.zzb);
                        zzaw zzawVar4 = zzacVar2.zzk;
                        if (zzawVar4 != null) {
                            arrayList.add(zzawVar4);
                        }
                        zzam zzamVar6 = this.zze;
                        zzal(zzamVar6);
                        zzamVar6.zza(str2, zzacVar2.zzc.zzb);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    zzY(new zzaw((zzaw) it.next(), j), zzqVar);
                }
                zzam zzamVar7 = this.zze;
                zzal(zzamVar7);
                String str3 = zzawVar2.zza;
                Preconditions.checkNotEmpty(str2);
                Preconditions.checkNotEmpty(str3);
                zzamVar7.zzg();
                zzamVar7.zzW();
                if (j < 0) {
                    zzamVar7.zzt.zzay().zzk().zzd("Invalid time querying triggered conditional properties", zzeh.zzn(str2), zzamVar7.zzt.zzj().zzd(str3), Long.valueOf(j));
                    listZzt3 = Collections.emptyList();
                } else {
                    listZzt3 = zzamVar7.zzt("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str3, String.valueOf(j)});
                }
                ArrayList arrayList2 = new ArrayList(listZzt3.size());
                for (zzac zzacVar3 : listZzt3) {
                    if (zzacVar3 != null) {
                        zzkw zzkwVar = zzacVar3.zzc;
                        zzky zzkyVar = new zzky((String) Preconditions.checkNotNull(zzacVar3.zza), zzacVar3.zzb, zzkwVar.zzb, j, Preconditions.checkNotNull(zzkwVar.zza()));
                        zzam zzamVar8 = this.zze;
                        zzal(zzamVar8);
                        if (zzamVar8.zzL(zzkyVar)) {
                            zzay().zzj().zzd("User property triggered", zzacVar3.zza, this.zzn.zzj().zzf(zzkyVar.zzc), zzkyVar.zze);
                        } else {
                            zzay().zzd().zzd("Too many active user properties, ignoring", zzeh.zzn(zzacVar3.zza), this.zzn.zzj().zzf(zzkyVar.zzc), zzkyVar.zze);
                        }
                        zzaw zzawVar5 = zzacVar3.zzi;
                        if (zzawVar5 != null) {
                            arrayList2.add(zzawVar5);
                        }
                        zzacVar3.zzc = new zzkw(zzkyVar);
                        zzacVar3.zze = true;
                        zzam zzamVar9 = this.zze;
                        zzal(zzamVar9);
                        zzamVar9.zzK(zzacVar3);
                    }
                }
                zzY(zzawVar2, zzqVar);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    zzY(new zzaw((zzaw) it2.next(), j), zzqVar);
                }
                zzam zzamVar10 = this.zze;
                zzal(zzamVar10);
                zzamVar10.zzC();
            } finally {
                zzam zzamVar11 = this.zze;
                zzal(zzamVar11);
                zzamVar11.zzx();
            }
        }
    }

    public final void zzF(zzaw zzawVar, String str) {
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        zzh zzhVarZzj = zzamVar.zzj(str);
        if (zzhVarZzj == null || TextUtils.isEmpty(zzhVarZzj.zzw())) {
            zzay().zzc().zzb("No app data available; dropping event", str);
            return;
        }
        Boolean boolZzad = zzad(zzhVarZzj);
        if (boolZzad == null) {
            if (!"_ui".equals(zzawVar.zza)) {
                zzay().zzk().zzb("Could not find package. appId", zzeh.zzn(str));
            }
        } else if (!boolZzad.booleanValue()) {
            zzay().zzd().zzb("App version does not match; dropping event. appId", zzeh.zzn(str));
            return;
        }
        String strZzy = zzhVarZzj.zzy();
        String strZzw = zzhVarZzj.zzw();
        long jZzb = zzhVarZzj.zzb();
        String strZzv = zzhVarZzj.zzv();
        long jZzm = zzhVarZzj.zzm();
        long jZzj = zzhVarZzj.zzj();
        boolean zZzai = zzhVarZzj.zzai();
        String strZzx = zzhVarZzj.zzx();
        zzhVarZzj.zza();
        zzG(zzawVar, new zzq(str, strZzy, strZzw, jZzb, strZzv, jZzm, jZzj, (String) null, zZzai, false, strZzx, 0L, 0L, 0, zzhVarZzj.zzah(), false, zzhVarZzj.zzr(), zzhVarZzj.zzq(), zzhVarZzj.zzk(), zzhVarZzj.zzC(), (String) null, zzh(str).zzh(), "", (String) null));
    }

    public final void zzG(zzaw zzawVar, zzq zzqVar) {
        Preconditions.checkNotEmpty(zzqVar.zza);
        zzei zzeiVarZzb = zzei.zzb(zzawVar);
        zzlb zzlbVarZzv = zzv();
        Bundle bundle = zzeiVarZzb.zzd;
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        zzlbVarZzv.zzL(bundle, zzamVar.zzi(zzqVar.zza));
        zzv().zzM(zzeiVarZzb, zzg().zzd(zzqVar.zza));
        zzaw zzawVarZza = zzeiVarZzb.zza();
        if (Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN.equals(zzawVarZza.zza) && "referrer API v2".equals(zzawVarZza.zzb.zzg("_cis"))) {
            String strZzg = zzawVarZza.zzb.zzg("gclid");
            if (!TextUtils.isEmpty(strZzg)) {
                zzW(new zzkw("_lgclid", zzawVarZza.zzd, strZzg, "auto"), zzqVar);
            }
        }
        zzE(zzawVarZza, zzqVar);
    }

    public final void zzH() {
        this.zzs++;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0110 A[Catch: all -> 0x0185, TryCatch #0 {all -> 0x0185, blocks: (B:6:0x002c, B:16:0x0049, B:63:0x016f, B:21:0x0063, B:26:0x00b5, B:25:0x00a6, B:29:0x00bd, B:32:0x00c9, B:34:0x00cf, B:36:0x00d7, B:39:0x00e8, B:42:0x00f4, B:44:0x00fa, B:49:0x0107, B:53:0x0123, B:55:0x0138, B:57:0x0157, B:59:0x0162, B:61:0x0168, B:62:0x016c, B:56:0x0146, B:50:0x0110, B:52:0x011b), top: B:73:0x002c, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011b A[Catch: all -> 0x0185, TryCatch #0 {all -> 0x0185, blocks: (B:6:0x002c, B:16:0x0049, B:63:0x016f, B:21:0x0063, B:26:0x00b5, B:25:0x00a6, B:29:0x00bd, B:32:0x00c9, B:34:0x00cf, B:36:0x00d7, B:39:0x00e8, B:42:0x00f4, B:44:0x00fa, B:49:0x0107, B:53:0x0123, B:55:0x0138, B:57:0x0157, B:59:0x0162, B:61:0x0168, B:62:0x016c, B:56:0x0146, B:50:0x0110, B:52:0x011b), top: B:73:0x002c, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0138 A[Catch: all -> 0x0185, TryCatch #0 {all -> 0x0185, blocks: (B:6:0x002c, B:16:0x0049, B:63:0x016f, B:21:0x0063, B:26:0x00b5, B:25:0x00a6, B:29:0x00bd, B:32:0x00c9, B:34:0x00cf, B:36:0x00d7, B:39:0x00e8, B:42:0x00f4, B:44:0x00fa, B:49:0x0107, B:53:0x0123, B:55:0x0138, B:57:0x0157, B:59:0x0162, B:61:0x0168, B:62:0x016c, B:56:0x0146, B:50:0x0110, B:52:0x011b), top: B:73:0x002c, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0146 A[Catch: all -> 0x0185, TryCatch #0 {all -> 0x0185, blocks: (B:6:0x002c, B:16:0x0049, B:63:0x016f, B:21:0x0063, B:26:0x00b5, B:25:0x00a6, B:29:0x00bd, B:32:0x00c9, B:34:0x00cf, B:36:0x00d7, B:39:0x00e8, B:42:0x00f4, B:44:0x00fa, B:49:0x0107, B:53:0x0123, B:55:0x0138, B:57:0x0157, B:59:0x0162, B:61:0x0168, B:62:0x016c, B:56:0x0146, B:50:0x0110, B:52:0x011b), top: B:73:0x002c, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016c A[Catch: all -> 0x0185, TryCatch #0 {all -> 0x0185, blocks: (B:6:0x002c, B:16:0x0049, B:63:0x016f, B:21:0x0063, B:26:0x00b5, B:25:0x00a6, B:29:0x00bd, B:32:0x00c9, B:34:0x00cf, B:36:0x00d7, B:39:0x00e8, B:42:0x00f4, B:44:0x00fa, B:49:0x0107, B:53:0x0123, B:55:0x0138, B:57:0x0157, B:59:0x0162, B:61:0x0168, B:62:0x016c, B:56:0x0146, B:50:0x0110, B:52:0x011b), top: B:73:0x002c, outer: #1 }] */
    @VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzI(String str, int i, Throwable th, byte[] bArr, Map map) {
        boolean z;
        String str2;
        zzfi zzfiVar;
        zzen zzenVar;
        zzaz().zzg();
        zzB();
        Preconditions.checkNotEmpty(str);
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } finally {
                this.zzt = false;
                zzae();
            }
        }
        zzef zzefVarZzj = zzay().zzj();
        Integer numValueOf = Integer.valueOf(bArr.length);
        zzefVarZzj.zzb("onConfigFetched. Response size", numValueOf);
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        zzamVar.zzw();
        try {
            zzam zzamVar2 = this.zze;
            zzal(zzamVar2);
            zzh zzhVarZzj = zzamVar2.zzj(str);
            if (i == 200 || i == 204) {
                z = th != null;
            } else {
                if (i == 304) {
                    i = 304;
                    if (th != null) {
                    }
                }
            }
            if (zzhVarZzj == null) {
                zzay().zzk().zzb("App does not exist in onConfigFetched. appId", zzeh.zzn(str));
            } else if (z || i == 404) {
                List list = map != null ? (List) map.get(HttpHeaders.LAST_MODIFIED) : null;
                String str3 = (list == null || list.isEmpty()) ? null : (String) list.get(0);
                zzox.zzc();
                if (zzg().zzs(null, zzdu.zzao)) {
                    List list2 = map != null ? (List) map.get(HttpHeaders.ETAG) : null;
                    if (list2 != null && !list2.isEmpty()) {
                        str2 = (String) list2.get(0);
                    }
                    if (i != 404) {
                        zzfiVar = this.zzc;
                        zzal(zzfiVar);
                        if (zzfiVar.zze(str) == null) {
                        }
                        zzhVarZzj.zzL(zzav().currentTimeMillis());
                        zzam zzamVar3 = this.zze;
                        zzal(zzamVar3);
                        zzamVar3.zzD(zzhVarZzj);
                        if (i != 404) {
                        }
                        zzenVar = this.zzd;
                        zzal(zzenVar);
                        if (zzenVar.zza()) {
                            zzag();
                        }
                    }
                } else {
                    str2 = null;
                    if (i != 404 || i == 304) {
                        zzfiVar = this.zzc;
                        zzal(zzfiVar);
                        if (zzfiVar.zze(str) == null) {
                            zzfi zzfiVar2 = this.zzc;
                            zzal(zzfiVar2);
                            zzfiVar2.zzt(str, null, null, null);
                        }
                    } else {
                        zzfi zzfiVar3 = this.zzc;
                        zzal(zzfiVar3);
                        zzfiVar3.zzt(str, bArr, str3, str2);
                    }
                    zzhVarZzj.zzL(zzav().currentTimeMillis());
                    zzam zzamVar32 = this.zze;
                    zzal(zzamVar32);
                    zzamVar32.zzD(zzhVarZzj);
                    if (i != 404) {
                        zzay().zzl().zzb("Config not found. Using empty config. appId", str);
                    } else {
                        zzay().zzj().zzc("Successfully fetched config. Got network response. code, size", Integer.valueOf(i), numValueOf);
                    }
                    zzenVar = this.zzd;
                    zzal(zzenVar);
                    if (zzenVar.zza() || !zzai()) {
                        zzag();
                    } else {
                        zzX();
                    }
                }
            } else {
                zzhVarZzj.zzU(zzav().currentTimeMillis());
                zzam zzamVar4 = this.zze;
                zzal(zzamVar4);
                zzamVar4.zzD(zzhVarZzj);
                zzay().zzj().zzc("Fetching config failed. code, error", Integer.valueOf(i), th);
                zzfi zzfiVar4 = this.zzc;
                zzal(zzfiVar4);
                zzfiVar4.zzl(str);
                this.zzk.zzd.zzb(zzav().currentTimeMillis());
                if (i == 503 || i == 429) {
                    this.zzk.zzb.zzb(zzav().currentTimeMillis());
                }
                zzag();
            }
            zzam zzamVar5 = this.zze;
            zzal(zzamVar5);
            zzamVar5.zzC();
        } finally {
            zzam zzamVar6 = this.zze;
            zzal(zzamVar6);
            zzamVar6.zzx();
        }
    }

    public final void zzJ(boolean z) {
        zzag();
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x014a A[Catch: all -> 0x016a, TryCatch #1 {all -> 0x016a, blocks: (B:4:0x000d, B:5:0x000f, B:46:0x0122, B:51:0x0159, B:50:0x014a, B:12:0x0025, B:34:0x00c3, B:36:0x00d8, B:38:0x00de, B:40:0x00e9, B:39:0x00e2, B:42:0x00ed, B:43:0x00f5, B:45:0x00f7), top: B:58:0x000d, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0025 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzK(int i, Throwable th, byte[] bArr, String str) {
        zzam zzamVar;
        long jLongValue;
        zzaz().zzg();
        zzB();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } finally {
                this.zzu = false;
                zzae();
            }
        }
        List<Long> list = (List) Preconditions.checkNotNull(this.zzy);
        this.zzy = null;
        if (i != 200) {
            if (i == 204) {
                i = 204;
                if (th != null) {
                }
            }
            zzay().zzj().zzc("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
            this.zzk.zzd.zzb(zzav().currentTimeMillis());
            if (i != 503) {
                this.zzk.zzb.zzb(zzav().currentTimeMillis());
                zzam zzamVar2 = this.zze;
                zzal(zzamVar2);
                zzamVar2.zzy(list);
                zzag();
            }
        } else if (th != null) {
            try {
                this.zzk.zzc.zzb(zzav().currentTimeMillis());
                this.zzk.zzd.zzb(0L);
                zzag();
                zzay().zzj().zzc("Successful upload. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                zzam zzamVar3 = this.zze;
                zzal(zzamVar3);
                zzamVar3.zzw();
                try {
                    for (Long l : list) {
                        try {
                            zzamVar = this.zze;
                            zzal(zzamVar);
                            jLongValue = l.longValue();
                            zzamVar.zzg();
                            zzamVar.zzW();
                        } catch (SQLiteException e) {
                            List list2 = this.zzz;
                            if (list2 == null || !list2.contains(l)) {
                                throw e;
                            }
                        }
                        try {
                            if (zzamVar.zzh().delete("queue", "rowid=?", new String[]{String.valueOf(jLongValue)}) != 1) {
                                throw new SQLiteException("Deleted fewer rows from queue than expected");
                            }
                        } catch (SQLiteException e2) {
                            zzamVar.zzt.zzay().zzd().zzb("Failed to delete a bundle in a queue table", e2);
                            throw e2;
                        }
                    }
                    zzam zzamVar4 = this.zze;
                    zzal(zzamVar4);
                    zzamVar4.zzC();
                    zzam zzamVar5 = this.zze;
                    zzal(zzamVar5);
                    zzamVar5.zzx();
                    this.zzz = null;
                    zzen zzenVar = this.zzd;
                    zzal(zzenVar);
                    if (zzenVar.zza() && zzai()) {
                        zzX();
                    } else {
                        this.zzA = -1L;
                        zzag();
                    }
                    this.zza = 0L;
                } catch (Throwable th2) {
                    zzam zzamVar6 = this.zze;
                    zzal(zzamVar6);
                    zzamVar6.zzx();
                    throw th2;
                }
            } catch (SQLiteException e3) {
                zzay().zzd().zzb("Database error while trying to delete uploaded bundles", e3);
                this.zza = zzav().elapsedRealtime();
                zzay().zzj().zzb("Disable upload, time", Long.valueOf(this.zza));
            }
        } else {
            zzay().zzj().zzc("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
            this.zzk.zzd.zzb(zzav().currentTimeMillis());
            if (i != 503 || i == 429) {
                this.zzk.zzb.zzb(zzav().currentTimeMillis());
            }
            zzam zzamVar22 = this.zze;
            zzal(zzamVar22);
            zzamVar22.zzy(list);
            zzag();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x03f0 A[Catch: all -> 0x057e, TryCatch #7 {all -> 0x057e, blocks: (B:23:0x00a4, B:25:0x00b3, B:43:0x0117, B:45:0x012a, B:47:0x0140, B:48:0x0167, B:50:0x01c2, B:52:0x01c8, B:54:0x01d1, B:64:0x0203, B:66:0x020e, B:70:0x021b, B:73:0x022c, B:77:0x0237, B:79:0x023a, B:80:0x0258, B:82:0x025d, B:85:0x027c, B:88:0x028f, B:90:0x02b5, B:93:0x02bd, B:95:0x02cc, B:130:0x03bc, B:132:0x03f0, B:133:0x03f3, B:135:0x041c, B:179:0x04f0, B:180:0x04f3, B:188:0x056d, B:137:0x0431, B:142:0x0455, B:144:0x045d, B:146:0x0465, B:150:0x0478, B:154:0x0489, B:158:0x0495, B:161:0x04ab, B:163:0x04b7, B:171:0x04d5, B:173:0x04da, B:174:0x04df, B:176:0x04e5, B:169:0x04c1, B:152:0x0481, B:140:0x0441, B:97:0x02df, B:99:0x030a, B:100:0x031a, B:102:0x0321, B:104:0x0327, B:106:0x0331, B:108:0x0337, B:110:0x033d, B:112:0x0343, B:113:0x0348, B:115:0x0353, B:119:0x036b, B:125:0x0373, B:126:0x0387, B:128:0x039a, B:129:0x03ab, B:181:0x0508, B:183:0x0538, B:184:0x053b, B:185:0x0550, B:187:0x0554, B:83:0x026c, B:60:0x01ea, B:29:0x00c5, B:31:0x00c9, B:35:0x00da, B:37:0x00f1, B:39:0x00fb, B:42:0x0107), top: B:209:0x00a4, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x041c A[Catch: all -> 0x057e, TRY_LEAVE, TryCatch #7 {all -> 0x057e, blocks: (B:23:0x00a4, B:25:0x00b3, B:43:0x0117, B:45:0x012a, B:47:0x0140, B:48:0x0167, B:50:0x01c2, B:52:0x01c8, B:54:0x01d1, B:64:0x0203, B:66:0x020e, B:70:0x021b, B:73:0x022c, B:77:0x0237, B:79:0x023a, B:80:0x0258, B:82:0x025d, B:85:0x027c, B:88:0x028f, B:90:0x02b5, B:93:0x02bd, B:95:0x02cc, B:130:0x03bc, B:132:0x03f0, B:133:0x03f3, B:135:0x041c, B:179:0x04f0, B:180:0x04f3, B:188:0x056d, B:137:0x0431, B:142:0x0455, B:144:0x045d, B:146:0x0465, B:150:0x0478, B:154:0x0489, B:158:0x0495, B:161:0x04ab, B:163:0x04b7, B:171:0x04d5, B:173:0x04da, B:174:0x04df, B:176:0x04e5, B:169:0x04c1, B:152:0x0481, B:140:0x0441, B:97:0x02df, B:99:0x030a, B:100:0x031a, B:102:0x0321, B:104:0x0327, B:106:0x0331, B:108:0x0337, B:110:0x033d, B:112:0x0343, B:113:0x0348, B:115:0x0353, B:119:0x036b, B:125:0x0373, B:126:0x0387, B:128:0x039a, B:129:0x03ab, B:181:0x0508, B:183:0x0538, B:184:0x053b, B:185:0x0550, B:187:0x0554, B:83:0x026c, B:60:0x01ea, B:29:0x00c5, B:31:0x00c9, B:35:0x00da, B:37:0x00f1, B:39:0x00fb, B:42:0x0107), top: B:209:0x00a4, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x04d5 A[Catch: all -> 0x057e, TryCatch #7 {all -> 0x057e, blocks: (B:23:0x00a4, B:25:0x00b3, B:43:0x0117, B:45:0x012a, B:47:0x0140, B:48:0x0167, B:50:0x01c2, B:52:0x01c8, B:54:0x01d1, B:64:0x0203, B:66:0x020e, B:70:0x021b, B:73:0x022c, B:77:0x0237, B:79:0x023a, B:80:0x0258, B:82:0x025d, B:85:0x027c, B:88:0x028f, B:90:0x02b5, B:93:0x02bd, B:95:0x02cc, B:130:0x03bc, B:132:0x03f0, B:133:0x03f3, B:135:0x041c, B:179:0x04f0, B:180:0x04f3, B:188:0x056d, B:137:0x0431, B:142:0x0455, B:144:0x045d, B:146:0x0465, B:150:0x0478, B:154:0x0489, B:158:0x0495, B:161:0x04ab, B:163:0x04b7, B:171:0x04d5, B:173:0x04da, B:174:0x04df, B:176:0x04e5, B:169:0x04c1, B:152:0x0481, B:140:0x0441, B:97:0x02df, B:99:0x030a, B:100:0x031a, B:102:0x0321, B:104:0x0327, B:106:0x0331, B:108:0x0337, B:110:0x033d, B:112:0x0343, B:113:0x0348, B:115:0x0353, B:119:0x036b, B:125:0x0373, B:126:0x0387, B:128:0x039a, B:129:0x03ab, B:181:0x0508, B:183:0x0538, B:184:0x053b, B:185:0x0550, B:187:0x0554, B:83:0x026c, B:60:0x01ea, B:29:0x00c5, B:31:0x00c9, B:35:0x00da, B:37:0x00f1, B:39:0x00fb, B:42:0x0107), top: B:209:0x00a4, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x04f0 A[Catch: all -> 0x057e, TryCatch #7 {all -> 0x057e, blocks: (B:23:0x00a4, B:25:0x00b3, B:43:0x0117, B:45:0x012a, B:47:0x0140, B:48:0x0167, B:50:0x01c2, B:52:0x01c8, B:54:0x01d1, B:64:0x0203, B:66:0x020e, B:70:0x021b, B:73:0x022c, B:77:0x0237, B:79:0x023a, B:80:0x0258, B:82:0x025d, B:85:0x027c, B:88:0x028f, B:90:0x02b5, B:93:0x02bd, B:95:0x02cc, B:130:0x03bc, B:132:0x03f0, B:133:0x03f3, B:135:0x041c, B:179:0x04f0, B:180:0x04f3, B:188:0x056d, B:137:0x0431, B:142:0x0455, B:144:0x045d, B:146:0x0465, B:150:0x0478, B:154:0x0489, B:158:0x0495, B:161:0x04ab, B:163:0x04b7, B:171:0x04d5, B:173:0x04da, B:174:0x04df, B:176:0x04e5, B:169:0x04c1, B:152:0x0481, B:140:0x0441, B:97:0x02df, B:99:0x030a, B:100:0x031a, B:102:0x0321, B:104:0x0327, B:106:0x0331, B:108:0x0337, B:110:0x033d, B:112:0x0343, B:113:0x0348, B:115:0x0353, B:119:0x036b, B:125:0x0373, B:126:0x0387, B:128:0x039a, B:129:0x03ab, B:181:0x0508, B:183:0x0538, B:184:0x053b, B:185:0x0550, B:187:0x0554, B:83:0x026c, B:60:0x01ea, B:29:0x00c5, B:31:0x00c9, B:35:0x00da, B:37:0x00f1, B:39:0x00fb, B:42:0x0107), top: B:209:0x00a4, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0550 A[Catch: all -> 0x057e, TryCatch #7 {all -> 0x057e, blocks: (B:23:0x00a4, B:25:0x00b3, B:43:0x0117, B:45:0x012a, B:47:0x0140, B:48:0x0167, B:50:0x01c2, B:52:0x01c8, B:54:0x01d1, B:64:0x0203, B:66:0x020e, B:70:0x021b, B:73:0x022c, B:77:0x0237, B:79:0x023a, B:80:0x0258, B:82:0x025d, B:85:0x027c, B:88:0x028f, B:90:0x02b5, B:93:0x02bd, B:95:0x02cc, B:130:0x03bc, B:132:0x03f0, B:133:0x03f3, B:135:0x041c, B:179:0x04f0, B:180:0x04f3, B:188:0x056d, B:137:0x0431, B:142:0x0455, B:144:0x045d, B:146:0x0465, B:150:0x0478, B:154:0x0489, B:158:0x0495, B:161:0x04ab, B:163:0x04b7, B:171:0x04d5, B:173:0x04da, B:174:0x04df, B:176:0x04e5, B:169:0x04c1, B:152:0x0481, B:140:0x0441, B:97:0x02df, B:99:0x030a, B:100:0x031a, B:102:0x0321, B:104:0x0327, B:106:0x0331, B:108:0x0337, B:110:0x033d, B:112:0x0343, B:113:0x0348, B:115:0x0353, B:119:0x036b, B:125:0x0373, B:126:0x0387, B:128:0x039a, B:129:0x03ab, B:181:0x0508, B:183:0x0538, B:184:0x053b, B:185:0x0550, B:187:0x0554, B:83:0x026c, B:60:0x01ea, B:29:0x00c5, B:31:0x00c9, B:35:0x00da, B:37:0x00f1, B:39:0x00fb, B:42:0x0107), top: B:209:0x00a4, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0431 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0203 A[Catch: all -> 0x057e, TryCatch #7 {all -> 0x057e, blocks: (B:23:0x00a4, B:25:0x00b3, B:43:0x0117, B:45:0x012a, B:47:0x0140, B:48:0x0167, B:50:0x01c2, B:52:0x01c8, B:54:0x01d1, B:64:0x0203, B:66:0x020e, B:70:0x021b, B:73:0x022c, B:77:0x0237, B:79:0x023a, B:80:0x0258, B:82:0x025d, B:85:0x027c, B:88:0x028f, B:90:0x02b5, B:93:0x02bd, B:95:0x02cc, B:130:0x03bc, B:132:0x03f0, B:133:0x03f3, B:135:0x041c, B:179:0x04f0, B:180:0x04f3, B:188:0x056d, B:137:0x0431, B:142:0x0455, B:144:0x045d, B:146:0x0465, B:150:0x0478, B:154:0x0489, B:158:0x0495, B:161:0x04ab, B:163:0x04b7, B:171:0x04d5, B:173:0x04da, B:174:0x04df, B:176:0x04e5, B:169:0x04c1, B:152:0x0481, B:140:0x0441, B:97:0x02df, B:99:0x030a, B:100:0x031a, B:102:0x0321, B:104:0x0327, B:106:0x0331, B:108:0x0337, B:110:0x033d, B:112:0x0343, B:113:0x0348, B:115:0x0353, B:119:0x036b, B:125:0x0373, B:126:0x0387, B:128:0x039a, B:129:0x03ab, B:181:0x0508, B:183:0x0538, B:184:0x053b, B:185:0x0550, B:187:0x0554, B:83:0x026c, B:60:0x01ea, B:29:0x00c5, B:31:0x00c9, B:35:0x00da, B:37:0x00f1, B:39:0x00fb, B:42:0x0107), top: B:209:0x00a4, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x025d A[Catch: all -> 0x057e, TryCatch #7 {all -> 0x057e, blocks: (B:23:0x00a4, B:25:0x00b3, B:43:0x0117, B:45:0x012a, B:47:0x0140, B:48:0x0167, B:50:0x01c2, B:52:0x01c8, B:54:0x01d1, B:64:0x0203, B:66:0x020e, B:70:0x021b, B:73:0x022c, B:77:0x0237, B:79:0x023a, B:80:0x0258, B:82:0x025d, B:85:0x027c, B:88:0x028f, B:90:0x02b5, B:93:0x02bd, B:95:0x02cc, B:130:0x03bc, B:132:0x03f0, B:133:0x03f3, B:135:0x041c, B:179:0x04f0, B:180:0x04f3, B:188:0x056d, B:137:0x0431, B:142:0x0455, B:144:0x045d, B:146:0x0465, B:150:0x0478, B:154:0x0489, B:158:0x0495, B:161:0x04ab, B:163:0x04b7, B:171:0x04d5, B:173:0x04da, B:174:0x04df, B:176:0x04e5, B:169:0x04c1, B:152:0x0481, B:140:0x0441, B:97:0x02df, B:99:0x030a, B:100:0x031a, B:102:0x0321, B:104:0x0327, B:106:0x0331, B:108:0x0337, B:110:0x033d, B:112:0x0343, B:113:0x0348, B:115:0x0353, B:119:0x036b, B:125:0x0373, B:126:0x0387, B:128:0x039a, B:129:0x03ab, B:181:0x0508, B:183:0x0538, B:184:0x053b, B:185:0x0550, B:187:0x0554, B:83:0x026c, B:60:0x01ea, B:29:0x00c5, B:31:0x00c9, B:35:0x00da, B:37:0x00f1, B:39:0x00fb, B:42:0x0107), top: B:209:0x00a4, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x026c A[Catch: all -> 0x057e, TryCatch #7 {all -> 0x057e, blocks: (B:23:0x00a4, B:25:0x00b3, B:43:0x0117, B:45:0x012a, B:47:0x0140, B:48:0x0167, B:50:0x01c2, B:52:0x01c8, B:54:0x01d1, B:64:0x0203, B:66:0x020e, B:70:0x021b, B:73:0x022c, B:77:0x0237, B:79:0x023a, B:80:0x0258, B:82:0x025d, B:85:0x027c, B:88:0x028f, B:90:0x02b5, B:93:0x02bd, B:95:0x02cc, B:130:0x03bc, B:132:0x03f0, B:133:0x03f3, B:135:0x041c, B:179:0x04f0, B:180:0x04f3, B:188:0x056d, B:137:0x0431, B:142:0x0455, B:144:0x045d, B:146:0x0465, B:150:0x0478, B:154:0x0489, B:158:0x0495, B:161:0x04ab, B:163:0x04b7, B:171:0x04d5, B:173:0x04da, B:174:0x04df, B:176:0x04e5, B:169:0x04c1, B:152:0x0481, B:140:0x0441, B:97:0x02df, B:99:0x030a, B:100:0x031a, B:102:0x0321, B:104:0x0327, B:106:0x0331, B:108:0x0337, B:110:0x033d, B:112:0x0343, B:113:0x0348, B:115:0x0353, B:119:0x036b, B:125:0x0373, B:126:0x0387, B:128:0x039a, B:129:0x03ab, B:181:0x0508, B:183:0x0538, B:184:0x053b, B:185:0x0550, B:187:0x0554, B:83:0x026c, B:60:0x01ea, B:29:0x00c5, B:31:0x00c9, B:35:0x00da, B:37:0x00f1, B:39:0x00fb, B:42:0x0107), top: B:209:0x00a4, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x027c A[Catch: all -> 0x057e, TRY_LEAVE, TryCatch #7 {all -> 0x057e, blocks: (B:23:0x00a4, B:25:0x00b3, B:43:0x0117, B:45:0x012a, B:47:0x0140, B:48:0x0167, B:50:0x01c2, B:52:0x01c8, B:54:0x01d1, B:64:0x0203, B:66:0x020e, B:70:0x021b, B:73:0x022c, B:77:0x0237, B:79:0x023a, B:80:0x0258, B:82:0x025d, B:85:0x027c, B:88:0x028f, B:90:0x02b5, B:93:0x02bd, B:95:0x02cc, B:130:0x03bc, B:132:0x03f0, B:133:0x03f3, B:135:0x041c, B:179:0x04f0, B:180:0x04f3, B:188:0x056d, B:137:0x0431, B:142:0x0455, B:144:0x045d, B:146:0x0465, B:150:0x0478, B:154:0x0489, B:158:0x0495, B:161:0x04ab, B:163:0x04b7, B:171:0x04d5, B:173:0x04da, B:174:0x04df, B:176:0x04e5, B:169:0x04c1, B:152:0x0481, B:140:0x0441, B:97:0x02df, B:99:0x030a, B:100:0x031a, B:102:0x0321, B:104:0x0327, B:106:0x0331, B:108:0x0337, B:110:0x033d, B:112:0x0343, B:113:0x0348, B:115:0x0353, B:119:0x036b, B:125:0x0373, B:126:0x0387, B:128:0x039a, B:129:0x03ab, B:181:0x0508, B:183:0x0538, B:184:0x053b, B:185:0x0550, B:187:0x0554, B:83:0x026c, B:60:0x01ea, B:29:0x00c5, B:31:0x00c9, B:35:0x00da, B:37:0x00f1, B:39:0x00fb, B:42:0x0107), top: B:209:0x00a4, inners: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzL(zzq zzqVar) {
        String str;
        String str2;
        String str3;
        zzas zzasVarZzn;
        boolean z;
        int i;
        long jZzc;
        PackageInfo packageInfo;
        String str4;
        String str5;
        int i2;
        int i3;
        String str6;
        ApplicationInfo applicationInfo;
        boolean z2;
        SQLiteDatabase sQLiteDatabaseZzh;
        String[] strArr;
        int iDelete;
        zzaz().zzg();
        zzB();
        Preconditions.checkNotNull(zzqVar);
        Preconditions.checkNotEmpty(zzqVar.zza);
        if (zzak(zzqVar)) {
            zzam zzamVar = this.zze;
            zzal(zzamVar);
            zzh zzhVarZzj = zzamVar.zzj(zzqVar.zza);
            if (zzhVarZzj != null && TextUtils.isEmpty(zzhVarZzj.zzy()) && !TextUtils.isEmpty(zzqVar.zzb)) {
                zzhVarZzj.zzL(0L);
                zzam zzamVar2 = this.zze;
                zzal(zzamVar2);
                zzamVar2.zzD(zzhVarZzj);
                zzfi zzfiVar = this.zzc;
                zzal(zzfiVar);
                zzfiVar.zzm(zzqVar.zza);
            }
            if (!zzqVar.zzh) {
                zzd(zzqVar);
                return;
            }
            long jCurrentTimeMillis = zzqVar.zzm;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = zzav().currentTimeMillis();
            }
            this.zzn.zzg().zzd();
            int i4 = zzqVar.zzn;
            if (i4 != 0 && i4 != 1) {
                zzay().zzk().zzc("Incorrect app type, assuming installed app. appId, appType", zzeh.zzn(zzqVar.zza), Integer.valueOf(i4));
                i4 = 0;
            }
            zzam zzamVar3 = this.zze;
            zzal(zzamVar3);
            zzamVar3.zzw();
            try {
                zzam zzamVar4 = this.zze;
                zzal(zzamVar4);
                zzky zzkyVarZzp = zzamVar4.zzp(zzqVar.zza, "_npa");
                if (zzkyVarZzp != null && !"auto".equals(zzkyVarZzp.zzb)) {
                    str = "_sysu";
                    str2 = "_sys";
                } else if (zzqVar.zzr != null) {
                    str = "_sysu";
                    str2 = "_sys";
                    zzkw zzkwVar = new zzkw("_npa", jCurrentTimeMillis, Long.valueOf(true != zzqVar.zzr.booleanValue() ? 0L : 1L), "auto");
                    if (zzkyVarZzp == null || !zzkyVarZzp.zze.equals(zzkwVar.zzd)) {
                        zzW(zzkwVar, zzqVar);
                    }
                } else {
                    str = "_sysu";
                    str2 = "_sys";
                    if (zzkyVarZzp != null) {
                        zzP(new zzkw("_npa", jCurrentTimeMillis, null, "auto"), zzqVar);
                    }
                }
                zzam zzamVar5 = this.zze;
                zzal(zzamVar5);
                zzh zzhVarZzj2 = zzamVar5.zzj((String) Preconditions.checkNotNull(zzqVar.zza));
                if (zzhVarZzj2 == null || !zzv().zzam(zzqVar.zzb, zzhVarZzj2.zzy(), zzqVar.zzq, zzhVarZzj2.zzr())) {
                    str3 = "_pfo";
                } else {
                    zzay().zzk().zzb("New GMP App Id passed in. Removing cached database data. appId", zzeh.zzn(zzhVarZzj2.zzt()));
                    zzam zzamVar6 = this.zze;
                    zzal(zzamVar6);
                    String strZzt = zzhVarZzj2.zzt();
                    zzamVar6.zzW();
                    zzamVar6.zzg();
                    Preconditions.checkNotEmpty(strZzt);
                    try {
                        sQLiteDatabaseZzh = zzamVar6.zzh();
                        strArr = new String[]{strZzt};
                        iDelete = sQLiteDatabaseZzh.delete("events", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("apps", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("event_filters", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("property_filters", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("consent_settings", "app_id=?", strArr);
                        zzoi.zzc();
                        str3 = "_pfo";
                    } catch (SQLiteException e) {
                        e = e;
                        str3 = "_pfo";
                    }
                    try {
                        if (zzamVar6.zzt.zzf().zzs(null, zzdu.zzat)) {
                            iDelete += sQLiteDatabaseZzh.delete("default_event_params", "app_id=?", strArr);
                        }
                        if (iDelete > 0) {
                            zzamVar6.zzt.zzay().zzj().zzc("Deleted application data. app, records", strZzt, Integer.valueOf(iDelete));
                        }
                    } catch (SQLiteException e2) {
                        e = e2;
                        zzamVar6.zzt.zzay().zzd().zzc("Error deleting application data. appId, error", zzeh.zzn(strZzt), e);
                        zzhVarZzj2 = null;
                        if (zzhVarZzj2 != null) {
                        }
                        zzd(zzqVar);
                        if (i4 != 0) {
                        }
                        if (zzasVarZzn != null) {
                        }
                        zzam zzamVar7 = this.zze;
                        zzal(zzamVar7);
                        zzamVar7.zzC();
                    }
                    zzhVarZzj2 = null;
                }
                if (zzhVarZzj2 != null) {
                    boolean z3 = (zzhVarZzj2.zzb() == -2147483648L || zzhVarZzj2.zzb() == zzqVar.zzj) ? false : true;
                    String strZzw = zzhVarZzj2.zzw();
                    if (z3 | ((zzhVarZzj2.zzb() != -2147483648L || strZzw == null || strZzw.equals(zzqVar.zzc)) ? false : true)) {
                        Bundle bundle = new Bundle();
                        bundle.putString("_pv", strZzw);
                        zzE(new zzaw("_au", new zzau(bundle), "auto", jCurrentTimeMillis), zzqVar);
                    }
                }
                zzd(zzqVar);
                if (i4 != 0) {
                    zzam zzamVar8 = this.zze;
                    zzal(zzamVar8);
                    zzasVarZzn = zzamVar8.zzn(zzqVar.zza, "_f");
                    z = false;
                } else {
                    zzam zzamVar9 = this.zze;
                    zzal(zzamVar9);
                    zzasVarZzn = zzamVar9.zzn(zzqVar.zza, "_v");
                    z = true;
                }
                if (zzasVarZzn != null) {
                    long j = ((jCurrentTimeMillis / 3600000) + 1) * 3600000;
                    if (z) {
                        zzW(new zzkw("_fvt", jCurrentTimeMillis, Long.valueOf(j), "auto"), zzqVar);
                        zzaz().zzg();
                        zzB();
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("_c", 1L);
                        bundle2.putLong("_r", 1L);
                        bundle2.putLong("_et", 1L);
                        if (zzqVar.zzp) {
                            bundle2.putLong("_dac", 1L);
                        }
                        zzG(new zzaw("_v", new zzau(bundle2), "auto", jCurrentTimeMillis), zzqVar);
                    } else {
                        zzW(new zzkw("_fot", jCurrentTimeMillis, Long.valueOf(j), "auto"), zzqVar);
                        zzaz().zzg();
                        zzez zzezVar = (zzez) Preconditions.checkNotNull(this.zzm);
                        String str7 = zzqVar.zza;
                        if (str7 == null || str7.isEmpty()) {
                            i = 0;
                            zzezVar.zza.zzay().zzm().zza("Install Referrer Reporter was called with invalid app package name");
                        } else {
                            zzezVar.zza.zzaz().zzg();
                            if (zzezVar.zza()) {
                                zzey zzeyVar = new zzey(zzezVar, str7);
                                zzezVar.zza.zzaz().zzg();
                                Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                                intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                                PackageManager packageManager = zzezVar.zza.zzau().getPackageManager();
                                if (packageManager == null) {
                                    zzezVar.zza.zzay().zzm().zza("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
                                } else {
                                    i = 0;
                                    List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
                                    if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                                        zzezVar.zza.zzay().zzi().zza("Play Service for fetching Install Referrer is unavailable on device");
                                    } else {
                                        ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                                        if (serviceInfo != null) {
                                            String str8 = serviceInfo.packageName;
                                            if (serviceInfo.name != null && "com.android.vending".equals(str8) && zzezVar.zza()) {
                                                try {
                                                } catch (RuntimeException e3) {
                                                    e = e3;
                                                }
                                                try {
                                                    zzezVar.zza.zzay().zzj().zzb("Install Referrer Service is", true != ConnectionTracker.getInstance().bindService(zzezVar.zza.zzau(), new Intent(intent), zzeyVar, 1) ? "not available" : "available");
                                                } catch (RuntimeException e4) {
                                                    e = e4;
                                                    zzezVar.zza.zzay().zzd().zzb("Exception occurred while binding to Install Referrer Service", e.getMessage());
                                                    zzaz().zzg();
                                                    zzB();
                                                    Bundle bundle3 = new Bundle();
                                                    bundle3.putLong("_c", 1L);
                                                    bundle3.putLong("_r", 1L);
                                                    bundle3.putLong("_uwa", 0L);
                                                    String str9 = str3;
                                                    bundle3.putLong(str9, 0L);
                                                    String str10 = str2;
                                                    bundle3.putLong(str10, 0L);
                                                    String str11 = str;
                                                    bundle3.putLong(str11, 0L);
                                                    bundle3.putLong("_et", 1L);
                                                    if (zzqVar.zzp) {
                                                    }
                                                    String str12 = (String) Preconditions.checkNotNull(zzqVar.zza);
                                                    zzam zzamVar10 = this.zze;
                                                    zzal(zzamVar10);
                                                    Preconditions.checkNotEmpty(str12);
                                                    zzamVar10.zzg();
                                                    zzamVar10.zzW();
                                                    jZzc = zzamVar10.zzc(str12, "first_open_count");
                                                    if (this.zzn.zzau().getPackageManager() != null) {
                                                    }
                                                    if (jZzc >= 0) {
                                                    }
                                                    zzG(new zzaw("_f", new zzau(bundle3), "auto", jCurrentTimeMillis), zzqVar);
                                                    zzam zzamVar72 = this.zze;
                                                    zzal(zzamVar72);
                                                    zzamVar72.zzC();
                                                }
                                            } else {
                                                zzezVar.zza.zzay().zzk().zza("Play Store version 8.3.73 or higher required for Install Referrer");
                                            }
                                        }
                                    }
                                }
                            } else {
                                zzezVar.zza.zzay().zzi().zza("Install Referrer Reporter is not available");
                            }
                            i = 0;
                        }
                        zzaz().zzg();
                        zzB();
                        Bundle bundle32 = new Bundle();
                        bundle32.putLong("_c", 1L);
                        bundle32.putLong("_r", 1L);
                        bundle32.putLong("_uwa", 0L);
                        String str92 = str3;
                        bundle32.putLong(str92, 0L);
                        String str102 = str2;
                        bundle32.putLong(str102, 0L);
                        String str112 = str;
                        bundle32.putLong(str112, 0L);
                        bundle32.putLong("_et", 1L);
                        if (zzqVar.zzp) {
                            bundle32.putLong("_dac", 1L);
                        }
                        String str122 = (String) Preconditions.checkNotNull(zzqVar.zza);
                        zzam zzamVar102 = this.zze;
                        zzal(zzamVar102);
                        Preconditions.checkNotEmpty(str122);
                        zzamVar102.zzg();
                        zzamVar102.zzW();
                        jZzc = zzamVar102.zzc(str122, "first_open_count");
                        if (this.zzn.zzau().getPackageManager() != null) {
                            zzay().zzd().zzb("PackageManager is null, first open report might be inaccurate. appId", zzeh.zzn(str122));
                        } else {
                            try {
                                packageInfo = Wrappers.packageManager(this.zzn.zzau()).getPackageInfo(str122, i);
                            } catch (PackageManager.NameNotFoundException e5) {
                                zzay().zzd().zzc("Package info is null, first open report might be inaccurate. appId", zzeh.zzn(str122), e5);
                                packageInfo = null;
                            }
                            if (packageInfo != null) {
                                long j2 = packageInfo.firstInstallTime;
                                if (j2 != 0) {
                                    str4 = str122;
                                    if (j2 != packageInfo.lastUpdateTime) {
                                        if (!zzg().zzs(null, zzdu.zzab)) {
                                            bundle32.putLong("_uwa", 1L);
                                        } else if (jZzc == 0) {
                                            bundle32.putLong("_uwa", 1L);
                                            jZzc = 0;
                                        }
                                        z2 = false;
                                    } else {
                                        z2 = true;
                                    }
                                    i2 = 1;
                                    str5 = str112;
                                    i3 = 0;
                                    zzW(new zzkw("_fi", jCurrentTimeMillis, Long.valueOf(true != z2 ? 0L : 1L), "auto"), zzqVar);
                                } else {
                                    str4 = str122;
                                    str5 = str112;
                                    i2 = 1;
                                    i3 = 0;
                                }
                                try {
                                    str6 = str4;
                                } catch (PackageManager.NameNotFoundException e6) {
                                    e = e6;
                                    str6 = str4;
                                }
                                try {
                                    applicationInfo = Wrappers.packageManager(this.zzn.zzau()).getApplicationInfo(str6, i3);
                                } catch (PackageManager.NameNotFoundException e7) {
                                    e = e7;
                                    zzay().zzd().zzc("Application info is null, first open report might be inaccurate. appId", zzeh.zzn(str6), e);
                                    applicationInfo = null;
                                    if (applicationInfo != null) {
                                    }
                                    if (jZzc >= 0) {
                                    }
                                    zzG(new zzaw("_f", new zzau(bundle32), "auto", jCurrentTimeMillis), zzqVar);
                                    zzam zzamVar722 = this.zze;
                                    zzal(zzamVar722);
                                    zzamVar722.zzC();
                                }
                                if (applicationInfo != null) {
                                    if ((i2 & applicationInfo.flags) != 0) {
                                        bundle32.putLong(str102, 1L);
                                    }
                                    if ((applicationInfo.flags & 128) != 0) {
                                        bundle32.putLong(str5, 1L);
                                    }
                                }
                            }
                        }
                        if (jZzc >= 0) {
                            bundle32.putLong(str92, jZzc);
                        }
                        zzG(new zzaw("_f", new zzau(bundle32), "auto", jCurrentTimeMillis), zzqVar);
                    }
                } else if (zzqVar.zzi) {
                    zzG(new zzaw("_cd", new zzau(new Bundle()), "auto", jCurrentTimeMillis), zzqVar);
                }
                zzam zzamVar7222 = this.zze;
                zzal(zzamVar7222);
                zzamVar7222.zzC();
            } finally {
                zzam zzamVar11 = this.zze;
                zzal(zzamVar11);
                zzamVar11.zzx();
            }
        }
    }

    public final void zzM() {
        this.zzr++;
    }

    public final void zzN(zzac zzacVar) {
        zzq zzqVarZzac = zzac((String) Preconditions.checkNotNull(zzacVar.zza));
        if (zzqVarZzac != null) {
            zzO(zzacVar, zzqVarZzac);
        }
    }

    public final void zzO(zzac zzacVar, zzq zzqVar) {
        Preconditions.checkNotNull(zzacVar);
        Preconditions.checkNotEmpty(zzacVar.zza);
        Preconditions.checkNotNull(zzacVar.zzc);
        Preconditions.checkNotEmpty(zzacVar.zzc.zzb);
        zzaz().zzg();
        zzB();
        if (zzak(zzqVar)) {
            if (!zzqVar.zzh) {
                zzd(zzqVar);
                return;
            }
            zzam zzamVar = this.zze;
            zzal(zzamVar);
            zzamVar.zzw();
            try {
                zzd(zzqVar);
                String str = (String) Preconditions.checkNotNull(zzacVar.zza);
                zzam zzamVar2 = this.zze;
                zzal(zzamVar2);
                zzac zzacVarZzk = zzamVar2.zzk(str, zzacVar.zzc.zzb);
                if (zzacVarZzk != null) {
                    zzay().zzc().zzc("Removing conditional user property", zzacVar.zza, this.zzn.zzj().zzf(zzacVar.zzc.zzb));
                    zzam zzamVar3 = this.zze;
                    zzal(zzamVar3);
                    zzamVar3.zza(str, zzacVar.zzc.zzb);
                    if (zzacVarZzk.zze) {
                        zzam zzamVar4 = this.zze;
                        zzal(zzamVar4);
                        zzamVar4.zzA(str, zzacVar.zzc.zzb);
                    }
                    zzaw zzawVar = zzacVar.zzk;
                    if (zzawVar != null) {
                        zzau zzauVar = zzawVar.zzb;
                        zzY((zzaw) Preconditions.checkNotNull(zzv().zzz(str, ((zzaw) Preconditions.checkNotNull(zzacVar.zzk)).zza, zzauVar != null ? zzauVar.zzc() : null, zzacVarZzk.zzb, zzacVar.zzk.zzd, true, true)), zzqVar);
                    }
                } else {
                    zzay().zzk().zzc("Conditional user property doesn't exist", zzeh.zzn(zzacVar.zza), this.zzn.zzj().zzf(zzacVar.zzc.zzb));
                }
                zzam zzamVar5 = this.zze;
                zzal(zzamVar5);
                zzamVar5.zzC();
            } finally {
                zzam zzamVar6 = this.zze;
                zzal(zzamVar6);
                zzamVar6.zzx();
            }
        }
    }

    public final void zzP(zzkw zzkwVar, zzq zzqVar) {
        zzaz().zzg();
        zzB();
        if (zzak(zzqVar)) {
            if (!zzqVar.zzh) {
                zzd(zzqVar);
                return;
            }
            if ("_npa".equals(zzkwVar.zzb) && zzqVar.zzr != null) {
                zzay().zzc().zza("Falling back to manifest metadata value for ad personalization");
                zzW(new zzkw("_npa", zzav().currentTimeMillis(), Long.valueOf(true != zzqVar.zzr.booleanValue() ? 0L : 1L), "auto"), zzqVar);
                return;
            }
            zzay().zzc().zzb("Removing user property", this.zzn.zzj().zzf(zzkwVar.zzb));
            zzam zzamVar = this.zze;
            zzal(zzamVar);
            zzamVar.zzw();
            try {
                zzd(zzqVar);
                if ("_id".equals(zzkwVar.zzb)) {
                    zzam zzamVar2 = this.zze;
                    zzal(zzamVar2);
                    zzamVar2.zzA((String) Preconditions.checkNotNull(zzqVar.zza), "_lair");
                }
                zzam zzamVar3 = this.zze;
                zzal(zzamVar3);
                zzamVar3.zzA((String) Preconditions.checkNotNull(zzqVar.zza), zzkwVar.zzb);
                zzam zzamVar4 = this.zze;
                zzal(zzamVar4);
                zzamVar4.zzC();
                zzay().zzc().zzb("User property removed", this.zzn.zzj().zzf(zzkwVar.zzb));
            } finally {
                zzam zzamVar5 = this.zze;
                zzal(zzamVar5);
                zzamVar5.zzx();
            }
        }
    }

    @VisibleForTesting
    public final void zzQ(zzq zzqVar) {
        if (this.zzy != null) {
            ArrayList arrayList = new ArrayList();
            this.zzz = arrayList;
            arrayList.addAll(this.zzy);
        }
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        String str = (String) Preconditions.checkNotNull(zzqVar.zza);
        Preconditions.checkNotEmpty(str);
        zzamVar.zzg();
        zzamVar.zzW();
        try {
            SQLiteDatabase sQLiteDatabaseZzh = zzamVar.zzh();
            String[] strArr = {str};
            int iDelete = sQLiteDatabaseZzh.delete("apps", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("events", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("queue", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("main_event_params", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("default_event_params", "app_id=?", strArr);
            if (iDelete > 0) {
                zzamVar.zzt.zzay().zzj().zzc("Reset analytics data. app, records", str, Integer.valueOf(iDelete));
            }
        } catch (SQLiteException e) {
            zzamVar.zzt.zzay().zzd().zzc("Error resetting analytics data. appId, error", zzeh.zzn(str), e);
        }
        if (zzqVar.zzh) {
            zzL(zzqVar);
        }
    }

    public final void zzR(String str, zzie zzieVar) {
        zzaz().zzg();
        String str2 = this.zzE;
        if (str2 == null || str2.equals(str) || zzieVar != null) {
            this.zzE = str;
            this.zzD = zzieVar;
        }
    }

    public final void zzS() {
        zzaz().zzg();
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        zzamVar.zzz();
        if (this.zzk.zzc.zza() == 0) {
            this.zzk.zzc.zzb(zzav().currentTimeMillis());
        }
        zzag();
    }

    public final void zzT(zzac zzacVar) {
        zzq zzqVarZzac = zzac((String) Preconditions.checkNotNull(zzacVar.zza));
        if (zzqVarZzac != null) {
            zzU(zzacVar, zzqVarZzac);
        }
    }

    public final void zzU(zzac zzacVar, zzq zzqVar) {
        Preconditions.checkNotNull(zzacVar);
        Preconditions.checkNotEmpty(zzacVar.zza);
        Preconditions.checkNotNull(zzacVar.zzb);
        Preconditions.checkNotNull(zzacVar.zzc);
        Preconditions.checkNotEmpty(zzacVar.zzc.zzb);
        zzaz().zzg();
        zzB();
        if (zzak(zzqVar)) {
            if (!zzqVar.zzh) {
                zzd(zzqVar);
                return;
            }
            zzac zzacVar2 = new zzac(zzacVar);
            boolean z = false;
            zzacVar2.zze = false;
            zzam zzamVar = this.zze;
            zzal(zzamVar);
            zzamVar.zzw();
            try {
                zzam zzamVar2 = this.zze;
                zzal(zzamVar2);
                zzac zzacVarZzk = zzamVar2.zzk((String) Preconditions.checkNotNull(zzacVar2.zza), zzacVar2.zzc.zzb);
                if (zzacVarZzk != null && !zzacVarZzk.zzb.equals(zzacVar2.zzb)) {
                    zzay().zzk().zzd("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.zzn.zzj().zzf(zzacVar2.zzc.zzb), zzacVar2.zzb, zzacVarZzk.zzb);
                }
                if (zzacVarZzk != null && zzacVarZzk.zze) {
                    zzacVar2.zzb = zzacVarZzk.zzb;
                    zzacVar2.zzd = zzacVarZzk.zzd;
                    zzacVar2.zzh = zzacVarZzk.zzh;
                    zzacVar2.zzf = zzacVarZzk.zzf;
                    zzacVar2.zzi = zzacVarZzk.zzi;
                    zzacVar2.zze = true;
                    zzkw zzkwVar = zzacVar2.zzc;
                    zzacVar2.zzc = new zzkw(zzkwVar.zzb, zzacVarZzk.zzc.zzc, zzkwVar.zza(), zzacVarZzk.zzc.zzf);
                } else if (TextUtils.isEmpty(zzacVar2.zzf)) {
                    zzkw zzkwVar2 = zzacVar2.zzc;
                    zzacVar2.zzc = new zzkw(zzkwVar2.zzb, zzacVar2.zzd, zzkwVar2.zza(), zzacVar2.zzc.zzf);
                    zzacVar2.zze = true;
                    z = true;
                }
                if (zzacVar2.zze) {
                    zzkw zzkwVar3 = zzacVar2.zzc;
                    zzky zzkyVar = new zzky((String) Preconditions.checkNotNull(zzacVar2.zza), zzacVar2.zzb, zzkwVar3.zzb, zzkwVar3.zzc, Preconditions.checkNotNull(zzkwVar3.zza()));
                    zzam zzamVar3 = this.zze;
                    zzal(zzamVar3);
                    if (zzamVar3.zzL(zzkyVar)) {
                        zzay().zzc().zzd("User property updated immediately", zzacVar2.zza, this.zzn.zzj().zzf(zzkyVar.zzc), zzkyVar.zze);
                    } else {
                        zzay().zzd().zzd("(2)Too many active user properties, ignoring", zzeh.zzn(zzacVar2.zza), this.zzn.zzj().zzf(zzkyVar.zzc), zzkyVar.zze);
                    }
                    if (z && zzacVar2.zzi != null) {
                        zzY(new zzaw(zzacVar2.zzi, zzacVar2.zzd), zzqVar);
                    }
                }
                zzam zzamVar4 = this.zze;
                zzal(zzamVar4);
                if (zzamVar4.zzK(zzacVar2)) {
                    zzay().zzc().zzd("Conditional property added", zzacVar2.zza, this.zzn.zzj().zzf(zzacVar2.zzc.zzb), zzacVar2.zzc.zza());
                } else {
                    zzay().zzd().zzd("Too many conditional properties, ignoring", zzeh.zzn(zzacVar2.zza), this.zzn.zzj().zzf(zzacVar2.zzc.zzb), zzacVar2.zzc.zza());
                }
                zzam zzamVar5 = this.zze;
                zzal(zzamVar5);
                zzamVar5.zzC();
            } finally {
                zzam zzamVar6 = this.zze;
                zzal(zzamVar6);
                zzamVar6.zzx();
            }
        }
    }

    public final void zzV(String str, zzai zzaiVar) {
        zzaz().zzg();
        zzB();
        this.zzB.put(str, zzaiVar);
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(zzaiVar);
        zzamVar.zzg();
        zzamVar.zzW();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", zzaiVar.zzh());
        try {
            if (zzamVar.zzh().insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                zzamVar.zzt.zzay().zzd().zzb("Failed to insert/update consent setting (got -1). appId", zzeh.zzn(str));
            }
        } catch (SQLiteException e) {
            zzamVar.zzt.zzay().zzd().zzc("Error storing consent setting. appId, error", zzeh.zzn(str), e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzW(zzkw zzkwVar, zzq zzqVar) {
        long jLongValue;
        zzaz().zzg();
        zzB();
        if (zzak(zzqVar)) {
            if (!zzqVar.zzh) {
                zzd(zzqVar);
                return;
            }
            int iZzl = zzv().zzl(zzkwVar.zzb);
            int length = 0;
            if (iZzl != 0) {
                zzlb zzlbVarZzv = zzv();
                String str = zzkwVar.zzb;
                zzg();
                String strZzD = zzlbVarZzv.zzD(str, 24, true);
                String str2 = zzkwVar.zzb;
                zzv().zzN(this.zzF, zzqVar.zza, iZzl, "_ev", strZzD, str2 != null ? str2.length() : 0);
                return;
            }
            int iZzd = zzv().zzd(zzkwVar.zzb, zzkwVar.zza());
            if (iZzd != 0) {
                zzlb zzlbVarZzv2 = zzv();
                String str3 = zzkwVar.zzb;
                zzg();
                String strZzD2 = zzlbVarZzv2.zzD(str3, 24, true);
                Object objZza = zzkwVar.zza();
                if (objZza != null && ((objZza instanceof String) || (objZza instanceof CharSequence))) {
                    length = objZza.toString().length();
                }
                zzv().zzN(this.zzF, zzqVar.zza, iZzd, "_ev", strZzD2, length);
                return;
            }
            Object objZzB = zzv().zzB(zzkwVar.zzb, zzkwVar.zza());
            if (objZzB == null) {
                return;
            }
            if ("_sid".equals(zzkwVar.zzb)) {
                long j = zzkwVar.zzc;
                String str4 = zzkwVar.zzf;
                String str5 = (String) Preconditions.checkNotNull(zzqVar.zza);
                zzam zzamVar = this.zze;
                zzal(zzamVar);
                zzky zzkyVarZzp = zzamVar.zzp(str5, "_sno");
                if (zzkyVarZzp != null) {
                    Object obj = zzkyVarZzp.zze;
                    if (obj instanceof Long) {
                        jLongValue = ((Long) obj).longValue();
                    } else {
                        if (zzkyVarZzp != null) {
                            zzay().zzk().zzb("Retrieved last session number from database does not contain a valid (long) value", zzkyVarZzp.zze);
                        }
                        zzam zzamVar2 = this.zze;
                        zzal(zzamVar2);
                        zzas zzasVarZzn = zzamVar2.zzn(str5, "_s");
                        if (zzasVarZzn != null) {
                            jLongValue = zzasVarZzn.zzc;
                            zzay().zzj().zzb("Backfill the session number. Last used session number", Long.valueOf(jLongValue));
                        } else {
                            jLongValue = 0;
                        }
                    }
                    zzW(new zzkw("_sno", j, Long.valueOf(jLongValue + 1), str4), zzqVar);
                }
            }
            zzky zzkyVar = new zzky((String) Preconditions.checkNotNull(zzqVar.zza), (String) Preconditions.checkNotNull(zzkwVar.zzf), zzkwVar.zzb, zzkwVar.zzc, objZzB);
            zzay().zzj().zzc("Setting user property", this.zzn.zzj().zzf(zzkyVar.zzc), objZzB);
            zzam zzamVar3 = this.zze;
            zzal(zzamVar3);
            zzamVar3.zzw();
            try {
                if ("_id".equals(zzkyVar.zzc)) {
                    zzam zzamVar4 = this.zze;
                    zzal(zzamVar4);
                    zzky zzkyVarZzp2 = zzamVar4.zzp(zzqVar.zza, "_id");
                    if (zzkyVarZzp2 != null && !zzkyVar.zze.equals(zzkyVarZzp2.zze)) {
                        zzam zzamVar5 = this.zze;
                        zzal(zzamVar5);
                        zzamVar5.zzA(zzqVar.zza, "_lair");
                    }
                }
                zzd(zzqVar);
                zzam zzamVar6 = this.zze;
                zzal(zzamVar6);
                boolean zZzL = zzamVar6.zzL(zzkyVar);
                zzam zzamVar7 = this.zze;
                zzal(zzamVar7);
                zzamVar7.zzC();
                if (!zZzL) {
                    zzay().zzd().zzc("Too many unique user properties are set. Ignoring user property", this.zzn.zzj().zzf(zzkyVar.zzc), zzkyVar.zze);
                    zzv().zzN(this.zzF, zzqVar.zza, 9, null, null, 0);
                }
            } finally {
                zzam zzamVar8 = this.zze;
                zzal(zzamVar8);
                zzamVar8.zzx();
            }
        }
    }

    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0584: MOVE (r9 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]) (LINE:1413), block:B:238:0x0584 */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02a8 A[Catch: all -> 0x058b, TryCatch #10 {all -> 0x058b, blocks: (B:3:0x0010, B:11:0x0038, B:15:0x004e, B:20:0x005c, B:24:0x0077, B:28:0x0095, B:34:0x00bd, B:38:0x00e0, B:40:0x00f1, B:66:0x0138, B:70:0x0160, B:74:0x0168, B:137:0x02a2, B:139:0x02a8, B:141:0x02b4, B:142:0x02b8, B:144:0x02be, B:146:0x02d2, B:150:0x02db, B:152:0x02e1, B:158:0x0306, B:155:0x02f6, B:157:0x0300, B:159:0x0309, B:161:0x0324, B:165:0x0333, B:167:0x0357, B:173:0x0369, B:175:0x03a3, B:177:0x03a8, B:179:0x03b0, B:180:0x03b3, B:182:0x03b8, B:183:0x03bb, B:185:0x03c7, B:186:0x03dd, B:187:0x03e5, B:189:0x03f6, B:191:0x0408, B:193:0x042a, B:195:0x0468, B:197:0x047a, B:199:0x048f, B:201:0x049a, B:202:0x04a3, B:198:0x0488, B:204:0x04e7, B:194:0x045f, B:124:0x0273, B:136:0x029f, B:208:0x04fe, B:209:0x0501, B:210:0x0502, B:215:0x0543, B:231:0x056a, B:233:0x0570, B:235:0x057b, B:219:0x054c, B:240:0x0587, B:241:0x058a), top: B:257:0x0010, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0570 A[Catch: all -> 0x058b, TryCatch #10 {all -> 0x058b, blocks: (B:3:0x0010, B:11:0x0038, B:15:0x004e, B:20:0x005c, B:24:0x0077, B:28:0x0095, B:34:0x00bd, B:38:0x00e0, B:40:0x00f1, B:66:0x0138, B:70:0x0160, B:74:0x0168, B:137:0x02a2, B:139:0x02a8, B:141:0x02b4, B:142:0x02b8, B:144:0x02be, B:146:0x02d2, B:150:0x02db, B:152:0x02e1, B:158:0x0306, B:155:0x02f6, B:157:0x0300, B:159:0x0309, B:161:0x0324, B:165:0x0333, B:167:0x0357, B:173:0x0369, B:175:0x03a3, B:177:0x03a8, B:179:0x03b0, B:180:0x03b3, B:182:0x03b8, B:183:0x03bb, B:185:0x03c7, B:186:0x03dd, B:187:0x03e5, B:189:0x03f6, B:191:0x0408, B:193:0x042a, B:195:0x0468, B:197:0x047a, B:199:0x048f, B:201:0x049a, B:202:0x04a3, B:198:0x0488, B:204:0x04e7, B:194:0x045f, B:124:0x0273, B:136:0x029f, B:208:0x04fe, B:209:0x0501, B:210:0x0502, B:215:0x0543, B:231:0x056a, B:233:0x0570, B:235:0x057b, B:219:0x054c, B:240:0x0587, B:241:0x058a), top: B:257:0x0010, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0134 A[Catch: all -> 0x0034, TryCatch #15 {all -> 0x0034, blocks: (B:5:0x0021, B:13:0x003e, B:18:0x0056, B:22:0x0067, B:26:0x0082, B:31:0x00b4, B:37:0x00c9, B:43:0x00f7, B:47:0x010c, B:60:0x012d, B:64:0x0134, B:65:0x0137, B:80:0x01a2), top: B:262:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019e A[Catch: SQLiteException -> 0x027a, all -> 0x04fa, TRY_LEAVE, TryCatch #2 {SQLiteException -> 0x027a, blocks: (B:77:0x0198, B:79:0x019e, B:82:0x01a9, B:83:0x01af, B:84:0x01b3, B:85:0x01be), top: B:250:0x0198 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a9 A[Catch: SQLiteException -> 0x027a, all -> 0x04fa, TRY_ENTER, TryCatch #2 {SQLiteException -> 0x027a, blocks: (B:77:0x0198, B:79:0x019e, B:82:0x01a9, B:83:0x01af, B:84:0x01b3, B:85:0x01be), top: B:250:0x0198 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzX() {
        boolean z;
        Boolean boolZzj;
        Cursor cursor;
        Cursor cursor2;
        zzam zzamVar;
        long jZzz;
        Cursor cursorRawQuery;
        String string;
        zzam zzamVar2;
        Cursor cursor3;
        long j;
        Cursor cursorQuery;
        List listEmptyList;
        String strZzm;
        String string2;
        String strZzJ;
        byte[] byteArray;
        Cursor cursorRawQuery2;
        zzaz().zzg();
        zzB();
        int i = 1;
        this.zzv = true;
        int i2 = 0;
        try {
            this.zzn.zzaw();
            boolZzj = this.zzn.zzt().zzj();
        } catch (Throwable th) {
            th = th;
            z = false;
            this.zzv = z;
            zzae();
            throw th;
        }
        try {
            if (boolZzj == null) {
                zzay().zzk().zza("Upload data called on the client side before use of service was decided");
                this.zzv = false;
            } else if (boolZzj.booleanValue()) {
                zzay().zzd().zza("Upload called in the client side when service should be used");
                this.zzv = false;
            } else if (this.zza > 0) {
                zzag();
                this.zzv = false;
            } else {
                zzaz().zzg();
                if (this.zzy != null) {
                    zzay().zzj().zza("Uploading requested multiple times");
                    this.zzv = false;
                } else {
                    zzen zzenVar = this.zzd;
                    zzal(zzenVar);
                    if (zzenVar.zza()) {
                        long jCurrentTimeMillis = zzav().currentTimeMillis();
                        Cursor cursor4 = null;
                        int iZze = zzg().zze(null, zzdu.zzP);
                        zzg();
                        long jZzz2 = jCurrentTimeMillis - zzag.zzz();
                        for (int i3 = 0; i3 < iZze && zzah(null, jZzz2); i3++) {
                        }
                        long jZza = this.zzk.zzc.zza();
                        if (jZza != 0) {
                            zzay().zzc().zzb("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(jCurrentTimeMillis - jZza)));
                        }
                        zzam zzamVar3 = this.zze;
                        zzal(zzamVar3);
                        String strZzr = zzamVar3.zzr();
                        long j2 = -1;
                        if (TextUtils.isEmpty(strZzr)) {
                            try {
                                this.zzA = -1L;
                                zzamVar = this.zze;
                                zzal(zzamVar);
                                zzg();
                                jZzz = jCurrentTimeMillis - zzag.zzz();
                                zzamVar.zzg();
                                zzamVar.zzW();
                            } catch (Throwable th2) {
                                th = th2;
                                cursor2 = cursor;
                            }
                            try {
                                cursorRawQuery = zzamVar.zzh().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(jZzz)});
                                try {
                                } catch (SQLiteException e) {
                                    e = e;
                                    zzamVar.zzt.zzay().zzd().zzb("Error selecting expired configs", e);
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                    string = null;
                                    if (!TextUtils.isEmpty(string)) {
                                    }
                                    this.zzv = false;
                                    zzae();
                                }
                            } catch (SQLiteException e2) {
                                e = e2;
                                cursorRawQuery = null;
                            } catch (Throwable th3) {
                                th = th3;
                                cursor2 = null;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                throw th;
                            }
                            if (cursorRawQuery.moveToFirst()) {
                                string = cursorRawQuery.getString(0);
                                cursorRawQuery.close();
                                if (!TextUtils.isEmpty(string)) {
                                }
                            } else {
                                zzamVar.zzt.zzay().zzj().zza("No expired configs for apps with pending events");
                                cursorRawQuery.close();
                                string = null;
                                if (!TextUtils.isEmpty(string)) {
                                    zzam zzamVar4 = this.zze;
                                    zzal(zzamVar4);
                                    zzh zzhVarZzj = zzamVar4.zzj(string);
                                    if (zzhVarZzj != null) {
                                        zzD(zzhVarZzj);
                                    }
                                }
                            }
                        } else {
                            if (this.zzA == -1) {
                                zzam zzamVar5 = this.zze;
                                zzal(zzamVar5);
                                try {
                                    cursorRawQuery2 = zzamVar5.zzh().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                                    try {
                                        try {
                                            if (cursorRawQuery2.moveToFirst()) {
                                                j2 = cursorRawQuery2.getLong(0);
                                            }
                                        } catch (SQLiteException e3) {
                                            e = e3;
                                            zzamVar5.zzt.zzay().zzd().zzb("Error querying raw events", e);
                                            if (cursorRawQuery2 != null) {
                                                cursorRawQuery2.close();
                                            }
                                            this.zzA = j2;
                                            int iZze2 = zzg().zze(strZzr, zzdu.zzf);
                                            int iMax = Math.max(0, zzg().zze(strZzr, zzdu.zzg));
                                            zzamVar2 = this.zze;
                                            zzal(zzamVar2);
                                            zzamVar2.zzg();
                                            zzamVar2.zzW();
                                            Preconditions.checkArgument(iZze2 <= 0);
                                            Preconditions.checkArgument(iMax <= 0);
                                            Preconditions.checkNotEmpty(strZzr);
                                            cursorQuery = zzamVar2.zzh().query("queue", new String[]{"rowid", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "retry_count"}, "app_id=?", new String[]{strZzr}, null, null, "rowid", String.valueOf(iZze2));
                                            try {
                                                try {
                                                    if (cursorQuery.moveToFirst()) {
                                                    }
                                                } catch (SQLiteException e4) {
                                                    e = e4;
                                                    j = jCurrentTimeMillis;
                                                }
                                                if (!listEmptyList.isEmpty()) {
                                                }
                                                this.zzv = false;
                                                zzae();
                                            } catch (Throwable th4) {
                                                th = th4;
                                                cursor3 = cursorQuery;
                                                if (cursor3 != null) {
                                                    cursor3.close();
                                                }
                                                throw th;
                                            }
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        cursor4 = cursorRawQuery2;
                                        if (cursor4 != null) {
                                            cursor4.close();
                                        }
                                        throw th;
                                    }
                                } catch (SQLiteException e5) {
                                    e = e5;
                                    cursorRawQuery2 = null;
                                } catch (Throwable th6) {
                                    th = th6;
                                    if (cursor4 != null) {
                                    }
                                    throw th;
                                }
                                cursorRawQuery2.close();
                                this.zzA = j2;
                            }
                            int iZze22 = zzg().zze(strZzr, zzdu.zzf);
                            int iMax2 = Math.max(0, zzg().zze(strZzr, zzdu.zzg));
                            zzamVar2 = this.zze;
                            zzal(zzamVar2);
                            zzamVar2.zzg();
                            zzamVar2.zzW();
                            Preconditions.checkArgument(iZze22 <= 0);
                            Preconditions.checkArgument(iMax2 <= 0);
                            Preconditions.checkNotEmpty(strZzr);
                            try {
                                cursorQuery = zzamVar2.zzh().query("queue", new String[]{"rowid", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "retry_count"}, "app_id=?", new String[]{strZzr}, null, null, "rowid", String.valueOf(iZze22));
                                if (cursorQuery.moveToFirst()) {
                                    listEmptyList = Collections.emptyList();
                                    cursorQuery.close();
                                    j = jCurrentTimeMillis;
                                } else {
                                    ArrayList arrayList = new ArrayList();
                                    int length = 0;
                                    while (true) {
                                        long j3 = cursorQuery.getLong(i2);
                                        try {
                                            byte[] blob = cursorQuery.getBlob(i);
                                            zzkv zzkvVar = zzamVar2.zzf.zzi;
                                            zzal(zzkvVar);
                                            try {
                                                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(blob);
                                                GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                                byte[] bArr = new byte[1024];
                                                j = jCurrentTimeMillis;
                                                while (true) {
                                                    try {
                                                        try {
                                                            int i4 = gZIPInputStream.read(bArr);
                                                            if (i4 <= 0) {
                                                                break;
                                                            } else {
                                                                byteArrayOutputStream.write(bArr, 0, i4);
                                                            }
                                                        } catch (SQLiteException e6) {
                                                            e = e6;
                                                            zzamVar2.zzt.zzay().zzd().zzc("Error querying bundles. appId", zzeh.zzn(strZzr), e);
                                                            listEmptyList = Collections.emptyList();
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            if (!listEmptyList.isEmpty()) {
                                                            }
                                                            this.zzv = false;
                                                            zzae();
                                                        }
                                                    } catch (IOException e7) {
                                                        e = e7;
                                                        try {
                                                            zzkvVar.zzt.zzay().zzd().zzb("Failed to ungzip content", e);
                                                            throw e;
                                                        } catch (IOException e8) {
                                                            e = e8;
                                                            zzamVar2.zzt.zzay().zzd().zzc("Failed to unzip queued bundle. appId", zzeh.zzn(strZzr), e);
                                                            if (cursorQuery.moveToNext()) {
                                                                break;
                                                            } else {
                                                                break;
                                                            }
                                                            cursorQuery.close();
                                                            listEmptyList = arrayList;
                                                            if (!listEmptyList.isEmpty()) {
                                                            }
                                                            this.zzv = false;
                                                            zzae();
                                                        }
                                                    }
                                                }
                                                gZIPInputStream.close();
                                                byteArrayInputStream.close();
                                                byteArray = byteArrayOutputStream.toByteArray();
                                            } catch (IOException e9) {
                                                e = e9;
                                                j = jCurrentTimeMillis;
                                            }
                                        } catch (IOException e10) {
                                            e = e10;
                                            j = jCurrentTimeMillis;
                                        }
                                        if (!arrayList.isEmpty() && byteArray.length + length > iMax2) {
                                            break;
                                        }
                                        try {
                                            com.google.android.gms.internal.measurement.zzgc zzgcVar = (com.google.android.gms.internal.measurement.zzgc) zzkv.zzl(com.google.android.gms.internal.measurement.zzgd.zzt(), byteArray);
                                            if (!cursorQuery.isNull(2)) {
                                                zzgcVar.zzaf(cursorQuery.getInt(2));
                                            }
                                            length += byteArray.length;
                                            arrayList.add(Pair.create((com.google.android.gms.internal.measurement.zzgd) zzgcVar.zzaC(), Long.valueOf(j3)));
                                        } catch (IOException e11) {
                                            zzamVar2.zzt.zzay().zzd().zzc("Failed to merge queued bundle. appId", zzeh.zzn(strZzr), e11);
                                        }
                                        if (cursorQuery.moveToNext() || length > iMax2) {
                                            break;
                                            break;
                                        } else {
                                            jCurrentTimeMillis = j;
                                            i = 1;
                                            i2 = 0;
                                        }
                                    }
                                    cursorQuery.close();
                                    listEmptyList = arrayList;
                                }
                            } catch (SQLiteException e12) {
                                e = e12;
                                j = jCurrentTimeMillis;
                                cursorQuery = null;
                            } catch (Throwable th7) {
                                th = th7;
                                cursor3 = null;
                            }
                            if (!listEmptyList.isEmpty()) {
                                if (zzh(strZzr).zzi(zzah.AD_STORAGE)) {
                                    Iterator it = listEmptyList.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            strZzJ = null;
                                            break;
                                        }
                                        com.google.android.gms.internal.measurement.zzgd zzgdVar = (com.google.android.gms.internal.measurement.zzgd) ((Pair) it.next()).first;
                                        if (!zzgdVar.zzJ().isEmpty()) {
                                            strZzJ = zzgdVar.zzJ();
                                            break;
                                        }
                                    }
                                    if (strZzJ != null) {
                                        int i5 = 0;
                                        while (true) {
                                            if (i5 >= listEmptyList.size()) {
                                                break;
                                            }
                                            com.google.android.gms.internal.measurement.zzgd zzgdVar2 = (com.google.android.gms.internal.measurement.zzgd) ((Pair) listEmptyList.get(i5)).first;
                                            if (!zzgdVar2.zzJ().isEmpty() && !zzgdVar2.zzJ().equals(strZzJ)) {
                                                listEmptyList = listEmptyList.subList(0, i5);
                                                break;
                                            }
                                            i5++;
                                        }
                                    }
                                }
                                com.google.android.gms.internal.measurement.zzga zzgaVarZza = com.google.android.gms.internal.measurement.zzgb.zza();
                                int size = listEmptyList.size();
                                ArrayList arrayList2 = new ArrayList(listEmptyList.size());
                                boolean z2 = zzg().zzt(strZzr) && zzh(strZzr).zzi(zzah.AD_STORAGE);
                                boolean zZzi = zzh(strZzr).zzi(zzah.AD_STORAGE);
                                boolean zZzi2 = zzh(strZzr).zzi(zzah.ANALYTICS_STORAGE);
                                zzpd.zzc();
                                boolean z3 = zzg().zzs(null, zzdu.zzal) && zzg().zzs(strZzr, zzdu.zzan);
                                int i6 = 0;
                                while (i6 < size) {
                                    com.google.android.gms.internal.measurement.zzgc zzgcVar2 = (com.google.android.gms.internal.measurement.zzgc) ((com.google.android.gms.internal.measurement.zzgd) ((Pair) listEmptyList.get(i6)).first).zzby();
                                    arrayList2.add((Long) ((Pair) listEmptyList.get(i6)).second);
                                    zzg().zzh();
                                    zzgcVar2.zzal(74029L);
                                    long j4 = j;
                                    zzgcVar2.zzak(j4);
                                    this.zzn.zzaw();
                                    zzgcVar2.zzag(false);
                                    if (!z2) {
                                        zzgcVar2.zzq();
                                    }
                                    if (!zZzi) {
                                        zzgcVar2.zzx();
                                        zzgcVar2.zzt();
                                    }
                                    if (!zZzi2) {
                                        zzgcVar2.zzn();
                                    }
                                    zzC(strZzr, zzgcVar2);
                                    if (!z3) {
                                        zzgcVar2.zzy();
                                    }
                                    if (zzg().zzs(strZzr, zzdu.zzT)) {
                                        byte[] bArrZzbu = ((com.google.android.gms.internal.measurement.zzgd) zzgcVar2.zzaC()).zzbu();
                                        zzkv zzkvVar2 = this.zzi;
                                        zzal(zzkvVar2);
                                        zzgcVar2.zzJ(zzkvVar2.zzd(bArrZzbu));
                                    }
                                    zzgaVarZza.zza(zzgcVar2);
                                    i6++;
                                    j = j4;
                                }
                                long j5 = j;
                                if (Log.isLoggable(zzay().zzq(), 2)) {
                                    zzkv zzkvVar3 = this.zzi;
                                    zzal(zzkvVar3);
                                    strZzm = zzkvVar3.zzm((com.google.android.gms.internal.measurement.zzgb) zzgaVarZza.zzaC());
                                } else {
                                    strZzm = null;
                                }
                                zzal(this.zzi);
                                byte[] bArrZzbu2 = ((com.google.android.gms.internal.measurement.zzgb) zzgaVarZza.zzaC()).zzbu();
                                zzfi zzfiVar = this.zzl.zzf.zzc;
                                zzal(zzfiVar);
                                String strZzi = zzfiVar.zzi(strZzr);
                                if (TextUtils.isEmpty(strZzi)) {
                                    string2 = (String) zzdu.zzp.zza(null);
                                } else {
                                    Uri uri = Uri.parse((String) zzdu.zzp.zza(null));
                                    Uri.Builder builderBuildUpon = uri.buildUpon();
                                    builderBuildUpon.authority(strZzi + "." + uri.getAuthority());
                                    string2 = builderBuildUpon.build().toString();
                                }
                                try {
                                    URL url = new URL(string2);
                                    Preconditions.checkArgument(!arrayList2.isEmpty());
                                    if (this.zzy != null) {
                                        zzay().zzd().zza("Set uploading progress before finishing the previous upload");
                                    } else {
                                        this.zzy = new ArrayList(arrayList2);
                                    }
                                    this.zzk.zzd.zzb(j5);
                                    zzay().zzj().zzd("Uploading data. app, uncompressed size, data", size > 0 ? zzgaVarZza.zzb(0).zzx() : "?", Integer.valueOf(bArrZzbu2.length), strZzm);
                                    this.zzu = true;
                                    zzen zzenVar2 = this.zzd;
                                    zzal(zzenVar2);
                                    zzkk zzkkVar = new zzkk(this, strZzr);
                                    zzenVar2.zzg();
                                    zzenVar2.zzW();
                                    Preconditions.checkNotNull(url);
                                    Preconditions.checkNotNull(bArrZzbu2);
                                    Preconditions.checkNotNull(zzkkVar);
                                    zzenVar2.zzt.zzaz().zzo(new zzem(zzenVar2, strZzr, url, bArrZzbu2, null, zzkkVar));
                                } catch (MalformedURLException unused) {
                                    zzay().zzd().zzc("Failed to parse upload URL. Not uploading. appId", zzeh.zzn(strZzr), string2);
                                }
                            }
                        }
                        this.zzv = false;
                    } else {
                        zzay().zzj().zza("Network not connected, ignoring upload request");
                        zzag();
                        this.zzv = false;
                    }
                }
            }
            zzae();
        } catch (Throwable th8) {
            th = th8;
            z = false;
            this.zzv = z;
            zzae();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0350 A[Catch: all -> 0x0a4d, TryCatch #8 {all -> 0x0a4d, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:90:0x02dd, B:99:0x0313, B:101:0x0350, B:103:0x0355, B:104:0x036c, B:108:0x037f, B:110:0x0398, B:112:0x039d, B:113:0x03b4, B:119:0x03e1, B:123:0x0402, B:124:0x0419, B:128:0x042b, B:131:0x044a, B:132:0x045e, B:134:0x0468, B:136:0x0475, B:138:0x047b, B:139:0x0484, B:140:0x0492, B:142:0x04b6, B:152:0x04da, B:153:0x04ef, B:155:0x0518, B:158:0x0530, B:161:0x0573, B:163:0x059f, B:165:0x05dc, B:166:0x05e1, B:168:0x05e9, B:169:0x05ee, B:171:0x05f6, B:172:0x05fb, B:174:0x060b, B:176:0x0619, B:178:0x0621, B:179:0x0626, B:181:0x062f, B:182:0x0633, B:184:0x0640, B:185:0x0645, B:187:0x066c, B:189:0x0674, B:190:0x0679, B:192:0x0681, B:193:0x0684, B:195:0x069c, B:198:0x06a4, B:199:0x06be, B:201:0x06c4, B:203:0x06d8, B:205:0x06e4, B:207:0x06f1, B:211:0x070b, B:212:0x071b, B:216:0x0724, B:217:0x0727, B:219:0x0745, B:221:0x0749, B:223:0x075b, B:225:0x075f, B:227:0x076a, B:228:0x0773, B:230:0x07b2, B:232:0x07bc, B:233:0x07bf, B:235:0x07cc, B:237:0x07ec, B:238:0x07f9, B:239:0x082f, B:241:0x0837, B:243:0x0841, B:244:0x084e, B:246:0x0858, B:247:0x0865, B:248:0x0871, B:250:0x0877, B:252:0x08a7, B:253:0x08ed, B:254:0x08f8, B:255:0x0904, B:257:0x090a, B:266:0x0957, B:267:0x09a5, B:269:0x09b6, B:283:0x0a1a, B:272:0x09ce, B:274:0x09d2, B:260:0x0917, B:262:0x0941, B:278:0x09eb, B:279:0x0a02, B:282:0x0a05, B:162:0x0591, B:149:0x04c2, B:93:0x02f3, B:94:0x02fa, B:96:0x0300, B:98:0x030c, B:43:0x015f, B:46:0x016b, B:48:0x0182, B:53:0x019b, B:60:0x01d9, B:62:0x01df, B:64:0x01ed, B:66:0x01fe, B:69:0x0205, B:87:0x02a2, B:89:0x02ad, B:71:0x022d, B:72:0x024c, B:74:0x0251, B:76:0x0255, B:86:0x0286, B:85:0x0273, B:56:0x01a9, B:59:0x01cf), top: B:307:0x0124, inners: #2, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04da A[Catch: all -> 0x0a4d, TryCatch #8 {all -> 0x0a4d, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:90:0x02dd, B:99:0x0313, B:101:0x0350, B:103:0x0355, B:104:0x036c, B:108:0x037f, B:110:0x0398, B:112:0x039d, B:113:0x03b4, B:119:0x03e1, B:123:0x0402, B:124:0x0419, B:128:0x042b, B:131:0x044a, B:132:0x045e, B:134:0x0468, B:136:0x0475, B:138:0x047b, B:139:0x0484, B:140:0x0492, B:142:0x04b6, B:152:0x04da, B:153:0x04ef, B:155:0x0518, B:158:0x0530, B:161:0x0573, B:163:0x059f, B:165:0x05dc, B:166:0x05e1, B:168:0x05e9, B:169:0x05ee, B:171:0x05f6, B:172:0x05fb, B:174:0x060b, B:176:0x0619, B:178:0x0621, B:179:0x0626, B:181:0x062f, B:182:0x0633, B:184:0x0640, B:185:0x0645, B:187:0x066c, B:189:0x0674, B:190:0x0679, B:192:0x0681, B:193:0x0684, B:195:0x069c, B:198:0x06a4, B:199:0x06be, B:201:0x06c4, B:203:0x06d8, B:205:0x06e4, B:207:0x06f1, B:211:0x070b, B:212:0x071b, B:216:0x0724, B:217:0x0727, B:219:0x0745, B:221:0x0749, B:223:0x075b, B:225:0x075f, B:227:0x076a, B:228:0x0773, B:230:0x07b2, B:232:0x07bc, B:233:0x07bf, B:235:0x07cc, B:237:0x07ec, B:238:0x07f9, B:239:0x082f, B:241:0x0837, B:243:0x0841, B:244:0x084e, B:246:0x0858, B:247:0x0865, B:248:0x0871, B:250:0x0877, B:252:0x08a7, B:253:0x08ed, B:254:0x08f8, B:255:0x0904, B:257:0x090a, B:266:0x0957, B:267:0x09a5, B:269:0x09b6, B:283:0x0a1a, B:272:0x09ce, B:274:0x09d2, B:260:0x0917, B:262:0x0941, B:278:0x09eb, B:279:0x0a02, B:282:0x0a05, B:162:0x0591, B:149:0x04c2, B:93:0x02f3, B:94:0x02fa, B:96:0x0300, B:98:0x030c, B:43:0x015f, B:46:0x016b, B:48:0x0182, B:53:0x019b, B:60:0x01d9, B:62:0x01df, B:64:0x01ed, B:66:0x01fe, B:69:0x0205, B:87:0x02a2, B:89:0x02ad, B:71:0x022d, B:72:0x024c, B:74:0x0251, B:76:0x0255, B:86:0x0286, B:85:0x0273, B:56:0x01a9, B:59:0x01cf), top: B:307:0x0124, inners: #2, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0518 A[Catch: all -> 0x0a4d, TryCatch #8 {all -> 0x0a4d, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:90:0x02dd, B:99:0x0313, B:101:0x0350, B:103:0x0355, B:104:0x036c, B:108:0x037f, B:110:0x0398, B:112:0x039d, B:113:0x03b4, B:119:0x03e1, B:123:0x0402, B:124:0x0419, B:128:0x042b, B:131:0x044a, B:132:0x045e, B:134:0x0468, B:136:0x0475, B:138:0x047b, B:139:0x0484, B:140:0x0492, B:142:0x04b6, B:152:0x04da, B:153:0x04ef, B:155:0x0518, B:158:0x0530, B:161:0x0573, B:163:0x059f, B:165:0x05dc, B:166:0x05e1, B:168:0x05e9, B:169:0x05ee, B:171:0x05f6, B:172:0x05fb, B:174:0x060b, B:176:0x0619, B:178:0x0621, B:179:0x0626, B:181:0x062f, B:182:0x0633, B:184:0x0640, B:185:0x0645, B:187:0x066c, B:189:0x0674, B:190:0x0679, B:192:0x0681, B:193:0x0684, B:195:0x069c, B:198:0x06a4, B:199:0x06be, B:201:0x06c4, B:203:0x06d8, B:205:0x06e4, B:207:0x06f1, B:211:0x070b, B:212:0x071b, B:216:0x0724, B:217:0x0727, B:219:0x0745, B:221:0x0749, B:223:0x075b, B:225:0x075f, B:227:0x076a, B:228:0x0773, B:230:0x07b2, B:232:0x07bc, B:233:0x07bf, B:235:0x07cc, B:237:0x07ec, B:238:0x07f9, B:239:0x082f, B:241:0x0837, B:243:0x0841, B:244:0x084e, B:246:0x0858, B:247:0x0865, B:248:0x0871, B:250:0x0877, B:252:0x08a7, B:253:0x08ed, B:254:0x08f8, B:255:0x0904, B:257:0x090a, B:266:0x0957, B:267:0x09a5, B:269:0x09b6, B:283:0x0a1a, B:272:0x09ce, B:274:0x09d2, B:260:0x0917, B:262:0x0941, B:278:0x09eb, B:279:0x0a02, B:282:0x0a05, B:162:0x0591, B:149:0x04c2, B:93:0x02f3, B:94:0x02fa, B:96:0x0300, B:98:0x030c, B:43:0x015f, B:46:0x016b, B:48:0x0182, B:53:0x019b, B:60:0x01d9, B:62:0x01df, B:64:0x01ed, B:66:0x01fe, B:69:0x0205, B:87:0x02a2, B:89:0x02ad, B:71:0x022d, B:72:0x024c, B:74:0x0251, B:76:0x0255, B:86:0x0286, B:85:0x0273, B:56:0x01a9, B:59:0x01cf), top: B:307:0x0124, inners: #2, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0591 A[Catch: all -> 0x0a4d, TryCatch #8 {all -> 0x0a4d, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:90:0x02dd, B:99:0x0313, B:101:0x0350, B:103:0x0355, B:104:0x036c, B:108:0x037f, B:110:0x0398, B:112:0x039d, B:113:0x03b4, B:119:0x03e1, B:123:0x0402, B:124:0x0419, B:128:0x042b, B:131:0x044a, B:132:0x045e, B:134:0x0468, B:136:0x0475, B:138:0x047b, B:139:0x0484, B:140:0x0492, B:142:0x04b6, B:152:0x04da, B:153:0x04ef, B:155:0x0518, B:158:0x0530, B:161:0x0573, B:163:0x059f, B:165:0x05dc, B:166:0x05e1, B:168:0x05e9, B:169:0x05ee, B:171:0x05f6, B:172:0x05fb, B:174:0x060b, B:176:0x0619, B:178:0x0621, B:179:0x0626, B:181:0x062f, B:182:0x0633, B:184:0x0640, B:185:0x0645, B:187:0x066c, B:189:0x0674, B:190:0x0679, B:192:0x0681, B:193:0x0684, B:195:0x069c, B:198:0x06a4, B:199:0x06be, B:201:0x06c4, B:203:0x06d8, B:205:0x06e4, B:207:0x06f1, B:211:0x070b, B:212:0x071b, B:216:0x0724, B:217:0x0727, B:219:0x0745, B:221:0x0749, B:223:0x075b, B:225:0x075f, B:227:0x076a, B:228:0x0773, B:230:0x07b2, B:232:0x07bc, B:233:0x07bf, B:235:0x07cc, B:237:0x07ec, B:238:0x07f9, B:239:0x082f, B:241:0x0837, B:243:0x0841, B:244:0x084e, B:246:0x0858, B:247:0x0865, B:248:0x0871, B:250:0x0877, B:252:0x08a7, B:253:0x08ed, B:254:0x08f8, B:255:0x0904, B:257:0x090a, B:266:0x0957, B:267:0x09a5, B:269:0x09b6, B:283:0x0a1a, B:272:0x09ce, B:274:0x09d2, B:260:0x0917, B:262:0x0941, B:278:0x09eb, B:279:0x0a02, B:282:0x0a05, B:162:0x0591, B:149:0x04c2, B:93:0x02f3, B:94:0x02fa, B:96:0x0300, B:98:0x030c, B:43:0x015f, B:46:0x016b, B:48:0x0182, B:53:0x019b, B:60:0x01d9, B:62:0x01df, B:64:0x01ed, B:66:0x01fe, B:69:0x0205, B:87:0x02a2, B:89:0x02ad, B:71:0x022d, B:72:0x024c, B:74:0x0251, B:76:0x0255, B:86:0x0286, B:85:0x0273, B:56:0x01a9, B:59:0x01cf), top: B:307:0x0124, inners: #2, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x05dc A[Catch: all -> 0x0a4d, TryCatch #8 {all -> 0x0a4d, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:90:0x02dd, B:99:0x0313, B:101:0x0350, B:103:0x0355, B:104:0x036c, B:108:0x037f, B:110:0x0398, B:112:0x039d, B:113:0x03b4, B:119:0x03e1, B:123:0x0402, B:124:0x0419, B:128:0x042b, B:131:0x044a, B:132:0x045e, B:134:0x0468, B:136:0x0475, B:138:0x047b, B:139:0x0484, B:140:0x0492, B:142:0x04b6, B:152:0x04da, B:153:0x04ef, B:155:0x0518, B:158:0x0530, B:161:0x0573, B:163:0x059f, B:165:0x05dc, B:166:0x05e1, B:168:0x05e9, B:169:0x05ee, B:171:0x05f6, B:172:0x05fb, B:174:0x060b, B:176:0x0619, B:178:0x0621, B:179:0x0626, B:181:0x062f, B:182:0x0633, B:184:0x0640, B:185:0x0645, B:187:0x066c, B:189:0x0674, B:190:0x0679, B:192:0x0681, B:193:0x0684, B:195:0x069c, B:198:0x06a4, B:199:0x06be, B:201:0x06c4, B:203:0x06d8, B:205:0x06e4, B:207:0x06f1, B:211:0x070b, B:212:0x071b, B:216:0x0724, B:217:0x0727, B:219:0x0745, B:221:0x0749, B:223:0x075b, B:225:0x075f, B:227:0x076a, B:228:0x0773, B:230:0x07b2, B:232:0x07bc, B:233:0x07bf, B:235:0x07cc, B:237:0x07ec, B:238:0x07f9, B:239:0x082f, B:241:0x0837, B:243:0x0841, B:244:0x084e, B:246:0x0858, B:247:0x0865, B:248:0x0871, B:250:0x0877, B:252:0x08a7, B:253:0x08ed, B:254:0x08f8, B:255:0x0904, B:257:0x090a, B:266:0x0957, B:267:0x09a5, B:269:0x09b6, B:283:0x0a1a, B:272:0x09ce, B:274:0x09d2, B:260:0x0917, B:262:0x0941, B:278:0x09eb, B:279:0x0a02, B:282:0x0a05, B:162:0x0591, B:149:0x04c2, B:93:0x02f3, B:94:0x02fa, B:96:0x0300, B:98:0x030c, B:43:0x015f, B:46:0x016b, B:48:0x0182, B:53:0x019b, B:60:0x01d9, B:62:0x01df, B:64:0x01ed, B:66:0x01fe, B:69:0x0205, B:87:0x02a2, B:89:0x02ad, B:71:0x022d, B:72:0x024c, B:74:0x0251, B:76:0x0255, B:86:0x0286, B:85:0x0273, B:56:0x01a9, B:59:0x01cf), top: B:307:0x0124, inners: #2, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x05e9 A[Catch: all -> 0x0a4d, TryCatch #8 {all -> 0x0a4d, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:90:0x02dd, B:99:0x0313, B:101:0x0350, B:103:0x0355, B:104:0x036c, B:108:0x037f, B:110:0x0398, B:112:0x039d, B:113:0x03b4, B:119:0x03e1, B:123:0x0402, B:124:0x0419, B:128:0x042b, B:131:0x044a, B:132:0x045e, B:134:0x0468, B:136:0x0475, B:138:0x047b, B:139:0x0484, B:140:0x0492, B:142:0x04b6, B:152:0x04da, B:153:0x04ef, B:155:0x0518, B:158:0x0530, B:161:0x0573, B:163:0x059f, B:165:0x05dc, B:166:0x05e1, B:168:0x05e9, B:169:0x05ee, B:171:0x05f6, B:172:0x05fb, B:174:0x060b, B:176:0x0619, B:178:0x0621, B:179:0x0626, B:181:0x062f, B:182:0x0633, B:184:0x0640, B:185:0x0645, B:187:0x066c, B:189:0x0674, B:190:0x0679, B:192:0x0681, B:193:0x0684, B:195:0x069c, B:198:0x06a4, B:199:0x06be, B:201:0x06c4, B:203:0x06d8, B:205:0x06e4, B:207:0x06f1, B:211:0x070b, B:212:0x071b, B:216:0x0724, B:217:0x0727, B:219:0x0745, B:221:0x0749, B:223:0x075b, B:225:0x075f, B:227:0x076a, B:228:0x0773, B:230:0x07b2, B:232:0x07bc, B:233:0x07bf, B:235:0x07cc, B:237:0x07ec, B:238:0x07f9, B:239:0x082f, B:241:0x0837, B:243:0x0841, B:244:0x084e, B:246:0x0858, B:247:0x0865, B:248:0x0871, B:250:0x0877, B:252:0x08a7, B:253:0x08ed, B:254:0x08f8, B:255:0x0904, B:257:0x090a, B:266:0x0957, B:267:0x09a5, B:269:0x09b6, B:283:0x0a1a, B:272:0x09ce, B:274:0x09d2, B:260:0x0917, B:262:0x0941, B:278:0x09eb, B:279:0x0a02, B:282:0x0a05, B:162:0x0591, B:149:0x04c2, B:93:0x02f3, B:94:0x02fa, B:96:0x0300, B:98:0x030c, B:43:0x015f, B:46:0x016b, B:48:0x0182, B:53:0x019b, B:60:0x01d9, B:62:0x01df, B:64:0x01ed, B:66:0x01fe, B:69:0x0205, B:87:0x02a2, B:89:0x02ad, B:71:0x022d, B:72:0x024c, B:74:0x0251, B:76:0x0255, B:86:0x0286, B:85:0x0273, B:56:0x01a9, B:59:0x01cf), top: B:307:0x0124, inners: #2, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x05f6 A[Catch: all -> 0x0a4d, TryCatch #8 {all -> 0x0a4d, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:90:0x02dd, B:99:0x0313, B:101:0x0350, B:103:0x0355, B:104:0x036c, B:108:0x037f, B:110:0x0398, B:112:0x039d, B:113:0x03b4, B:119:0x03e1, B:123:0x0402, B:124:0x0419, B:128:0x042b, B:131:0x044a, B:132:0x045e, B:134:0x0468, B:136:0x0475, B:138:0x047b, B:139:0x0484, B:140:0x0492, B:142:0x04b6, B:152:0x04da, B:153:0x04ef, B:155:0x0518, B:158:0x0530, B:161:0x0573, B:163:0x059f, B:165:0x05dc, B:166:0x05e1, B:168:0x05e9, B:169:0x05ee, B:171:0x05f6, B:172:0x05fb, B:174:0x060b, B:176:0x0619, B:178:0x0621, B:179:0x0626, B:181:0x062f, B:182:0x0633, B:184:0x0640, B:185:0x0645, B:187:0x066c, B:189:0x0674, B:190:0x0679, B:192:0x0681, B:193:0x0684, B:195:0x069c, B:198:0x06a4, B:199:0x06be, B:201:0x06c4, B:203:0x06d8, B:205:0x06e4, B:207:0x06f1, B:211:0x070b, B:212:0x071b, B:216:0x0724, B:217:0x0727, B:219:0x0745, B:221:0x0749, B:223:0x075b, B:225:0x075f, B:227:0x076a, B:228:0x0773, B:230:0x07b2, B:232:0x07bc, B:233:0x07bf, B:235:0x07cc, B:237:0x07ec, B:238:0x07f9, B:239:0x082f, B:241:0x0837, B:243:0x0841, B:244:0x084e, B:246:0x0858, B:247:0x0865, B:248:0x0871, B:250:0x0877, B:252:0x08a7, B:253:0x08ed, B:254:0x08f8, B:255:0x0904, B:257:0x090a, B:266:0x0957, B:267:0x09a5, B:269:0x09b6, B:283:0x0a1a, B:272:0x09ce, B:274:0x09d2, B:260:0x0917, B:262:0x0941, B:278:0x09eb, B:279:0x0a02, B:282:0x0a05, B:162:0x0591, B:149:0x04c2, B:93:0x02f3, B:94:0x02fa, B:96:0x0300, B:98:0x030c, B:43:0x015f, B:46:0x016b, B:48:0x0182, B:53:0x019b, B:60:0x01d9, B:62:0x01df, B:64:0x01ed, B:66:0x01fe, B:69:0x0205, B:87:0x02a2, B:89:0x02ad, B:71:0x022d, B:72:0x024c, B:74:0x0251, B:76:0x0255, B:86:0x0286, B:85:0x0273, B:56:0x01a9, B:59:0x01cf), top: B:307:0x0124, inners: #2, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x062f A[Catch: all -> 0x0a4d, TryCatch #8 {all -> 0x0a4d, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:90:0x02dd, B:99:0x0313, B:101:0x0350, B:103:0x0355, B:104:0x036c, B:108:0x037f, B:110:0x0398, B:112:0x039d, B:113:0x03b4, B:119:0x03e1, B:123:0x0402, B:124:0x0419, B:128:0x042b, B:131:0x044a, B:132:0x045e, B:134:0x0468, B:136:0x0475, B:138:0x047b, B:139:0x0484, B:140:0x0492, B:142:0x04b6, B:152:0x04da, B:153:0x04ef, B:155:0x0518, B:158:0x0530, B:161:0x0573, B:163:0x059f, B:165:0x05dc, B:166:0x05e1, B:168:0x05e9, B:169:0x05ee, B:171:0x05f6, B:172:0x05fb, B:174:0x060b, B:176:0x0619, B:178:0x0621, B:179:0x0626, B:181:0x062f, B:182:0x0633, B:184:0x0640, B:185:0x0645, B:187:0x066c, B:189:0x0674, B:190:0x0679, B:192:0x0681, B:193:0x0684, B:195:0x069c, B:198:0x06a4, B:199:0x06be, B:201:0x06c4, B:203:0x06d8, B:205:0x06e4, B:207:0x06f1, B:211:0x070b, B:212:0x071b, B:216:0x0724, B:217:0x0727, B:219:0x0745, B:221:0x0749, B:223:0x075b, B:225:0x075f, B:227:0x076a, B:228:0x0773, B:230:0x07b2, B:232:0x07bc, B:233:0x07bf, B:235:0x07cc, B:237:0x07ec, B:238:0x07f9, B:239:0x082f, B:241:0x0837, B:243:0x0841, B:244:0x084e, B:246:0x0858, B:247:0x0865, B:248:0x0871, B:250:0x0877, B:252:0x08a7, B:253:0x08ed, B:254:0x08f8, B:255:0x0904, B:257:0x090a, B:266:0x0957, B:267:0x09a5, B:269:0x09b6, B:283:0x0a1a, B:272:0x09ce, B:274:0x09d2, B:260:0x0917, B:262:0x0941, B:278:0x09eb, B:279:0x0a02, B:282:0x0a05, B:162:0x0591, B:149:0x04c2, B:93:0x02f3, B:94:0x02fa, B:96:0x0300, B:98:0x030c, B:43:0x015f, B:46:0x016b, B:48:0x0182, B:53:0x019b, B:60:0x01d9, B:62:0x01df, B:64:0x01ed, B:66:0x01fe, B:69:0x0205, B:87:0x02a2, B:89:0x02ad, B:71:0x022d, B:72:0x024c, B:74:0x0251, B:76:0x0255, B:86:0x0286, B:85:0x0273, B:56:0x01a9, B:59:0x01cf), top: B:307:0x0124, inners: #2, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0640 A[Catch: all -> 0x0a4d, TryCatch #8 {all -> 0x0a4d, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:90:0x02dd, B:99:0x0313, B:101:0x0350, B:103:0x0355, B:104:0x036c, B:108:0x037f, B:110:0x0398, B:112:0x039d, B:113:0x03b4, B:119:0x03e1, B:123:0x0402, B:124:0x0419, B:128:0x042b, B:131:0x044a, B:132:0x045e, B:134:0x0468, B:136:0x0475, B:138:0x047b, B:139:0x0484, B:140:0x0492, B:142:0x04b6, B:152:0x04da, B:153:0x04ef, B:155:0x0518, B:158:0x0530, B:161:0x0573, B:163:0x059f, B:165:0x05dc, B:166:0x05e1, B:168:0x05e9, B:169:0x05ee, B:171:0x05f6, B:172:0x05fb, B:174:0x060b, B:176:0x0619, B:178:0x0621, B:179:0x0626, B:181:0x062f, B:182:0x0633, B:184:0x0640, B:185:0x0645, B:187:0x066c, B:189:0x0674, B:190:0x0679, B:192:0x0681, B:193:0x0684, B:195:0x069c, B:198:0x06a4, B:199:0x06be, B:201:0x06c4, B:203:0x06d8, B:205:0x06e4, B:207:0x06f1, B:211:0x070b, B:212:0x071b, B:216:0x0724, B:217:0x0727, B:219:0x0745, B:221:0x0749, B:223:0x075b, B:225:0x075f, B:227:0x076a, B:228:0x0773, B:230:0x07b2, B:232:0x07bc, B:233:0x07bf, B:235:0x07cc, B:237:0x07ec, B:238:0x07f9, B:239:0x082f, B:241:0x0837, B:243:0x0841, B:244:0x084e, B:246:0x0858, B:247:0x0865, B:248:0x0871, B:250:0x0877, B:252:0x08a7, B:253:0x08ed, B:254:0x08f8, B:255:0x0904, B:257:0x090a, B:266:0x0957, B:267:0x09a5, B:269:0x09b6, B:283:0x0a1a, B:272:0x09ce, B:274:0x09d2, B:260:0x0917, B:262:0x0941, B:278:0x09eb, B:279:0x0a02, B:282:0x0a05, B:162:0x0591, B:149:0x04c2, B:93:0x02f3, B:94:0x02fa, B:96:0x0300, B:98:0x030c, B:43:0x015f, B:46:0x016b, B:48:0x0182, B:53:0x019b, B:60:0x01d9, B:62:0x01df, B:64:0x01ed, B:66:0x01fe, B:69:0x0205, B:87:0x02a2, B:89:0x02ad, B:71:0x022d, B:72:0x024c, B:74:0x0251, B:76:0x0255, B:86:0x0286, B:85:0x0273, B:56:0x01a9, B:59:0x01cf), top: B:307:0x0124, inners: #2, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0681 A[Catch: all -> 0x0a4d, TryCatch #8 {all -> 0x0a4d, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:90:0x02dd, B:99:0x0313, B:101:0x0350, B:103:0x0355, B:104:0x036c, B:108:0x037f, B:110:0x0398, B:112:0x039d, B:113:0x03b4, B:119:0x03e1, B:123:0x0402, B:124:0x0419, B:128:0x042b, B:131:0x044a, B:132:0x045e, B:134:0x0468, B:136:0x0475, B:138:0x047b, B:139:0x0484, B:140:0x0492, B:142:0x04b6, B:152:0x04da, B:153:0x04ef, B:155:0x0518, B:158:0x0530, B:161:0x0573, B:163:0x059f, B:165:0x05dc, B:166:0x05e1, B:168:0x05e9, B:169:0x05ee, B:171:0x05f6, B:172:0x05fb, B:174:0x060b, B:176:0x0619, B:178:0x0621, B:179:0x0626, B:181:0x062f, B:182:0x0633, B:184:0x0640, B:185:0x0645, B:187:0x066c, B:189:0x0674, B:190:0x0679, B:192:0x0681, B:193:0x0684, B:195:0x069c, B:198:0x06a4, B:199:0x06be, B:201:0x06c4, B:203:0x06d8, B:205:0x06e4, B:207:0x06f1, B:211:0x070b, B:212:0x071b, B:216:0x0724, B:217:0x0727, B:219:0x0745, B:221:0x0749, B:223:0x075b, B:225:0x075f, B:227:0x076a, B:228:0x0773, B:230:0x07b2, B:232:0x07bc, B:233:0x07bf, B:235:0x07cc, B:237:0x07ec, B:238:0x07f9, B:239:0x082f, B:241:0x0837, B:243:0x0841, B:244:0x084e, B:246:0x0858, B:247:0x0865, B:248:0x0871, B:250:0x0877, B:252:0x08a7, B:253:0x08ed, B:254:0x08f8, B:255:0x0904, B:257:0x090a, B:266:0x0957, B:267:0x09a5, B:269:0x09b6, B:283:0x0a1a, B:272:0x09ce, B:274:0x09d2, B:260:0x0917, B:262:0x0941, B:278:0x09eb, B:279:0x0a02, B:282:0x0a05, B:162:0x0591, B:149:0x04c2, B:93:0x02f3, B:94:0x02fa, B:96:0x0300, B:98:0x030c, B:43:0x015f, B:46:0x016b, B:48:0x0182, B:53:0x019b, B:60:0x01d9, B:62:0x01df, B:64:0x01ed, B:66:0x01fe, B:69:0x0205, B:87:0x02a2, B:89:0x02ad, B:71:0x022d, B:72:0x024c, B:74:0x0251, B:76:0x0255, B:86:0x0286, B:85:0x0273, B:56:0x01a9, B:59:0x01cf), top: B:307:0x0124, inners: #2, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0721  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0724 A[Catch: all -> 0x0a4d, TryCatch #8 {all -> 0x0a4d, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:90:0x02dd, B:99:0x0313, B:101:0x0350, B:103:0x0355, B:104:0x036c, B:108:0x037f, B:110:0x0398, B:112:0x039d, B:113:0x03b4, B:119:0x03e1, B:123:0x0402, B:124:0x0419, B:128:0x042b, B:131:0x044a, B:132:0x045e, B:134:0x0468, B:136:0x0475, B:138:0x047b, B:139:0x0484, B:140:0x0492, B:142:0x04b6, B:152:0x04da, B:153:0x04ef, B:155:0x0518, B:158:0x0530, B:161:0x0573, B:163:0x059f, B:165:0x05dc, B:166:0x05e1, B:168:0x05e9, B:169:0x05ee, B:171:0x05f6, B:172:0x05fb, B:174:0x060b, B:176:0x0619, B:178:0x0621, B:179:0x0626, B:181:0x062f, B:182:0x0633, B:184:0x0640, B:185:0x0645, B:187:0x066c, B:189:0x0674, B:190:0x0679, B:192:0x0681, B:193:0x0684, B:195:0x069c, B:198:0x06a4, B:199:0x06be, B:201:0x06c4, B:203:0x06d8, B:205:0x06e4, B:207:0x06f1, B:211:0x070b, B:212:0x071b, B:216:0x0724, B:217:0x0727, B:219:0x0745, B:221:0x0749, B:223:0x075b, B:225:0x075f, B:227:0x076a, B:228:0x0773, B:230:0x07b2, B:232:0x07bc, B:233:0x07bf, B:235:0x07cc, B:237:0x07ec, B:238:0x07f9, B:239:0x082f, B:241:0x0837, B:243:0x0841, B:244:0x084e, B:246:0x0858, B:247:0x0865, B:248:0x0871, B:250:0x0877, B:252:0x08a7, B:253:0x08ed, B:254:0x08f8, B:255:0x0904, B:257:0x090a, B:266:0x0957, B:267:0x09a5, B:269:0x09b6, B:283:0x0a1a, B:272:0x09ce, B:274:0x09d2, B:260:0x0917, B:262:0x0941, B:278:0x09eb, B:279:0x0a02, B:282:0x0a05, B:162:0x0591, B:149:0x04c2, B:93:0x02f3, B:94:0x02fa, B:96:0x0300, B:98:0x030c, B:43:0x015f, B:46:0x016b, B:48:0x0182, B:53:0x019b, B:60:0x01d9, B:62:0x01df, B:64:0x01ed, B:66:0x01fe, B:69:0x0205, B:87:0x02a2, B:89:0x02ad, B:71:0x022d, B:72:0x024c, B:74:0x0251, B:76:0x0255, B:86:0x0286, B:85:0x0273, B:56:0x01a9, B:59:0x01cf), top: B:307:0x0124, inners: #2, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x076a A[Catch: all -> 0x0a4d, TryCatch #8 {all -> 0x0a4d, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:90:0x02dd, B:99:0x0313, B:101:0x0350, B:103:0x0355, B:104:0x036c, B:108:0x037f, B:110:0x0398, B:112:0x039d, B:113:0x03b4, B:119:0x03e1, B:123:0x0402, B:124:0x0419, B:128:0x042b, B:131:0x044a, B:132:0x045e, B:134:0x0468, B:136:0x0475, B:138:0x047b, B:139:0x0484, B:140:0x0492, B:142:0x04b6, B:152:0x04da, B:153:0x04ef, B:155:0x0518, B:158:0x0530, B:161:0x0573, B:163:0x059f, B:165:0x05dc, B:166:0x05e1, B:168:0x05e9, B:169:0x05ee, B:171:0x05f6, B:172:0x05fb, B:174:0x060b, B:176:0x0619, B:178:0x0621, B:179:0x0626, B:181:0x062f, B:182:0x0633, B:184:0x0640, B:185:0x0645, B:187:0x066c, B:189:0x0674, B:190:0x0679, B:192:0x0681, B:193:0x0684, B:195:0x069c, B:198:0x06a4, B:199:0x06be, B:201:0x06c4, B:203:0x06d8, B:205:0x06e4, B:207:0x06f1, B:211:0x070b, B:212:0x071b, B:216:0x0724, B:217:0x0727, B:219:0x0745, B:221:0x0749, B:223:0x075b, B:225:0x075f, B:227:0x076a, B:228:0x0773, B:230:0x07b2, B:232:0x07bc, B:233:0x07bf, B:235:0x07cc, B:237:0x07ec, B:238:0x07f9, B:239:0x082f, B:241:0x0837, B:243:0x0841, B:244:0x084e, B:246:0x0858, B:247:0x0865, B:248:0x0871, B:250:0x0877, B:252:0x08a7, B:253:0x08ed, B:254:0x08f8, B:255:0x0904, B:257:0x090a, B:266:0x0957, B:267:0x09a5, B:269:0x09b6, B:283:0x0a1a, B:272:0x09ce, B:274:0x09d2, B:260:0x0917, B:262:0x0941, B:278:0x09eb, B:279:0x0a02, B:282:0x0a05, B:162:0x0591, B:149:0x04c2, B:93:0x02f3, B:94:0x02fa, B:96:0x0300, B:98:0x030c, B:43:0x015f, B:46:0x016b, B:48:0x0182, B:53:0x019b, B:60:0x01d9, B:62:0x01df, B:64:0x01ed, B:66:0x01fe, B:69:0x0205, B:87:0x02a2, B:89:0x02ad, B:71:0x022d, B:72:0x024c, B:74:0x0251, B:76:0x0255, B:86:0x0286, B:85:0x0273, B:56:0x01a9, B:59:0x01cf), top: B:307:0x0124, inners: #2, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x07b2 A[Catch: all -> 0x0a4d, TryCatch #8 {all -> 0x0a4d, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:90:0x02dd, B:99:0x0313, B:101:0x0350, B:103:0x0355, B:104:0x036c, B:108:0x037f, B:110:0x0398, B:112:0x039d, B:113:0x03b4, B:119:0x03e1, B:123:0x0402, B:124:0x0419, B:128:0x042b, B:131:0x044a, B:132:0x045e, B:134:0x0468, B:136:0x0475, B:138:0x047b, B:139:0x0484, B:140:0x0492, B:142:0x04b6, B:152:0x04da, B:153:0x04ef, B:155:0x0518, B:158:0x0530, B:161:0x0573, B:163:0x059f, B:165:0x05dc, B:166:0x05e1, B:168:0x05e9, B:169:0x05ee, B:171:0x05f6, B:172:0x05fb, B:174:0x060b, B:176:0x0619, B:178:0x0621, B:179:0x0626, B:181:0x062f, B:182:0x0633, B:184:0x0640, B:185:0x0645, B:187:0x066c, B:189:0x0674, B:190:0x0679, B:192:0x0681, B:193:0x0684, B:195:0x069c, B:198:0x06a4, B:199:0x06be, B:201:0x06c4, B:203:0x06d8, B:205:0x06e4, B:207:0x06f1, B:211:0x070b, B:212:0x071b, B:216:0x0724, B:217:0x0727, B:219:0x0745, B:221:0x0749, B:223:0x075b, B:225:0x075f, B:227:0x076a, B:228:0x0773, B:230:0x07b2, B:232:0x07bc, B:233:0x07bf, B:235:0x07cc, B:237:0x07ec, B:238:0x07f9, B:239:0x082f, B:241:0x0837, B:243:0x0841, B:244:0x084e, B:246:0x0858, B:247:0x0865, B:248:0x0871, B:250:0x0877, B:252:0x08a7, B:253:0x08ed, B:254:0x08f8, B:255:0x0904, B:257:0x090a, B:266:0x0957, B:267:0x09a5, B:269:0x09b6, B:283:0x0a1a, B:272:0x09ce, B:274:0x09d2, B:260:0x0917, B:262:0x0941, B:278:0x09eb, B:279:0x0a02, B:282:0x0a05, B:162:0x0591, B:149:0x04c2, B:93:0x02f3, B:94:0x02fa, B:96:0x0300, B:98:0x030c, B:43:0x015f, B:46:0x016b, B:48:0x0182, B:53:0x019b, B:60:0x01d9, B:62:0x01df, B:64:0x01ed, B:66:0x01fe, B:69:0x0205, B:87:0x02a2, B:89:0x02ad, B:71:0x022d, B:72:0x024c, B:74:0x0251, B:76:0x0255, B:86:0x0286, B:85:0x0273, B:56:0x01a9, B:59:0x01cf), top: B:307:0x0124, inners: #2, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x07cc A[Catch: all -> 0x0a4d, TryCatch #8 {all -> 0x0a4d, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:90:0x02dd, B:99:0x0313, B:101:0x0350, B:103:0x0355, B:104:0x036c, B:108:0x037f, B:110:0x0398, B:112:0x039d, B:113:0x03b4, B:119:0x03e1, B:123:0x0402, B:124:0x0419, B:128:0x042b, B:131:0x044a, B:132:0x045e, B:134:0x0468, B:136:0x0475, B:138:0x047b, B:139:0x0484, B:140:0x0492, B:142:0x04b6, B:152:0x04da, B:153:0x04ef, B:155:0x0518, B:158:0x0530, B:161:0x0573, B:163:0x059f, B:165:0x05dc, B:166:0x05e1, B:168:0x05e9, B:169:0x05ee, B:171:0x05f6, B:172:0x05fb, B:174:0x060b, B:176:0x0619, B:178:0x0621, B:179:0x0626, B:181:0x062f, B:182:0x0633, B:184:0x0640, B:185:0x0645, B:187:0x066c, B:189:0x0674, B:190:0x0679, B:192:0x0681, B:193:0x0684, B:195:0x069c, B:198:0x06a4, B:199:0x06be, B:201:0x06c4, B:203:0x06d8, B:205:0x06e4, B:207:0x06f1, B:211:0x070b, B:212:0x071b, B:216:0x0724, B:217:0x0727, B:219:0x0745, B:221:0x0749, B:223:0x075b, B:225:0x075f, B:227:0x076a, B:228:0x0773, B:230:0x07b2, B:232:0x07bc, B:233:0x07bf, B:235:0x07cc, B:237:0x07ec, B:238:0x07f9, B:239:0x082f, B:241:0x0837, B:243:0x0841, B:244:0x084e, B:246:0x0858, B:247:0x0865, B:248:0x0871, B:250:0x0877, B:252:0x08a7, B:253:0x08ed, B:254:0x08f8, B:255:0x0904, B:257:0x090a, B:266:0x0957, B:267:0x09a5, B:269:0x09b6, B:283:0x0a1a, B:272:0x09ce, B:274:0x09d2, B:260:0x0917, B:262:0x0941, B:278:0x09eb, B:279:0x0a02, B:282:0x0a05, B:162:0x0591, B:149:0x04c2, B:93:0x02f3, B:94:0x02fa, B:96:0x0300, B:98:0x030c, B:43:0x015f, B:46:0x016b, B:48:0x0182, B:53:0x019b, B:60:0x01d9, B:62:0x01df, B:64:0x01ed, B:66:0x01fe, B:69:0x0205, B:87:0x02a2, B:89:0x02ad, B:71:0x022d, B:72:0x024c, B:74:0x0251, B:76:0x0255, B:86:0x0286, B:85:0x0273, B:56:0x01a9, B:59:0x01cf), top: B:307:0x0124, inners: #2, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0858 A[Catch: all -> 0x0a4d, TryCatch #8 {all -> 0x0a4d, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:90:0x02dd, B:99:0x0313, B:101:0x0350, B:103:0x0355, B:104:0x036c, B:108:0x037f, B:110:0x0398, B:112:0x039d, B:113:0x03b4, B:119:0x03e1, B:123:0x0402, B:124:0x0419, B:128:0x042b, B:131:0x044a, B:132:0x045e, B:134:0x0468, B:136:0x0475, B:138:0x047b, B:139:0x0484, B:140:0x0492, B:142:0x04b6, B:152:0x04da, B:153:0x04ef, B:155:0x0518, B:158:0x0530, B:161:0x0573, B:163:0x059f, B:165:0x05dc, B:166:0x05e1, B:168:0x05e9, B:169:0x05ee, B:171:0x05f6, B:172:0x05fb, B:174:0x060b, B:176:0x0619, B:178:0x0621, B:179:0x0626, B:181:0x062f, B:182:0x0633, B:184:0x0640, B:185:0x0645, B:187:0x066c, B:189:0x0674, B:190:0x0679, B:192:0x0681, B:193:0x0684, B:195:0x069c, B:198:0x06a4, B:199:0x06be, B:201:0x06c4, B:203:0x06d8, B:205:0x06e4, B:207:0x06f1, B:211:0x070b, B:212:0x071b, B:216:0x0724, B:217:0x0727, B:219:0x0745, B:221:0x0749, B:223:0x075b, B:225:0x075f, B:227:0x076a, B:228:0x0773, B:230:0x07b2, B:232:0x07bc, B:233:0x07bf, B:235:0x07cc, B:237:0x07ec, B:238:0x07f9, B:239:0x082f, B:241:0x0837, B:243:0x0841, B:244:0x084e, B:246:0x0858, B:247:0x0865, B:248:0x0871, B:250:0x0877, B:252:0x08a7, B:253:0x08ed, B:254:0x08f8, B:255:0x0904, B:257:0x090a, B:266:0x0957, B:267:0x09a5, B:269:0x09b6, B:283:0x0a1a, B:272:0x09ce, B:274:0x09d2, B:260:0x0917, B:262:0x0941, B:278:0x09eb, B:279:0x0a02, B:282:0x0a05, B:162:0x0591, B:149:0x04c2, B:93:0x02f3, B:94:0x02fa, B:96:0x0300, B:98:0x030c, B:43:0x015f, B:46:0x016b, B:48:0x0182, B:53:0x019b, B:60:0x01d9, B:62:0x01df, B:64:0x01ed, B:66:0x01fe, B:69:0x0205, B:87:0x02a2, B:89:0x02ad, B:71:0x022d, B:72:0x024c, B:74:0x0251, B:76:0x0255, B:86:0x0286, B:85:0x0273, B:56:0x01a9, B:59:0x01cf), top: B:307:0x0124, inners: #2, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0877 A[Catch: all -> 0x0a4d, TRY_LEAVE, TryCatch #8 {all -> 0x0a4d, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:90:0x02dd, B:99:0x0313, B:101:0x0350, B:103:0x0355, B:104:0x036c, B:108:0x037f, B:110:0x0398, B:112:0x039d, B:113:0x03b4, B:119:0x03e1, B:123:0x0402, B:124:0x0419, B:128:0x042b, B:131:0x044a, B:132:0x045e, B:134:0x0468, B:136:0x0475, B:138:0x047b, B:139:0x0484, B:140:0x0492, B:142:0x04b6, B:152:0x04da, B:153:0x04ef, B:155:0x0518, B:158:0x0530, B:161:0x0573, B:163:0x059f, B:165:0x05dc, B:166:0x05e1, B:168:0x05e9, B:169:0x05ee, B:171:0x05f6, B:172:0x05fb, B:174:0x060b, B:176:0x0619, B:178:0x0621, B:179:0x0626, B:181:0x062f, B:182:0x0633, B:184:0x0640, B:185:0x0645, B:187:0x066c, B:189:0x0674, B:190:0x0679, B:192:0x0681, B:193:0x0684, B:195:0x069c, B:198:0x06a4, B:199:0x06be, B:201:0x06c4, B:203:0x06d8, B:205:0x06e4, B:207:0x06f1, B:211:0x070b, B:212:0x071b, B:216:0x0724, B:217:0x0727, B:219:0x0745, B:221:0x0749, B:223:0x075b, B:225:0x075f, B:227:0x076a, B:228:0x0773, B:230:0x07b2, B:232:0x07bc, B:233:0x07bf, B:235:0x07cc, B:237:0x07ec, B:238:0x07f9, B:239:0x082f, B:241:0x0837, B:243:0x0841, B:244:0x084e, B:246:0x0858, B:247:0x0865, B:248:0x0871, B:250:0x0877, B:252:0x08a7, B:253:0x08ed, B:254:0x08f8, B:255:0x0904, B:257:0x090a, B:266:0x0957, B:267:0x09a5, B:269:0x09b6, B:283:0x0a1a, B:272:0x09ce, B:274:0x09d2, B:260:0x0917, B:262:0x0941, B:278:0x09eb, B:279:0x0a02, B:282:0x0a05, B:162:0x0591, B:149:0x04c2, B:93:0x02f3, B:94:0x02fa, B:96:0x0300, B:98:0x030c, B:43:0x015f, B:46:0x016b, B:48:0x0182, B:53:0x019b, B:60:0x01d9, B:62:0x01df, B:64:0x01ed, B:66:0x01fe, B:69:0x0205, B:87:0x02a2, B:89:0x02ad, B:71:0x022d, B:72:0x024c, B:74:0x0251, B:76:0x0255, B:86:0x0286, B:85:0x0273, B:56:0x01a9, B:59:0x01cf), top: B:307:0x0124, inners: #2, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x090a A[Catch: all -> 0x0a4d, TryCatch #8 {all -> 0x0a4d, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:90:0x02dd, B:99:0x0313, B:101:0x0350, B:103:0x0355, B:104:0x036c, B:108:0x037f, B:110:0x0398, B:112:0x039d, B:113:0x03b4, B:119:0x03e1, B:123:0x0402, B:124:0x0419, B:128:0x042b, B:131:0x044a, B:132:0x045e, B:134:0x0468, B:136:0x0475, B:138:0x047b, B:139:0x0484, B:140:0x0492, B:142:0x04b6, B:152:0x04da, B:153:0x04ef, B:155:0x0518, B:158:0x0530, B:161:0x0573, B:163:0x059f, B:165:0x05dc, B:166:0x05e1, B:168:0x05e9, B:169:0x05ee, B:171:0x05f6, B:172:0x05fb, B:174:0x060b, B:176:0x0619, B:178:0x0621, B:179:0x0626, B:181:0x062f, B:182:0x0633, B:184:0x0640, B:185:0x0645, B:187:0x066c, B:189:0x0674, B:190:0x0679, B:192:0x0681, B:193:0x0684, B:195:0x069c, B:198:0x06a4, B:199:0x06be, B:201:0x06c4, B:203:0x06d8, B:205:0x06e4, B:207:0x06f1, B:211:0x070b, B:212:0x071b, B:216:0x0724, B:217:0x0727, B:219:0x0745, B:221:0x0749, B:223:0x075b, B:225:0x075f, B:227:0x076a, B:228:0x0773, B:230:0x07b2, B:232:0x07bc, B:233:0x07bf, B:235:0x07cc, B:237:0x07ec, B:238:0x07f9, B:239:0x082f, B:241:0x0837, B:243:0x0841, B:244:0x084e, B:246:0x0858, B:247:0x0865, B:248:0x0871, B:250:0x0877, B:252:0x08a7, B:253:0x08ed, B:254:0x08f8, B:255:0x0904, B:257:0x090a, B:266:0x0957, B:267:0x09a5, B:269:0x09b6, B:283:0x0a1a, B:272:0x09ce, B:274:0x09d2, B:260:0x0917, B:262:0x0941, B:278:0x09eb, B:279:0x0a02, B:282:0x0a05, B:162:0x0591, B:149:0x04c2, B:93:0x02f3, B:94:0x02fa, B:96:0x0300, B:98:0x030c, B:43:0x015f, B:46:0x016b, B:48:0x0182, B:53:0x019b, B:60:0x01d9, B:62:0x01df, B:64:0x01ed, B:66:0x01fe, B:69:0x0205, B:87:0x02a2, B:89:0x02ad, B:71:0x022d, B:72:0x024c, B:74:0x0251, B:76:0x0255, B:86:0x0286, B:85:0x0273, B:56:0x01a9, B:59:0x01cf), top: B:307:0x0124, inners: #2, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x09b6 A[Catch: SQLiteException -> 0x09d1, all -> 0x0a4d, TRY_LEAVE, TryCatch #4 {SQLiteException -> 0x09d1, blocks: (B:267:0x09a5, B:269:0x09b6), top: B:299:0x09a5, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x09cc  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0917 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x016b A[Catch: all -> 0x0a4d, TRY_ENTER, TryCatch #8 {all -> 0x0a4d, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:90:0x02dd, B:99:0x0313, B:101:0x0350, B:103:0x0355, B:104:0x036c, B:108:0x037f, B:110:0x0398, B:112:0x039d, B:113:0x03b4, B:119:0x03e1, B:123:0x0402, B:124:0x0419, B:128:0x042b, B:131:0x044a, B:132:0x045e, B:134:0x0468, B:136:0x0475, B:138:0x047b, B:139:0x0484, B:140:0x0492, B:142:0x04b6, B:152:0x04da, B:153:0x04ef, B:155:0x0518, B:158:0x0530, B:161:0x0573, B:163:0x059f, B:165:0x05dc, B:166:0x05e1, B:168:0x05e9, B:169:0x05ee, B:171:0x05f6, B:172:0x05fb, B:174:0x060b, B:176:0x0619, B:178:0x0621, B:179:0x0626, B:181:0x062f, B:182:0x0633, B:184:0x0640, B:185:0x0645, B:187:0x066c, B:189:0x0674, B:190:0x0679, B:192:0x0681, B:193:0x0684, B:195:0x069c, B:198:0x06a4, B:199:0x06be, B:201:0x06c4, B:203:0x06d8, B:205:0x06e4, B:207:0x06f1, B:211:0x070b, B:212:0x071b, B:216:0x0724, B:217:0x0727, B:219:0x0745, B:221:0x0749, B:223:0x075b, B:225:0x075f, B:227:0x076a, B:228:0x0773, B:230:0x07b2, B:232:0x07bc, B:233:0x07bf, B:235:0x07cc, B:237:0x07ec, B:238:0x07f9, B:239:0x082f, B:241:0x0837, B:243:0x0841, B:244:0x084e, B:246:0x0858, B:247:0x0865, B:248:0x0871, B:250:0x0877, B:252:0x08a7, B:253:0x08ed, B:254:0x08f8, B:255:0x0904, B:257:0x090a, B:266:0x0957, B:267:0x09a5, B:269:0x09b6, B:283:0x0a1a, B:272:0x09ce, B:274:0x09d2, B:260:0x0917, B:262:0x0941, B:278:0x09eb, B:279:0x0a02, B:282:0x0a05, B:162:0x0591, B:149:0x04c2, B:93:0x02f3, B:94:0x02fa, B:96:0x0300, B:98:0x030c, B:43:0x015f, B:46:0x016b, B:48:0x0182, B:53:0x019b, B:60:0x01d9, B:62:0x01df, B:64:0x01ed, B:66:0x01fe, B:69:0x0205, B:87:0x02a2, B:89:0x02ad, B:71:0x022d, B:72:0x024c, B:74:0x0251, B:76:0x0255, B:86:0x0286, B:85:0x0273, B:56:0x01a9, B:59:0x01cf), top: B:307:0x0124, inners: #2, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01cf A[Catch: all -> 0x0a4d, TRY_ENTER, TryCatch #8 {all -> 0x0a4d, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:90:0x02dd, B:99:0x0313, B:101:0x0350, B:103:0x0355, B:104:0x036c, B:108:0x037f, B:110:0x0398, B:112:0x039d, B:113:0x03b4, B:119:0x03e1, B:123:0x0402, B:124:0x0419, B:128:0x042b, B:131:0x044a, B:132:0x045e, B:134:0x0468, B:136:0x0475, B:138:0x047b, B:139:0x0484, B:140:0x0492, B:142:0x04b6, B:152:0x04da, B:153:0x04ef, B:155:0x0518, B:158:0x0530, B:161:0x0573, B:163:0x059f, B:165:0x05dc, B:166:0x05e1, B:168:0x05e9, B:169:0x05ee, B:171:0x05f6, B:172:0x05fb, B:174:0x060b, B:176:0x0619, B:178:0x0621, B:179:0x0626, B:181:0x062f, B:182:0x0633, B:184:0x0640, B:185:0x0645, B:187:0x066c, B:189:0x0674, B:190:0x0679, B:192:0x0681, B:193:0x0684, B:195:0x069c, B:198:0x06a4, B:199:0x06be, B:201:0x06c4, B:203:0x06d8, B:205:0x06e4, B:207:0x06f1, B:211:0x070b, B:212:0x071b, B:216:0x0724, B:217:0x0727, B:219:0x0745, B:221:0x0749, B:223:0x075b, B:225:0x075f, B:227:0x076a, B:228:0x0773, B:230:0x07b2, B:232:0x07bc, B:233:0x07bf, B:235:0x07cc, B:237:0x07ec, B:238:0x07f9, B:239:0x082f, B:241:0x0837, B:243:0x0841, B:244:0x084e, B:246:0x0858, B:247:0x0865, B:248:0x0871, B:250:0x0877, B:252:0x08a7, B:253:0x08ed, B:254:0x08f8, B:255:0x0904, B:257:0x090a, B:266:0x0957, B:267:0x09a5, B:269:0x09b6, B:283:0x0a1a, B:272:0x09ce, B:274:0x09d2, B:260:0x0917, B:262:0x0941, B:278:0x09eb, B:279:0x0a02, B:282:0x0a05, B:162:0x0591, B:149:0x04c2, B:93:0x02f3, B:94:0x02fa, B:96:0x0300, B:98:0x030c, B:43:0x015f, B:46:0x016b, B:48:0x0182, B:53:0x019b, B:60:0x01d9, B:62:0x01df, B:64:0x01ed, B:66:0x01fe, B:69:0x0205, B:87:0x02a2, B:89:0x02ad, B:71:0x022d, B:72:0x024c, B:74:0x0251, B:76:0x0255, B:86:0x0286, B:85:0x0273, B:56:0x01a9, B:59:0x01cf), top: B:307:0x0124, inners: #2, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01df A[Catch: all -> 0x0a4d, TryCatch #8 {all -> 0x0a4d, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:90:0x02dd, B:99:0x0313, B:101:0x0350, B:103:0x0355, B:104:0x036c, B:108:0x037f, B:110:0x0398, B:112:0x039d, B:113:0x03b4, B:119:0x03e1, B:123:0x0402, B:124:0x0419, B:128:0x042b, B:131:0x044a, B:132:0x045e, B:134:0x0468, B:136:0x0475, B:138:0x047b, B:139:0x0484, B:140:0x0492, B:142:0x04b6, B:152:0x04da, B:153:0x04ef, B:155:0x0518, B:158:0x0530, B:161:0x0573, B:163:0x059f, B:165:0x05dc, B:166:0x05e1, B:168:0x05e9, B:169:0x05ee, B:171:0x05f6, B:172:0x05fb, B:174:0x060b, B:176:0x0619, B:178:0x0621, B:179:0x0626, B:181:0x062f, B:182:0x0633, B:184:0x0640, B:185:0x0645, B:187:0x066c, B:189:0x0674, B:190:0x0679, B:192:0x0681, B:193:0x0684, B:195:0x069c, B:198:0x06a4, B:199:0x06be, B:201:0x06c4, B:203:0x06d8, B:205:0x06e4, B:207:0x06f1, B:211:0x070b, B:212:0x071b, B:216:0x0724, B:217:0x0727, B:219:0x0745, B:221:0x0749, B:223:0x075b, B:225:0x075f, B:227:0x076a, B:228:0x0773, B:230:0x07b2, B:232:0x07bc, B:233:0x07bf, B:235:0x07cc, B:237:0x07ec, B:238:0x07f9, B:239:0x082f, B:241:0x0837, B:243:0x0841, B:244:0x084e, B:246:0x0858, B:247:0x0865, B:248:0x0871, B:250:0x0877, B:252:0x08a7, B:253:0x08ed, B:254:0x08f8, B:255:0x0904, B:257:0x090a, B:266:0x0957, B:267:0x09a5, B:269:0x09b6, B:283:0x0a1a, B:272:0x09ce, B:274:0x09d2, B:260:0x0917, B:262:0x0941, B:278:0x09eb, B:279:0x0a02, B:282:0x0a05, B:162:0x0591, B:149:0x04c2, B:93:0x02f3, B:94:0x02fa, B:96:0x0300, B:98:0x030c, B:43:0x015f, B:46:0x016b, B:48:0x0182, B:53:0x019b, B:60:0x01d9, B:62:0x01df, B:64:0x01ed, B:66:0x01fe, B:69:0x0205, B:87:0x02a2, B:89:0x02ad, B:71:0x022d, B:72:0x024c, B:74:0x0251, B:76:0x0255, B:86:0x0286, B:85:0x0273, B:56:0x01a9, B:59:0x01cf), top: B:307:0x0124, inners: #2, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02ad A[Catch: all -> 0x0a4d, TryCatch #8 {all -> 0x0a4d, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:90:0x02dd, B:99:0x0313, B:101:0x0350, B:103:0x0355, B:104:0x036c, B:108:0x037f, B:110:0x0398, B:112:0x039d, B:113:0x03b4, B:119:0x03e1, B:123:0x0402, B:124:0x0419, B:128:0x042b, B:131:0x044a, B:132:0x045e, B:134:0x0468, B:136:0x0475, B:138:0x047b, B:139:0x0484, B:140:0x0492, B:142:0x04b6, B:152:0x04da, B:153:0x04ef, B:155:0x0518, B:158:0x0530, B:161:0x0573, B:163:0x059f, B:165:0x05dc, B:166:0x05e1, B:168:0x05e9, B:169:0x05ee, B:171:0x05f6, B:172:0x05fb, B:174:0x060b, B:176:0x0619, B:178:0x0621, B:179:0x0626, B:181:0x062f, B:182:0x0633, B:184:0x0640, B:185:0x0645, B:187:0x066c, B:189:0x0674, B:190:0x0679, B:192:0x0681, B:193:0x0684, B:195:0x069c, B:198:0x06a4, B:199:0x06be, B:201:0x06c4, B:203:0x06d8, B:205:0x06e4, B:207:0x06f1, B:211:0x070b, B:212:0x071b, B:216:0x0724, B:217:0x0727, B:219:0x0745, B:221:0x0749, B:223:0x075b, B:225:0x075f, B:227:0x076a, B:228:0x0773, B:230:0x07b2, B:232:0x07bc, B:233:0x07bf, B:235:0x07cc, B:237:0x07ec, B:238:0x07f9, B:239:0x082f, B:241:0x0837, B:243:0x0841, B:244:0x084e, B:246:0x0858, B:247:0x0865, B:248:0x0871, B:250:0x0877, B:252:0x08a7, B:253:0x08ed, B:254:0x08f8, B:255:0x0904, B:257:0x090a, B:266:0x0957, B:267:0x09a5, B:269:0x09b6, B:283:0x0a1a, B:272:0x09ce, B:274:0x09d2, B:260:0x0917, B:262:0x0941, B:278:0x09eb, B:279:0x0a02, B:282:0x0a05, B:162:0x0591, B:149:0x04c2, B:93:0x02f3, B:94:0x02fa, B:96:0x0300, B:98:0x030c, B:43:0x015f, B:46:0x016b, B:48:0x0182, B:53:0x019b, B:60:0x01d9, B:62:0x01df, B:64:0x01ed, B:66:0x01fe, B:69:0x0205, B:87:0x02a2, B:89:0x02ad, B:71:0x022d, B:72:0x024c, B:74:0x0251, B:76:0x0255, B:86:0x0286, B:85:0x0273, B:56:0x01a9, B:59:0x01cf), top: B:307:0x0124, inners: #2, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02f3 A[Catch: all -> 0x0a4d, TryCatch #8 {all -> 0x0a4d, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:90:0x02dd, B:99:0x0313, B:101:0x0350, B:103:0x0355, B:104:0x036c, B:108:0x037f, B:110:0x0398, B:112:0x039d, B:113:0x03b4, B:119:0x03e1, B:123:0x0402, B:124:0x0419, B:128:0x042b, B:131:0x044a, B:132:0x045e, B:134:0x0468, B:136:0x0475, B:138:0x047b, B:139:0x0484, B:140:0x0492, B:142:0x04b6, B:152:0x04da, B:153:0x04ef, B:155:0x0518, B:158:0x0530, B:161:0x0573, B:163:0x059f, B:165:0x05dc, B:166:0x05e1, B:168:0x05e9, B:169:0x05ee, B:171:0x05f6, B:172:0x05fb, B:174:0x060b, B:176:0x0619, B:178:0x0621, B:179:0x0626, B:181:0x062f, B:182:0x0633, B:184:0x0640, B:185:0x0645, B:187:0x066c, B:189:0x0674, B:190:0x0679, B:192:0x0681, B:193:0x0684, B:195:0x069c, B:198:0x06a4, B:199:0x06be, B:201:0x06c4, B:203:0x06d8, B:205:0x06e4, B:207:0x06f1, B:211:0x070b, B:212:0x071b, B:216:0x0724, B:217:0x0727, B:219:0x0745, B:221:0x0749, B:223:0x075b, B:225:0x075f, B:227:0x076a, B:228:0x0773, B:230:0x07b2, B:232:0x07bc, B:233:0x07bf, B:235:0x07cc, B:237:0x07ec, B:238:0x07f9, B:239:0x082f, B:241:0x0837, B:243:0x0841, B:244:0x084e, B:246:0x0858, B:247:0x0865, B:248:0x0871, B:250:0x0877, B:252:0x08a7, B:253:0x08ed, B:254:0x08f8, B:255:0x0904, B:257:0x090a, B:266:0x0957, B:267:0x09a5, B:269:0x09b6, B:283:0x0a1a, B:272:0x09ce, B:274:0x09d2, B:260:0x0917, B:262:0x0941, B:278:0x09eb, B:279:0x0a02, B:282:0x0a05, B:162:0x0591, B:149:0x04c2, B:93:0x02f3, B:94:0x02fa, B:96:0x0300, B:98:0x030c, B:43:0x015f, B:46:0x016b, B:48:0x0182, B:53:0x019b, B:60:0x01d9, B:62:0x01df, B:64:0x01ed, B:66:0x01fe, B:69:0x0205, B:87:0x02a2, B:89:0x02ad, B:71:0x022d, B:72:0x024c, B:74:0x0251, B:76:0x0255, B:86:0x0286, B:85:0x0273, B:56:0x01a9, B:59:0x01cf), top: B:307:0x0124, inners: #2, #4, #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzY(zzaw zzawVar, zzq zzqVar) {
        String strZzg;
        long jLongValue;
        String str;
        String str2;
        zzam zzamVar;
        zzky zzkyVar;
        Object obj;
        zzky zzkyVar2;
        zzam zzamVar2;
        zzau zzauVar;
        long length;
        long jIntValue;
        String str3;
        int i;
        String str4;
        long jDelete;
        zzar zzarVar;
        String str5;
        zzas zzasVarZzn;
        zzas zzasVarZzc;
        com.google.android.gms.internal.measurement.zzgc zzgcVarZzt;
        long j;
        long j2;
        Map mapZzc;
        ArrayList arrayList;
        zzai zzaiVarZzc;
        zzah zzahVar;
        zzh zzhVarZzj;
        List listZzu;
        int i2;
        zzam zzamVar3;
        zzam zzamVar4;
        zzat zzatVar;
        int i3;
        ContentValues contentValues;
        Pair pairZzd;
        Object obj2;
        Preconditions.checkNotNull(zzqVar);
        Preconditions.checkNotEmpty(zzqVar.zza);
        long jNanoTime = System.nanoTime();
        zzaz().zzg();
        zzB();
        String str6 = zzqVar.zza;
        zzal(this.zzi);
        if (zzkv.zzA(zzawVar, zzqVar)) {
            if (!zzqVar.zzh) {
                zzd(zzqVar);
                return;
            }
            zzfi zzfiVar = this.zzc;
            zzal(zzfiVar);
            if (zzfiVar.zzr(str6, zzawVar.zza)) {
                zzay().zzk().zzc("Dropping blocked event. appId", zzeh.zzn(str6), this.zzn.zzj().zzd(zzawVar.zza));
                zzfi zzfiVar2 = this.zzc;
                zzal(zzfiVar2);
                if (!zzfiVar2.zzp(str6)) {
                    zzfi zzfiVar3 = this.zzc;
                    zzal(zzfiVar3);
                    if (!zzfiVar3.zzs(str6)) {
                        if ("_err".equals(zzawVar.zza)) {
                            return;
                        }
                        zzv().zzN(this.zzF, str6, 11, "_ev", zzawVar.zza, 0);
                        return;
                    }
                }
                zzam zzamVar5 = this.zze;
                zzal(zzamVar5);
                zzh zzhVarZzj2 = zzamVar5.zzj(str6);
                if (zzhVarZzj2 != null) {
                    long jAbs = Math.abs(zzav().currentTimeMillis() - Math.max(zzhVarZzj2.zzl(), zzhVarZzj2.zzc()));
                    zzg();
                    if (jAbs > ((Long) zzdu.zzy.zza(null)).longValue()) {
                        zzay().zzc().zza("Fetching config for blocked app");
                        zzD(zzhVarZzj2);
                        return;
                    }
                    return;
                }
                return;
            }
            zzei zzeiVarZzb = zzei.zzb(zzawVar);
            zzv().zzM(zzeiVarZzb, zzg().zzd(str6));
            zzaw zzawVarZza = zzeiVarZzb.zza();
            if (Log.isLoggable(zzay().zzq(), 2)) {
                zzay().zzj().zzb("Logging event", this.zzn.zzj().zzc(zzawVarZza));
            }
            zzam zzamVar6 = this.zze;
            zzal(zzamVar6);
            zzamVar6.zzw();
            try {
                zzd(zzqVar);
                boolean z = "ecommerce_purchase".equals(zzawVarZza.zza) || FirebaseAnalytics.Event.PURCHASE.equals(zzawVarZza.zza) || FirebaseAnalytics.Event.REFUND.equals(zzawVarZza.zza);
                if ("_iap".equals(zzawVarZza.zza)) {
                    strZzg = zzawVarZza.zzb.zzg(FirebaseAnalytics.Param.CURRENCY);
                    if (z) {
                        jLongValue = zzawVarZza.zzb.zze("value").longValue();
                    } else {
                        double dDoubleValue = zzawVarZza.zzb.zzd("value").doubleValue() * 1000000.0d;
                        if (dDoubleValue == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                            dDoubleValue = zzawVarZza.zzb.zze("value").longValue() * 1000000.0d;
                        }
                        if (dDoubleValue > 9.223372036854776E18d || dDoubleValue < -9.223372036854776E18d) {
                            zzay().zzk().zzc("Data lost. Currency value is too big. appId", zzeh.zzn(str6), Double.valueOf(dDoubleValue));
                            zzam zzamVar7 = this.zze;
                            zzal(zzamVar7);
                            zzamVar7.zzC();
                            return;
                        }
                        jLongValue = Math.round(dDoubleValue);
                        if (FirebaseAnalytics.Event.REFUND.equals(zzawVarZza.zza)) {
                            jLongValue = -jLongValue;
                        }
                    }
                    if (TextUtils.isEmpty(strZzg)) {
                        String upperCase = strZzg.toUpperCase(Locale.US);
                        if (upperCase.matches("[A-Z]{3}")) {
                            String strConcat = "_ltv_".concat(upperCase);
                            zzam zzamVar8 = this.zze;
                            zzal(zzamVar8);
                            zzky zzkyVarZzp = zzamVar8.zzp(str6, strConcat);
                            if (zzkyVarZzp != null) {
                                Object obj3 = zzkyVarZzp.zze;
                                if (obj3 instanceof Long) {
                                    obj = null;
                                    str = "metadata_fingerprint";
                                    str2 = "_err";
                                    zzkyVar = new zzky(str6, zzawVarZza.zzc, strConcat, zzav().currentTimeMillis(), Long.valueOf(((Long) obj3).longValue() + jLongValue));
                                    zzkyVar2 = zzkyVar;
                                    zzamVar2 = this.zze;
                                    zzal(zzamVar2);
                                    if (!zzamVar2.zzL(zzkyVar2)) {
                                    }
                                } else {
                                    str = "metadata_fingerprint";
                                    str2 = "_err";
                                    zzamVar = this.zze;
                                    zzal(zzamVar);
                                    int iZze = zzg().zze(str6, zzdu.zzD) - 1;
                                    Preconditions.checkNotEmpty(str6);
                                    zzamVar.zzg();
                                    zzamVar.zzW();
                                    try {
                                        SQLiteDatabase sQLiteDatabaseZzh = zzamVar.zzh();
                                        try {
                                            String[] strArr = new String[3];
                                            try {
                                                strArr[0] = str6;
                                                strArr[1] = str6;
                                                strArr[2] = String.valueOf(iZze);
                                                sQLiteDatabaseZzh.execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);", strArr);
                                            } catch (SQLiteException e) {
                                                e = e;
                                                zzamVar.zzt.zzay().zzd().zzc("Error pruning currencies. appId", zzeh.zzn(str6), e);
                                                obj = null;
                                                zzkyVar = new zzky(str6, zzawVarZza.zzc, strConcat, zzav().currentTimeMillis(), Long.valueOf(jLongValue));
                                                zzkyVar2 = zzkyVar;
                                                zzamVar2 = this.zze;
                                                zzal(zzamVar2);
                                                if (!zzamVar2.zzL(zzkyVar2)) {
                                                }
                                                boolean zZzai = zzlb.zzai(zzawVarZza.zza);
                                                boolean zEquals = str2.equals(zzawVarZza.zza);
                                                zzv();
                                                zzauVar = zzawVarZza.zzb;
                                                if (zzauVar != null) {
                                                }
                                                zzam zzamVar9 = this.zze;
                                                zzal(zzamVar9);
                                                zzak zzakVarZzm = zzamVar9.zzm(zza(), str6, length + 1, true, zZzai, false, zEquals, false);
                                                long j3 = zzakVarZzm.zzb;
                                                zzg();
                                                jIntValue = j3 - ((Integer) zzdu.zzj.zza(obj)).intValue();
                                                if (jIntValue <= 0) {
                                                }
                                            }
                                        } catch (SQLiteException e2) {
                                            e = e2;
                                        }
                                    } catch (SQLiteException e3) {
                                        e = e3;
                                    }
                                    obj = null;
                                    zzkyVar = new zzky(str6, zzawVarZza.zzc, strConcat, zzav().currentTimeMillis(), Long.valueOf(jLongValue));
                                    zzkyVar2 = zzkyVar;
                                    zzamVar2 = this.zze;
                                    zzal(zzamVar2);
                                    if (!zzamVar2.zzL(zzkyVar2)) {
                                        zzay().zzd().zzd("Too many unique user properties are set. Ignoring user property. appId", zzeh.zzn(str6), this.zzn.zzj().zzf(zzkyVar2.zzc), zzkyVar2.zze);
                                        zzv().zzN(this.zzF, str6, 9, null, null, 0);
                                    }
                                }
                            } else {
                                str = "metadata_fingerprint";
                                str2 = "_err";
                                zzamVar = this.zze;
                                zzal(zzamVar);
                                int iZze2 = zzg().zze(str6, zzdu.zzD) - 1;
                                Preconditions.checkNotEmpty(str6);
                                zzamVar.zzg();
                                zzamVar.zzW();
                                SQLiteDatabase sQLiteDatabaseZzh2 = zzamVar.zzh();
                                String[] strArr2 = new String[3];
                                strArr2[0] = str6;
                                strArr2[1] = str6;
                                strArr2[2] = String.valueOf(iZze2);
                                sQLiteDatabaseZzh2.execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);", strArr2);
                                obj = null;
                                zzkyVar = new zzky(str6, zzawVarZza.zzc, strConcat, zzav().currentTimeMillis(), Long.valueOf(jLongValue));
                                zzkyVar2 = zzkyVar;
                                zzamVar2 = this.zze;
                                zzal(zzamVar2);
                                if (!zzamVar2.zzL(zzkyVar2)) {
                                }
                            }
                        } else {
                            str = "metadata_fingerprint";
                            str2 = "_err";
                            obj = null;
                        }
                    }
                } else {
                    if (z) {
                        z = true;
                        strZzg = zzawVarZza.zzb.zzg(FirebaseAnalytics.Param.CURRENCY);
                        if (z) {
                        }
                        if (TextUtils.isEmpty(strZzg)) {
                        }
                    }
                    str = "metadata_fingerprint";
                    str2 = "_err";
                    obj = null;
                }
                boolean zZzai2 = zzlb.zzai(zzawVarZza.zza);
                boolean zEquals2 = str2.equals(zzawVarZza.zza);
                zzv();
                zzauVar = zzawVarZza.zzb;
                if (zzauVar != null) {
                    length = 0;
                } else {
                    zzat zzatVar2 = new zzat(zzauVar);
                    length = 0;
                    while (zzatVar2.hasNext()) {
                        if (zzauVar.zzf(zzatVar2.next()) instanceof Parcelable[]) {
                            length += ((Parcelable[]) r13).length;
                        }
                    }
                }
                zzam zzamVar92 = this.zze;
                zzal(zzamVar92);
                zzak zzakVarZzm2 = zzamVar92.zzm(zza(), str6, length + 1, true, zZzai2, false, zEquals2, false);
                long j32 = zzakVarZzm2.zzb;
                zzg();
                jIntValue = j32 - ((Integer) zzdu.zzj.zza(obj)).intValue();
                if (jIntValue <= 0) {
                    if (jIntValue % 1000 == 1) {
                        zzay().zzd().zzc("Data loss. Too many events logged. appId, count", zzeh.zzn(str6), Long.valueOf(zzakVarZzm2.zzb));
                    }
                    zzam zzamVar10 = this.zze;
                    zzal(zzamVar10);
                    zzamVar10.zzC();
                    return;
                }
                if (zZzai2) {
                    long j4 = zzakVarZzm2.zza;
                    zzg();
                    str3 = str6;
                    long jIntValue2 = j4 - ((Integer) zzdu.zzl.zza(obj)).intValue();
                    if (jIntValue2 > 0) {
                        if (jIntValue2 % 1000 == 1) {
                            zzay().zzd().zzc("Data loss. Too many public events logged. appId, count", zzeh.zzn(str3), Long.valueOf(zzakVarZzm2.zza));
                        }
                        zzv().zzN(this.zzF, str3, 16, "_ev", zzawVarZza.zza, 0);
                        zzam zzamVar11 = this.zze;
                        zzal(zzamVar11);
                        zzamVar11.zzC();
                        return;
                    }
                } else {
                    str3 = str6;
                }
                if (zEquals2) {
                    i = 0;
                    long jMax = zzakVarZzm2.zzd - Math.max(0, Math.min(1000000, zzg().zze(zzqVar.zza, zzdu.zzk)));
                    if (jMax > 0) {
                        if (jMax == 1) {
                            zzay().zzd().zzc("Too many error events logged. appId, count", zzeh.zzn(str3), Long.valueOf(zzakVarZzm2.zzd));
                        }
                        zzam zzamVar12 = this.zze;
                        zzal(zzamVar12);
                        zzamVar12.zzC();
                        return;
                    }
                } else {
                    i = 0;
                }
                Bundle bundleZzc = zzawVarZza.zzb.zzc();
                zzv().zzO(bundleZzc, "_o", zzawVarZza.zzc);
                String str7 = str3;
                if (zzv().zzae(str7)) {
                    zzv().zzO(bundleZzc, "_dbg", 1L);
                    zzv().zzO(bundleZzc, "_r", 1L);
                }
                if ("_s".equals(zzawVarZza.zza)) {
                    zzam zzamVar13 = this.zze;
                    zzal(zzamVar13);
                    zzky zzkyVarZzp2 = zzamVar13.zzp(zzqVar.zza, "_sno");
                    if (zzkyVarZzp2 != null && (zzkyVarZzp2.zze instanceof Long)) {
                        zzv().zzO(bundleZzc, "_sno", zzkyVarZzp2.zze);
                    }
                }
                zzam zzamVar14 = this.zze;
                zzal(zzamVar14);
                Preconditions.checkNotEmpty(str7);
                zzamVar14.zzg();
                zzamVar14.zzW();
                try {
                    str4 = "raw_events";
                    try {
                        jDelete = zzamVar14.zzh().delete(str4, "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str7, String.valueOf(Math.max(i, Math.min(1000000, zzamVar14.zzt.zzf().zze(str7, zzdu.zzo))))});
                    } catch (SQLiteException e4) {
                        e = e4;
                        zzamVar14.zzt.zzay().zzd().zzc("Error deleting over the limit events. appId", zzeh.zzn(str7), e);
                        jDelete = 0;
                        if (jDelete > 0) {
                        }
                        zzfr zzfrVar = this.zzn;
                        String str8 = zzawVarZza.zzc;
                        String str9 = zzawVarZza.zza;
                        long j5 = zzawVarZza.zzd;
                        str5 = str4;
                        zzarVar = new zzar(zzfrVar, str8, str7, str9, j5, 0L, bundleZzc);
                        zzam zzamVar15 = this.zze;
                        zzal(zzamVar15);
                        zzasVarZzn = zzamVar15.zzn(str7, zzarVar.zzb);
                        if (zzasVarZzn != null) {
                        }
                        zzam zzamVar16 = this.zze;
                        zzal(zzamVar16);
                        zzamVar16.zzE(zzasVarZzc);
                        zzaz().zzg();
                        zzB();
                        Preconditions.checkNotNull(zzarVar);
                        Preconditions.checkNotNull(zzqVar);
                        Preconditions.checkNotEmpty(zzarVar.zza);
                        Preconditions.checkArgument(zzarVar.zza.equals(zzqVar.zza));
                        zzgcVarZzt = com.google.android.gms.internal.measurement.zzgd.zzt();
                        zzgcVarZzt.zzad(1);
                        zzgcVarZzt.zzZ(CredentialsData.CREDENTIALS_TYPE_ANDROID);
                        if (!TextUtils.isEmpty(zzqVar.zza)) {
                        }
                        if (!TextUtils.isEmpty(zzqVar.zzd)) {
                        }
                        if (!TextUtils.isEmpty(zzqVar.zzc)) {
                        }
                        zzpd.zzc();
                        if (zzg().zzs(null, zzdu.zzal)) {
                            zzgcVarZzt.zzah(zzqVar.zzx);
                        }
                        j = zzqVar.zzj;
                        if (j != -2147483648L) {
                        }
                        zzgcVarZzt.zzV(zzqVar.zze);
                        if (!TextUtils.isEmpty(zzqVar.zzb)) {
                        }
                        zzgcVarZzt.zzL(zzh((String) Preconditions.checkNotNull(zzqVar.zza)).zzc(zzai.zzb(zzqVar.zzv)).zzh());
                        if (zzgcVarZzt.zzaq().isEmpty()) {
                            zzgcVarZzt.zzC(zzqVar.zzq);
                        }
                        j2 = zzqVar.zzf;
                        if (j2 != 0) {
                        }
                        zzgcVarZzt.zzP(zzqVar.zzs);
                        zzkv zzkvVar = this.zzi;
                        zzal(zzkvVar);
                        mapZzc = zzdu.zzc(zzkvVar.zzf.zzn.zzau());
                        if (mapZzc != null) {
                            arrayList = null;
                        }
                        if (arrayList != null) {
                        }
                        zzaiVarZzc = zzh((String) Preconditions.checkNotNull(zzqVar.zza)).zzc(zzai.zzb(zzqVar.zzv));
                        zzahVar = zzah.AD_STORAGE;
                        if (zzaiVarZzc.zzi(zzahVar)) {
                            pairZzd = this.zzk.zzd(zzqVar.zza, zzaiVarZzc);
                            if (!TextUtils.isEmpty((CharSequence) pairZzd.first)) {
                                zzgcVarZzt.zzae((String) pairZzd.first);
                                obj2 = pairZzd.second;
                                if (obj2 != null) {
                                }
                            }
                        }
                        this.zzn.zzg().zzu();
                        zzgcVarZzt.zzN(Build.MODEL);
                        this.zzn.zzg().zzu();
                        zzgcVarZzt.zzY(Build.VERSION.RELEASE);
                        zzgcVarZzt.zzaj((int) this.zzn.zzg().zzb());
                        zzgcVarZzt.zzan(this.zzn.zzg().zzc());
                        if (this.zzn.zzJ()) {
                        }
                        zzam zzamVar17 = this.zze;
                        zzal(zzamVar17);
                        zzhVarZzj = zzamVar17.zzj(zzqVar.zza);
                        if (zzhVarZzj == null) {
                        }
                        if (zzaiVarZzc.zzi(zzah.ANALYTICS_STORAGE)) {
                            zzgcVarZzt.zzE((String) Preconditions.checkNotNull(zzhVarZzj.zzu()));
                        }
                        if (!TextUtils.isEmpty(zzhVarZzj.zzx())) {
                        }
                        zzam zzamVar18 = this.zze;
                        zzal(zzamVar18);
                        listZzu = zzamVar18.zzu(zzqVar.zza);
                        while (i2 < listZzu.size()) {
                        }
                        zzamVar3 = this.zze;
                        zzal(zzamVar3);
                        com.google.android.gms.internal.measurement.zzgd zzgdVar = (com.google.android.gms.internal.measurement.zzgd) zzgcVarZzt.zzaC();
                        zzamVar3.zzg();
                        zzamVar3.zzW();
                        Preconditions.checkNotNull(zzgdVar);
                        Preconditions.checkNotEmpty(zzgdVar.zzx());
                        byte[] bArrZzbu = zzgdVar.zzbu();
                        zzkv zzkvVar2 = zzamVar3.zzf.zzi;
                        zzal(zzkvVar2);
                        long jZzd = zzkvVar2.zzd(bArrZzbu);
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put("app_id", zzgdVar.zzx());
                        String str10 = str;
                        contentValues2.put(str10, Long.valueOf(jZzd));
                        contentValues2.put("metadata", bArrZzbu);
                        try {
                            zzamVar3.zzh().insertWithOnConflict("raw_events_metadata", null, contentValues2, 4);
                            zzamVar4 = this.zze;
                            zzal(zzamVar4);
                            zzatVar = new zzat(zzarVar.zzf);
                            while (true) {
                                if (!zzatVar.hasNext()) {
                                }
                            }
                            i3 = 1;
                            zzamVar4.zzg();
                            zzamVar4.zzW();
                            Preconditions.checkNotNull(zzarVar);
                            Preconditions.checkNotEmpty(zzarVar.zza);
                            zzkv zzkvVar3 = zzamVar4.zzf.zzi;
                            zzal(zzkvVar3);
                            byte[] bArrZzbu2 = zzkvVar3.zzj(zzarVar).zzbu();
                            contentValues = new ContentValues();
                            contentValues.put("app_id", zzarVar.zza);
                            contentValues.put("name", zzarVar.zzb);
                            contentValues.put("timestamp", Long.valueOf(zzarVar.zzd));
                            contentValues.put(str10, Long.valueOf(jZzd));
                            contentValues.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, bArrZzbu2);
                            contentValues.put("realtime", Integer.valueOf(i3));
                            if (zzamVar4.zzh().insert(str5, null, contentValues) != -1) {
                            }
                            zzam zzamVar19 = this.zze;
                            zzal(zzamVar19);
                            zzamVar19.zzC();
                            zzam zzamVar20 = this.zze;
                            zzal(zzamVar20);
                            zzamVar20.zzx();
                            zzag();
                            zzay().zzj().zzb("Background event processing time, ms", Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000));
                        } catch (SQLiteException e5) {
                            zzamVar3.zzt.zzay().zzd().zzc("Error storing raw event metadata. appId", zzeh.zzn(zzgdVar.zzx()), e5);
                            throw e5;
                        }
                    }
                } catch (SQLiteException e6) {
                    e = e6;
                    str4 = "raw_events";
                }
                if (jDelete > 0) {
                    zzay().zzk().zzc("Data lost. Too many events stored on disk, deleted. appId", zzeh.zzn(str7), Long.valueOf(jDelete));
                }
                zzfr zzfrVar2 = this.zzn;
                String str82 = zzawVarZza.zzc;
                String str92 = zzawVarZza.zza;
                long j52 = zzawVarZza.zzd;
                str5 = str4;
                zzarVar = new zzar(zzfrVar2, str82, str7, str92, j52, 0L, bundleZzc);
                zzam zzamVar152 = this.zze;
                zzal(zzamVar152);
                zzasVarZzn = zzamVar152.zzn(str7, zzarVar.zzb);
                if (zzasVarZzn != null) {
                    zzam zzamVar21 = this.zze;
                    zzal(zzamVar21);
                    if (zzamVar21.zzf(str7) >= zzg().zzb(str7) && zZzai2) {
                        zzay().zzd().zzd("Too many event names used, ignoring event. appId, name, supported count", zzeh.zzn(str7), this.zzn.zzj().zzd(zzarVar.zzb), Integer.valueOf(zzg().zzb(str7)));
                        zzv().zzN(this.zzF, str7, 8, null, null, 0);
                        return;
                    }
                    zzasVarZzc = new zzas(str7, zzarVar.zzb, 0L, 0L, 0L, zzarVar.zzd, 0L, null, null, null, null);
                } else {
                    zzarVar = zzarVar.zza(this.zzn, zzasVarZzn.zzf);
                    zzasVarZzc = zzasVarZzn.zzc(zzarVar.zzd);
                }
                zzam zzamVar162 = this.zze;
                zzal(zzamVar162);
                zzamVar162.zzE(zzasVarZzc);
                zzaz().zzg();
                zzB();
                Preconditions.checkNotNull(zzarVar);
                Preconditions.checkNotNull(zzqVar);
                Preconditions.checkNotEmpty(zzarVar.zza);
                Preconditions.checkArgument(zzarVar.zza.equals(zzqVar.zza));
                zzgcVarZzt = com.google.android.gms.internal.measurement.zzgd.zzt();
                zzgcVarZzt.zzad(1);
                zzgcVarZzt.zzZ(CredentialsData.CREDENTIALS_TYPE_ANDROID);
                if (!TextUtils.isEmpty(zzqVar.zza)) {
                    zzgcVarZzt.zzD(zzqVar.zza);
                }
                if (!TextUtils.isEmpty(zzqVar.zzd)) {
                    zzgcVarZzt.zzF(zzqVar.zzd);
                }
                if (!TextUtils.isEmpty(zzqVar.zzc)) {
                    zzgcVarZzt.zzG(zzqVar.zzc);
                }
                zzpd.zzc();
                if (zzg().zzs(null, zzdu.zzal) && zzg().zzs(zzqVar.zza, zzdu.zzan) && !TextUtils.isEmpty(zzqVar.zzx)) {
                    zzgcVarZzt.zzah(zzqVar.zzx);
                }
                j = zzqVar.zzj;
                if (j != -2147483648L) {
                    zzgcVarZzt.zzH((int) j);
                }
                zzgcVarZzt.zzV(zzqVar.zze);
                if (!TextUtils.isEmpty(zzqVar.zzb)) {
                    zzgcVarZzt.zzU(zzqVar.zzb);
                }
                zzgcVarZzt.zzL(zzh((String) Preconditions.checkNotNull(zzqVar.zza)).zzc(zzai.zzb(zzqVar.zzv)).zzh());
                if (zzgcVarZzt.zzaq().isEmpty() && !TextUtils.isEmpty(zzqVar.zzq)) {
                    zzgcVarZzt.zzC(zzqVar.zzq);
                }
                j2 = zzqVar.zzf;
                if (j2 != 0) {
                    zzgcVarZzt.zzM(j2);
                }
                zzgcVarZzt.zzP(zzqVar.zzs);
                zzkv zzkvVar4 = this.zzi;
                zzal(zzkvVar4);
                mapZzc = zzdu.zzc(zzkvVar4.zzf.zzn.zzau());
                if (mapZzc != null || mapZzc.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList();
                    int iIntValue = ((Integer) zzdu.zzO.zza(null)).intValue();
                    for (Map.Entry entry : mapZzc.entrySet()) {
                        if (((String) entry.getKey()).startsWith("measurement.id.")) {
                            try {
                                int i4 = Integer.parseInt((String) entry.getValue());
                                if (i4 != 0) {
                                    arrayList.add(Integer.valueOf(i4));
                                    if (arrayList.size() >= iIntValue) {
                                        zzkvVar4.zzt.zzay().zzk().zzb("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                                        break;
                                    }
                                    continue;
                                } else {
                                    continue;
                                }
                            } catch (NumberFormatException e7) {
                                zzkvVar4.zzt.zzay().zzk().zzb("Experiment ID NumberFormatException", e7);
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                    }
                }
                if (arrayList != null) {
                    zzgcVarZzt.zzh(arrayList);
                }
                zzaiVarZzc = zzh((String) Preconditions.checkNotNull(zzqVar.zza)).zzc(zzai.zzb(zzqVar.zzv));
                zzahVar = zzah.AD_STORAGE;
                if (zzaiVarZzc.zzi(zzahVar) && zzqVar.zzo) {
                    pairZzd = this.zzk.zzd(zzqVar.zza, zzaiVarZzc);
                    if (!TextUtils.isEmpty((CharSequence) pairZzd.first) && zzqVar.zzo) {
                        zzgcVarZzt.zzae((String) pairZzd.first);
                        obj2 = pairZzd.second;
                        if (obj2 != null) {
                            zzgcVarZzt.zzX(((Boolean) obj2).booleanValue());
                        }
                    }
                }
                this.zzn.zzg().zzu();
                zzgcVarZzt.zzN(Build.MODEL);
                this.zzn.zzg().zzu();
                zzgcVarZzt.zzY(Build.VERSION.RELEASE);
                zzgcVarZzt.zzaj((int) this.zzn.zzg().zzb());
                zzgcVarZzt.zzan(this.zzn.zzg().zzc());
                if (this.zzn.zzJ()) {
                    zzgcVarZzt.zzap();
                    if (!TextUtils.isEmpty(null)) {
                        zzgcVarZzt.zzO(null);
                    }
                }
                zzam zzamVar172 = this.zze;
                zzal(zzamVar172);
                zzhVarZzj = zzamVar172.zzj(zzqVar.zza);
                if (zzhVarZzj == null) {
                    zzhVarZzj = new zzh(this.zzn, zzqVar.zza);
                    zzhVarZzj.zzH(zzw(zzaiVarZzc));
                    zzhVarZzj.zzV(zzqVar.zzk);
                    zzhVarZzj.zzW(zzqVar.zzb);
                    if (zzaiVarZzc.zzi(zzahVar)) {
                        zzhVarZzj.zzae(this.zzk.zzf(zzqVar.zza, zzqVar.zzo));
                    }
                    zzhVarZzj.zzaa(0L);
                    zzhVarZzj.zzab(0L);
                    zzhVarZzj.zzZ(0L);
                    zzhVarZzj.zzJ(zzqVar.zzc);
                    zzhVarZzj.zzK(zzqVar.zzj);
                    zzhVarZzj.zzI(zzqVar.zzd);
                    zzhVarZzj.zzX(zzqVar.zze);
                    zzhVarZzj.zzS(zzqVar.zzf);
                    zzhVarZzj.zzac(zzqVar.zzh);
                    zzhVarZzj.zzT(zzqVar.zzs);
                    zzam zzamVar22 = this.zze;
                    zzal(zzamVar22);
                    zzamVar22.zzD(zzhVarZzj);
                }
                if (zzaiVarZzc.zzi(zzah.ANALYTICS_STORAGE) && !TextUtils.isEmpty(zzhVarZzj.zzu())) {
                    zzgcVarZzt.zzE((String) Preconditions.checkNotNull(zzhVarZzj.zzu()));
                }
                if (!TextUtils.isEmpty(zzhVarZzj.zzx())) {
                    zzgcVarZzt.zzT((String) Preconditions.checkNotNull(zzhVarZzj.zzx()));
                }
                zzam zzamVar182 = this.zze;
                zzal(zzamVar182);
                listZzu = zzamVar182.zzu(zzqVar.zza);
                for (i2 = 0; i2 < listZzu.size(); i2++) {
                    com.google.android.gms.internal.measurement.zzgl zzglVarZzd = com.google.android.gms.internal.measurement.zzgm.zzd();
                    zzglVarZzd.zzf(((zzky) listZzu.get(i2)).zzc);
                    zzglVarZzd.zzg(((zzky) listZzu.get(i2)).zzd);
                    zzkv zzkvVar5 = this.zzi;
                    zzal(zzkvVar5);
                    zzkvVar5.zzu(zzglVarZzd, ((zzky) listZzu.get(i2)).zze);
                    zzgcVarZzt.zzl(zzglVarZzd);
                }
                try {
                    zzamVar3 = this.zze;
                    zzal(zzamVar3);
                    com.google.android.gms.internal.measurement.zzgd zzgdVar2 = (com.google.android.gms.internal.measurement.zzgd) zzgcVarZzt.zzaC();
                    zzamVar3.zzg();
                    zzamVar3.zzW();
                    Preconditions.checkNotNull(zzgdVar2);
                    Preconditions.checkNotEmpty(zzgdVar2.zzx());
                    byte[] bArrZzbu3 = zzgdVar2.zzbu();
                    zzkv zzkvVar22 = zzamVar3.zzf.zzi;
                    zzal(zzkvVar22);
                    long jZzd2 = zzkvVar22.zzd(bArrZzbu3);
                    ContentValues contentValues22 = new ContentValues();
                    contentValues22.put("app_id", zzgdVar2.zzx());
                    String str102 = str;
                    contentValues22.put(str102, Long.valueOf(jZzd2));
                    contentValues22.put("metadata", bArrZzbu3);
                    zzamVar3.zzh().insertWithOnConflict("raw_events_metadata", null, contentValues22, 4);
                    zzamVar4 = this.zze;
                    zzal(zzamVar4);
                    zzatVar = new zzat(zzarVar.zzf);
                    while (true) {
                        if (!zzatVar.hasNext()) {
                            if ("_r".equals(zzatVar.next())) {
                                break;
                            }
                        } else {
                            zzfi zzfiVar4 = this.zzc;
                            zzal(zzfiVar4);
                            boolean zZzq = zzfiVar4.zzq(zzarVar.zza, zzarVar.zzb);
                            zzam zzamVar23 = this.zze;
                            zzal(zzamVar23);
                            zzak zzakVarZzl = zzamVar23.zzl(zza(), zzarVar.zza, false, false, false, false, false);
                            if (!zZzq || zzakVarZzl.zze >= zzg().zze(zzarVar.zza, zzdu.zzn)) {
                                i3 = 0;
                            }
                        }
                    }
                    i3 = 1;
                    zzamVar4.zzg();
                    zzamVar4.zzW();
                    Preconditions.checkNotNull(zzarVar);
                    Preconditions.checkNotEmpty(zzarVar.zza);
                    zzkv zzkvVar32 = zzamVar4.zzf.zzi;
                    zzal(zzkvVar32);
                    byte[] bArrZzbu22 = zzkvVar32.zzj(zzarVar).zzbu();
                    contentValues = new ContentValues();
                    contentValues.put("app_id", zzarVar.zza);
                    contentValues.put("name", zzarVar.zzb);
                    contentValues.put("timestamp", Long.valueOf(zzarVar.zzd));
                    contentValues.put(str102, Long.valueOf(jZzd2));
                    contentValues.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, bArrZzbu22);
                    contentValues.put("realtime", Integer.valueOf(i3));
                    try {
                        if (zzamVar4.zzh().insert(str5, null, contentValues) != -1) {
                            zzamVar4.zzt.zzay().zzd().zzb("Failed to insert raw event (got -1). appId", zzeh.zzn(zzarVar.zza));
                        } else {
                            this.zza = 0L;
                        }
                    } catch (SQLiteException e8) {
                        zzamVar4.zzt.zzay().zzd().zzc("Error storing raw event. appId", zzeh.zzn(zzarVar.zza), e8);
                    }
                } catch (IOException e9) {
                    zzay().zzd().zzc("Data loss. Failed to insert raw event metadata. appId", zzeh.zzn(zzgcVarZzt.zzap()), e9);
                }
                zzam zzamVar192 = this.zze;
                zzal(zzamVar192);
                zzamVar192.zzC();
                zzam zzamVar202 = this.zze;
                zzal(zzamVar202);
                zzamVar202.zzx();
                zzag();
                zzay().zzj().zzb("Background event processing time, ms", Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000));
            } finally {
                zzam zzamVar24 = this.zze;
                zzal(zzamVar24);
                zzamVar24.zzx();
            }
        }
    }

    @VisibleForTesting
    public final boolean zzZ() throws IOException {
        zzaz().zzg();
        FileLock fileLock = this.zzw;
        if (fileLock != null && fileLock.isValid()) {
            zzay().zzj().zza("Storage concurrent access okay");
            return true;
        }
        this.zze.zzt.zzf();
        try {
            FileChannel channel = new RandomAccessFile(new File(this.zzn.zzau().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
            this.zzx = channel;
            FileLock fileLockTryLock = channel.tryLock();
            this.zzw = fileLockTryLock;
            if (fileLockTryLock != null) {
                zzay().zzj().zza("Storage concurrent access okay");
                return true;
            }
            zzay().zzd().zza("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e) {
            zzay().zzd().zzb("Failed to acquire storage lock", e);
            return false;
        } catch (IOException e2) {
            zzay().zzd().zzb("Failed to access storage lock file", e2);
            return false;
        } catch (OverlappingFileLockException e3) {
            zzay().zzk().zzb("Storage lock already acquired", e3);
            return false;
        }
    }

    public final long zza() {
        long jCurrentTimeMillis = zzav().currentTimeMillis();
        zzjo zzjoVar = this.zzk;
        zzjoVar.zzW();
        zzjoVar.zzg();
        long jZza = zzjoVar.zze.zza();
        if (jZza == 0) {
            jZza = zzjoVar.zzt.zzv().zzG().nextInt(86400000) + 1;
            zzjoVar.zze.zzb(jZza);
        }
        return ((((jCurrentTimeMillis + jZza) / 1000) / 60) / 60) / 24;
    }

    @Override // com.google.android.gms.measurement.internal.zzgm
    public final Context zzau() {
        return this.zzn.zzau();
    }

    @Override // com.google.android.gms.measurement.internal.zzgm
    public final Clock zzav() {
        return ((zzfr) Preconditions.checkNotNull(this.zzn)).zzav();
    }

    @Override // com.google.android.gms.measurement.internal.zzgm
    public final zzab zzaw() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzgm
    public final zzeh zzay() {
        return ((zzfr) Preconditions.checkNotNull(this.zzn)).zzay();
    }

    @Override // com.google.android.gms.measurement.internal.zzgm
    public final zzfo zzaz() {
        return ((zzfr) Preconditions.checkNotNull(this.zzn)).zzaz();
    }

    public final zzh zzd(zzq zzqVar) {
        zzaz().zzg();
        zzB();
        Preconditions.checkNotNull(zzqVar);
        Preconditions.checkNotEmpty(zzqVar.zza);
        zzkr zzkrVar = null;
        if (!zzqVar.zzw.isEmpty()) {
            this.zzC.put(zzqVar.zza, new zzks(this, zzqVar.zzw));
        }
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        zzh zzhVarZzj = zzamVar.zzj(zzqVar.zza);
        zzai zzaiVarZzc = zzh(zzqVar.zza).zzc(zzai.zzb(zzqVar.zzv));
        zzah zzahVar = zzah.AD_STORAGE;
        String strZzf = zzaiVarZzc.zzi(zzahVar) ? this.zzk.zzf(zzqVar.zza, zzqVar.zzo) : "";
        if (zzhVarZzj == null) {
            zzhVarZzj = new zzh(this.zzn, zzqVar.zza);
            if (zzaiVarZzc.zzi(zzah.ANALYTICS_STORAGE)) {
                zzhVarZzj.zzH(zzw(zzaiVarZzc));
            }
            if (zzaiVarZzc.zzi(zzahVar)) {
                zzhVarZzj.zzae(strZzf);
            }
        } else if (zzaiVarZzc.zzi(zzahVar) && strZzf != null && !strZzf.equals(zzhVarZzj.zzA())) {
            zzhVarZzj.zzae(strZzf);
            if (zzqVar.zzo && !"00000000-0000-0000-0000-000000000000".equals(this.zzk.zzd(zzqVar.zza, zzaiVarZzc).first)) {
                zzhVarZzj.zzH(zzw(zzaiVarZzc));
                zzam zzamVar2 = this.zze;
                zzal(zzamVar2);
                if (zzamVar2.zzp(zzqVar.zza, "_id") != null) {
                    zzam zzamVar3 = this.zze;
                    zzal(zzamVar3);
                    if (zzamVar3.zzp(zzqVar.zza, "_lair") == null) {
                        zzky zzkyVar = new zzky(zzqVar.zza, "auto", "_lair", zzav().currentTimeMillis(), 1L);
                        zzam zzamVar4 = this.zze;
                        zzal(zzamVar4);
                        zzamVar4.zzL(zzkyVar);
                    }
                }
            }
        } else if (TextUtils.isEmpty(zzhVarZzj.zzu()) && zzaiVarZzc.zzi(zzah.ANALYTICS_STORAGE)) {
            zzhVarZzj.zzH(zzw(zzaiVarZzc));
        }
        zzhVarZzj.zzW(zzqVar.zzb);
        zzhVarZzj.zzF(zzqVar.zzq);
        if (!TextUtils.isEmpty(zzqVar.zzk)) {
            zzhVarZzj.zzV(zzqVar.zzk);
        }
        long j = zzqVar.zze;
        if (j != 0) {
            zzhVarZzj.zzX(j);
        }
        if (!TextUtils.isEmpty(zzqVar.zzc)) {
            zzhVarZzj.zzJ(zzqVar.zzc);
        }
        zzhVarZzj.zzK(zzqVar.zzj);
        String str = zzqVar.zzd;
        if (str != null) {
            zzhVarZzj.zzI(str);
        }
        zzhVarZzj.zzS(zzqVar.zzf);
        zzhVarZzj.zzac(zzqVar.zzh);
        if (!TextUtils.isEmpty(zzqVar.zzg)) {
            zzhVarZzj.zzY(zzqVar.zzg);
        }
        zzhVarZzj.zzG(zzqVar.zzo);
        zzhVarZzj.zzad(zzqVar.zzr);
        zzhVarZzj.zzT(zzqVar.zzs);
        zzpd.zzc();
        if (zzg().zzs(null, zzdu.zzal) && zzg().zzs(zzqVar.zza, zzdu.zzan)) {
            zzhVarZzj.zzag(zzqVar.zzx);
        }
        zznt.zzc();
        if (zzg().zzs(null, zzdu.zzaj)) {
            zzhVarZzj.zzaf(zzqVar.zzt);
        } else {
            zznt.zzc();
            if (zzg().zzs(null, zzdu.zzai)) {
                zzhVarZzj.zzaf(null);
            }
        }
        if (zzhVarZzj.zzaj()) {
            zzam zzamVar5 = this.zze;
            zzal(zzamVar5);
            zzamVar5.zzD(zzhVarZzj);
        }
        return zzhVarZzj;
    }

    public final zzaa zzf() {
        zzaa zzaaVar = this.zzh;
        zzal(zzaaVar);
        return zzaaVar;
    }

    public final zzag zzg() {
        return ((zzfr) Preconditions.checkNotNull(this.zzn)).zzf();
    }

    public final zzai zzh(String str) {
        String string;
        zzai zzaiVar = zzai.zza;
        zzaz().zzg();
        zzB();
        zzai zzaiVar2 = (zzai) this.zzB.get(str);
        if (zzaiVar2 != null) {
            return zzaiVar2;
        }
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        Preconditions.checkNotNull(str);
        zzamVar.zzg();
        zzamVar.zzW();
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = zzamVar.zzh().rawQuery("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str});
                if (cursorRawQuery.moveToFirst()) {
                    string = cursorRawQuery.getString(0);
                    cursorRawQuery.close();
                } else {
                    cursorRawQuery.close();
                    string = "G1";
                }
                zzai zzaiVarZzb = zzai.zzb(string);
                zzV(str, zzaiVarZzb);
                return zzaiVarZzb;
            } catch (SQLiteException e) {
                zzamVar.zzt.zzay().zzd().zzc("Database error", "select consent_state from consent_settings where app_id=? limit 1;", e);
                throw e;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    public final zzam zzi() {
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        return zzamVar;
    }

    public final zzec zzj() {
        return this.zzn.zzj();
    }

    public final zzen zzl() {
        zzen zzenVar = this.zzd;
        zzal(zzenVar);
        return zzenVar;
    }

    public final zzep zzm() {
        zzep zzepVar = this.zzf;
        if (zzepVar != null) {
            return zzepVar;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public final zzfi zzo() {
        zzfi zzfiVar = this.zzc;
        zzal(zzfiVar);
        return zzfiVar;
    }

    public final zzfr zzq() {
        return this.zzn;
    }

    public final zzic zzr() {
        zzic zzicVar = this.zzj;
        zzal(zzicVar);
        return zzicVar;
    }

    public final zzjo zzs() {
        return this.zzk;
    }

    public final zzkv zzu() {
        zzkv zzkvVar = this.zzi;
        zzal(zzkvVar);
        return zzkvVar;
    }

    public final zzlb zzv() {
        return ((zzfr) Preconditions.checkNotNull(this.zzn)).zzv();
    }

    public final String zzw(zzai zzaiVar) {
        if (!zzaiVar.zzi(zzah.ANALYTICS_STORAGE)) {
            return null;
        }
        byte[] bArr = new byte[16];
        zzv().zzG().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final String zzx(zzq zzqVar) {
        try {
            return (String) zzaz().zzh(new zzkm(this, zzqVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zzay().zzd().zzc("Failed to get app instance id. appId", zzeh.zzn(zzqVar.zza), e);
            return null;
        }
    }

    public final void zzz(Runnable runnable) {
        zzaz().zzg();
        if (this.zzq == null) {
            this.zzq = new ArrayList();
        }
        this.zzq.add(runnable);
    }
}
