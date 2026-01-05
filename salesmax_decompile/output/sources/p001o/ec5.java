package p001o;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.cast.CastStatusCodes;
import com.google.android.gms.cast.RemoteMediaPlayer;
import com.google.api.Service;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.HttpStatus;
import org.apache.http.message.TokenParser;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.TypeReference;
import org.objectweb.asm.signature.SignatureVisitor;
import p001o.dub;
import p001o.ta1;

/* loaded from: classes2.dex */
public final class ec5 implements ta1, juh {

    /* renamed from: p */
    public static final nf8 f21356p = nf8.m40503J(4300000L, 3200000L, 2400000L, 1700000L, 860000L);

    /* renamed from: q */
    public static final nf8 f21357q = nf8.m40503J(1500000L, 980000L, 750000L, 520000L, 290000L);

    /* renamed from: r */
    public static final nf8 f21358r = nf8.m40503J(2000000L, 1300000L, 1000000L, 860000L, 610000L);

    /* renamed from: s */
    public static final nf8 f21359s = nf8.m40503J(2500000L, 1700000L, 1200000L, 970000L, 680000L);

    /* renamed from: t */
    public static final nf8 f21360t = nf8.m40503J(4700000L, 2800000L, 2100000L, 1700000L, 980000L);

    /* renamed from: u */
    public static final nf8 f21361u = nf8.m40503J(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);

    /* renamed from: v */
    public static ec5 f21362v;

    /* renamed from: a */
    public final of8 f21363a;

    /* renamed from: b */
    public final ta1.InterfaceC17036a.a f21364b;

    /* renamed from: c */
    public final jb3 f21365c;

    /* renamed from: d */
    public final boolean f21366d;

    /* renamed from: e */
    public final awf f21367e;

    /* renamed from: f */
    public int f21368f;

    /* renamed from: g */
    public long f21369g;

    /* renamed from: h */
    public long f21370h;

    /* renamed from: i */
    public long f21371i;

    /* renamed from: j */
    public long f21372j;

    /* renamed from: k */
    public long f21373k;

    /* renamed from: l */
    public long f21374l;

    /* renamed from: m */
    public int f21375m;

    /* renamed from: n */
    public boolean f21376n;

    /* renamed from: o */
    public int f21377o;

    /* renamed from: o.ec5$b */
    public static final class C13159b {

        /* renamed from: a */
        public final Context f21378a;

        /* renamed from: b */
        public Map f21379b;

        /* renamed from: c */
        public int f21380c;

        /* renamed from: d */
        public jb3 f21381d;

        /* renamed from: e */
        public boolean f21382e;

        public C13159b(Context context) {
            this.f21378a = context == null ? null : context.getApplicationContext();
            this.f21379b = m24766b(sqi.m48713R(context));
            this.f21380c = 2000;
            this.f21381d = jb3.f30077a;
            this.f21382e = true;
        }

        /* renamed from: b */
        public static Map m24766b(String str) {
            int[] iArrM24752l = ec5.m24752l(str);
            HashMap map = new HashMap(8);
            map.put(0, 1000000L);
            nf8 nf8Var = ec5.f21356p;
            map.put(2, (Long) nf8Var.get(iArrM24752l[0]));
            map.put(3, (Long) ec5.f21357q.get(iArrM24752l[1]));
            map.put(4, (Long) ec5.f21358r.get(iArrM24752l[2]));
            map.put(5, (Long) ec5.f21359s.get(iArrM24752l[3]));
            map.put(10, (Long) ec5.f21360t.get(iArrM24752l[4]));
            map.put(9, (Long) ec5.f21361u.get(iArrM24752l[5]));
            map.put(7, (Long) nf8Var.get(iArrM24752l[0]));
            return map;
        }

        /* renamed from: a */
        public ec5 m24767a() {
            return new ec5(this.f21378a, this.f21379b, this.f21380c, this.f21381d, this.f21382e);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* renamed from: l */
    public static int[] m24752l(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 2083:
                if (str.equals("AD")) {
                    c = 0;
                    break;
                }
                break;
            case 2084:
                if (str.equals("AE")) {
                    c = 1;
                    break;
                }
                break;
            case 2085:
                if (str.equals("AF")) {
                    c = 2;
                    break;
                }
                break;
            case 2086:
                if (str.equals("AG")) {
                    c = 3;
                    break;
                }
                break;
            case 2088:
                if (str.equals("AI")) {
                    c = 4;
                    break;
                }
                break;
            case 2091:
                if (str.equals("AL")) {
                    c = 5;
                    break;
                }
                break;
            case 2092:
                if (str.equals("AM")) {
                    c = 6;
                    break;
                }
                break;
            case 2094:
                if (str.equals("AO")) {
                    c = 7;
                    break;
                }
                break;
            case 2096:
                if (str.equals("AQ")) {
                    c = '\b';
                    break;
                }
                break;
            case 2097:
                if (str.equals("AR")) {
                    c = '\t';
                    break;
                }
                break;
            case 2098:
                if (str.equals("AS")) {
                    c = '\n';
                    break;
                }
                break;
            case 2099:
                if (str.equals("AT")) {
                    c = 11;
                    break;
                }
                break;
            case 2100:
                if (str.equals("AU")) {
                    c = '\f';
                    break;
                }
                break;
            case RemoteMediaPlayer.STATUS_TIMED_OUT /* 2102 */:
                if (str.equals("AW")) {
                    c = TokenParser.CR;
                    break;
                }
                break;
            case 2103:
                if (str.equals("AX")) {
                    c = 14;
                    break;
                }
                break;
            case 2105:
                if (str.equals("AZ")) {
                    c = 15;
                    break;
                }
                break;
            case CastStatusCodes.ERROR_URL_INSEURE /* 2111 */:
                if (str.equals("BA")) {
                    c = 16;
                    break;
                }
                break;
            case CastStatusCodes.ERROR_HOST_NOT_ALLOWED /* 2112 */:
                if (str.equals("BB")) {
                    c = 17;
                    break;
                }
                break;
            case CastStatusCodes.ERROR_NO_CAST_CONFIGURATION /* 2114 */:
                if (str.equals("BD")) {
                    c = 18;
                    break;
                }
                break;
            case CastStatusCodes.ERROR_DEVICE_ID_FLAGS_NOT_SET /* 2115 */:
                if (str.equals("BE")) {
                    c = 19;
                    break;
                }
                break;
            case 2116:
                if (str.equals("BF")) {
                    c = 20;
                    break;
                }
                break;
            case 2117:
                if (str.equals("BG")) {
                    c = 21;
                    break;
                }
                break;
            case 2118:
                if (str.equals("BH")) {
                    c = 22;
                    break;
                }
                break;
            case 2119:
                if (str.equals("BI")) {
                    c = 23;
                    break;
                }
                break;
            case 2120:
                if (str.equals("BJ")) {
                    c = 24;
                    break;
                }
                break;
            case 2122:
                if (str.equals("BL")) {
                    c = 25;
                    break;
                }
                break;
            case 2123:
                if (str.equals("BM")) {
                    c = 26;
                    break;
                }
                break;
            case 2124:
                if (str.equals("BN")) {
                    c = 27;
                    break;
                }
                break;
            case 2125:
                if (str.equals("BO")) {
                    c = 28;
                    break;
                }
                break;
            case 2127:
                if (str.equals("BQ")) {
                    c = 29;
                    break;
                }
                break;
            case 2128:
                if (str.equals("BR")) {
                    c = 30;
                    break;
                }
                break;
            case 2129:
                if (str.equals("BS")) {
                    c = 31;
                    break;
                }
                break;
            case 2130:
                if (str.equals("BT")) {
                    c = TokenParser.SP;
                    break;
                }
                break;
            case 2133:
                if (str.equals("BW")) {
                    c = '!';
                    break;
                }
                break;
            case 2135:
                if (str.equals("BY")) {
                    c = TokenParser.DQUOTE;
                    break;
                }
                break;
            case 2136:
                if (str.equals("BZ")) {
                    c = '#';
                    break;
                }
                break;
            case 2142:
                if (str.equals("CA")) {
                    c = '$';
                    break;
                }
                break;
            case 2145:
                if (str.equals("CD")) {
                    c = '%';
                    break;
                }
                break;
            case 2147:
                if (str.equals("CF")) {
                    c = '&';
                    break;
                }
                break;
            case 2148:
                if (str.equals("CG")) {
                    c = '\'';
                    break;
                }
                break;
            case 2149:
                if (str.equals("CH")) {
                    c = '(';
                    break;
                }
                break;
            case 2150:
                if (str.equals("CI")) {
                    c = ')';
                    break;
                }
                break;
            case 2152:
                if (str.equals("CK")) {
                    c = '*';
                    break;
                }
                break;
            case 2153:
                if (str.equals("CL")) {
                    c = '+';
                    break;
                }
                break;
            case 2154:
                if (str.equals("CM")) {
                    c = ',';
                    break;
                }
                break;
            case 2155:
                if (str.equals("CN")) {
                    c = '-';
                    break;
                }
                break;
            case 2156:
                if (str.equals("CO")) {
                    c = '.';
                    break;
                }
                break;
            case 2159:
                if (str.equals("CR")) {
                    c = '/';
                    break;
                }
                break;
            case 2162:
                if (str.equals("CU")) {
                    c = '0';
                    break;
                }
                break;
            case 2163:
                if (str.equals("CV")) {
                    c = '1';
                    break;
                }
                break;
            case 2164:
                if (str.equals("CW")) {
                    c = '2';
                    break;
                }
                break;
            case 2165:
                if (str.equals("CX")) {
                    c = '3';
                    break;
                }
                break;
            case 2166:
                if (str.equals("CY")) {
                    c = '4';
                    break;
                }
                break;
            case 2167:
                if (str.equals("CZ")) {
                    c = '5';
                    break;
                }
                break;
            case 2177:
                if (str.equals("DE")) {
                    c = '6';
                    break;
                }
                break;
            case 2182:
                if (str.equals("DJ")) {
                    c = '7';
                    break;
                }
                break;
            case 2183:
                if (str.equals("DK")) {
                    c = '8';
                    break;
                }
                break;
            case 2185:
                if (str.equals("DM")) {
                    c = '9';
                    break;
                }
                break;
            case 2187:
                if (str.equals("DO")) {
                    c = ':';
                    break;
                }
                break;
            case 2198:
                if (str.equals("DZ")) {
                    c = ';';
                    break;
                }
                break;
            case 2206:
                if (str.equals("EC")) {
                    c = '<';
                    break;
                }
                break;
            case 2208:
                if (str.equals("EE")) {
                    c = '=';
                    break;
                }
                break;
            case 2210:
                if (str.equals("EG")) {
                    c = '>';
                    break;
                }
                break;
            case 2221:
                if (str.equals("ER")) {
                    c = '?';
                    break;
                }
                break;
            case 2222:
                if (str.equals("ES")) {
                    c = '@';
                    break;
                }
                break;
            case 2223:
                if (str.equals("ET")) {
                    c = 'A';
                    break;
                }
                break;
            case 2243:
                if (str.equals("FI")) {
                    c = 'B';
                    break;
                }
                break;
            case 2244:
                if (str.equals("FJ")) {
                    c = 'C';
                    break;
                }
                break;
            case 2245:
                if (str.equals("FK")) {
                    c = 'D';
                    break;
                }
                break;
            case 2247:
                if (str.equals("FM")) {
                    c = 'E';
                    break;
                }
                break;
            case 2249:
                if (str.equals("FO")) {
                    c = 'F';
                    break;
                }
                break;
            case 2252:
                if (str.equals("FR")) {
                    c = 'G';
                    break;
                }
                break;
            case 2266:
                if (str.equals("GA")) {
                    c = 'H';
                    break;
                }
                break;
            case 2267:
                if (str.equals("GB")) {
                    c = 'I';
                    break;
                }
                break;
            case 2269:
                if (str.equals("GD")) {
                    c = 'J';
                    break;
                }
                break;
            case 2270:
                if (str.equals("GE")) {
                    c = 'K';
                    break;
                }
                break;
            case 2271:
                if (str.equals("GF")) {
                    c = 'L';
                    break;
                }
                break;
            case 2272:
                if (str.equals("GG")) {
                    c = 'M';
                    break;
                }
                break;
            case 2273:
                if (str.equals("GH")) {
                    c = 'N';
                    break;
                }
                break;
            case 2274:
                if (str.equals("GI")) {
                    c = 'O';
                    break;
                }
                break;
            case 2277:
                if (str.equals("GL")) {
                    c = 'P';
                    break;
                }
                break;
            case 2278:
                if (str.equals("GM")) {
                    c = 'Q';
                    break;
                }
                break;
            case 2279:
                if (str.equals("GN")) {
                    c = 'R';
                    break;
                }
                break;
            case 2281:
                if (str.equals("GP")) {
                    c = 'S';
                    break;
                }
                break;
            case 2282:
                if (str.equals("GQ")) {
                    c = 'T';
                    break;
                }
                break;
            case 2283:
                if (str.equals("GR")) {
                    c = 'U';
                    break;
                }
                break;
            case 2285:
                if (str.equals("GT")) {
                    c = 'V';
                    break;
                }
                break;
            case 2286:
                if (str.equals("GU")) {
                    c = 'W';
                    break;
                }
                break;
            case 2288:
                if (str.equals("GW")) {
                    c = 'X';
                    break;
                }
                break;
            case 2290:
                if (str.equals("GY")) {
                    c = 'Y';
                    break;
                }
                break;
            case 2307:
                if (str.equals("HK")) {
                    c = 'Z';
                    break;
                }
                break;
            case 2314:
                if (str.equals("HR")) {
                    c = '[';
                    break;
                }
                break;
            case 2316:
                if (str.equals("HT")) {
                    c = TokenParser.ESCAPE;
                    break;
                }
                break;
            case 2317:
                if (str.equals("HU")) {
                    c = ']';
                    break;
                }
                break;
            case 2331:
                if (str.equals("ID")) {
                    c = '^';
                    break;
                }
                break;
            case 2332:
                if (str.equals("IE")) {
                    c = '_';
                    break;
                }
                break;
            case 2339:
                if (str.equals("IL")) {
                    c = '`';
                    break;
                }
                break;
            case 2340:
                if (str.equals("IM")) {
                    c = 'a';
                    break;
                }
                break;
            case 2341:
                if (str.equals("IN")) {
                    c = 'b';
                    break;
                }
                break;
            case 2342:
                if (str.equals("IO")) {
                    c = 'c';
                    break;
                }
                break;
            case 2344:
                if (str.equals("IQ")) {
                    c = 'd';
                    break;
                }
                break;
            case 2345:
                if (str.equals("IR")) {
                    c = 'e';
                    break;
                }
                break;
            case 2346:
                if (str.equals("IS")) {
                    c = 'f';
                    break;
                }
                break;
            case 2347:
                if (str.equals("IT")) {
                    c = 'g';
                    break;
                }
                break;
            case 2363:
                if (str.equals("JE")) {
                    c = 'h';
                    break;
                }
                break;
            case 2371:
                if (str.equals("JM")) {
                    c = 'i';
                    break;
                }
                break;
            case 2373:
                if (str.equals("JO")) {
                    c = 'j';
                    break;
                }
                break;
            case 2374:
                if (str.equals("JP")) {
                    c = 'k';
                    break;
                }
                break;
            case 2394:
                if (str.equals("KE")) {
                    c = 'l';
                    break;
                }
                break;
            case 2396:
                if (str.equals("KG")) {
                    c = 'm';
                    break;
                }
                break;
            case 2397:
                if (str.equals("KH")) {
                    c = 'n';
                    break;
                }
                break;
            case 2398:
                if (str.equals("KI")) {
                    c = 'o';
                    break;
                }
                break;
            case 2402:
                if (str.equals("KM")) {
                    c = 'p';
                    break;
                }
                break;
            case 2403:
                if (str.equals("KN")) {
                    c = 'q';
                    break;
                }
                break;
            case 2407:
                if (str.equals("KR")) {
                    c = 'r';
                    break;
                }
                break;
            case 2412:
                if (str.equals("KW")) {
                    c = 's';
                    break;
                }
                break;
            case 2414:
                if (str.equals("KY")) {
                    c = 't';
                    break;
                }
                break;
            case 2415:
                if (str.equals("KZ")) {
                    c = 'u';
                    break;
                }
                break;
            case 2421:
                if (str.equals("LA")) {
                    c = 'v';
                    break;
                }
                break;
            case 2422:
                if (str.equals("LB")) {
                    c = 'w';
                    break;
                }
                break;
            case 2423:
                if (str.equals("LC")) {
                    c = 'x';
                    break;
                }
                break;
            case 2429:
                if (str.equals("LI")) {
                    c = 'y';
                    break;
                }
                break;
            case 2431:
                if (str.equals("LK")) {
                    c = 'z';
                    break;
                }
                break;
            case 2438:
                if (str.equals("LR")) {
                    c = '{';
                    break;
                }
                break;
            case 2439:
                if (str.equals("LS")) {
                    c = '|';
                    break;
                }
                break;
            case 2440:
                if (str.equals("LT")) {
                    c = '}';
                    break;
                }
                break;
            case 2441:
                if (str.equals("LU")) {
                    c = '~';
                    break;
                }
                break;
            case 2442:
                if (str.equals("LV")) {
                    c = 127;
                    break;
                }
                break;
            case 2445:
                if (str.equals("LY")) {
                    c = 128;
                    break;
                }
                break;
            case 2452:
                if (str.equals("MA")) {
                    c = 129;
                    break;
                }
                break;
            case 2454:
                if (str.equals("MC")) {
                    c = 130;
                    break;
                }
                break;
            case 2455:
                if (str.equals("MD")) {
                    c = 131;
                    break;
                }
                break;
            case 2456:
                if (str.equals("ME")) {
                    c = 132;
                    break;
                }
                break;
            case 2457:
                if (str.equals("MF")) {
                    c = 133;
                    break;
                }
                break;
            case 2458:
                if (str.equals("MG")) {
                    c = 134;
                    break;
                }
                break;
            case 2459:
                if (str.equals("MH")) {
                    c = 135;
                    break;
                }
                break;
            case 2462:
                if (str.equals("MK")) {
                    c = 136;
                    break;
                }
                break;
            case 2463:
                if (str.equals("ML")) {
                    c = 137;
                    break;
                }
                break;
            case 2464:
                if (str.equals("MM")) {
                    c = 138;
                    break;
                }
                break;
            case 2465:
                if (str.equals("MN")) {
                    c = 139;
                    break;
                }
                break;
            case 2466:
                if (str.equals("MO")) {
                    c = 140;
                    break;
                }
                break;
            case 2467:
                if (str.equals("MP")) {
                    c = 141;
                    break;
                }
                break;
            case 2468:
                if (str.equals("MQ")) {
                    c = 142;
                    break;
                }
                break;
            case 2469:
                if (str.equals("MR")) {
                    c = 143;
                    break;
                }
                break;
            case 2470:
                if (str.equals("MS")) {
                    c = 144;
                    break;
                }
                break;
            case 2471:
                if (str.equals("MT")) {
                    c = 145;
                    break;
                }
                break;
            case 2472:
                if (str.equals("MU")) {
                    c = 146;
                    break;
                }
                break;
            case 2473:
                if (str.equals("MV")) {
                    c = 147;
                    break;
                }
                break;
            case 2474:
                if (str.equals("MW")) {
                    c = 148;
                    break;
                }
                break;
            case 2475:
                if (str.equals("MX")) {
                    c = 149;
                    break;
                }
                break;
            case 2476:
                if (str.equals("MY")) {
                    c = 150;
                    break;
                }
                break;
            case 2477:
                if (str.equals("MZ")) {
                    c = 151;
                    break;
                }
                break;
            case 2483:
                if (str.equals("NA")) {
                    c = 152;
                    break;
                }
                break;
            case 2485:
                if (str.equals("NC")) {
                    c = 153;
                    break;
                }
                break;
            case 2487:
                if (str.equals("NE")) {
                    c = 154;
                    break;
                }
                break;
            case 2488:
                if (str.equals("NF")) {
                    c = 155;
                    break;
                }
                break;
            case 2489:
                if (str.equals("NG")) {
                    c = 156;
                    break;
                }
                break;
            case 2491:
                if (str.equals("NI")) {
                    c = 157;
                    break;
                }
                break;
            case 2494:
                if (str.equals("NL")) {
                    c = 158;
                    break;
                }
                break;
            case 2497:
                if (str.equals("NO")) {
                    c = 159;
                    break;
                }
                break;
            case 2498:
                if (str.equals("NP")) {
                    c = 160;
                    break;
                }
                break;
            case 2500:
                if (str.equals("NR")) {
                    c = 161;
                    break;
                }
                break;
            case 2503:
                if (str.equals("NU")) {
                    c = 162;
                    break;
                }
                break;
            case 2508:
                if (str.equals("NZ")) {
                    c = 163;
                    break;
                }
                break;
            case 2526:
                if (str.equals("OM")) {
                    c = 164;
                    break;
                }
                break;
            case 2545:
                if (str.equals("PA")) {
                    c = 165;
                    break;
                }
                break;
            case 2549:
                if (str.equals("PE")) {
                    c = 166;
                    break;
                }
                break;
            case 2550:
                if (str.equals("PF")) {
                    c = 167;
                    break;
                }
                break;
            case 2551:
                if (str.equals("PG")) {
                    c = 168;
                    break;
                }
                break;
            case 2552:
                if (str.equals("PH")) {
                    c = 169;
                    break;
                }
                break;
            case 2555:
                if (str.equals("PK")) {
                    c = 170;
                    break;
                }
                break;
            case 2556:
                if (str.equals("PL")) {
                    c = 171;
                    break;
                }
                break;
            case 2557:
                if (str.equals("PM")) {
                    c = 172;
                    break;
                }
                break;
            case 2562:
                if (str.equals("PR")) {
                    c = 173;
                    break;
                }
                break;
            case 2563:
                if (str.equals("PS")) {
                    c = 174;
                    break;
                }
                break;
            case 2564:
                if (str.equals("PT")) {
                    c = 175;
                    break;
                }
                break;
            case 2567:
                if (str.equals("PW")) {
                    c = 176;
                    break;
                }
                break;
            case 2569:
                if (str.equals("PY")) {
                    c = 177;
                    break;
                }
                break;
            case 2576:
                if (str.equals("QA")) {
                    c = 178;
                    break;
                }
                break;
            case 2611:
                if (str.equals("RE")) {
                    c = 179;
                    break;
                }
                break;
            case 2621:
                if (str.equals("RO")) {
                    c = 180;
                    break;
                }
                break;
            case 2625:
                if (str.equals("RS")) {
                    c = 181;
                    break;
                }
                break;
            case 2627:
                if (str.equals("RU")) {
                    c = 182;
                    break;
                }
                break;
            case 2629:
                if (str.equals("RW")) {
                    c = 183;
                    break;
                }
                break;
            case 2638:
                if (str.equals("SA")) {
                    c = 184;
                    break;
                }
                break;
            case 2639:
                if (str.equals("SB")) {
                    c = 185;
                    break;
                }
                break;
            case 2640:
                if (str.equals("SC")) {
                    c = 186;
                    break;
                }
                break;
            case 2641:
                if (str.equals("SD")) {
                    c = 187;
                    break;
                }
                break;
            case 2642:
                if (str.equals("SE")) {
                    c = 188;
                    break;
                }
                break;
            case 2644:
                if (str.equals("SG")) {
                    c = 189;
                    break;
                }
                break;
            case 2645:
                if (str.equals("SH")) {
                    c = 190;
                    break;
                }
                break;
            case 2646:
                if (str.equals("SI")) {
                    c = 191;
                    break;
                }
                break;
            case 2647:
                if (str.equals("SJ")) {
                    c = 192;
                    break;
                }
                break;
            case 2648:
                if (str.equals("SK")) {
                    c = 193;
                    break;
                }
                break;
            case 2649:
                if (str.equals("SL")) {
                    c = 194;
                    break;
                }
                break;
            case 2650:
                if (str.equals("SM")) {
                    c = 195;
                    break;
                }
                break;
            case 2651:
                if (str.equals("SN")) {
                    c = 196;
                    break;
                }
                break;
            case 2652:
                if (str.equals("SO")) {
                    c = 197;
                    break;
                }
                break;
            case 2655:
                if (str.equals("SR")) {
                    c = 198;
                    break;
                }
                break;
            case 2656:
                if (str.equals("SS")) {
                    c = 199;
                    break;
                }
                break;
            case 2657:
                if (str.equals("ST")) {
                    c = 200;
                    break;
                }
                break;
            case 2659:
                if (str.equals("SV")) {
                    c = 201;
                    break;
                }
                break;
            case 2661:
                if (str.equals("SX")) {
                    c = 202;
                    break;
                }
                break;
            case 2662:
                if (str.equals("SY")) {
                    c = 203;
                    break;
                }
                break;
            case 2663:
                if (str.equals("SZ")) {
                    c = 204;
                    break;
                }
                break;
            case 2671:
                if (str.equals("TC")) {
                    c = 205;
                    break;
                }
                break;
            case 2672:
                if (str.equals("TD")) {
                    c = 206;
                    break;
                }
                break;
            case 2675:
                if (str.equals("TG")) {
                    c = 207;
                    break;
                }
                break;
            case 2676:
                if (str.equals("TH")) {
                    c = 208;
                    break;
                }
                break;
            case 2678:
                if (str.equals("TJ")) {
                    c = 209;
                    break;
                }
                break;
            case 2680:
                if (str.equals("TL")) {
                    c = 210;
                    break;
                }
                break;
            case 2681:
                if (str.equals("TM")) {
                    c = 211;
                    break;
                }
                break;
            case 2682:
                if (str.equals("TN")) {
                    c = 212;
                    break;
                }
                break;
            case 2683:
                if (str.equals("TO")) {
                    c = 213;
                    break;
                }
                break;
            case 2686:
                if (str.equals("TR")) {
                    c = 214;
                    break;
                }
                break;
            case 2688:
                if (str.equals("TT")) {
                    c = 215;
                    break;
                }
                break;
            case 2690:
                if (str.equals("TV")) {
                    c = 216;
                    break;
                }
                break;
            case 2691:
                if (str.equals("TW")) {
                    c = 217;
                    break;
                }
                break;
            case 2694:
                if (str.equals("TZ")) {
                    c = 218;
                    break;
                }
                break;
            case 2700:
                if (str.equals("UA")) {
                    c = 219;
                    break;
                }
                break;
            case 2706:
                if (str.equals("UG")) {
                    c = 220;
                    break;
                }
                break;
            case 2718:
                if (str.equals("US")) {
                    c = 221;
                    break;
                }
                break;
            case 2724:
                if (str.equals("UY")) {
                    c = 222;
                    break;
                }
                break;
            case 2725:
                if (str.equals("UZ")) {
                    c = 223;
                    break;
                }
                break;
            case 2731:
                if (str.equals("VA")) {
                    c = 224;
                    break;
                }
                break;
            case 2733:
                if (str.equals("VC")) {
                    c = 225;
                    break;
                }
                break;
            case 2735:
                if (str.equals("VE")) {
                    c = 226;
                    break;
                }
                break;
            case 2737:
                if (str.equals("VG")) {
                    c = 227;
                    break;
                }
                break;
            case 2739:
                if (str.equals("VI")) {
                    c = 228;
                    break;
                }
                break;
            case 2744:
                if (str.equals("VN")) {
                    c = 229;
                    break;
                }
                break;
            case 2751:
                if (str.equals("VU")) {
                    c = 230;
                    break;
                }
                break;
            case 2767:
                if (str.equals("WF")) {
                    c = 231;
                    break;
                }
                break;
            case 2780:
                if (str.equals("WS")) {
                    c = 232;
                    break;
                }
                break;
            case 2803:
                if (str.equals("XK")) {
                    c = 233;
                    break;
                }
                break;
            case 2828:
                if (str.equals("YE")) {
                    c = 234;
                    break;
                }
                break;
            case 2843:
                if (str.equals("YT")) {
                    c = 235;
                    break;
                }
                break;
            case 2855:
                if (str.equals("ZA")) {
                    c = 236;
                    break;
                }
                break;
            case 2867:
                if (str.equals("ZM")) {
                    c = 237;
                    break;
                }
                break;
            case 2877:
                if (str.equals("ZW")) {
                    c = 238;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 4:
            case 17:
            case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
            case '2':
            case '9':
            case Opcodes.LREM /* 113 */:
            case 't':
            case 202:
            case 225:
                return new int[]{1, 2, 0, 0, 2, 2};
            case 1:
                return new int[]{1, 4, 2, 3, 4, 1};
            case 2:
            case 204:
                return new int[]{4, 4, 3, 4, 2, 2};
            case 3:
            case um5.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                return new int[]{2, 4, 3, 4, 2, 2};
            case 5:
                return new int[]{1, 1, 1, 2, 2, 2};
            case 6:
            case Opcodes.IF_ACMPEQ /* 165 */:
                return new int[]{2, 3, 2, 3, 2, 2};
            case 7:
                return new int[]{3, 4, 4, 3, 2, 2};
            case '\b':
            case '?':
            case Opcodes.IF_ICMPGE /* 162 */:
            case Opcodes.INVOKEDYNAMIC /* 186 */:
            case Opcodes.ARRAYLENGTH /* 190 */:
                return new int[]{4, 2, 2, 2, 2, 2};
            case '\t':
                return new int[]{2, 2, 2, 2, 1, 2};
            case '\n':
                return new int[]{2, 2, 3, 3, 2, 2};
            case 11:
            case '=':
            case Opcodes.DUP2_X1 /* 93 */:
            case 'f':
            case Opcodes.LAND /* 127 */:
            case Opcodes.I2B /* 145 */:
            case Opcodes.NEWARRAY /* 188 */:
                return new int[]{0, 0, 0, 0, 0, 2};
            case '\f':
                return new int[]{0, 3, 1, 1, 3, 0};
            case '\r':
                return new int[]{2, 2, 3, 4, 2, 2};
            case 14:
            case '3':
            case Opcodes.LSHL /* 121 */:
            case Opcodes.D2F /* 144 */:
            case Opcodes.IRETURN /* 172 */:
            case Opcodes.MONITOREXIT /* 195 */:
            case 224:
                return new int[]{0, 2, 2, 2, 2, 2};
            case 15:
            case '7':
            case 128:
            case Opcodes.MONITORENTER /* 194 */:
                return new int[]{4, 2, 3, 3, 2, 2};
            case 16:
            case Opcodes.FMUL /* 106 */:
            case 214:
                return new int[]{1, 1, 1, 1, 2, 2};
            case 18:
                return new int[]{2, 1, 3, 2, 4, 2};
            case 19:
                return new int[]{0, 0, 1, 0, 1, 2};
            case 20:
            case Opcodes.NEW /* 187 */:
            case 203:
            case HttpStatus.SC_PARTIAL_CONTENT /* 206 */:
                return new int[]{4, 3, 4, 4, 2, 2};
            case 21:
            case Opcodes.DRETURN /* 175 */:
            case Opcodes.ATHROW /* 191 */:
                return new int[]{0, 0, 0, 0, 1, 2};
            case 22:
                return new int[]{1, 3, 1, 3, 4, 2};
            case 23:
            case Opcodes.BASTORE /* 84 */:
            case Opcodes.DUP2 /* 92 */:
            case 154:
            case 226:
            case 234:
                return new int[]{4, 4, 4, 4, 2, 2};
            case 24:
                return new int[]{4, 4, 2, 3, 2, 2};
            case 25:
            case Opcodes.F2D /* 141 */:
            case Opcodes.RETURN /* 177 */:
                return new int[]{1, 2, 2, 2, 2, 2};
            case 26:
                return new int[]{0, 2, 0, 0, 2, 2};
            case 27:
                return new int[]{3, 2, 0, 0, 2, 2};
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                return new int[]{1, 2, 4, 4, 2, 2};
            case 30:
                return new int[]{1, 1, 1, 1, 2, 4};
            case um5.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                return new int[]{3, 2, 1, 1, 2, 2};
            case ' ':
                return new int[]{3, 1, 2, 2, 3, 2};
            case '!':
                return new int[]{3, 2, 1, 0, 2, 2};
            case wm5.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                return new int[]{1, 2, 3, 3, 2, 2};
            case '#':
            case um5.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                return new int[]{2, 2, 2, 1, 2, 2};
            case um5.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
            case 219:
                return new int[]{0, 2, 1, 2, 3, 3};
            case '%':
            case Opcodes.L2F /* 137 */:
                return new int[]{3, 3, 2, 2, 2, 2};
            case '&':
                return new int[]{4, 2, 4, 2, 2, 2};
            case um5.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
            case '>':
            case Opcodes.I2F /* 134 */:
                return new int[]{3, 4, 3, 3, 2, 2};
            case '(':
                return new int[]{0, 1, 0, 0, 0, 2};
            case SignatureVisitor.EXTENDS /* 43 */:
            case 208:
                return new int[]{0, 1, 2, 2, 2, 2};
            case um5.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
            case Opcodes.D2L /* 143 */:
                return new int[]{4, 3, 3, 4, 2, 2};
            case '-':
                return new int[]{2, 0, 1, 1, 3, 1};
            case '.':
                return new int[]{2, 3, 3, 2, 2, 2};
            case '/':
            case 157:
                return new int[]{2, 4, 4, 4, 2, 2};
            case '0':
            case Opcodes.DDIV /* 111 */:
            case Opcodes.IF_ICMPLT /* 161 */:
            case 210:
                return new int[]{4, 2, 4, 4, 2, 2};
            case '1':
                return new int[]{2, 3, 0, 1, 2, 2};
            case '4':
                return new int[]{1, 0, 1, 0, 0, 2};
            case '5':
                return new int[]{0, 0, 2, 0, 1, 2};
            case '6':
                return new int[]{0, 1, 4, 2, 2, 1};
            case '8':
                return new int[]{0, 0, 2, 0, 0, 2};
            case ':':
            case Opcodes.LSHR /* 123 */:
                return new int[]{3, 4, 4, 4, 2, 2};
            case Opcodes.V15 /* 59 */:
            case 209:
                return new int[]{3, 3, 4, 4, 2, 2};
            case Opcodes.V16 /* 60 */:
                return new int[]{1, 3, 2, 1, 2, 2};
            case '@':
                return new int[]{0, 0, 0, 0, 1, 0};
            case 'A':
                return new int[]{4, 3, 4, 4, 4, 2};
            case TypeReference.EXCEPTION_PARAMETER /* 66 */:
                return new int[]{0, 0, 0, 1, 0, 2};
            case TypeReference.INSTANCEOF /* 67 */:
                return new int[]{3, 2, 2, 3, 2, 2};
            case TypeReference.NEW /* 68 */:
            case 155:
            case Opcodes.CHECKCAST /* 192 */:
                return new int[]{3, 2, 2, 2, 2, 2};
            case TypeReference.CONSTRUCTOR_REFERENCE /* 69 */:
                return new int[]{4, 2, 4, 0, 2, 2};
            case TypeReference.METHOD_REFERENCE /* 70 */:
                return new int[]{0, 2, 2, 0, 2, 2};
            case TypeReference.CAST /* 71 */:
                return new int[]{1, 1, 1, 1, 0, 2};
            case TypeReference.CONSTRUCTOR_INVOCATION_TYPE_ARGUMENT /* 72 */:
                return new int[]{3, 4, 0, 0, 2, 2};
            case TypeReference.METHOD_INVOCATION_TYPE_ARGUMENT /* 73 */:
                return new int[]{1, 1, 3, 2, 2, 2};
            case TypeReference.CONSTRUCTOR_REFERENCE_TYPE_ARGUMENT /* 74 */:
                return new int[]{2, 2, 0, 0, 2, 2};
            case TypeReference.METHOD_REFERENCE_TYPE_ARGUMENT /* 75 */:
                return new int[]{1, 1, 0, 2, 2, 2};
            case 'L':
                return new int[]{3, 2, 3, 3, 2, 2};
            case 'M':
                return new int[]{0, 2, 1, 1, 2, 2};
            case 'N':
                return new int[]{3, 3, 3, 2, 2, 2};
            case Opcodes.IASTORE /* 79 */:
            case Opcodes.LADD /* 97 */:
            case 'h':
                return new int[]{0, 2, 0, 1, 2, 2};
            case 'P':
            case 130:
                return new int[]{1, 2, 2, 0, 2, 2};
            case Opcodes.FASTORE /* 81 */:
            case Opcodes.IFNONNULL /* 199 */:
                return new int[]{4, 3, 2, 4, 2, 2};
            case Opcodes.DASTORE /* 82 */:
                return new int[]{3, 4, 4, 2, 2, 2};
            case Opcodes.AASTORE /* 83 */:
                return new int[]{2, 1, 1, 3, 2, 2};
            case Opcodes.CASTORE /* 85 */:
                return new int[]{1, 0, 0, 0, 1, 2};
            case 'V':
                return new int[]{2, 1, 2, 1, 2, 2};
            case Opcodes.POP /* 87 */:
                return new int[]{2, 2, 4, 3, 3, 2};
            case Opcodes.POP2 /* 88 */:
                return new int[]{4, 4, 1, 2, 2, 2};
            case Opcodes.DUP /* 89 */:
                return new int[]{3, 1, 1, 3, 2, 2};
            case Opcodes.DUP_X1 /* 90 */:
                return new int[]{0, 1, 0, 1, 1, 0};
            case Opcodes.DUP_X2 /* 91 */:
            case Opcodes.DREM /* 115 */:
                return new int[]{1, 0, 0, 0, 0, 2};
            case Opcodes.DUP2_X2 /* 94 */:
                return new int[]{3, 1, 3, 3, 2, 4};
            case Opcodes.SWAP /* 95 */:
                return new int[]{1, 1, 1, 1, 1, 2};
            case '`':
                return new int[]{1, 2, 2, 3, 4, 2};
            case Opcodes.FADD /* 98 */:
                return new int[]{1, 1, 3, 2, 2, 3};
            case Opcodes.DADD /* 99 */:
                return new int[]{3, 2, 2, 0, 2, 2};
            case 'd':
                return new int[]{3, 2, 3, 2, 2, 2};
            case 'e':
                return new int[]{4, 2, 3, 3, 4, 3};
            case 'g':
                return new int[]{0, 1, 1, 2, 1, 2};
            case 'i':
                return new int[]{2, 4, 3, 1, 2, 2};
            case Opcodes.DMUL /* 107 */:
                return new int[]{0, 3, 2, 3, 4, 2};
            case 'l':
                return new int[]{3, 2, 1, 1, 1, 2};
            case Opcodes.LDIV /* 109 */:
                return new int[]{2, 1, 1, 2, 2, 2};
            case 'n':
                return new int[]{1, 0, 4, 2, 2, 2};
            case 'p':
            case 230:
                return new int[]{4, 3, 3, 2, 2, 2};
            case Opcodes.FREM /* 114 */:
                return new int[]{0, 2, 2, 4, 4, 4};
            case Opcodes.LNEG /* 117 */:
                return new int[]{2, 1, 2, 2, 3, 2};
            case Opcodes.FNEG /* 118 */:
                return new int[]{1, 2, 1, 3, 2, 2};
            case Opcodes.DNEG /* 119 */:
                return new int[]{3, 1, 1, 2, 2, 2};
            case 'x':
                return new int[]{2, 2, 1, 1, 2, 2};
            case 'z':
            case Opcodes.L2D /* 138 */:
                return new int[]{3, 2, 3, 3, 4, 2};
            case '|':
            case Opcodes.JSR /* 168 */:
                return new int[]{4, 3, 3, 3, 2, 2};
            case Opcodes.LUSHR /* 125 */:
                return new int[]{0, 1, 0, 1, 0, 2};
            case '~':
                return new int[]{4, 0, 3, 2, 1, 3};
            case Opcodes.LOR /* 129 */:
                return new int[]{3, 3, 1, 1, 2, 2};
            case Opcodes.LXOR /* 131 */:
                return new int[]{1, 0, 0, 0, 2, 2};
            case Opcodes.IINC /* 132 */:
                return new int[]{2, 0, 0, 1, 3, 2};
            case Opcodes.I2L /* 133 */:
                return new int[]{1, 2, 2, 3, 2, 2};
            case Opcodes.I2D /* 135 */:
            case 211:
            case 216:
            case 231:
                return new int[]{4, 2, 2, 4, 2, 2};
            case Opcodes.L2I /* 136 */:
                return new int[]{1, 0, 0, 1, 3, 2};
            case Opcodes.F2I /* 139 */:
                return new int[]{2, 0, 2, 2, 2, 2};
            case Opcodes.F2L /* 140 */:
                return new int[]{0, 2, 4, 4, 3, 1};
            case Opcodes.D2I /* 142 */:
                return new int[]{2, 1, 2, 3, 2, 2};
            case Opcodes.I2C /* 146 */:
                return new int[]{3, 1, 0, 2, 2, 2};
            case Opcodes.I2S /* 147 */:
                return new int[]{3, 2, 1, 3, 4, 2};
            case Opcodes.LCMP /* 148 */:
                return new int[]{3, 2, 2, 1, 2, 2};
            case Opcodes.FCMPL /* 149 */:
                return new int[]{2, 4, 4, 4, 3, 2};
            case Opcodes.FCMPG /* 150 */:
                return new int[]{1, 0, 4, 1, 1, 0};
            case Opcodes.DCMPL /* 151 */:
            case 232:
                return new int[]{3, 1, 2, 2, 2, 2};
            case Opcodes.DCMPG /* 152 */:
                return new int[]{3, 4, 3, 2, 2, 2};
            case 153:
            case 235:
                return new int[]{2, 3, 3, 4, 2, 2};
            case 156:
                return new int[]{3, 4, 2, 1, 2, 2};
            case 158:
                return new int[]{2, 1, 4, 3, 0, 4};
            case Opcodes.IF_ICMPEQ /* 159 */:
                return new int[]{0, 0, 3, 0, 0, 2};
            case Opcodes.IF_ICMPNE /* 160 */:
                return new int[]{2, 2, 4, 3, 2, 2};
            case Opcodes.IF_ICMPGT /* 163 */:
                return new int[]{0, 0, 1, 2, 4, 2};
            case Opcodes.IF_ICMPLE /* 164 */:
                return new int[]{2, 3, 1, 2, 4, 2};
            case Opcodes.IF_ACMPNE /* 166 */:
                return new int[]{1, 2, 4, 4, 3, 2};
            case Opcodes.GOTO /* 167 */:
                return new int[]{2, 2, 3, 1, 2, 2};
            case Opcodes.RET /* 169 */:
                return new int[]{2, 1, 2, 3, 2, 1};
            case Opcodes.TABLESWITCH /* 170 */:
                return new int[]{3, 3, 3, 3, 2, 2};
            case Opcodes.LOOKUPSWITCH /* 171 */:
                return new int[]{1, 0, 2, 2, 4, 4};
            case Opcodes.LRETURN /* 173 */:
                return new int[]{2, 0, 2, 1, 2, 0};
            case Opcodes.FRETURN /* 174 */:
                return new int[]{3, 4, 1, 3, 2, 2};
            case Opcodes.ARETURN /* 176 */:
                return new int[]{2, 2, 4, 1, 2, 2};
            case Opcodes.GETSTATIC /* 178 */:
                return new int[]{1, 4, 4, 4, 4, 2};
            case Opcodes.PUTSTATIC /* 179 */:
                return new int[]{0, 3, 2, 3, 1, 2};
            case Opcodes.GETFIELD /* 180 */:
                return new int[]{0, 0, 1, 1, 3, 2};
            case Opcodes.PUTFIELD /* 181 */:
                return new int[]{1, 0, 0, 1, 2, 2};
            case Opcodes.INVOKEVIRTUAL /* 182 */:
                return new int[]{1, 0, 0, 1, 3, 3};
            case Opcodes.INVOKESPECIAL /* 183 */:
                return new int[]{3, 3, 2, 0, 2, 2};
            case Opcodes.INVOKESTATIC /* 184 */:
                return new int[]{3, 1, 1, 2, 2, 0};
            case Opcodes.INVOKEINTERFACE /* 185 */:
            case 238:
                return new int[]{4, 2, 4, 3, 2, 2};
            case Opcodes.ANEWARRAY /* 189 */:
                return new int[]{2, 3, 3, 3, 1, 1};
            case Opcodes.INSTANCEOF /* 193 */:
                return new int[]{0, 1, 1, 1, 2, 2};
            case 196:
                return new int[]{4, 4, 3, 2, 2, 2};
            case Opcodes.MULTIANEWARRAY /* 197 */:
                return new int[]{2, 2, 3, 4, 4, 2};
            case Opcodes.IFNULL /* 198 */:
                return new int[]{2, 4, 4, 1, 2, 2};
            case 200:
                return new int[]{2, 2, 1, 2, 2, 2};
            case 201:
                return new int[]{2, 3, 2, 1, 2, 2};
            case HttpStatus.SC_RESET_CONTENT /* 205 */:
                return new int[]{3, 2, 1, 2, 2, 2};
            case HttpStatus.SC_MULTI_STATUS /* 207 */:
                return new int[]{3, 4, 1, 0, 2, 2};
            case 212:
                return new int[]{3, 1, 1, 1, 2, 2};
            case 213:
                return new int[]{3, 2, 4, 3, 2, 2};
            case 215:
                return new int[]{2, 4, 1, 0, 2, 2};
            case 217:
                return new int[]{0, 0, 0, 0, 0, 0};
            case 218:
                return new int[]{3, 4, 2, 1, 3, 2};
            case 220:
                return new int[]{3, 3, 2, 3, 4, 2};
            case 221:
                return new int[]{2, 2, 4, 1, 3, 1};
            case 222:
                return new int[]{2, 1, 1, 2, 1, 2};
            case 223:
                return new int[]{1, 2, 3, 4, 3, 2};
            case 227:
                return new int[]{2, 2, 1, 1, 2, 4};
            case 228:
                return new int[]{0, 2, 1, 2, 2, 2};
            case 229:
                return new int[]{0, 0, 1, 2, 2, 2};
            case 233:
                return new int[]{1, 2, 1, 1, 2, 2};
            case 236:
                return new int[]{2, 4, 2, 1, 1, 2};
            case 237:
                return new int[]{4, 4, 4, 3, 2, 2};
            default:
                return new int[]{2, 2, 2, 2, 2, 2};
        }
    }

    /* renamed from: n */
    public static synchronized ec5 m24753n(Context context) {
        if (f21362v == null) {
            f21362v = new C13159b(context).m24767a();
        }
        return f21362v;
    }

    /* renamed from: o */
    public static boolean m24754o(iz4 iz4Var, boolean z) {
        return z && !iz4Var.m32921d(8);
    }

    @Override // p001o.ta1
    /* renamed from: a */
    public void mo24755a(Handler handler, ta1.InterfaceC17036a interfaceC17036a) {
        op0.m42515e(handler);
        op0.m42515e(interfaceC17036a);
        this.f21364b.m49589b(handler, interfaceC17036a);
    }

    @Override // p001o.ta1
    /* renamed from: c */
    public void mo24756c(ta1.InterfaceC17036a interfaceC17036a) {
        this.f21364b.m49591e(interfaceC17036a);
    }

    @Override // p001o.ta1
    /* renamed from: d */
    public juh mo24757d() {
        return this;
    }

    @Override // p001o.ta1
    /* renamed from: e */
    public synchronized long mo24758e() {
        return this.f21373k;
    }

    @Override // p001o.juh
    /* renamed from: f */
    public synchronized void mo24759f(dz4 dz4Var, iz4 iz4Var, boolean z, int i) {
        if (m24754o(iz4Var, z)) {
            this.f21370h += i;
        }
    }

    @Override // p001o.juh
    /* renamed from: g */
    public void mo24760g(dz4 dz4Var, iz4 iz4Var, boolean z) {
    }

    @Override // p001o.juh
    /* renamed from: h */
    public synchronized void mo24761h(dz4 dz4Var, iz4 iz4Var, boolean z) {
        if (m24754o(iz4Var, z)) {
            if (this.f21368f == 0) {
                this.f21369g = this.f21365c.elapsedRealtime();
            }
            this.f21368f++;
        }
    }

    @Override // p001o.juh
    /* renamed from: i */
    public synchronized void mo24762i(dz4 dz4Var, iz4 iz4Var, boolean z) {
        if (m24754o(iz4Var, z)) {
            op0.m42517g(this.f21368f > 0);
            long jElapsedRealtime = this.f21365c.elapsedRealtime();
            int i = (int) (jElapsedRealtime - this.f21369g);
            this.f21371i += i;
            long j = this.f21372j;
            long j2 = this.f21370h;
            this.f21372j = j + j2;
            if (i > 0) {
                this.f21367e.m17917c((int) Math.sqrt(j2), (j2 * 8000.0f) / i);
                if (this.f21371i >= 2000 || this.f21372j >= 524288) {
                    this.f21373k = (long) this.f21367e.m17920f(0.5f);
                }
                m24764p(i, this.f21370h, this.f21373k);
                this.f21369g = jElapsedRealtime;
                this.f21370h = 0L;
            }
            this.f21368f--;
        }
    }

    /* renamed from: m */
    public final long m24763m(int i) {
        Long l = (Long) this.f21363a.get(Integer.valueOf(i));
        if (l == null) {
            l = (Long) this.f21363a.get(0);
        }
        if (l == null) {
            l = 1000000L;
        }
        return l.longValue();
    }

    /* renamed from: p */
    public final void m24764p(int i, long j, long j2) {
        if (i == 0 && j == 0 && j2 == this.f21374l) {
            return;
        }
        this.f21374l = j2;
        this.f21364b.m49590c(i, j, j2);
    }

    /* renamed from: q */
    public final synchronized void m24765q(int i) {
        int i2 = this.f21375m;
        if (i2 == 0 || this.f21366d) {
            if (this.f21376n) {
                i = this.f21377o;
            }
            if (i2 == i) {
                return;
            }
            this.f21375m = i;
            if (i != 1 && i != 0 && i != 8) {
                this.f21373k = m24763m(i);
                long jElapsedRealtime = this.f21365c.elapsedRealtime();
                m24764p(this.f21368f > 0 ? (int) (jElapsedRealtime - this.f21369g) : 0, this.f21370h, this.f21373k);
                this.f21369g = jElapsedRealtime;
                this.f21370h = 0L;
                this.f21372j = 0L;
                this.f21371i = 0L;
                this.f21367e.m17921i();
            }
        }
    }

    public ec5(Context context, Map map, int i, jb3 jb3Var, boolean z) {
        this.f21363a = of8.m42179d(map);
        this.f21364b = new ta1.InterfaceC17036a.a();
        this.f21367e = new awf(i);
        this.f21365c = jb3Var;
        this.f21366d = z;
        if (context == null) {
            this.f21375m = 0;
            this.f21373k = m24763m(0);
            return;
        }
        dub dubVarM23838d = dub.m23838d(context);
        int iM23842f = dubVarM23838d.m23842f();
        this.f21375m = iM23842f;
        this.f21373k = m24763m(iM23842f);
        dubVarM23838d.m23843i(new dub.InterfaceC13036c() { // from class: o.dc5
            @Override // p001o.dub.InterfaceC13036c
            /* renamed from: a */
            public final void mo22804a(int i2) {
                this.f19585a.m24765q(i2);
            }
        });
    }
}
