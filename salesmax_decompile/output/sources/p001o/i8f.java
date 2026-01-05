package p001o;

import com.google.android.gms.cast.MediaStatus;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import p001o.a7f;
import p001o.vre;

/* loaded from: classes3.dex */
public abstract class i8f {

    /* renamed from: o.i8f$a */
    public static final class C14214a extends jgg implements nl7 {

        /* renamed from: a */
        public int f28231a;

        /* renamed from: b */
        public final /* synthetic */ h8f f28232b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14214a(h8f h8fVar, n64 n64Var) {
            super(2, n64Var);
            this.f28232b = h8fVar;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C14214a(this.f28232b, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
            uq8.m51918f();
            if (this.f28231a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            h8f h8fVar = this.f28232b;
            try {
                byte[] bArrMo49492m = m7f.m38493b(h8fVar).mo49492m();
                h8fVar.close();
                return bArrMo49492m;
            } catch (Throwable th) {
                try {
                    h8fVar.close();
                } catch (Throwable th2) {
                    cl6.m21376a(th, th2);
                }
                throw th;
            }
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C14214a) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.i8f$b */
    public static final class C14215b extends jgg implements nl7 {

        /* renamed from: a */
        public Object f28233a;

        /* renamed from: b */
        public Object f28234b;

        /* renamed from: c */
        public Object f28235c;

        /* renamed from: d */
        public Object f28236d;

        /* renamed from: e */
        public int f28237e;

        /* renamed from: f */
        public int f28238f;

        /* renamed from: g */
        public /* synthetic */ Object f28239g;

        /* renamed from: h */
        public final /* synthetic */ r69 f28240h;

        /* renamed from: q */
        public final /* synthetic */ h8f f28241q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14215b(r69 r69Var, h8f h8fVar, n64 n64Var) {
            super(2, n64Var);
            this.f28240h = r69Var;
            this.f28241q = h8fVar;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C14215b c14215b = new C14215b(this.f28240h, this.f28241q, n64Var);
            c14215b.f28239g = obj;
            return c14215b;
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0085, code lost:
        
            r17 = r12;
            r0 = p001o.y3i.f54824a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0089, code lost:
        
            if (r2 != 0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x008b, code lost:
        
            r4.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x008f, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0090, code lost:
        
            r12 = r17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0093, code lost:
        
            r0 = p001o.vre.m53351b(p001o.y3i.f54824a);
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0099, code lost:
        
            r12 = r17;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r14v0 */
        /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, o.h8f] */
        /* JADX WARN: Type inference failed for: r14v2 */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            C14215b c14215b;
            t6f t6fVar;
            Closeable closeable;
            ?? r14;
            r69 r69Var;
            h84 h84Var;
            int i;
            Throwable th;
            C14215b c14215b2;
            Object objM51918f = uq8.m51918f();
            int i2 = this.f28238f;
            if (i2 == 0) {
                wre.m54934b(obj);
                h84 h84Var2 = (h84) this.f28239g;
                t6f t6fVar2 = new t6f();
                h8f h8fVar = this.f28241q;
                r69 r69Var2 = this.f28240h;
                try {
                    vre.C17665a c17665a = vre.f50797b;
                    c14215b = this;
                    t6fVar = t6fVar2;
                    closeable = h8fVar;
                    r14 = closeable;
                    r69Var = r69Var2;
                    h84Var = h84Var2;
                    i = 0;
                } catch (Throwable th2) {
                    c14215b = this;
                    vre.C17665a c17665a2 = vre.f50797b;
                    Object objM53351b = vre.m53351b(wre.m54933a(th));
                    c14215b.f28240h.mo16561q(vre.m53354e(objM53351b));
                    return y3i.f54824a;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.f28237e;
                closeable = (Closeable) this.f28236d;
                h84Var = (h84) this.f28235c;
                r69 r69Var3 = (r69) this.f28234b;
                h8f h8fVar2 = (h8f) this.f28233a;
                t6f t6fVar3 = (t6f) this.f28239g;
                try {
                    wre.m54934b(obj);
                    c14215b = this;
                    r69Var = r69Var3;
                    r14 = h8fVar2;
                    t6fVar = t6fVar3;
                } catch (Throwable th3) {
                    th = th3;
                    c14215b = this;
                }
            }
            while (true) {
                try {
                    i84.m31712f(h84Var);
                    if (r14.read(t6fVar, MediaStatus.COMMAND_LIKE) == -1) {
                        break;
                    }
                    c14215b.f28239g = t6fVar;
                    c14215b.f28233a = r14;
                    c14215b.f28234b = r69Var;
                    c14215b.f28235c = h84Var;
                    c14215b.f28236d = closeable;
                    c14215b.f28237e = i;
                    c14215b.f28238f = 1;
                    c14215b2 = c14215b;
                    try {
                        if (a7f.C12105a.m16562a(r69Var, t6fVar, 0L, c14215b, 2, null) == objM51918f) {
                            return objM51918f;
                        }
                        c14215b = c14215b2;
                    } catch (Throwable th4) {
                        th = th4;
                        c14215b = c14215b2;
                    }
                    th = th4;
                    c14215b = c14215b2;
                } catch (Throwable th5) {
                    th = th5;
                }
                try {
                    try {
                        closeable.close();
                        throw th;
                    } catch (Throwable th6) {
                        cl6.m21376a(th, th6);
                        throw th;
                    }
                } finally {
                    try {
                    } catch (Throwable th7) {
                        th = th7;
                        vre.C17665a c17665a22 = vre.f50797b;
                        Object objM53351b2 = vre.m53351b(wre.m54933a(th));
                        c14215b.f28240h.mo16561q(vre.m53354e(objM53351b2));
                        return y3i.f54824a;
                    }
                }
            }
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C14215b) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: a */
    public static final Object m31738a(h8f h8fVar, n64 n64Var) {
        return pm1.m43867g(eu5.m25611b(), new C14214a(h8fVar, null), n64Var);
    }

    /* renamed from: b */
    public static final y6f m31739b(h8f h8fVar, h84 h84Var) {
        sq8.m48649h(h8fVar, "<this>");
        r69 r69Var = new r69(null, 1, null);
        if (h84Var == null) {
            h84Var = kt7.f32697a;
        }
        r69Var.m46253a(rm1.m46952d(h84Var, eu5.m25611b().plus(new f84("sdk-source-reader")), null, new C14215b(r69Var, h8fVar, null), 2, null));
        return r69Var;
    }
}
