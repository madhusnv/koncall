package og;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import com.websoptimization.callyzerbiz.R;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class vc {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* renamed from: a */
    public static final int m11014a(String countryName) {
        AbstractC4154l.m8923f(countryName, "countryName");
        int iHashCode = countryName.hashCode();
        if (iHashCode == 3115) {
            return !countryName.equals("al") ? R.string.unkown : R.string.albania;
        }
        if (iHashCode == 3116) {
            return !countryName.equals("am") ? R.string.unkown : R.string.armenia;
        }
        if (iHashCode == 3126) {
            return !countryName.equals("aw") ? R.string.unkown : R.string.aruba;
        }
        if (iHashCode == 3127) {
            return !countryName.equals("ax") ? R.string.unkown : R.string.aland_islands;
        }
        if (iHashCode == 3135) {
            return !countryName.equals("ba") ? R.string.unkown : R.string.bosnia;
        }
        if (iHashCode == 3136) {
            return !countryName.equals("bb") ? R.string.unkown : R.string.barbados;
        }
        if (iHashCode == 3159) {
            return !countryName.equals("by") ? R.string.unkown : R.string.belarus;
        }
        if (iHashCode == 3160) {
            return !countryName.equals("bz") ? R.string.unkown : R.string.belize;
        }
        if (iHashCode == 3168) {
            return !countryName.equals("cc") ? R.string.unkown : R.string.cocos;
        }
        if (iHashCode == 3169) {
            return !countryName.equals("cd") ? R.string.unkown : R.string.congo_democratic;
        }
        switch (iHashCode) {
            case 3107:
                return !countryName.equals("ad") ? R.string.unkown : R.string.andorra;
            case 3108:
                return !countryName.equals("ae") ? R.string.unkown : R.string.united_arab_emirates;
            case 3109:
                return !countryName.equals("af") ? R.string.unkown : R.string.afghanistan;
            case 3110:
                return !countryName.equals("ag") ? R.string.unkown : R.string.antigua_and_barbuda;
            default:
                switch (iHashCode) {
                    case 3112:
                        return !countryName.equals("ai") ? R.string.unkown : R.string.anguilla;
                    case 3118:
                        return !countryName.equals("ao") ? R.string.unkown : R.string.angola;
                    case 3129:
                        return !countryName.equals("az") ? R.string.unkown : R.string.azerbaijan;
                    case 3138:
                        return !countryName.equals("bd") ? R.string.unkown : R.string.bangladesh;
                    case 3139:
                        return !countryName.equals("be") ? R.string.unkown : R.string.belgium;
                    case 3140:
                        return !countryName.equals("bf") ? R.string.unkown : R.string.burkina_faso;
                    case 3141:
                        return !countryName.equals("bg") ? R.string.unkown : R.string.bulgaria;
                    case 3142:
                        return !countryName.equals("bh") ? R.string.unkown : R.string.bahrain;
                    case 3143:
                        return !countryName.equals("bi") ? R.string.unkown : R.string.burundi;
                    case 3144:
                        return !countryName.equals("bj") ? R.string.unkown : R.string.benin;
                    case 3157:
                        return !countryName.equals("bw") ? R.string.unkown : R.string.botswana;
                    case 3166:
                        return !countryName.equals("ca") ? R.string.unkown : R.string.canada;
                    case 3171:
                        return !countryName.equals("cf") ? R.string.unkown : R.string.central_african;
                    case 3172:
                        return !countryName.equals("cg") ? R.string.unkown : R.string.congo;
                    case 3173:
                        return !countryName.equals("ch") ? R.string.unkown : R.string.switzerland;
                    case 3174:
                        return !countryName.equals("ci") ? R.string.unkown : R.string.cote_dlvoire;
                    case 3176:
                        return !countryName.equals("ck") ? R.string.unkown : R.string.cook_islands;
                    case 3177:
                        return !countryName.equals("cl") ? R.string.unkown : R.string.chile;
                    case 3178:
                        return !countryName.equals("cm") ? R.string.unkown : R.string.cameroon;
                    case 3179:
                        return !countryName.equals("cn") ? R.string.unkown : R.string.china;
                    case 3180:
                        return !countryName.equals("co") ? R.string.unkown : R.string.colombia;
                    case 3183:
                        return !countryName.equals("cr") ? R.string.unkown : R.string.costa_rica;
                    case 3186:
                        return !countryName.equals("cu") ? R.string.unkown : R.string.cuba;
                    case 3187:
                        return !countryName.equals("cv") ? R.string.unkown : R.string.cape_verde;
                    case 3188:
                        return !countryName.equals("cw") ? R.string.unkown : R.string.curacao;
                    case 3189:
                        return !countryName.equals("cx") ? R.string.unkown : R.string.christmas_island;
                    case 3190:
                        return !countryName.equals("cy") ? R.string.unkown : R.string.cyprus;
                    case 3191:
                        return !countryName.equals("cz") ? R.string.unkown : R.string.czech_republic;
                    case 3201:
                        return !countryName.equals("de") ? R.string.unkown : R.string.germany;
                    case 3206:
                        return !countryName.equals("dj") ? R.string.unkown : R.string.djibouti;
                    case 3207:
                        return !countryName.equals("dk") ? R.string.unkown : R.string.denmark;
                    case 3209:
                        return !countryName.equals("dm") ? R.string.unkown : R.string.dominica;
                    case 3211:
                        return !countryName.equals("do") ? R.string.unkown : R.string.dominician_republic;
                    case 3222:
                        return !countryName.equals("dz") ? R.string.unkown : R.string.algeria;
                    case 3230:
                        return !countryName.equals("ec") ? R.string.unkown : R.string.ecuador;
                    case 3232:
                        return !countryName.equals("ee") ? R.string.unkown : R.string.estonia;
                    case 3234:
                        return !countryName.equals("eg") ? R.string.unkown : R.string.egypt;
                    case 3245:
                        return !countryName.equals("er") ? R.string.unkown : R.string.eritrea;
                    case 3246:
                        return !countryName.equals("es") ? R.string.unkown : R.string.spain;
                    case 3247:
                        return !countryName.equals("et") ? R.string.unkown : R.string.ethiopia;
                    case 3267:
                        return !countryName.equals("fi") ? R.string.unkown : R.string.finland;
                    case 3268:
                        return !countryName.equals("fj") ? R.string.unkown : R.string.fiji;
                    case 3269:
                        return !countryName.equals("fk") ? R.string.unkown : R.string.falkland_islands;
                    case 3271:
                        return !countryName.equals("fm") ? R.string.unkown : R.string.micro;
                    case 3273:
                        return !countryName.equals("fo") ? R.string.unkown : R.string.faroe_islands;
                    case 3276:
                        return !countryName.equals("fr") ? R.string.unkown : R.string.france;
                    case 3290:
                        return !countryName.equals("ga") ? R.string.unkown : R.string.gabon;
                    case 3291:
                        return !countryName.equals("gb") ? R.string.unkown : R.string.united_kingdom;
                    case 3293:
                        return !countryName.equals("gd") ? R.string.unkown : R.string.grenada;
                    case 3294:
                        return !countryName.equals("ge") ? R.string.unkown : R.string.georgia;
                    case 3295:
                        return !countryName.equals("gf") ? R.string.unkown : R.string.french_guyana;
                    case 3296:
                        return !countryName.equals("gg") ? R.string.unkown : R.string.guernsey;
                    case 3297:
                        return !countryName.equals("gh") ? R.string.unkown : R.string.ghana;
                    case 3298:
                        return !countryName.equals("gi") ? R.string.unkown : R.string.gibraltar;
                    case 3301:
                        return !countryName.equals("gl") ? R.string.unkown : R.string.greenland;
                    case 3302:
                        return !countryName.equals("gm") ? R.string.unkown : R.string.gambia;
                    case 3303:
                        return !countryName.equals("gn") ? R.string.unkown : R.string.guinea;
                    case 3305:
                        return !countryName.equals("gp") ? R.string.unkown : R.string.guadeloupe;
                    case 3306:
                        return !countryName.equals("gq") ? R.string.unkown : R.string.equatorial_guinea;
                    case 3307:
                        return !countryName.equals("gr") ? R.string.unkown : R.string.greece;
                    case 3309:
                        return !countryName.equals("gt") ? R.string.unkown : R.string.guatemala;
                    case 3310:
                        return !countryName.equals("gu") ? R.string.unkown : R.string.guam;
                    case 3312:
                        return !countryName.equals("gw") ? R.string.unkown : R.string.guinea_bissau;
                    case 3314:
                        return !countryName.equals("gy") ? R.string.unkown : R.string.guyana;
                    case 3331:
                        return !countryName.equals("hk") ? R.string.unkown : R.string.hong_kong;
                    case 3334:
                        return !countryName.equals("hn") ? R.string.unkown : R.string.honduras;
                    case 3338:
                        return !countryName.equals("hr") ? R.string.unkown : R.string.croatia;
                    case 3340:
                        return !countryName.equals("ht") ? R.string.unkown : R.string.haiti;
                    case 3341:
                        return !countryName.equals("hu") ? R.string.unkown : R.string.hungary;
                    case 3355:
                        return !countryName.equals("id") ? R.string.unkown : R.string.indonesia;
                    case 3356:
                        return !countryName.equals("ie") ? R.string.unkown : R.string.ireland;
                    case 3363:
                        return !countryName.equals("il") ? R.string.unkown : R.string.israil;
                    case 3364:
                        return !countryName.equals("im") ? R.string.unkown : R.string.isle_of_man;
                    case 3365:
                        return !countryName.equals("in") ? R.string.unkown : R.string.india;
                    case 3366:
                        return !countryName.equals("io") ? R.string.unkown : R.string.british_indian_ocean;
                    case 3368:
                        return !countryName.equals("iq") ? R.string.unkown : R.string.iraq;
                    case 3369:
                        return !countryName.equals("ir") ? R.string.unkown : R.string.iran;
                    case 3370:
                        return !countryName.equals("is") ? R.string.unkown : R.string.iceland;
                    case 3371:
                        return !countryName.equals("it") ? R.string.unkown : R.string.italia;
                    case 3387:
                        return !countryName.equals("je") ? R.string.unkown : R.string.jersey;
                    case 3395:
                        return !countryName.equals("jm") ? R.string.unkown : R.string.jamaica;
                    case 3397:
                        return !countryName.equals("jo") ? R.string.unkown : R.string.jordan;
                    case 3398:
                        return !countryName.equals("jp") ? R.string.unkown : R.string.japan;
                    case 3418:
                        return !countryName.equals("ke") ? R.string.unkown : R.string.kenya;
                    case 3420:
                        return !countryName.equals("kg") ? R.string.unkown : R.string.kyrgyzstan;
                    case 3421:
                        return !countryName.equals("kh") ? R.string.unkown : R.string.cambodia;
                    case 3422:
                        return !countryName.equals("ki") ? R.string.unkown : R.string.kiribati;
                    case 3426:
                        return !countryName.equals("km") ? R.string.unkown : R.string.comoros;
                    case 3427:
                        return !countryName.equals("kn") ? R.string.unkown : R.string.saint_kitts;
                    case 3429:
                        return !countryName.equals("kp") ? R.string.unkown : R.string.north_korea;
                    case 3431:
                        return !countryName.equals("kr") ? R.string.unkown : R.string.south_korea;
                    case 3436:
                        return !countryName.equals("kw") ? R.string.unkown : R.string.kuwait;
                    case 3438:
                        return !countryName.equals("ky") ? R.string.unkown : R.string.cayman_islands;
                    case 3439:
                        return !countryName.equals("kz") ? R.string.unkown : R.string.kazakhstan;
                    case 3445:
                        return !countryName.equals("la") ? R.string.unkown : R.string.laos;
                    case 3446:
                        return !countryName.equals("lb") ? R.string.unkown : R.string.lebanon;
                    case 3447:
                        return !countryName.equals("lc") ? R.string.unkown : R.string.saint_lucia;
                    case 3453:
                        return !countryName.equals("li") ? R.string.unkown : R.string.liechtenstein;
                    case 3455:
                        return !countryName.equals("lk") ? R.string.unkown : R.string.siri_lanka;
                    case 3462:
                        return !countryName.equals("lr") ? R.string.unkown : R.string.liberia;
                    case 3463:
                        return !countryName.equals("ls") ? R.string.unkown : R.string.lesotho;
                    case 3464:
                        return !countryName.equals("lt") ? R.string.unkown : R.string.lithuania;
                    case 3465:
                        return !countryName.equals("lu") ? R.string.unkown : R.string.luxembourg;
                    case 3466:
                        return !countryName.equals("lv") ? R.string.unkown : R.string.latvia;
                    case 3469:
                        return !countryName.equals("ly") ? R.string.unkown : R.string.libya;
                    case 3476:
                        return !countryName.equals("ma") ? R.string.unkown : R.string.marocco;
                    case 3478:
                        return !countryName.equals("mc") ? R.string.unkown : R.string.monaco;
                    case 3479:
                        return !countryName.equals("md") ? R.string.unkown : R.string.moldova;
                    case 3480:
                        return !countryName.equals("me") ? R.string.unkown : R.string.montenegro;
                    case 3481:
                        return !countryName.equals("mf") ? R.string.unkown : R.string.saint_martin;
                    case 3482:
                        return !countryName.equals("mg") ? R.string.unkown : R.string.madagascar;
                    case 3483:
                        return !countryName.equals("mh") ? R.string.unkown : R.string.marshall_islands;
                    case 3486:
                        return !countryName.equals("mk") ? R.string.unkown : R.string.north_macedonia;
                    case 3487:
                        return !countryName.equals("ml") ? R.string.unkown : R.string.mali;
                    case 3488:
                        return !countryName.equals("mm") ? R.string.unkown : R.string.myanmar;
                    case 3489:
                        return !countryName.equals("mn") ? R.string.unkown : R.string.mongolia;
                    case 3490:
                        return !countryName.equals("mo") ? R.string.unkown : R.string.macau;
                    case 3491:
                        return !countryName.equals("mp") ? R.string.unkown : R.string.northern_mariana;
                    case 3492:
                        return !countryName.equals("mq") ? R.string.unkown : R.string.martinique;
                    case 3493:
                        return !countryName.equals("mr") ? R.string.unkown : R.string.mauriatana;
                    case 3494:
                        return !countryName.equals("ms") ? R.string.unkown : R.string.montserrat;
                    case 3495:
                        return !countryName.equals("mt") ? R.string.unkown : R.string.malta;
                    case 3496:
                        return !countryName.equals("mu") ? R.string.unkown : R.string.mauritius;
                    case 3497:
                        return !countryName.equals("mv") ? R.string.unkown : R.string.maldives;
                    case 3498:
                        return !countryName.equals("mw") ? R.string.unkown : R.string.malawi;
                    case 3499:
                        return !countryName.equals("mx") ? R.string.unkown : R.string.mexico;
                    case 3500:
                        return !countryName.equals("my") ? R.string.unkown : R.string.malaysia;
                    case 3501:
                        return !countryName.equals("mz") ? R.string.unkown : R.string.mozambique;
                    case 3507:
                        return !countryName.equals("na") ? R.string.unkown : R.string.namibia;
                    case 3509:
                        return !countryName.equals("nc") ? R.string.unkown : R.string.new_caledonia;
                    case 3511:
                        return !countryName.equals("ne") ? R.string.unkown : R.string.niger;
                    case 3512:
                        return !countryName.equals("nf") ? R.string.unkown : R.string.norfolk;
                    case 3513:
                        return !countryName.equals("ng") ? R.string.unkown : R.string.nigeria;
                    case 3515:
                        return !countryName.equals("ni") ? R.string.unkown : R.string.nicaragua;
                    case 3518:
                        return !countryName.equals("nl") ? R.string.unkown : R.string.netherlands;
                    case 3521:
                        return !countryName.equals("no") ? R.string.unkown : R.string.norway;
                    case 3522:
                        return !countryName.equals("np") ? R.string.unkown : R.string.nepal;
                    case 3524:
                        return !countryName.equals("nr") ? R.string.unkown : R.string.nauru;
                    case 3527:
                        return !countryName.equals("nu") ? R.string.unkown : R.string.niue;
                    case 3532:
                        return !countryName.equals("nz") ? R.string.unkown : R.string.new_zealand;
                    case 3550:
                        return !countryName.equals("om") ? R.string.unkown : R.string.oman;
                    case 3569:
                        return !countryName.equals("pa") ? R.string.unkown : R.string.panama;
                    case 3573:
                        return !countryName.equals("pe") ? R.string.unkown : R.string.peru;
                    case 3574:
                        return !countryName.equals("pf") ? R.string.unkown : R.string.french_polynesia;
                    case 3575:
                        return !countryName.equals("pg") ? R.string.unkown : R.string.papua_new_guinea;
                    case 3576:
                        return !countryName.equals("ph") ? R.string.unkown : R.string.philippinies;
                    case 3579:
                        return !countryName.equals("pk") ? R.string.unkown : R.string.pakistan;
                    case 3580:
                        return !countryName.equals("pl") ? R.string.unkown : R.string.poland;
                    case 3581:
                        return !countryName.equals("pm") ? R.string.unkown : R.string.saint_pierre;
                    case 3582:
                        return !countryName.equals("pn") ? R.string.unkown : R.string.pitcairn;
                    case 3586:
                        return !countryName.equals("pr") ? R.string.unkown : R.string.puerto_rico;
                    case 3587:
                        return !countryName.equals("ps") ? R.string.unkown : R.string.state_of_palestine;
                    case 3588:
                        return !countryName.equals("pt") ? R.string.unkown : R.string.portugal;
                    case 3591:
                        return !countryName.equals("pw") ? R.string.unkown : R.string.palau;
                    case 3593:
                        return !countryName.equals("py") ? R.string.unkown : R.string.paraguay;
                    case 3600:
                        return !countryName.equals("qa") ? R.string.unkown : R.string.qatar;
                    case 3635:
                        return !countryName.equals("re") ? R.string.unkown : R.string.reunion;
                    case 3645:
                        return !countryName.equals("ro") ? R.string.unkown : R.string.romania;
                    case 3649:
                        return !countryName.equals("rs") ? R.string.unkown : R.string.serbia;
                    case 3651:
                        return !countryName.equals("ru") ? R.string.unkown : R.string.russia;
                    case 3653:
                        return !countryName.equals("rw") ? R.string.unkown : R.string.rwanda;
                    case 3662:
                        return !countryName.equals("sa") ? R.string.unkown : R.string.saudi_arabia;
                    case 3663:
                        return !countryName.equals("sb") ? R.string.unkown : R.string.solomon_islands;
                    case 3664:
                        return !countryName.equals("sc") ? R.string.unkown : R.string.seychelles;
                    case 3665:
                        return !countryName.equals("sd") ? R.string.unkown : R.string.sudan;
                    case 3666:
                        return !countryName.equals("se") ? R.string.unkown : R.string.sweden;
                    case 3668:
                        return !countryName.equals("sg") ? R.string.unkown : R.string.singapore;
                    case 3669:
                        return !countryName.equals("sh") ? R.string.unkown : R.string.saint_helena;
                    case 3670:
                        return !countryName.equals("si") ? R.string.unkown : R.string.slovenia;
                    case 3672:
                        return !countryName.equals("sk") ? R.string.unkown : R.string.slovakia;
                    case 3673:
                        return !countryName.equals("sl") ? R.string.unkown : R.string.sierra_leone;
                    case 3674:
                        return !countryName.equals("sm") ? R.string.unkown : R.string.san_marino;
                    case 3675:
                        return !countryName.equals("sn") ? R.string.unkown : R.string.senegal;
                    case 3676:
                        return !countryName.equals("so") ? R.string.unkown : R.string.somali;
                    case 3679:
                        return !countryName.equals("sr") ? R.string.unkown : R.string.suriname;
                    case 3680:
                        return !countryName.equals("ss") ? R.string.unkown : R.string.south_sudan;
                    case 3681:
                        return !countryName.equals("st") ? R.string.unkown : R.string.sao_tome;
                    case 3683:
                        return !countryName.equals("sv") ? R.string.unkown : R.string.el_salvador;
                    case 3685:
                        return !countryName.equals("sx") ? R.string.unkown : R.string.sint_maarten;
                    case 3686:
                        return !countryName.equals("sy") ? R.string.unkown : R.string.syrian;
                    case 3687:
                        return !countryName.equals("sz") ? R.string.unkown : R.string.swaziland;
                    case 3695:
                        return !countryName.equals("tc") ? R.string.unkown : R.string.turks_and_caicos;
                    case 3696:
                        return !countryName.equals("td") ? R.string.unkown : R.string.chad;
                    case 3699:
                        return !countryName.equals("tg") ? R.string.unkown : R.string.togo;
                    case 3700:
                        return !countryName.equals("th") ? R.string.unkown : R.string.thailand;
                    case 3702:
                        return !countryName.equals("tj") ? R.string.unkown : R.string.taijikistan;
                    case 3703:
                        return !countryName.equals("tk") ? R.string.unkown : R.string.tokelau;
                    case 3704:
                        return !countryName.equals("tl") ? R.string.unkown : R.string.timor_leste;
                    case 3705:
                        return !countryName.equals("tm") ? R.string.unkown : R.string.turkmenistan;
                    case 3706:
                        return !countryName.equals("tn") ? R.string.unkown : R.string.tunisia;
                    case 3707:
                        return !countryName.equals("to") ? R.string.unkown : R.string.tonga;
                    case 3710:
                        return !countryName.equals("tr") ? R.string.unkown : R.string.turkey;
                    case 3712:
                        return !countryName.equals("tt") ? R.string.unkown : R.string.trinidad_and_tobago;
                    case 3714:
                        return !countryName.equals("tv") ? R.string.unkown : R.string.tuvalu;
                    case 3715:
                        return !countryName.equals("tw") ? R.string.unkown : R.string.taiwan;
                    case 3718:
                        return !countryName.equals("tz") ? R.string.unkown : R.string.tazmania;
                    case 3724:
                        return !countryName.equals("ua") ? R.string.unkown : R.string.ukraina;
                    case 3730:
                        return !countryName.equals("ug") ? R.string.unkown : R.string.uganda;
                    case 3742:
                        return !countryName.equals("us") ? R.string.unkown : R.string.united_states_america;
                    case 3748:
                        return !countryName.equals("uy") ? R.string.unkown : R.string.uruguay;
                    case 3749:
                        return !countryName.equals("uz") ? R.string.unkown : R.string.uzbekistan;
                    case 3755:
                        return !countryName.equals("va") ? R.string.unkown : R.string.holy_see;
                    case 3757:
                        return !countryName.equals("vc") ? R.string.unkown : R.string.saint_vincent;
                    case 3759:
                        return !countryName.equals("ve") ? R.string.unkown : R.string.venezuela;
                    case 3761:
                        return !countryName.equals("vg") ? R.string.unkown : R.string.virgin_islands;
                    case 3763:
                        return !countryName.equals("vi") ? R.string.unkown : R.string.virgin_island_us;
                    case 3768:
                        return !countryName.equals("vn") ? R.string.unkown : R.string.vietnam;
                    case 3775:
                        return !countryName.equals("vu") ? R.string.unkown : R.string.vanuatu;
                    case 3791:
                        return !countryName.equals("wf") ? R.string.unkown : R.string.walli_and_fatuna;
                    case 3804:
                        return !countryName.equals("ws") ? R.string.unkown : R.string.samoa;
                    case 3827:
                        return !countryName.equals("xk") ? R.string.unkown : R.string.kosovo;
                    case 3852:
                        return !countryName.equals("ye") ? R.string.unkown : R.string.yemen;
                    case 3867:
                        return !countryName.equals("yt") ? R.string.unkown : R.string.mayotte;
                    case 3879:
                        return !countryName.equals("za") ? R.string.unkown : R.string.south_africa;
                    case 3891:
                        return !countryName.equals("zm") ? R.string.unkown : R.string.zambia;
                    case 3901:
                        return !countryName.equals("zw") ? R.string.unkown : R.string.zimbabwe;
                    default:
                        switch (iHashCode) {
                            case 3120:
                                return !countryName.equals("aq") ? R.string.unkown : R.string.antarctica;
                            case 3121:
                                return !countryName.equals("ar") ? R.string.unkown : R.string.argentina;
                            case 3122:
                                return !countryName.equals("as") ? R.string.unkown : R.string.american_samoa;
                            case 3123:
                                return !countryName.equals("at") ? R.string.unkown : R.string.austria;
                            case 3124:
                                return !countryName.equals("au") ? R.string.unkown : R.string.australia;
                            default:
                                switch (iHashCode) {
                                    case 3146:
                                        return !countryName.equals("bl") ? R.string.unkown : R.string.saint_barhelemy;
                                    case 3147:
                                        return !countryName.equals("bm") ? R.string.unkown : R.string.bermuda;
                                    case 3148:
                                        return !countryName.equals("bn") ? R.string.unkown : R.string.brunei_darussalam;
                                    case 3149:
                                        return !countryName.equals("bo") ? R.string.unkown : R.string.bolivia;
                                    default:
                                        switch (iHashCode) {
                                            case 3152:
                                                return !countryName.equals("br") ? R.string.unkown : R.string.brazil;
                                            case 3153:
                                                return !countryName.equals("bs") ? R.string.unkown : R.string.bahamas;
                                            case 3154:
                                                return !countryName.equals("bt") ? R.string.unkown : R.string.bhutan;
                                            default:
                                                return R.string.unkown;
                                        }
                                }
                        }
                }
        }
    }

    /* renamed from: b */
    public static Intent m11015b(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strM11016c = m11016c(context, componentName);
        if (strM11016c == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strM11016c);
        return m11016c(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    /* renamed from: c */
    public static String m11016c(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }
}
