package p001o;

import android.content.res.Resources;
import android.text.TextUtils;
import androidx.media3.common.C2181a;
import java.util.Locale;

/* loaded from: classes2.dex */
public class ui5 implements tth {

    /* renamed from: a */
    public final Resources f48967a;

    public ui5(Resources resources) {
        this.f48967a = (Resources) op0.m42515e(resources);
    }

    /* renamed from: i */
    public static int m51616i(C2181a c2181a) {
        int iM56181i = xeb.m56181i(c2181a.f7943n);
        if (iM56181i != -1) {
            return iM56181i;
        }
        if (xeb.m56184l(c2181a.f7939j) != null) {
            return 2;
        }
        if (xeb.m56174b(c2181a.f7939j) != null) {
            return 1;
        }
        if (c2181a.f7949t == -1 && c2181a.f7950u == -1) {
            return (c2181a.f7919B == -1 && c2181a.f7920C == -1) ? -1 : 1;
        }
        return 2;
    }

    @Override // p001o.tth
    /* renamed from: a */
    public String mo50586a(C2181a c2181a) {
        int iM51616i = m51616i(c2181a);
        String strM51624j = iM51616i == 2 ? m51624j(m51623h(c2181a), m51622g(c2181a), m51618c(c2181a)) : iM51616i == 1 ? m51624j(m51620e(c2181a), m51617b(c2181a), m51618c(c2181a)) : m51620e(c2181a);
        if (strM51624j.length() != 0) {
            return strM51624j;
        }
        String str = c2181a.f7933d;
        return (str == null || str.trim().isEmpty()) ? this.f48967a.getString(aae.exo_track_unknown) : this.f48967a.getString(aae.exo_track_unknown_name, str);
    }

    /* renamed from: b */
    public final String m51617b(C2181a c2181a) {
        int i = c2181a.f7919B;
        return (i == -1 || i < 1) ? "" : i != 1 ? i != 2 ? (i == 6 || i == 7) ? this.f48967a.getString(aae.exo_track_surround_5_point_1) : i != 8 ? this.f48967a.getString(aae.exo_track_surround) : this.f48967a.getString(aae.exo_track_surround_7_point_1) : this.f48967a.getString(aae.exo_track_stereo) : this.f48967a.getString(aae.exo_track_mono);
    }

    /* renamed from: c */
    public final String m51618c(C2181a c2181a) {
        int i = c2181a.f7938i;
        return i == -1 ? "" : this.f48967a.getString(aae.exo_track_bitrate, Float.valueOf(i / 1000000.0f));
    }

    /* renamed from: d */
    public final String m51619d(C2181a c2181a) {
        return TextUtils.isEmpty(c2181a.f7931b) ? "" : c2181a.f7931b;
    }

    /* renamed from: e */
    public final String m51620e(C2181a c2181a) {
        String strM51624j = m51624j(m51621f(c2181a), m51623h(c2181a));
        return TextUtils.isEmpty(strM51624j) ? m51619d(c2181a) : strM51624j;
    }

    /* renamed from: f */
    public final String m51621f(C2181a c2181a) {
        String str = c2181a.f7933d;
        if (TextUtils.isEmpty(str) || "und".equals(str)) {
            return "";
        }
        Locale localeForLanguageTag = sqi.f45790a >= 21 ? Locale.forLanguageTag(str) : new Locale(str);
        Locale localeM48717V = sqi.m48717V();
        String displayName = localeForLanguageTag.getDisplayName(localeM48717V);
        if (TextUtils.isEmpty(displayName)) {
            return "";
        }
        try {
            int iOffsetByCodePoints = displayName.offsetByCodePoints(0, 1);
            return displayName.substring(0, iOffsetByCodePoints).toUpperCase(localeM48717V) + displayName.substring(iOffsetByCodePoints);
        } catch (IndexOutOfBoundsException unused) {
            return displayName;
        }
    }

    /* renamed from: g */
    public final String m51622g(C2181a c2181a) {
        int i = c2181a.f7949t;
        int i2 = c2181a.f7950u;
        return (i == -1 || i2 == -1) ? "" : this.f48967a.getString(aae.exo_track_resolution, Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* renamed from: h */
    public final String m51623h(C2181a c2181a) {
        String string = (c2181a.f7935f & 2) != 0 ? this.f48967a.getString(aae.exo_track_role_alternate) : "";
        if ((c2181a.f7935f & 4) != 0) {
            string = m51624j(string, this.f48967a.getString(aae.exo_track_role_supplementary));
        }
        if ((c2181a.f7935f & 8) != 0) {
            string = m51624j(string, this.f48967a.getString(aae.exo_track_role_commentary));
        }
        return (c2181a.f7935f & 1088) != 0 ? m51624j(string, this.f48967a.getString(aae.exo_track_role_closed_captions)) : string;
    }

    /* renamed from: j */
    public final String m51624j(String... strArr) {
        String string = "";
        for (String str : strArr) {
            if (str.length() > 0) {
                string = TextUtils.isEmpty(string) ? str : this.f48967a.getString(aae.exo_item_list, string, str);
            }
        }
        return string;
    }
}
