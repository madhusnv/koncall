package og;

import com.skydoves.balloon.internals.DefinitionKt;
import com.websoptimization.callyzerbiz.R;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import p3.AbstractC5818p;
import p3.C5804b;
import p3.C5819q;
import q3.C6101a;
import q3.C6104d;
import q3.C6105e;
import rw.AbstractC6662l;
import rw.C6668r;
import s3.AbstractC6744a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class uc {
    /* renamed from: a */
    public static final void m10971a(C6105e c6105e, C5819q c5819q) {
        C6104d c6104d = (C6104d) c6105e.f29812c;
        C6104d c6104d2 = (C6104d) c6105e.f29811b;
        boolean zM11397a = AbstractC5818p.m11397a(c5819q);
        long j6 = c5819q.f28477b;
        if (zM11397a) {
            C6101a[] c6101aArr = c6104d2.f29805d;
            AbstractC6662l.m12726p(c6101aArr, 0, c6101aArr.length, null);
            c6104d2.f29806e = 0;
            C6101a[] c6101aArr2 = c6104d.f29805d;
            AbstractC6662l.m12726p(c6101aArr2, 0, c6101aArr2.length, null);
            c6104d.f29806e = 0;
            c6105e.f29810a = 0L;
        }
        if (!AbstractC5818p.m11399c(c5819q)) {
            List list = c5819q.f28486k;
            if (list == null) {
                list = C6668r.f31943a;
            }
            int i10 = 0;
            for (int size = list.size(); i10 < size; size = size) {
                C5804b c5804b = (C5804b) list.get(i10);
                long j10 = c5804b.f28410a;
                long j11 = c5804b.f28412c;
                c6104d2.m12139a(Float.intBitsToFloat((int) (j11 >> 32)), j10);
                c6104d.m12139a(Float.intBitsToFloat((int) (j11 & 4294967295L)), j10);
                i10++;
            }
            long j12 = c5819q.f28487l;
            c6104d2.m12139a(Float.intBitsToFloat((int) (j12 >> 32)), j6);
            c6104d.m12139a(Float.intBitsToFloat((int) (j12 & 4294967295L)), j6);
        }
        if (AbstractC5818p.m11399c(c5819q) && j6 - c6105e.f29810a > 40) {
            C6101a[] c6101aArr3 = c6104d2.f29805d;
            AbstractC6662l.m12726p(c6101aArr3, 0, c6101aArr3.length, null);
            c6104d2.f29806e = 0;
            C6101a[] c6101aArr4 = c6104d.f29805d;
            AbstractC6662l.m12726p(c6101aArr4, 0, c6101aArr4.length, null);
            c6104d.f29806e = 0;
            c6105e.f29810a = 0L;
        }
        c6105e.f29810a = j6;
    }

    /* renamed from: b */
    public static final float m10972b(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f6 = DefinitionKt.NO_Float_VALUE;
        for (int i10 = 0; i10 < length; i10++) {
            f6 += fArr[i10] * fArr2[i10];
        }
        return f6;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* renamed from: c */
    public static final int m10973c(String countryName) {
        AbstractC4154l.m8923f(countryName, "countryName");
        int iHashCode = countryName.hashCode();
        if (iHashCode == 3115) {
            return !countryName.equals("al") ? R.drawable.tr : R.drawable.al;
        }
        if (iHashCode == 3116) {
            return !countryName.equals("am") ? R.drawable.tr : R.drawable.am;
        }
        if (iHashCode == 3126) {
            return !countryName.equals("aw") ? R.drawable.tr : R.drawable.aw;
        }
        if (iHashCode == 3127) {
            return !countryName.equals("ax") ? R.drawable.tr : R.drawable.ax;
        }
        if (iHashCode == 3135) {
            return !countryName.equals("ba") ? R.drawable.tr : R.drawable.ba;
        }
        if (iHashCode == 3136) {
            return !countryName.equals("bb") ? R.drawable.tr : R.drawable.bb;
        }
        if (iHashCode == 3159) {
            return !countryName.equals("by") ? R.drawable.tr : R.drawable.by;
        }
        if (iHashCode == 3160) {
            return !countryName.equals("bz") ? R.drawable.tr : R.drawable.bz;
        }
        if (iHashCode == 3168) {
            return !countryName.equals("cc") ? R.drawable.tr : R.drawable.cc;
        }
        if (iHashCode == 3169) {
            return !countryName.equals("cd") ? R.drawable.tr : R.drawable.cd;
        }
        switch (iHashCode) {
            case 3107:
                return !countryName.equals("ad") ? R.drawable.tr : R.drawable.ad;
            case 3108:
                return !countryName.equals("ae") ? R.drawable.tr : R.drawable.ae;
            case 3109:
                return !countryName.equals("af") ? R.drawable.tr : R.drawable.af;
            case 3110:
                return !countryName.equals("ag") ? R.drawable.tr : R.drawable.ag;
            default:
                switch (iHashCode) {
                    case 3112:
                        return !countryName.equals("ai") ? R.drawable.tr : R.drawable.ai;
                    case 3118:
                        return !countryName.equals("ao") ? R.drawable.tr : R.drawable.ao;
                    case 3129:
                        return !countryName.equals("az") ? R.drawable.tr : R.drawable.az;
                    case 3138:
                        return !countryName.equals("bd") ? R.drawable.tr : R.drawable.bd;
                    case 3139:
                        return !countryName.equals("be") ? R.drawable.tr : R.drawable.be;
                    case 3140:
                        return !countryName.equals("bf") ? R.drawable.tr : R.drawable.bf;
                    case 3141:
                        return !countryName.equals("bg") ? R.drawable.tr : R.drawable.bg;
                    case 3142:
                        return !countryName.equals("bh") ? R.drawable.tr : R.drawable.bh;
                    case 3143:
                        return !countryName.equals("bi") ? R.drawable.tr : R.drawable.bi;
                    case 3144:
                        return !countryName.equals("bj") ? R.drawable.tr : R.drawable.bj;
                    case 3157:
                        return !countryName.equals("bw") ? R.drawable.tr : R.drawable.bw;
                    case 3166:
                        return !countryName.equals("ca") ? R.drawable.tr : R.drawable.ca;
                    case 3171:
                        return !countryName.equals("cf") ? R.drawable.tr : R.drawable.cf;
                    case 3172:
                        return !countryName.equals("cg") ? R.drawable.tr : R.drawable.cg;
                    case 3173:
                        return !countryName.equals("ch") ? R.drawable.tr : R.drawable.ch;
                    case 3174:
                        return !countryName.equals("ci") ? R.drawable.tr : R.drawable.ci;
                    case 3176:
                        return !countryName.equals("ck") ? R.drawable.tr : R.drawable.ck;
                    case 3177:
                        return !countryName.equals("cl") ? R.drawable.tr : R.drawable.cl;
                    case 3178:
                        return !countryName.equals("cm") ? R.drawable.tr : R.drawable.cm;
                    case 3179:
                        return !countryName.equals("cn") ? R.drawable.tr : R.drawable.cn;
                    case 3180:
                        return !countryName.equals("co") ? R.drawable.tr : R.drawable.co;
                    case 3183:
                        return !countryName.equals("cr") ? R.drawable.tr : R.drawable.cr;
                    case 3186:
                        return !countryName.equals("cu") ? R.drawable.tr : R.drawable.cu;
                    case 3187:
                        return !countryName.equals("cv") ? R.drawable.tr : R.drawable.cv;
                    case 3188:
                        return !countryName.equals("cw") ? R.drawable.tr : R.drawable.cw;
                    case 3189:
                        return !countryName.equals("cx") ? R.drawable.tr : R.drawable.cx;
                    case 3190:
                        return !countryName.equals("cy") ? R.drawable.tr : R.drawable.cy;
                    case 3191:
                        return !countryName.equals("cz") ? R.drawable.tr : R.drawable.cz;
                    case 3201:
                        return !countryName.equals("de") ? R.drawable.tr : R.drawable.de;
                    case 3206:
                        return !countryName.equals("dj") ? R.drawable.tr : R.drawable.dj;
                    case 3207:
                        return !countryName.equals("dk") ? R.drawable.tr : R.drawable.dk;
                    case 3209:
                        return !countryName.equals("dm") ? R.drawable.tr : R.drawable.dm;
                    case 3211:
                        return !countryName.equals("do") ? R.drawable.tr : R.drawable.ic_do;
                    case 3222:
                        return !countryName.equals("dz") ? R.drawable.tr : R.drawable.dz;
                    case 3230:
                        return !countryName.equals("ec") ? R.drawable.tr : R.drawable.ec;
                    case 3232:
                        return !countryName.equals("ee") ? R.drawable.tr : R.drawable.ee;
                    case 3234:
                        return !countryName.equals("eg") ? R.drawable.tr : R.drawable.eg;
                    case 3245:
                        return !countryName.equals("er") ? R.drawable.tr : R.drawable.er;
                    case 3246:
                        return !countryName.equals("es") ? R.drawable.tr : R.drawable.es;
                    case 3247:
                        return !countryName.equals("et") ? R.drawable.tr : R.drawable.et;
                    case 3267:
                        return !countryName.equals("fi") ? R.drawable.tr : R.drawable.fi;
                    case 3268:
                        return !countryName.equals("fj") ? R.drawable.tr : R.drawable.fj;
                    case 3269:
                        return !countryName.equals("fk") ? R.drawable.tr : R.drawable.fk;
                    case 3271:
                        return !countryName.equals("fm") ? R.drawable.tr : R.drawable.fm;
                    case 3273:
                        return !countryName.equals("fo") ? R.drawable.tr : R.drawable.fo;
                    case 3276:
                        return !countryName.equals("fr") ? R.drawable.tr : R.drawable.fr;
                    case 3290:
                        return !countryName.equals("ga") ? R.drawable.tr : R.drawable.ga;
                    case 3291:
                        return !countryName.equals("gb") ? R.drawable.tr : R.drawable.gb;
                    case 3293:
                        return !countryName.equals("gd") ? R.drawable.tr : R.drawable.gd;
                    case 3294:
                        return !countryName.equals("ge") ? R.drawable.tr : R.drawable.ge;
                    case 3295:
                        return !countryName.equals("gf") ? R.drawable.tr : R.drawable.gf;
                    case 3296:
                        return !countryName.equals("gg") ? R.drawable.tr : R.drawable.gg;
                    case 3297:
                        return !countryName.equals("gh") ? R.drawable.tr : R.drawable.gh;
                    case 3298:
                        return !countryName.equals("gi") ? R.drawable.tr : R.drawable.gi;
                    case 3301:
                        return !countryName.equals("gl") ? R.drawable.tr : R.drawable.gl;
                    case 3302:
                        return !countryName.equals("gm") ? R.drawable.tr : R.drawable.gm;
                    case 3303:
                        return !countryName.equals("gn") ? R.drawable.tr : R.drawable.gn;
                    case 3305:
                        return !countryName.equals("gp") ? R.drawable.tr : R.drawable.gp;
                    case 3306:
                        return !countryName.equals("gq") ? R.drawable.tr : R.drawable.gq;
                    case 3307:
                        return !countryName.equals("gr") ? R.drawable.tr : R.drawable.gr;
                    case 3309:
                        return !countryName.equals("gt") ? R.drawable.tr : R.drawable.gt;
                    case 3310:
                        return !countryName.equals("gu") ? R.drawable.tr : R.drawable.gu;
                    case 3312:
                        return !countryName.equals("gw") ? R.drawable.tr : R.drawable.gw;
                    case 3314:
                        return !countryName.equals("gy") ? R.drawable.tr : R.drawable.gy;
                    case 3331:
                        return !countryName.equals("hk") ? R.drawable.tr : R.drawable.hk;
                    case 3334:
                        return !countryName.equals("hn") ? R.drawable.tr : R.drawable.hn;
                    case 3338:
                        return !countryName.equals("hr") ? R.drawable.tr : R.drawable.hr;
                    case 3340:
                        return !countryName.equals("ht") ? R.drawable.tr : R.drawable.ht;
                    case 3341:
                        return !countryName.equals("hu") ? R.drawable.tr : R.drawable.hu;
                    case 3355:
                        return !countryName.equals("id") ? R.drawable.tr : R.drawable.id;
                    case 3356:
                        return !countryName.equals("ie") ? R.drawable.tr : R.drawable.ie;
                    case 3363:
                        return !countryName.equals("il") ? R.drawable.tr : R.drawable.il;
                    case 3364:
                        return !countryName.equals("im") ? R.drawable.tr : R.drawable.im;
                    case 3365:
                        return !countryName.equals("in") ? R.drawable.tr : R.drawable.in;
                    case 3366:
                        return !countryName.equals("io") ? R.drawable.tr : R.drawable.io;
                    case 3368:
                        return !countryName.equals("iq") ? R.drawable.tr : R.drawable.iq;
                    case 3369:
                        return !countryName.equals("ir") ? R.drawable.tr : R.drawable.ir;
                    case 3370:
                        return !countryName.equals("is") ? R.drawable.tr : R.drawable.is;
                    case 3371:
                        return !countryName.equals("it") ? R.drawable.tr : R.drawable.it;
                    case 3387:
                        return !countryName.equals("je") ? R.drawable.tr : R.drawable.je;
                    case 3395:
                        return !countryName.equals("jm") ? R.drawable.tr : R.drawable.jm;
                    case 3397:
                        return !countryName.equals("jo") ? R.drawable.tr : R.drawable.jo;
                    case 3398:
                        return !countryName.equals("jp") ? R.drawable.tr : R.drawable.jp;
                    case 3418:
                        return !countryName.equals("ke") ? R.drawable.tr : R.drawable.ke;
                    case 3420:
                        return !countryName.equals("kg") ? R.drawable.tr : R.drawable.kg;
                    case 3421:
                        return !countryName.equals("kh") ? R.drawable.tr : R.drawable.kh;
                    case 3422:
                        return !countryName.equals("ki") ? R.drawable.tr : R.drawable.ki;
                    case 3426:
                        return !countryName.equals("km") ? R.drawable.tr : R.drawable.km;
                    case 3427:
                        return !countryName.equals("kn") ? R.drawable.tr : R.drawable.kn;
                    case 3429:
                        return !countryName.equals("kp") ? R.drawable.tr : R.drawable.kp;
                    case 3431:
                        return !countryName.equals("kr") ? R.drawable.tr : R.drawable.kr;
                    case 3436:
                        return !countryName.equals("kw") ? R.drawable.tr : R.drawable.kw;
                    case 3438:
                        return !countryName.equals("ky") ? R.drawable.tr : R.drawable.ky;
                    case 3439:
                        return !countryName.equals("kz") ? R.drawable.tr : R.drawable.kz;
                    case 3445:
                        return !countryName.equals("la") ? R.drawable.tr : R.drawable.la;
                    case 3446:
                        return !countryName.equals("lb") ? R.drawable.tr : R.drawable.lb;
                    case 3447:
                        return !countryName.equals("lc") ? R.drawable.tr : R.drawable.lc;
                    case 3453:
                        return !countryName.equals("li") ? R.drawable.tr : R.drawable.li;
                    case 3455:
                        return !countryName.equals("lk") ? R.drawable.tr : R.drawable.lk;
                    case 3462:
                        return !countryName.equals("lr") ? R.drawable.tr : R.drawable.lr;
                    case 3463:
                        return !countryName.equals("ls") ? R.drawable.tr : R.drawable.ls;
                    case 3464:
                        return !countryName.equals("lt") ? R.drawable.tr : R.drawable.lt;
                    case 3465:
                        return !countryName.equals("lu") ? R.drawable.tr : R.drawable.lu;
                    case 3466:
                        return !countryName.equals("lv") ? R.drawable.tr : R.drawable.lv;
                    case 3469:
                        return !countryName.equals("ly") ? R.drawable.tr : R.drawable.ly;
                    case 3476:
                        return !countryName.equals("ma") ? R.drawable.tr : R.drawable.ma;
                    case 3478:
                        return !countryName.equals("mc") ? R.drawable.tr : R.drawable.mc;
                    case 3479:
                        return !countryName.equals("md") ? R.drawable.tr : R.drawable.md;
                    case 3480:
                        return !countryName.equals("me") ? R.drawable.tr : R.drawable.me;
                    case 3481:
                        return !countryName.equals("mf") ? R.drawable.tr : R.drawable.mf;
                    case 3482:
                        return !countryName.equals("mg") ? R.drawable.tr : R.drawable.mg;
                    case 3483:
                        return !countryName.equals("mh") ? R.drawable.tr : R.drawable.mh;
                    case 3486:
                        return !countryName.equals("mk") ? R.drawable.tr : R.drawable.mk;
                    case 3487:
                        return !countryName.equals("ml") ? R.drawable.tr : R.drawable.ml;
                    case 3488:
                        return !countryName.equals("mm") ? R.drawable.tr : R.drawable.mm;
                    case 3489:
                        return !countryName.equals("mn") ? R.drawable.tr : R.drawable.mn;
                    case 3490:
                        return !countryName.equals("mo") ? R.drawable.tr : R.drawable.mo;
                    case 3491:
                        return !countryName.equals("mp") ? R.drawable.tr : R.drawable.mp;
                    case 3492:
                        return !countryName.equals("mq") ? R.drawable.tr : R.drawable.mq;
                    case 3493:
                        return !countryName.equals("mr") ? R.drawable.tr : R.drawable.mr;
                    case 3494:
                        return !countryName.equals("ms") ? R.drawable.tr : R.drawable.ms;
                    case 3495:
                        return !countryName.equals("mt") ? R.drawable.tr : R.drawable.mt;
                    case 3496:
                        return !countryName.equals("mu") ? R.drawable.tr : R.drawable.mu;
                    case 3497:
                        return !countryName.equals("mv") ? R.drawable.tr : R.drawable.mv;
                    case 3498:
                        return !countryName.equals("mw") ? R.drawable.tr : R.drawable.mw;
                    case 3499:
                        return !countryName.equals("mx") ? R.drawable.tr : R.drawable.mx;
                    case 3500:
                        return !countryName.equals("my") ? R.drawable.tr : R.drawable.my;
                    case 3501:
                        return !countryName.equals("mz") ? R.drawable.tr : R.drawable.mz;
                    case 3507:
                        return !countryName.equals("na") ? R.drawable.tr : R.drawable.na;
                    case 3509:
                        return !countryName.equals("nc") ? R.drawable.tr : R.drawable.nc;
                    case 3511:
                        return !countryName.equals("ne") ? R.drawable.tr : R.drawable.ne;
                    case 3512:
                        return !countryName.equals("nf") ? R.drawable.tr : R.drawable.nf;
                    case 3513:
                        return !countryName.equals("ng") ? R.drawable.tr : R.drawable.ng;
                    case 3515:
                        return !countryName.equals("ni") ? R.drawable.tr : R.drawable.ni;
                    case 3518:
                        return !countryName.equals("nl") ? R.drawable.tr : R.drawable.nl;
                    case 3521:
                        return !countryName.equals("no") ? R.drawable.tr : R.drawable.no;
                    case 3522:
                        return !countryName.equals("np") ? R.drawable.tr : R.drawable.np;
                    case 3524:
                        return !countryName.equals("nr") ? R.drawable.tr : R.drawable.nr;
                    case 3527:
                        return !countryName.equals("nu") ? R.drawable.tr : R.drawable.nu;
                    case 3532:
                        return !countryName.equals("nz") ? R.drawable.tr : R.drawable.nz;
                    case 3550:
                        return !countryName.equals("om") ? R.drawable.tr : R.drawable.om;
                    case 3569:
                        return !countryName.equals("pa") ? R.drawable.tr : R.drawable.pa;
                    case 3573:
                        return !countryName.equals("pe") ? R.drawable.tr : R.drawable.pe;
                    case 3574:
                        return !countryName.equals("pf") ? R.drawable.tr : R.drawable.pf;
                    case 3575:
                        return !countryName.equals("pg") ? R.drawable.tr : R.drawable.pg;
                    case 3576:
                        return !countryName.equals("ph") ? R.drawable.tr : R.drawable.ph;
                    case 3579:
                        return !countryName.equals("pk") ? R.drawable.tr : R.drawable.pk;
                    case 3580:
                        return !countryName.equals("pl") ? R.drawable.tr : R.drawable.pl;
                    case 3581:
                        return !countryName.equals("pm") ? R.drawable.tr : R.drawable.pm;
                    case 3582:
                        return !countryName.equals("pn") ? R.drawable.tr : R.drawable.pn;
                    case 3586:
                        return !countryName.equals("pr") ? R.drawable.tr : R.drawable.pr;
                    case 3587:
                        return !countryName.equals("ps") ? R.drawable.tr : R.drawable.ps;
                    case 3588:
                        return !countryName.equals("pt") ? R.drawable.tr : R.drawable.pt;
                    case 3591:
                        return !countryName.equals("pw") ? R.drawable.tr : R.drawable.pw;
                    case 3593:
                        return !countryName.equals("py") ? R.drawable.tr : R.drawable.py;
                    case 3600:
                        return !countryName.equals("qa") ? R.drawable.tr : R.drawable.qa;
                    case 3635:
                        return !countryName.equals("re") ? R.drawable.tr : R.drawable.re;
                    case 3645:
                        return !countryName.equals("ro") ? R.drawable.tr : R.drawable.ro;
                    case 3649:
                        return !countryName.equals("rs") ? R.drawable.tr : R.drawable.rs;
                    case 3651:
                        return !countryName.equals("ru") ? R.drawable.tr : R.drawable.ru;
                    case 3653:
                        return !countryName.equals("rw") ? R.drawable.tr : R.drawable.rw;
                    case 3662:
                        return !countryName.equals("sa") ? R.drawable.tr : R.drawable.sa;
                    case 3663:
                        return !countryName.equals("sb") ? R.drawable.tr : R.drawable.sb;
                    case 3664:
                        return !countryName.equals("sc") ? R.drawable.tr : R.drawable.sc;
                    case 3665:
                        return !countryName.equals("sd") ? R.drawable.tr : R.drawable.sd;
                    case 3666:
                        return !countryName.equals("se") ? R.drawable.tr : R.drawable.se;
                    case 3668:
                        return !countryName.equals("sg") ? R.drawable.tr : R.drawable.sg;
                    case 3669:
                        return !countryName.equals("sh") ? R.drawable.tr : R.drawable.sh;
                    case 3670:
                        return !countryName.equals("si") ? R.drawable.tr : R.drawable.si;
                    case 3672:
                        return !countryName.equals("sk") ? R.drawable.tr : R.drawable.sk;
                    case 3673:
                        return !countryName.equals("sl") ? R.drawable.tr : R.drawable.sl;
                    case 3674:
                        return !countryName.equals("sm") ? R.drawable.tr : R.drawable.sm;
                    case 3675:
                        return !countryName.equals("sn") ? R.drawable.tr : R.drawable.sn;
                    case 3676:
                        return !countryName.equals("so") ? R.drawable.tr : R.drawable.so;
                    case 3679:
                        return !countryName.equals("sr") ? R.drawable.tr : R.drawable.sr;
                    case 3680:
                        return !countryName.equals("ss") ? R.drawable.tr : R.drawable.ss;
                    case 3681:
                        return !countryName.equals("st") ? R.drawable.tr : R.drawable.st;
                    case 3683:
                        return !countryName.equals("sv") ? R.drawable.tr : R.drawable.sv;
                    case 3685:
                        return !countryName.equals("sx") ? R.drawable.tr : R.drawable.sx;
                    case 3686:
                        return !countryName.equals("sy") ? R.drawable.tr : R.drawable.sy;
                    case 3687:
                        return !countryName.equals("sz") ? R.drawable.tr : R.drawable.sz;
                    case 3695:
                        return !countryName.equals("tc") ? R.drawable.tr : R.drawable.tc;
                    case 3696:
                        return !countryName.equals("td") ? R.drawable.tr : R.drawable.td;
                    case 3699:
                        return !countryName.equals("tg") ? R.drawable.tr : R.drawable.tg;
                    case 3700:
                        return !countryName.equals("th") ? R.drawable.tr : R.drawable.th;
                    case 3702:
                        return !countryName.equals("tj") ? R.drawable.tr : R.drawable.tj;
                    case 3703:
                        return !countryName.equals("tk") ? R.drawable.tr : R.drawable.tk;
                    case 3704:
                        return !countryName.equals("tl") ? R.drawable.tr : R.drawable.tl;
                    case 3705:
                        return !countryName.equals("tm") ? R.drawable.tr : R.drawable.tm;
                    case 3706:
                        return !countryName.equals("tn") ? R.drawable.tr : R.drawable.tn;
                    case 3707:
                        return !countryName.equals("to") ? R.drawable.tr : R.drawable.to;
                    case 3710:
                        countryName.equals("tr");
                        return R.drawable.tr;
                    case 3712:
                        return !countryName.equals("tt") ? R.drawable.tr : R.drawable.tt;
                    case 3714:
                        return !countryName.equals("tv") ? R.drawable.tr : R.drawable.tv;
                    case 3715:
                        return !countryName.equals("tw") ? R.drawable.tr : R.drawable.tw;
                    case 3718:
                        return !countryName.equals("tz") ? R.drawable.tr : R.drawable.tz;
                    case 3724:
                        return !countryName.equals("ua") ? R.drawable.tr : R.drawable.ua;
                    case 3730:
                        return !countryName.equals("ug") ? R.drawable.tr : R.drawable.ug;
                    case 3742:
                        return !countryName.equals("us") ? R.drawable.tr : R.drawable.us;
                    case 3748:
                        return !countryName.equals("uy") ? R.drawable.tr : R.drawable.uy;
                    case 3749:
                        return !countryName.equals("uz") ? R.drawable.tr : R.drawable.uz;
                    case 3755:
                        return !countryName.equals("va") ? R.drawable.tr : R.drawable.va;
                    case 3757:
                        return !countryName.equals("vc") ? R.drawable.tr : R.drawable.vc;
                    case 3759:
                        return !countryName.equals("ve") ? R.drawable.tr : R.drawable.ve;
                    case 3761:
                        return !countryName.equals("vg") ? R.drawable.tr : R.drawable.vg;
                    case 3763:
                        return !countryName.equals("vi") ? R.drawable.tr : R.drawable.vi;
                    case 3768:
                        return !countryName.equals("vn") ? R.drawable.tr : R.drawable.vn;
                    case 3775:
                        return !countryName.equals("vu") ? R.drawable.tr : R.drawable.vu;
                    case 3791:
                        return !countryName.equals("wf") ? R.drawable.tr : R.drawable.wf;
                    case 3804:
                        return !countryName.equals("ws") ? R.drawable.tr : R.drawable.ws;
                    case 3827:
                        return !countryName.equals("xk") ? R.drawable.tr : R.drawable.xk;
                    case 3852:
                        return !countryName.equals("ye") ? R.drawable.tr : R.drawable.ye;
                    case 3867:
                        return !countryName.equals("yt") ? R.drawable.tr : R.drawable.yt;
                    case 3879:
                        return !countryName.equals("za") ? R.drawable.tr : R.drawable.za;
                    case 3891:
                        return !countryName.equals("zm") ? R.drawable.tr : R.drawable.zm;
                    case 3901:
                        return !countryName.equals("zw") ? R.drawable.tr : R.drawable.zw;
                    default:
                        switch (iHashCode) {
                            case 3120:
                                return !countryName.equals("aq") ? R.drawable.tr : R.drawable.aq;
                            case 3121:
                                return !countryName.equals("ar") ? R.drawable.tr : R.drawable.ar;
                            case 3122:
                                return !countryName.equals("as") ? R.drawable.tr : R.drawable.as;
                            case 3123:
                                return !countryName.equals("at") ? R.drawable.tr : R.drawable.at;
                            case 3124:
                                return !countryName.equals("au") ? R.drawable.tr : R.drawable.au;
                            default:
                                switch (iHashCode) {
                                    case 3146:
                                        return !countryName.equals("bl") ? R.drawable.tr : R.drawable.bl;
                                    case 3147:
                                        return !countryName.equals("bm") ? R.drawable.tr : R.drawable.bm;
                                    case 3148:
                                        return !countryName.equals("bn") ? R.drawable.tr : R.drawable.bn;
                                    case 3149:
                                        return !countryName.equals("bo") ? R.drawable.tr : R.drawable.bo;
                                    default:
                                        switch (iHashCode) {
                                            case 3152:
                                                return !countryName.equals("br") ? R.drawable.tr : R.drawable.br;
                                            case 3153:
                                                return !countryName.equals("bs") ? R.drawable.tr : R.drawable.bs;
                                            case 3154:
                                                return !countryName.equals("bt") ? R.drawable.tr : R.drawable.bt;
                                            default:
                                                return R.drawable.tr;
                                        }
                                }
                        }
                }
        }
    }

    /* renamed from: d */
    public static final void m10974d(float[] fArr, float[] fArr2, int i10, float[] fArr3) {
        if (i10 == 0) {
            AbstractC6744a.m12906a("At least one point must be provided");
        }
        int i11 = 2 >= i10 ? i10 - 1 : 2;
        int i12 = i11 + 1;
        float[][] fArr4 = new float[i12][];
        for (int i13 = 0; i13 < i12; i13++) {
            fArr4[i13] = new float[i10];
        }
        for (int i14 = 0; i14 < i10; i14++) {
            fArr4[0][i14] = 1.0f;
            for (int i15 = 1; i15 < i12; i15++) {
                fArr4[i15][i14] = fArr4[i15 - 1][i14] * fArr[i14];
            }
        }
        float[][] fArr5 = new float[i12][];
        for (int i16 = 0; i16 < i12; i16++) {
            fArr5[i16] = new float[i10];
        }
        float[][] fArr6 = new float[i12][];
        for (int i17 = 0; i17 < i12; i17++) {
            fArr6[i17] = new float[i12];
        }
        int i18 = 0;
        while (i18 < i12) {
            float[] destination = fArr5[i18];
            float[] fArr7 = fArr4[i18];
            AbstractC4154l.m8923f(fArr7, "<this>");
            AbstractC4154l.m8923f(destination, "destination");
            System.arraycopy(fArr7, 0, destination, 0, i10);
            for (int i19 = 0; i19 < i18; i19++) {
                float[] fArr8 = fArr5[i19];
                float fM10972b = m10972b(destination, fArr8);
                for (int i20 = 0; i20 < i10; i20++) {
                    destination[i20] = destination[i20] - (fArr8[i20] * fM10972b);
                }
            }
            float fSqrt = (float) Math.sqrt(m10972b(destination, destination));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f6 = 1.0f / fSqrt;
            for (int i21 = 0; i21 < i10; i21++) {
                destination[i21] = destination[i21] * f6;
            }
            float[] fArr9 = fArr6[i18];
            int i22 = 0;
            while (i22 < i12) {
                fArr9[i22] = i22 < i18 ? DefinitionKt.NO_Float_VALUE : m10972b(destination, fArr4[i22]);
                i22++;
            }
            i18++;
        }
        for (int i23 = i11; -1 < i23; i23--) {
            float fM10972b2 = m10972b(fArr5[i23], fArr2);
            float[] fArr10 = fArr6[i23];
            int i24 = i23 + 1;
            if (i24 <= i11) {
                int i25 = i11;
                while (true) {
                    fM10972b2 -= fArr10[i25] * fArr3[i25];
                    if (i25 != i24) {
                        i25--;
                    }
                }
            }
            fArr3[i23] = fM10972b2 / fArr10[i23];
        }
    }
}
