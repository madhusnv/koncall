package rn;

import aw.C0481u;
import ex.InterfaceC2141e;
import java.util.List;
import kn.C4121a;
import kotlin.jvm.internal.C4166x;
import kotlin.jvm.internal.C4168z;
import mm.C4791b;
import tx.C7251k;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;
import wx.k1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rn.s */
/* loaded from: classes3.dex */
public final class C6590s extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public String f31647a;

    /* renamed from: b */
    public C4121a f31648b;

    /* renamed from: c */
    public Exception f31649c;

    /* renamed from: d */
    public C4791b f31650d;

    /* renamed from: e */
    public int f31651e;

    /* renamed from: f */
    public int f31652f;

    /* renamed from: g */
    public int f31653g;

    /* renamed from: h */
    public /* synthetic */ Object f31654h;

    /* renamed from: j */
    public final /* synthetic */ h0 f31655j;

    /* renamed from: k */
    public final /* synthetic */ C0481u f31656k;

    /* renamed from: l */
    public final /* synthetic */ C4166x f31657l;

    /* renamed from: m */
    public final /* synthetic */ C4168z f31658m;

    /* renamed from: n */
    public final /* synthetic */ k1 f31659n;

    /* renamed from: p */
    public final /* synthetic */ C4166x f31660p;

    /* renamed from: q */
    public final /* synthetic */ C4166x f31661q;

    /* renamed from: r */
    public final /* synthetic */ C7251k f31662r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6590s(h0 h0Var, C0481u c0481u, C4166x c4166x, C4168z c4168z, k1 k1Var, C4166x c4166x2, C4166x c4166x3, C7251k c7251k, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f31655j = h0Var;
        this.f31656k = c0481u;
        this.f31657l = c4166x;
        this.f31658m = c4168z;
        this.f31659n = k1Var;
        this.f31660p = c4166x2;
        this.f31661q = c4166x3;
        this.f31662r = c7251k;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        C6590s c6590s = new C6590s(this.f31655j, this.f31656k, this.f31657l, this.f31658m, this.f31659n, this.f31660p, this.f31661q, this.f31662r, interfaceC7559c);
        c6590s.f31654h = obj;
        return c6590s;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        return ((C6590s) create((List) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:30|31|335|32|33|320|34|(2:50|(4:202|346|203|204))(1:38)|344|52|(7:348|54|(4:56|57|350|58)|77|(19:91|(1:93)|94|(2:96|(18:98|99|(2:108|(3:116|(3:120|(7:326|122|324|123|124|333|125)(2:136|(21:142|(2:149|(2:159|(18:161|162|163|(2:165|166)(1:166)|194|195|31|335|32|33|320|34|(1:36)|50|(0)|344|52|(0))(4:167|168|(6:172|(1:174)(1:175)|176|(1:178)|179|(1:181))(1:170)|171))(5:151|152|(1:154)(1:155)|156|(1:158)))(3:144|(1:146)(1:147)|148)|182|183|257|258|(1:260)(1:261)|262|(1:264)|265|266|316|267|(2:270|302)(2:271|(1:273)(2:276|(1:278)(2:279|(1:281)(2:282|(4:284|(1:286)(3:287|(3:290|(2:358|292)(1:359)|288)|357)|293|(1:295)(2:296|(2:297|(2:299|(2:355|301)(1:356)))))))))|315|305|306|318|307|312|313)(3:138|(1:140)|141))|126)(1:118)|119)(2:110|(1:115)(1:114)))(2:101|(1:106)(1:105))|107|182|183|257|258|(0)(0)|262|(0)|265|266|316|267|(7:270|302|315|305|306|318|307)(0)|312|313)(2:184|(4:186|(17:189|330|190|194|195|31|335|32|33|320|34|(0)|50|(0)|344|52|(0))|188|360)(1:191)))(1:192)|193|194|195|31|335|32|33|320|34|(0)|50|(0)|344|52|(0))(4:79|(1:85)(2:81|(1:83)(1:84))|86|(15:89|90|195|31|335|32|33|320|34|(0)|50|(0)|344|52|(0)))|88|253)|76|77|(0)(0)|88|253) */
    /* JADX WARN: Can't wrap try/catch for region: R(18:98|99|(2:108|(3:116|(3:120|(7:326|122|324|123|124|333|125)(2:136|(21:142|(2:149|(2:159|(18:161|162|163|(2:165|166)(1:166)|194|195|31|335|32|33|320|34|(1:36)|50|(0)|344|52|(0))(4:167|168|(6:172|(1:174)(1:175)|176|(1:178)|179|(1:181))(1:170)|171))(5:151|152|(1:154)(1:155)|156|(1:158)))(3:144|(1:146)(1:147)|148)|182|183|257|258|(1:260)(1:261)|262|(1:264)|265|266|316|267|(2:270|302)(2:271|(1:273)(2:276|(1:278)(2:279|(1:281)(2:282|(4:284|(1:286)(3:287|(3:290|(2:358|292)(1:359)|288)|357)|293|(1:295)(2:296|(2:297|(2:299|(2:355|301)(1:356)))))))))|315|305|306|318|307|312|313)(3:138|(1:140)|141))|126)(1:118)|119)(2:110|(1:115)(1:114)))(2:101|(1:106)(1:105))|107|182|183|257|258|(0)(0)|262|(0)|265|266|316|267|(7:270|302|315|305|306|318|307)(0)|312|313) */
    /* JADX WARN: Can't wrap try/catch for region: R(4:56|57|350|58) */
    /* JADX WARN: Can't wrap try/catch for region: R(7:326|122|324|123|124|333|125) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:335|32|33|320|34|(2:50|(4:202|346|203|204))(1:38)|344|52) */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0598, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x059a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x059b, code lost:
    
        r9 = r40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x059d, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x05a1, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x05a2, code lost:
    
        r40 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0930, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0931, code lost:
    
        r8 = r3;
        r2 = r13;
        r40 = r14;
        r13 = r11;
        r11 = r2;
        r2 = r27;
        r27 = r13;
        r18 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0951, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0952, code lost:
    
        r8 = r3;
        r2 = r13;
        r40 = r14;
        r18 = r37;
        r10 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0b4b, code lost:
    
        r2 = r5;
        r5 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0bbe, code lost:
    
        r54 = r5;
        r5 = r0;
        r0 = r54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0cf0, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x0e5f, code lost:
    
        r10.f31531m.m16234i("Upload >>> final exception", r0);
        r0.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x091a, code lost:
    
        r11.m12616i(">>> LongException:  may not have a space for callLogdateTime:=" + r12.m8893b().m9713b().m9720b() + r10 + r12.m8893b().m9713b().f23846c + ",\nspace is:=" + r8 + " >>> callRecordCompressedSize :=\n" + r12.f21061h, null);
        r39 = r10;
        r4 = r18;
        r9 = r35;
        r14 = r36;
        r10 = r37;
        r3 = r38;
        r2 = r41;
        r8 = r42;
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:?, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:?, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0282, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0283, code lost:
    
        r8 = r3;
        r2 = r13;
        r40 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0287, code lost:
    
        r9 = r35;
        r14 = r36;
        r10 = r37;
        r3 = r38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0291, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0292, code lost:
    
        r8 = r3;
        r40 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0295, code lost:
    
        r2 = r27;
        r10 = r28;
        r14 = r30;
        r9 = r32;
        r18 = r37;
        r27 = r11;
        r11 = r13;
        r37 = r15;
        r15 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x02aa, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x02ab, code lost:
    
        r8 = r3;
        r10 = r11;
        r11 = r13;
        r40 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x02b0, code lost:
    
        r19 = r27;
        r14 = r30;
        r13 = r34;
        r18 = r37;
        r37 = r15;
        r15 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0312, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0313, code lost:
    
        r8 = r3;
        r2 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0317, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0318, code lost:
    
        r8 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x031b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x031c, code lost:
    
        r8 = r3;
        r10 = r11;
        r11 = r13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:344:0x02ce, B:202:0x096e], limit reached: 358 */
    /* JADX WARN: Path cross not found for [B:348:0x02d4, B:76:0x0330], limit reached: 358 */
    /* JADX WARN: Path cross not found for [B:36:0x0264, B:50:0x02be], limit reached: 358 */
    /* JADX WARN: Path cross not found for [B:50:0x02be, B:36:0x0264], limit reached: 358 */
    /* JADX WARN: Path cross not found for [B:76:0x0330, B:348:0x02d4], limit reached: 358 */
    /* JADX WARN: Removed duplicated region for block: B:192:0x08c0 A[Catch: Exception -> 0x030e, TRY_LEAVE, TryCatch #17 {Exception -> 0x030e, blocks: (B:190:0x0868, B:58:0x02ec, B:77:0x0332, B:79:0x0338, B:83:0x0348, B:86:0x0365, B:90:0x0397, B:84:0x0352, B:85:0x035c, B:91:0x03ca, B:94:0x03e3, B:96:0x03e7, B:98:0x0406, B:101:0x041b, B:103:0x0443, B:105:0x044f, B:106:0x0459, B:108:0x047b, B:110:0x047f, B:112:0x04a7, B:114:0x04b3, B:115:0x04bd, B:116:0x04da, B:118:0x04de, B:120:0x0531, B:163:0x06bf, B:165:0x071f, B:166:0x0728, B:167:0x077d, B:170:0x078b, B:172:0x07bd, B:174:0x07c6, B:176:0x07d0, B:178:0x07f2, B:179:0x080c, B:181:0x0818, B:184:0x0829, B:186:0x083b, B:192:0x08c0, B:203:0x097a, B:204:0x097f), top: B:330:0x0868 }] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x096e  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x09f4  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x09f6  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0acc  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0ace  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0b49  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0b4b  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0bbe  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0c46 A[Catch: Exception -> 0x0b88, TRY_ENTER, TryCatch #26 {Exception -> 0x0b88, blocks: (B:257:0x0bf8, B:260:0x0c46, B:262:0x0c57, B:264:0x0c79, B:265:0x0c88, B:305:0x0e6b, B:304:0x0e5f, B:241:0x0b43, B:245:0x0b4d, B:251:0x0b90, B:255:0x0bc3, B:256:0x0bd4, B:267:0x0ca4, B:271:0x0cb0, B:273:0x0cb4, B:276:0x0cf3, B:278:0x0cf9, B:279:0x0d35, B:281:0x0d3f, B:282:0x0d73, B:284:0x0d7b, B:293:0x0dcf, B:296:0x0dd7, B:297:0x0ddb, B:299:0x0de1, B:301:0x0df3, B:287:0x0d82, B:288:0x0d86, B:290:0x0d8c, B:292:0x0d9e, B:302:0x0e26, B:32:0x01e6), top: B:339:0x0048, inners: #0, #21 }] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0c56  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0c79 A[Catch: Exception -> 0x0b88, TryCatch #26 {Exception -> 0x0b88, blocks: (B:257:0x0bf8, B:260:0x0c46, B:262:0x0c57, B:264:0x0c79, B:265:0x0c88, B:305:0x0e6b, B:304:0x0e5f, B:241:0x0b43, B:245:0x0b4d, B:251:0x0b90, B:255:0x0bc3, B:256:0x0bd4, B:267:0x0ca4, B:271:0x0cb0, B:273:0x0cb4, B:276:0x0cf3, B:278:0x0cf9, B:279:0x0d35, B:281:0x0d3f, B:282:0x0d73, B:284:0x0d7b, B:293:0x0dcf, B:296:0x0dd7, B:297:0x0ddb, B:299:0x0de1, B:301:0x0df3, B:287:0x0d82, B:288:0x0d86, B:290:0x0d8c, B:292:0x0d9e, B:302:0x0e26, B:32:0x01e6), top: B:339:0x0048, inners: #0, #21 }] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0cac  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x02d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:363:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0264 A[Catch: Exception -> 0x0083, FileNotFoundException -> 0x0282, SecurityException -> 0x0291, NullPointerException -> 0x02aa, TRY_ENTER, TryCatch #19 {FileNotFoundException -> 0x0282, blocks: (B:34:0x0260, B:36:0x0264, B:38:0x026e, B:52:0x02ce, B:50:0x02be), top: B:320:0x0260 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0338 A[Catch: Exception -> 0x030e, TryCatch #17 {Exception -> 0x030e, blocks: (B:190:0x0868, B:58:0x02ec, B:77:0x0332, B:79:0x0338, B:83:0x0348, B:86:0x0365, B:90:0x0397, B:84:0x0352, B:85:0x035c, B:91:0x03ca, B:94:0x03e3, B:96:0x03e7, B:98:0x0406, B:101:0x041b, B:103:0x0443, B:105:0x044f, B:106:0x0459, B:108:0x047b, B:110:0x047f, B:112:0x04a7, B:114:0x04b3, B:115:0x04bd, B:116:0x04da, B:118:0x04de, B:120:0x0531, B:163:0x06bf, B:165:0x071f, B:166:0x0728, B:167:0x077d, B:170:0x078b, B:172:0x07bd, B:174:0x07c6, B:176:0x07d0, B:178:0x07f2, B:179:0x080c, B:181:0x0818, B:184:0x0829, B:186:0x083b, B:192:0x08c0, B:203:0x097a, B:204:0x097f), top: B:330:0x0868 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03ca A[Catch: Exception -> 0x030e, TryCatch #17 {Exception -> 0x030e, blocks: (B:190:0x0868, B:58:0x02ec, B:77:0x0332, B:79:0x0338, B:83:0x0348, B:86:0x0365, B:90:0x0397, B:84:0x0352, B:85:0x035c, B:91:0x03ca, B:94:0x03e3, B:96:0x03e7, B:98:0x0406, B:101:0x041b, B:103:0x0443, B:105:0x044f, B:106:0x0459, B:108:0x047b, B:110:0x047f, B:112:0x04a7, B:114:0x04b3, B:115:0x04bd, B:116:0x04da, B:118:0x04de, B:120:0x0531, B:163:0x06bf, B:165:0x071f, B:166:0x0728, B:167:0x077d, B:170:0x078b, B:172:0x07bd, B:174:0x07c6, B:176:0x07d0, B:178:0x07f2, B:179:0x080c, B:181:0x0818, B:184:0x0829, B:186:0x083b, B:192:0x08c0, B:203:0x097a, B:204:0x097f), top: B:330:0x0868 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03e7 A[Catch: Exception -> 0x030e, TryCatch #17 {Exception -> 0x030e, blocks: (B:190:0x0868, B:58:0x02ec, B:77:0x0332, B:79:0x0338, B:83:0x0348, B:86:0x0365, B:90:0x0397, B:84:0x0352, B:85:0x035c, B:91:0x03ca, B:94:0x03e3, B:96:0x03e7, B:98:0x0406, B:101:0x041b, B:103:0x0443, B:105:0x044f, B:106:0x0459, B:108:0x047b, B:110:0x047f, B:112:0x04a7, B:114:0x04b3, B:115:0x04bd, B:116:0x04da, B:118:0x04de, B:120:0x0531, B:163:0x06bf, B:165:0x071f, B:166:0x0728, B:167:0x077d, B:170:0x078b, B:172:0x07bd, B:174:0x07c6, B:176:0x07d0, B:178:0x07f2, B:179:0x080c, B:181:0x0818, B:184:0x0829, B:186:0x083b, B:192:0x08c0, B:203:0x097a, B:204:0x097f), top: B:330:0x0868 }] */
    /* JADX WARN: Type inference failed for: r10v1, types: [kotlin.jvm.internal.x] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23, types: [rn.h0] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r10v37 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v42 */
    /* JADX WARN: Type inference failed for: r10v5, types: [rn.h0] */
    /* JADX WARN: Type inference failed for: r10v59 */
    /* JADX WARN: Type inference failed for: r10v62 */
    /* JADX WARN: Type inference failed for: r10v63 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:189:0x0862 -> B:330:0x0868). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:193:0x0918 -> B:194:0x091a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:238:0x0af5 -> B:31:0x01e4). Please report as a decompilation issue!!! */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r56) throws java.io.FileNotFoundException {
        /*
            Method dump skipped, instructions count: 3764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rn.C6590s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
