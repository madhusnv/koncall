package p001o;

import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class kg5 implements axe {

    /* renamed from: a */
    public final fxe f32210a;

    /* renamed from: b */
    public final Map f32211b = hsa.m31056f(vyh.m53620a("WriteGetObjectResponse", bh3.m18963e(orf.m42606d(true, null, null, null, null, 30, null))));

    /* renamed from: c */
    public final List f32212c = ch3.m21249n(orf.m42606d(false, null, null, null, null, 31, null), mrf.m39528b(false, null, null, null, null, 31, null), qrf.m45816c(false, null, null, null, null, 31, null));

    /* renamed from: o.kg5$a */
    public static final class C14828a extends o64 {

        /* renamed from: a */
        public Object f32213a;

        /* renamed from: b */
        public /* synthetic */ Object f32214b;

        /* renamed from: d */
        public int f32216d;

        public C14828a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f32214b = obj;
            this.f32216d |= Integer.MIN_VALUE;
            return kg5.this.mo22809a(null, this);
        }
    }

    public kg5(fxe fxeVar) {
        this.f32210a = fxeVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p001o.e01
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo22809a(zwe zweVar, n64 n64Var) {
        C14828a c14828a;
        List listM21246k;
        List list;
        if (n64Var instanceof C14828a) {
            c14828a = (C14828a) n64Var;
            int i = c14828a.f32216d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c14828a.f32216d = i - Integer.MIN_VALUE;
            } else {
                c14828a = new C14828a(n64Var);
            }
        }
        Object obj = c14828a.f32214b;
        Object objM51918f = uq8.m51918f();
        int i2 = c14828a.f32216d;
        if (i2 == 0) {
            wre.m54934b(obj);
            Object obj2 = this.f32211b.get(zweVar.m60047b());
            if (obj2 == null) {
                obj2 = this.f32212c;
            }
            List list2 = (List) obj2;
            exe exeVarM60046a = zweVar.m60046a();
            fxe fxeVar = this.f32210a;
            if (fxeVar == null || exeVarM60046a == null) {
                listM21246k = ch3.m21246k();
                list = list2;
                return c86.m20440a(list, listM21246k);
            }
            c14828a.f32213a = list2;
            c14828a.f32216d = 1;
            Object objResolveEndpoint = fxeVar.resolveEndpoint(exeVarM60046a, c14828a);
            if (objResolveEndpoint == objM51918f) {
                return objM51918f;
            }
            obj = objResolveEndpoint;
            list = list2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) c14828a.f32213a;
            wre.m54934b(obj);
        }
        listM21246k = bsf.m19699a((b86) obj);
        return c86.m20440a(list, listM21246k);
    }
}
