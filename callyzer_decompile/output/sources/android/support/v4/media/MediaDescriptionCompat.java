package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new C0220a(1);

    /* renamed from: a */
    public final String f1635a;

    /* renamed from: b */
    public final CharSequence f1636b;

    /* renamed from: c */
    public final CharSequence f1637c;

    /* renamed from: d */
    public final CharSequence f1638d;

    /* renamed from: e */
    public final Bitmap f1639e;

    /* renamed from: f */
    public final Uri f1640f;

    /* renamed from: g */
    public final Bundle f1641g;

    /* renamed from: h */
    public final Uri f1642h;

    /* renamed from: j */
    public Object f1643j;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f1635a = str;
        this.f1636b = charSequence;
        this.f1637c = charSequence2;
        this.f1638d = charSequence3;
        this.f1639e = bitmap;
        this.f1640f = uri;
        this.f1641g = bundle;
        this.f1642h = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f1636b) + ", " + ((Object) this.f1637c) + ", " + ((Object) this.f1638d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Object objBuild = this.f1643j;
        if (objBuild == null) {
            MediaDescription.Builder builder = new MediaDescription.Builder();
            builder.setMediaId(this.f1635a);
            builder.setTitle(this.f1636b);
            builder.setSubtitle(this.f1637c);
            builder.setDescription(this.f1638d);
            builder.setIconBitmap(this.f1639e);
            builder.setIconUri(this.f1640f);
            builder.setExtras(this.f1641g);
            builder.setMediaUri(this.f1642h);
            objBuild = builder.build();
            this.f1643j = objBuild;
        }
        ((MediaDescription) objBuild).writeToParcel(parcel, i10);
    }
}
