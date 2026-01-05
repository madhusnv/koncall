package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class pvf implements hja {

    /* renamed from: b */
    public final qvf f40656b;

    /* renamed from: c */
    public final fja f40657c;

    /* renamed from: d */
    public uk7 f40658d;

    /* renamed from: e */
    public Throwable f40659e;

    /* renamed from: f */
    public final gi9 f40660f;

    /* renamed from: o.pvf$a */
    public /* synthetic */ class C16197a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f40661a;

        static {
            int[] iArr = new int[fja.values().length];
            try {
                iArr[fja.Error.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fja.Warning.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fja.Info.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[fja.Debug.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[fja.Trace.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f40661a = iArr;
        }
    }

    /* renamed from: o.pvf$b */
    public /* synthetic */ class C16198b extends dm7 implements nl7 {
        public C16198b(Object obj) {
            super(2, obj, qvf.class, Constants.IPC_BUNDLE_KEY_SEND_ERROR, "error(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;)V", 0);
        }

        /* renamed from: b */
        public final void m44244b(Throwable th, uk7 uk7Var) {
            sq8.m48649h(uk7Var, "p1");
            ((qvf) this.receiver).m48028g(th, uk7Var);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m44244b((Throwable) obj, (uk7) obj2);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.pvf$c */
    public /* synthetic */ class C16199c extends dm7 implements nl7 {
        public C16199c(Object obj) {
            super(2, obj, qvf.class, "warn", "warn(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;)V", 0);
        }

        /* renamed from: b */
        public final void m44245b(Throwable th, uk7 uk7Var) {
            sq8.m48649h(uk7Var, "p1");
            ((qvf) this.receiver).mo18186c(th, uk7Var);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m44245b((Throwable) obj, (uk7) obj2);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.pvf$d */
    public /* synthetic */ class C16200d extends dm7 implements nl7 {
        public C16200d(Object obj) {
            super(2, obj, qvf.class, "info", "info(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;)V", 0);
        }

        /* renamed from: b */
        public final void m44246b(Throwable th, uk7 uk7Var) {
            sq8.m48649h(uk7Var, "p1");
            ((qvf) this.receiver).mo18185b(th, uk7Var);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m44246b((Throwable) obj, (uk7) obj2);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.pvf$e */
    public /* synthetic */ class C16201e extends dm7 implements nl7 {
        public C16201e(Object obj) {
            super(2, obj, qvf.class, "debug", "debug(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;)V", 0);
        }

        /* renamed from: b */
        public final void m44247b(Throwable th, uk7 uk7Var) {
            sq8.m48649h(uk7Var, "p1");
            ((qvf) this.receiver).mo18187d(th, uk7Var);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m44247b((Throwable) obj, (uk7) obj2);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.pvf$f */
    public /* synthetic */ class C16202f extends dm7 implements nl7 {
        public C16202f(Object obj) {
            super(2, obj, qvf.class, "trace", "trace(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;)V", 0);
        }

        /* renamed from: b */
        public final void m44248b(Throwable th, uk7 uk7Var) {
            sq8.m48649h(uk7Var, "p1");
            ((qvf) this.receiver).mo18189f(th, uk7Var);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m44248b((Throwable) obj, (uk7) obj2);
            return y3i.f54824a;
        }
    }

    public pvf(qvf qvfVar, fja fjaVar) {
        sq8.m48649h(qvfVar, "delegate");
        sq8.m48649h(fjaVar, FirebaseAnalytics.Param.LEVEL);
        this.f40656b = qvfVar;
        this.f40657c = fjaVar;
        this.f40660f = si9.m48360a(new uk7() { // from class: o.ovf
            @Override // p001o.uk7
            public final Object invoke() {
                return pvf.m44242g();
            }
        });
    }

    /* renamed from: g */
    public static final Map m44242g() {
        return new LinkedHashMap();
    }

    @Override // p001o.hja
    /* renamed from: a */
    public void mo28154a(Throwable th) {
        sq8.m48649h(th, "ex");
        this.f40659e = th;
    }

    @Override // p001o.hja
    /* renamed from: b */
    public void mo28155b() {
        nl7 c16198b;
        uk7 uk7Var = this.f40658d;
        if (uk7Var == null) {
            throw new IllegalArgumentException("no message provided to LogRecordBuilder".toString());
        }
        int i = C16197a.f40661a[this.f40657c.ordinal()];
        if (i == 1) {
            c16198b = new C16198b(this.f40656b);
        } else if (i == 2) {
            c16198b = new C16199c(this.f40656b);
        } else if (i == 3) {
            c16198b = new C16200d(this.f40656b);
        } else if (i == 4) {
            c16198b = new C16201e(this.f40656b);
        } else {
            if (i != 5) {
                throw new szb();
            }
            c16198b = new C16202f(this.f40656b);
        }
        if (!(true ^ m44243f().isEmpty())) {
            c16198b.invoke(this.f40659e, uk7Var);
            return;
        }
        Map mapM23621b = dna.m23621b();
        try {
            for (Map.Entry entry : m44243f().entrySet()) {
                dna.m23622c((String) entry.getKey(), entry.getValue().toString());
            }
            c16198b.invoke(this.f40659e, uk7Var);
            if (mapM23621b == null) {
                dna.m23620a();
            } else {
                dna.m23623d(mapM23621b);
            }
        } catch (Throwable th) {
            if (mapM23621b == null) {
                dna.m23620a();
            } else {
                dna.m23623d(mapM23621b);
            }
            throw th;
        }
    }

    @Override // p001o.hja
    /* renamed from: c */
    public void mo28156c(String str, Object obj) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        sq8.m48649h(obj, "value");
        m44243f().put(str, obj);
    }

    @Override // p001o.hja
    /* renamed from: d */
    public void mo28157d(uk7 uk7Var) {
        sq8.m48649h(uk7Var, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        this.f40658d = uk7Var;
    }

    /* renamed from: f */
    public final Map m44243f() {
        return (Map) this.f40660f.getValue();
    }
}
