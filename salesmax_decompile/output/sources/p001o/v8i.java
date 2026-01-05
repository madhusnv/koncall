package p001o;

import android.net.Uri;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.apache.http.HttpHost;
import p001o.gjb;

/* loaded from: classes5.dex */
public class v8i implements gjb {

    /* renamed from: b */
    public static final Set f50023b = Collections.unmodifiableSet(new HashSet(Arrays.asList(HttpHost.DEFAULT_SCHEME_NAME, "https")));

    /* renamed from: a */
    public final gjb f50024a;

    /* renamed from: o.v8i$a */
    public static class C17528a implements hjb {
        @Override // p001o.hjb
        /* renamed from: b */
        public gjb mo18152b(eob eobVar) {
            return new v8i(eobVar.m25384d(ft7.class, InputStream.class));
        }
    }

    public v8i(gjb gjbVar) {
        this.f50024a = gjbVar;
    }

    @Override // p001o.gjb
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public gjb.C13758a mo18150b(Uri uri, int i, int i2, rec recVar) {
        return this.f50024a.mo18150b(new ft7(uri.toString()), i, i2, recVar);
    }

    @Override // p001o.gjb
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo18149a(Uri uri) {
        return f50023b.contains(uri.getScheme());
    }
}
