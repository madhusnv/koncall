package p001o;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import android.view.Display;
import android.view.Surface;
import androidx.media3.common.C2181a;
import androidx.media3.exoplayer.InterfaceC2221p;
import androidx.media3.exoplayer.video.PlaceholderSurface;
import com.google.android.gms.common.Scopes;
import com.google.api.Service;
import com.google.firebase.messaging.Constants;
import com.onesignal.core.internal.config.InfluenceConfigModel;
import java.nio.ByteBuffer;
import java.util.List;
import org.apache.http.message.TokenParser;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.TypeReference;
import org.objectweb.asm.signature.SignatureVisitor;
import p001o.j2b;
import p001o.jui;
import p001o.m1b;
import p001o.vo3;
import p001o.yui;
import p001o.zui;

/* loaded from: classes2.dex */
public class l2b extends x1b implements jui.InterfaceC14668b {
    public static final int[] c2 = {1920, 1600, InfluenceConfigModel.DEFAULT_INDIRECT_ATTRIBUTION_WINDOW, 1280, 960, 854, 640, 540, 480};
    public static boolean d2;
    public static boolean e2;
    public final boolean A1;
    public final jui B1;
    public final jui.C14667a C1;
    public C14961c D1;
    public boolean E1;
    public boolean F1;
    public zui G1;
    public boolean H1;
    public List I1;
    public Surface J1;
    public PlaceholderSurface K1;
    public fvf L1;
    public boolean M1;
    public int N1;
    public long O1;
    public int P1;
    public int Q1;
    public int R1;
    public long S1;
    public int T1;
    public long U1;
    public bvi V1;
    public bvi W1;
    public int X1;
    public boolean Y1;
    public int Z1;
    public C14962d a2;
    public gui b2;
    public final Context v1;
    public final avi w1;
    public final boolean x1;
    public final yui.C18499a y1;
    public final int z1;

    /* renamed from: o.l2b$a */
    public class C14959a implements zui.InterfaceC18713a {
        public C14959a() {
        }

        @Override // p001o.zui.InterfaceC18713a
        /* renamed from: a */
        public void mo36453a(zui zuiVar, bvi bviVar) {
        }

        @Override // p001o.zui.InterfaceC18713a
        /* renamed from: b */
        public void mo36454b(zui zuiVar) {
            l2b.this.T2(0, 1);
        }

        @Override // p001o.zui.InterfaceC18713a
        /* renamed from: c */
        public void mo36455c(zui zuiVar) {
            op0.m42519i(l2b.this.J1);
            l2b.this.A2();
        }
    }

    /* renamed from: o.l2b$b */
    public static final class C14960b {
        /* renamed from: a */
        public static boolean m36456a(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display == null || !display.isHdr()) {
                return false;
            }
            for (int i : display.getHdrCapabilities().getSupportedHdrTypes()) {
                if (i == 1) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: o.l2b$c */
    public static final class C14961c {

        /* renamed from: a */
        public final int f33011a;

        /* renamed from: b */
        public final int f33012b;

        /* renamed from: c */
        public final int f33013c;

        public C14961c(int i, int i2, int i3) {
            this.f33011a = i;
            this.f33012b = i2;
            this.f33013c = i3;
        }
    }

    /* renamed from: o.l2b$d */
    public final class C14962d implements m1b.InterfaceC15201d, Handler.Callback {

        /* renamed from: a */
        public final Handler f33014a;

        public C14962d(m1b m1bVar) {
            Handler handlerM48696A = sqi.m48696A(this);
            this.f33014a = handlerM48696A;
            m1bVar.mo23721d(this, handlerM48696A);
        }

        @Override // p001o.m1b.InterfaceC15201d
        /* renamed from: a */
        public void mo36457a(m1b m1bVar, long j, long j2) {
            if (sqi.f45790a >= 30) {
                m36458b(j);
            } else {
                this.f33014a.sendMessageAtFrontOfQueue(Message.obtain(this.f33014a, 0, (int) (j >> 32), (int) j));
            }
        }

        /* renamed from: b */
        public final void m36458b(long j) {
            l2b l2bVar = l2b.this;
            if (this != l2bVar.a2 || l2bVar.L0() == null) {
                return;
            }
            if (j == Long.MAX_VALUE) {
                l2b.this.C2();
                return;
            }
            try {
                l2b.this.B2(j);
            } catch (qm6 e) {
                l2b.this.L1(e);
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            m36458b(sqi.o1(message.arg1, message.arg2));
            return true;
        }
    }

    public l2b(Context context, m1b.InterfaceC15199b interfaceC15199b, a2b a2bVar, long j, boolean z, Handler handler, yui yuiVar, int i) {
        this(context, interfaceC15199b, a2bVar, j, z, handler, yuiVar, i, 30.0f);
    }

    public static void I2(m1b m1bVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        m1bVar.mo23719b(bundle);
    }

    public static boolean b2() {
        return sqi.f45790a >= 21;
    }

    public static void d2(MediaFormat mediaFormat, int i) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i);
    }

    public static boolean e2() {
        return "NVIDIA".equals(sqi.f45792c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean g2() {
        String str;
        int i = sqi.f45790a;
        char c = 7;
        if (i <= 28) {
            String str2 = sqi.f45791b;
            str2.hashCode();
            switch (str2) {
            }
            return true;
        }
        if (i <= 27 && "HWEML".equals(sqi.f45791b)) {
            return true;
        }
        str = sqi.f45793d;
        str.hashCode();
        switch (str) {
            case "AFTJMST12":
            case "AFTKMST12":
            case "AFTA":
            case "AFTN":
            case "AFTR":
            case "AFTEU011":
            case "AFTEU014":
            case "AFTSO001":
            case "AFTEUFF014":
                break;
            default:
                if (i <= 26) {
                    String str3 = sqi.f45791b;
                    str3.hashCode();
                    switch (str3.hashCode()) {
                        case -2144781245:
                            if (!str3.equals("GIONEE_SWW1609")) {
                                c = 65535;
                                break;
                            } else {
                                c = 0;
                                break;
                            }
                        case -2144781185:
                            if (str3.equals("GIONEE_SWW1627")) {
                                c = 1;
                                break;
                            }
                            break;
                        case -2144781160:
                            if (str3.equals("GIONEE_SWW1631")) {
                                c = 2;
                                break;
                            }
                            break;
                        case -2097309513:
                            if (str3.equals("K50a40")) {
                                c = 3;
                                break;
                            }
                            break;
                        case -2022874474:
                            if (str3.equals("CP8676_I02")) {
                                c = 4;
                                break;
                            }
                            break;
                        case -1978993182:
                            if (str3.equals("NX541J")) {
                                c = 5;
                                break;
                            }
                            break;
                        case -1978990237:
                            if (str3.equals("NX573J")) {
                                c = 6;
                                break;
                            }
                            break;
                        case -1936688988:
                            if (!str3.equals("PGN528")) {
                            }
                            break;
                        case -1936688066:
                            if (str3.equals("PGN610")) {
                                c = '\b';
                                break;
                            }
                            break;
                        case -1936688065:
                            if (str3.equals("PGN611")) {
                                c = '\t';
                                break;
                            }
                            break;
                        case -1931988508:
                            if (str3.equals("AquaPowerM")) {
                                c = '\n';
                                break;
                            }
                            break;
                        case -1885099851:
                            if (str3.equals("RAIJIN")) {
                                c = 11;
                                break;
                            }
                            break;
                        case -1696512866:
                            if (str3.equals("XT1663")) {
                                c = '\f';
                                break;
                            }
                            break;
                        case -1680025915:
                            if (str3.equals("ComioS1")) {
                                c = TokenParser.CR;
                                break;
                            }
                            break;
                        case -1615810839:
                            if (str3.equals("Phantom6")) {
                                c = 14;
                                break;
                            }
                            break;
                        case -1600724499:
                            if (str3.equals("pacificrim")) {
                                c = 15;
                                break;
                            }
                            break;
                        case -1554255044:
                            if (str3.equals("vernee_M5")) {
                                c = 16;
                                break;
                            }
                            break;
                        case -1481772737:
                            if (str3.equals("panell_dl")) {
                                c = 17;
                                break;
                            }
                            break;
                        case -1481772730:
                            if (str3.equals("panell_ds")) {
                                c = 18;
                                break;
                            }
                            break;
                        case -1481772729:
                            if (str3.equals("panell_dt")) {
                                c = 19;
                                break;
                            }
                            break;
                        case -1320080169:
                            if (str3.equals("GiONEE_GBL7319")) {
                                c = 20;
                                break;
                            }
                            break;
                        case -1217592143:
                            if (str3.equals("BRAVIA_ATV2")) {
                                c = 21;
                                break;
                            }
                            break;
                        case -1180384755:
                            if (str3.equals("iris60")) {
                                c = 22;
                                break;
                            }
                            break;
                        case -1139198265:
                            if (str3.equals("Slate_Pro")) {
                                c = 23;
                                break;
                            }
                            break;
                        case -1052835013:
                            if (str3.equals("namath")) {
                                c = 24;
                                break;
                            }
                            break;
                        case -993250464:
                            if (str3.equals("A10-70F")) {
                                c = 25;
                                break;
                            }
                            break;
                        case -993250458:
                            if (str3.equals("A10-70L")) {
                                c = 26;
                                break;
                            }
                            break;
                        case -965403638:
                            if (str3.equals("s905x018")) {
                                c = 27;
                                break;
                            }
                            break;
                        case -958336948:
                            if (str3.equals("ELUGA_Ray_X")) {
                                c = 28;
                                break;
                            }
                            break;
                        case -879245230:
                            if (str3.equals("tcl_eu")) {
                                c = 29;
                                break;
                            }
                            break;
                        case -842500323:
                            if (str3.equals("nicklaus_f")) {
                                c = 30;
                                break;
                            }
                            break;
                        case -821392978:
                            if (str3.equals("A7000-a")) {
                                c = 31;
                                break;
                            }
                            break;
                        case -797483286:
                            if (str3.equals("SVP-DTV15")) {
                                c = TokenParser.SP;
                                break;
                            }
                            break;
                        case -794946968:
                            if (str3.equals("watson")) {
                                c = '!';
                                break;
                            }
                            break;
                        case -788334647:
                            if (str3.equals("whyred")) {
                                c = TokenParser.DQUOTE;
                                break;
                            }
                            break;
                        case -782144577:
                            if (str3.equals("OnePlus5T")) {
                                c = '#';
                                break;
                            }
                            break;
                        case -575125681:
                            if (str3.equals("GiONEE_CBL7513")) {
                                c = '$';
                                break;
                            }
                            break;
                        case -521118391:
                            if (str3.equals("GIONEE_GBL7360")) {
                                c = '%';
                                break;
                            }
                            break;
                        case -430914369:
                            if (str3.equals("Pixi4-7_3G")) {
                                c = '&';
                                break;
                            }
                            break;
                        case -290434366:
                            if (str3.equals("taido_row")) {
                                c = '\'';
                                break;
                            }
                            break;
                        case -282781963:
                            if (str3.equals("BLACK-1X")) {
                                c = '(';
                                break;
                            }
                            break;
                        case -277133239:
                            if (str3.equals("Z12_PRO")) {
                                c = ')';
                                break;
                            }
                            break;
                        case -173639913:
                            if (str3.equals("ELUGA_A3_Pro")) {
                                c = '*';
                                break;
                            }
                            break;
                        case -56598463:
                            if (str3.equals("woods_fn")) {
                                c = '+';
                                break;
                            }
                            break;
                        case 2126:
                            if (str3.equals("C1")) {
                                c = ',';
                                break;
                            }
                            break;
                        case 2564:
                            if (str3.equals("Q5")) {
                                c = '-';
                                break;
                            }
                            break;
                        case 2715:
                            if (str3.equals("V1")) {
                                c = '.';
                                break;
                            }
                            break;
                        case 2719:
                            if (str3.equals("V5")) {
                                c = '/';
                                break;
                            }
                            break;
                        case 3091:
                            if (str3.equals("b5")) {
                                c = '0';
                                break;
                            }
                            break;
                        case 3483:
                            if (str3.equals("mh")) {
                                c = '1';
                                break;
                            }
                            break;
                        case 73405:
                            if (str3.equals("JGZ")) {
                                c = '2';
                                break;
                            }
                            break;
                        case 75537:
                            if (str3.equals("M04")) {
                                c = '3';
                                break;
                            }
                            break;
                        case 75739:
                            if (str3.equals("M5c")) {
                                c = '4';
                                break;
                            }
                            break;
                        case 76779:
                            if (str3.equals("MX6")) {
                                c = '5';
                                break;
                            }
                            break;
                        case 78669:
                            if (str3.equals("P85")) {
                                c = '6';
                                break;
                            }
                            break;
                        case 79305:
                            if (str3.equals("PLE")) {
                                c = '7';
                                break;
                            }
                            break;
                        case 80618:
                            if (str3.equals("QX1")) {
                                c = '8';
                                break;
                            }
                            break;
                        case 88274:
                            if (str3.equals("Z80")) {
                                c = '9';
                                break;
                            }
                            break;
                        case 98846:
                            if (str3.equals("cv1")) {
                                c = ':';
                                break;
                            }
                            break;
                        case 98848:
                            if (str3.equals("cv3")) {
                                c = ';';
                                break;
                            }
                            break;
                        case 99329:
                            if (str3.equals("deb")) {
                                c = '<';
                                break;
                            }
                            break;
                        case 101481:
                            if (str3.equals("flo")) {
                                c = '=';
                                break;
                            }
                            break;
                        case 1513190:
                            if (str3.equals("1601")) {
                                c = '>';
                                break;
                            }
                            break;
                        case 1514184:
                            if (str3.equals("1713")) {
                                c = '?';
                                break;
                            }
                            break;
                        case 1514185:
                            if (str3.equals("1714")) {
                                c = '@';
                                break;
                            }
                            break;
                        case 2133089:
                            if (str3.equals("F01H")) {
                                c = 'A';
                                break;
                            }
                            break;
                        case 2133091:
                            if (str3.equals("F01J")) {
                                c = 'B';
                                break;
                            }
                            break;
                        case 2133120:
                            if (str3.equals("F02H")) {
                                c = 'C';
                                break;
                            }
                            break;
                        case 2133151:
                            if (str3.equals("F03H")) {
                                c = 'D';
                                break;
                            }
                            break;
                        case 2133182:
                            if (str3.equals("F04H")) {
                                c = 'E';
                                break;
                            }
                            break;
                        case 2133184:
                            if (str3.equals("F04J")) {
                                c = 'F';
                                break;
                            }
                            break;
                        case 2436959:
                            if (str3.equals("P681")) {
                                c = 'G';
                                break;
                            }
                            break;
                        case 2463773:
                            if (str3.equals("Q350")) {
                                c = 'H';
                                break;
                            }
                            break;
                        case 2464648:
                            if (str3.equals("Q427")) {
                                c = 'I';
                                break;
                            }
                            break;
                        case 2689555:
                            if (str3.equals("XE2X")) {
                                c = 'J';
                                break;
                            }
                            break;
                        case 3154429:
                            if (str3.equals("fugu")) {
                                c = 'K';
                                break;
                            }
                            break;
                        case 3284551:
                            if (str3.equals("kate")) {
                                c = 'L';
                                break;
                            }
                            break;
                        case 3351335:
                            if (str3.equals("mido")) {
                                c = 'M';
                                break;
                            }
                            break;
                        case 3386211:
                            if (str3.equals("p212")) {
                                c = 'N';
                                break;
                            }
                            break;
                        case 41325051:
                            if (str3.equals("MEIZU_M5")) {
                                c = 'O';
                                break;
                            }
                            break;
                        case 51349633:
                            if (str3.equals("601LV")) {
                                c = 'P';
                                break;
                            }
                            break;
                        case 51350594:
                            if (str3.equals("602LV")) {
                                c = 'Q';
                                break;
                            }
                            break;
                        case 55178625:
                            if (str3.equals("Aura_Note_2")) {
                                c = 'R';
                                break;
                            }
                            break;
                        case 61542055:
                            if (str3.equals("A1601")) {
                                c = 'S';
                                break;
                            }
                            break;
                        case 65355429:
                            if (str3.equals("E5643")) {
                                c = 'T';
                                break;
                            }
                            break;
                        case 66214468:
                            if (str3.equals("F3111")) {
                                c = 'U';
                                break;
                            }
                            break;
                        case 66214470:
                            if (str3.equals("F3113")) {
                                c = 'V';
                                break;
                            }
                            break;
                        case 66214473:
                            if (str3.equals("F3116")) {
                                c = 'W';
                                break;
                            }
                            break;
                        case 66215429:
                            if (str3.equals("F3211")) {
                                c = 'X';
                                break;
                            }
                            break;
                        case 66215431:
                            if (str3.equals("F3213")) {
                                c = 'Y';
                                break;
                            }
                            break;
                        case 66215433:
                            if (str3.equals("F3215")) {
                                c = 'Z';
                                break;
                            }
                            break;
                        case 66216390:
                            if (str3.equals("F3311")) {
                                c = '[';
                                break;
                            }
                            break;
                        case 76402249:
                            if (str3.equals("PRO7S")) {
                                c = TokenParser.ESCAPE;
                                break;
                            }
                            break;
                        case 76404105:
                            if (str3.equals("Q4260")) {
                                c = ']';
                                break;
                            }
                            break;
                        case 76404911:
                            if (str3.equals("Q4310")) {
                                c = '^';
                                break;
                            }
                            break;
                        case 80963634:
                            if (str3.equals("V23GB")) {
                                c = '_';
                                break;
                            }
                            break;
                        case 82882791:
                            if (str3.equals("X3_HK")) {
                                c = '`';
                                break;
                            }
                            break;
                        case 98715550:
                            if (str3.equals("i9031")) {
                                c = 'a';
                                break;
                            }
                            break;
                        case 101370885:
                            if (str3.equals("l5460")) {
                                c = 'b';
                                break;
                            }
                            break;
                        case 102844228:
                            if (str3.equals("le_x6")) {
                                c = 'c';
                                break;
                            }
                            break;
                        case 165221241:
                            if (str3.equals("A2016a40")) {
                                c = 'd';
                                break;
                            }
                            break;
                        case 182191441:
                            if (str3.equals("CPY83_I00")) {
                                c = 'e';
                                break;
                            }
                            break;
                        case 245388979:
                            if (str3.equals("marino_f")) {
                                c = 'f';
                                break;
                            }
                            break;
                        case 287431619:
                            if (str3.equals("griffin")) {
                                c = 'g';
                                break;
                            }
                            break;
                        case 307593612:
                            if (str3.equals("A7010a48")) {
                                c = 'h';
                                break;
                            }
                            break;
                        case 308517133:
                            if (str3.equals("A7020a48")) {
                                c = 'i';
                                break;
                            }
                            break;
                        case 316215098:
                            if (str3.equals("TB3-730F")) {
                                c = 'j';
                                break;
                            }
                            break;
                        case 316215116:
                            if (str3.equals("TB3-730X")) {
                                c = 'k';
                                break;
                            }
                            break;
                        case 316246811:
                            if (str3.equals("TB3-850F")) {
                                c = 'l';
                                break;
                            }
                            break;
                        case 316246818:
                            if (str3.equals("TB3-850M")) {
                                c = 'm';
                                break;
                            }
                            break;
                        case 407160593:
                            if (str3.equals("Pixi5-10_4G")) {
                                c = 'n';
                                break;
                            }
                            break;
                        case 507412548:
                            if (str3.equals("QM16XE_U")) {
                                c = 'o';
                                break;
                            }
                            break;
                        case 793982701:
                            if (str3.equals("GIONEE_WBL5708")) {
                                c = 'p';
                                break;
                            }
                            break;
                        case 794038622:
                            if (str3.equals("GIONEE_WBL7365")) {
                                c = 'q';
                                break;
                            }
                            break;
                        case 794040393:
                            if (str3.equals("GIONEE_WBL7519")) {
                                c = 'r';
                                break;
                            }
                            break;
                        case 835649806:
                            if (str3.equals("manning")) {
                                c = 's';
                                break;
                            }
                            break;
                        case 917340916:
                            if (str3.equals("A7000plus")) {
                                c = 't';
                                break;
                            }
                            break;
                        case 958008161:
                            if (str3.equals("j2xlteins")) {
                                c = 'u';
                                break;
                            }
                            break;
                        case 1060579533:
                            if (str3.equals("panell_d")) {
                                c = 'v';
                                break;
                            }
                            break;
                        case 1150207623:
                            if (str3.equals("LS-5017")) {
                                c = 'w';
                                break;
                            }
                            break;
                        case 1176899427:
                            if (str3.equals("itel_S41")) {
                                c = 'x';
                                break;
                            }
                            break;
                        case 1280332038:
                            if (str3.equals("hwALE-H")) {
                                c = 'y';
                                break;
                            }
                            break;
                        case 1306947716:
                            if (str3.equals("EverStar_S")) {
                                c = 'z';
                                break;
                            }
                            break;
                        case 1349174697:
                            if (str3.equals("htc_e56ml_dtul")) {
                                c = '{';
                                break;
                            }
                            break;
                        case 1522194893:
                            if (str3.equals("woods_f")) {
                                c = '|';
                                break;
                            }
                            break;
                        case 1691543273:
                            if (str3.equals("CPH1609")) {
                                c = '}';
                                break;
                            }
                            break;
                        case 1691544261:
                            if (str3.equals("CPH1715")) {
                                c = '~';
                                break;
                            }
                            break;
                        case 1709443163:
                            if (str3.equals("iball8735_9806")) {
                                c = 127;
                                break;
                            }
                            break;
                        case 1865889110:
                            if (str3.equals("santoni")) {
                                c = 128;
                                break;
                            }
                            break;
                        case 1906253259:
                            if (str3.equals("PB2-670M")) {
                                c = 129;
                                break;
                            }
                            break;
                        case 1977196784:
                            if (str3.equals("Infinix-X572")) {
                                c = 130;
                                break;
                            }
                            break;
                        case 2006372676:
                            if (str3.equals("BRAVIA_ATV3_4K")) {
                                c = 131;
                                break;
                            }
                            break;
                        case 2019281702:
                            if (str3.equals("DM-01K")) {
                                c = 132;
                                break;
                            }
                            break;
                        case 2029784656:
                            if (str3.equals("HWBLN-H")) {
                                c = 133;
                                break;
                            }
                            break;
                        case 2030379515:
                            if (str3.equals("HWCAM-H")) {
                                c = 134;
                                break;
                            }
                            break;
                        case 2033393791:
                            if (str3.equals("ASUS_X00AD_2")) {
                                c = 135;
                                break;
                            }
                            break;
                        case 2047190025:
                            if (str3.equals("ELUGA_Note")) {
                                c = 136;
                                break;
                            }
                            break;
                        case 2047252157:
                            if (str3.equals("ELUGA_Prim")) {
                                c = 137;
                                break;
                            }
                            break;
                        case 2048319463:
                            if (str3.equals("HWVNS-H")) {
                                c = 138;
                                break;
                            }
                            break;
                        case 2048855701:
                            if (str3.equals("HWWAS-H")) {
                                c = 139;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        default:
                            str.hashCode();
                            if (!str.equals("JSN-L21")) {
                            }
                            break;
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case '\b':
                        case '\t':
                        case '\n':
                        case 11:
                        case '\f':
                        case '\r':
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case Service.MONITORING_FIELD_NUMBER /* 28 */:
                        case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                        case 30:
                        case um5.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                        case ' ':
                        case '!':
                        case wm5.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                        case '#':
                        case um5.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                        case '%':
                        case '&':
                        case um5.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                        case '(':
                        case um5.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                        case um5.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                        case SignatureVisitor.EXTENDS /* 43 */:
                        case um5.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                        case '-':
                        case '.':
                        case '/':
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                        case ':':
                        case Opcodes.V15 /* 59 */:
                        case Opcodes.V16 /* 60 */:
                        case '=':
                        case '>':
                        case '?':
                        case '@':
                        case 'A':
                        case TypeReference.EXCEPTION_PARAMETER /* 66 */:
                        case TypeReference.INSTANCEOF /* 67 */:
                        case TypeReference.NEW /* 68 */:
                        case TypeReference.CONSTRUCTOR_REFERENCE /* 69 */:
                        case TypeReference.METHOD_REFERENCE /* 70 */:
                        case TypeReference.CAST /* 71 */:
                        case TypeReference.CONSTRUCTOR_INVOCATION_TYPE_ARGUMENT /* 72 */:
                        case TypeReference.METHOD_INVOCATION_TYPE_ARGUMENT /* 73 */:
                        case TypeReference.CONSTRUCTOR_REFERENCE_TYPE_ARGUMENT /* 74 */:
                        case TypeReference.METHOD_REFERENCE_TYPE_ARGUMENT /* 75 */:
                        case 'L':
                        case 'M':
                        case 'N':
                        case Opcodes.IASTORE /* 79 */:
                        case 'P':
                        case Opcodes.FASTORE /* 81 */:
                        case Opcodes.DASTORE /* 82 */:
                        case Opcodes.AASTORE /* 83 */:
                        case Opcodes.BASTORE /* 84 */:
                        case Opcodes.CASTORE /* 85 */:
                        case 'V':
                        case Opcodes.POP /* 87 */:
                        case Opcodes.POP2 /* 88 */:
                        case Opcodes.DUP /* 89 */:
                        case Opcodes.DUP_X1 /* 90 */:
                        case Opcodes.DUP_X2 /* 91 */:
                        case Opcodes.DUP2 /* 92 */:
                        case Opcodes.DUP2_X1 /* 93 */:
                        case Opcodes.DUP2_X2 /* 94 */:
                        case Opcodes.SWAP /* 95 */:
                        case '`':
                        case Opcodes.LADD /* 97 */:
                        case Opcodes.FADD /* 98 */:
                        case Opcodes.DADD /* 99 */:
                        case 'd':
                        case 'e':
                        case 'f':
                        case 'g':
                        case 'h':
                        case 'i':
                        case Opcodes.FMUL /* 106 */:
                        case Opcodes.DMUL /* 107 */:
                        case 'l':
                        case Opcodes.LDIV /* 109 */:
                        case 'n':
                        case Opcodes.DDIV /* 111 */:
                        case 'p':
                        case Opcodes.LREM /* 113 */:
                        case Opcodes.FREM /* 114 */:
                        case Opcodes.DREM /* 115 */:
                        case 't':
                        case Opcodes.LNEG /* 117 */:
                        case Opcodes.FNEG /* 118 */:
                        case Opcodes.DNEG /* 119 */:
                        case 'x':
                        case Opcodes.LSHL /* 121 */:
                        case 'z':
                        case Opcodes.LSHR /* 123 */:
                        case '|':
                        case Opcodes.LUSHR /* 125 */:
                        case '~':
                        case Opcodes.LAND /* 127 */:
                        case 128:
                        case Opcodes.LOR /* 129 */:
                        case 130:
                        case Opcodes.LXOR /* 131 */:
                        case Opcodes.IINC /* 132 */:
                        case Opcodes.I2L /* 133 */:
                        case Opcodes.I2F /* 134 */:
                        case Opcodes.I2D /* 135 */:
                        case Opcodes.L2I /* 136 */:
                        case Opcodes.L2F /* 137 */:
                        case Opcodes.L2D /* 138 */:
                        case Opcodes.F2I /* 139 */:
                            return true;
                    }
                }
                break;
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int i2(q1b q1bVar, C2181a c2181a) {
        int iIntValue;
        int i = c2181a.f7949t;
        int i2 = c2181a.f7950u;
        if (i == -1 || i2 == -1) {
            return -1;
        }
        String str = (String) op0.m42515e(c2181a.f7943n);
        char c = 1;
        if ("video/dolby-vision".equals(str)) {
            Pair pairM33134r = j2b.m33134r(c2181a);
            str = (pairM33134r == null || !((iIntValue = ((Integer) pairM33134r.first).intValue()) == 512 || iIntValue == 1 || iIntValue == 2)) ? "video/hevc" : "video/avc";
        }
        str.hashCode();
        switch (str.hashCode()) {
            case -1664118616:
                if (!str.equals("video/3gpp")) {
                    c = 65535;
                    break;
                } else {
                    c = 0;
                    break;
                }
            case -1662735862:
                if (!str.equals("video/av01")) {
                }
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c = 2;
                    break;
                }
                break;
            case 1187890754:
                if (str.equals("video/mp4v-es")) {
                    c = 3;
                    break;
                }
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c = 4;
                    break;
                }
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c = 5;
                    break;
                }
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 3:
            case 5:
                return n2(i * i2, 2);
            case 2:
                return Math.max(2097152, n2(i * i2, 2));
            case 4:
                String str2 = sqi.f45793d;
                if ("BRAVIA 4K 2015".equals(str2) || ("Amazon".equals(sqi.f45792c) && ("KFSOWI".equals(str2) || ("AFTS".equals(str2) && q1bVar.f41094g)))) {
                    return -1;
                }
                return n2(sqi.m48731j(i, 16) * sqi.m48731j(i2, 16) * 16 * 16, 2);
            case 6:
                return n2(i * i2, 4);
            default:
                return -1;
        }
    }

    public static Point j2(q1b q1bVar, C2181a c2181a) {
        int i = c2181a.f7950u;
        int i2 = c2181a.f7949t;
        boolean z = i > i2;
        int i3 = z ? i : i2;
        if (z) {
            i = i2;
        }
        float f = i / i3;
        for (int i4 : c2) {
            int i5 = (int) (i4 * f);
            if (i4 <= i3 || i5 <= i) {
                break;
            }
            if (sqi.f45790a >= 21) {
                int i6 = z ? i5 : i4;
                if (!z) {
                    i4 = i5;
                }
                Point pointM44689b = q1bVar.m44689b(i6, i4);
                float f2 = c2181a.f7951v;
                if (pointM44689b != null && q1bVar.m44700u(pointM44689b.x, pointM44689b.y, f2)) {
                    return pointM44689b;
                }
            } else {
                try {
                    int iM48731j = sqi.m48731j(i4, 16) * 16;
                    int iM48731j2 = sqi.m48731j(i5, 16) * 16;
                    if (iM48731j * iM48731j2 <= j2b.m33112P()) {
                        int i7 = z ? iM48731j2 : iM48731j;
                        if (!z) {
                            iM48731j = iM48731j2;
                        }
                        return new Point(i7, iM48731j);
                    }
                } catch (j2b.C14435c unused) {
                }
            }
        }
        return null;
    }

    public static List l2(Context context, a2b a2bVar, C2181a c2181a, boolean z, boolean z2) {
        String str = c2181a.f7943n;
        if (str == null) {
            return nf8.m40499E();
        }
        if (sqi.f45790a >= 26 && "video/dolby-vision".equals(str) && !C14960b.m36456a(context)) {
            List listM33130n = j2b.m33130n(a2bVar, c2181a, z, z2);
            if (!listM33130n.isEmpty()) {
                return listM33130n;
            }
        }
        return j2b.m33138v(a2bVar, c2181a, z, z2);
    }

    public static int m2(q1b q1bVar, C2181a c2181a) {
        if (c2181a.f7944o == -1) {
            return i2(q1bVar, c2181a);
        }
        int size = c2181a.f7946q.size();
        int length = 0;
        for (int i = 0; i < size; i++) {
            length += ((byte[]) c2181a.f7946q.get(i)).length;
        }
        return c2181a.f7944o + length;
    }

    public static int n2(int i, int i2) {
        return (i * 3) / (i2 * 2);
    }

    public final void A2() {
        this.y1.m58343A(this.J1);
        this.M1 = true;
    }

    public void B2(long j) {
        V1(j);
        t2(this.V1);
        this.q1.f55017e++;
        r2();
        t1(j);
    }

    public final void C2() {
        K1();
    }

    public void D2() {
    }

    @Override // p001o.x1b
    public void E1() {
        super.E1();
        this.R1 = 0;
    }

    public final void E2() {
        Surface surface = this.J1;
        PlaceholderSurface placeholderSurface = this.K1;
        if (surface == placeholderSurface) {
            this.J1 = null;
        }
        if (placeholderSurface != null) {
            placeholderSurface.release();
            this.K1 = null;
        }
    }

    public void F2(m1b m1bVar, int i, long j) {
        gth.m29480a("releaseOutputBuffer");
        m1bVar.mo23731n(i, true);
        gth.m29481b();
        this.q1.f55017e++;
        this.Q1 = 0;
        if (this.G1 == null) {
            t2(this.V1);
            r2();
        }
    }

    public final void G2(m1b m1bVar, int i, long j, long j2) {
        if (sqi.f45790a >= 21) {
            H2(m1bVar, i, j, j2);
        } else {
            F2(m1bVar, i, j);
        }
    }

    @Override // p001o.x1b, androidx.media3.exoplayer.InterfaceC2218o
    /* renamed from: H */
    public void mo7428H(float f, float f2) throws qm6 {
        super.mo7428H(f, f2);
        zui zuiVar = this.G1;
        if (zuiVar != null) {
            zuiVar.mo53141i(f);
        } else {
            this.B1.m34557r(f);
        }
    }

    public void H2(m1b m1bVar, int i, long j, long j2) {
        gth.m29480a("releaseOutputBuffer");
        m1bVar.mo23728k(i, j2);
        gth.m29481b();
        this.q1.f55017e++;
        this.Q1 = 0;
        if (this.G1 == null) {
            t2(this.V1);
            r2();
        }
    }

    @Override // p001o.jui.InterfaceC14668b
    /* renamed from: I */
    public boolean mo34567I(long j, long j2, boolean z) {
        return N2(j, j2, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [androidx.media3.exoplayer.c, o.l2b, o.x1b] */
    /* JADX WARN: Type inference failed for: r6v10, types: [android.view.Surface] */
    public final void J2(Object obj) throws qm6 {
        PlaceholderSurface placeholderSurfaceM7507c = obj instanceof Surface ? (Surface) obj : null;
        if (placeholderSurfaceM7507c == null) {
            PlaceholderSurface placeholderSurface = this.K1;
            if (placeholderSurface != null) {
                placeholderSurfaceM7507c = placeholderSurface;
            } else {
                q1b q1bVarN0 = N0();
                if (q1bVarN0 != null && Q2(q1bVarN0)) {
                    placeholderSurfaceM7507c = PlaceholderSurface.m7507c(this.v1, q1bVarN0.f41094g);
                    this.K1 = placeholderSurfaceM7507c;
                }
            }
        }
        if (this.J1 == placeholderSurfaceM7507c) {
            if (placeholderSurfaceM7507c == null || placeholderSurfaceM7507c == this.K1) {
                return;
            }
            w2();
            v2();
            return;
        }
        this.J1 = placeholderSurfaceM7507c;
        if (this.G1 == null) {
            this.B1.m34556q(placeholderSurfaceM7507c);
        }
        this.M1 = false;
        int state = getState();
        m1b m1bVarL0 = L0();
        if (m1bVarL0 != null && this.G1 == null) {
            if (sqi.f45790a < 23 || placeholderSurfaceM7507c == null || this.E1) {
                C1();
                l1();
            } else {
                K2(m1bVarL0, placeholderSurfaceM7507c);
            }
        }
        if (placeholderSurfaceM7507c == null || placeholderSurfaceM7507c == this.K1) {
            this.W1 = null;
            zui zuiVar = this.G1;
            if (zuiVar != null) {
                zuiVar.mo53150s();
            }
        } else {
            w2();
            if (state == 2) {
                this.B1.m34544e(true);
            }
        }
        y2();
    }

    public void K2(m1b m1bVar, Surface surface) {
        m1bVar.mo23725h(surface);
    }

    public void L2(List list) {
        this.I1 = list;
        zui zuiVar = this.G1;
        if (zuiVar != null) {
            zuiVar.mo53140h(list);
        }
    }

    @Override // p001o.x1b
    public int M0(a85 a85Var) {
        return (sqi.f45790a < 34 || !this.Y1 || a85Var.f14284f >= m6883V()) ? 0 : 32;
    }

    public boolean M2(long j, long j2, boolean z) {
        return j < -500000 && !z;
    }

    public boolean N2(long j, long j2, boolean z) {
        return j < -30000 && !z;
    }

    @Override // p001o.x1b
    public boolean O0() {
        return this.Y1 && sqi.f45790a < 23;
    }

    @Override // p001o.x1b
    public boolean O1(q1b q1bVar) {
        return this.J1 != null || Q2(q1bVar);
    }

    public boolean O2(long j, long j2) {
        return j < -30000 && j2 > 100000;
    }

    @Override // p001o.x1b
    public float P0(float f, C2181a c2181a, C2181a[] c2181aArr) {
        float fMax = -1.0f;
        for (C2181a c2181a2 : c2181aArr) {
            float f2 = c2181a2.f7951v;
            if (f2 != -1.0f) {
                fMax = Math.max(fMax, f2);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f;
    }

    public boolean P2() {
        return true;
    }

    public final boolean Q2(q1b q1bVar) {
        return sqi.f45790a >= 23 && !this.Y1 && !c2(q1bVar.f41088a) && (!q1bVar.f41094g || PlaceholderSurface.m7506b(this.v1));
    }

    @Override // p001o.x1b
    public List R0(a2b a2bVar, C2181a c2181a, boolean z) {
        return j2b.m33139w(l2(this.v1, a2bVar, c2181a, z, this.Y1), c2181a);
    }

    @Override // p001o.x1b
    public int R1(a2b a2bVar, C2181a c2181a) {
        boolean z;
        int i = 0;
        if (!xeb.m56189q(c2181a.f7943n)) {
            return InterfaceC2221p.m7447s(0);
        }
        boolean z2 = c2181a.f7947r != null;
        List listL2 = l2(this.v1, a2bVar, c2181a, z2, false);
        if (z2 && listL2.isEmpty()) {
            listL2 = l2(this.v1, a2bVar, c2181a, false, false);
        }
        if (listL2.isEmpty()) {
            return InterfaceC2221p.m7447s(1);
        }
        if (!x1b.S1(c2181a)) {
            return InterfaceC2221p.m7447s(2);
        }
        q1b q1bVar = (q1b) listL2.get(0);
        boolean zM44696m = q1bVar.m44696m(c2181a);
        if (zM44696m) {
            z = true;
        } else {
            for (int i2 = 1; i2 < listL2.size(); i2++) {
                q1b q1bVar2 = (q1b) listL2.get(i2);
                if (q1bVar2.m44696m(c2181a)) {
                    z = false;
                    zM44696m = true;
                    q1bVar = q1bVar2;
                    break;
                }
            }
            z = true;
        }
        int i3 = zM44696m ? 4 : 3;
        int i4 = q1bVar.m44699p(c2181a) ? 16 : 8;
        int i5 = q1bVar.f41095h ? 64 : 0;
        int i6 = z ? 128 : 0;
        if (sqi.f45790a >= 26 && "video/dolby-vision".equals(c2181a.f7943n) && !C14960b.m36456a(this.v1)) {
            i6 = 256;
        }
        if (zM44696m) {
            List listL22 = l2(this.v1, a2bVar, c2181a, z2, true);
            if (!listL22.isEmpty()) {
                q1b q1bVar3 = (q1b) j2b.m33139w(listL22, c2181a).get(0);
                if (q1bVar3.m44696m(c2181a) && q1bVar3.m44699p(c2181a)) {
                    i = 32;
                }
            }
        }
        return InterfaceC2221p.m7443n(i3, i4, i, i5, i6);
    }

    public void R2(m1b m1bVar, int i, long j) {
        gth.m29480a("skipVideoBuffer");
        m1bVar.mo23731n(i, false);
        gth.m29481b();
        this.q1.f55018f++;
    }

    public final void S2() {
        m1b m1bVarL0 = L0();
        if (m1bVarL0 != null && sqi.f45790a >= 35) {
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.X1));
            m1bVarL0.mo23719b(bundle);
        }
    }

    public void T2(int i, int i2) {
        y75 y75Var = this.q1;
        y75Var.f55020h += i;
        int i3 = i + i2;
        y75Var.f55019g += i3;
        this.P1 += i3;
        int i4 = this.Q1 + i3;
        this.Q1 = i4;
        y75Var.f55021i = Math.max(i4, y75Var.f55021i);
        int i5 = this.z1;
        if (i5 <= 0 || this.P1 < i5) {
            return;
        }
        q2();
    }

    @Override // p001o.x1b
    public m1b.C15198a U0(q1b q1bVar, C2181a c2181a, MediaCrypto mediaCrypto, float f) {
        PlaceholderSurface placeholderSurface = this.K1;
        if (placeholderSurface != null && placeholderSurface.f8571a != q1bVar.f41094g) {
            E2();
        }
        String str = q1bVar.f41090c;
        C14961c c14961cK2 = k2(q1bVar, c2181a, m6885X());
        this.D1 = c14961cK2;
        MediaFormat mediaFormatO2 = o2(c2181a, str, c14961cK2, f, this.A1, this.Y1 ? this.Z1 : 0);
        if (this.J1 == null) {
            if (!Q2(q1bVar)) {
                throw new IllegalStateException();
            }
            if (this.K1 == null) {
                this.K1 = PlaceholderSurface.m7507c(this.v1, q1bVar.f41094g);
            }
            this.J1 = this.K1;
        }
        x2(mediaFormatO2);
        zui zuiVar = this.G1;
        return m1b.C15198a.m38180b(q1bVar, mediaFormatO2, c2181a, zuiVar != null ? zuiVar.mo53147p() : this.J1, mediaCrypto);
    }

    public void U2(long j) {
        this.q1.m57333a(j);
        this.S1 += j;
        this.T1++;
    }

    @Override // p001o.x1b, androidx.media3.exoplayer.AbstractC2193c
    /* renamed from: Z */
    public void mo6887Z() {
        this.W1 = null;
        zui zuiVar = this.G1;
        if (zuiVar != null) {
            zuiVar.mo53149r();
        } else {
            this.B1.m34546g();
        }
        y2();
        this.M1 = false;
        this.a2 = null;
        try {
            super.mo6887Z();
        } finally {
            this.y1.m58349m(this.q1);
            this.y1.m58346D(bvi.f16878e);
        }
    }

    @Override // p001o.x1b
    public void Z0(a85 a85Var) {
        if (this.F1) {
            ByteBuffer byteBuffer = (ByteBuffer) op0.m42515e(a85Var.f14285g);
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4) {
                    if (b3 == 0 || b3 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        I2((m1b) op0.m42515e(L0()), bArr);
                    }
                }
            }
        }
    }

    @Override // p001o.x1b, androidx.media3.exoplayer.AbstractC2193c
    public void a0(boolean z, boolean z2) {
        super.a0(z, z2);
        boolean z3 = m6880S().f36979b;
        op0.m42517g((z3 && this.Z1 == 0) ? false : true);
        if (this.Y1 != z3) {
            this.Y1 = z3;
            C1();
        }
        this.y1.m58351o(this.q1);
        if (!this.H1) {
            if ((this.I1 != null || !this.x1) && this.G1 == null) {
                avi aviVarM53117e = this.w1;
                if (aviVarM53117e == null) {
                    aviVarM53117e = new vo3.C17634b(this.v1, this.B1).m53118f(m6879R()).m53117e();
                }
                this.G1 = aviVarM53117e.mo17885b();
            }
            this.H1 = true;
        }
        zui zuiVar = this.G1;
        if (zuiVar == null) {
            this.B1.m34554o(m6879R());
            this.B1.m34547h(z2);
            return;
        }
        zuiVar.mo53151t(new C14959a(), bmb.m19375a());
        gui guiVar = this.b2;
        if (guiVar != null) {
            this.G1.mo53136d(guiVar);
        }
        if (this.J1 != null && !this.L1.equals(fvf.f24165c)) {
            this.G1.mo53152u(this.J1, this.L1);
        }
        this.G1.mo53141i(X0());
        List list = this.I1;
        if (list != null) {
            this.G1.mo53140h(list);
        }
        this.G1.mo53146o(z2);
    }

    @Override // p001o.x1b, androidx.media3.exoplayer.InterfaceC2218o
    /* renamed from: b */
    public boolean mo7429b() {
        zui zuiVar;
        return super.mo7429b() && ((zuiVar = this.G1) == null || zuiVar.mo53134b());
    }

    @Override // androidx.media3.exoplayer.AbstractC2193c
    public void b0() {
        super.b0();
    }

    @Override // androidx.media3.exoplayer.InterfaceC2218o
    /* renamed from: c */
    public void mo7430c() {
        zui zuiVar = this.G1;
        if (zuiVar != null) {
            zuiVar.mo53135c();
        } else {
            this.B1.m34540a();
        }
    }

    @Override // p001o.x1b, androidx.media3.exoplayer.AbstractC2193c
    public void c0(long j, boolean z) throws MediaCryptoException, qm6 {
        zui zuiVar = this.G1;
        if (zuiVar != null) {
            zuiVar.mo53153v(true);
            this.G1.mo53143k(V0(), h2());
        }
        super.c0(j, z);
        if (this.G1 == null) {
            this.B1.m34552m();
        }
        if (z) {
            this.B1.m34544e(false);
        }
        y2();
        this.Q1 = 0;
    }

    public boolean c2(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (l2b.class) {
            if (!d2) {
                e2 = g2();
                d2 = true;
            }
        }
        return e2;
    }

    @Override // androidx.media3.exoplayer.AbstractC2193c
    public void d0() {
        super.d0();
        zui zuiVar = this.G1;
        if (zuiVar == null || !this.x1) {
            return;
        }
        zuiVar.release();
    }

    @Override // p001o.x1b, androidx.media3.exoplayer.AbstractC2193c
    public void f0() {
        try {
            super.f0();
        } finally {
            this.H1 = false;
            if (this.K1 != null) {
                E2();
            }
        }
    }

    public void f2(m1b m1bVar, int i, long j) {
        gth.m29480a("dropVideoBuffer");
        m1bVar.mo23731n(i, false);
        gth.m29481b();
        T2(0, 1);
    }

    @Override // p001o.x1b, androidx.media3.exoplayer.InterfaceC2218o
    /* renamed from: g */
    public void mo7431g(long j, long j2) throws MediaCryptoException, qm6 {
        super.mo7431g(j, j2);
        zui zuiVar = this.G1;
        if (zuiVar != null) {
            try {
                zuiVar.mo53139g(j, j2);
            } catch (zui.C18714b e) {
                throw m6877P(e, e.f57734a, 7001);
            }
        }
    }

    @Override // p001o.x1b, androidx.media3.exoplayer.AbstractC2193c
    public void g0() {
        super.g0();
        this.P1 = 0;
        this.O1 = m6879R().elapsedRealtime();
        this.S1 = 0L;
        this.T1 = 0;
        zui zuiVar = this.G1;
        if (zuiVar != null) {
            zuiVar.mo53148q();
        } else {
            this.B1.m34550k();
        }
    }

    @Override // androidx.media3.exoplayer.InterfaceC2218o, androidx.media3.exoplayer.InterfaceC2221p
    public String getName() {
        return "MediaCodecVideoRenderer";
    }

    @Override // p001o.x1b, androidx.media3.exoplayer.AbstractC2193c
    public void h0() {
        q2();
        s2();
        zui zuiVar = this.G1;
        if (zuiVar != null) {
            zuiVar.mo53138f();
        } else {
            this.B1.m34551l();
        }
        super.h0();
    }

    public long h2() {
        return 0L;
    }

    @Override // p001o.x1b, androidx.media3.exoplayer.InterfaceC2218o
    public boolean isReady() {
        PlaceholderSurface placeholderSurface;
        zui zuiVar;
        boolean z = super.isReady() && ((zuiVar = this.G1) == null || zuiVar.isReady());
        if (z && (((placeholderSurface = this.K1) != null && this.J1 == placeholderSurface) || L0() == null || this.Y1)) {
            return true;
        }
        return this.B1.m34543d(z);
    }

    public C14961c k2(q1b q1bVar, C2181a c2181a, C2181a[] c2181aArr) {
        int iI2;
        int iMax = c2181a.f7949t;
        int iMax2 = c2181a.f7950u;
        int iM2 = m2(q1bVar, c2181a);
        if (c2181aArr.length == 1) {
            if (iM2 != -1 && (iI2 = i2(q1bVar, c2181a)) != -1) {
                iM2 = Math.min((int) (iM2 * 1.5f), iI2);
            }
            return new C14961c(iMax, iMax2, iM2);
        }
        int length = c2181aArr.length;
        boolean z = false;
        for (int i = 0; i < length; i++) {
            C2181a c2181aM6748K = c2181aArr[i];
            if (c2181a.f7918A != null && c2181aM6748K.f7918A == null) {
                c2181aM6748K = c2181aM6748K.m6707a().m6753P(c2181a.f7918A).m6748K();
            }
            if (q1bVar.m44690e(c2181a, c2181aM6748K).f17499d != 0) {
                int i2 = c2181aM6748K.f7949t;
                z |= i2 == -1 || c2181aM6748K.f7950u == -1;
                iMax = Math.max(iMax, i2);
                iMax2 = Math.max(iMax2, c2181aM6748K.f7950u);
                iM2 = Math.max(iM2, m2(q1bVar, c2181aM6748K));
            }
        }
        if (z) {
            ria.m46824h("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
            Point pointJ2 = j2(q1bVar, c2181a);
            if (pointJ2 != null) {
                iMax = Math.max(iMax, pointJ2.x);
                iMax2 = Math.max(iMax2, pointJ2.y);
                iM2 = Math.max(iM2, i2(q1bVar, c2181a.m6707a().v0(iMax).m6762Y(iMax2).m6748K()));
                ria.m46824h("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
            }
        }
        return new C14961c(iMax, iMax2, iM2);
    }

    @Override // p001o.x1b
    public void n1(Exception exc) {
        ria.m46820d("MediaCodecVideoRenderer", "Video codec error", exc);
        this.y1.m58345C(exc);
    }

    @Override // p001o.x1b
    public void o1(String str, m1b.C15198a c15198a, long j, long j2) {
        this.y1.m58347k(str, j, j2);
        this.E1 = c2(str);
        this.F1 = ((q1b) op0.m42515e(N0())).m44697n();
        y2();
    }

    public MediaFormat o2(C2181a c2181a, String str, C14961c c14961c, float f, boolean z, int i) {
        Pair pairM33134r;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", c2181a.f7949t);
        mediaFormat.setInteger("height", c2181a.f7950u);
        p2b.m42882e(mediaFormat, c2181a.f7946q);
        p2b.m42880c(mediaFormat, "frame-rate", c2181a.f7951v);
        p2b.m42881d(mediaFormat, "rotation-degrees", c2181a.f7952w);
        p2b.m42879b(mediaFormat, c2181a.f7918A);
        if ("video/dolby-vision".equals(c2181a.f7943n) && (pairM33134r = j2b.m33134r(c2181a)) != null) {
            p2b.m42881d(mediaFormat, Scopes.PROFILE, ((Integer) pairM33134r.first).intValue());
        }
        mediaFormat.setInteger("max-width", c14961c.f33011a);
        mediaFormat.setInteger("max-height", c14961c.f33012b);
        p2b.m42881d(mediaFormat, "max-input-size", c14961c.f33013c);
        int i2 = sqi.f45790a;
        if (i2 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (z) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i != 0) {
            d2(mediaFormat, i);
        }
        if (i2 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.X1));
        }
        return mediaFormat;
    }

    @Override // p001o.x1b
    public void p1(String str) {
        this.y1.m58348l(str);
    }

    public boolean p2(long j, boolean z) throws MediaCryptoException, qm6 {
        int iM0 = m0(j);
        if (iM0 == 0) {
            return false;
        }
        if (z) {
            y75 y75Var = this.q1;
            y75Var.f55016d += iM0;
            y75Var.f55018f += this.R1;
        } else {
            this.q1.f55022j++;
            T2(iM0, this.R1);
        }
        I0();
        zui zuiVar = this.G1;
        if (zuiVar != null) {
            zuiVar.mo53153v(false);
        }
        return true;
    }

    @Override // p001o.x1b
    public c85 q0(q1b q1bVar, C2181a c2181a, C2181a c2181a2) {
        c85 c85VarM44690e = q1bVar.m44690e(c2181a, c2181a2);
        int i = c85VarM44690e.f17500e;
        C14961c c14961c = (C14961c) op0.m42515e(this.D1);
        if (c2181a2.f7949t > c14961c.f33011a || c2181a2.f7950u > c14961c.f33012b) {
            i |= 256;
        }
        if (m2(q1bVar, c2181a2) > c14961c.f33013c) {
            i |= 64;
        }
        int i2 = i;
        return new c85(q1bVar.f41088a, c2181a, c2181a2, i2 != 0 ? 0 : c85VarM44690e.f17499d, i2);
    }

    @Override // p001o.x1b
    public c85 q1(if7 if7Var) throws qm6 {
        c85 c85VarQ1 = super.q1(if7Var);
        this.y1.m58352p((C2181a) op0.m42515e(if7Var.f28594b), c85VarQ1);
        return c85VarQ1;
    }

    public final void q2() {
        if (this.P1 > 0) {
            long jElapsedRealtime = m6879R().elapsedRealtime();
            this.y1.m58350n(this.P1, jElapsedRealtime - this.O1);
            this.P1 = 0;
            this.O1 = jElapsedRealtime;
        }
    }

    @Override // p001o.x1b
    public void r1(C2181a c2181a, MediaFormat mediaFormat) {
        int integer;
        int i;
        m1b m1bVarL0 = L0();
        if (m1bVarL0 != null) {
            m1bVarL0.mo23723f(this.N1);
        }
        int i2 = 0;
        if (this.Y1) {
            i = c2181a.f7949t;
            integer = c2181a.f7950u;
        } else {
            op0.m42515e(mediaFormat);
            boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i = integer2;
        }
        float f = c2181a.f7953x;
        if (b2()) {
            int i3 = c2181a.f7952w;
            if (i3 == 90 || i3 == 270) {
                f = 1.0f / f;
                int i4 = integer;
                integer = i;
                i = i4;
            }
        } else if (this.G1 == null) {
            i2 = c2181a.f7952w;
        }
        this.V1 = new bvi(i, integer, i2, f);
        if (this.G1 == null) {
            this.B1.m34555p(c2181a.f7951v);
        } else {
            D2();
            this.G1.mo53142j(1, c2181a.m6707a().v0(i).m6762Y(integer).n0(i2).k0(f).m6748K());
        }
    }

    public final void r2() {
        if (!this.B1.m34548i() || this.J1 == null) {
            return;
        }
        A2();
    }

    public final void s2() {
        int i = this.T1;
        if (i != 0) {
            this.y1.m58344B(this.S1, i);
            this.S1 = 0L;
            this.T1 = 0;
        }
    }

    @Override // p001o.x1b
    public void t1(long j) {
        super.t1(j);
        if (this.Y1) {
            return;
        }
        this.R1--;
    }

    public final void t2(bvi bviVar) {
        if (bviVar.equals(bvi.f16878e) || bviVar.equals(this.W1)) {
            return;
        }
        this.W1 = bviVar;
        this.y1.m58346D(bviVar);
    }

    @Override // p001o.x1b, androidx.media3.exoplayer.AbstractC2193c, androidx.media3.exoplayer.C2217n.b
    /* renamed from: u */
    public void mo6894u(int i, Object obj) throws qm6 {
        if (i == 1) {
            J2(obj);
            return;
        }
        if (i == 7) {
            gui guiVar = (gui) op0.m42515e(obj);
            this.b2 = guiVar;
            zui zuiVar = this.G1;
            if (zuiVar != null) {
                zuiVar.mo53136d(guiVar);
                return;
            }
            return;
        }
        if (i == 10) {
            int iIntValue = ((Integer) op0.m42515e(obj)).intValue();
            if (this.Z1 != iIntValue) {
                this.Z1 = iIntValue;
                if (this.Y1) {
                    C1();
                    return;
                }
                return;
            }
            return;
        }
        if (i == 16) {
            this.X1 = ((Integer) op0.m42515e(obj)).intValue();
            S2();
            return;
        }
        if (i == 4) {
            this.N1 = ((Integer) op0.m42515e(obj)).intValue();
            m1b m1bVarL0 = L0();
            if (m1bVarL0 != null) {
                m1bVarL0.mo23723f(this.N1);
                return;
            }
            return;
        }
        if (i == 5) {
            this.B1.m34553n(((Integer) op0.m42515e(obj)).intValue());
            return;
        }
        if (i == 13) {
            L2((List) op0.m42515e(obj));
            return;
        }
        if (i != 14) {
            super.mo6894u(i, obj);
            return;
        }
        fvf fvfVar = (fvf) op0.m42515e(obj);
        if (fvfVar.m27575b() == 0 || fvfVar.m27574a() == 0) {
            return;
        }
        this.L1 = fvfVar;
        zui zuiVar2 = this.G1;
        if (zuiVar2 != null) {
            zuiVar2.mo53152u((Surface) op0.m42519i(this.J1), fvfVar);
        }
    }

    @Override // p001o.x1b
    public void u1() {
        super.u1();
        zui zuiVar = this.G1;
        if (zuiVar != null) {
            zuiVar.mo53143k(V0(), h2());
        } else {
            this.B1.m34549j();
        }
        y2();
    }

    public final boolean u2(m1b m1bVar, int i, long j, C2181a c2181a) throws InterruptedException {
        long jM34565g = this.C1.m34565g();
        long jM34564f = this.C1.m34564f();
        if (sqi.f45790a >= 21) {
            if (P2() && jM34565g == this.U1) {
                R2(m1bVar, i, j);
            } else {
                z2(j, jM34565g, c2181a);
                H2(m1bVar, i, j, jM34565g);
            }
            U2(jM34564f);
            this.U1 = jM34565g;
            return true;
        }
        if (jM34564f >= 30000) {
            return false;
        }
        if (jM34564f > 11000) {
            try {
                Thread.sleep((jM34564f - 10000) / 1000);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return false;
            }
        }
        z2(j, jM34565g, c2181a);
        F2(m1bVar, i, j);
        U2(jM34564f);
        return true;
    }

    @Override // p001o.x1b
    public void v1(a85 a85Var) {
        boolean z = this.Y1;
        if (!z) {
            this.R1++;
        }
        if (sqi.f45790a >= 23 || !z) {
            return;
        }
        B2(a85Var.f14284f);
    }

    public final void v2() {
        Surface surface = this.J1;
        if (surface == null || !this.M1) {
            return;
        }
        this.y1.m58343A(surface);
    }

    @Override // p001o.x1b
    public void w1(C2181a c2181a) throws qm6 {
        zui zuiVar = this.G1;
        if (zuiVar == null || zuiVar.isInitialized()) {
            return;
        }
        try {
            this.G1.mo53145n(c2181a);
        } catch (zui.C18714b e) {
            throw m6877P(e, c2181a, 7000);
        }
    }

    public final void w2() {
        bvi bviVar = this.W1;
        if (bviVar != null) {
            this.y1.m58346D(bviVar);
        }
    }

    @Override // p001o.jui.InterfaceC14668b
    /* renamed from: x */
    public boolean mo34568x(long j, long j2) {
        return O2(j, j2);
    }

    public final void x2(MediaFormat mediaFormat) {
        zui zuiVar = this.G1;
        if (zuiVar == null || zuiVar.mo53144m()) {
            return;
        }
        mediaFormat.setInteger("allow-frame-drop", 0);
    }

    @Override // p001o.x1b
    public boolean y1(long j, long j2, m1b m1bVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C2181a c2181a) throws qm6 {
        op0.m42515e(m1bVar);
        long jV0 = j3 - V0();
        int iM34542c = this.B1.m34542c(j3, j, j2, W0(), z2, this.C1);
        if (iM34542c == 4) {
            return false;
        }
        if (z && !z2) {
            R2(m1bVar, i, jV0);
            return true;
        }
        if (this.J1 == this.K1 && this.G1 == null) {
            if (this.C1.m34564f() >= 30000) {
                return false;
            }
            R2(m1bVar, i, jV0);
            U2(this.C1.m34564f());
            return true;
        }
        zui zuiVar = this.G1;
        if (zuiVar != null) {
            try {
                zuiVar.mo53139g(j, j2);
                long jMo53137e = this.G1.mo53137e(j3 + h2(), z2);
                if (jMo53137e == -9223372036854775807L) {
                    return false;
                }
                G2(m1bVar, i, jV0, jMo53137e);
                return true;
            } catch (zui.C18714b e) {
                throw m6877P(e, e.f57734a, 7001);
            }
        }
        if (iM34542c == 0) {
            long jNanoTime = m6879R().nanoTime();
            z2(jV0, jNanoTime, c2181a);
            G2(m1bVar, i, jV0, jNanoTime);
            U2(this.C1.m34564f());
            return true;
        }
        if (iM34542c == 1) {
            return u2((m1b) op0.m42519i(m1bVar), i, jV0, c2181a);
        }
        if (iM34542c == 2) {
            f2(m1bVar, i, jV0);
            U2(this.C1.m34564f());
            return true;
        }
        if (iM34542c != 3) {
            if (iM34542c == 5) {
                return false;
            }
            throw new IllegalStateException(String.valueOf(iM34542c));
        }
        R2(m1bVar, i, jV0);
        U2(this.C1.m34564f());
        return true;
    }

    public final void y2() {
        int i;
        m1b m1bVarL0;
        if (!this.Y1 || (i = sqi.f45790a) < 23 || (m1bVarL0 = L0()) == null) {
            return;
        }
        this.a2 = new C14962d(m1bVarL0);
        if (i >= 33) {
            Bundle bundle = new Bundle();
            bundle.putInt("tunnel-peek", 1);
            m1bVarL0.mo23719b(bundle);
        }
    }

    @Override // p001o.jui.InterfaceC14668b
    /* renamed from: z */
    public boolean mo34569z(long j, long j2, long j3, boolean z, boolean z2) {
        return M2(j, j3, z) && p2(j2, z2);
    }

    @Override // p001o.x1b
    public p1b z0(Throwable th, q1b q1bVar) {
        return new k2b(th, q1bVar, this.J1);
    }

    public final void z2(long j, long j2, C2181a c2181a) {
        gui guiVar = this.b2;
        if (guiVar != null) {
            guiVar.mo7199e(j, j2, c2181a, Q0());
        }
    }

    public l2b(Context context, m1b.InterfaceC15199b interfaceC15199b, a2b a2bVar, long j, boolean z, Handler handler, yui yuiVar, int i, float f) {
        this(context, interfaceC15199b, a2bVar, j, z, handler, yuiVar, i, f, null);
    }

    public l2b(Context context, m1b.InterfaceC15199b interfaceC15199b, a2b a2bVar, long j, boolean z, Handler handler, yui yuiVar, int i, float f, avi aviVar) {
        super(2, interfaceC15199b, a2bVar, z, f);
        Context applicationContext = context.getApplicationContext();
        this.v1 = applicationContext;
        this.z1 = i;
        this.w1 = aviVar;
        this.y1 = new yui.C18499a(handler, yuiVar);
        this.x1 = aviVar == null;
        if (aviVar == null) {
            this.B1 = new jui(applicationContext, this, j);
        } else {
            this.B1 = aviVar.mo17884a();
        }
        this.C1 = new jui.C14667a();
        this.A1 = e2();
        this.L1 = fvf.f24165c;
        this.N1 = 1;
        this.V1 = bvi.f16878e;
        this.Z1 = 0;
        this.W1 = null;
        this.X1 = -1000;
    }
}
