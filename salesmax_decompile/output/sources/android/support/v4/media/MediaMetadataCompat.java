package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import p001o.vo0;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes2.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;

    /* renamed from: d */
    public static final vo0 f5134d;

    /* renamed from: e */
    public static final String[] f5135e;

    /* renamed from: f */
    public static final String[] f5136f;

    /* renamed from: g */
    public static final String[] f5137g;

    /* renamed from: a */
    public final Bundle f5138a;

    /* renamed from: b */
    public MediaMetadata f5139b;

    /* renamed from: c */
    public MediaDescriptionCompat f5140c;

    /* renamed from: android.support.v4.media.MediaMetadataCompat$a */
    public class C1700a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public MediaMetadataCompat[] newArray(int i) {
            return new MediaMetadataCompat[i];
        }
    }

    static {
        vo0 vo0Var = new vo0();
        f5134d = vo0Var;
        vo0Var.put("android.media.metadata.TITLE", 1);
        vo0Var.put("android.media.metadata.ARTIST", 1);
        vo0Var.put("android.media.metadata.DURATION", 0);
        vo0Var.put("android.media.metadata.ALBUM", 1);
        vo0Var.put("android.media.metadata.AUTHOR", 1);
        vo0Var.put("android.media.metadata.WRITER", 1);
        vo0Var.put("android.media.metadata.COMPOSER", 1);
        vo0Var.put("android.media.metadata.COMPILATION", 1);
        vo0Var.put("android.media.metadata.DATE", 1);
        vo0Var.put("android.media.metadata.YEAR", 0);
        vo0Var.put("android.media.metadata.GENRE", 1);
        vo0Var.put("android.media.metadata.TRACK_NUMBER", 0);
        vo0Var.put("android.media.metadata.NUM_TRACKS", 0);
        vo0Var.put("android.media.metadata.DISC_NUMBER", 0);
        vo0Var.put("android.media.metadata.ALBUM_ARTIST", 1);
        vo0Var.put("android.media.metadata.ART", 2);
        vo0Var.put("android.media.metadata.ART_URI", 1);
        vo0Var.put("android.media.metadata.ALBUM_ART", 2);
        vo0Var.put("android.media.metadata.ALBUM_ART_URI", 1);
        vo0Var.put("android.media.metadata.USER_RATING", 3);
        vo0Var.put("android.media.metadata.RATING", 3);
        vo0Var.put("android.media.metadata.DISPLAY_TITLE", 1);
        vo0Var.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        vo0Var.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        vo0Var.put("android.media.metadata.DISPLAY_ICON", 2);
        vo0Var.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        vo0Var.put("android.media.metadata.MEDIA_ID", 1);
        vo0Var.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        vo0Var.put("android.media.metadata.MEDIA_URI", 1);
        vo0Var.put("android.media.metadata.ADVERTISEMENT", 0);
        vo0Var.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        f5135e = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
        f5136f = new String[]{"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};
        f5137g = new String[]{"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};
        CREATOR = new C1700a();
    }

    public MediaMetadataCompat(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.f5138a = bundle2;
        MediaSessionCompat.m3559a(bundle2);
    }

    /* renamed from: b */
    public static MediaMetadataCompat m3486b(Object obj) {
        if (obj == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        MediaMetadata mediaMetadata = (MediaMetadata) obj;
        mediaMetadata.writeToParcel(parcelObtain, 0);
        parcelObtain.setDataPosition(0);
        MediaMetadataCompat mediaMetadataCompatCreateFromParcel = CREATOR.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        mediaMetadataCompatCreateFromParcel.f5139b = mediaMetadata;
        return mediaMetadataCompatCreateFromParcel;
    }

    /* renamed from: a */
    public boolean m3487a(String str) {
        return this.f5138a.containsKey(str);
    }

    /* renamed from: c */
    public Bitmap m3488c(String str) {
        try {
            return (Bitmap) this.f5138a.getParcelable(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: d */
    public MediaDescriptionCompat m3489d() {
        Bitmap bitmapM3488c;
        Uri uri;
        MediaDescriptionCompat mediaDescriptionCompat = this.f5140c;
        if (mediaDescriptionCompat != null) {
            return mediaDescriptionCompat;
        }
        String strM3492g = m3492g("android.media.metadata.MEDIA_ID");
        CharSequence[] charSequenceArr = new CharSequence[3];
        CharSequence charSequenceM3493h = m3493h("android.media.metadata.DISPLAY_TITLE");
        if (TextUtils.isEmpty(charSequenceM3493h)) {
            int i = 0;
            int i2 = 0;
            while (i < 3) {
                String[] strArr = f5135e;
                if (i2 >= strArr.length) {
                    break;
                }
                int i3 = i2 + 1;
                CharSequence charSequenceM3493h2 = m3493h(strArr[i2]);
                if (!TextUtils.isEmpty(charSequenceM3493h2)) {
                    charSequenceArr[i] = charSequenceM3493h2;
                    i++;
                }
                i2 = i3;
            }
        } else {
            charSequenceArr[0] = charSequenceM3493h;
            charSequenceArr[1] = m3493h("android.media.metadata.DISPLAY_SUBTITLE");
            charSequenceArr[2] = m3493h("android.media.metadata.DISPLAY_DESCRIPTION");
        }
        int i4 = 0;
        while (true) {
            String[] strArr2 = f5136f;
            if (i4 >= strArr2.length) {
                bitmapM3488c = null;
                break;
            }
            bitmapM3488c = m3488c(strArr2[i4]);
            if (bitmapM3488c != null) {
                break;
            }
            i4++;
        }
        int i5 = 0;
        while (true) {
            String[] strArr3 = f5137g;
            if (i5 >= strArr3.length) {
                uri = null;
                break;
            }
            String strM3492g2 = m3492g(strArr3[i5]);
            if (!TextUtils.isEmpty(strM3492g2)) {
                uri = Uri.parse(strM3492g2);
                break;
            }
            i5++;
        }
        String strM3492g3 = m3492g("android.media.metadata.MEDIA_URI");
        Uri uri2 = TextUtils.isEmpty(strM3492g3) ? null : Uri.parse(strM3492g3);
        MediaDescriptionCompat.C1699d c1699d = new MediaDescriptionCompat.C1699d();
        c1699d.m3482f(strM3492g);
        c1699d.m3485i(charSequenceArr[0]);
        c1699d.m3484h(charSequenceArr[1]);
        c1699d.m3478b(charSequenceArr[2]);
        c1699d.m3480d(bitmapM3488c);
        c1699d.m3481e(uri);
        c1699d.m3483g(uri2);
        Bundle bundle = new Bundle();
        if (this.f5138a.containsKey("android.media.metadata.BT_FOLDER_TYPE")) {
            bundle.putLong("android.media.extra.BT_FOLDER_TYPE", m3490e("android.media.metadata.BT_FOLDER_TYPE"));
        }
        if (this.f5138a.containsKey("android.media.metadata.DOWNLOAD_STATUS")) {
            bundle.putLong("android.media.extra.DOWNLOAD_STATUS", m3490e("android.media.metadata.DOWNLOAD_STATUS"));
        }
        if (!bundle.isEmpty()) {
            c1699d.m3479c(bundle);
        }
        MediaDescriptionCompat mediaDescriptionCompatM3477a = c1699d.m3477a();
        this.f5140c = mediaDescriptionCompatM3477a;
        return mediaDescriptionCompatM3477a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public long m3490e(String str) {
        return this.f5138a.getLong(str, 0L);
    }

    /* renamed from: f */
    public Object m3491f() {
        if (this.f5139b == null) {
            Parcel parcelObtain = Parcel.obtain();
            writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            this.f5139b = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(parcelObtain);
            parcelObtain.recycle();
        }
        return this.f5139b;
    }

    /* renamed from: g */
    public String m3492g(String str) {
        CharSequence charSequence = this.f5138a.getCharSequence(str);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* renamed from: h */
    public CharSequence m3493h(String str) {
        return this.f5138a.getCharSequence(str);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f5138a);
    }

    /* renamed from: android.support.v4.media.MediaMetadataCompat$b */
    public static final class C1701b {

        /* renamed from: a */
        public final Bundle f5141a;

        public C1701b() {
            this.f5141a = new Bundle();
        }

        /* renamed from: a */
        public MediaMetadataCompat m3496a() {
            return new MediaMetadataCompat(this.f5141a);
        }

        /* renamed from: b */
        public C1701b m3497b(String str, Bitmap bitmap) {
            vo0 vo0Var = MediaMetadataCompat.f5134d;
            if (!vo0Var.containsKey(str) || ((Integer) vo0Var.get(str)).intValue() == 2) {
                this.f5141a.putParcelable(str, bitmap);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a Bitmap");
        }

        /* renamed from: c */
        public C1701b m3498c(String str, long j) {
            vo0 vo0Var = MediaMetadataCompat.f5134d;
            if (!vo0Var.containsKey(str) || ((Integer) vo0Var.get(str)).intValue() == 0) {
                this.f5141a.putLong(str, j);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a long");
        }

        /* renamed from: d */
        public C1701b m3499d(String str, String str2) {
            vo0 vo0Var = MediaMetadataCompat.f5134d;
            if (!vo0Var.containsKey(str) || ((Integer) vo0Var.get(str)).intValue() == 1) {
                this.f5141a.putCharSequence(str, str2);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a String");
        }

        public C1701b(MediaMetadataCompat mediaMetadataCompat) {
            Bundle bundle = new Bundle(mediaMetadataCompat.f5138a);
            this.f5141a = bundle;
            MediaSessionCompat.m3559a(bundle);
        }
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.f5138a = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }
}
