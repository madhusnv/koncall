package p001o;

import android.content.Context;
import android.net.Uri;
import p001o.gjb;

/* loaded from: classes5.dex */
public class x9b implements gjb {

    /* renamed from: a */
    public final Context f53398a;

    /* renamed from: o.x9b$a */
    public static class C18084a implements hjb {

        /* renamed from: a */
        public final Context f53399a;

        public C18084a(Context context) {
            this.f53399a = context;
        }

        @Override // p001o.hjb
        /* renamed from: b */
        public gjb mo18152b(eob eobVar) {
            return new x9b(this.f53399a);
        }
    }

    public x9b(Context context) {
        this.f53398a = context.getApplicationContext();
    }

    @Override // p001o.gjb
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public gjb.C13758a mo18150b(Uri uri, int i, int i2, rec recVar) {
        if (w9b.m54120d(i, i2) && m55878e(recVar)) {
            return new gjb.C13758a(new l6c(uri), nlh.m40768g(this.f53398a, uri));
        }
        return null;
    }

    @Override // p001o.gjb
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo18149a(Uri uri) {
        return w9b.m54119c(uri);
    }

    /* renamed from: e */
    public final boolean m55878e(rec recVar) {
        Long l = (Long) recVar.m46585c(dui.f20560d);
        return l != null && l.longValue() == -1;
    }
}
