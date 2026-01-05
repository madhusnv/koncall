package p001o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import com.google.android.gms.cast.CredentialsData;
import java.util.List;

/* loaded from: classes5.dex */
public class koe implements ioe {

    /* renamed from: b */
    public static final mec f32513b = mec.m38832e("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme");

    /* renamed from: a */
    public final Context f32514a;

    public koe(Context context) {
        this.f32514a = context.getApplicationContext();
    }

    @Override // p001o.ioe
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public zne mo16416b(Uri uri, int i, int i2, rec recVar) {
        String authority = uri.getAuthority();
        Context contextM35986d = m35986d(uri, authority);
        int iM35989g = m35989g(contextM35986d, uri);
        Resources.Theme theme = (Resources.Theme) recVar.m46585c(f32513b);
        bgd.m18883a(contextM35986d.getPackageName().equals(authority) || theme == null, "Can't get a theme from another package");
        return f0c.m25919d(theme == null ? iy5.m32905b(this.f32514a, contextM35986d, iM35989g) : iy5.m32904a(this.f32514a, iM35989g, theme));
    }

    /* renamed from: d */
    public final Context m35986d(Uri uri, String str) {
        if (str.equals(this.f32514a.getPackageName())) {
            return this.f32514a;
        }
        try {
            return this.f32514a.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            if (str.contains(this.f32514a.getPackageName())) {
                return this.f32514a;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e);
        }
    }

    /* renamed from: e */
    public final int m35987e(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e);
        }
    }

    /* renamed from: f */
    public final int m35988f(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, CredentialsData.CREDENTIALS_TYPE_ANDROID);
        }
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException("Failed to find resource id for: " + uri);
    }

    /* renamed from: g */
    public final int m35989g(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return m35988f(context, uri);
        }
        if (pathSegments.size() == 1) {
            return m35987e(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
    }

    @Override // p001o.ioe
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean mo16415a(Uri uri, rec recVar) {
        return uri.getScheme().equals("android.resource");
    }
}
