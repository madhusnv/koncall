package p001o;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes6.dex */
public abstract class dgj {

    /* renamed from: o.dgj$a */
    public static final class C12910a extends cre {

        /* renamed from: c */
        public final /* synthetic */ y9b f19820c;

        /* renamed from: d */
        public final /* synthetic */ long f19821d;

        /* renamed from: e */
        public final /* synthetic */ im1 f19822e;

        public C12910a(y9b y9bVar, long j, im1 im1Var) {
            this.f19820c = y9bVar;
            this.f19821d = j;
            this.f19822e = im1Var;
        }

        @Override // p001o.cre
        /* renamed from: g */
        public long mo21617g() {
            return this.f19821d;
        }

        @Override // p001o.cre
        /* renamed from: h */
        public y9b mo21618h() {
            return this.f19820c;
        }

        @Override // p001o.cre
        /* renamed from: o */
        public im1 mo21619o() {
            return this.f19822e;
        }
    }

    /* renamed from: a */
    public static final cre m23076a(im1 im1Var, y9b y9bVar, long j) {
        sq8.m48649h(im1Var, "<this>");
        return new C12910a(y9bVar, j, im1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* renamed from: b */
    public static final byte[] m23077b(cre creVar) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        sq8.m48649h(creVar, "<this>");
        long jMo21617g = creVar.mo21617g();
        if (jMo21617g > 2147483647L) {
            throw new IOException("Cannot buffer entire body for content length: " + jMo21617g);
        }
        im1 im1VarMo21619o = creVar.mo21619o();
        byte[] th = null;
        try {
            byte[] bArrMo32310m = im1VarMo21619o.mo32310m();
            if (im1VarMo21619o != null) {
                try {
                    im1VarMo21619o.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            th = th;
            th = bArrMo32310m;
        } catch (Throwable th3) {
            th = th3;
            if (im1VarMo21619o != null) {
                try {
                    im1VarMo21619o.close();
                } catch (Throwable th4) {
                    cl6.m21376a(th, th4);
                }
            }
        }
        if (th != 0) {
            throw th;
        }
        int length = th.length;
        if (jMo21617g == -1 || jMo21617g == length) {
            return th;
        }
        throw new IOException("Content-Length (" + jMo21617g + ") and stream length (" + length + ") disagree");
    }

    /* renamed from: c */
    public static final void m23078c(cre creVar) {
        sq8.m48649h(creVar, "<this>");
        ggj.m28626f(creVar.mo21619o());
    }

    /* renamed from: d */
    public static final cre m23079d(byte[] bArr, y9b y9bVar) {
        sq8.m48649h(bArr, "<this>");
        return cre.f18529b.m21622a(new rl1().write(bArr), y9bVar, bArr.length);
    }
}
