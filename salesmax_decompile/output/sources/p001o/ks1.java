package p001o;

import java.io.Closeable;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes3.dex */
public final class ks1 implements Closeable {

    /* renamed from: g */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f32642g = AtomicReferenceFieldUpdater.newUpdater(ks1.class, Object.class, "e");

    /* renamed from: h */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f32643h = AtomicIntegerFieldUpdater.newUpdater(ks1.class, "f");

    /* renamed from: a */
    public yo6 f32644a;

    /* renamed from: b */
    public final long f32645b;

    /* renamed from: c */
    public final hb3 f32646c;

    /* renamed from: d */
    public final zcf f32647d;

    /* renamed from: e */
    public volatile /* synthetic */ Object f32648e;

    /* renamed from: f */
    public volatile /* synthetic */ int f32649f;

    /* renamed from: o.ks1$a */
    public static final class C14918a extends o64 {

        /* renamed from: a */
        public Object f32650a;

        /* renamed from: b */
        public Object f32651b;

        /* renamed from: c */
        public Object f32652c;

        /* renamed from: d */
        public /* synthetic */ Object f32653d;

        /* renamed from: f */
        public int f32655f;

        public C14918a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f32653d = obj;
            this.f32655f |= Integer.MIN_VALUE;
            return ks1.this.m36182a(null, this);
        }
    }

    public /* synthetic */ ks1(yo6 yo6Var, long j, hb3 hb3Var, id5 id5Var) {
        this(yo6Var, j, hb3Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a7 A[Catch: all -> 0x003c, TryCatch #1 {all -> 0x003c, blocks: (B:13:0x0037, B:40:0x009e, B:44:0x00a7, B:46:0x00af, B:49:0x00b7, B:50:0x00c2, B:51:0x00c3, B:52:0x00cc), top: B:60:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c3 A[Catch: all -> 0x003c, TryCatch #1 {all -> 0x003c, blocks: (B:13:0x0037, B:40:0x009e, B:44:0x00a7, B:46:0x00af, B:49:0x00b7, B:50:0x00c2, B:51:0x00c3, B:52:0x00cc), top: B:60:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m36182a(xk7 xk7Var, n64 n64Var) throws Throwable {
        C14918a c14918a;
        zcf zcfVar;
        ks1 ks1Var;
        zcf zcfVar2;
        ks1 ks1Var2;
        yo6 yo6Var;
        if (n64Var instanceof C14918a) {
            c14918a = (C14918a) n64Var;
            int i = c14918a.f32655f;
            if ((i & Integer.MIN_VALUE) != 0) {
                c14918a.f32655f = i - Integer.MIN_VALUE;
            } else {
                c14918a = new C14918a(n64Var);
            }
        }
        Object obj = c14918a.f32653d;
        Object objM51918f = uq8.m51918f();
        int i2 = c14918a.f32655f;
        try {
            if (i2 == 0) {
                wre.m54934b(obj);
                zcfVar = this.f32647d;
                c14918a.f32650a = this;
                c14918a.f32651b = xk7Var;
                c14918a.f32652c = zcfVar;
                c14918a.f32655f = 1;
                if (zcfVar.m59213a(c14918a) == objM51918f) {
                    return objM51918f;
                }
                ks1Var = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yo6Var = (yo6) c14918a.f32652c;
                    zcfVar2 = (zcf) c14918a.f32651b;
                    ks1Var2 = (ks1) c14918a.f32650a;
                    try {
                        wre.m54934b(obj);
                        yo6 yo6Var2 = (yo6) obj;
                        if (ks1Var2.f32649f == 0) {
                            throw new IllegalStateException("value is closed".toString());
                        }
                        if (!j9.m33417a(f32642g, ks1Var2, yo6Var, yo6Var2)) {
                            throw new IllegalStateException("value changed during getOrLoad".toString());
                        }
                        Object objM58048b = yo6Var2.m58048b();
                        zcfVar2.release();
                        return objM58048b;
                    } catch (Throwable th) {
                        th = th;
                        zcfVar2.release();
                        throw th;
                    }
                }
                zcf zcfVar3 = (zcf) c14918a.f32652c;
                xk7 xk7Var2 = (xk7) c14918a.f32651b;
                ks1Var = (ks1) c14918a.f32650a;
                wre.m54934b(obj);
                zcfVar = zcfVar3;
                xk7Var = xk7Var2;
            }
            if (!(ks1Var.f32649f == 0)) {
                throw new IllegalStateException("value is closed".toString());
            }
            yo6 yo6VarM36183c = ks1Var.m36183c();
            if (yo6VarM36183c != null && !ks1Var.m36184d(yo6VarM36183c)) {
                Object objM58048b2 = yo6VarM36183c.m58048b();
                zcfVar.release();
                return objM58048b2;
            }
            c14918a.f32650a = ks1Var;
            c14918a.f32651b = zcfVar;
            c14918a.f32652c = yo6VarM36183c;
            c14918a.f32655f = 2;
            Object objInvoke = xk7Var.invoke(c14918a);
            if (objInvoke == objM51918f) {
                return objM51918f;
            }
            zcfVar2 = zcfVar;
            ks1Var2 = ks1Var;
            obj = objInvoke;
            yo6Var = yo6VarM36183c;
            yo6 yo6Var22 = (yo6) obj;
            if (ks1Var2.f32649f == 0) {
            }
        } catch (Throwable th2) {
            th = th2;
            zcfVar2 = zcfVar;
            zcfVar2.release();
            throw th;
        }
    }

    /* renamed from: c */
    public final yo6 m36183c() {
        return (yo6) this.f32648e;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Object obj;
        if (f32643h.compareAndSet(this, 0, 1)) {
            do {
                obj = this.f32648e;
            } while (!j9.m33417a(f32642g, this, obj, null));
        }
    }

    /* renamed from: d */
    public final boolean m36184d(yo6 yo6Var) {
        return this.f32646c.mo30148a().compareTo(yo6Var.m58047a().m28955j(this.f32645b)) >= 0;
    }

    public ks1(yo6 yo6Var, long j, hb3 hb3Var) {
        sq8.m48649h(hb3Var, "clock");
        this.f32644a = yo6Var;
        this.f32645b = j;
        this.f32646c = hb3Var;
        this.f32647d = ddf.m22828b(1, 0, 2, null);
        this.f32648e = this.f32644a;
        this.f32649f = 0;
    }
}
