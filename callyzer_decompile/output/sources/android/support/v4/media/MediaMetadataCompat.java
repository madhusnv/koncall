package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.AbstractC0222a;
import e1.C1903e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;

    /* renamed from: a */
    public final Bundle f1644a;

    static {
        C1903e c1903e = new C1903e(0);
        c1903e.put("android.media.metadata.TITLE", 1);
        c1903e.put("android.media.metadata.ARTIST", 1);
        c1903e.put("android.media.metadata.DURATION", 0);
        c1903e.put("android.media.metadata.ALBUM", 1);
        c1903e.put("android.media.metadata.AUTHOR", 1);
        c1903e.put("android.media.metadata.WRITER", 1);
        c1903e.put("android.media.metadata.COMPOSER", 1);
        c1903e.put("android.media.metadata.COMPILATION", 1);
        c1903e.put("android.media.metadata.DATE", 1);
        c1903e.put("android.media.metadata.YEAR", 0);
        c1903e.put("android.media.metadata.GENRE", 1);
        c1903e.put("android.media.metadata.TRACK_NUMBER", 0);
        c1903e.put("android.media.metadata.NUM_TRACKS", 0);
        c1903e.put("android.media.metadata.DISC_NUMBER", 0);
        c1903e.put("android.media.metadata.ALBUM_ARTIST", 1);
        c1903e.put("android.media.metadata.ART", 2);
        c1903e.put("android.media.metadata.ART_URI", 1);
        c1903e.put("android.media.metadata.ALBUM_ART", 2);
        c1903e.put("android.media.metadata.ALBUM_ART_URI", 1);
        c1903e.put("android.media.metadata.USER_RATING", 3);
        c1903e.put("android.media.metadata.RATING", 3);
        c1903e.put("android.media.metadata.DISPLAY_TITLE", 1);
        c1903e.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        c1903e.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        c1903e.put("android.media.metadata.DISPLAY_ICON", 2);
        c1903e.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        c1903e.put("android.media.metadata.MEDIA_ID", 1);
        c1903e.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        c1903e.put("android.media.metadata.MEDIA_URI", 1);
        c1903e.put("android.media.metadata.ADVERTISEMENT", 0);
        c1903e.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        CREATOR = new C0220a(2);
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.f1644a = parcel.readBundle(AbstractC0222a.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeBundle(this.f1644a);
    }
}
