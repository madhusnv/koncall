package p001o;

import p001o.m3g;

/* loaded from: classes2.dex */
public abstract class une {

    /* renamed from: o.une$a */
    public /* synthetic */ class C17412a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f49230a;

        static {
            int[] iArr = new int[qse.values().length];
            try {
                iArr[qse.STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[qse.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[qse.ADAPTIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f49230a = iArr;
        }
    }

    /* renamed from: o.une$b */
    public static final class C17413b extends o64 {

        /* renamed from: a */
        public Object f49231a;

        /* renamed from: b */
        public Object f49232b;

        /* renamed from: c */
        public /* synthetic */ Object f49233c;

        /* renamed from: d */
        public int f49234d;

        public C17413b(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f49233c = obj;
            this.f49234d |= Integer.MIN_VALUE;
            return une.m51833b(null, null, this);
        }
    }

    /* renamed from: o.une$c */
    public static final class C17414c extends jgg implements xk7 {

        /* renamed from: a */
        public int f49235a;

        /* renamed from: b */
        public final /* synthetic */ r9d f49236b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17414c(r9d r9dVar, n64 n64Var) {
            super(1, n64Var);
            this.f49236b = r9dVar;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return new C17414c(this.f49236b, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f49235a;
            if (i == 0) {
                wre.m54934b(obj);
                r9d r9dVar = this.f49236b;
                this.f49235a = 1;
                obj = n71.m40193c(r9dVar, null, null, this, 6, null);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return ((r81) obj).m46332a();
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C17414c) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m51833b(r9d r9dVar, ii9 ii9Var, n64 n64Var) {
        C17413b c17413b;
        Integer numM33404j;
        final Integer num;
        qse qseVarM33406l;
        int i;
        o06 o06Var;
        if (n64Var instanceof C17413b) {
            c17413b = (C17413b) n64Var;
            int i2 = c17413b.f49234d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c17413b.f49234d = i2 - Integer.MIN_VALUE;
            } else {
                c17413b = new C17413b(n64Var);
            }
        }
        Object objMo32174a = c17413b.f49233c;
        Object objM51918f = uq8.m51918f();
        int i3 = c17413b.f49234d;
        if (i3 == 0) {
            wre.m54934b(objMo32174a);
            numM33404j = (Integer) bj6.m19237f(o81.f37890a.m41741n(), r9dVar);
            if (numM33404j == null) {
                c17413b.f49231a = r9dVar;
                c17413b.f49232b = ii9Var;
                c17413b.f49234d = 1;
                objMo32174a = ii9Var.mo32174a(c17413b);
                if (objMo32174a == objM51918f) {
                    return objM51918f;
                }
            }
            ii9 ii9Var2 = ii9Var;
            r9d r9dVar2 = r9dVar;
            num = numM33404j;
            qseVarM33406l = (qse) bj6.m19237f(o81.f37890a.m41744q(), r9dVar2);
            if (qseVarM33406l == null) {
                c17413b.f49231a = num;
                c17413b.f49232b = null;
                c17413b.f49234d = 2;
                objMo32174a = ii9Var2.mo32174a(c17413b);
                if (objMo32174a == objM51918f) {
                    return objM51918f;
                }
                qseVarM33406l = j81.m33406l((vq3) objMo32174a);
                if (qseVarM33406l == null) {
                }
            }
            i = C17412a.f49230a[qseVarM33406l.ordinal()];
            if (i == 1) {
                o06Var = m3g.f34705b;
            }
            return o06Var.mo19519a(new xk7() { // from class: o.tne
                @Override // p001o.xk7
                public final Object invoke(Object obj) {
                    return une.m51835d(num, (m3g.C15211b.a) obj);
                }
            });
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            num = (Integer) c17413b.f49231a;
            wre.m54934b(objMo32174a);
            qseVarM33406l = j81.m33406l((vq3) objMo32174a);
            if (qseVarM33406l == null) {
                qseVarM33406l = qse.STANDARD;
            }
            i = C17412a.f49230a[qseVarM33406l.ordinal()];
            if (i == 1 || i == 2) {
                o06Var = m3g.f34705b;
            } else {
                if (i != 3) {
                    throw new szb();
                }
                o06Var = zv.f57735d;
            }
            return o06Var.mo19519a(new xk7() { // from class: o.tne
                @Override // p001o.xk7
                public final Object invoke(Object obj) {
                    return une.m51835d(num, (m3g.C15211b.a) obj);
                }
            });
        }
        ii9 ii9Var3 = (ii9) c17413b.f49232b;
        r9d r9dVar3 = (r9d) c17413b.f49231a;
        wre.m54934b(objMo32174a);
        ii9Var = ii9Var3;
        r9dVar = r9dVar3;
        numM33404j = j81.m33404j((vq3) objMo32174a);
        ii9 ii9Var22 = ii9Var;
        r9d r9dVar22 = r9dVar;
        num = numM33404j;
        qseVarM33406l = (qse) bj6.m19237f(o81.f37890a.m41744q(), r9dVar22);
        if (qseVarM33406l == null) {
        }
        i = C17412a.f49230a[qseVarM33406l.ordinal()];
        if (i == 1) {
        }
        return o06Var.mo19519a(new xk7() { // from class: o.tne
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return une.m51835d(num, (m3g.C15211b.a) obj);
            }
        });
    }

    /* renamed from: c */
    public static /* synthetic */ Object m51834c(r9d r9dVar, ii9 ii9Var, n64 n64Var, int i, Object obj) {
        if ((i & 1) != 0) {
            r9dVar = r9d.f43250a.m46382a();
        }
        if ((i & 2) != 0) {
            ii9Var = ki9.m35729a(new C17414c(r9dVar, null));
        }
        return m51833b(r9dVar, ii9Var, n64Var);
    }

    /* renamed from: d */
    public static final y3i m51835d(Integer num, m3g.C15211b.a aVar) {
        sq8.m48649h(aVar, "$this$factory");
        if (num != null) {
            int iIntValue = num.intValue();
            if (iIntValue < 1) {
                throw new zq3("max attempts was " + iIntValue + ", but should be at least 1");
            }
            aVar.m38276h(iIntValue);
        }
        return y3i.f54824a;
    }
}
