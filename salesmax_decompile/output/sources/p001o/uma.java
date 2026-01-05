package p001o;

import java.util.LinkedHashMap;
import java.util.Set;

/* loaded from: classes3.dex */
public final class uma {

    /* renamed from: a */
    public final int f49125a;

    /* renamed from: b */
    public final nqb f49126b = tqb.m50340b(false, 1, null);

    /* renamed from: c */
    public final LinkedHashMap f49127c = new LinkedHashMap();

    /* renamed from: o.uma$a */
    public static final class C17401a extends o64 {

        /* renamed from: a */
        public Object f49128a;

        /* renamed from: b */
        public Object f49129b;

        /* renamed from: c */
        public Object f49130c;

        /* renamed from: d */
        public /* synthetic */ Object f49131d;

        /* renamed from: f */
        public int f49133f;

        public C17401a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f49131d = obj;
            this.f49133f |= Integer.MIN_VALUE;
            return uma.this.m51778a(null, this);
        }
    }

    /* renamed from: o.uma$b */
    public static final class C17402b extends o64 {

        /* renamed from: a */
        public Object f49134a;

        /* renamed from: b */
        public Object f49135b;

        /* renamed from: c */
        public Object f49136c;

        /* renamed from: d */
        public Object f49137d;

        /* renamed from: e */
        public /* synthetic */ Object f49138e;

        /* renamed from: g */
        public int f49140g;

        public C17402b(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f49138e = obj;
            this.f49140g |= Integer.MIN_VALUE;
            return uma.this.m51779b(null, null, this);
        }
    }

    public uma(int i) {
        this.f49125a = i;
        if (i > 0) {
            return;
        }
        throw new IllegalArgumentException(("cache capacity must be greater than 0, was " + i).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m51778a(Object obj, n64 n64Var) {
        C17401a c17401a;
        nqb nqbVar;
        uma umaVar;
        if (n64Var instanceof C17401a) {
            c17401a = (C17401a) n64Var;
            int i = c17401a.f49133f;
            if ((i & Integer.MIN_VALUE) != 0) {
                c17401a.f49133f = i - Integer.MIN_VALUE;
            } else {
                c17401a = new C17401a(n64Var);
            }
        }
        Object obj2 = c17401a.f49131d;
        Object objM51918f = uq8.m51918f();
        int i2 = c17401a.f49133f;
        if (i2 == 0) {
            wre.m54934b(obj2);
            nqbVar = this.f49126b;
            c17401a.f49128a = this;
            c17401a.f49129b = obj;
            c17401a.f49130c = nqbVar;
            c17401a.f49133f = 1;
            if (nqbVar.mo40922b(null, c17401a) == objM51918f) {
                return objM51918f;
            }
            umaVar = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nqb nqbVar2 = (nqb) c17401a.f49130c;
            Object obj3 = c17401a.f49129b;
            umaVar = (uma) c17401a.f49128a;
            wre.m54934b(obj2);
            nqbVar = nqbVar2;
            obj = obj3;
        }
        try {
            yma.m57999b(umaVar.f49127c, obj);
            return umaVar.f49127c.get(obj);
        } finally {
            nqbVar.mo40923c(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m51779b(Object obj, Object obj2, n64 n64Var) {
        C17402b c17402b;
        nqb nqbVar;
        uma umaVar;
        if (n64Var instanceof C17402b) {
            c17402b = (C17402b) n64Var;
            int i = c17402b.f49140g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c17402b.f49140g = i - Integer.MIN_VALUE;
            } else {
                c17402b = new C17402b(n64Var);
            }
        }
        Object obj3 = c17402b.f49138e;
        Object objM51918f = uq8.m51918f();
        int i2 = c17402b.f49140g;
        if (i2 == 0) {
            wre.m54934b(obj3);
            nqbVar = this.f49126b;
            c17402b.f49134a = this;
            c17402b.f49135b = obj;
            c17402b.f49136c = obj2;
            c17402b.f49137d = nqbVar;
            c17402b.f49140g = 1;
            if (nqbVar.mo40922b(null, c17402b) == objM51918f) {
                return objM51918f;
            }
            umaVar = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nqb nqbVar2 = (nqb) c17402b.f49137d;
            obj2 = c17402b.f49136c;
            Object obj4 = c17402b.f49135b;
            umaVar = (uma) c17402b.f49134a;
            wre.m54934b(obj3);
            nqbVar = nqbVar2;
            obj = obj4;
        }
        try {
            if (!umaVar.f49127c.containsKey(obj) && umaVar.f49127c.size() == umaVar.f49125a) {
                LinkedHashMap linkedHashMap = umaVar.f49127c;
                Set setKeySet = linkedHashMap.keySet();
                sq8.m48648g(setKeySet, "<get-keys>(...)");
                linkedHashMap.remove(kh3.e0(setKeySet));
            }
            umaVar.f49127c.put(obj, obj2);
            yma.m57999b(umaVar.f49127c, obj);
            return y3i.f54824a;
        } finally {
            nqbVar.mo40923c(null);
        }
    }
}
