package p001o;

import com.google.android.gms.cast.MediaStatus;
import p001o.dx7;
import p001o.u6f;
import p001o.z81;

/* loaded from: classes3.dex */
public final class h71 {

    /* renamed from: a */
    public final InterfaceC13880a f26285a;

    /* renamed from: b */
    public final v81 f26286b;

    /* renamed from: c */
    public final z81 f26287c;

    /* renamed from: d */
    public byte[] f26288d;

    /* renamed from: e */
    public final ek5 f26289e;

    /* renamed from: f */
    public final t6f f26290f;

    /* renamed from: g */
    public boolean f26291g;

    /* renamed from: o.h71$a */
    public interface InterfaceC13880a {
        boolean isClosedForRead();

        Object read(t6f t6fVar, long j, n64 n64Var);
    }

    /* renamed from: o.h71$b */
    public static final class C13881b extends o64 {

        /* renamed from: a */
        public Object f26292a;

        /* renamed from: b */
        public /* synthetic */ Object f26293b;

        /* renamed from: d */
        public int f26295d;

        public C13881b(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f26293b = obj;
            this.f26295d |= Integer.MIN_VALUE;
            return h71.this.m29853f(this);
        }
    }

    /* renamed from: o.h71$c */
    public static final class C13882c extends o64 {

        /* renamed from: a */
        public Object f26296a;

        /* renamed from: b */
        public Object f26297b;

        /* renamed from: c */
        public /* synthetic */ Object f26298c;

        /* renamed from: e */
        public int f26300e;

        public C13882c(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f26298c = obj;
            this.f26300e |= Integer.MIN_VALUE;
            return h71.this.m29855h(this);
        }
    }

    /* renamed from: o.h71$d */
    public static final class C13883d extends o64 {

        /* renamed from: a */
        public Object f26301a;

        /* renamed from: b */
        public Object f26302b;

        /* renamed from: c */
        public /* synthetic */ Object f26303c;

        /* renamed from: e */
        public int f26305e;

        public C13883d(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f26303c = obj;
            this.f26305e |= Integer.MIN_VALUE;
            return h71.this.m29857j(null, this);
        }
    }

    /* renamed from: o.h71$e */
    public static final class C13884e extends o64 {

        /* renamed from: a */
        public Object f26306a;

        /* renamed from: b */
        public Object f26307b;

        /* renamed from: c */
        public /* synthetic */ Object f26308c;

        /* renamed from: e */
        public int f26310e;

        public C13884e(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f26308c = obj;
            this.f26310e |= Integer.MIN_VALUE;
            return h71.this.m29858l(null, this);
        }
    }

    /* renamed from: o.h71$f */
    public static final class C13885f extends o64 {

        /* renamed from: a */
        public /* synthetic */ Object f26311a;

        /* renamed from: c */
        public int f26313c;

        public C13885f(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f26311a = obj;
            this.f26313c |= Integer.MIN_VALUE;
            return h71.this.m29859m(null, this);
        }
    }

    /* renamed from: o.h71$g */
    public static final class C13886g extends o64 {

        /* renamed from: a */
        public Object f26314a;

        /* renamed from: b */
        public Object f26315b;

        /* renamed from: c */
        public long f26316c;

        /* renamed from: d */
        public /* synthetic */ Object f26317d;

        /* renamed from: f */
        public int f26319f;

        public C13886g(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f26317d = obj;
            this.f26319f |= Integer.MIN_VALUE;
            return h71.this.m29861p(null, this);
        }
    }

    public h71(InterfaceC13880a interfaceC13880a, v81 v81Var, z81 z81Var, byte[] bArr, ek5 ek5Var) {
        sq8.m48649h(interfaceC13880a, "stream");
        sq8.m48649h(v81Var, "signer");
        sq8.m48649h(z81Var, "signingConfig");
        sq8.m48649h(bArr, "previousSignature");
        sq8.m48649h(ek5Var, "trailingHeaders");
        this.f26285a = interfaceC13880a;
        this.f26286b = v81Var;
        this.f26287c = z81Var;
        this.f26288d = bArr;
        this.f26289e = ek5Var;
        this.f26290f = new t6f();
    }

    /* renamed from: k */
    public static /* synthetic */ Object m29851k(h71 h71Var, t6f t6fVar, n64 n64Var, int i, Object obj) {
        if ((i & 1) != 0) {
            t6fVar = null;
        }
        return h71Var.m29857j(t6fVar, n64Var);
    }

    /* renamed from: n */
    public static /* synthetic */ Object m29852n(h71 h71Var, t6f t6fVar, n64 n64Var, int i, Object obj) {
        if ((i & 1) != 0) {
            t6fVar = null;
        }
        return h71Var.m29859m(t6fVar, n64Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m29853f(n64 n64Var) {
        C13881b c13881b;
        t6f t6fVar;
        h71 h71Var;
        h71 h71Var2;
        t6f t6fVar2;
        if (n64Var instanceof C13881b) {
            c13881b = (C13881b) n64Var;
            int i = c13881b.f26295d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c13881b.f26295d = i - Integer.MIN_VALUE;
            } else {
                c13881b = new C13881b(n64Var);
            }
        }
        Object objM29851k = c13881b.f26293b;
        Object objM51918f = uq8.m51918f();
        int i2 = c13881b.f26295d;
        if (i2 == 0) {
            wre.m54934b(objM29851k);
            if (this.f26290f.m49489c() > 0) {
                return ml1.m39301a(true);
            }
            t6fVar = null;
            if (this.f26285a.isClosedForRead() && this.f26291g) {
                h71Var2 = this;
                if (t6fVar != null) {
                }
                if (t6fVar != null) {
                }
                return ml1.m39301a(h71Var2.f26290f.m49489c() > 0);
            }
            boolean zM29860o = m29860o(this.f26287c);
            c13881b.f26292a = this;
            if (zM29860o) {
                c13881b.f26295d = 1;
                objM29851k = m29852n(this, null, c13881b, 1, null);
                if (objM29851k == objM51918f) {
                    return objM51918f;
                }
                h71Var = this;
                t6fVar2 = (t6f) objM29851k;
            } else {
                c13881b.f26295d = 2;
                objM29851k = m29851k(this, null, c13881b, 1, null);
                if (objM29851k == objM51918f) {
                    return objM51918f;
                }
                h71Var = this;
                t6fVar2 = (t6f) objM29851k;
            }
        } else if (i2 == 1) {
            h71Var = (h71) c13881b.f26292a;
            wre.m54934b(objM29851k);
            t6fVar2 = (t6f) objM29851k;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h71Var2 = (h71) c13881b.f26292a;
                wre.m54934b(objM29851k);
                t6fVar2 = (t6f) objM29851k;
                h71Var2.f26291g = true;
                t6fVar = t6fVar2;
                if (t6fVar != null) {
                    u6f.C17307a.m51045b(t6fVar, "\r\n", 0, 0, 6, null);
                }
                if (t6fVar != null) {
                    ml1.m39305e(h71Var2.f26290f.B0(t6fVar));
                }
                return ml1.m39301a(h71Var2.f26290f.m49489c() > 0);
            }
            h71Var = (h71) c13881b.f26292a;
            wre.m54934b(objM29851k);
            t6fVar2 = (t6f) objM29851k;
        }
        if (t6fVar2 != null) {
            h71Var2 = h71Var;
            t6fVar = t6fVar2;
            if (t6fVar != null) {
            }
            if (t6fVar != null) {
            }
            return ml1.m39301a(h71Var2.f26290f.m49489c() > 0);
        }
        if (!h71Var.f26285a.isClosedForRead()) {
            throw new IllegalStateException("Expected underlying reader to be closed".toString());
        }
        c13881b.f26292a = h71Var;
        c13881b.f26295d = 3;
        objM29851k = h71Var.m29855h(c13881b);
        if (objM29851k == objM51918f) {
            return objM51918f;
        }
        h71Var2 = h71Var;
        t6fVar2 = (t6f) objM29851k;
        h71Var2.f26291g = true;
        t6fVar = t6fVar2;
        if (t6fVar != null) {
        }
        if (t6fVar != null) {
        }
        return ml1.m39301a(h71Var2.f26290f.m49489c() > 0);
    }

    /* renamed from: g */
    public final t6f m29854g() {
        return this.f26290f;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m29855h(n64 n64Var) {
        C13882c c13882c;
        h71 h71Var;
        t6f t6fVar;
        t6f t6fVar2;
        if (n64Var instanceof C13882c) {
            c13882c = (C13882c) n64Var;
            int i = c13882c.f26300e;
            if ((i & Integer.MIN_VALUE) != 0) {
                c13882c.f26300e = i - Integer.MIN_VALUE;
            } else {
                c13882c = new C13882c(n64Var);
            }
        }
        Object objM29857j = c13882c.f26298c;
        Object objM51918f = uq8.m51918f();
        int i2 = c13882c.f26300e;
        if (i2 == 0) {
            wre.m54934b(objM29857j);
            if (m29860o(this.f26287c)) {
                t6f t6fVar3 = new t6f();
                c13882c.f26296a = this;
                c13882c.f26300e = 1;
                objM29857j = m29859m(t6fVar3, c13882c);
                if (objM29857j == objM51918f) {
                    return objM51918f;
                }
            } else {
                t6f t6fVar4 = new t6f();
                c13882c.f26296a = this;
                c13882c.f26300e = 2;
                objM29857j = m29857j(t6fVar4, c13882c);
                if (objM29857j == objM51918f) {
                    return objM51918f;
                }
            }
            h71Var = this;
        } else {
            if (i2 != 1 && i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t6fVar2 = (t6f) c13882c.f26296a;
                    wre.m54934b(objM29857j);
                    t6fVar2.B0((t6f) objM29857j);
                    return t6fVar2;
                }
                h71Var = (h71) c13882c.f26297b;
                t6fVar = (t6f) c13882c.f26296a;
                wre.m54934b(objM29857j);
                c13882c.f26296a = t6fVar;
                c13882c.f26297b = null;
                c13882c.f26300e = 4;
                objM29857j = h71Var.m29858l((ux7) objM29857j, c13882c);
                if (objM29857j != objM51918f) {
                    return objM51918f;
                }
                t6fVar2 = t6fVar;
                t6fVar2.B0((t6f) objM29857j);
                return t6fVar2;
            }
            h71Var = (h71) c13882c.f26296a;
            wre.m54934b(objM29857j);
        }
        t6f t6fVar5 = (t6f) objM29857j;
        if (t6fVar5 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        if (h71Var.f26289e.isEmpty()) {
            return t6fVar5;
        }
        ek5 ek5Var = h71Var.f26289e;
        c13882c.f26296a = t6fVar5;
        c13882c.f26297b = h71Var;
        c13882c.f26300e = 3;
        Object objM30679a = hk5.m30679a(ek5Var, c13882c);
        if (objM30679a == objM51918f) {
            return objM51918f;
        }
        t6fVar = t6fVar5;
        objM29857j = objM30679a;
        c13882c.f26296a = t6fVar;
        c13882c.f26297b = null;
        c13882c.f26300e = 4;
        objM29857j = h71Var.m29858l((ux7) objM29857j, c13882c);
        if (objM29857j != objM51918f) {
        }
    }

    /* renamed from: i */
    public final boolean m29856i() {
        return this.f26291g;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m29857j(t6f t6fVar, n64 n64Var) {
        C13883d c13883d;
        h71 h71Var;
        h71 h71Var2;
        byte[] bArrMo49492m;
        byte[] bArr;
        h71 h71Var3;
        if (n64Var instanceof C13883d) {
            c13883d = (C13883d) n64Var;
            int i = c13883d.f26305e;
            if ((i & Integer.MIN_VALUE) != 0) {
                c13883d.f26305e = i - Integer.MIN_VALUE;
            } else {
                c13883d = new C13883d(n64Var);
            }
        }
        Object objM29861p = c13883d.f26303c;
        Object objM51918f = uq8.m51918f();
        int i2 = c13883d.f26305e;
        if (i2 == 0) {
            wre.m54934b(objM29861p);
            if (t6fVar != null) {
                h71Var = this;
                if (t6fVar == null && (bArrMo49492m = t6fVar.mo49492m()) != null) {
                    v81 v81Var = h71Var.f26286b;
                    byte[] bArr2 = h71Var.f26288d;
                    z81 z81VarM29862q = h71Var.m29862q(h71Var.f26287c);
                    c13883d.f26301a = h71Var;
                    c13883d.f26302b = bArrMo49492m;
                    c13883d.f26305e = 2;
                    Object objMo18581b = v81Var.mo18581b(bArrMo49492m, bArr2, z81VarM29862q, c13883d);
                    if (objMo18581b == objM51918f) {
                        return objM51918f;
                    }
                    bArr = bArrMo49492m;
                    h71Var3 = h71Var;
                    objM29861p = objMo18581b;
                    byte[] bArrM16690b = ((a91) objM29861p).m16690b();
                    h71Var3.f26288d = bArrM16690b;
                    t6f t6fVar2 = new t6f();
                    String string = Integer.toString(bArr.length, ph2.m43651a(16));
                    sq8.m48648g(string, "toString(...)");
                    u6f.C17307a.m51045b(t6fVar2, string, 0, 0, 6, null);
                    u6f.C17307a.m51045b(t6fVar2, ";", 0, 0, 6, null);
                    u6f.C17307a.m51045b(t6fVar2, "chunk-signature=", 0, 0, 6, null);
                    u6f.C17307a.m51044a(t6fVar2, bArrM16690b, 0, 0, 6, null);
                    u6f.C17307a.m51045b(t6fVar2, "\r\n", 0, 0, 6, null);
                    u6f.C17307a.m51044a(t6fVar2, bArr, 0, 0, 6, null);
                    return t6fVar2;
                }
            }
            InterfaceC13880a interfaceC13880a = this.f26285a;
            c13883d.f26301a = this;
            c13883d.f26305e = 1;
            objM29861p = m29861p(interfaceC13880a, c13883d);
            if (objM29861p == objM51918f) {
                return objM51918f;
            }
            h71Var2 = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                byte[] bArr3 = (byte[]) c13883d.f26302b;
                h71Var3 = (h71) c13883d.f26301a;
                wre.m54934b(objM29861p);
                bArr = bArr3;
                byte[] bArrM16690b2 = ((a91) objM29861p).m16690b();
                h71Var3.f26288d = bArrM16690b2;
                t6f t6fVar22 = new t6f();
                String string2 = Integer.toString(bArr.length, ph2.m43651a(16));
                sq8.m48648g(string2, "toString(...)");
                u6f.C17307a.m51045b(t6fVar22, string2, 0, 0, 6, null);
                u6f.C17307a.m51045b(t6fVar22, ";", 0, 0, 6, null);
                u6f.C17307a.m51045b(t6fVar22, "chunk-signature=", 0, 0, 6, null);
                u6f.C17307a.m51044a(t6fVar22, bArrM16690b2, 0, 0, 6, null);
                u6f.C17307a.m51045b(t6fVar22, "\r\n", 0, 0, 6, null);
                u6f.C17307a.m51044a(t6fVar22, bArr, 0, 0, 6, null);
                return t6fVar22;
            }
            h71Var2 = (h71) c13883d.f26301a;
            wre.m54934b(objM29861p);
        }
        t6f t6fVar3 = (t6f) objM29861p;
        h71Var = h71Var2;
        t6fVar = t6fVar3;
        return t6fVar == null ? null : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m29858l(ux7 ux7Var, n64 n64Var) {
        C13884e c13884e;
        h71 h71Var;
        if (n64Var instanceof C13884e) {
            c13884e = (C13884e) n64Var;
            int i = c13884e.f26310e;
            if ((i & Integer.MIN_VALUE) != 0) {
                c13884e.f26310e = i - Integer.MIN_VALUE;
            } else {
                c13884e = new C13884e(n64Var);
            }
        }
        Object objMo18580a = c13884e.f26308c;
        Object objM51918f = uq8.m51918f();
        int i2 = c13884e.f26310e;
        if (i2 == 0) {
            wre.m54934b(objMo18580a);
            v81 v81Var = this.f26286b;
            byte[] bArr = this.f26288d;
            z81 z81VarM29863r = m29863r(this.f26287c);
            c13884e.f26306a = this;
            c13884e.f26307b = ux7Var;
            c13884e.f26310e = 1;
            objMo18580a = v81Var.mo18580a(ux7Var, bArr, z81VarM29863r, c13884e);
            if (objMo18580a == objM51918f) {
                return objM51918f;
            }
            h71Var = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ux7Var = (ux7) c13884e.f26307b;
            h71Var = (h71) c13884e.f26306a;
            wre.m54934b(objMo18580a);
        }
        byte[] bArrM16690b = ((a91) objMo18580a).m16690b();
        h71Var.f26288d = bArrM16690b;
        t6f t6fVar = new t6f();
        l71.m36642g(t6fVar, ux7Var);
        if (!h71Var.m29860o(h71Var.f26287c)) {
            l71.m36641f(t6fVar, e9g.m24600r(bArrM16690b));
        }
        return t6fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m29859m(t6f t6fVar, n64 n64Var) {
        C13885f c13885f;
        Object obj;
        if (n64Var instanceof C13885f) {
            c13885f = (C13885f) n64Var;
            int i = c13885f.f26313c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c13885f.f26313c = i - Integer.MIN_VALUE;
            } else {
                c13885f = new C13885f(n64Var);
            }
        }
        Object obj2 = c13885f.f26311a;
        Object objM51918f = uq8.m51918f();
        int i2 = c13885f.f26313c;
        if (i2 == 0) {
            wre.m54934b(obj2);
            if (t6fVar == null) {
                InterfaceC13880a interfaceC13880a = this.f26285a;
                c13885f.f26313c = 1;
                Object objM29861p = m29861p(interfaceC13880a, c13885f);
                obj = objM29861p;
                if (objM29861p == objM51918f) {
                    return objM51918f;
                }
            }
            t6f t6fVar2 = new t6f();
            String string = Long.toString(t6fVar.m49489c(), ph2.m43651a(16));
            sq8.m48648g(string, "toString(...)");
            u6f.C17307a.m51045b(t6fVar2, string, 0, 0, 6, null);
            u6f.C17307a.m51045b(t6fVar2, "\r\n", 0, 0, 6, null);
            t6fVar2.B0(t6fVar);
            return t6fVar2;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        wre.m54934b(obj2);
        obj = obj2;
        t6fVar = (t6f) obj;
        if (t6fVar == null) {
            return null;
        }
        t6f t6fVar22 = new t6f();
        String string2 = Long.toString(t6fVar.m49489c(), ph2.m43651a(16));
        sq8.m48648g(string2, "toString(...)");
        u6f.C17307a.m51045b(t6fVar22, string2, 0, 0, 6, null);
        u6f.C17307a.m51045b(t6fVar22, "\r\n", 0, 0, 6, null);
        t6fVar22.B0(t6fVar);
        return t6fVar22;
    }

    /* renamed from: o */
    public final boolean m29860o(z81 z81Var) {
        return sq8.m48644c(z81Var.m58883d(), dx7.C13055f.f20625b);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007e A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0060 -> B:12:0x0037). Please report as a decompilation issue!!! */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m29861p(InterfaceC13880a interfaceC13880a, n64 n64Var) {
        C13886g c13886g;
        t6f t6fVar;
        long j;
        if (n64Var instanceof C13886g) {
            c13886g = (C13886g) n64Var;
            int i = c13886g.f26319f;
            if ((i & Integer.MIN_VALUE) != 0) {
                c13886g.f26319f = i - Integer.MIN_VALUE;
            } else {
                c13886g = new C13886g(n64Var);
            }
        }
        Object obj = c13886g.f26317d;
        Object objM51918f = uq8.m51918f();
        int i2 = c13886g.f26319f;
        if (i2 == 0) {
            wre.m54934b(obj);
            t6fVar = new t6f();
            j = MediaStatus.COMMAND_FOLLOW;
            if (j > 0) {
            }
            if (t6fVar.m49489c() != 0) {
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = c13886g.f26316c;
            t6f t6fVar2 = (t6f) c13886g.f26315b;
            InterfaceC13880a interfaceC13880a2 = (InterfaceC13880a) c13886g.f26314a;
            wre.m54934b(obj);
            C13886g c13886g2 = c13886g;
            t6f t6fVar3 = t6fVar2;
            interfaceC13880a = interfaceC13880a2;
            Object obj2 = objM51918f;
            C13886g c13886g3 = c13886g2;
            long jLongValue = ((Number) obj).longValue();
            if (jLongValue == -1) {
                j -= jLongValue;
                t6fVar = t6fVar3;
                c13886g = c13886g3;
                objM51918f = obj2;
                if (j > 0) {
                    c13886g.f26314a = interfaceC13880a;
                    c13886g.f26315b = t6fVar;
                    c13886g.f26316c = j;
                    c13886g.f26319f = 1;
                    Object obj3 = interfaceC13880a.read(t6fVar, j, c13886g);
                    if (obj3 == objM51918f) {
                        return objM51918f;
                    }
                    c13886g2 = c13886g;
                    t6fVar3 = t6fVar;
                    obj = obj3;
                    Object obj22 = objM51918f;
                    C13886g c13886g32 = c13886g2;
                    long jLongValue2 = ((Number) obj).longValue();
                    if (jLongValue2 == -1) {
                        t6fVar = t6fVar3;
                    }
                }
                if (t6fVar.m49489c() != 0) {
                    return null;
                }
                return t6fVar;
            }
        }
    }

    /* renamed from: q */
    public final z81 m29862q(z81 z81Var) {
        z81.C18572a c18572aM58894o = z81Var.m58894o();
        c18572aM58894o.m58897A(t81.HTTP_REQUEST_CHUNK);
        c18572aM58894o.m58919t(dx7.C13050a.f20620a);
        return c18572aM58894o.m58901b();
    }

    /* renamed from: r */
    public final z81 m29863r(z81 z81Var) {
        z81.C18572a c18572aM58894o = z81Var.m58894o();
        c18572aM58894o.m58897A(t81.HTTP_REQUEST_TRAILING_HEADERS);
        c18572aM58894o.m58919t(dx7.C13050a.f20620a);
        return c18572aM58894o.m58901b();
    }
}
