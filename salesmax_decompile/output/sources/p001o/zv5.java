package p001o;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;

/* loaded from: classes2.dex */
public abstract class zv5 {

    /* renamed from: a */
    public final zv5 f57757a;

    public zv5(zv5 zv5Var) {
        this.f57757a = zv5Var;
    }

    /* renamed from: b */
    public static zv5 m59973b(Context context, Uri uri) {
        return new ixh(null, context, DocumentsContract.buildDocumentUriUsingTree(uri, DocumentsContract.getTreeDocumentId(uri)));
    }

    /* renamed from: a */
    public zv5 m59974a(String str) {
        for (zv5 zv5Var : mo32897h()) {
            if (str.equals(zv5Var.mo32892c())) {
                return zv5Var;
            }
        }
        return null;
    }

    /* renamed from: c */
    public abstract String mo32892c();

    /* renamed from: d */
    public abstract Uri mo32893d();

    /* renamed from: e */
    public abstract boolean mo32894e();

    /* renamed from: f */
    public abstract boolean mo32895f();

    /* renamed from: g */
    public abstract long mo32896g();

    /* renamed from: h */
    public abstract zv5[] mo32897h();
}
