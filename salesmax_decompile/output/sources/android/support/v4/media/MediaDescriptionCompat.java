package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes2.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new C1696a();

    /* renamed from: a */
    public final String f5117a;

    /* renamed from: b */
    public final CharSequence f5118b;

    /* renamed from: c */
    public final CharSequence f5119c;

    /* renamed from: d */
    public final CharSequence f5120d;

    /* renamed from: e */
    public final Bitmap f5121e;

    /* renamed from: f */
    public final Uri f5122f;

    /* renamed from: g */
    public final Bundle f5123g;

    /* renamed from: h */
    public final Uri f5124h;

    /* renamed from: q */
    public MediaDescription f5125q;

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$a */
    public class C1696a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.m3451a(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    }

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$b */
    public static class C1697b {
        /* renamed from: a */
        public static MediaDescription m3459a(MediaDescription.Builder builder) {
            return builder.build();
        }

        /* renamed from: b */
        public static MediaDescription.Builder m3460b() {
            return new MediaDescription.Builder();
        }

        /* renamed from: c */
        public static CharSequence m3461c(MediaDescription mediaDescription) {
            return mediaDescription.getDescription();
        }

        /* renamed from: d */
        public static Bundle m3462d(MediaDescription mediaDescription) {
            return mediaDescription.getExtras();
        }

        /* renamed from: e */
        public static Bitmap m3463e(MediaDescription mediaDescription) {
            return mediaDescription.getIconBitmap();
        }

        /* renamed from: f */
        public static Uri m3464f(MediaDescription mediaDescription) {
            return mediaDescription.getIconUri();
        }

        /* renamed from: g */
        public static String m3465g(MediaDescription mediaDescription) {
            return mediaDescription.getMediaId();
        }

        /* renamed from: h */
        public static CharSequence m3466h(MediaDescription mediaDescription) {
            return mediaDescription.getSubtitle();
        }

        /* renamed from: i */
        public static CharSequence m3467i(MediaDescription mediaDescription) {
            return mediaDescription.getTitle();
        }

        /* renamed from: j */
        public static void m3468j(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        /* renamed from: k */
        public static void m3469k(MediaDescription.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        /* renamed from: l */
        public static void m3470l(MediaDescription.Builder builder, Bitmap bitmap) {
            builder.setIconBitmap(bitmap);
        }

        /* renamed from: m */
        public static void m3471m(MediaDescription.Builder builder, Uri uri) {
            builder.setIconUri(uri);
        }

        /* renamed from: n */
        public static void m3472n(MediaDescription.Builder builder, String str) {
            builder.setMediaId(str);
        }

        /* renamed from: o */
        public static void m3473o(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        /* renamed from: p */
        public static void m3474p(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setTitle(charSequence);
        }
    }

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$c */
    public static class C1698c {
        /* renamed from: a */
        public static Uri m3475a(MediaDescription mediaDescription) {
            return mediaDescription.getMediaUri();
        }

        /* renamed from: b */
        public static void m3476b(MediaDescription.Builder builder, Uri uri) {
            builder.setMediaUri(uri);
        }
    }

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$d */
    public static final class C1699d {

        /* renamed from: a */
        public String f5126a;

        /* renamed from: b */
        public CharSequence f5127b;

        /* renamed from: c */
        public CharSequence f5128c;

        /* renamed from: d */
        public CharSequence f5129d;

        /* renamed from: e */
        public Bitmap f5130e;

        /* renamed from: f */
        public Uri f5131f;

        /* renamed from: g */
        public Bundle f5132g;

        /* renamed from: h */
        public Uri f5133h;

        /* renamed from: a */
        public MediaDescriptionCompat m3477a() {
            return new MediaDescriptionCompat(this.f5126a, this.f5127b, this.f5128c, this.f5129d, this.f5130e, this.f5131f, this.f5132g, this.f5133h);
        }

        /* renamed from: b */
        public C1699d m3478b(CharSequence charSequence) {
            this.f5129d = charSequence;
            return this;
        }

        /* renamed from: c */
        public C1699d m3479c(Bundle bundle) {
            this.f5132g = bundle;
            return this;
        }

        /* renamed from: d */
        public C1699d m3480d(Bitmap bitmap) {
            this.f5130e = bitmap;
            return this;
        }

        /* renamed from: e */
        public C1699d m3481e(Uri uri) {
            this.f5131f = uri;
            return this;
        }

        /* renamed from: f */
        public C1699d m3482f(String str) {
            this.f5126a = str;
            return this;
        }

        /* renamed from: g */
        public C1699d m3483g(Uri uri) {
            this.f5133h = uri;
            return this;
        }

        /* renamed from: h */
        public C1699d m3484h(CharSequence charSequence) {
            this.f5128c = charSequence;
            return this;
        }

        /* renamed from: i */
        public C1699d m3485i(CharSequence charSequence) {
            this.f5127b = charSequence;
            return this;
        }
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f5117a = str;
        this.f5118b = charSequence;
        this.f5119c = charSequence2;
        this.f5120d = charSequence3;
        this.f5121e = bitmap;
        this.f5122f = uri;
        this.f5123g = bundle;
        this.f5124h = uri2;
    }

    /* renamed from: a */
    public static MediaDescriptionCompat m3451a(Object obj) {
        Bundle bundle = null;
        if (obj == null) {
            return null;
        }
        C1699d c1699d = new C1699d();
        MediaDescription mediaDescription = (MediaDescription) obj;
        c1699d.m3482f(C1697b.m3465g(mediaDescription));
        c1699d.m3485i(C1697b.m3467i(mediaDescription));
        c1699d.m3484h(C1697b.m3466h(mediaDescription));
        c1699d.m3478b(C1697b.m3461c(mediaDescription));
        c1699d.m3480d(C1697b.m3463e(mediaDescription));
        c1699d.m3481e(C1697b.m3464f(mediaDescription));
        Bundle bundleM3462d = C1697b.m3462d(mediaDescription);
        if (bundleM3462d != null) {
            bundleM3462d = MediaSessionCompat.m3561q(bundleM3462d);
        }
        Uri uri = bundleM3462d != null ? (Uri) bundleM3462d.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
        if (uri == null) {
            bundle = bundleM3462d;
        } else if (!bundleM3462d.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") || bundleM3462d.size() != 2) {
            bundleM3462d.remove("android.support.v4.media.description.MEDIA_URI");
            bundleM3462d.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
            bundle = bundleM3462d;
        }
        c1699d.m3479c(bundle);
        if (uri != null) {
            c1699d.m3483g(uri);
        } else {
            c1699d.m3483g(C1698c.m3475a(mediaDescription));
        }
        MediaDescriptionCompat mediaDescriptionCompatM3477a = c1699d.m3477a();
        mediaDescriptionCompatM3477a.f5125q = mediaDescription;
        return mediaDescriptionCompatM3477a;
    }

    /* renamed from: b */
    public Bitmap m3452b() {
        return this.f5121e;
    }

    /* renamed from: c */
    public Uri m3453c() {
        return this.f5122f;
    }

    /* renamed from: d */
    public Object m3454d() {
        MediaDescription mediaDescription = this.f5125q;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builderM3460b = C1697b.m3460b();
        C1697b.m3472n(builderM3460b, this.f5117a);
        C1697b.m3474p(builderM3460b, this.f5118b);
        C1697b.m3473o(builderM3460b, this.f5119c);
        C1697b.m3468j(builderM3460b, this.f5120d);
        C1697b.m3470l(builderM3460b, this.f5121e);
        C1697b.m3471m(builderM3460b, this.f5122f);
        C1697b.m3469k(builderM3460b, this.f5123g);
        C1698c.m3476b(builderM3460b, this.f5124h);
        MediaDescription mediaDescriptionM3459a = C1697b.m3459a(builderM3460b);
        this.f5125q = mediaDescriptionM3459a;
        return mediaDescriptionM3459a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public CharSequence m3455e() {
        return this.f5119c;
    }

    /* renamed from: f */
    public CharSequence m3456f() {
        return this.f5118b;
    }

    public String toString() {
        return ((Object) this.f5118b) + ", " + ((Object) this.f5119c) + ", " + ((Object) this.f5120d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ((MediaDescription) m3454d()).writeToParcel(parcel, i);
    }
}
