package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import r8.AbstractC6484a;
import r8.C6485b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(AbstractC6484a abstractC6484a) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f2202a = abstractC6484a.m12490f(iconCompat.f2202a, 1);
        byte[] bArr = iconCompat.f2204c;
        if (abstractC6484a.mo12489e(2)) {
            Parcel parcel = ((C6485b) abstractC6484a).f31155e;
            int i10 = parcel.readInt();
            if (i10 < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i10];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f2204c = bArr;
        iconCompat.f2205d = abstractC6484a.m12491g(iconCompat.f2205d, 3);
        iconCompat.f2206e = abstractC6484a.m12490f(iconCompat.f2206e, 4);
        iconCompat.f2207f = abstractC6484a.m12490f(iconCompat.f2207f, 5);
        iconCompat.f2208g = (ColorStateList) abstractC6484a.m12491g(iconCompat.f2208g, 6);
        String string = iconCompat.f2210i;
        if (abstractC6484a.mo12489e(7)) {
            string = ((C6485b) abstractC6484a).f31155e.readString();
        }
        iconCompat.f2210i = string;
        String string2 = iconCompat.f2211j;
        if (abstractC6484a.mo12489e(8)) {
            string2 = ((C6485b) abstractC6484a).f31155e.readString();
        }
        iconCompat.f2211j = string2;
        iconCompat.f2209h = PorterDuff.Mode.valueOf(iconCompat.f2210i);
        switch (iconCompat.f2202a) {
            case -1:
                Parcelable parcelable = iconCompat.f2205d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f2203b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f2205d;
                if (parcelable2 != null) {
                    iconCompat.f2203b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f2204c;
                iconCompat.f2203b = bArr3;
                iconCompat.f2202a = 3;
                iconCompat.f2206e = 0;
                iconCompat.f2207f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f2204c, Charset.forName("UTF-16"));
                iconCompat.f2203b = str;
                if (iconCompat.f2202a == 2 && iconCompat.f2211j == null) {
                    iconCompat.f2211j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f2203b = iconCompat.f2204c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, AbstractC6484a abstractC6484a) {
        abstractC6484a.getClass();
        iconCompat.f2210i = iconCompat.f2209h.name();
        switch (iconCompat.f2202a) {
            case -1:
                iconCompat.f2205d = (Parcelable) iconCompat.f2203b;
                break;
            case 1:
            case 5:
                iconCompat.f2205d = (Parcelable) iconCompat.f2203b;
                break;
            case 2:
                iconCompat.f2204c = ((String) iconCompat.f2203b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f2204c = (byte[]) iconCompat.f2203b;
                break;
            case 4:
            case 6:
                iconCompat.f2204c = iconCompat.f2203b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i10 = iconCompat.f2202a;
        if (-1 != i10) {
            abstractC6484a.m12494j(i10, 1);
        }
        byte[] bArr = iconCompat.f2204c;
        if (bArr != null) {
            abstractC6484a.mo12493i(2);
            Parcel parcel = ((C6485b) abstractC6484a).f31155e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f2205d;
        if (parcelable != null) {
            abstractC6484a.mo12493i(3);
            ((C6485b) abstractC6484a).f31155e.writeParcelable(parcelable, 0);
        }
        int i11 = iconCompat.f2206e;
        if (i11 != 0) {
            abstractC6484a.m12494j(i11, 4);
        }
        int i12 = iconCompat.f2207f;
        if (i12 != 0) {
            abstractC6484a.m12494j(i12, 5);
        }
        ColorStateList colorStateList = iconCompat.f2208g;
        if (colorStateList != null) {
            abstractC6484a.mo12493i(6);
            ((C6485b) abstractC6484a).f31155e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f2210i;
        if (str != null) {
            abstractC6484a.mo12493i(7);
            ((C6485b) abstractC6484a).f31155e.writeString(str);
        }
        String str2 = iconCompat.f2211j;
        if (str2 != null) {
            abstractC6484a.mo12493i(8);
            ((C6485b) abstractC6484a).f31155e.writeString(str2);
        }
    }
}
