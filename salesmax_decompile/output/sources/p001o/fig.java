package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class fig implements r9d {

    /* renamed from: b */
    public static final fig f23418b = new fig();

    /* renamed from: c */
    public static final boolean f23419c = true;

    /* renamed from: d */
    public static final gi9 f23420d = si9.m48360a(new uk7() { // from class: o.dig
        @Override // p001o.uk7
        public final Object invoke() {
            return Boolean.valueOf(fig.m26792m());
        }
    });

    /* renamed from: e */
    public static final gi9 f23421e = si9.m48360a(new uk7() { // from class: o.eig
        @Override // p001o.uk7
        public final Object invoke() {
            return fig.m26791l();
        }
    });

    /* renamed from: o.fig$a */
    public static final class C13447a extends o64 {

        /* renamed from: a */
        public /* synthetic */ Object f23422a;

        /* renamed from: c */
        public int f23424c;

        public C13447a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f23422a = obj;
            this.f23424c |= Integer.MIN_VALUE;
            return fig.this.mo18076d(null, this);
        }
    }

    /* renamed from: o.fig$b */
    public static final class C13448b extends jgg implements nl7 {

        /* renamed from: a */
        public int f23425a;

        /* renamed from: b */
        public final /* synthetic */ String f23426b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13448b(String str, n64 n64Var) {
            super(2, n64Var);
            this.f23426b = str;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C13448b(this.f23426b, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            uq8.m51918f();
            if (this.f23425a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            return yz6.m58553c(new File(this.f23426b));
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C13448b) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.fig$c */
    public static final class C13449c extends jgg implements nl7 {

        /* renamed from: a */
        public int f23427a;

        /* renamed from: b */
        public final /* synthetic */ String f23428b;

        /* renamed from: c */
        public final /* synthetic */ byte[] f23429c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13449c(String str, byte[] bArr, n64 n64Var) {
            super(2, n64Var);
            this.f23428b = str;
            this.f23429c = bArr;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C13449c(this.f23428b, this.f23429c, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
            uq8.m51918f();
            if (this.f23427a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            yz6.m58556f(new File(this.f23428b), this.f23429c);
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C13449c) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: l */
    public static final String m26791l() {
        return File.separator;
    }

    /* renamed from: m */
    public static final boolean m26792m() {
        return l9d.m36814d();
    }

    @Override // p001o.r9d
    /* renamed from: a */
    public odc mo26793a() {
        return l9d.m36813c();
    }

    @Override // p001o.srd
    /* renamed from: b */
    public Map mo26794b() {
        Set setEntrySet = System.getProperties().entrySet();
        sq8.m48648g(setEntrySet, "<get-entries>(...)");
        Set<Map.Entry> set = setEntrySet;
        LinkedHashMap linkedHashMap = new LinkedHashMap(bce.m18601d(hsa.m31055e(dh3.m23088v(set, 10)), 16));
        for (Map.Entry entry : set) {
            sq8.m48646e(entry);
            hwc hwcVarM53620a = vyh.m53620a(entry.getKey().toString(), entry.getValue().toString());
            linkedHashMap.put(hwcVarM53620a.m31229c(), hwcVarM53620a.m31230d());
        }
        return linkedHashMap;
    }

    @Override // p001o.r9d
    /* renamed from: c */
    public boolean mo26795c() {
        return ((Boolean) f23420d.getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p001o.b07
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo18076d(String str, n64 n64Var) {
        C13447a c13447a;
        if (n64Var instanceof C13447a) {
            c13447a = (C13447a) n64Var;
            int i = c13447a.f23424c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c13447a.f23424c = i - Integer.MIN_VALUE;
            } else {
                c13447a = new C13447a(n64Var);
            }
        }
        Object objM43867g = c13447a.f23422a;
        Object objM51918f = uq8.m51918f();
        int i2 = c13447a.f23424c;
        try {
            if (i2 == 0) {
                wre.m54934b(objM43867g);
                z74 z74VarM25611b = eu5.m25611b();
                C13448b c13448b = new C13448b(str, null);
                c13447a.f23424c = 1;
                objM43867g = pm1.m43867g(z74VarM25611b, c13448b, c13447a);
                if (objM43867g == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(objM43867g);
            }
            return (byte[]) objM43867g;
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // p001o.srd
    /* renamed from: e */
    public String mo26796e(String str) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        return System.getProperty(str);
    }

    @Override // p001o.b07
    /* renamed from: f */
    public Object mo18077f(String str, byte[] bArr, n64 n64Var) {
        Object objM43867g = pm1.m43867g(eu5.m25611b(), new C13449c(str, bArr, null), n64Var);
        return objM43867g == uq8.m51918f() ? objM43867g : y3i.f54824a;
    }

    @Override // p001o.ri6
    /* renamed from: g */
    public Map mo26797g() {
        Map<String, String> map = System.getenv();
        sq8.m48648g(map, "getenv(...)");
        return map;
    }

    @Override // p001o.b07
    /* renamed from: h */
    public String mo18078h() {
        Object value = f23421e.getValue();
        sq8.m48648g(value, "getValue(...)");
        return (String) value;
    }

    @Override // p001o.ri6
    /* renamed from: i */
    public String mo26798i(String str) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        return System.getenv().get(str);
    }
}
