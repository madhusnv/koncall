package p001o;

import java.io.InputStream;
import java.net.URL;
import p001o.gjb;

/* loaded from: classes5.dex */
public class r8i implements gjb {

    /* renamed from: a */
    public final gjb f43160a;

    /* renamed from: o.r8i$a */
    public static class C16555a implements hjb {
        @Override // p001o.hjb
        /* renamed from: b */
        public gjb mo18152b(eob eobVar) {
            return new r8i(eobVar.m25384d(ft7.class, InputStream.class));
        }
    }

    public r8i(gjb gjbVar) {
        this.f43160a = gjbVar;
    }

    @Override // p001o.gjb
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public gjb.C13758a mo18150b(URL url, int i, int i2, rec recVar) {
        return this.f43160a.mo18150b(new ft7(url), i, i2, recVar);
    }

    @Override // p001o.gjb
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo18149a(URL url) {
        return true;
    }
}
