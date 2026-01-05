package p001o;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class sne {

    /* renamed from: o.sne$a */
    public static final class C16878a extends o64 {

        /* renamed from: a */
        public Object f45682a;

        /* renamed from: b */
        public int f45683b;

        /* renamed from: c */
        public /* synthetic */ Object f45684c;

        /* renamed from: d */
        public int f45685d;

        public C16878a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f45684c = obj;
            this.f45685d |= Integer.MIN_VALUE;
            return sne.m48583a(null, null, this);
        }
    }

    /* renamed from: o.sne$b */
    public static final class C16879b extends jgg implements xk7 {

        /* renamed from: a */
        public int f45686a;

        /* renamed from: b */
        public final /* synthetic */ r9d f45687b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16879b(r9d r9dVar, n64 n64Var) {
            super(1, n64Var);
            this.f45687b = r9dVar;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return new C16879b(this.f45687b, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f45686a;
            if (i == 0) {
                wre.m54934b(obj);
                r9d r9dVar = this.f45687b;
                this.f45686a = 1;
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
            return ((C16879b) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.sne$c */
    public static final class C16880c extends o64 {

        /* renamed from: a */
        public /* synthetic */ Object f45688a;

        /* renamed from: b */
        public int f45689b;

        public C16880c(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f45688a = obj;
            this.f45689b |= Integer.MIN_VALUE;
            return sne.m48585c(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m48583a(r9d r9dVar, ii9 ii9Var, n64 n64Var) throws Throwable {
        C16878a c16878a;
        Closeable closeable;
        if (n64Var instanceof C16878a) {
            c16878a = (C16878a) n64Var;
            int i = c16878a.f45685d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16878a.f45685d = i - Integer.MIN_VALUE;
            } else {
                c16878a = new C16878a(n64Var);
            }
        }
        Object obj = c16878a.f45684c;
        Object objM51918f = uq8.m51918f();
        int i2 = c16878a.f45685d;
        if (i2 == 0) {
            wre.m54934b(obj);
            eg5 eg5Var = new eg5(r9dVar, null, ii9Var, 2, null);
            try {
                c16878a.f45682a = eg5Var;
                c16878a.f45683b = 0;
                c16878a.f45685d = 1;
                Object objMo16988a = eg5Var.mo16988a(c16878a);
                if (objMo16988a == objM51918f) {
                    return objM51918f;
                }
                obj = objMo16988a;
                closeable = eg5Var;
            } catch (Throwable th) {
                th = th;
                closeable = eg5Var;
                closeable.close();
                throw th;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            closeable = (Closeable) c16878a.f45682a;
            try {
                wre.m54934b(obj);
            } catch (Throwable th2) {
                th = th2;
                try {
                    closeable.close();
                } catch (Throwable th3) {
                    cl6.m21376a(th, th3);
                }
                throw th;
            }
        }
        String str = (String) obj;
        closeable.close();
        return str;
    }

    /* renamed from: b */
    public static /* synthetic */ Object m48584b(r9d r9dVar, ii9 ii9Var, n64 n64Var, int i, Object obj) {
        if ((i & 1) != 0) {
            r9dVar = r9d.f43250a.m46382a();
        }
        if ((i & 2) != 0) {
            ii9Var = ki9.m35729a(new C16879b(r9dVar, null));
        }
        return m48583a(r9dVar, ii9Var, n64Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m48585c(r9d r9dVar, ii9 ii9Var, n64 n64Var) {
        C16880c c16880c;
        String strM33409o;
        String str;
        List listD0;
        if (n64Var instanceof C16880c) {
            c16880c = (C16880c) n64Var;
            int i = c16880c.f45689b;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16880c.f45689b = i - Integer.MIN_VALUE;
            } else {
                c16880c = new C16880c(n64Var);
            }
        }
        Object objMo32174a = c16880c.f45688a;
        Object objM51918f = uq8.m51918f();
        int i2 = c16880c.f45689b;
        if (i2 == 0) {
            wre.m54934b(objMo32174a);
            strM33409o = (String) bj6.m19237f(o81.f37890a.m41750w(), r9dVar);
            if (strM33409o == null) {
                c16880c.f45689b = 1;
                objMo32174a = ii9Var.mo32174a(c16880c);
                if (objMo32174a == objM51918f) {
                    return objM51918f;
                }
            }
            str = strM33409o;
            if (str != null || (listD0 = f9g.D0(str, new String[]{","}, false, 0, 6, null)) == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(dh3.m23088v(listD0, 10));
            Iterator it = listD0.iterator();
            while (it.hasNext()) {
                arrayList.add(f9g.Z0((String) it.next()).toString());
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((String) obj).length() > 0) {
                    arrayList2.add(obj);
                }
            }
            return kh3.V0(arrayList2);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        wre.m54934b(objMo32174a);
        strM33409o = j81.m33409o((vq3) objMo32174a);
        str = strM33409o;
        if (str != null) {
        }
        return null;
    }
}
