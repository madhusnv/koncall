package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import p001o.vti;

/* loaded from: classes2.dex */
public class IconCompatParcelizer {
    public static IconCompat read(vti vtiVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f7160a = vtiVar.m53441p(iconCompat.f7160a, 1);
        iconCompat.f7162c = vtiVar.m53435j(iconCompat.f7162c, 2);
        iconCompat.f7163d = vtiVar.m53443r(iconCompat.f7163d, 3);
        iconCompat.f7164e = vtiVar.m53441p(iconCompat.f7164e, 4);
        iconCompat.f7165f = vtiVar.m53441p(iconCompat.f7165f, 5);
        iconCompat.f7166g = (ColorStateList) vtiVar.m53443r(iconCompat.f7166g, 6);
        iconCompat.f7168i = vtiVar.m53445t(iconCompat.f7168i, 7);
        iconCompat.f7169j = vtiVar.m53445t(iconCompat.f7169j, 8);
        iconCompat.m5865o();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, vti vtiVar) {
        vtiVar.m53449x(true, true);
        iconCompat.m5866p(vtiVar.m53431f());
        int i = iconCompat.f7160a;
        if (-1 != i) {
            vtiVar.m53417F(i, 1);
        }
        byte[] bArr = iconCompat.f7162c;
        if (bArr != null) {
            vtiVar.m53413B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f7163d;
        if (parcelable != null) {
            vtiVar.m53419H(parcelable, 3);
        }
        int i2 = iconCompat.f7164e;
        if (i2 != 0) {
            vtiVar.m53417F(i2, 4);
        }
        int i3 = iconCompat.f7165f;
        if (i3 != 0) {
            vtiVar.m53417F(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.f7166g;
        if (colorStateList != null) {
            vtiVar.m53419H(colorStateList, 6);
        }
        String str = iconCompat.f7168i;
        if (str != null) {
            vtiVar.m53421J(str, 7);
        }
        String str2 = iconCompat.f7169j;
        if (str2 != null) {
            vtiVar.m53421J(str2, 8);
        }
    }
}
