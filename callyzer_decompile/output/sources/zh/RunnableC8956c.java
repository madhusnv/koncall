package zh;

import android.view.View;
import c9.C0908c;
import com.google.android.gms.internal.measurement.c0;
import com.google.android.gms.internal.measurement.n0;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.Objects;
import ri.ExecutorC6553k;
import ug.C7439j;
import ug.e1;
import ug.i0;
import ug.j3;
import ug.k3;
import ug.n1;
import ug.q2;
import ug.v0;
import yg.C8654k;
import yg.C8656m;
import yg.InterfaceC8646c;
import yg.InterfaceC8648e;
import z1.C8849i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zh.c */
/* loaded from: classes.dex */
public final class RunnableC8956c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f42965a;

    /* renamed from: b */
    public Object f42966b;

    /* renamed from: c */
    public final Object f42967c;

    public /* synthetic */ RunnableC8956c(int i10, Object obj, Object obj2) {
        this.f42965a = i10;
        this.f42966b = obj;
        this.f42967c = obj2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:24|(1:26)(26:29|299|30|31|(1:34)(22:36|(1:38)|295|39|(7:41|(1:43)(1:45)|307|46|297|47|48)|28|52|(2:54|(2:56|(2:58|(2:60|(2:62|(2:64|(1:66)(1:67))(1:68))(1:69))(1:70))(1:71))(1:72))(1:73)|74|305|75|(1:77)(1:78)|79|(1:81)|85|(1:87)(7:89|(0)(1:92)|(3:303|94|(1:96)(1:97))|(2:103|(1:105)(4:106|(3:109|(1:313)(1:314)|107)|312|112))(1:112)|(1:114)(1:115)|116|(30:118|(1:120)(1:121)|122|(1:124)|125|(1:127)(1:128)|129|(2:131|(2:136|(1:138))(1:(3:135|136|(0))))(0)|139|(19:144|(1:146)|(1:161)(1:162)|163|(1:165)|166|(2:171|(2:177|(2:184|(2:185|(1:309)(2:187|(2:310|189)(1:311))))(0))(1:176))(1:170)|190|(3:194|(1:196)|197)|198|(1:200)|201|(1:205)|206|(3:208|(7:210|(1:212)(1:213)|214|(1:216)|217|(4:221|(1:223)|224|(1:226))|227)(1:229)|228)(10:230|(2:232|(2:245|246)(3:235|(5:237|(1:239)(1:240)|241|(1:243)|244)(0)|246))(1:247)|248|(1:250)|251|301|252|253|257|(5:259|(1:261)(1:262)|(1:266)|(1:268)|269))|270|(3:272|(1:274)(1:275)|(5:277|(1:279)|280|(1:282)|283))|284|285)(1:143)|147|(1:157)(1:159)|158|(0)(0)|163|(0)|166|(3:168|171|(3:174|177|(4:180|182|184|(3:185|(0)(0)|311))(0))(0))(0)|190|(4:192|194|(0)|197)(0)|198|(0)|201|(2:203|205)|206|(0)(0)|270|(0)|284|285)(2:286|287))|88|(0)|(0)(0)|(0)(0)|116|(0)(0))|35|295|39|(0)(0)|28|52|(0)(0)|74|305|75|(0)(0)|79|(0)|85|(0)(0)|88|(0)|(0)(0)|(0)(0)|116|(0)(0))|27|28|52|(0)(0)|74|305|75|(0)(0)|79|(0)|85|(0)(0)|88|(0)|(0)(0)|(0)(0)|116|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(25:29|(2:299|30)|31|(1:34)(22:36|(1:38)|295|39|(7:41|(1:43)(1:45)|307|46|297|47|48)|28|52|(2:54|(2:56|(2:58|(2:60|(2:62|(2:64|(1:66)(1:67))(1:68))(1:69))(1:70))(1:71))(1:72))(1:73)|74|305|75|(1:77)(1:78)|79|(1:81)|85|(1:87)(7:89|(0)(1:92)|(3:303|94|(1:96)(1:97))|(2:103|(1:105)(4:106|(3:109|(1:313)(1:314)|107)|312|112))(1:112)|(1:114)(1:115)|116|(30:118|(1:120)(1:121)|122|(1:124)|125|(1:127)(1:128)|129|(2:131|(2:136|(1:138))(1:(3:135|136|(0))))(0)|139|(19:144|(1:146)|(1:161)(1:162)|163|(1:165)|166|(2:171|(2:177|(2:184|(2:185|(1:309)(2:187|(2:310|189)(1:311))))(0))(1:176))(1:170)|190|(3:194|(1:196)|197)|198|(1:200)|201|(1:205)|206|(3:208|(7:210|(1:212)(1:213)|214|(1:216)|217|(4:221|(1:223)|224|(1:226))|227)(1:229)|228)(10:230|(2:232|(2:245|246)(3:235|(5:237|(1:239)(1:240)|241|(1:243)|244)(0)|246))(1:247)|248|(1:250)|251|301|252|253|257|(5:259|(1:261)(1:262)|(1:266)|(1:268)|269))|270|(3:272|(1:274)(1:275)|(5:277|(1:279)|280|(1:282)|283))|284|285)(1:143)|147|(1:157)(1:159)|158|(0)(0)|163|(0)|166|(3:168|171|(3:174|177|(4:180|182|184|(3:185|(0)(0)|311))(0))(0))(0)|190|(4:192|194|(0)|197)(0)|198|(0)|201|(2:203|205)|206|(0)(0)|270|(0)|284|285)(2:286|287))|88|(0)|(0)(0)|(0)(0)|116|(0)(0))|35|295|39|(0)(0)|28|52|(0)(0)|74|305|75|(0)(0)|79|(0)|85|(0)(0)|88|(0)|(0)(0)|(0)(0)|116|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01b9, code lost:
    
        r5 = "Unknown";
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x027c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x027d, code lost:
    
        ug.n1.m14085m(r13);
        r13.f35862f.m14142c("Fetching Google App Id failed with exception. appId", ug.v0.m14157U(r14), r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0626  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0736  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x07fe  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0869  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x02be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0598 A[EDGE_INSN: B:309:0x0598->B:190:0x0598 BREAK  A[LOOP:0: B:185:0x0581->B:311:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x019c A[Catch: NameNotFoundException -> 0x01b9, TryCatch #0 {NameNotFoundException -> 0x01b9, blocks: (B:39:0x0191, B:41:0x019c, B:43:0x01a8), top: B:295:0x0191 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x026d A[Catch: IllegalStateException -> 0x027c, TRY_LEAVE, TryCatch #5 {IllegalStateException -> 0x027c, blocks: (B:75:0x025b, B:79:0x0269, B:81:0x026d), top: B:305:0x025b }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02ad  */
    /* JADX WARN: Type inference failed for: r0v48, types: [ug.p2] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m16438a() throws android.content.res.Resources.NotFoundException, android.content.pm.PackageManager.NameNotFoundException, java.lang.ClassNotFoundException {
        /*
            Method dump skipped, instructions count: 2182
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zh.RunnableC8956c.m16438a():void");
    }

    /* renamed from: b */
    private final void m16439b() {
        j3 j3Var = (j3) this.f42967c;
        synchronized (j3Var) {
            try {
                j3Var.f35545a = false;
                k3 k3Var = j3Var.f35547c;
                if (!k3Var.d0()) {
                    v0 v0Var = ((n1) k3Var.f482a).f35669f;
                    n1.m14085m(v0Var);
                    v0Var.f35870p.m14140a("Connected to service");
                    i0 i0Var = (i0) this.f42966b;
                    k3Var.mo325M();
                    k3Var.f35570d = i0Var;
                    k3Var.m14026Z();
                    k3Var.b0();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: c */
    private final void m16440c() {
        synchronized (((C8654k) this.f42967c).f41947c) {
            ((InterfaceC8646c) ((C8654k) this.f42967c).f41948d).mo22j((C8656m) this.f42966b);
        }
    }

    /* renamed from: d */
    private final void m16441d() {
        synchronized (((C8654k) this.f42967c).f41947c) {
            ((InterfaceC8648e) ((C8654k) this.f42967c).f41948d).mo27g(((C8656m) this.f42966b).m15983j());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
    
        if (r1 == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
    
        ((java.lang.Runnable) r9.f42966b).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005e, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
    
        ri.ExecutorC6553k.f31401f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r9.f42966b), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007c, code lost:
    
        r9.f42966b = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007e, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x003c A[SYNTHETIC] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m16442e() {
        /*
            r9 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r9.f42967c     // Catch: java.lang.Throwable -> L5a
            ri.k r2 = (ri.ExecutorC6553k) r2     // Catch: java.lang.Throwable -> L5a
            java.util.ArrayDeque r2 = r2.f31403b     // Catch: java.lang.Throwable -> L5a
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L5a
            if (r0 != 0) goto L2c
            java.lang.Object r0 = r9.f42967c     // Catch: java.lang.Throwable -> L20
            ri.k r0 = (ri.ExecutorC6553k) r0     // Catch: java.lang.Throwable -> L20
            ri.j r3 = r0.f31404c     // Catch: java.lang.Throwable -> L20
            ri.j r4 = ri.EnumC6552j.RUNNING     // Catch: java.lang.Throwable -> L20
            if (r3 != r4) goto L22
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L48
        L18:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L48
        L20:
            r0 = move-exception
            goto L7f
        L22:
            long r5 = r0.f31405d     // Catch: java.lang.Throwable -> L20
            r7 = 1
            long r5 = r5 + r7
            r0.f31405d = r5     // Catch: java.lang.Throwable -> L20
            r0.f31404c = r4     // Catch: java.lang.Throwable -> L20
            r0 = 1
        L2c:
            java.lang.Object r3 = r9.f42967c     // Catch: java.lang.Throwable -> L20
            ri.k r3 = (ri.ExecutorC6553k) r3     // Catch: java.lang.Throwable -> L20
            java.util.ArrayDeque r3 = r3.f31403b     // Catch: java.lang.Throwable -> L20
            java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L20
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L20
            r9.f42966b = r3     // Catch: java.lang.Throwable -> L20
            if (r3 != 0) goto L49
            java.lang.Object r0 = r9.f42967c     // Catch: java.lang.Throwable -> L20
            ri.k r0 = (ri.ExecutorC6553k) r0     // Catch: java.lang.Throwable -> L20
            ri.j r3 = ri.EnumC6552j.IDLE     // Catch: java.lang.Throwable -> L20
            r0.f31404c = r3     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L48
            goto L18
        L48:
            return
        L49:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L5a
            r1 = r1 | r2
            r2 = 0
            java.lang.Object r3 = r9.f42966b     // Catch: java.lang.Throwable -> L5c java.lang.RuntimeException -> L5e
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L5c java.lang.RuntimeException -> L5e
            r3.run()     // Catch: java.lang.Throwable -> L5c java.lang.RuntimeException -> L5e
        L57:
            r9.f42966b = r2     // Catch: java.lang.Throwable -> L5a
            goto L2
        L5a:
            r0 = move-exception
            goto L81
        L5c:
            r0 = move-exception
            goto L7c
        L5e:
            r3 = move-exception
            java.util.logging.Logger r4 = ri.ExecutorC6553k.f31401f     // Catch: java.lang.Throwable -> L5c
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
            r6.<init>()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r7 = "Exception while executing runnable "
            r6.append(r7)     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r7 = r9.f42966b     // Catch: java.lang.Throwable -> L5c
            java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch: java.lang.Throwable -> L5c
            r6.append(r7)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5c
            r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5c
            goto L57
        L7c:
            r9.f42966b = r2     // Catch: java.lang.Throwable -> L5a
            throw r0     // Catch: java.lang.Throwable -> L5a
        L7f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r0     // Catch: java.lang.Throwable -> L5a
        L81:
            if (r1 == 0) goto L8a
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L8a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zh.RunnableC8956c.m16442e():void");
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02d6  */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.lang.Object, rf.g] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, rf.g] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1956
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zh.RunnableC8956c.run():void");
    }

    public String toString() {
        switch (this.f42965a) {
            case 0:
                C7439j c7439j = new C7439j(RunnableC8956c.class.getSimpleName());
                C0908c c0908c = (C0908c) this.f42967c;
                C8849i c8849i = new C8849i(23, false);
                ((C8849i) c7439j.f35539d).f42583b = c8849i;
                c7439j.f35539d = c8849i;
                c8849i.f42584c = c0908c;
                return c7439j.toString();
            case 13:
                Runnable runnable = (Runnable) this.f42966b;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                return "SequentialExecutorWorker{state=" + ((ExecutorC6553k) this.f42967c).f31404c + "}";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ RunnableC8956c(int i10, Object obj, Object obj2, boolean z6) {
        this.f42965a = i10;
        this.f42967c = obj;
        this.f42966b = obj2;
    }

    public RunnableC8956c(e1 e1Var, c0 c0Var, e1 e1Var2) {
        this.f42965a = 14;
        this.f42966b = c0Var;
        this.f42967c = e1Var;
    }

    public RunnableC8956c(q2 q2Var, n0 n0Var) {
        this.f42965a = 17;
        this.f42966b = n0Var;
        Objects.requireNonNull(q2Var);
        this.f42967c = q2Var;
    }

    public RunnableC8956c(ExecutorC6553k executorC6553k) {
        this.f42965a = 13;
        this.f42967c = executorC6553k;
    }

    public RunnableC8956c(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z6) {
        this.f42965a = 5;
        this.f42967c = swipeDismissBehavior;
        this.f42966b = view;
    }
}
