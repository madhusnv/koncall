package ug;

import android.app.BroadcastOptions;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import bg.C0658c;
import bk.RunnableC0683n;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.google.android.gms.internal.measurement.p8;
import com.google.android.gms.internal.measurement.zzmr;
import e1.C1903e;
import ec.C2019q;
import ia.C3220l;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import l1.C4327p;
import sf.AbstractC6840z;
import uf.C7427b;
import yk.C8687a;
import zf.C8946a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class h4 implements u1 {

    /* renamed from: T */
    public static volatile h4 f35472T;

    /* renamed from: B */
    public FileChannel f35473B;

    /* renamed from: C */
    public ArrayList f35474C;

    /* renamed from: D */
    public ArrayList f35475D;

    /* renamed from: F */
    public final HashMap f35477F;

    /* renamed from: G */
    public final HashMap f35478G;

    /* renamed from: H */
    public final HashMap f35479H;

    /* renamed from: K */
    public x2 f35481K;

    /* renamed from: L */
    public String f35482L;

    /* renamed from: M */
    public r3 f35483M;

    /* renamed from: N */
    public long f35484N;

    /* renamed from: a */
    public final i1 f35486a;

    /* renamed from: b */
    public final y0 f35487b;

    /* renamed from: c */
    public C7443n f35488c;

    /* renamed from: d */
    public a1 f35489d;

    /* renamed from: e */
    public x3 f35490e;

    /* renamed from: f */
    public C7432c f35491f;

    /* renamed from: g */
    public final y0 f35492g;

    /* renamed from: h */
    public y0 f35493h;

    /* renamed from: j */
    public m3 f35494j;

    /* renamed from: l */
    public f1 f35496l;

    /* renamed from: m */
    public final n1 f35497m;

    /* renamed from: p */
    public boolean f35499p;

    /* renamed from: q */
    public long f35500q;

    /* renamed from: r */
    public ArrayList f35501r;

    /* renamed from: t */
    public int f35503t;

    /* renamed from: v */
    public int f35504v;

    /* renamed from: w */
    public boolean f35505w;

    /* renamed from: x */
    public boolean f35506x;

    /* renamed from: y */
    public boolean f35507y;

    /* renamed from: z */
    public FileLock f35508z;

    /* renamed from: n */
    public final AtomicBoolean f35498n = new AtomicBoolean(false);

    /* renamed from: s */
    public final LinkedList f35502s = new LinkedList();

    /* renamed from: I */
    public final HashMap f35480I = new HashMap();

    /* renamed from: O */
    public final l4.d0 f35485O = new l4.d0(26, this);

    /* renamed from: E */
    public long f35476E = -1;

    /* renamed from: k */
    public final e4 f35495k = new e4(this);

    public h4(g1 g1Var) {
        this.f35497m = n1.m14086s((Context) g1Var.f35448a, null, null);
        y0 y0Var = new y0(this, 2);
        y0Var.m13859O();
        this.f35492g = y0Var;
        y0 y0Var2 = new y0(this, 0);
        y0Var2.m13859O();
        this.f35487b = y0Var2;
        i1 i1Var = new i1(this);
        i1Var.m13859O();
        this.f35486a = i1Var;
        this.f35477F = new HashMap();
        this.f35478G = new HashMap();
        this.f35479H = new HashMap();
        mo327b().m14047V(new RunnableC0683n(this, g1Var));
    }

    /* renamed from: C */
    public static h4 m13938C(Context context) {
        AbstractC6840z.m13036g(context);
        AbstractC6840z.m13036g(context.getApplicationContext());
        if (f35472T == null) {
            synchronized (h4.class) {
                try {
                    if (f35472T == null) {
                        g1 g1Var = new g1();
                        AbstractC6840z.m13036g(context);
                        Context applicationContext = context.getApplicationContext();
                        AbstractC6840z.m13036g(applicationContext);
                        g1Var.f35448a = applicationContext;
                        f35472T = new h4(g1Var);
                    }
                } finally {
                }
            }
        }
        return f35472T;
    }

    /* renamed from: D */
    public static final void m13939D(com.google.android.gms.internal.measurement.b3 b3Var, int i10, String str) {
        List listM3141i = b3Var.m3141i();
        for (int i11 = 0; i11 < listM3141i.size(); i11++) {
            if ("_err".equals(((com.google.android.gms.internal.measurement.f3) listM3141i.get(i11)).m3257q())) {
                return;
            }
        }
        com.google.android.gms.internal.measurement.e3 e3VarM3244B = com.google.android.gms.internal.measurement.f3.m3244B();
        e3VarM3244B.m3241i("_err");
        e3VarM3244B.m3243l(i10);
        com.google.android.gms.internal.measurement.f3 f3Var = (com.google.android.gms.internal.measurement.f3) e3VarM3244B.m3306e();
        com.google.android.gms.internal.measurement.e3 e3VarM3244B2 = com.google.android.gms.internal.measurement.f3.m3244B();
        e3VarM3244B2.m3241i("_ev");
        e3VarM3244B2.m3242k(str);
        com.google.android.gms.internal.measurement.f3 f3Var2 = (com.google.android.gms.internal.measurement.f3) e3VarM3244B2.m3306e();
        b3Var.m3144m(f3Var);
        b3Var.m3144m(f3Var2);
    }

    /* renamed from: E */
    public static final void m13940E(com.google.android.gms.internal.measurement.b3 b3Var, String str) {
        List listM3141i = b3Var.m3141i();
        for (int i10 = 0; i10 < listM3141i.size(); i10++) {
            if (str.equals(((com.google.android.gms.internal.measurement.f3) listM3141i.get(i10)).m3257q())) {
                b3Var.m3146o(i10);
                return;
            }
        }
    }

    /* renamed from: M */
    public static String m13941M(String str, Map map) {
        if (map == null) {
            return null;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (str.equalsIgnoreCase((String) entry.getKey())) {
                if (((List) entry.getValue()).isEmpty()) {
                    return null;
                }
                return (String) ((List) entry.getValue()).get(0);
            }
        }
        return null;
    }

    /* renamed from: S */
    public static void m13942S(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT < 34) {
            context.sendBroadcast(intent);
        } else {
            context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
        }
    }

    /* renamed from: T */
    public static final boolean m13943T(n4 n4Var) {
        return !TextUtils.isEmpty(n4Var.f35698b);
    }

    /* renamed from: U */
    public static final void m13944U(c4 c4Var) {
        if (c4Var == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (!c4Var.f35322c) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(c4Var.getClass())));
        }
    }

    /* renamed from: V */
    public static final Boolean m13945V(n4 n4Var) {
        Boolean bool = n4Var.f35712r;
        String str = n4Var.f35694G;
        if (!TextUtils.isEmpty(str)) {
            v1 v1Var = (v1) l4.d0.m9070A(str).f21881b;
            v1 v1Var2 = v1.UNINITIALIZED;
            int iOrdinal = v1Var.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                return null;
            }
            if (iOrdinal == 2) {
                return Boolean.TRUE;
            }
            if (iOrdinal == 3) {
                return Boolean.FALSE;
            }
        }
        return bool;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015a A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:8:0x0030, B:18:0x004e, B:55:0x015d, B:26:0x006c, B:31:0x00c8, B:30:0x00b6, B:32:0x00cd, B:36:0x00de, B:40:0x00f4, B:42:0x010c, B:44:0x0127, B:46:0x0130, B:48:0x0136, B:49:0x013a, B:51:0x0143, B:53:0x0152, B:54:0x015a, B:43:0x0118, B:37:0x00e5, B:39:0x00ee), top: B:64:0x0030, outer: #0 }] */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m13946A(java.lang.String r10, int r11, java.lang.Throwable r12, byte[] r13, java.util.Map r14) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.h4.m13946A(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* renamed from: B */
    public final void m13947B() {
        mo327b().mo325M();
        l0();
        if (this.f35499p) {
            return;
        }
        this.f35499p = true;
        mo327b().mo325M();
        FileLock fileLock = this.f35508z;
        n1 n1Var = this.f35497m;
        if (fileLock == null || !fileLock.isValid()) {
            ((n1) this.f35488c.f482a).getClass();
            try {
                FileChannel channel = new RandomAccessFile(new File(new File(n1Var.f35664a.getFilesDir(), "google_app_measurement.db").getPath()), "rw").getChannel();
                this.f35473B = channel;
                FileLock fileLockTryLock = channel.tryLock();
                this.f35508z = fileLockTryLock;
                if (fileLockTryLock == null) {
                    mo326a().f35862f.m14140a("Storage concurrent data access panic");
                    return;
                }
                mo326a().f35870p.m14140a("Storage concurrent access okay");
            } catch (FileNotFoundException e2) {
                mo326a().f35862f.m14141b(e2, "Failed to acquire storage lock");
                return;
            } catch (IOException e10) {
                mo326a().f35862f.m14141b(e10, "Failed to access storage lock file");
                return;
            } catch (OverlappingFileLockException e11) {
                mo326a().f35865j.m14141b(e11, "Storage lock already acquired");
                return;
            }
        } else {
            mo326a().f35870p.m14140a("Storage concurrent access okay");
        }
        FileChannel fileChannel = this.f35473B;
        mo327b().mo325M();
        int i10 = 0;
        if (fileChannel == null || !fileChannel.isOpen()) {
            mo326a().f35862f.m14140a("Bad channel to read from");
        } else {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            try {
                fileChannel.position(0L);
                int i11 = fileChannel.read(byteBufferAllocate);
                if (i11 == 4) {
                    byteBufferAllocate.flip();
                    i10 = byteBufferAllocate.getInt();
                } else if (i11 != -1) {
                    mo326a().f35865j.m14141b(Integer.valueOf(i11), "Unexpected data length. Bytes read");
                }
            } catch (IOException e12) {
                mo326a().f35862f.m14141b(e12, "Failed to read from channel");
            }
        }
        n0 n0VarM14095r = n1Var.m14095r();
        n0VarM14095r.m13936N();
        int i12 = n0VarM14095r.f35643e;
        mo327b().mo325M();
        if (i10 > i12) {
            mo326a().f35862f.m14142c("Panic: can't downgrade version. Previous, current version", Integer.valueOf(i10), Integer.valueOf(i12));
            return;
        }
        if (i10 < i12) {
            FileChannel fileChannel2 = this.f35473B;
            mo327b().mo325M();
            if (fileChannel2 == null || !fileChannel2.isOpen()) {
                mo326a().f35862f.m14140a("Bad channel to read from");
            } else {
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(4);
                byteBufferAllocate2.putInt(i12);
                byteBufferAllocate2.flip();
                try {
                    fileChannel2.truncate(0L);
                    fileChannel2.write(byteBufferAllocate2);
                    fileChannel2.force(true);
                    if (fileChannel2.size() != 4) {
                        mo326a().f35862f.m14141b(Long.valueOf(fileChannel2.size()), "Error writing to channel. Bytes written");
                    }
                    mo326a().f35870p.m14142c("Storage version upgraded. Previous, current version", Integer.valueOf(i10), Integer.valueOf(i12));
                    return;
                } catch (IOException e13) {
                    mo326a().f35862f.m14141b(e13, "Failed to write to channel");
                }
            }
            mo326a().f35862f.m14142c("Storage version upgrade failed. Previous, current version", Integer.valueOf(i10), Integer.valueOf(i12));
        }
    }

    /* renamed from: F */
    public final int m13948F(String str, C4327p c4327p) {
        x1 x1Var;
        v1 v1VarM13987Q;
        i1 i1Var = this.f35486a;
        if (i1Var.h0(str) == null) {
            c4327p.m9054m(x1.AD_PERSONALIZATION, EnumC7437h.FAILSAFE);
            return 1;
        }
        C7443n c7443n = this.f35488c;
        m13944U(c7443n);
        z0 z0VarO0 = c7443n.O0(str);
        if (z0VarO0 == null || ((v1) l4.d0.m9070A(z0VarO0.m14255s()).f21881b) != v1.POLICY || (v1VarM13987Q = i1Var.m13987Q(str, (x1Var = x1.AD_PERSONALIZATION))) == v1.UNINITIALIZED) {
            x1 x1Var2 = x1.AD_PERSONALIZATION;
            c4327p.m9054m(x1Var2, EnumC7437h.REMOTE_DEFAULT);
            if (i1Var.g0(str, x1Var2)) {
                return 0;
            }
        } else {
            c4327p.m9054m(x1Var, EnumC7437h.REMOTE_ENFORCED_DEFAULT);
            if (v1VarM13987Q == v1.GRANTED) {
                return 0;
            }
        }
        return 1;
    }

    /* renamed from: G */
    public final HashMap m13949G(com.google.android.gms.internal.measurement.c3 c3Var) {
        Serializable serializableB0;
        HashMap map = new HashMap();
        j0();
        HashMap map2 = new HashMap();
        for (com.google.android.gms.internal.measurement.f3 f3Var : c3Var.m3198p()) {
            if (f3Var.m3257q().startsWith("gad_") && (serializableB0 = y0.b0(f3Var)) != null) {
                map2.put(f3Var.m3257q(), serializableB0);
            }
        }
        for (Map.Entry entry : map2.entrySet()) {
            map.put((String) entry.getKey(), String.valueOf(entry.getValue()));
        }
        return map;
    }

    /* renamed from: H */
    public final void m13950H() {
        mo327b().mo325M();
        if (this.f35502s.isEmpty()) {
            return;
        }
        if (this.f35483M == null) {
            this.f35483M = new r3(this, this.f35497m, 2);
        }
        if (this.f35483M.f35723c != 0) {
            return;
        }
        mo334l().getClass();
        long jMax = Math.max(0L, ((Integer) f0.B0.m13872a(null)).intValue() - (SystemClock.elapsedRealtime() - this.f35484N));
        mo326a().f35870p.m14141b(Long.valueOf(jMax), "Scheduling notify next app runnable, delay in ms");
        if (this.f35483M == null) {
            this.f35483M = new r3(this, this.f35497m, 2);
        }
        this.f35483M.m14096b(jMax);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(40:8|(3:9|10|(4:12|13|(4:15|(1:22)|25|471)(18:26|27|(2:35|(3:37|(1:44)(1:43)|45)(0))(1:34)|46|(2:48|(3:50|(4:53|(1:476)(2:59|473)|60|51)|472))|61|62|(4:64|65|(0)(1:71)|(7:117|(5:121|(2:123|487)(2:124|(2:126|486)(1:488))|127|118|119)|485|128|(2:131|(3:137|(1:139)(2:140|(3:142|(3:145|(1:147)(1:504)|143)|503))|148)(2:135|136))(1:130)|149|(2:151|(6:(2:156|(6:158|159|193|(9:195|(4:198|(2:211|(2:213|490)(1:492))(5:202|(5:205|(2:208|206)|494|209|203)|493|210|491)|214|196)|489|215|(4:218|(3:496|220|499)(1:498)|497|216)|495|221|(1:223)|500)(1:224)|225|470))|160|193|(0)(0)|225|470)(7:161|162|192|193|(0)(0)|225|470))(2:163|(8:165|(6:(2:170|(6:172|159|193|(0)(0)|225|470))|173|193|(0)(0)|225|470)|162|192|193|(0)(0)|225|470)(7:174|(2:185|(2:186|(2:188|(2:502|190)(1:191))(1:501)))(0)|192|193|(0)(0)|225|470)))(3:136|149|(0)(0)))(1:72)|70|(3:73|74|(3:76|(2:78|479)(2:79|(2:81|480)(2:82|478))|83)(1:477))|84|(1:87)|(1:89)|90|(1:92)(1:93)|94|(4:99|(4:102|(2:104|483)(2:105|(2:107|482)(1:484))|108|100)|481|(1:(1:114)(1:115))(1:(1:111)(2:112|(0)(0))))|(0)(0))|226)(1:469))|227|(3:229|(2:231|(2:233|507)(2:234|(1:508)(3:236|(1:238)(1:239)|(1:510)(2:243|506))))(0)|244)|505|245|(3:246|247|(1:511)(2:249|(2:512|251)(1:513)))|252|(1:254)(2:255|(1:257))|258|(1:260)(1:261)|262|(1:264)(1:265)|266|(6:269|(1:271)|272|(2:274|515)(1:516)|275|267)|514|276|(2:281|(1:285))(1:280)|286|(1:288)|289|(1:291)|292|(2:294|(1:300))|301|(8:303|(8:307|308|(4:310|(2:312|(1:314))|(1:331)(5:318|(1:322)|324|(1:329)(1:328)|330)|332)(3:334|(4:467|336|341|(6:343|(3:346|(3:521|348|(3:350|354|(1:356)(6:357|(1:361)|362|(1:364)(1:366)|365|(3:368|(1:376)|377)(4:378|(3:380|(1:382)|383)(4:384|(1:386)(1:387)|388|(3:390|(1:392)|393)(2:394|(1:396)))|397|518)))(2:351|(0)(0)))(1:352)|344)|520|353|354|(0)(0))(3:353|354|(0)(0)))(3:340|341|(0)(0))|398)|333|519|398|304|305)|517|399|(1:401)|402|(2:405|403)|522)(1:406)|407|(1:409)(13:411|(9:413|(1:415)(1:416)|417|(1:419)(1:420)|421|(1:423)(1:424)|425|(1:427)(1:428)|429)|430|(3:432|(2:438|(1:440)(1:441))(1:437)|442)|443|(3:(2:447|524)(1:525)|448|444)|523|449|(1:451)|452|465|453|457)|410|430|(0)|443|(1:444)|523|449|(0)|452|465|453|457) */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x0f20, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x0f21, code lost:
    
        ((ug.n1) r2.f482a).mo326a().m14160Q().m14142c("Failed to remove unused event metadata. appId", ug.v0.m14157U(r1), r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03f6 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0415 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0430 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04ef A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0538 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x05e8 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x074e A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0b18 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0b4c A[PHI: r2
      0x0b4c: PHI (r2v54 long) = (r2v53 long), (r2v77 long) binds: [B:342:0x0b16, B:520:0x0b4c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0b64 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0b87 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0e33 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0ec0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0ef1 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m13951I(java.lang.String r47, long r48) {
        /*
            Method dump skipped, instructions count: 3927
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.h4.m13951I(java.lang.String, long):boolean");
    }

    /* renamed from: J */
    public final void m13952J(com.google.android.gms.internal.measurement.j3 j3Var, long j6, boolean z6) {
        k4 k4Var;
        Object obj;
        String str = true != z6 ? "_lte" : "_se";
        C7443n c7443n = this.f35488c;
        m13944U(c7443n);
        k4 k4VarG0 = c7443n.G0(j3Var.m3377q(), str);
        if (k4VarG0 == null || (obj = k4VarG0.f35581e) == null) {
            String strM3377q = j3Var.m3377q();
            mo334l().getClass();
            k4Var = new k4(strM3377q, "auto", str, System.currentTimeMillis(), Long.valueOf(j6));
        } else {
            String strM3377q2 = j3Var.m3377q();
            mo334l().getClass();
            k4Var = new k4(strM3377q2, "auto", str, System.currentTimeMillis(), Long.valueOf(((Long) obj).longValue() + j6));
        }
        com.google.android.gms.internal.measurement.t3 t3VarM3697A = com.google.android.gms.internal.measurement.u3.m3697A();
        t3VarM3697A.m3303b();
        ((com.google.android.gms.internal.measurement.u3) t3VarM3697A.f6231b).m3699C(str);
        mo334l().getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        t3VarM3697A.m3303b();
        ((com.google.android.gms.internal.measurement.u3) t3VarM3697A.f6231b).m3698B(jCurrentTimeMillis);
        Object obj2 = k4Var.f35581e;
        long jLongValue = ((Long) obj2).longValue();
        t3VarM3697A.m3303b();
        ((com.google.android.gms.internal.measurement.u3) t3VarM3697A.f6231b).m3702F(jLongValue);
        com.google.android.gms.internal.measurement.u3 u3Var = (com.google.android.gms.internal.measurement.u3) t3VarM3697A.m3306e();
        int iA0 = y0.A0(j3Var, str);
        if (iA0 >= 0) {
            j3Var.m3303b();
            ((com.google.android.gms.internal.measurement.k3) j3Var.f6231b).c0(iA0, u3Var);
        } else {
            j3Var.m3303b();
            ((com.google.android.gms.internal.measurement.k3) j3Var.f6231b).d0(u3Var);
        }
        if (j6 > 0) {
            C7443n c7443n2 = this.f35488c;
            m13944U(c7443n2);
            c7443n2.F0(k4Var);
            mo326a().f35870p.m14142c("Updated engagement user property. scope, value", true != z6 ? "lifetime" : "session-scoped", obj2);
        }
    }

    /* renamed from: K */
    public final boolean m13953K(com.google.android.gms.internal.measurement.b3 b3Var, com.google.android.gms.internal.measurement.b3 b3Var2) {
        AbstractC6840z.m13031b("_e".equals(b3Var.m3147p()));
        j0();
        com.google.android.gms.internal.measurement.f3 f3VarM14198U = y0.m14198U((com.google.android.gms.internal.measurement.c3) b3Var.m3306e(), "_sc");
        String strM3259s = f3VarM14198U == null ? null : f3VarM14198U.m3259s();
        j0();
        com.google.android.gms.internal.measurement.f3 f3VarM14198U2 = y0.m14198U((com.google.android.gms.internal.measurement.c3) b3Var2.m3306e(), "_pc");
        String strM3259s2 = f3VarM14198U2 != null ? f3VarM14198U2.m3259s() : null;
        if (strM3259s2 == null || !strM3259s2.equals(strM3259s)) {
            return false;
        }
        AbstractC6840z.m13031b("_e".equals(b3Var.m3147p()));
        j0();
        com.google.android.gms.internal.measurement.f3 f3VarM14198U3 = y0.m14198U((com.google.android.gms.internal.measurement.c3) b3Var.m3306e(), "_et");
        if (f3VarM14198U3 == null || !f3VarM14198U3.m3260t() || f3VarM14198U3.m3261u() <= 0) {
            return true;
        }
        long jM3261u = f3VarM14198U3.m3261u();
        j0();
        com.google.android.gms.internal.measurement.f3 f3VarM14198U4 = y0.m14198U((com.google.android.gms.internal.measurement.c3) b3Var2.m3306e(), "_et");
        if (f3VarM14198U4 != null && f3VarM14198U4.m3261u() > 0) {
            jM3261u += f3VarM14198U4.m3261u();
        }
        j0();
        y0.m14196S(b3Var2, "_et", Long.valueOf(jM3261u));
        j0();
        y0.m14196S(b3Var, "_fr", 1L);
        return true;
    }

    /* renamed from: L */
    public final boolean m13954L() {
        mo327b().mo325M();
        l0();
        C7443n c7443n = this.f35488c;
        m13944U(c7443n);
        if (c7443n.w0("select count(1) > 0 from raw_events", null) != 0) {
            return true;
        }
        C7443n c7443n2 = this.f35488c;
        m13944U(c7443n2);
        return !TextUtils.isEmpty(c7443n2.m14072U());
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0325  */
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m13955N() {
        /*
            Method dump skipped, instructions count: 954
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.h4.m13955N():void");
    }

    /* renamed from: O */
    public final void m13956O() {
        mo327b().mo325M();
        if (this.f35505w || this.f35506x || this.f35507y) {
            mo326a().f35870p.m14143d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f35505w), Boolean.valueOf(this.f35506x), Boolean.valueOf(this.f35507y));
            return;
        }
        mo326a().f35870p.m14140a("Stopping uploading service(s)");
        ArrayList arrayList = this.f35501r;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
        ArrayList arrayList2 = this.f35501r;
        AbstractC6840z.m13036g(arrayList2);
        arrayList2.clear();
    }

    /* renamed from: P */
    public final Boolean m13957P(z0 z0Var) {
        try {
            long jM14233P = z0Var.m14233P();
            n1 n1Var = this.f35497m;
            if (jM14233P != -2147483648L) {
                if (z0Var.m14233P() == C0658c.m1928a(n1Var.f35664a).m1920c(0, z0Var.m14221D()).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = C0658c.m1928a(n1Var.f35664a).m1920c(0, z0Var.m14221D()).versionName;
                String strM14231N = z0Var.m14231N();
                if (strM14231N != null && strM14231N.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: Q */
    public final n4 m13958Q(String str) {
        C7443n c7443n = this.f35488c;
        m13944U(c7443n);
        z0 z0VarO0 = c7443n.O0(str);
        if (z0VarO0 != null) {
            n1 n1Var = z0VarO0.f35999a;
            if (!TextUtils.isEmpty(z0VarO0.m14231N())) {
                Boolean boolM13957P = m13957P(z0VarO0);
                if (boolM13957P != null && !boolM13957P.booleanValue()) {
                    mo326a().f35862f.m14141b(v0.m14157U(str), "App version does not match; dropping. appId");
                    return null;
                }
                String strM14224G = z0VarO0.m14224G();
                String strM14231N = z0VarO0.m14231N();
                long jM14233P = z0VarO0.m14233P();
                m1 m1Var = n1Var.f35670g;
                n1.m14085m(m1Var);
                m1Var.mo325M();
                String str2 = z0VarO0.f36010l;
                m1 m1Var2 = n1Var.f35670g;
                n1.m14085m(m1Var2);
                m1Var2.mo325M();
                long j6 = z0VarO0.f36011m;
                m1 m1Var3 = n1Var.f35670g;
                n1.m14085m(m1Var3);
                m1Var3.mo325M();
                long j10 = z0VarO0.f36012n;
                m1 m1Var4 = n1Var.f35670g;
                n1.m14085m(m1Var4);
                m1Var4.mo325M();
                boolean z6 = z0VarO0.f36013o;
                String strM14227J = z0VarO0.m14227J();
                m1 m1Var5 = n1Var.f35670g;
                n1.m14085m(m1Var5);
                m1Var5.mo325M();
                boolean z10 = z0VarO0.f36014p;
                Boolean boolM14259w = z0VarO0.m14259w();
                long jM14238b = z0VarO0.m14238b();
                m1 m1Var6 = n1Var.f35670g;
                n1.m14085m(m1Var6);
                m1Var6.mo325M();
                ArrayList arrayList = z0VarO0.f36017s;
                String strM14212g = m13964d(str).m14212g();
                boolean zM14261y = z0VarO0.m14261y();
                m1 m1Var7 = n1Var.f35670g;
                n1.m14085m(m1Var7);
                m1Var7.mo325M();
                long j11 = z0VarO0.f36020v;
                int i10 = m13964d(str).f35953b;
                String str3 = o0(str).f35745b;
                m1 m1Var8 = n1Var.f35670g;
                n1.m14085m(m1Var8);
                m1Var8.mo325M();
                int i11 = z0VarO0.f36022x;
                m1 m1Var9 = n1Var.f35670g;
                n1.m14085m(m1Var9);
                m1Var9.mo325M();
                return new n4(str, strM14224G, strM14231N, jM14233P, str2, j6, j10, (String) null, z6, false, strM14227J, 0L, 0, z10, false, boolM14259w, jM14238b, (List) arrayList, strM14212g, "", (String) null, zM14261y, j11, i10, str3, i11, z0VarO0.f35981B, z0VarO0.m14220C(), z0VarO0.m14255s(), 0L, z0VarO0.m14256t());
            }
        }
        mo326a().f35869n.m14141b(str, "No app data available; dropping");
        return null;
    }

    /* renamed from: R */
    public final boolean m13959R(String str, String str2) {
        C7443n c7443n = this.f35488c;
        m13944U(c7443n);
        C7447r c7447rK0 = c7443n.k0("events", str, str2);
        return c7447rK0 == null || c7447rK0.f35796c < 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00cd  */
    /* renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m13960W(ug.j4 r24, ug.n4 r25) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.h4.m13960W(ug.j4, ug.n4):void");
    }

    /* renamed from: X */
    public final void m13961X(String str, n4 n4Var) {
        mo327b().mo325M();
        l0();
        boolean zM13943T = m13943T(n4Var);
        String str2 = n4Var.f35697a;
        if (zM13943T) {
            if (!n4Var.f35704h) {
                c0(n4Var);
                return;
            }
            Boolean boolM13945V = m13945V(n4Var);
            if ("_npa".equals(str) && boolM13945V != null) {
                mo326a().f35869n.m14140a("Falling back to manifest metadata value for ad personalization");
                mo334l().getClass();
                m13960W(new j4(System.currentTimeMillis(), Long.valueOf(true != boolM13945V.booleanValue() ? 0L : 1L), "_npa", "auto"), n4Var);
                return;
            }
            t0 t0Var = mo326a().f35869n;
            n1 n1Var = this.f35497m;
            t0Var.m14141b(n1Var.f35673k.m14115c(str), "Removing user property");
            C7443n c7443n = this.f35488c;
            m13944U(c7443n);
            c7443n.y0();
            try {
                c0(n4Var);
                if (TransferTable.COLUMN_ID.equals(str)) {
                    C7443n c7443n2 = this.f35488c;
                    m13944U(c7443n2);
                    AbstractC6840z.m13036g(str2);
                    c7443n2.E0(str2, "_lair");
                }
                C7443n c7443n3 = this.f35488c;
                m13944U(c7443n3);
                AbstractC6840z.m13036g(str2);
                c7443n3.E0(str2, str);
                C7443n c7443n4 = this.f35488c;
                m13944U(c7443n4);
                c7443n4.z0();
                mo326a().f35869n.m14141b(n1Var.f35673k.m14115c(str), "User property removed");
                C7443n c7443n5 = this.f35488c;
                m13944U(c7443n5);
                c7443n5.A0();
            } catch (Throwable th2) {
                C7443n c7443n6 = this.f35488c;
                m13944U(c7443n6);
                c7443n6.A0();
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0422 A[Catch: all -> 0x02ca, TryCatch #3 {all -> 0x02ca, blocks: (B:105:0x0297, B:107:0x02b5, B:150:0x037e, B:151:0x0381, B:153:0x038e, B:154:0x039e, B:165:0x0446, B:112:0x02cd, B:117:0x02ed, B:119:0x02f5, B:121:0x02fc, B:125:0x030f, B:129:0x0321, B:133:0x032d, B:136:0x0340, B:141:0x035f, B:143:0x0367, B:145:0x036f, B:147:0x0375, B:139:0x034d, B:127:0x031a, B:115:0x02db, B:155:0x03b7, B:157:0x03ec, B:158:0x03ef, B:160:0x03fc, B:161:0x040a, B:162:0x0422, B:164:0x042a), top: B:176:0x0138, inners: #0, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010d A[Catch: all -> 0x00c4, TryCatch #2 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cc, B:38:0x00dc, B:40:0x00eb, B:46:0x0100, B:48:0x010d, B:50:0x0118, B:53:0x011f, B:56:0x013a, B:59:0x0153, B:67:0x019b, B:54:0x012c, B:49:0x0114, B:42:0x00f5, B:45:0x00fd), top: B:174:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0114 A[Catch: all -> 0x00c4, TryCatch #2 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cc, B:38:0x00dc, B:40:0x00eb, B:46:0x0100, B:48:0x010d, B:50:0x0118, B:53:0x011f, B:56:0x013a, B:59:0x0153, B:67:0x019b, B:54:0x012c, B:49:0x0114, B:42:0x00f5, B:45:0x00fd), top: B:174:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011f A[Catch: all -> 0x00c4, TRY_ENTER, TryCatch #2 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cc, B:38:0x00dc, B:40:0x00eb, B:46:0x0100, B:48:0x010d, B:50:0x0118, B:53:0x011f, B:56:0x013a, B:59:0x0153, B:67:0x019b, B:54:0x012c, B:49:0x0114, B:42:0x00f5, B:45:0x00fd), top: B:174:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012c A[Catch: all -> 0x00c4, TryCatch #2 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cc, B:38:0x00dc, B:40:0x00eb, B:46:0x0100, B:48:0x010d, B:50:0x0118, B:53:0x011f, B:56:0x013a, B:59:0x0153, B:67:0x019b, B:54:0x012c, B:49:0x0114, B:42:0x00f5, B:45:0x00fd), top: B:174:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013a A[Catch: all -> 0x00c4, TRY_LEAVE, TryCatch #2 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cc, B:38:0x00dc, B:40:0x00eb, B:46:0x0100, B:48:0x010d, B:50:0x0118, B:53:0x011f, B:56:0x013a, B:59:0x0153, B:67:0x019b, B:54:0x012c, B:49:0x0114, B:42:0x00f5, B:45:0x00fd), top: B:174:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x017d  */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, ug.n4] */
    /* JADX WARN: Type inference failed for: r2v13, types: [ug.h4] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v5, types: [ug.h4] */
    /* renamed from: Y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m13962Y(ug.n4 r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1120
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.h4.m13962Y(ug.n4):void");
    }

    /* renamed from: Z */
    public final void m13963Z(C7434e c7434e, n4 n4Var) {
        C7449t c7449t;
        AbstractC6840z.m13033d(c7434e.f35357a);
        AbstractC6840z.m13036g(c7434e.f35358b);
        AbstractC6840z.m13036g(c7434e.f35359c);
        AbstractC6840z.m13033d(c7434e.f35359c.f35549b);
        mo327b().mo325M();
        l0();
        if (m13943T(n4Var)) {
            if (!n4Var.f35704h) {
                c0(n4Var);
                return;
            }
            C7434e c7434e2 = new C7434e(c7434e);
            boolean z6 = false;
            c7434e2.f35361e = false;
            C7443n c7443n = this.f35488c;
            m13944U(c7443n);
            c7443n.y0();
            try {
                C7443n c7443n2 = this.f35488c;
                m13944U(c7443n2);
                String str = c7434e2.f35357a;
                AbstractC6840z.m13036g(str);
                C7434e c7434eK0 = c7443n2.K0(str, c7434e2.f35359c.f35549b);
                n1 n1Var = this.f35497m;
                if (c7434eK0 != null && !c7434eK0.f35358b.equals(c7434e2.f35358b)) {
                    mo326a().f35865j.m14143d("Updating a conditional user property with different origin. name, origin, origin (from DB)", n1Var.f35673k.m14115c(c7434e2.f35359c.f35549b), c7434e2.f35358b, c7434eK0.f35358b);
                }
                if (c7434eK0 != null && c7434eK0.f35361e) {
                    c7434e2.f35358b = c7434eK0.f35358b;
                    c7434e2.f35360d = c7434eK0.f35360d;
                    c7434e2.f35364h = c7434eK0.f35364h;
                    c7434e2.f35362f = c7434eK0.f35362f;
                    c7434e2.f35365j = c7434eK0.f35365j;
                    c7434e2.f35361e = true;
                    j4 j4Var = c7434e2.f35359c;
                    c7434e2.f35359c = new j4(c7434eK0.f35359c.f35550c, j4Var.m14016b(), j4Var.f35549b, c7434eK0.f35359c.f35553f);
                } else if (TextUtils.isEmpty(c7434e2.f35362f)) {
                    j4 j4Var2 = c7434e2.f35359c;
                    c7434e2.f35359c = new j4(c7434e2.f35360d, j4Var2.m14016b(), j4Var2.f35549b, c7434e2.f35359c.f35553f);
                    c7434e2.f35361e = true;
                    z6 = true;
                }
                if (c7434e2.f35361e) {
                    j4 j4Var3 = c7434e2.f35359c;
                    String str2 = c7434e2.f35357a;
                    AbstractC6840z.m13036g(str2);
                    String str3 = c7434e2.f35358b;
                    String str4 = j4Var3.f35549b;
                    long j6 = j4Var3.f35550c;
                    Object objM14016b = j4Var3.m14016b();
                    AbstractC6840z.m13036g(objM14016b);
                    k4 k4Var = new k4(str2, str3, str4, j6, objM14016b);
                    Object obj = k4Var.f35581e;
                    String str5 = k4Var.f35579c;
                    C7443n c7443n3 = this.f35488c;
                    m13944U(c7443n3);
                    if (c7443n3.F0(k4Var)) {
                        mo326a().f35869n.m14143d("User property updated immediately", c7434e2.f35357a, n1Var.f35673k.m14115c(str5), obj);
                    } else {
                        mo326a().f35862f.m14143d("(2)Too many active user properties, ignoring", v0.m14157U(c7434e2.f35357a), n1Var.f35673k.m14115c(str5), obj);
                    }
                    if (z6 && (c7449t = c7434e2.f35365j) != null) {
                        m13970k(new C7449t(c7449t, c7434e2.f35360d), n4Var);
                    }
                }
                C7443n c7443n4 = this.f35488c;
                m13944U(c7443n4);
                if (c7443n4.J0(c7434e2)) {
                    mo326a().f35869n.m14143d("Conditional property added", c7434e2.f35357a, n1Var.f35673k.m14115c(c7434e2.f35359c.f35549b), c7434e2.f35359c.m14016b());
                } else {
                    mo326a().f35862f.m14143d("Too many conditional properties, ignoring", v0.m14157U(c7434e2.f35357a), n1Var.f35673k.m14115c(c7434e2.f35359c.f35549b), c7434e2.f35359c.m14016b());
                }
                C7443n c7443n5 = this.f35488c;
                m13944U(c7443n5);
                c7443n5.z0();
                C7443n c7443n6 = this.f35488c;
                m13944U(c7443n6);
                c7443n6.A0();
            } catch (Throwable th2) {
                C7443n c7443n7 = this.f35488c;
                m13944U(c7443n7);
                c7443n7.A0();
                throw th2;
            }
        }
    }

    @Override // ug.u1
    /* renamed from: a */
    public final v0 mo326a() {
        n1 n1Var = this.f35497m;
        AbstractC6840z.m13036g(n1Var);
        v0 v0Var = n1Var.f35669f;
        n1.m14085m(v0Var);
        return v0Var;
    }

    public final void a0(C7434e c7434e, n4 n4Var) {
        AbstractC6840z.m13033d(c7434e.f35357a);
        AbstractC6840z.m13036g(c7434e.f35359c);
        AbstractC6840z.m13033d(c7434e.f35359c.f35549b);
        mo327b().mo325M();
        l0();
        if (m13943T(n4Var)) {
            if (!n4Var.f35704h) {
                c0(n4Var);
                return;
            }
            C7443n c7443n = this.f35488c;
            m13944U(c7443n);
            c7443n.y0();
            try {
                c0(n4Var);
                String str = c7434e.f35357a;
                AbstractC6840z.m13036g(str);
                C7443n c7443n2 = this.f35488c;
                m13944U(c7443n2);
                C7434e c7434eK0 = c7443n2.K0(str, c7434e.f35359c.f35549b);
                n1 n1Var = this.f35497m;
                if (c7434eK0 != null) {
                    mo326a().f35869n.m14142c("Removing conditional user property", c7434e.f35357a, n1Var.f35673k.m14115c(c7434e.f35359c.f35549b));
                    C7443n c7443n3 = this.f35488c;
                    m13944U(c7443n3);
                    c7443n3.L0(str, c7434e.f35359c.f35549b);
                    if (c7434eK0.f35361e) {
                        C7443n c7443n4 = this.f35488c;
                        m13944U(c7443n4);
                        c7443n4.E0(str, c7434e.f35359c.f35549b);
                    }
                    C7449t c7449t = c7434e.f35367l;
                    if (c7449t != null) {
                        C7448s c7448s = c7449t.f35828b;
                        C7449t c7449tP0 = k0().p0(c7449t.f35827a, c7448s != null ? c7448s.m14134g() : null, c7434eK0.f35358b, c7449t.f35830d, true);
                        AbstractC6840z.m13036g(c7449tP0);
                        m13970k(c7449tP0, n4Var);
                    }
                } else {
                    mo326a().f35865j.m14142c("Conditional user property doesn't exist", v0.m14157U(c7434e.f35357a), n1Var.f35673k.m14115c(c7434e.f35359c.f35549b));
                }
                C7443n c7443n5 = this.f35488c;
                m13944U(c7443n5);
                c7443n5.z0();
                C7443n c7443n6 = this.f35488c;
                m13944U(c7443n6);
                c7443n6.A0();
            } catch (Throwable th2) {
                C7443n c7443n7 = this.f35488c;
                m13944U(c7443n7);
                c7443n7.A0();
                throw th2;
            }
        }
    }

    @Override // ug.u1
    /* renamed from: b */
    public final m1 mo327b() {
        n1 n1Var = this.f35497m;
        AbstractC6840z.m13036g(n1Var);
        m1 m1Var = n1Var.f35670g;
        n1.m14085m(m1Var);
        return m1Var;
    }

    public final void b0(n4 n4Var, long j6) throws Throwable {
        C7443n c7443n = this.f35488c;
        m13944U(c7443n);
        String str = n4Var.f35697a;
        AbstractC6840z.m13036g(str);
        z0 z0VarO0 = c7443n.O0(str);
        if (z0VarO0 != null) {
            k0();
            String str2 = n4Var.f35698b;
            String strM14224G = z0VarO0.m14224G();
            boolean zIsEmpty = TextUtils.isEmpty(str2);
            boolean zIsEmpty2 = TextUtils.isEmpty(strM14224G);
            if (!zIsEmpty && !zIsEmpty2) {
                AbstractC6840z.m13036g(str2);
                if (!str2.equals(strM14224G)) {
                    mo326a().f35865j.m14141b(v0.m14157U(z0VarO0.m14221D()), "New GMP App Id passed in. Removing cached database data. appId");
                    C7443n c7443n2 = this.f35488c;
                    m13944U(c7443n2);
                    n1 n1Var = (n1) c7443n2.f482a;
                    String strM14221D = z0VarO0.m14221D();
                    c7443n2.m13858N();
                    c7443n2.mo325M();
                    AbstractC6840z.m13033d(strM14221D);
                    try {
                        SQLiteDatabase sQLiteDatabaseB0 = c7443n2.B0();
                        String[] strArr = {strM14221D};
                        int iDelete = sQLiteDatabaseB0.delete("events", "app_id=?", strArr) + sQLiteDatabaseB0.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseB0.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseB0.delete("apps", "app_id=?", strArr) + sQLiteDatabaseB0.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseB0.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseB0.delete("event_filters", "app_id=?", strArr) + sQLiteDatabaseB0.delete("property_filters", "app_id=?", strArr) + sQLiteDatabaseB0.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseB0.delete("consent_settings", "app_id=?", strArr) + sQLiteDatabaseB0.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseB0.delete("trigger_uris", "app_id=?", strArr);
                        if (n1Var.f35667d.m13889W(null, f0.f44813h1)) {
                            iDelete += sQLiteDatabaseB0.delete("no_data_mode_events", "app_id=?", strArr);
                        }
                        if (iDelete > 0) {
                            v0 v0Var = n1Var.f35669f;
                            n1.m14085m(v0Var);
                            v0Var.f35870p.m14142c("Deleted application data. app, records", strM14221D, Integer.valueOf(iDelete));
                        }
                    } catch (SQLiteException e2) {
                        v0 v0Var2 = n1Var.f35669f;
                        n1.m14085m(v0Var2);
                        v0Var2.f35862f.m14142c("Error deleting application data. appId, error", v0.m14157U(strM14221D), e2);
                    }
                    z0VarO0 = null;
                }
            }
        }
        if (z0VarO0 != null) {
            boolean z6 = (z0VarO0.m14233P() == -2147483648L || z0VarO0.m14233P() == n4Var.f35706k) ? false : true;
            String strM14231N = z0VarO0.m14231N();
            if (z6 || ((z0VarO0.m14233P() != -2147483648L || strM14231N == null || strM14231N.equals(n4Var.f35699c)) ? false : true)) {
                Bundle bundle = new Bundle();
                bundle.putString("_pv", strM14231N);
                C7449t c7449t = new C7449t("_au", new C7448s(bundle), "auto", j6);
                if (e0().m13889W(null, f0.f44803c1)) {
                    m13967g(c7449t, n4Var);
                } else {
                    m13968h(c7449t, n4Var);
                }
            }
        }
    }

    @Override // ug.u1
    /* renamed from: c */
    public final C8687a mo328c() {
        return this.f35497m.f35666c;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0294  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ug.z0 c0(ug.n4 r13) {
        /*
            Method dump skipped, instructions count: 686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.h4.c0(ug.n4):ug.z0");
    }

    /* renamed from: d */
    public final y1 m13964d(String str) {
        y1 y1Var = y1.f35951c;
        mo327b().mo325M();
        l0();
        HashMap map = this.f35477F;
        y1 y1VarF0 = (y1) map.get(str);
        if (y1VarF0 == null) {
            C7443n c7443n = this.f35488c;
            m13944U(c7443n);
            y1VarF0 = c7443n.f0(str);
            if (y1VarF0 == null) {
                y1VarF0 = y1.f35951c;
            }
            mo327b().mo325M();
            l0();
            map.put(str, y1VarF0);
            C7443n c7443n2 = this.f35488c;
            m13944U(c7443n2);
            c7443n2.h0(str, y1VarF0);
        }
        return y1VarF0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    public final List d0(Bundle bundle, n4 n4Var) {
        int[] iArr;
        mo327b().mo325M();
        p8.m3595a();
        C7436g c7436gE0 = e0();
        String str = n4Var.f35697a;
        if (!c7436gE0.m13889W(str, f0.P0) || str == null) {
            return new ArrayList();
        }
        if (bundle != null) {
            int[] intArray = bundle.getIntArray("uriSources");
            long[] longArray = bundle.getLongArray("uriTimestamps");
            if (intArray != null) {
                if (longArray == null || longArray.length != intArray.length) {
                    mo326a().f35862f.m14140a("Uri sources and timestamps do not match");
                } else {
                    int i10 = 0;
                    while (i10 < intArray.length) {
                        C7443n c7443n = this.f35488c;
                        m13944U(c7443n);
                        n1 n1Var = (n1) c7443n.f482a;
                        int i11 = intArray[i10];
                        long j6 = longArray[i10];
                        AbstractC6840z.m13033d(str);
                        c7443n.mo325M();
                        c7443n.m13858N();
                        try {
                            iArr = intArray;
                        } catch (SQLiteException e2) {
                            e = e2;
                            iArr = intArray;
                        }
                        try {
                            int iDelete = c7443n.B0().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i11), String.valueOf(j6)});
                            v0 v0Var = n1Var.f35669f;
                            n1.m14085m(v0Var);
                            t0 t0Var = v0Var.f35870p;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(iDelete).length() + 46);
                            sb2.append("Pruned ");
                            sb2.append(iDelete);
                            sb2.append(" trigger URIs. appId, source, timestamp");
                            t0Var.m14143d(sb2.toString(), str, Integer.valueOf(i11), Long.valueOf(j6));
                        } catch (SQLiteException e10) {
                            e = e10;
                            v0 v0Var2 = n1Var.f35669f;
                            n1.m14085m(v0Var2);
                            v0Var2.f35862f.m14142c("Error pruning trigger URIs. appId", v0.m14157U(str), e);
                            i10++;
                            intArray = iArr;
                        }
                        i10++;
                        intArray = iArr;
                    }
                }
            }
        }
        C7443n c7443n2 = this.f35488c;
        m13944U(c7443n2);
        String str2 = n4Var.f35697a;
        AbstractC6840z.m13033d(str2);
        c7443n2.mo325M();
        c7443n2.m13858N();
        ?? arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = c7443n2.B0().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str2}, null, null, "rowid", null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        if (string == null) {
                            string = "";
                        }
                        arrayList.add(new w3(string, cursorQuery.getInt(2), cursorQuery.getLong(1)));
                    } while (cursorQuery.moveToNext());
                }
            } catch (Throwable th2) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                throw th2;
            }
        } catch (SQLiteException e11) {
            v0 v0Var3 = ((n1) c7443n2.f482a).f35669f;
            n1.m14085m(v0Var3);
            v0Var3.f35862f.m14142c("Error querying trigger uris. appId", v0.m14157U(str2), e11);
            arrayList = Collections.EMPTY_LIST;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return arrayList;
    }

    /* renamed from: e */
    public final long m13965e() {
        mo334l().getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        m3 m3Var = this.f35494j;
        m3Var.m13858N();
        m3Var.mo325M();
        c1 c1Var = m3Var.f35625k;
        long jM13856a = c1Var.m13856a();
        if (jM13856a == 0) {
            n1.m14083i(((n1) m3Var.f482a).f35672j);
            jM13856a = r2.K0().nextInt(86400000) + 1;
            c1Var.m13857b(jM13856a);
        }
        return ((((jCurrentTimeMillis + jM13856a) / 1000) / 60) / 60) / 24;
    }

    public final C7436g e0() {
        n1 n1Var = this.f35497m;
        AbstractC6840z.m13036g(n1Var);
        return n1Var.f35667d;
    }

    /* renamed from: f */
    public final void m13966f(String str, C7449t c7449t) throws Throwable {
        C7443n c7443n = this.f35488c;
        m13944U(c7443n);
        z0 z0VarO0 = c7443n.O0(str);
        if (z0VarO0 != null) {
            n1 n1Var = z0VarO0.f35999a;
            if (!TextUtils.isEmpty(z0VarO0.m14231N())) {
                Boolean boolM13957P = m13957P(z0VarO0);
                if (boolM13957P == null) {
                    if (!"_ui".equals(c7449t.f35827a)) {
                        mo326a().f35865j.m14141b(v0.m14157U(str), "Could not find package. appId");
                    }
                } else if (!boolM13957P.booleanValue()) {
                    mo326a().f35862f.m14141b(v0.m14157U(str), "App version does not match; dropping event. appId");
                    return;
                }
                String strM14224G = z0VarO0.m14224G();
                String strM14231N = z0VarO0.m14231N();
                long jM14233P = z0VarO0.m14233P();
                m1 m1Var = n1Var.f35670g;
                n1.m14085m(m1Var);
                m1Var.mo325M();
                String str2 = z0VarO0.f36010l;
                m1 m1Var2 = n1Var.f35670g;
                n1.m14085m(m1Var2);
                m1Var2.mo325M();
                long j6 = z0VarO0.f36011m;
                m1 m1Var3 = n1Var.f35670g;
                n1.m14085m(m1Var3);
                m1Var3.mo325M();
                long j10 = z0VarO0.f36012n;
                m1 m1Var4 = n1Var.f35670g;
                n1.m14085m(m1Var4);
                m1Var4.mo325M();
                boolean z6 = z0VarO0.f36013o;
                String strM14227J = z0VarO0.m14227J();
                m1 m1Var5 = n1Var.f35670g;
                n1.m14085m(m1Var5);
                m1Var5.mo325M();
                boolean z10 = z0VarO0.f36014p;
                Boolean boolM14259w = z0VarO0.m14259w();
                long jM14238b = z0VarO0.m14238b();
                m1 m1Var6 = n1Var.f35670g;
                n1.m14085m(m1Var6);
                m1Var6.mo325M();
                ArrayList arrayList = z0VarO0.f36017s;
                String strM14212g = m13964d(str).m14212g();
                boolean zM14261y = z0VarO0.m14261y();
                m1 m1Var7 = n1Var.f35670g;
                n1.m14085m(m1Var7);
                m1Var7.mo325M();
                long j11 = z0VarO0.f36020v;
                int i10 = m13964d(str).f35953b;
                String str3 = o0(str).f35745b;
                m1 m1Var8 = n1Var.f35670g;
                n1.m14085m(m1Var8);
                m1Var8.mo325M();
                int i11 = z0VarO0.f36022x;
                m1 m1Var9 = n1Var.f35670g;
                n1.m14085m(m1Var9);
                m1Var9.mo325M();
                m13967g(c7449t, new n4(str, strM14224G, strM14231N, jM14233P, str2, j6, j10, (String) null, z6, false, strM14227J, 0L, 0, z10, false, boolM14259w, jM14238b, (List) arrayList, strM14212g, "", (String) null, zM14261y, j11, i10, str3, i11, z0VarO0.f35981B, z0VarO0.m14220C(), z0VarO0.m14255s(), 0L, z0VarO0.m14256t()));
                return;
            }
        }
        mo326a().f35869n.m14141b(str, "No app data available; dropping event");
    }

    public final i1 f0() {
        i1 i1Var = this.f35486a;
        m13944U(i1Var);
        return i1Var;
    }

    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0080: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:129), block:B:18:0x0080 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[SYNTHETIC] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m13967g(ug.C7449t r11, ug.n4 r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.h4.m13967g(ug.t, ug.n4):void");
    }

    public final C7443n g0() {
        C7443n c7443n = this.f35488c;
        m13944U(c7443n);
        return c7443n;
    }

    /* renamed from: h */
    public final void m13968h(C7449t c7449t, n4 n4Var) {
        C7449t c7449t2;
        List listN0;
        n1 n1Var;
        List listN02;
        List<C7434e> listN03;
        String str;
        AbstractC6840z.m13036g(n4Var);
        String str2 = n4Var.f35697a;
        AbstractC6840z.m13033d(str2);
        mo327b().mo325M();
        l0();
        long j6 = c7449t.f35830d;
        C2019q c2019qM5742d = C2019q.m5742d(c7449t);
        mo327b().mo325M();
        l4.E0((this.f35481K == null || (str = this.f35482L) == null || !str.equals(str2)) ? null : this.f35481K, (Bundle) c2019qM5742d.f9568e, false);
        C7449t c7449tM5746e = c2019qM5742d.m5746e();
        j0();
        if (TextUtils.isEmpty(n4Var.f35698b)) {
            return;
        }
        if (!n4Var.f35704h) {
            c0(n4Var);
            return;
        }
        List list = n4Var.f35714t;
        if (list != null) {
            String str3 = c7449tM5746e.f35827a;
            if (!list.contains(str3)) {
                mo326a().f35869n.m14143d("Dropping non-safelisted event. appId, event name, origin", str2, c7449tM5746e.f35827a, c7449tM5746e.f35829c);
                return;
            } else {
                Bundle bundleM14134g = c7449tM5746e.f35828b.m14134g();
                bundleM14134g.putLong("ga_safelisted", 1L);
                c7449t2 = new C7449t(str3, new C7448s(bundleM14134g), c7449tM5746e.f35829c, c7449tM5746e.f35830d);
            }
        } else {
            c7449t2 = c7449tM5746e;
        }
        C7443n c7443n = this.f35488c;
        m13944U(c7443n);
        c7443n.y0();
        try {
            String str4 = c7449t2.f35827a;
            if ("_s".equals(str4)) {
                C7443n c7443n2 = this.f35488c;
                m13944U(c7443n2);
                if (!c7443n2.b0(str2, "_s") && c7449t2.f35828b.f35811a.getLong("_sid") != 0) {
                    C7443n c7443n3 = this.f35488c;
                    m13944U(c7443n3);
                    if (c7443n3.b0(str2, "_f")) {
                        C7443n c7443n4 = this.f35488c;
                        m13944U(c7443n4);
                        c7443n4.e0(str2, null, "_sid", m13969i(str2, c7449t2));
                    } else {
                        C7443n c7443n5 = this.f35488c;
                        m13944U(c7443n5);
                        if (c7443n5.b0(str2, "_v")) {
                            C7443n c7443n42 = this.f35488c;
                            m13944U(c7443n42);
                            c7443n42.e0(str2, null, "_sid", m13969i(str2, c7449t2));
                        } else {
                            C7443n c7443n6 = this.f35488c;
                            m13944U(c7443n6);
                            mo334l().getClass();
                            c7443n6.e0(str2, Long.valueOf(System.currentTimeMillis() - 15000), "_sid", m13969i(str2, c7449t2));
                        }
                    }
                }
            }
            C7443n c7443n7 = this.f35488c;
            m13944U(c7443n7);
            AbstractC6840z.m13033d(str2);
            c7443n7.mo325M();
            c7443n7.m13858N();
            if (j6 < 0) {
                v0 v0Var = ((n1) c7443n7.f482a).f35669f;
                n1.m14085m(v0Var);
                v0Var.f35865j.m14142c("Invalid time querying timed out conditional properties", v0.m14157U(str2), Long.valueOf(j6));
                listN0 = Collections.EMPTY_LIST;
            } else {
                listN0 = c7443n7.N0("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j6)});
            }
            Iterator it = listN0.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                n1Var = this.f35497m;
                if (!zHasNext) {
                    break;
                }
                C7434e c7434e = (C7434e) it.next();
                if (c7434e != null) {
                    mo326a().f35870p.m14143d("User property timed out", c7434e.f35357a, n1Var.f35673k.m14115c(c7434e.f35359c.f35549b), c7434e.f35359c.m14016b());
                    C7449t c7449t3 = c7434e.f35363g;
                    if (c7449t3 != null) {
                        m13970k(new C7449t(c7449t3, j6), n4Var);
                    }
                    C7443n c7443n8 = this.f35488c;
                    m13944U(c7443n8);
                    c7443n8.L0(str2, c7434e.f35359c.f35549b);
                }
            }
            C7443n c7443n9 = this.f35488c;
            m13944U(c7443n9);
            AbstractC6840z.m13033d(str2);
            c7443n9.mo325M();
            c7443n9.m13858N();
            if (j6 < 0) {
                v0 v0Var2 = ((n1) c7443n9.f482a).f35669f;
                n1.m14085m(v0Var2);
                v0Var2.f35865j.m14142c("Invalid time querying expired conditional properties", v0.m14157U(str2), Long.valueOf(j6));
                listN02 = Collections.EMPTY_LIST;
            } else {
                listN02 = c7443n9.N0("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j6)});
            }
            ArrayList arrayList = new ArrayList(listN02.size());
            Iterator it2 = listN02.iterator();
            while (it2.hasNext()) {
                C7434e c7434e2 = (C7434e) it2.next();
                if (c7434e2 != null) {
                    Iterator it3 = it2;
                    mo326a().f35870p.m14143d("User property expired", c7434e2.f35357a, n1Var.f35673k.m14115c(c7434e2.f35359c.f35549b), c7434e2.f35359c.m14016b());
                    C7443n c7443n10 = this.f35488c;
                    m13944U(c7443n10);
                    c7443n10.E0(str2, c7434e2.f35359c.f35549b);
                    C7449t c7449t4 = c7434e2.f35367l;
                    if (c7449t4 != null) {
                        arrayList.add(c7449t4);
                    }
                    C7443n c7443n11 = this.f35488c;
                    m13944U(c7443n11);
                    c7443n11.L0(str2, c7434e2.f35359c.f35549b);
                    it2 = it3;
                }
            }
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                m13970k(new C7449t((C7449t) obj, j6), n4Var);
            }
            C7443n c7443n12 = this.f35488c;
            m13944U(c7443n12);
            AbstractC6840z.m13033d(str2);
            AbstractC6840z.m13033d(str4);
            c7443n12.mo325M();
            c7443n12.m13858N();
            if (j6 < 0) {
                n1 n1Var2 = (n1) c7443n12.f482a;
                v0 v0Var3 = n1Var2.f35669f;
                n1.m14085m(v0Var3);
                v0Var3.f35865j.m14143d("Invalid time querying triggered conditional properties", v0.m14157U(str2), n1Var2.f35673k.m14113a(str4), Long.valueOf(j6));
                listN03 = Collections.EMPTY_LIST;
            } else {
                listN03 = c7443n12.N0("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str4, String.valueOf(j6)});
            }
            ArrayList arrayList2 = new ArrayList(listN03.size());
            for (C7434e c7434e3 : listN03) {
                if (c7434e3 != null) {
                    j4 j4Var = c7434e3.f35359c;
                    String str5 = c7434e3.f35357a;
                    AbstractC6840z.m13036g(str5);
                    String str6 = c7434e3.f35358b;
                    String str7 = j4Var.f35549b;
                    Object objM14016b = j4Var.m14016b();
                    AbstractC6840z.m13036g(objM14016b);
                    k4 k4Var = new k4(str5, str6, str7, j6, objM14016b);
                    Object obj2 = k4Var.f35581e;
                    String str8 = k4Var.f35579c;
                    C7443n c7443n13 = this.f35488c;
                    m13944U(c7443n13);
                    if (c7443n13.F0(k4Var)) {
                        mo326a().f35870p.m14143d("User property triggered", c7434e3.f35357a, n1Var.f35673k.m14115c(str8), obj2);
                    } else {
                        mo326a().f35862f.m14143d("Too many active user properties, ignoring", v0.m14157U(c7434e3.f35357a), n1Var.f35673k.m14115c(str8), obj2);
                    }
                    C7449t c7449t5 = c7434e3.f35365j;
                    if (c7449t5 != null) {
                        arrayList2.add(c7449t5);
                    }
                    c7434e3.f35359c = new j4(k4Var);
                    c7434e3.f35361e = true;
                    C7443n c7443n14 = this.f35488c;
                    m13944U(c7443n14);
                    c7443n14.J0(c7434e3);
                }
            }
            m13970k(c7449t2, n4Var);
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj3 = arrayList2.get(i11);
                i11++;
                m13970k(new C7449t((C7449t) obj3, j6), n4Var);
            }
            C7443n c7443n15 = this.f35488c;
            m13944U(c7443n15);
            c7443n15.z0();
            C7443n c7443n16 = this.f35488c;
            m13944U(c7443n16);
            c7443n16.A0();
        } catch (Throwable th2) {
            C7443n c7443n17 = this.f35488c;
            m13944U(c7443n17);
            c7443n17.A0();
            throw th2;
        }
    }

    public final a1 h0() {
        a1 a1Var = this.f35489d;
        if (a1Var != null) {
            return a1Var;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    /* renamed from: i */
    public final Bundle m13969i(String str, C7449t c7449t) {
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", c7449t.f35828b.f35811a.getLong("_sid"));
        C7443n c7443n = this.f35488c;
        m13944U(c7443n);
        k4 k4VarG0 = c7443n.G0(str, "_sno");
        if (k4VarG0 != null) {
            Object obj = k4VarG0.f35581e;
            if (obj instanceof Long) {
                bundle.putLong("_sno", ((Long) obj).longValue());
            }
        }
        return bundle;
    }

    public final C7432c i0() {
        C7432c c7432c = this.f35491f;
        m13944U(c7432c);
        return c7432c;
    }

    @Override // ug.u1
    /* renamed from: j */
    public final Context mo333j() {
        return this.f35497m.f35664a;
    }

    public final y0 j0() {
        y0 y0Var = this.f35492g;
        m13944U(y0Var);
        return y0Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:74|(12:76|(0)(1:79)|80|87|(1:89)|91|(0)(0)|94|102|(0)(0)|157|158)|78|81|395|82|86|80|87|(0)(0)|91|(0)(0)|94|102|(0)(0)|157|158) */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02fd, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x02fe, code lost:
    
        ((ug.n1) r10.f482a).mo326a().m14160Q().m14142c("Error pruning currencies. appId", ug.v0.m14157U(r13), r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03e5 A[Catch: all -> 0x01eb, TryCatch #4 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05be, B:156:0x05e8, B:160:0x0638, B:163:0x0666, B:165:0x0695, B:166:0x0698, B:168:0x069e, B:170:0x06a6, B:172:0x06ac, B:174:0x06b4, B:176:0x06ba, B:180:0x06c9, B:183:0x06d8, B:185:0x06e1, B:187:0x06e9, B:189:0x0718, B:191:0x0721, B:195:0x0736, B:200:0x0743, B:203:0x074c, B:207:0x0759, B:211:0x0767, B:215:0x0775, B:219:0x0783, B:223:0x0791, B:227:0x079d, B:231:0x07ab, B:234:0x07bb, B:235:0x07c2, B:237:0x07e5, B:240:0x07ee, B:244:0x07f9, B:245:0x0815, B:247:0x081b, B:249:0x0831, B:251:0x083d, B:253:0x084a, B:258:0x0869, B:259:0x087b, B:263:0x0885, B:264:0x0888, B:266:0x0895, B:267:0x0898, B:278:0x08de, B:238:0x07e8, B:162:0x0659, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:386:0x01cc, inners: #2, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0885 A[Catch: all -> 0x01eb, TryCatch #4 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05be, B:156:0x05e8, B:160:0x0638, B:163:0x0666, B:165:0x0695, B:166:0x0698, B:168:0x069e, B:170:0x06a6, B:172:0x06ac, B:174:0x06b4, B:176:0x06ba, B:180:0x06c9, B:183:0x06d8, B:185:0x06e1, B:187:0x06e9, B:189:0x0718, B:191:0x0721, B:195:0x0736, B:200:0x0743, B:203:0x074c, B:207:0x0759, B:211:0x0767, B:215:0x0775, B:219:0x0783, B:223:0x0791, B:227:0x079d, B:231:0x07ab, B:234:0x07bb, B:235:0x07c2, B:237:0x07e5, B:240:0x07ee, B:244:0x07f9, B:245:0x0815, B:247:0x081b, B:249:0x0831, B:251:0x083d, B:253:0x084a, B:258:0x0869, B:259:0x087b, B:263:0x0885, B:264:0x0888, B:266:0x0895, B:267:0x0898, B:278:0x08de, B:238:0x07e8, B:162:0x0659, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:386:0x01cc, inners: #2, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0895 A[Catch: all -> 0x01eb, TryCatch #4 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05be, B:156:0x05e8, B:160:0x0638, B:163:0x0666, B:165:0x0695, B:166:0x0698, B:168:0x069e, B:170:0x06a6, B:172:0x06ac, B:174:0x06b4, B:176:0x06ba, B:180:0x06c9, B:183:0x06d8, B:185:0x06e1, B:187:0x06e9, B:189:0x0718, B:191:0x0721, B:195:0x0736, B:200:0x0743, B:203:0x074c, B:207:0x0759, B:211:0x0767, B:215:0x0775, B:219:0x0783, B:223:0x0791, B:227:0x079d, B:231:0x07ab, B:234:0x07bb, B:235:0x07c2, B:237:0x07e5, B:240:0x07ee, B:244:0x07f9, B:245:0x0815, B:247:0x081b, B:249:0x0831, B:251:0x083d, B:253:0x084a, B:258:0x0869, B:259:0x087b, B:263:0x0885, B:264:0x0888, B:266:0x0895, B:267:0x0898, B:278:0x08de, B:238:0x07e8, B:162:0x0659, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:386:0x01cc, inners: #2, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x096a  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x09b2 A[Catch: all -> 0x0942, TryCatch #1 {all -> 0x0942, blocks: (B:270:0x08b0, B:272:0x08bb, B:274:0x08c9, B:276:0x08d3, B:279:0x08e7, B:281:0x08f3, B:283:0x08ff, B:285:0x0909, B:287:0x0917, B:289:0x092f, B:293:0x094a, B:295:0x0958, B:296:0x0961, B:298:0x096d, B:300:0x09b2, B:303:0x09bd, B:304:0x09c7, B:305:0x09c8, B:307:0x09d2, B:273:0x08c0), top: B:381:0x08b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:307:0x09d2 A[Catch: all -> 0x0942, TRY_LEAVE, TryCatch #1 {all -> 0x0942, blocks: (B:270:0x08b0, B:272:0x08bb, B:274:0x08c9, B:276:0x08d3, B:279:0x08e7, B:281:0x08f3, B:283:0x08ff, B:285:0x0909, B:287:0x0917, B:289:0x092f, B:293:0x094a, B:295:0x0958, B:296:0x0961, B:298:0x096d, B:300:0x09b2, B:303:0x09bd, B:304:0x09c7, B:305:0x09c8, B:307:0x09d2, B:273:0x08c0), top: B:381:0x08b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0a34  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0a3f A[Catch: all -> 0x09fe, TryCatch #7 {all -> 0x09fe, blocks: (B:309:0x09db, B:311:0x09f0, B:315:0x0a01, B:317:0x0a37, B:319:0x0a3f, B:321:0x0a49, B:322:0x0a53, B:324:0x0a5d, B:325:0x0a67, B:326:0x0a70, B:328:0x0a76, B:330:0x0ac0, B:332:0x0ad2, B:336:0x0af1, B:338:0x0b01, B:335:0x0ae1, B:342:0x0b14, B:343:0x0b56, B:344:0x0b61, B:345:0x0b76, B:347:0x0b7c, B:356:0x0bc9, B:357:0x0c15, B:359:0x0c26, B:373:0x0c8f, B:364:0x0c40, B:365:0x0c43, B:350:0x0b8b, B:352:0x0bb5, B:370:0x0c60, B:371:0x0c79, B:372:0x0c7a), top: B:391:0x09db, inners: #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0a5d A[Catch: all -> 0x09fe, TryCatch #7 {all -> 0x09fe, blocks: (B:309:0x09db, B:311:0x09f0, B:315:0x0a01, B:317:0x0a37, B:319:0x0a3f, B:321:0x0a49, B:322:0x0a53, B:324:0x0a5d, B:325:0x0a67, B:326:0x0a70, B:328:0x0a76, B:330:0x0ac0, B:332:0x0ad2, B:336:0x0af1, B:338:0x0b01, B:335:0x0ae1, B:342:0x0b14, B:343:0x0b56, B:344:0x0b61, B:345:0x0b76, B:347:0x0b7c, B:356:0x0bc9, B:357:0x0c15, B:359:0x0c26, B:373:0x0c8f, B:364:0x0c40, B:365:0x0c43, B:350:0x0b8b, B:352:0x0bb5, B:370:0x0c60, B:371:0x0c79, B:372:0x0c7a), top: B:391:0x09db, inners: #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0a76 A[Catch: all -> 0x09fe, TryCatch #7 {all -> 0x09fe, blocks: (B:309:0x09db, B:311:0x09f0, B:315:0x0a01, B:317:0x0a37, B:319:0x0a3f, B:321:0x0a49, B:322:0x0a53, B:324:0x0a5d, B:325:0x0a67, B:326:0x0a70, B:328:0x0a76, B:330:0x0ac0, B:332:0x0ad2, B:336:0x0af1, B:338:0x0b01, B:335:0x0ae1, B:342:0x0b14, B:343:0x0b56, B:344:0x0b61, B:345:0x0b76, B:347:0x0b7c, B:356:0x0bc9, B:357:0x0c15, B:359:0x0c26, B:373:0x0c8f, B:364:0x0c40, B:365:0x0c43, B:350:0x0b8b, B:352:0x0bb5, B:370:0x0c60, B:371:0x0c79, B:372:0x0c7a), top: B:391:0x09db, inners: #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0b0c  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0b7c A[Catch: all -> 0x09fe, TryCatch #7 {all -> 0x09fe, blocks: (B:309:0x09db, B:311:0x09f0, B:315:0x0a01, B:317:0x0a37, B:319:0x0a3f, B:321:0x0a49, B:322:0x0a53, B:324:0x0a5d, B:325:0x0a67, B:326:0x0a70, B:328:0x0a76, B:330:0x0ac0, B:332:0x0ad2, B:336:0x0af1, B:338:0x0b01, B:335:0x0ae1, B:342:0x0b14, B:343:0x0b56, B:344:0x0b61, B:345:0x0b76, B:347:0x0b7c, B:356:0x0bc9, B:357:0x0c15, B:359:0x0c26, B:373:0x0c8f, B:364:0x0c40, B:365:0x0c43, B:350:0x0b8b, B:352:0x0bb5, B:370:0x0c60, B:371:0x0c79, B:372:0x0c7a), top: B:391:0x09db, inners: #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0c26 A[Catch: all -> 0x09fe, SQLiteException -> 0x0c3c, TRY_LEAVE, TryCatch #5 {SQLiteException -> 0x0c3c, blocks: (B:357:0x0c15, B:359:0x0c26), top: B:387:0x0c15, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0c3e  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0b8b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0338 A[Catch: all -> 0x01eb, TryCatch #4 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05be, B:156:0x05e8, B:160:0x0638, B:163:0x0666, B:165:0x0695, B:166:0x0698, B:168:0x069e, B:170:0x06a6, B:172:0x06ac, B:174:0x06b4, B:176:0x06ba, B:180:0x06c9, B:183:0x06d8, B:185:0x06e1, B:187:0x06e9, B:189:0x0718, B:191:0x0721, B:195:0x0736, B:200:0x0743, B:203:0x074c, B:207:0x0759, B:211:0x0767, B:215:0x0775, B:219:0x0783, B:223:0x0791, B:227:0x079d, B:231:0x07ab, B:234:0x07bb, B:235:0x07c2, B:237:0x07e5, B:240:0x07ee, B:244:0x07f9, B:245:0x0815, B:247:0x081b, B:249:0x0831, B:251:0x083d, B:253:0x084a, B:258:0x0869, B:259:0x087b, B:263:0x0885, B:264:0x0888, B:266:0x0895, B:267:0x0898, B:278:0x08de, B:238:0x07e8, B:162:0x0659, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:386:0x01cc, inners: #2, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x037e A[Catch: all -> 0x01eb, TryCatch #4 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05be, B:156:0x05e8, B:160:0x0638, B:163:0x0666, B:165:0x0695, B:166:0x0698, B:168:0x069e, B:170:0x06a6, B:172:0x06ac, B:174:0x06b4, B:176:0x06ba, B:180:0x06c9, B:183:0x06d8, B:185:0x06e1, B:187:0x06e9, B:189:0x0718, B:191:0x0721, B:195:0x0736, B:200:0x0743, B:203:0x074c, B:207:0x0759, B:211:0x0767, B:215:0x0775, B:219:0x0783, B:223:0x0791, B:227:0x079d, B:231:0x07ab, B:234:0x07bb, B:235:0x07c2, B:237:0x07e5, B:240:0x07ee, B:244:0x07f9, B:245:0x0815, B:247:0x081b, B:249:0x0831, B:251:0x083d, B:253:0x084a, B:258:0x0869, B:259:0x087b, B:263:0x0885, B:264:0x0888, B:266:0x0895, B:267:0x0898, B:278:0x08de, B:238:0x07e8, B:162:0x0659, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:386:0x01cc, inners: #2, #8, #9 }] */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m13970k(ug.C7449t r61, ug.n4 r62) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 3272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.h4.m13970k(ug.t, ug.n4):void");
    }

    public final l4 k0() {
        n1 n1Var = this.f35497m;
        AbstractC6840z.m13036g(n1Var);
        l4 l4Var = n1Var.f35672j;
        n1.m14083i(l4Var);
        return l4Var;
    }

    @Override // ug.u1
    /* renamed from: l */
    public final C8946a mo334l() {
        n1 n1Var = this.f35497m;
        AbstractC6840z.m13036g(n1Var);
        return n1Var.f35674l;
    }

    public final void l0() {
        if (!this.f35498n.get()) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    /* renamed from: m */
    public final void m13971m(z0 z0Var, com.google.android.gms.internal.measurement.j3 j3Var) {
        C4327p c4327p;
        com.google.android.gms.internal.measurement.u3 u3Var;
        mo327b().mo325M();
        l0();
        String strB0 = ((com.google.android.gms.internal.measurement.k3) j3Var.f6231b).B0();
        EnumMap enumMap = new EnumMap(x1.class);
        int i10 = 0;
        if (strB0.length() < x1.values().length || strB0.charAt(0) != '1') {
            c4327p = new C4327p(29);
        } else {
            x1[] x1VarArrValues = x1.values();
            int length = x1VarArrValues.length;
            int i11 = 0;
            int i12 = 1;
            while (i11 < length) {
                enumMap.put((EnumMap) x1VarArrValues[i11], (x1) EnumC7437h.zza(strB0.charAt(i12)));
                i11++;
                i12++;
            }
            c4327p = new C4327p(enumMap);
        }
        String strM14221D = z0Var.m14221D();
        mo327b().mo325M();
        l0();
        y1 y1VarM13964d = m13964d(strM14221D);
        EnumMap enumMap2 = y1VarM13964d.f35952a;
        v1 v1Var = v1.UNINITIALIZED;
        x1 x1Var = x1.AD_STORAGE;
        v1 v1Var2 = (v1) enumMap2.get(x1Var);
        if (v1Var2 == null) {
            v1Var2 = v1.UNINITIALIZED;
        }
        int i13 = y1VarM13964d.f35953b;
        int iOrdinal = v1Var2.ordinal();
        if (iOrdinal == 1) {
            c4327p.m9054m(x1Var, EnumC7437h.REMOTE_ENFORCED_DEFAULT);
        } else if (iOrdinal == 2 || iOrdinal == 3) {
            c4327p.m9053l(x1Var, i13);
        } else {
            c4327p.m9054m(x1Var, EnumC7437h.FAILSAFE);
        }
        x1 x1Var2 = x1.ANALYTICS_STORAGE;
        v1 v1Var3 = (v1) enumMap2.get(x1Var2);
        if (v1Var3 == null) {
            v1Var3 = v1.UNINITIALIZED;
        }
        int iOrdinal2 = v1Var3.ordinal();
        if (iOrdinal2 == 1) {
            c4327p.m9054m(x1Var2, EnumC7437h.REMOTE_ENFORCED_DEFAULT);
        } else if (iOrdinal2 == 2 || iOrdinal2 == 3) {
            c4327p.m9053l(x1Var2, i13);
        } else {
            c4327p.m9054m(x1Var2, EnumC7437h.FAILSAFE);
        }
        String strM14221D2 = z0Var.m14221D();
        mo327b().mo325M();
        l0();
        C7445p c7445pQ0 = q0(strM14221D2, o0(strM14221D2), m13964d(strM14221D2), c4327p);
        String str = c7445pQ0.f35747d;
        Boolean bool = c7445pQ0.f35746c;
        AbstractC6840z.m13036g(bool);
        boolean zBooleanValue = bool.booleanValue();
        j3Var.m3303b();
        ((com.google.android.gms.internal.measurement.k3) j3Var.f6231b).f1(zBooleanValue);
        if (!TextUtils.isEmpty(str)) {
            j3Var.m3303b();
            ((com.google.android.gms.internal.measurement.k3) j3Var.f6231b).g1(str);
        }
        mo327b().mo325M();
        l0();
        Iterator it = Collections.unmodifiableList(((com.google.android.gms.internal.measurement.k3) j3Var.f6231b).U1()).iterator();
        while (true) {
            if (it.hasNext()) {
                u3Var = (com.google.android.gms.internal.measurement.u3) it.next();
                if ("_npa".equals(u3Var.m3708r())) {
                    break;
                }
            } else {
                u3Var = null;
                break;
            }
        }
        if (u3Var != null) {
            x1 x1Var3 = x1.AD_PERSONALIZATION;
            EnumC7437h enumC7437h = (EnumC7437h) ((EnumMap) c4327p.f21788b).get(x1Var3);
            if (enumC7437h == null) {
                enumC7437h = EnumC7437h.UNSET;
            }
            if (enumC7437h == EnumC7437h.UNSET) {
                C7443n c7443n = this.f35488c;
                m13944U(c7443n);
                k4 k4VarG0 = c7443n.G0(z0Var.m14221D(), "_npa");
                if (k4VarG0 != null) {
                    String str2 = k4VarG0.f35578b;
                    if ("tcf".equals(str2)) {
                        c4327p.m9054m(x1Var3, EnumC7437h.TCF);
                    } else if ("app".equals(str2)) {
                        c4327p.m9054m(x1Var3, EnumC7437h.API);
                    } else {
                        c4327p.m9054m(x1Var3, EnumC7437h.MANIFEST);
                    }
                } else {
                    Boolean boolM14259w = z0Var.m14259w();
                    if (boolM14259w == null || ((boolM14259w.booleanValue() && u3Var.m3712v() != 1) || !(boolM14259w.booleanValue() || u3Var.m3712v() == 0))) {
                        c4327p.m9054m(x1Var3, EnumC7437h.API);
                    } else {
                        c4327p.m9054m(x1Var3, EnumC7437h.MANIFEST);
                    }
                }
            }
        } else {
            int iM13948F = m13948F(z0Var.m14221D(), c4327p);
            com.google.android.gms.internal.measurement.t3 t3VarM3697A = com.google.android.gms.internal.measurement.u3.m3697A();
            t3VarM3697A.m3303b();
            ((com.google.android.gms.internal.measurement.u3) t3VarM3697A.f6231b).m3699C("_npa");
            mo334l().getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            t3VarM3697A.m3303b();
            ((com.google.android.gms.internal.measurement.u3) t3VarM3697A.f6231b).m3698B(jCurrentTimeMillis);
            t3VarM3697A.m3303b();
            ((com.google.android.gms.internal.measurement.u3) t3VarM3697A.f6231b).m3702F(iM13948F);
            com.google.android.gms.internal.measurement.u3 u3Var2 = (com.google.android.gms.internal.measurement.u3) t3VarM3697A.m3306e();
            j3Var.m3303b();
            ((com.google.android.gms.internal.measurement.k3) j3Var.f6231b).d0(u3Var2);
            mo326a().f35870p.m14142c("Setting user property", "non_personalized_ads(_npa)", Integer.valueOf(iM13948F));
        }
        String string = c4327p.toString();
        j3Var.m3303b();
        ((com.google.android.gms.internal.measurement.k3) j3Var.f6231b).e1(string);
        String strM14221D3 = z0Var.m14221D();
        i1 i1Var = this.f35486a;
        i1Var.mo325M();
        i1Var.m13989S(strM14221D3);
        com.google.android.gms.internal.measurement.b2 b2VarH0 = i1Var.h0(strM14221D3);
        boolean z6 = b2VarH0 == null || !b2VarH0.m3138s() || b2VarH0.m3139t();
        List listM3367X = j3Var.m3367X();
        for (int i14 = 0; i14 < listM3367X.size(); i14++) {
            if ("_tcf".equals(((com.google.android.gms.internal.measurement.c3) listM3367X.get(i14)).m3201s())) {
                com.google.android.gms.internal.measurement.b3 b3Var = (com.google.android.gms.internal.measurement.b3) ((com.google.android.gms.internal.measurement.c3) listM3367X.get(i14)).m3340i();
                List listM3141i = b3Var.m3141i();
                int i15 = 0;
                while (true) {
                    if (i15 >= listM3141i.size()) {
                        break;
                    }
                    if ("_tcfd".equals(((com.google.android.gms.internal.measurement.f3) listM3141i.get(i15)).m3257q())) {
                        String strM3259s = ((com.google.android.gms.internal.measurement.f3) listM3141i.get(i15)).m3259s();
                        if (z6 && strM3259s.length() > 4) {
                            char[] charArray = strM3259s.toCharArray();
                            int i16 = 1;
                            while (true) {
                                if (i16 >= 64) {
                                    break;
                                }
                                if (charArray[4] == "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i16)) {
                                    i10 = i16;
                                    break;
                                }
                                i16++;
                            }
                            charArray[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i10 | 1);
                            strM3259s = String.valueOf(charArray);
                        }
                        com.google.android.gms.internal.measurement.e3 e3VarM3244B = com.google.android.gms.internal.measurement.f3.m3244B();
                        e3VarM3244B.m3241i("_tcfd");
                        e3VarM3244B.m3242k(strM3259s);
                        b3Var.m3303b();
                        ((com.google.android.gms.internal.measurement.c3) b3Var.f6231b).m3188A(i15, (com.google.android.gms.internal.measurement.f3) e3VarM3244B.m3306e());
                    } else {
                        i15++;
                    }
                }
                j3Var.m3369Z(i14, b3Var);
                return;
            }
        }
    }

    public final void m0(n4 n4Var) {
        mo327b().mo325M();
        l0();
        String str = n4Var.f35697a;
        AbstractC6840z.m13033d(str);
        y1 y1VarM14206c = y1.m14206c(n4Var.f35689B, n4Var.f35715v);
        m13964d(str);
        mo326a().f35870p.m14142c("Setting storage consent for package", str, y1VarM14206c);
        mo327b().mo325M();
        l0();
        this.f35477F.put(str, y1VarM14206c);
        C7443n c7443n = this.f35488c;
        m13944U(c7443n);
        c7443n.h0(str, y1VarM14206c);
    }

    /* renamed from: n */
    public final void m13972n(z0 z0Var, com.google.android.gms.internal.measurement.j3 j3Var) {
        Serializable serializableB0;
        mo327b().mo325M();
        l0();
        com.google.android.gms.internal.measurement.m2 m2VarM3553O = com.google.android.gms.internal.measurement.p2.m3553O();
        n1 n1Var = z0Var.f35999a;
        m1 m1Var = n1Var.f35670g;
        n1.m14085m(m1Var);
        m1Var.mo325M();
        byte[] bArr = z0Var.f35987H;
        if (bArr != null) {
            try {
                m2VarM3553O = (com.google.android.gms.internal.measurement.m2) y0.z0(m2VarM3553O, bArr);
            } catch (zzmr unused) {
                mo326a().f35865j.m14141b(v0.m14157U(z0Var.m14221D()), "Failed to parse locally stored ad campaign info. appId");
            }
        }
        Iterator it = j3Var.m3367X().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.google.android.gms.internal.measurement.c3 c3Var = (com.google.android.gms.internal.measurement.c3) it.next();
            if (c3Var.m3201s().equals("_cmp")) {
                com.google.android.gms.internal.measurement.f3 f3VarM14198U = y0.m14198U(c3Var, "gclid");
                Serializable serializableB02 = f3VarM14198U == null ? null : y0.b0(f3VarM14198U);
                if (serializableB02 == null) {
                    serializableB02 = "";
                }
                String str = (String) serializableB02;
                com.google.android.gms.internal.measurement.f3 f3VarM14198U2 = y0.m14198U(c3Var, "gbraid");
                Serializable serializableB03 = f3VarM14198U2 == null ? null : y0.b0(f3VarM14198U2);
                if (serializableB03 == null) {
                    serializableB03 = "";
                }
                String str2 = (String) serializableB03;
                com.google.android.gms.internal.measurement.f3 f3VarM14198U3 = y0.m14198U(c3Var, "gad_source");
                Object objB0 = f3VarM14198U3 == null ? null : y0.b0(f3VarM14198U3);
                String str3 = (String) (objB0 != null ? objB0 : "");
                String[] strArrSplit = ((String) f0.f44811g1.m13872a(null)).split(",");
                j0();
                HashMap map = new HashMap();
                for (com.google.android.gms.internal.measurement.f3 f3Var : c3Var.m3198p()) {
                    if (Arrays.asList(strArrSplit).contains(f3Var.m3257q()) && (serializableB0 = y0.b0(f3Var)) != null) {
                        map.put(f3Var.m3257q(), serializableB0);
                    }
                }
                if (!map.isEmpty()) {
                    com.google.android.gms.internal.measurement.f3 f3VarM14198U4 = y0.m14198U(c3Var, "click_timestamp");
                    Object objB02 = f3VarM14198U4 == null ? null : y0.b0(f3VarM14198U4);
                    long jLongValue = ((Long) (objB02 != null ? objB02 : 0L)).longValue();
                    if (jLongValue <= 0) {
                        jLongValue = c3Var.m3203u();
                    }
                    com.google.android.gms.internal.measurement.f3 f3VarM14198U5 = y0.m14198U(c3Var, "_cis");
                    if ("referrer API v2".equals(f3VarM14198U5 != null ? y0.b0(f3VarM14198U5) : null)) {
                        if (jLongValue > ((com.google.android.gms.internal.measurement.p2) m2VarM3553O.f6231b).m3568N()) {
                            if (str.isEmpty()) {
                                m2VarM3553O.m3303b();
                                ((com.google.android.gms.internal.measurement.p2) m2VarM3553O.f6231b).m3577q();
                            } else {
                                m2VarM3553O.m3303b();
                                ((com.google.android.gms.internal.measurement.p2) m2VarM3553O.f6231b).m3576p(str);
                            }
                            if (str2.isEmpty()) {
                                m2VarM3553O.m3303b();
                                ((com.google.android.gms.internal.measurement.p2) m2VarM3553O.f6231b).m3579s();
                            } else {
                                m2VarM3553O.m3303b();
                                ((com.google.android.gms.internal.measurement.p2) m2VarM3553O.f6231b).m3578r(str2);
                            }
                            if (str3.isEmpty()) {
                                m2VarM3553O.m3303b();
                                ((com.google.android.gms.internal.measurement.p2) m2VarM3553O.f6231b).m3581u();
                            } else {
                                m2VarM3553O.m3303b();
                                ((com.google.android.gms.internal.measurement.p2) m2VarM3553O.f6231b).m3580t(str3);
                            }
                            m2VarM3553O.m3303b();
                            ((com.google.android.gms.internal.measurement.p2) m2VarM3553O.f6231b).m3582v(jLongValue);
                            m2VarM3553O.m3303b();
                            ((com.google.android.gms.internal.measurement.p2) m2VarM3553O.f6231b).m3584x().clear();
                            HashMap mapM13949G = m13949G(c3Var);
                            m2VarM3553O.m3303b();
                            ((com.google.android.gms.internal.measurement.p2) m2VarM3553O.f6231b).m3584x().putAll(mapM13949G);
                        }
                    } else if (jLongValue > ((com.google.android.gms.internal.measurement.p2) m2VarM3553O.f6231b).m3560F()) {
                        if (str.isEmpty()) {
                            m2VarM3553O.m3303b();
                            ((com.google.android.gms.internal.measurement.p2) m2VarM3553O.f6231b).m3570R();
                        } else {
                            m2VarM3553O.m3303b();
                            ((com.google.android.gms.internal.measurement.p2) m2VarM3553O.f6231b).m3569Q(str);
                        }
                        if (str2.isEmpty()) {
                            m2VarM3553O.m3303b();
                            ((com.google.android.gms.internal.measurement.p2) m2VarM3553O.f6231b).m3572T();
                        } else {
                            m2VarM3553O.m3303b();
                            ((com.google.android.gms.internal.measurement.p2) m2VarM3553O.f6231b).m3571S(str2);
                        }
                        if (str3.isEmpty()) {
                            m2VarM3553O.m3303b();
                            ((com.google.android.gms.internal.measurement.p2) m2VarM3553O.f6231b).m3574V();
                        } else {
                            m2VarM3553O.m3303b();
                            ((com.google.android.gms.internal.measurement.p2) m2VarM3553O.f6231b).m3573U(str3);
                        }
                        m2VarM3553O.m3303b();
                        ((com.google.android.gms.internal.measurement.p2) m2VarM3553O.f6231b).m3575W(jLongValue);
                        m2VarM3553O.m3303b();
                        ((com.google.android.gms.internal.measurement.p2) m2VarM3553O.f6231b).m3583w().clear();
                        HashMap mapM13949G2 = m13949G(c3Var);
                        m2VarM3553O.m3303b();
                        ((com.google.android.gms.internal.measurement.p2) m2VarM3553O.f6231b).m3583w().putAll(mapM13949G2);
                    }
                }
            }
        }
        if (!((com.google.android.gms.internal.measurement.p2) m2VarM3553O.m3306e()).equals(com.google.android.gms.internal.measurement.p2.m3554P())) {
            com.google.android.gms.internal.measurement.p2 p2Var = (com.google.android.gms.internal.measurement.p2) m2VarM3553O.m3306e();
            j3Var.m3303b();
            ((com.google.android.gms.internal.measurement.k3) j3Var.f6231b).k1(p2Var);
        }
        byte[] bArrM3669a = ((com.google.android.gms.internal.measurement.p2) m2VarM3553O.m3306e()).m3669a();
        m1 m1Var2 = n1Var.f35670g;
        n1.m14085m(m1Var2);
        m1Var2.mo325M();
        z0Var.f35996Q |= z0Var.f35987H != bArrM3669a;
        z0Var.f35987H = bArrM3669a;
        if (z0Var.m14251o()) {
            C7443n c7443n = this.f35488c;
            m13944U(c7443n);
            c7443n.P0(z0Var, false);
        }
        if (e0().m13889W(null, f0.f44809f1)) {
            C7443n c7443n2 = this.f35488c;
            m13944U(c7443n2);
            c7443n2.E0(z0Var.m14221D(), "_lgclid");
        }
    }

    public final void n0(n4 n4Var) throws NumberFormatException {
        mo327b().mo325M();
        l0();
        String str = n4Var.f35697a;
        AbstractC6840z.m13033d(str);
        C7445p c7445pM14101b = C7445p.m14101b(n4Var.f35690C);
        mo326a().f35870p.m14142c("Setting DMA consent for package", str, c7445pM14101b);
        mo327b().mo325M();
        l0();
        v1 v1VarM14104a = C7445p.m14102c(100, p0(str)).m14104a();
        this.f35478G.put(str, c7445pM14101b);
        C7443n c7443n = this.f35488c;
        m13944U(c7443n);
        AbstractC6840z.m13036g(str);
        AbstractC6840z.m13036g(c7445pM14101b);
        c7443n.mo325M();
        c7443n.m13858N();
        y1 y1VarF0 = c7443n.f0(str);
        y1 y1Var = y1.f35951c;
        if (y1VarF0 == y1Var) {
            c7443n.h0(str, y1Var);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("dma_consent_settings", c7445pM14101b.f35745b);
        c7443n.j0(contentValues);
        v1 v1VarM14104a2 = C7445p.m14102c(100, p0(str)).m14104a();
        mo327b().mo325M();
        l0();
        v1 v1Var = v1.DENIED;
        boolean z6 = v1VarM14104a == v1Var && v1VarM14104a2 == v1.GRANTED;
        boolean z10 = v1VarM14104a == v1.GRANTED && v1VarM14104a2 == v1Var;
        if (z6 || z10) {
            mo326a().f35870p.m14141b(str, "Generated _dcu event for");
            Bundle bundle = new Bundle();
            C7443n c7443n2 = this.f35488c;
            m13944U(c7443n2);
            if (c7443n2.Q0(m13965e(), str, false, false, false, false).f35560f < e0().m13887U(str, f0.f44821m0)) {
                bundle.putLong("_r", 1L);
                C7443n c7443n3 = this.f35488c;
                m13944U(c7443n3);
                mo326a().f35870p.m14142c("_dcu realtime event count", str, Long.valueOf(c7443n3.Q0(m13965e(), str, false, false, true, false).f35560f));
            }
            this.f35485O.m9090x(str, "_dcu", bundle);
        }
    }

    /* renamed from: o */
    public final String m13973o(y1 y1Var) {
        if (!y1Var.m14213i(x1.ANALYTICS_STORAGE)) {
            return null;
        }
        byte[] bArr = new byte[16];
        k0().K0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final C7445p o0(String str) throws NumberFormatException {
        mo327b().mo325M();
        l0();
        HashMap map = this.f35478G;
        C7445p c7445p = (C7445p) map.get(str);
        if (c7445p != null) {
            return c7445p;
        }
        C7443n c7443n = this.f35488c;
        m13944U(c7443n);
        AbstractC6840z.m13036g(str);
        c7443n.mo325M();
        c7443n.m13858N();
        C7445p c7445pM14101b = C7445p.m14101b(c7443n.i0("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}));
        map.put(str, c7445pM14101b);
        return c7445pM14101b;
    }

    /* renamed from: p */
    public final void m13974p(ArrayList arrayList) {
        AbstractC6840z.m13031b(!arrayList.isEmpty());
        if (this.f35474C != null) {
            mo326a().f35862f.m14140a("Set uploading progress before finishing the previous upload");
        } else {
            this.f35474C = new ArrayList(arrayList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Bundle p0(String str) {
        mo327b().mo325M();
        l0();
        i1 i1Var = this.f35486a;
        m13944U(i1Var);
        if (i1Var.h0(str) == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        y1 y1VarM13964d = m13964d(str);
        Bundle bundle2 = new Bundle();
        Iterator it = y1VarM13964d.f35952a.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            int iOrdinal = ((v1) entry.getValue()).ordinal();
            String str2 = iOrdinal != 2 ? iOrdinal != 3 ? null : "granted" : "denied";
            if (str2 != null) {
                bundle2.putString(((x1) entry.getKey()).zze, str2);
            }
        }
        bundle.putAll(bundle2);
        C7445p c7445pQ0 = q0(str, o0(str), y1VarM13964d, new C4327p(29));
        Bundle bundle3 = new Bundle();
        for (Map.Entry entry2 : c7445pQ0.f35748e.entrySet()) {
            int iOrdinal2 = ((v1) entry2.getValue()).ordinal();
            String str3 = iOrdinal2 != 2 ? iOrdinal2 != 3 ? null : "granted" : "denied";
            if (str3 != null) {
                bundle3.putString(((x1) entry2.getKey()).zze, str3);
            }
        }
        Boolean bool = c7445pQ0.f35746c;
        if (bool != null) {
            bundle3.putString("is_dma_region", bool.toString());
        }
        String str4 = c7445pQ0.f35747d;
        if (str4 != null) {
            bundle3.putString("cps_display_str", str4);
        }
        bundle.putAll(bundle3);
        C7443n c7443n = this.f35488c;
        m13944U(c7443n);
        k4 k4VarG0 = c7443n.G0(str, "_npa");
        bundle.putString("ad_personalization", 1 != (k4VarG0 != null ? k4VarG0.f35581e.equals(1L) : m13948F(str, new C4327p(29))) ? "granted" : "denied");
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ab A[Catch: all -> 0x0028, TryCatch #4 {all -> 0x0028, blocks: (B:3:0x000e, B:5:0x001b, B:8:0x002b, B:10:0x0031, B:11:0x003e, B:13:0x0046, B:14:0x004b, B:16:0x0056, B:17:0x0063, B:19:0x006e, B:20:0x007e, B:22:0x00a8, B:24:0x00ae, B:25:0x00b1, B:27:0x00ca, B:28:0x00df, B:30:0x00f0, B:32:0x00f6, B:35:0x010b, B:45:0x012a, B:47:0x012f, B:48:0x0132, B:49:0x0133, B:50:0x0138, B:55:0x017d, B:71:0x01a5, B:73:0x01ab, B:75:0x01b6, B:79:0x01c1, B:80:0x01c4, B:33:0x00fb, B:37:0x010f, B:42:0x0117), top: B:91:0x000e, inners: #1 }] */
    /* JADX WARN: Type inference failed for: r11v0, types: [ug.h4] */
    /* JADX WARN: Type inference failed for: r1v12, types: [long] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v22, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v25, types: [android.database.Cursor] */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m13975q() {
        /*
            Method dump skipped, instructions count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.h4.m13975q():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ug.C7445p q0(java.lang.String r11, ug.C7445p r12, ug.y1 r13, l1.C4327p r14) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.h4.q0(java.lang.String, ug.p, ug.y1, l1.p):ug.p");
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006f A[PHI: r0 r11 r24
      0x006f: PHI (r0v124 java.util.List) = (r0v8 java.util.List), (r0v146 java.util.List) binds: [B:108:0x0225, B:16:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x006f: PHI (r11v62 android.database.Cursor) = (r11v5 android.database.Cursor), (r11v64 android.database.Cursor) binds: [B:108:0x0225, B:16:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x006f: PHI (r24v12 long) = (r24v2 long), (r24v13 long) binds: [B:108:0x0225, B:16:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x05f7  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0613  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x07ad  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0801  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x080f  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0a7a  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x07f5 A[EDGE_INSN: B:441:0x07f5->B:314:0x07f5 BREAK  A[LOOP:4: B:260:0x064c->B:313:0x07e7], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:443:0x07e7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:478:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:480:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:481:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v65 */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m13976r(java.lang.String r32, long r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.h4.m13976r(java.lang.String, long):void");
    }

    /* renamed from: s */
    public final boolean m13977s(String str, String str2) {
        C7443n c7443n = this.f35488c;
        m13944U(c7443n);
        z0 z0VarO0 = c7443n.O0(str);
        HashMap map = this.f35480I;
        if (z0VarO0 != null && k0().n0(str, z0VarO0.m14220C())) {
            map.remove(str2);
            return true;
        }
        g4 g4Var = (g4) map.get(str2);
        if (g4Var != null) {
            g4Var.f35455a.mo334l().getClass();
            if (System.currentTimeMillis() < g4Var.f35457c) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: t */
    public final void m13978t(String str) {
        mo327b().mo325M();
        l0();
        this.f35507y = true;
        try {
            n1 n1Var = this.f35497m;
            n1Var.getClass();
            Boolean bool = n1Var.m14093p().f35571e;
            if (bool == null) {
                mo326a().f35865j.m14140a("Upload data called on the client side before use of service was decided");
            } else if (bool.booleanValue()) {
                mo326a().f35862f.m14140a("Upload called in the client side when service should be used");
            } else if (this.f35500q > 0) {
                m13955N();
            } else {
                y0 y0Var = this.f35487b;
                m13944U(y0Var);
                if (y0Var.g0()) {
                    C7443n c7443n = this.f35488c;
                    m13944U(c7443n);
                    if (c7443n.m14070S(str)) {
                        C7443n c7443n2 = this.f35488c;
                        m13944U(c7443n2);
                        AbstractC6840z.m13033d(str);
                        c7443n2.mo325M();
                        c7443n2.m13858N();
                        List listM14069R = c7443n2.m14069R(str, a4.m13831b(w2.GOOGLE_SIGNAL), 1);
                        i4 i4Var = listM14069R.isEmpty() ? null : (i4) listM14069R.get(0);
                        if (i4Var != null) {
                            com.google.android.gms.internal.measurement.i3 i3Var = i4Var.f35527b;
                            mo326a().f35870p.m14143d("[sgtm] Uploading data from upload queue. appId, type, url", str, i4Var.f35530e, i4Var.f35528c);
                            byte[] bArrM3669a = i3Var.m3669a();
                            if (Log.isLoggable(mo326a().m14165W(), 2)) {
                                y0 y0Var2 = this.f35492g;
                                m13944U(y0Var2);
                                mo326a().f35870p.m14143d("[sgtm] Uploading data from upload queue. appId, uncompressed size, data", str, Integer.valueOf(bArrM3669a.length), y0Var2.p0(i3Var));
                            }
                            d4 d4Var = new d4(i4Var.f35528c, i4Var.f35529d, i4Var.f35530e, null);
                            this.f35506x = true;
                            y0 y0Var3 = this.f35487b;
                            m13944U(y0Var3);
                            y0Var3.l0(str, d4Var, i3Var, new C7439j(this, str, i4Var, 4));
                        }
                    } else {
                        mo326a().f35870p.m14141b(str, "[sgtm] Upload queue has no batches for appId");
                    }
                } else {
                    mo326a().f35870p.m14140a("Network not connected, ignoring upload request");
                    m13955N();
                }
            }
            this.f35507y = false;
            m13956O();
        } catch (Throwable th2) {
            this.f35507y = false;
            m13956O();
            throw th2;
        }
    }

    /* renamed from: u */
    public final void m13979u(String str, boolean z6, Long l9, Long l10) {
        C7443n c7443n = this.f35488c;
        m13944U(c7443n);
        z0 z0VarO0 = c7443n.O0(str);
        if (z0VarO0 != null) {
            n1 n1Var = z0VarO0.f35999a;
            m1 m1Var = n1Var.f35670g;
            n1.m14085m(m1Var);
            m1Var.mo325M();
            z0VarO0.f35996Q |= z0VarO0.f36023y != z6;
            z0VarO0.f36023y = z6;
            m1 m1Var2 = n1Var.f35670g;
            n1.m14085m(m1Var2);
            m1Var2.mo325M();
            z0VarO0.f35996Q |= !Objects.equals(z0VarO0.f36024z, l9);
            z0VarO0.f36024z = l9;
            m1 m1Var3 = n1Var.f35670g;
            n1.m14085m(m1Var3);
            m1Var3.mo325M();
            z0VarO0.f35996Q |= !Objects.equals(z0VarO0.f35980A, l10);
            z0VarO0.f35980A = l10;
            if (z0VarO0.m14251o()) {
                C7443n c7443n2 = this.f35488c;
                m13944U(c7443n2);
                c7443n2.P0(z0VarO0, false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0121  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m13980v(com.google.android.gms.internal.measurement.j3 r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.h4.m13980v(com.google.android.gms.internal.measurement.j3, java.lang.String):void");
    }

    /* renamed from: w */
    public final void m13981w(com.google.android.gms.internal.measurement.j3 j3Var, C3220l c3220l) {
        String strF0;
        String strF02;
        for (int i10 = 0; i10 < j3Var.m3368Y(); i10++) {
            com.google.android.gms.internal.measurement.b3 b3Var = (com.google.android.gms.internal.measurement.b3) ((com.google.android.gms.internal.measurement.k3) j3Var.f6231b).T1(i10).m3340i();
            Iterator it = b3Var.m3141i().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if ("_c".equals(((com.google.android.gms.internal.measurement.f3) it.next()).m3257q())) {
                    if (((com.google.android.gms.internal.measurement.k3) c3220l.f17355b).G0() >= e0().m13887U(((com.google.android.gms.internal.measurement.k3) c3220l.f17355b).m3459p(), f0.f44820l0)) {
                        int iM13887U = e0().m13887U(((com.google.android.gms.internal.measurement.k3) c3220l.f17355b).m3459p(), f0.f44833y0);
                        LinkedList linkedList = this.f35502s;
                        y0 y0Var = this.f35492g;
                        if (iM13887U > 0) {
                            C7443n c7443n = this.f35488c;
                            m13944U(c7443n);
                            if (c7443n.Q0(m13965e(), ((com.google.android.gms.internal.measurement.k3) c3220l.f17355b).m3459p(), false, false, false, true).f35561g > iM13887U) {
                                com.google.android.gms.internal.measurement.e3 e3VarM3244B = com.google.android.gms.internal.measurement.f3.m3244B();
                                e3VarM3244B.m3241i("_tnr");
                                e3VarM3244B.m3243l(1L);
                                b3Var.m3144m((com.google.android.gms.internal.measurement.f3) e3VarM3244B.m3306e());
                            } else {
                                if (e0().m13889W(((com.google.android.gms.internal.measurement.k3) c3220l.f17355b).m3459p(), f0.R0)) {
                                    strF02 = k0().F0();
                                    com.google.android.gms.internal.measurement.e3 e3VarM3244B2 = com.google.android.gms.internal.measurement.f3.m3244B();
                                    e3VarM3244B2.m3241i("_tu");
                                    e3VarM3244B2.m3242k(strF02);
                                    b3Var.m3144m((com.google.android.gms.internal.measurement.f3) e3VarM3244B2.m3306e());
                                } else {
                                    strF02 = null;
                                }
                                com.google.android.gms.internal.measurement.e3 e3VarM3244B3 = com.google.android.gms.internal.measurement.f3.m3244B();
                                e3VarM3244B3.m3241i("_tr");
                                e3VarM3244B3.m3243l(1L);
                                b3Var.m3144m((com.google.android.gms.internal.measurement.f3) e3VarM3244B3.m3306e());
                                m13944U(y0Var);
                                w3 w3VarN0 = y0Var.n0(((com.google.android.gms.internal.measurement.k3) c3220l.f17355b).m3459p(), j3Var, b3Var, strF02);
                                if (w3VarN0 != null) {
                                    mo326a().f35870p.m14142c("Generated trigger URI. appId, uri", ((com.google.android.gms.internal.measurement.k3) c3220l.f17355b).m3459p(), w3VarN0.f35892a);
                                    C7443n c7443n2 = this.f35488c;
                                    m13944U(c7443n2);
                                    c7443n2.g0(((com.google.android.gms.internal.measurement.k3) c3220l.f17355b).m3459p(), w3VarN0);
                                    if (!linkedList.contains(((com.google.android.gms.internal.measurement.k3) c3220l.f17355b).m3459p())) {
                                        linkedList.add(((com.google.android.gms.internal.measurement.k3) c3220l.f17355b).m3459p());
                                    }
                                }
                            }
                        } else {
                            if (e0().m13889W(((com.google.android.gms.internal.measurement.k3) c3220l.f17355b).m3459p(), f0.R0)) {
                                strF0 = k0().F0();
                                com.google.android.gms.internal.measurement.e3 e3VarM3244B4 = com.google.android.gms.internal.measurement.f3.m3244B();
                                e3VarM3244B4.m3241i("_tu");
                                e3VarM3244B4.m3242k(strF0);
                                b3Var.m3144m((com.google.android.gms.internal.measurement.f3) e3VarM3244B4.m3306e());
                            } else {
                                strF0 = null;
                            }
                            com.google.android.gms.internal.measurement.e3 e3VarM3244B5 = com.google.android.gms.internal.measurement.f3.m3244B();
                            e3VarM3244B5.m3241i("_tr");
                            e3VarM3244B5.m3243l(1L);
                            b3Var.m3144m((com.google.android.gms.internal.measurement.f3) e3VarM3244B5.m3306e());
                            m13944U(y0Var);
                            w3 w3VarN02 = y0Var.n0(((com.google.android.gms.internal.measurement.k3) c3220l.f17355b).m3459p(), j3Var, b3Var, strF0);
                            if (w3VarN02 != null) {
                                mo326a().f35870p.m14142c("Generated trigger URI. appId, uri", ((com.google.android.gms.internal.measurement.k3) c3220l.f17355b).m3459p(), w3VarN02.f35892a);
                                C7443n c7443n3 = this.f35488c;
                                m13944U(c7443n3);
                                c7443n3.g0(((com.google.android.gms.internal.measurement.k3) c3220l.f17355b).m3459p(), w3VarN02);
                                if (!linkedList.contains(((com.google.android.gms.internal.measurement.k3) c3220l.f17355b).m3459p())) {
                                    linkedList.add(((com.google.android.gms.internal.measurement.k3) c3220l.f17355b).m3459p());
                                }
                            }
                        }
                    }
                    com.google.android.gms.internal.measurement.c3 c3Var = (com.google.android.gms.internal.measurement.c3) b3Var.m3306e();
                    j3Var.m3303b();
                    ((com.google.android.gms.internal.measurement.k3) j3Var.f6231b).m3456X(i10, c3Var);
                }
            }
        }
    }

    /* renamed from: x */
    public final void m13982x(String str, com.google.android.gms.internal.measurement.e3 e3Var, Bundle bundle, String str2) {
        int iMax;
        List listUnmodifiableList = Collections.unmodifiableList(Arrays.asList("_o", "_sn", "_sc", "_si"));
        if (l4.l0(((com.google.android.gms.internal.measurement.f3) e3Var.f6231b).m3257q()) || l4.l0(str)) {
            C7436g c7436gE0 = e0();
            c7436gE0.getClass();
            iMax = Math.max(Math.max(Math.min(c7436gE0.m13887U(str2, f0.f44812h0), 500), 100), 256);
        } else {
            C7436g c7436gE02 = e0();
            c7436gE02.getClass();
            iMax = Math.max(Math.min(c7436gE02.m13887U(str2, f0.f44812h0), 500), 100);
        }
        long j6 = iMax;
        long jCodePointCount = ((com.google.android.gms.internal.measurement.f3) e3Var.f6231b).m3259s().codePointCount(0, ((com.google.android.gms.internal.measurement.f3) e3Var.f6231b).m3259s().length());
        k0();
        String strM3257q = ((com.google.android.gms.internal.measurement.f3) e3Var.f6231b).m3257q();
        e0();
        String strM14028R = l4.m14028R(40, strM3257q, true);
        if (jCodePointCount <= j6 || listUnmodifiableList.contains(((com.google.android.gms.internal.measurement.f3) e3Var.f6231b).m3257q())) {
            return;
        }
        if ("_ev".equals(((com.google.android.gms.internal.measurement.f3) e3Var.f6231b).m3257q())) {
            k0();
            String strM3259s = ((com.google.android.gms.internal.measurement.f3) e3Var.f6231b).m3259s();
            C7436g c7436gE03 = e0();
            c7436gE03.getClass();
            bundle.putString("_ev", l4.m14028R(Math.max(Math.max(Math.min(c7436gE03.m13887U(str2, f0.f44812h0), 500), 100), 256), strM3259s, true));
            return;
        }
        mo326a().f35867l.m14142c("Param value is too long; discarded. Name, value length", strM14028R, Long.valueOf(jCodePointCount));
        if (bundle.getLong("_err") == 0) {
            bundle.putLong("_err", 4L);
            if (bundle.getString("_ev") == null) {
                bundle.putString("_ev", strM14028R);
                bundle.putLong("_el", jCodePointCount);
            }
        }
        bundle.remove(((com.google.android.gms.internal.measurement.f3) e3Var.f6231b).m3257q());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0071 A[Catch: all -> 0x0018, TryCatch #2 {all -> 0x0018, blocks: (B:4:0x0015, B:17:0x0033, B:22:0x0083, B:21:0x0071, B:26:0x00a6, B:32:0x00ca), top: B:109:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0091 A[Catch: all -> 0x024f, PHI: r0
      0x0091: PHI (r0v4 int) = (r0v0 int), (r0v38 int) binds: [B:10:0x0026, B:16:0x0031] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x024f, blocks: (B:9:0x001e, B:24:0x0091, B:30:0x00bc, B:35:0x00e6, B:82:0x022b, B:84:0x023e, B:86:0x0249, B:96:0x026b, B:90:0x0252, B:92:0x025b, B:94:0x0261, B:95:0x0265, B:98:0x026f, B:99:0x0277, B:34:0x00db, B:100:0x0278, B:26:0x00a6, B:32:0x00ca), top: B:111:0x001e, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ca A[Catch: all -> 0x0018, SQLiteException -> 0x00b9, TRY_ENTER, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x00b9, blocks: (B:26:0x00a6, B:30:0x00bc, B:32:0x00ca, B:35:0x00e6, B:82:0x022b, B:84:0x023e, B:86:0x0249, B:96:0x026b, B:90:0x0252, B:92:0x025b, B:94:0x0261, B:95:0x0265, B:98:0x026f, B:99:0x0277, B:34:0x00db), top: B:106:0x00a6, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00db A[Catch: SQLiteException -> 0x00b9, all -> 0x024f, TRY_ENTER, TryCatch #0 {SQLiteException -> 0x00b9, blocks: (B:26:0x00a6, B:30:0x00bc, B:32:0x00ca, B:35:0x00e6, B:82:0x022b, B:84:0x023e, B:86:0x0249, B:96:0x026b, B:90:0x0252, B:92:0x025b, B:94:0x0261, B:95:0x0265, B:98:0x026f, B:99:0x0277, B:34:0x00db), top: B:106:0x00a6, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ff A[Catch: all -> 0x015b, TryCatch #3 {all -> 0x015b, blocks: (B:36:0x00ee, B:37:0x00f7, B:39:0x00ff, B:41:0x0113, B:43:0x0120, B:44:0x0122, B:48:0x0140, B:50:0x014a, B:54:0x015e, B:55:0x0165, B:57:0x016b, B:59:0x0180, B:61:0x0196, B:62:0x0198, B:64:0x01a4, B:66:0x01c0, B:68:0x01e6, B:69:0x01f5, B:71:0x01fc, B:72:0x0206, B:75:0x0217, B:77:0x021b, B:80:0x0222, B:81:0x0223), top: B:110:0x00ee, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016b A[Catch: all -> 0x015b, TryCatch #3 {all -> 0x015b, blocks: (B:36:0x00ee, B:37:0x00f7, B:39:0x00ff, B:41:0x0113, B:43:0x0120, B:44:0x0122, B:48:0x0140, B:50:0x014a, B:54:0x015e, B:55:0x0165, B:57:0x016b, B:59:0x0180, B:61:0x0196, B:62:0x0198, B:64:0x01a4, B:66:0x01c0, B:68:0x01e6, B:69:0x01f5, B:71:0x01fc, B:72:0x0206, B:75:0x0217, B:77:0x021b, B:80:0x0222, B:81:0x0223), top: B:110:0x00ee, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c0 A[Catch: all -> 0x015b, TryCatch #3 {all -> 0x015b, blocks: (B:36:0x00ee, B:37:0x00f7, B:39:0x00ff, B:41:0x0113, B:43:0x0120, B:44:0x0122, B:48:0x0140, B:50:0x014a, B:54:0x015e, B:55:0x0165, B:57:0x016b, B:59:0x0180, B:61:0x0196, B:62:0x0198, B:64:0x01a4, B:66:0x01c0, B:68:0x01e6, B:69:0x01f5, B:71:0x01fc, B:72:0x0206, B:75:0x0217, B:77:0x021b, B:80:0x0222, B:81:0x0223), top: B:110:0x00ee, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01fc A[Catch: all -> 0x015b, TRY_LEAVE, TryCatch #3 {all -> 0x015b, blocks: (B:36:0x00ee, B:37:0x00f7, B:39:0x00ff, B:41:0x0113, B:43:0x0120, B:44:0x0122, B:48:0x0140, B:50:0x014a, B:54:0x015e, B:55:0x0165, B:57:0x016b, B:59:0x0180, B:61:0x0196, B:62:0x0198, B:64:0x01a4, B:66:0x01c0, B:68:0x01e6, B:69:0x01f5, B:71:0x01fc, B:72:0x0206, B:75:0x0217, B:77:0x021b, B:80:0x0222, B:81:0x0223), top: B:110:0x00ee, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x023e A[Catch: SQLiteException -> 0x00b9, all -> 0x024f, TryCatch #0 {SQLiteException -> 0x00b9, blocks: (B:26:0x00a6, B:30:0x00bc, B:32:0x00ca, B:35:0x00e6, B:82:0x022b, B:84:0x023e, B:86:0x0249, B:96:0x026b, B:90:0x0252, B:92:0x025b, B:94:0x0261, B:95:0x0265, B:98:0x026f, B:99:0x0277, B:34:0x00db), top: B:106:0x00a6, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0252 A[Catch: SQLiteException -> 0x00b9, all -> 0x024f, TryCatch #0 {SQLiteException -> 0x00b9, blocks: (B:26:0x00a6, B:30:0x00bc, B:32:0x00ca, B:35:0x00e6, B:82:0x022b, B:84:0x023e, B:86:0x0249, B:96:0x026b, B:90:0x0252, B:92:0x025b, B:94:0x0261, B:95:0x0265, B:98:0x026f, B:99:0x0277, B:34:0x00db), top: B:106:0x00a6, outer: #4 }] */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m13983y(boolean r22, int r23, java.lang.Throwable r24, byte[] r25, java.lang.String r26, java.util.List r27) {
        /*
            Method dump skipped, instructions count: 686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.h4.m13983y(boolean, int, java.lang.Throwable, byte[], java.lang.String, java.util.List):void");
    }

    /* renamed from: z */
    public final void m13984z(z0 z0Var) throws MalformedURLException {
        C1903e c1903e;
        C1903e c1903e2;
        mo327b().mo325M();
        if (TextUtils.isEmpty(z0Var.m14224G())) {
            String strM14221D = z0Var.m14221D();
            AbstractC6840z.m13036g(strM14221D);
            m13946A(strM14221D, 204, null, null, null);
            return;
        }
        String strM14221D2 = z0Var.m14221D();
        AbstractC6840z.m13036g(strM14221D2);
        mo326a().f35870p.m14141b(strM14221D2, "Fetching remote configuration");
        i1 i1Var = this.f35486a;
        m13944U(i1Var);
        com.google.android.gms.internal.measurement.g2 g2VarM13993Y = i1Var.m13993Y(strM14221D2);
        m13944U(i1Var);
        i1Var.mo325M();
        String str = (String) i1Var.f35519n.get(strM14221D2);
        if (g2VarM13993Y != null) {
            if (TextUtils.isEmpty(str)) {
                c1903e2 = null;
            } else {
                c1903e2 = new C1903e(0);
                c1903e2.put("If-Modified-Since", str);
            }
            m13944U(i1Var);
            i1Var.mo325M();
            String str2 = (String) i1Var.f35520p.get(strM14221D2);
            if (!TextUtils.isEmpty(str2)) {
                if (c1903e2 == null) {
                    c1903e2 = new C1903e(0);
                }
                c1903e2.put("If-None-Match", str2);
            }
            c1903e = c1903e2;
        } else {
            c1903e = null;
        }
        this.f35505w = true;
        y0 y0Var = this.f35487b;
        m13944U(y0Var);
        C7427b c7427b = new C7427b(2, this);
        n1 n1Var = (n1) y0Var.f482a;
        y0Var.mo325M();
        y0Var.m13858N();
        e4 e4Var = y0Var.f35959b.f35495k;
        Uri.Builder builder = new Uri.Builder();
        Uri.Builder builderAppendQueryParameter = builder.scheme((String) f0.f35411f.m13872a(null)).encodedAuthority((String) f0.f35412g.m13872a(null)).path("config/app/".concat(String.valueOf(z0Var.m14224G()))).appendQueryParameter("platform", "android");
        ((n1) e4Var.f482a).f35667d.m13884R();
        builderAppendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(133005L)).appendQueryParameter("runtime_version", "0");
        String string = builder.build().toString();
        try {
            URL url = new URI(string).toURL();
            m1 m1Var = n1Var.f35670g;
            n1.m14085m(m1Var);
            m1Var.m14050Y(new x0(y0Var, z0Var.m14221D(), url, (byte[]) null, c1903e, c7427b));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            v0 v0Var = n1Var.f35669f;
            n1.m14085m(v0Var);
            v0Var.f35862f.m14142c("Failed to parse config URL. Not fetching. appId", v0.m14157U(z0Var.m14221D()), string);
        }
    }
}
