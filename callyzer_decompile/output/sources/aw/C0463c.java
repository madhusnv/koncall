package aw;

import ab.C0084b;
import com.websoptimization.callyzerbiz.workManager.LogFileUploadManager;
import ex.InterfaceC2141e;
import io.C3330e;
import j$.time.LocalDateTime;
import java.io.File;
import og.od;
import t8.AbstractC7075u;
import t8.C7069o;
import t8.C7072r;
import t8.C7073s;
import tx.InterfaceC7266z;
import tx.e1;
import tx.s1;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import yv.C8805t;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: aw.c */
/* loaded from: classes3.dex */
public final class C0463c extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f3322a = 0;

    /* renamed from: b */
    public int f3323b;

    /* renamed from: c */
    public boolean f3324c;

    /* renamed from: d */
    public Object f3325d;

    /* renamed from: e */
    public Object f3326e;

    /* renamed from: f */
    public /* synthetic */ Object f3327f;

    /* renamed from: g */
    public final /* synthetic */ Object f3328g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0463c(LogFileUploadManager logFileUploadManager, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f3328g = logFileUploadManager;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f3322a) {
            case 0:
                C0463c c0463c = new C0463c((LogFileUploadManager) this.f3328g, interfaceC7559c);
                c0463c.f3327f = obj;
                return c0463c;
            default:
                mn.g0 g0Var = (mn.g0) this.f3325d;
                return new C0463c((String) this.f3328g, (LocalDateTime) this.f3326e, (LocalDateTime) this.f3327f, g0Var, interfaceC7559c, this.f3324c);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f3322a) {
        }
        return ((C0463c) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, tx.z] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2, types: [tx.e1] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v6 */
    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object c7073s;
        e1 e1Var;
        boolean zM13365b;
        File file;
        switch (this.f3322a) {
            case 0:
                LogFileUploadManager logFileUploadManager = (LogFileUploadManager) this.f3328g;
                C8805t c8805t = logFileUploadManager.f7444c;
                ?? r32 = (InterfaceC7266z) this.f3327f;
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f3323b;
                InterfaceC7559c interfaceC7559c = null;
                try {
                    try {
                    } catch (Exception e2) {
                        c8805t.m16232g("LogFileUploadManager", "Exception: " + e2.getMessage());
                        c8805t.m16236k(e2);
                        c7073s = new C7073s();
                        e1Var = r32;
                    }
                    if (i10 == 0) {
                        od.m10798c(obj);
                        zM13365b = logFileUploadManager.getInputData().m13365b("is_from_fcm");
                        File file2 = new File(logFileUploadManager.getApplicationContext().getExternalFilesDir(null), "LOGS.txt");
                        if (!file2.exists() || file2.length() <= 0) {
                            c8805t.m16232g("LogFileUploadManager", "Log file not found or is empty");
                            return new C7072r();
                        }
                        C7069o c7069oM5041a = LogFileUploadManager.m5041a(logFileUploadManager, 0);
                        this.f3327f = r32;
                        this.f3325d = file2;
                        this.f3324c = zM13365b;
                        this.f3323b = 1;
                        if (logFileUploadManager.setForeground(c7069oM5041a, this) == enumC7794a) {
                            return enumC7794a;
                        }
                        file = file2;
                    } else {
                        if (i10 != 1) {
                            if (i10 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            s1 s1Var = (s1) this.f3326e;
                            od.m10798c(obj);
                            r32 = s1Var;
                            c7073s = (AbstractC7075u) obj;
                            e1Var = r32;
                            e1Var.mo13510j(null);
                            return c7073s;
                        }
                        zM13365b = this.f3324c;
                        file = (File) this.f3325d;
                        od.m10798c(obj);
                    }
                    s1 s1VarM13502y = tx.c0.m13502y(r32, null, null, new C0084b(logFileUploadManager, interfaceC7559c, 4), 3);
                    C3330e c3330e = logFileUploadManager.f7443b;
                    this.f3327f = null;
                    this.f3325d = null;
                    this.f3326e = s1VarM13502y;
                    this.f3324c = zM13365b;
                    this.f3323b = 2;
                    obj = c3330e.m7661g(file, zM13365b, this);
                    r32 = s1VarM13502y;
                    if (obj == enumC7794a) {
                        return enumC7794a;
                    }
                    c7073s = (AbstractC7075u) obj;
                    e1Var = r32;
                    e1Var.mo13510j(null);
                    return c7073s;
                } catch (Throwable th2) {
                    r32.mo13510j(null);
                    throw th2;
                }
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f3323b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                mn.g0 g0Var = (mn.g0) this.f3325d;
                LocalDateTime localDateTime = (LocalDateTime) this.f3326e;
                LocalDateTime localDateTime2 = (LocalDateTime) this.f3327f;
                boolean z6 = this.f3324c;
                String str = (String) this.f3328g;
                this.f3323b = 1;
                Object objM13488k = tx.c0.m13488k(new mn.e0(str, localDateTime, localDateTime2, g0Var, null, z6), this);
                return objM13488k == enumC7794a2 ? enumC7794a2 : objM13488k;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0463c(String str, LocalDateTime localDateTime, LocalDateTime localDateTime2, mn.g0 g0Var, InterfaceC7559c interfaceC7559c, boolean z6) {
        super(2, interfaceC7559c);
        this.f3325d = g0Var;
        this.f3326e = localDateTime;
        this.f3327f = localDateTime2;
        this.f3324c = z6;
        this.f3328g = str;
    }
}
