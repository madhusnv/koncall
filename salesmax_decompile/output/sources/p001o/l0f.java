package p001o;

import ai.salesmax.model.CallEvent;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.provider.CallLog;
import com.amplifyframework.datastore.generated.model.CallConnectStatus;
import com.amplifyframework.datastore.generated.model.CallDirection;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p001o.vre;

/* loaded from: classes.dex */
public final class l0f extends ContentObserver {

    /* renamed from: a */
    public final Context f32918a;

    /* renamed from: b */
    public final cha f32919b;

    /* renamed from: c */
    public String f32920c;

    /* renamed from: d */
    public long f32921d;

    /* renamed from: e */
    public final jg2 f32922e;

    /* renamed from: f */
    public final h84 f32923f;

    /* renamed from: g */
    public final nqb f32924g;

    /* renamed from: h */
    public final nqb f32925h;

    /* renamed from: o.l0f$a */
    public static final class C14950a extends jgg implements nl7 {

        /* renamed from: a */
        public int f32926a;

        public C14950a(n64 n64Var) {
            super(2, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return l0f.this.new C14950a(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
            uq8.m51918f();
            if (this.f32926a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            l0f.this.m36420k();
            String str = l0f.this.f32920c;
            StringBuilder sb = new StringBuilder();
            sb.append("initialization of salesmax call log observer is successfully done and cursor is set to: ");
            sb.append(str);
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C14950a) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.l0f$b */
    public static final class C14951b extends jgg implements nl7 {

        /* renamed from: a */
        public Object f32928a;

        /* renamed from: b */
        public Object f32929b;

        /* renamed from: c */
        public Object f32930c;

        /* renamed from: d */
        public Object f32931d;

        /* renamed from: e */
        public int f32932e;

        /* renamed from: f */
        public /* synthetic */ Object f32933f;

        public C14951b(n64 n64Var) {
            super(2, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C14951b c14951b = l0f.this.new C14951b(n64Var);
            c14951b.f32933f = obj;
            return c14951b;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(5:41|(3:85|44|(2:46|89)(1:87))(3:86|43|90)|88|82|39) */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x011c, code lost:
        
            r0.f32919b.put(r13, p001o.ml1.m39301a(true));
            r13 = r12.getCallEndTime();
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x012b, code lost:
        
            if (r13 == null) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x012d, code lost:
        
            r13 = r13.longValue();
            r15 = r12.getCallStartTime();
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0135, code lost:
        
            if (r15 == null) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0137, code lost:
        
            r13 = p001o.ml1.m39305e(r13 - r15.longValue());
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0141, code lost:
        
            r13 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x0142, code lost:
        
            r12.setTotalCallDuration(r13);
            r13 = new java.lang.StringBuilder();
            r13.append("Call Event: ");
            r13.append(r12);
            p001o.hv1.f27574f.m31195a().m31186r(r12);
            r13 = r12.getCallId();
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x015f, code lost:
        
            if (r13 == null) goto L60;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x0161, code lost:
        
            r9.f32933f = r11;
            r9.f32928a = r10;
            r9.f32929b = r0;
            r9.f32930c = r8;
            r9.f32931d = r12;
            r9.f32932e = 3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x0171, code lost:
        
            if (r0.m36421l(r13, r9) != r2) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x0173, code lost:
        
            return r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x0174, code lost:
        
            r17 = r10;
            r10 = r0;
            r0 = r12;
            r12 = r11;
            r11 = r17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x0184, code lost:
        
            r17 = r8;
            r8 = r0;
            r0 = r17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x01ad, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x01ae, code lost:
        
            r8 = r9;
         */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00aa A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00b9  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00f7 A[Catch: all -> 0x01ad, TryCatch #3 {all -> 0x01ad, blocks: (B:39:0x00f1, B:41:0x00f7, B:44:0x0104, B:46:0x010e, B:47:0x011c, B:49:0x012d, B:51:0x0137, B:53:0x0142, B:55:0x0161, B:61:0x0189, B:63:0x018f, B:69:0x01b1), top: B:82:0x00f1 }] */
        /* JADX WARN: Removed duplicated region for block: B:75:0x01e3  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00ab -> B:31:0x00b1). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x01a6 -> B:82:0x00f1). Please report as a decompilation issue!!! */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            h84 h84Var;
            sg2 it;
            C14951b c14951b;
            C14951b c14951b2;
            Throwable th;
            Object objM53351b;
            h84 h84Var2;
            sg2 sg2Var;
            h84 h84Var3;
            sg2 sg2Var2;
            Object objMo23482a;
            l0f l0fVar;
            Iterator it2;
            Iterator it3;
            l0f l0fVar2;
            CallEvent callEvent;
            h84 h84Var4;
            sg2 sg2Var3;
            l0f l0fVar3;
            Object objM36419j;
            Object objM51918f = uq8.m51918f();
            int i = this.f32932e;
            if (i == 0) {
                wre.m54934b(obj);
                h84Var = (h84) this.f32933f;
                it = l0f.this.f32922e.iterator();
                c14951b = this;
                c14951b.f32933f = h84Var;
                c14951b.f32928a = it;
                c14951b.f32929b = null;
                c14951b.f32930c = null;
                c14951b.f32931d = null;
                c14951b.f32932e = 1;
                objMo23482a = it.mo23482a(c14951b);
                if (objMo23482a == objM51918f) {
                }
            } else if (i != 1) {
                try {
                } catch (Throwable th2) {
                    th = th2;
                    c14951b2 = this;
                    vre.C17665a c17665a = vre.f50797b;
                    objM53351b = vre.m53351b(wre.m54933a(th));
                    sg2 sg2Var4 = sg2Var;
                    c14951b = c14951b2;
                    it = sg2Var4;
                    boolean zM53357h = vre.m53357h(objM53351b);
                    StringBuilder sb = new StringBuilder();
                    sb.append("Result of processing: ");
                    sb.append(zM53357h);
                    vre.m53354e(objM53351b);
                    h84Var = h84Var3;
                    c14951b.f32933f = h84Var;
                    c14951b.f32928a = it;
                    c14951b.f32929b = null;
                    c14951b.f32930c = null;
                    c14951b.f32931d = null;
                    c14951b.f32932e = 1;
                    objMo23482a = it.mo23482a(c14951b);
                    if (objMo23482a == objM51918f) {
                    }
                }
                if (i == 2) {
                    l0fVar2 = (l0f) this.f32929b;
                    sg2Var = (sg2) this.f32928a;
                    h84 h84Var5 = (h84) this.f32933f;
                    wre.m54934b(obj);
                    c14951b2 = this;
                    h84Var2 = h84Var5;
                    objM36419j = obj;
                    sg2 sg2Var5 = sg2Var;
                    c14951b = c14951b2;
                    it3 = ((List) objM36419j).iterator();
                    sg2Var2 = sg2Var5;
                    while (it3.hasNext()) {
                    }
                    objM53351b = vre.m53351b(y3i.f54824a);
                    it = sg2Var2;
                    h84Var3 = h84Var2;
                    boolean zM53357h2 = vre.m53357h(objM53351b);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Result of processing: ");
                    sb2.append(zM53357h2);
                    vre.m53354e(objM53351b);
                    h84Var = h84Var3;
                    c14951b.f32933f = h84Var;
                    c14951b.f32928a = it;
                    c14951b.f32929b = null;
                    c14951b.f32930c = null;
                    c14951b.f32931d = null;
                    c14951b.f32932e = 1;
                    objMo23482a = it.mo23482a(c14951b);
                    if (objMo23482a == objM51918f) {
                    }
                } else if (i == 3) {
                    CallEvent callEvent2 = (CallEvent) this.f32931d;
                    it3 = (Iterator) this.f32930c;
                    l0f l0fVar4 = (l0f) this.f32929b;
                    sg2Var2 = (sg2) this.f32928a;
                    h84Var2 = (h84) this.f32933f;
                    try {
                        wre.m54934b(obj);
                        h84Var4 = h84Var2;
                        sg2Var3 = sg2Var2;
                        l0fVar3 = l0fVar4;
                        c14951b = this;
                    } catch (Throwable th3) {
                        th = th3;
                        c14951b2 = this;
                        sg2Var = sg2Var2;
                        h84Var3 = h84Var2;
                        vre.C17665a c17665a2 = vre.f50797b;
                        objM53351b = vre.m53351b(wre.m54933a(th));
                        sg2 sg2Var42 = sg2Var;
                        c14951b = c14951b2;
                        it = sg2Var42;
                        boolean zM53357h22 = vre.m53357h(objM53351b);
                        StringBuilder sb22 = new StringBuilder();
                        sb22.append("Result of processing: ");
                        sb22.append(zM53357h22);
                        vre.m53354e(objM53351b);
                        h84Var = h84Var3;
                        c14951b.f32933f = h84Var;
                        c14951b.f32928a = it;
                        c14951b.f32929b = null;
                        c14951b.f32930c = null;
                        c14951b.f32931d = null;
                        c14951b.f32932e = 1;
                        objMo23482a = it.mo23482a(c14951b);
                        if (objMo23482a == objM51918f) {
                        }
                    }
                    h84 h84Var6 = h84Var4;
                    callEvent = callEvent2;
                    it2 = it3;
                    l0fVar = l0fVar3;
                    sg2Var2 = sg2Var3;
                    h84Var2 = h84Var6;
                    Long callStartTime = callEvent.getCallStartTime();
                    if (callStartTime != null) {
                        long jLongValue = callStartTime.longValue();
                        c14951b.f32933f = h84Var2;
                        c14951b.f32928a = sg2Var2;
                        c14951b.f32929b = l0fVar;
                        c14951b.f32930c = it2;
                        c14951b.f32931d = null;
                        c14951b.f32932e = 4;
                        if (l0fVar.m36422m(jLongValue, c14951b) == objM51918f) {
                            return objM51918f;
                        }
                    }
                    l0f l0fVar5 = l0fVar;
                    it3 = it2;
                    l0fVar2 = l0fVar5;
                    while (it3.hasNext()) {
                    }
                    objM53351b = vre.m53351b(y3i.f54824a);
                    it = sg2Var2;
                    h84Var3 = h84Var2;
                    boolean zM53357h222 = vre.m53357h(objM53351b);
                    StringBuilder sb222 = new StringBuilder();
                    sb222.append("Result of processing: ");
                    sb222.append(zM53357h222);
                    vre.m53354e(objM53351b);
                    h84Var = h84Var3;
                    c14951b.f32933f = h84Var;
                    c14951b.f32928a = it;
                    c14951b.f32929b = null;
                    c14951b.f32930c = null;
                    c14951b.f32931d = null;
                    c14951b.f32932e = 1;
                    objMo23482a = it.mo23482a(c14951b);
                    if (objMo23482a == objM51918f) {
                    }
                } else {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it2 = (Iterator) this.f32930c;
                    l0fVar = (l0f) this.f32929b;
                    sg2 sg2Var6 = (sg2) this.f32928a;
                    h84 h84Var7 = (h84) this.f32933f;
                    wre.m54934b(obj);
                    h84Var2 = h84Var7;
                    sg2Var2 = sg2Var6;
                    c14951b = this;
                    l0f l0fVar52 = l0fVar;
                    it3 = it2;
                    l0fVar2 = l0fVar52;
                    while (it3.hasNext()) {
                        callEvent = (CallEvent) it3.next();
                        String callId = callEvent.getCallId();
                        if (callId != null) {
                            if (l0fVar2.f32919b.mo30511g(callId) == null) {
                                break;
                            }
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Skipping duplicate call log: ");
                            sb3.append(callId);
                        }
                    }
                    objM53351b = vre.m53351b(y3i.f54824a);
                    it = sg2Var2;
                    h84Var3 = h84Var2;
                    boolean zM53357h2222 = vre.m53357h(objM53351b);
                    StringBuilder sb2222 = new StringBuilder();
                    sb2222.append("Result of processing: ");
                    sb2222.append(zM53357h2222);
                    vre.m53354e(objM53351b);
                    h84Var = h84Var3;
                    c14951b.f32933f = h84Var;
                    c14951b.f32928a = it;
                    c14951b.f32929b = null;
                    c14951b.f32930c = null;
                    c14951b.f32931d = null;
                    c14951b.f32932e = 1;
                    objMo23482a = it.mo23482a(c14951b);
                    if (objMo23482a == objM51918f) {
                        return objM51918f;
                    }
                    h84Var2 = h84Var;
                    C14951b c14951b3 = c14951b;
                    sg2Var = it;
                    c14951b2 = c14951b3;
                    if (((Boolean) objMo23482a).booleanValue()) {
                        return y3i.f54824a;
                    }
                    boolean zBooleanValue = ((Boolean) sg2Var.next()).booleanValue();
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Consumed event: ");
                    sb4.append(zBooleanValue);
                    l0fVar2 = l0f.this;
                    try {
                    } catch (Throwable th4) {
                        th = th4;
                        h84Var3 = h84Var2;
                        vre.C17665a c17665a22 = vre.f50797b;
                        objM53351b = vre.m53351b(wre.m54933a(th));
                        sg2 sg2Var422 = sg2Var;
                        c14951b = c14951b2;
                        it = sg2Var422;
                        boolean zM53357h22222 = vre.m53357h(objM53351b);
                        StringBuilder sb22222 = new StringBuilder();
                        sb22222.append("Result of processing: ");
                        sb22222.append(zM53357h22222);
                        vre.m53354e(objM53351b);
                        h84Var = h84Var3;
                        c14951b.f32933f = h84Var;
                        c14951b.f32928a = it;
                        c14951b.f32929b = null;
                        c14951b.f32930c = null;
                        c14951b.f32931d = null;
                        c14951b.f32932e = 1;
                        objMo23482a = it.mo23482a(c14951b);
                        if (objMo23482a == objM51918f) {
                        }
                    }
                    vre.C17665a c17665a3 = vre.f50797b;
                    c14951b2.f32933f = h84Var2;
                    c14951b2.f32928a = sg2Var;
                    c14951b2.f32929b = l0fVar2;
                    c14951b2.f32932e = 2;
                    objM36419j = l0fVar2.m36419j(3, 500L, c14951b2);
                    if (objM36419j == objM51918f) {
                        return objM51918f;
                    }
                    sg2 sg2Var52 = sg2Var;
                    c14951b = c14951b2;
                    it3 = ((List) objM36419j).iterator();
                    sg2Var2 = sg2Var52;
                    while (it3.hasNext()) {
                    }
                    objM53351b = vre.m53351b(y3i.f54824a);
                    it = sg2Var2;
                    h84Var3 = h84Var2;
                    boolean zM53357h222222 = vre.m53357h(objM53351b);
                    StringBuilder sb222222 = new StringBuilder();
                    sb222222.append("Result of processing: ");
                    sb222222.append(zM53357h222222);
                    vre.m53354e(objM53351b);
                    h84Var = h84Var3;
                    c14951b.f32933f = h84Var;
                    c14951b.f32928a = it;
                    c14951b.f32929b = null;
                    c14951b.f32930c = null;
                    c14951b.f32931d = null;
                    c14951b.f32932e = 1;
                    objMo23482a = it.mo23482a(c14951b);
                    if (objMo23482a == objM51918f) {
                    }
                }
            } else {
                sg2 sg2Var7 = (sg2) this.f32928a;
                h84 h84Var8 = (h84) this.f32933f;
                wre.m54934b(obj);
                objMo23482a = obj;
                sg2Var = sg2Var7;
                h84Var2 = h84Var8;
                c14951b2 = this;
                if (((Boolean) objMo23482a).booleanValue()) {
                }
            }
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C14951b) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.l0f$c */
    public static final class C14952c extends o64 {

        /* renamed from: a */
        public Object f32935a;

        /* renamed from: b */
        public int f32936b;

        /* renamed from: c */
        public int f32937c;

        /* renamed from: d */
        public long f32938d;

        /* renamed from: e */
        public /* synthetic */ Object f32939e;

        /* renamed from: g */
        public int f32941g;

        public C14952c(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f32939e = obj;
            this.f32941g |= Integer.MIN_VALUE;
            return l0f.this.m36419j(0, 0L, this);
        }
    }

    /* renamed from: o.l0f$d */
    public static final class C14953d extends jgg implements xk7 {

        /* renamed from: a */
        public int f32942a;

        /* renamed from: c */
        public final /* synthetic */ boolean f32944c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14953d(boolean z, n64 n64Var) {
            super(1, n64Var);
            this.f32944c = z;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return l0f.this.new C14953d(this.f32944c, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f32942a;
            if (i == 0) {
                wre.m54934b(obj);
                this.f32942a = 1;
                if (nk5.m40720b(500L, this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wre.m54934b(obj);
                    return y3i.f54824a;
                }
                wre.m54934b(obj);
            }
            jg2 jg2Var = l0f.this.f32922e;
            Boolean boolM39301a = ml1.m39301a(this.f32944c);
            this.f32942a = 2;
            if (jg2Var.mo23475l(boolM39301a, this) == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C14953d) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.l0f$e */
    public static final class C14954e extends cs1 {
        @Override // p001o.cs1
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Boolean mo21693a(String str) {
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            return Boolean.TRUE;
        }
    }

    /* renamed from: o.l0f$f */
    public static final class C14955f extends o64 {

        /* renamed from: a */
        public Object f32945a;

        /* renamed from: b */
        public Object f32946b;

        /* renamed from: c */
        public Object f32947c;

        /* renamed from: d */
        public /* synthetic */ Object f32948d;

        /* renamed from: f */
        public int f32950f;

        public C14955f(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f32948d = obj;
            this.f32950f |= Integer.MIN_VALUE;
            return l0f.this.m36421l(null, this);
        }
    }

    /* renamed from: o.l0f$g */
    public static final class C14956g extends o64 {

        /* renamed from: a */
        public Object f32951a;

        /* renamed from: b */
        public Object f32952b;

        /* renamed from: c */
        public long f32953c;

        /* renamed from: d */
        public /* synthetic */ Object f32954d;

        /* renamed from: f */
        public int f32956f;

        public C14956g(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f32954d = obj;
            this.f32956f |= Integer.MIN_VALUE;
            return l0f.this.m36422m(0L, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0f(Handler handler, Context context) {
        super(handler);
        sq8.m48649h(handler, "handler");
        sq8.m48649h(context, "context");
        this.f32918a = context;
        cha chaVarM53305b = vr1.m53298y().m53326w(DeviceOrientationRequest.OUTPUT_PERIOD_FAST).m53309f(10L, TimeUnit.MINUTES).m53305b(new C14954e());
        sq8.m48648g(chaVarM53305b, "build(...)");
        this.f32919b = chaVarM53305b;
        this.f32920c = "0";
        this.f32921d = System.currentTimeMillis();
        this.f32922e = tg2.m49824b(500, null, null, 6, null);
        h84 h84VarM43082j = p74.f39487a.m43082j();
        this.f32923f = h84VarM43082j;
        this.f32924g = tqb.m50340b(false, 1, null);
        this.f32925h = tqb.m50340b(false, 1, null);
        rm1.m46952d(h84VarM43082j, null, null, new C14950a(null), 3, null);
        m36417h();
    }

    /* renamed from: h */
    public final void m36417h() {
        rm1.m46952d(this.f32923f, a84.f14277a.m16672a(), null, new C14951b(null), 2, null);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x00be. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fb A[Catch: all -> 0x01c6, TryCatch #0 {all -> 0x01c6, blocks: (B:8:0x0055, B:10:0x005b, B:12:0x0069, B:13:0x0073, B:15:0x007b, B:17:0x0081, B:18:0x008b, B:20:0x0095, B:21:0x00a1, B:23:0x00ab, B:27:0x00be, B:28:0x00c1, B:29:0x00dc, B:30:0x00eb, B:37:0x011a, B:39:0x0122, B:40:0x012d, B:42:0x0135, B:44:0x0142, B:45:0x014f, B:47:0x0157, B:48:0x0163, B:50:0x016b, B:52:0x0171, B:58:0x017d, B:59:0x0184, B:61:0x0188, B:63:0x0190, B:65:0x0196, B:69:0x019f, B:70:0x01a2, B:32:0x00fb, B:34:0x010e, B:35:0x0114, B:71:0x01bf), top: B:81:0x0055 }] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List m36418i() throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        boolean z;
        int columnIndex;
        String string;
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = this.f32918a.getContentResolver().query(CallLog.Calls.CONTENT_URI, Build.VERSION.SDK_INT >= 31 ? new String[]{"_id", "number", "type", "missed_reason", "date", "duration", "subscription_id", "phone_account_address", "last_modified"} : new String[]{"_id", "number", "type", "date", "duration", "subscription_id", "phone_account_address", "last_modified"}, "_id > ? OR date > ?", new String[]{this.f32920c, String.valueOf(this.f32921d)}, "date ASC");
        if (cursorQuery != null) {
            while (cursorQuery.moveToNext()) {
                try {
                    CallEvent.Builder builder = new CallEvent.Builder();
                    int columnIndex2 = cursorQuery.getColumnIndex("_id");
                    if (columnIndex2 > -1) {
                        String string2 = cursorQuery.getString(columnIndex2);
                        builder.callId(string2);
                        builder.phoneCallLogId(string2);
                    }
                    int columnIndex3 = cursorQuery.getColumnIndex("number");
                    if (columnIndex3 > -1 && (string = cursorQuery.getString(columnIndex3)) != null) {
                        sq8.m48646e(string);
                        builder.number(e7d.m24492e(string));
                    }
                    int columnIndex4 = cursorQuery.getColumnIndex("duration");
                    if (columnIndex4 > -1) {
                        builder.duration(Long.valueOf(cursorQuery.getLong(columnIndex4) * 1000));
                    }
                    int columnIndex5 = cursorQuery.getColumnIndex("type");
                    if (columnIndex5 > -1) {
                        int i = cursorQuery.getInt(columnIndex5);
                        builder.callType(String.valueOf(i));
                        if (i == 100) {
                            builder.direction(CallDirection.OUTGOING.name());
                            if (cursorQuery.getLong(columnIndex4) > 0) {
                                builder.callConnectStatus(CallConnectStatus.CONNECTED);
                                z = true;
                            } else {
                                builder.callConnectStatus(CallConnectStatus.NOT_CONNECTED);
                                z = false;
                            }
                        } else {
                            if (i != 101) {
                                switch (i) {
                                    case 1:
                                        break;
                                    case 2:
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                        builder.direction(CallDirection.INCOMING.name());
                                        builder.callConnectStatus(CallConnectStatus.NOT_CONNECTED);
                                        z = false;
                                        break;
                                    default:
                                        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                                        firebaseCrashlytics.setCustomKey("idType", i);
                                        firebaseCrashlytics.setCustomKey("callEventId", this.f32920c);
                                        firebaseCrashlytics.recordException(new RuntimeException("CallLogCheck: Unknown type encountered"));
                                        z = false;
                                        break;
                                }
                            }
                            builder.direction(CallDirection.INCOMING.name());
                            builder.callConnectStatus(CallConnectStatus.CONNECTED);
                            z = true;
                        }
                    } else {
                        z = false;
                    }
                    int columnIndex6 = cursorQuery.getColumnIndex("date");
                    if (columnIndex6 > -1) {
                        builder.callStartTime(Long.valueOf(cursorQuery.getLong(columnIndex6)));
                    }
                    int columnIndex7 = cursorQuery.getColumnIndex("last_modified");
                    if (columnIndex7 > -1) {
                        long j = cursorQuery.getLong(columnIndex7);
                        builder.callEndTime(Long.valueOf(j));
                        if (z) {
                            builder.callConnectTime(Long.valueOf(j - (cursorQuery.getLong(columnIndex4) * 1000)));
                        }
                    }
                    int columnIndex8 = cursorQuery.getColumnIndex("subscription_id");
                    if (columnIndex8 > -1) {
                        builder.phoneHandle(new CallEvent.PhoneHandle(cursorQuery.getString(columnIndex8)));
                    }
                    int columnIndex9 = cursorQuery.getColumnIndex("phone_account_address");
                    if (columnIndex9 > -1) {
                        String string3 = cursorQuery.getString(columnIndex9);
                        if (!(string3 == null || string3.length() == 0)) {
                            builder.phone(e7d.m24492e(string3));
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 31 && (columnIndex = cursorQuery.getColumnIndex("missed_reason")) > -1) {
                        String string4 = cursorQuery.getString(columnIndex);
                        if (!(string4 == null || string4.length() == 0)) {
                            builder.hangupReason(string4);
                        }
                    }
                    builder.context(this.f32918a);
                    builder.callStatus("COMPLETED");
                    builder.isConnectedCall(Boolean.FALSE);
                    builder.source("CALL_LOG");
                    arrayList.add(builder.build());
                } finally {
                }
            }
            y3i y3iVar = y3i.f54824a;
            tb3.m49666a(cursorQuery, null);
        } else {
            FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
            firebaseCrashlytics2.recordException(new RuntimeException("Call log observer: Query returned null"));
            sq8.m48648g(firebaseCrashlytics2, "run(...)");
        }
        arrayList.isEmpty();
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x009d -> B:23:0x00a0). Please report as a decompilation issue!!! */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m36419j(int i, long j, n64 n64Var) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        C14952c c14952c;
        l0f l0fVar;
        int i2;
        int i3;
        long j2;
        if (n64Var instanceof C14952c) {
            c14952c = (C14952c) n64Var;
            int i4 = c14952c.f32941g;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c14952c.f32941g = i4 - Integer.MIN_VALUE;
            } else {
                c14952c = new C14952c(n64Var);
            }
        }
        Object obj = c14952c.f32939e;
        Object objM51918f = uq8.m51918f();
        int i5 = c14952c.f32941g;
        if (i5 == 0) {
            wre.m54934b(obj);
            l0fVar = this;
            i2 = i;
            i3 = 0;
            j2 = j;
            if (i3 < i2) {
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = c14952c.f32937c;
            long j3 = c14952c.f32938d;
            int i6 = c14952c.f32936b;
            l0fVar = (l0f) c14952c.f32935a;
            wre.m54934b(obj);
            j2 = j3;
            i2 = i6;
            i3++;
            if (i3 < i2) {
                List listM36418i = l0fVar.m36418i();
                if (!listM36418i.isEmpty()) {
                    int size = listM36418i.size();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Call events found on attempt ");
                    sb.append(i3 + 1);
                    sb.append(": ");
                    sb.append(size);
                    sb.append(" logs");
                    return listM36418i;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("No call events found, retrying... (Attempt ");
                sb2.append(i3 + 1);
                sb2.append("/");
                sb2.append(i2);
                sb2.append(")");
                c14952c.f32935a = l0fVar;
                c14952c.f32936b = i2;
                c14952c.f32938d = j2;
                c14952c.f32937c = i3;
                c14952c.f32941g = 1;
                if (nk5.m40720b(j2, c14952c) == objM51918f) {
                    return objM51918f;
                }
                i3++;
                if (i3 < i2) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("No call events found after ");
                    sb3.append(i2);
                    sb3.append(" attempts");
                    return ch3.m21246k();
                }
            }
        }
    }

    /* renamed from: k */
    public final void m36420k() throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        Cursor cursorQuery = this.f32918a.getContentResolver().query(CallLog.Calls.CONTENT_URI, new String[]{"_id", "date"}, null, null, "_id DESC");
        if (cursorQuery != null) {
            try {
                if (cursorQuery.moveToFirst()) {
                    int columnIndex = cursorQuery.getColumnIndex("_id");
                    int columnIndex2 = cursorQuery.getColumnIndex("date");
                    if (columnIndex > -1 && columnIndex2 > -1) {
                        String string = cursorQuery.getString(columnIndex);
                        sq8.m48648g(string, "getString(...)");
                        this.f32920c = string;
                        this.f32921d = cursorQuery.getLong(columnIndex2);
                    }
                }
                y3i y3iVar = y3i.f54824a;
                tb3.m49666a(cursorQuery, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    tb3.m49666a(cursorQuery, th);
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m36421l(String str, n64 n64Var) {
        C14955f c14955f;
        nqb nqbVar;
        l0f l0fVar;
        if (n64Var instanceof C14955f) {
            c14955f = (C14955f) n64Var;
            int i = c14955f.f32950f;
            if ((i & Integer.MIN_VALUE) != 0) {
                c14955f.f32950f = i - Integer.MIN_VALUE;
            } else {
                c14955f = new C14955f(n64Var);
            }
        }
        Object obj = c14955f.f32948d;
        Object objM51918f = uq8.m51918f();
        int i2 = c14955f.f32950f;
        if (i2 == 0) {
            wre.m54934b(obj);
            nqbVar = this.f32924g;
            c14955f.f32945a = this;
            c14955f.f32946b = str;
            c14955f.f32947c = nqbVar;
            c14955f.f32950f = 1;
            if (nqbVar.mo40922b(null, c14955f) == objM51918f) {
                return objM51918f;
            }
            l0fVar = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nqb nqbVar2 = (nqb) c14955f.f32947c;
            String str2 = (String) c14955f.f32946b;
            l0fVar = (l0f) c14955f.f32945a;
            wre.m54934b(obj);
            nqbVar = nqbVar2;
            str = str2;
        }
        try {
            l0fVar.f32920c = str;
            y3i y3iVar = y3i.f54824a;
            nqbVar.mo40923c(null);
            return y3i.f54824a;
        } catch (Throwable th) {
            nqbVar.mo40923c(null);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m36422m(long j, n64 n64Var) {
        C14956g c14956g;
        l0f l0fVar;
        nqb nqbVar;
        if (n64Var instanceof C14956g) {
            c14956g = (C14956g) n64Var;
            int i = c14956g.f32956f;
            if ((i & Integer.MIN_VALUE) != 0) {
                c14956g.f32956f = i - Integer.MIN_VALUE;
            } else {
                c14956g = new C14956g(n64Var);
            }
        }
        Object obj = c14956g.f32954d;
        Object objM51918f = uq8.m51918f();
        int i2 = c14956g.f32956f;
        if (i2 == 0) {
            wre.m54934b(obj);
            nqb nqbVar2 = this.f32925h;
            c14956g.f32951a = this;
            c14956g.f32952b = nqbVar2;
            c14956g.f32953c = j;
            c14956g.f32956f = 1;
            if (nqbVar2.mo40922b(null, c14956g) == objM51918f) {
                return objM51918f;
            }
            l0fVar = this;
            nqbVar = nqbVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = c14956g.f32953c;
            nqbVar = (nqb) c14956g.f32952b;
            l0fVar = (l0f) c14956g.f32951a;
            wre.m54934b(obj);
        }
        try {
            l0fVar.f32921d = j;
            y3i y3iVar = y3i.f54824a;
            nqbVar.mo40923c(null);
            return y3i.f54824a;
        } catch (Throwable th) {
            nqbVar.mo40923c(null);
            throw th;
        }
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        super.onChange(z);
        StringBuilder sb = new StringBuilder();
        sb.append("Change processed: ");
        sb.append(z);
        onChange(z, null);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z, Uri uri) {
        StringBuilder sb = new StringBuilder();
        sb.append("Change processed: ");
        sb.append(z);
        sb.append(" --> ");
        sb.append(uri);
        onChange(z, uri, 0);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z, Uri uri, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("Change processed: ");
        sb.append(z);
        sb.append(" --> ");
        sb.append(uri);
        sb.append(" --> ");
        sb.append(i);
        p74.f39487a.m43078f(this.f32923f, new C14953d(z, null));
    }
}
