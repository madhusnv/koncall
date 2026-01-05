package p001o;

import android.text.TextUtils;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import java.util.regex.Pattern;
import p001o.lif;

/* loaded from: classes2.dex */
public final class zgh {

    /* renamed from: d */
    public static final Pattern f57172d = Pattern.compile("\\s+");

    /* renamed from: e */
    public static final pf8 f57173e = pf8.m43573F("auto", DevicePublicKeyStringDef.NONE);

    /* renamed from: f */
    public static final pf8 f57174f = pf8.m43574G("dot", "sesame", "circle");

    /* renamed from: g */
    public static final pf8 f57175g = pf8.m43573F("filled", "open");

    /* renamed from: h */
    public static final pf8 f57176h = pf8.m43574G("after", "before", "outside");

    /* renamed from: a */
    public final int f57177a;

    /* renamed from: b */
    public final int f57178b;

    /* renamed from: c */
    public final int f57179c;

    public zgh(int i, int i2, int i3) {
        this.f57177a = i;
        this.f57178b = i2;
        this.f57179c = i3;
    }

    /* renamed from: a */
    public static zgh m59389a(String str) {
        if (str == null) {
            return null;
        }
        String strM35995e = kp0.m35995e(str.trim());
        if (strM35995e.isEmpty()) {
            return null;
        }
        return m59390b(pf8.m43583y(TextUtils.split(strM35995e, f57172d)));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0113  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zgh m59390b(pf8 pf8Var) {
        boolean z;
        boolean z2;
        String str = (String) z59.m58772c(lif.m37325e(f57176h, pf8Var), "outside");
        int iHashCode = str.hashCode();
        boolean z3 = false;
        boolean z4 = true;
        if (iHashCode != -1392885889) {
            if (iHashCode != -1106037339) {
                z = (iHashCode == 92734940 && str.equals("after")) ? false : -1;
            } else if (str.equals("outside")) {
                z = true;
            }
        } else if (str.equals("before")) {
            z = 2;
        }
        int i = z ? !z ? 1 : -2 : 2;
        lif.AbstractC15086e abstractC15086eM37325e = lif.m37325e(f57173e, pf8Var);
        if (!abstractC15086eM37325e.isEmpty()) {
            String str2 = (String) abstractC15086eM37325e.iterator().next();
            int iHashCode2 = str2.hashCode();
            if (iHashCode2 != 3005871) {
                z4 = (iHashCode2 == 3387192 && str2.equals(DevicePublicKeyStringDef.NONE)) ? false : -1;
            } else if (!str2.equals("auto")) {
            }
            return new zgh(z4 ? -1 : 0, 0, i);
        }
        lif.AbstractC15086e abstractC15086eM37325e2 = lif.m37325e(f57175g, pf8Var);
        lif.AbstractC15086e abstractC15086eM37325e3 = lif.m37325e(f57174f, pf8Var);
        if (abstractC15086eM37325e2.isEmpty() && abstractC15086eM37325e3.isEmpty()) {
            return new zgh(-1, 0, i);
        }
        String str3 = (String) z59.m58772c(abstractC15086eM37325e2, "filled");
        int iHashCode3 = str3.hashCode();
        if (iHashCode3 != -1274499742) {
            z2 = (iHashCode3 == 3417674 && str3.equals("open")) ? false : -1;
        } else if (str3.equals("filled")) {
            z2 = true;
        }
        int i2 = z2 ? 1 : 2;
        String str4 = (String) z59.m58772c(abstractC15086eM37325e3, "circle");
        int iHashCode4 = str4.hashCode();
        if (iHashCode4 != -1360216880) {
            if (iHashCode4 != -905816648) {
                if (iHashCode4 != 99657 || !str4.equals("dot")) {
                    z3 = -1;
                }
            } else if (str4.equals("sesame")) {
                z3 = true;
            }
        } else if (str4.equals("circle")) {
            z3 = 2;
        }
        return new zgh(z3 ? !z3 ? 1 : 3 : 2, i2, i);
    }
}
