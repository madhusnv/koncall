package p001o;

import android.graphics.Bitmap;
import java.io.IOException;
import java.io.InputStream;
import p001o.sx5;

/* loaded from: classes5.dex */
public class p6g implements ioe {

    /* renamed from: a */
    public final sx5 f39427a;

    /* renamed from: b */
    public final wo0 f39428b;

    /* renamed from: o.p6g$a */
    public static class C15981a implements sx5.InterfaceC16933b {

        /* renamed from: a */
        public final xfe f39429a;

        /* renamed from: b */
        public final yk6 f39430b;

        public C15981a(xfe xfeVar, yk6 yk6Var) {
            this.f39429a = xfeVar;
            this.f39430b = yk6Var;
        }

        @Override // p001o.sx5.InterfaceC16933b
        /* renamed from: a */
        public void mo43011a(mi1 mi1Var, Bitmap bitmap) throws IOException {
            IOException iOExceptionM57916a = this.f39430b.m57916a();
            if (iOExceptionM57916a != null) {
                if (bitmap == null) {
                    throw iOExceptionM57916a;
                }
                mi1Var.mo38104c(bitmap);
                throw iOExceptionM57916a;
            }
        }

        @Override // p001o.sx5.InterfaceC16933b
        /* renamed from: b */
        public void mo43012b() {
            this.f39429a.m56224c();
        }
    }

    public p6g(sx5 sx5Var, wo0 wo0Var) {
        this.f39427a = sx5Var;
        this.f39428b = wo0Var;
    }

    @Override // p001o.ioe
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public zne mo16416b(InputStream inputStream, int i, int i2, rec recVar) {
        boolean z;
        xfe xfeVar;
        if (inputStream instanceof xfe) {
            xfeVar = (xfe) inputStream;
            z = false;
        } else {
            z = true;
            xfeVar = new xfe(inputStream, this.f39428b);
        }
        yk6 yk6VarM57915c = yk6.m57915c(xfeVar);
        try {
            return this.f39427a.m49062e(new nsa(yk6VarM57915c), i, i2, recVar, new C15981a(xfeVar, yk6VarM57915c));
        } finally {
            yk6VarM57915c.release();
            if (z) {
                xfeVar.release();
            }
        }
    }

    @Override // p001o.ioe
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo16415a(InputStream inputStream, rec recVar) {
        return this.f39427a.m49067p(inputStream);
    }
}
