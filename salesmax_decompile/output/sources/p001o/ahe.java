package p001o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.message.TokenParser;
import p001o.qja;

/* loaded from: classes2.dex */
public abstract class ahe implements wge {

    /* renamed from: a */
    public final wge[] f14729a;

    /* renamed from: b */
    public final ii9 f14730b;

    /* renamed from: o.ahe$a */
    public static final class C12176a extends o64 {

        /* renamed from: a */
        public Object f14731a;

        /* renamed from: b */
        public Object f14732b;

        /* renamed from: c */
        public Object f14733c;

        /* renamed from: d */
        public int f14734d;

        /* renamed from: e */
        public int f14735e;

        /* renamed from: f */
        public /* synthetic */ Object f14736f;

        /* renamed from: h */
        public int f14738h;

        public C12176a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f14736f = obj;
            this.f14738h |= Integer.MIN_VALUE;
            return ahe.this.m17094o(this);
        }
    }

    /* renamed from: o.ahe$b */
    public /* synthetic */ class C12177b extends dm7 implements xk7 {
        public C12177b(Object obj) {
            super(1, obj, ahe.class, "resolveRegion", "resolveRegion(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // p001o.xk7
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(n64 n64Var) {
            return ((ahe) this.receiver).m17094o(n64Var);
        }
    }

    public ahe(wge... wgeVarArr) {
        sq8.m48649h(wgeVarArr, "providers");
        this.f14729a = wgeVarArr;
        this.f14730b = ki9.m35729a(new C12177b(this));
        if (!(!(wgeVarArr.length == 0))) {
            throw new IllegalArgumentException("at least one provider must be in the chain".toString());
        }
    }

    /* renamed from: k */
    public static /* synthetic */ Object m17089k(ahe aheVar, n64 n64Var) {
        return aheVar.f14730b.mo32174a(n64Var);
    }

    /* renamed from: r */
    public static final String m17090r(String str, wge wgeVar) {
        return "resolved region (" + str + ") from " + wgeVar + TokenParser.SP;
    }

    /* renamed from: s */
    public static final String m17091s(wge wgeVar) {
        return "failed to resolve region from " + wgeVar;
    }

    /* renamed from: t */
    public static final String m17092t(wge wgeVar, Exception exc) {
        return "unable to load region from " + wgeVar + ": " + exc.getMessage();
    }

    @Override // p001o.wge
    /* renamed from: a */
    public Object mo16988a(n64 n64Var) {
        return m17089k(this, n64Var);
    }

    /* renamed from: h */
    public final wge[] m17093h() {
        return this.f14729a;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007e A[Catch: Exception -> 0x003a, TryCatch #0 {Exception -> 0x003a, blocks: (B:12:0x0036, B:26:0x007a, B:28:0x007e, B:30:0x0087, B:23:0x0067), top: B:37:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0087 A[Catch: Exception -> 0x003a, TRY_LEAVE, TryCatch #0 {Exception -> 0x003a, blocks: (B:12:0x0036, B:26:0x007a, B:28:0x007e, B:30:0x0087, B:23:0x0067), top: B:37:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0077 -> B:26:0x007a). Please report as a decompilation issue!!! */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m17094o(n64 n64Var) {
        C12176a c12176a;
        qja qjaVar;
        wge[] wgeVarArr;
        int length;
        int i;
        if (n64Var instanceof C12176a) {
            c12176a = (C12176a) n64Var;
            int i2 = c12176a.f14738h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c12176a.f14738h = i2 - Integer.MIN_VALUE;
            } else {
                c12176a = new C12176a(n64Var);
            }
        }
        Object objMo16988a = c12176a.f14736f;
        Object objM51918f = uq8.m51918f();
        int i3 = c12176a.f14738h;
        if (i3 == 0) {
            wre.m54934b(objMo16988a);
            q74 context = c12176a.getContext();
            String strMo26336c = kge.m35689b(ahe.class).mo26336c();
            if (strMo26336c == null) {
                throw new IllegalArgumentException("logger<T> cannot be used on an anonymous object".toString());
            }
            qja qjaVarM52400e = v74.m52400e(context, strMo26336c);
            wge[] wgeVarArr2 = this.f14729a;
            qjaVar = qjaVarM52400e;
            wgeVarArr = wgeVarArr2;
            length = wgeVarArr2.length;
            i = 0;
            if (i < length) {
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            length = c12176a.f14735e;
            i = c12176a.f14734d;
            final wge wgeVar = (wge) c12176a.f14733c;
            wgeVarArr = (wge[]) c12176a.f14732b;
            qjaVar = (qja) c12176a.f14731a;
            try {
                wre.m54934b(objMo16988a);
            } catch (Exception e) {
                qja.C16414b.m45548a(qjaVar, null, new uk7() { // from class: o.zge
                    @Override // p001o.uk7
                    public final Object invoke() {
                        return ahe.m17092t(wgeVar, e);
                    }
                }, 1, null);
            }
            final String str = (String) objMo16988a;
            if (str == null) {
                qja.C16414b.m45548a(qjaVar, null, new uk7() { // from class: o.xge
                    @Override // p001o.uk7
                    public final Object invoke() {
                        return ahe.m17090r(str, wgeVar);
                    }
                }, 1, null);
                return str;
            }
            qja.C16414b.m45548a(qjaVar, null, new uk7() { // from class: o.yge
                @Override // p001o.uk7
                public final Object invoke() {
                    return ahe.m17091s(wgeVar);
                }
            }, 1, null);
            i++;
            if (i < length) {
                return null;
            }
            wgeVar = wgeVarArr[i];
            c12176a.f14731a = qjaVar;
            c12176a.f14732b = wgeVarArr;
            c12176a.f14733c = wgeVar;
            c12176a.f14734d = i;
            c12176a.f14735e = length;
            c12176a.f14738h = 1;
            objMo16988a = wgeVar.mo16988a(c12176a);
            if (objMo16988a == objM51918f) {
                return objM51918f;
            }
            final String str2 = (String) objMo16988a;
            if (str2 == null) {
            }
        }
    }

    public String toString() {
        List listZ0 = kh3.z0(bh3.m18963e(this), this.f14729a);
        ArrayList arrayList = new ArrayList(dh3.m23088v(listZ0, 10));
        Iterator it = listZ0.iterator();
        while (it.hasNext()) {
            arrayList.add(kge.m35689b(((wge) it.next()).getClass()).mo26337d());
        }
        return kh3.p0(arrayList, " -> ", null, null, 0, null, null, 62, null);
    }
}
