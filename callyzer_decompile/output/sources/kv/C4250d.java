package kv;

import com.websoptimization.callyzerbiz.data.model.request.AddDeviceRequest;
import d7.w0;
import ex.InterfaceC2141e;
import im.i1;
import java.util.Iterator;
import java.util.List;
import qw.a0;
import rv.AbstractC6650z;
import rv.p0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kv.d */
/* loaded from: classes3.dex */
public final class C4250d extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f21589a = 0;

    /* renamed from: b */
    public List f21590b;

    /* renamed from: c */
    public Iterator f21591c;

    /* renamed from: d */
    public AddDeviceRequest f21592d;

    /* renamed from: e */
    public i1 f21593e;

    /* renamed from: f */
    public int f21594f;

    /* renamed from: g */
    public int f21595g;

    /* renamed from: h */
    public int f21596h;

    /* renamed from: j */
    public int f21597j;

    /* renamed from: k */
    public Object f21598k;

    /* renamed from: l */
    public w0 f21599l;

    /* renamed from: m */
    public final /* synthetic */ Object f21600m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4250d(List list, C4252f c4252f, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f21598k = list;
        this.f21600m = c4252f;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f21589a) {
            case 0:
                return new C4250d((List) this.f21598k, (C4252f) this.f21600m, interfaceC7559c);
            default:
                return new C4250d((p0) this.f21599l, (AbstractC6650z) this.f21600m, interfaceC7559c);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f21589a) {
        }
        return ((C4250d) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:227|228|400|229|230|231|408|232|233|(1:457)(19:236|412|237|238|418|239|362|240|241|348|242|243|360|276|277|315|343|175|(0)(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(12:177|(1:392)|178|179|382|180|181|182|376|183|184|(1:455)(5:187|173|354|188|(20:384|190|191|388|192|193|352|194|(2:195|(3:410|197|(1:200))(2:452|203))|264|265|326|(1:327)|329|(2:330|(2:332|(1:450)(1:451))(2:449|335))|336|(2:341|431)(2:340|342)|343|175|(2:344|345)(0))(8:287|404|288|(4:290|(1:291)|293|314)(9:296|297|(1:298)|300|(2:301|(2:303|(2:444|305)(1:446))(2:445|306))|307|(1:312)(1:311)|313|430)|315|343|175|(0)(0)))) */
    /* JADX WARN: Can't wrap try/catch for region: R(15:(1:416)|56|57|390|58|59|60|378|61|62|372|63|(17:66|402|67|(2:366|69)(1:74)|406|75|76|386|77|78|398|100|101|127|146|31|(2:147|454)(0))|71|453) */
    /* JADX WARN: Can't wrap try/catch for region: R(15:9|(3:423|10|11)|(1:406)|75|76|386|77|78|398|100|101|127|146|31|(4:33|358|34|(3:36|71|453)(13:37|370|38|(6:394|40|(2:41|(3:374|43|(1:439)(1:46))(2:438|49))|50|(2:52|53)(1:54)|(15:416|56|57|390|58|59|60|378|61|62|372|63|(17:66|402|67|(2:366|69)(1:74)|406|75|76|386|77|78|398|100|101|127|146|31|(2:147|454)(0))|71|453)(8:99|398|100|101|127|146|31|(0)(0)))(8:106|420|107|(2:109|126)(6:112|(2:113|(2:115|(2:433|117)(1:434))(2:432|118))|119|(1:124)(1:123)|125|427)|127|146|31|(0)(0))|89|90|132|(2:133|(2:135|(1:436)(1:437))(2:435|138))|139|(2:144|428)(2:143|145)|146|31|(0)(0)))(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(20:(1:384)|190|191|388|192|193|352|194|(2:195|(3:410|197|(1:200))(2:452|203))|264|265|326|(1:327)|329|(2:330|(2:332|(1:450)(1:451))(2:449|335))|336|(2:341|431)(2:340|342)|343|175|(2:344|345)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(20:384|190|191|388|192|193|352|194|(2:195|(3:410|197|(1:200))(2:452|203))|264|265|326|(1:327)|329|(2:330|(2:332|(1:450)(1:451))(2:449|335))|336|(2:341|431)(2:340|342)|343|175|(2:344|345)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(21:156|157|158|(1:412)|237|238|418|239|362|240|241|348|242|243|360|276|277|315|343|175|(12:177|392|178|179|382|180|181|182|376|183|184|(1:455)(5:187|173|354|188|(20:384|190|191|388|192|193|352|194|(2:195|(3:410|197|(1:200))(2:452|203))|264|265|326|(1:327)|329|(2:330|(2:332|(1:450)(1:451))(2:449|335))|336|(2:341|431)(2:340|342)|343|175|(2:344|345)(0))(8:287|404|288|(4:290|(1:291)|293|314)(9:296|297|(1:298)|300|(2:301|(2:303|(2:444|305)(1:446))(2:445|306))|307|(1:312)(1:311)|313|430)|315|343|175|(0)(0))))(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(21:156|157|158|412|237|238|418|239|362|240|241|348|242|243|360|276|277|315|343|175|(12:177|392|178|179|382|180|181|182|376|183|184|(1:455)(5:187|173|354|188|(20:384|190|191|388|192|193|352|194|(2:195|(3:410|197|(1:200))(2:452|203))|264|265|326|(1:327)|329|(2:330|(2:332|(1:450)(1:451))(2:449|335))|336|(2:341|431)(2:340|342)|343|175|(2:344|345)(0))(8:287|404|288|(4:290|(1:291)|293|314)(9:296|297|(1:298)|300|(2:301|(2:303|(2:444|305)(1:446))(2:445|306))|307|(1:312)(1:311)|313|430)|315|343|175|(0)(0))))(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(5:187|173|354|188|(20:384|190|191|388|192|193|352|194|(2:195|(3:410|197|(1:200))(2:452|203))|264|265|326|(1:327)|329|(2:330|(2:332|(1:450)(1:451))(2:449|335))|336|(2:341|431)(2:340|342)|343|175|(2:344|345)(0))(8:287|404|288|(4:290|(1:291)|293|314)(9:296|297|(1:298)|300|(2:301|(2:303|(2:444|305)(1:446))(2:445|306))|307|(1:312)(1:311)|313|430)|315|343|175|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02c9, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0558, code lost:
    
        r6 = (sv.C6955c) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x055a, code lost:
    
        if (r6 == null) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x055e, code lost:
    
        r6 = r6.f33680a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0560, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0561, code lost:
    
        if (r6 == null) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0563, code lost:
    
        r0 = r1.f21605c;
        r4 = r13.m4638f();
        r5 = r13.m4634b();
        r19 = r13.m4636d();
        r4 = r13.m4637e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0581, code lost:
    
        r0 = ((iv.C3357a) r1.f21624v.f39340a.getValue()).f17759f;
        r0 = (com.websoptimization.callyzerbiz.data.model.response.AddDeviceResponse) ((im.i1) r45).f17561a;
        r44.f21590b = r2;
        r44.f21599l = r1;
        r44.f21591c = r14;
        r44.f21592d = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0599, code lost:
    
        r44.f21593e = (im.i1) r45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x059f, code lost:
    
        r44.f21594f = r12;
        r44.f21595g = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x05a6, code lost:
    
        r44.f21596h = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x05a9, code lost:
    
        r44.f21597j = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x05ab, code lost:
    
        r0 = r14;
        r14 = 2;
        r21 = r11;
        r11 = r2;
        r24 = r7;
        r25 = r0;
        r19 = r3;
        r18 = r10;
        r10 = r1;
        r22 = r12;
        r12 = r45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x05ca, code lost:
    
        r0 = r0.m7654j(r4, r5, r19, r4, r0, r6, r0, r44);
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x05ce, code lost:
    
        if (r0 != r9) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x05d2, code lost:
    
        r7 = r10;
        r10 = r11;
        r3 = r12;
        r4 = r13;
        r2 = r19;
        r1 = r22;
        r6 = r25;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0630, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0632, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0633, code lost:
    
        r13 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0634, code lost:
    
        r20 = r12;
        r17 = r13;
        r1 = r1;
        r2 = r2;
        r3 = r3;
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x063c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0645, code lost:
    
        r13 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0646, code lost:
    
        r2 = r4;
        r3 = r6;
        r4 = r7;
        r20 = r12;
        r17 = r13;
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0651, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0652, code lost:
    
        r13 = 3;
        r11 = true;
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0656, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0657, code lost:
    
        r12 = null;
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0665, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0666, code lost:
    
        r12 = null;
        r17 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0675, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0676, code lost:
    
        r24 = r7;
        r18 = r10;
        r21 = r11;
        r22 = r12;
        r25 = r14;
        r10 = r1;
        r12 = null;
        r17 = 3;
        r14 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0688, code lost:
    
        r11 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x068a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x068b, code lost:
    
        r24 = r7;
        r18 = r10;
        r21 = r11;
        r22 = r12;
        r25 = r14;
        r10 = r1;
        r12 = null;
        r14 = 2;
        r17 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x069e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x069f, code lost:
    
        r24 = r7;
        r18 = r10;
        r21 = r11;
        r22 = r12;
        r25 = r14;
        r12 = null;
        r14 = 2;
        r17 = 3;
        r10 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x06b1, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x06b2, code lost:
    
        r24 = r7;
        r18 = r10;
        r21 = r11;
        r22 = r12;
        r25 = r14;
        r12 = null;
        r14 = 2;
        r17 = 3;
        r10 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x06c4, code lost:
    
        r24 = r7;
        r18 = r10;
        r21 = r11;
        r25 = r14;
        r12 = null;
        r14 = 2;
        r17 = 3;
        r4 = r1;
        r6 = r2;
        r2 = r13;
        r1 = r12;
        r3 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x06f2, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x06f3, code lost:
    
        r11 = r6;
        r20 = r12;
        r1 = r1;
        r2 = r2;
        r3 = r3;
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x06f8, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x06f9, code lost:
    
        r24 = r7;
        r18 = r10;
        r21 = r11;
        r22 = r12;
        r25 = r14;
        r12 = null;
        r17 = 3;
        r10 = r1;
        r11 = r2;
        r14 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x070d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x070e, code lost:
    
        r21 = r11;
        r22 = r12;
        r25 = r14;
        r24 = r18;
        r12 = null;
        r17 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x0719, code lost:
    
        r11 = r2;
        r14 = r5;
        r18 = r10;
        r10 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x0837, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x0838, code lost:
    
        r17 = r11;
        r22 = r12;
        r25 = r14;
        r24 = r18;
        r20 = null;
        r11 = r2;
        r14 = r5;
        r18 = r10;
        r10 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x0855, code lost:
    
        r18 = r10;
        r1 = r1;
        r2 = r2;
        r3 = r3;
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x0859, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x085a, code lost:
    
        r14 = r5;
        r17 = r11;
        r24 = r18;
        r20 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x0864, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x0865, code lost:
    
        r14 = r5;
        r20 = null;
        r17 = r11;
        r24 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x022a, code lost:
    
        r1 = r2;
        r2 = r7;
        r4 = r12;
        r7 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:?, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x021a, code lost:
    
        if (rv.p0.m12675f(r5, r0, r44) == r13) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x024e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x025d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x025e, code lost:
    
        r9 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x025f, code lost:
    
        r7 = r45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0268, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0269, code lost:
    
        r12 = r3;
        r45 = r4;
        r13 = r5;
        r21 = r9;
        r18 = r10;
        r22 = r11;
        r17 = r14;
        r9 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x028d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x028e, code lost:
    
        r12 = r3;
        r45 = r4;
        r13 = r5;
        r21 = r9;
        r18 = r10;
        r22 = r11;
        r17 = r14;
        r9 = 2;
        r10 = r2;
        r14 = r7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:141:0x03b9, B:144:0x03c0], limit reached: 447 */
    /* JADX WARN: Path cross not found for [B:144:0x03c0, B:141:0x03b9], limit reached: 447 */
    /* JADX WARN: Path cross not found for [B:338:0x08e5, B:341:0x08ec], limit reached: 447 */
    /* JADX WARN: Path cross not found for [B:341:0x08ec, B:338:0x08e5], limit reached: 447 */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x072d  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x08c9  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x08e5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x090e  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0203 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:384:0x04f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0118 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:435:0x03b4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:449:0x08df A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0226  */
    /* JADX WARN: Type inference failed for: r12v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v25, types: [int] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v82 */
    /* JADX WARN: Type inference failed for: r1v83 */
    /* JADX WARN: Type inference failed for: r1v84 */
    /* JADX WARN: Type inference failed for: r2v101 */
    /* JADX WARN: Type inference failed for: r2v102 */
    /* JADX WARN: Type inference failed for: r2v103 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v43, types: [int] */
    /* JADX WARN: Type inference failed for: r2v8, types: [com.websoptimization.callyzerbiz.data.model.request.AddDeviceRequest] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v86 */
    /* JADX WARN: Type inference failed for: r3v87 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v93 */
    /* JADX WARN: Type inference failed for: r4v94 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:236:0x060b -> B:412:0x060f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:261:0x065a -> B:360:0x06dd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:275:0x06c4 -> B:360:0x06dd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x029f -> B:398:0x02b4). Please report as a decompilation issue!!! */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r45) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kv.C4250d.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4250d(p0 p0Var, AbstractC6650z abstractC6650z, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f21599l = p0Var;
        this.f21600m = abstractC6650z;
    }
}
