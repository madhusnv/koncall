package p001o;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;
import p001o.gjb;

/* loaded from: classes5.dex */
public class k8g implements gjb {

    /* renamed from: a */
    public final gjb f31653a;

    /* renamed from: o.k8g$a */
    public static final class C14735a implements hjb {
        @Override // p001o.hjb
        /* renamed from: b */
        public gjb mo18152b(eob eobVar) {
            return new k8g(eobVar.m25384d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: o.k8g$b */
    public static class C14736b implements hjb {
        @Override // p001o.hjb
        /* renamed from: b */
        public gjb mo18152b(eob eobVar) {
            return new k8g(eobVar.m25384d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* renamed from: o.k8g$c */
    public static class C14737c implements hjb {
        @Override // p001o.hjb
        /* renamed from: b */
        public gjb mo18152b(eob eobVar) {
            return new k8g(eobVar.m25384d(Uri.class, InputStream.class));
        }
    }

    public k8g(gjb gjbVar) {
        this.f31653a = gjbVar;
    }

    /* renamed from: e */
    public static Uri m35174e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return m35175f(str);
        }
        Uri uri = Uri.parse(str);
        return uri.getScheme() == null ? m35175f(str) : uri;
    }

    /* renamed from: f */
    public static Uri m35175f(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // p001o.gjb
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public gjb.C13758a mo18150b(String str, int i, int i2, rec recVar) {
        Uri uriM35174e = m35174e(str);
        if (uriM35174e == null || !this.f31653a.mo18149a(uriM35174e)) {
            return null;
        }
        return this.f31653a.mo18150b(uriM35174e, i, i2, recVar);
    }

    @Override // p001o.gjb
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo18149a(String str) {
        return true;
    }
}
