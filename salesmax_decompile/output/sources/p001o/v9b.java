package p001o;

import android.content.Context;
import android.net.Uri;
import p001o.gjb;

/* loaded from: classes5.dex */
public class v9b implements gjb {

    /* renamed from: a */
    public final Context f50040a;

    /* renamed from: o.v9b$a */
    public static class C17535a implements hjb {

        /* renamed from: a */
        public final Context f50041a;

        public C17535a(Context context) {
            this.f50041a = context;
        }

        @Override // p001o.hjb
        /* renamed from: b */
        public gjb mo18152b(eob eobVar) {
            return new v9b(this.f50041a);
        }
    }

    public v9b(Context context) {
        this.f50040a = context.getApplicationContext();
    }

    @Override // p001o.gjb
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public gjb.C13758a mo18150b(Uri uri, int i, int i2, rec recVar) {
        if (w9b.m54120d(i, i2)) {
            return new gjb.C13758a(new l6c(uri), nlh.m40767f(this.f50040a, uri));
        }
        return null;
    }

    @Override // p001o.gjb
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo18149a(Uri uri) {
        return w9b.m54117a(uri);
    }
}
