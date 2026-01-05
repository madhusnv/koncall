package com.google.android.gms.fido.fido2.api.common;

import a2.AbstractC0030c;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.C0220a;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;
import gg.AbstractC2592g;
import gg.C2587b;
import gg.C2599n;
import gg.C2600o;
import gg.C2603r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p020v.a1;
import pg.AbstractC5932m;
import sf.AbstractC6840z;
import zf.AbstractC8947b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.gms.fido.fido2.api.common.c */
/* loaded from: classes.dex */
public final class C1277c extends AbstractC2592g {
    public static final Parcelable.Creator<C1277c> CREATOR = new C0220a(27);

    /* renamed from: a */
    public final C2599n f6030a;

    /* renamed from: b */
    public final C2600o f6031b;

    /* renamed from: c */
    public final byte[] f6032c;

    /* renamed from: d */
    public final List f6033d;

    /* renamed from: e */
    public final Double f6034e;

    /* renamed from: f */
    public final List f6035f;

    /* renamed from: g */
    public final C1276b f6036g;

    /* renamed from: h */
    public final Integer f6037h;

    /* renamed from: j */
    public final C2603r f6038j;

    /* renamed from: k */
    public final AttestationConveyancePreference f6039k;

    /* renamed from: l */
    public final C2587b f6040l;

    /* renamed from: m */
    public final String f6041m;

    /* renamed from: n */
    public final ResultReceiver f6042n;

    public C1277c(C2599n c2599n, C2600o c2600o, byte[] bArr, ArrayList arrayList, Double d2, ArrayList arrayList2, C1276b c1276b, Integer num, C2603r c2603r, String str, C2587b c2587b, String str2, ResultReceiver resultReceiver) {
        this.f6042n = resultReceiver;
        if (str2 != null) {
            try {
                C1277c c1277cM3099b = m3099b(new JSONObject(str2));
                this.f6030a = c1277cM3099b.f6030a;
                this.f6031b = c1277cM3099b.f6031b;
                this.f6032c = c1277cM3099b.f6032c;
                this.f6033d = c1277cM3099b.f6033d;
                this.f6034e = c1277cM3099b.f6034e;
                this.f6035f = c1277cM3099b.f6035f;
                this.f6036g = c1277cM3099b.f6036g;
                this.f6037h = c1277cM3099b.f6037h;
                this.f6038j = c1277cM3099b.f6038j;
                this.f6039k = c1277cM3099b.f6039k;
                this.f6040l = c1277cM3099b.f6040l;
                this.f6041m = str2;
                return;
            } catch (JSONException e2) {
                throw new IllegalArgumentException(e2);
            }
        }
        AbstractC6840z.m13036g(c2599n);
        this.f6030a = c2599n;
        AbstractC6840z.m13036g(c2600o);
        this.f6031b = c2600o;
        AbstractC6840z.m13036g(bArr);
        this.f6032c = bArr;
        AbstractC6840z.m13036g(arrayList);
        this.f6033d = arrayList;
        this.f6034e = d2;
        this.f6035f = arrayList2;
        this.f6036g = c1276b;
        this.f6037h = num;
        this.f6038j = c2603r;
        if (str != null) {
            try {
                this.f6039k = AttestationConveyancePreference.fromString(str);
            } catch (AttestationConveyancePreference.UnsupportedAttestationConveyancePreferenceException e10) {
                throw new IllegalArgumentException(e10);
            }
        } else {
            this.f6039k = null;
        }
        this.f6040l = c2587b;
        this.f6041m = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0269  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.fido.fido2.api.common.C1277c m3099b(org.json.JSONObject r31) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 812
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.fido2.api.common.C1277c.m3099b(org.json.JSONObject):com.google.android.gms.fido.fido2.api.common.c");
    }

    public final boolean equals(Object obj) {
        List list;
        if (!(obj instanceof C1277c)) {
            return false;
        }
        C1277c c1277c = (C1277c) obj;
        List list2 = c1277c.f6033d;
        List list3 = c1277c.f6035f;
        if (AbstractC6840z.m13040k(this.f6030a, c1277c.f6030a) && AbstractC6840z.m13040k(this.f6031b, c1277c.f6031b) && Arrays.equals(this.f6032c, c1277c.f6032c) && AbstractC6840z.m13040k(this.f6034e, c1277c.f6034e)) {
            List list4 = this.f6033d;
            if (list4.containsAll(list2) && list2.containsAll(list4) && ((((list = this.f6035f) == null && list3 == null) || (list != null && list3 != null && list.containsAll(list3) && list3.containsAll(list))) && AbstractC6840z.m13040k(this.f6036g, c1277c.f6036g) && AbstractC6840z.m13040k(this.f6037h, c1277c.f6037h) && AbstractC6840z.m13040k(this.f6038j, c1277c.f6038j) && AbstractC6840z.m13040k(this.f6039k, c1277c.f6039k) && AbstractC6840z.m13040k(this.f6040l, c1277c.f6040l) && AbstractC6840z.m13040k(this.f6041m, c1277c.f6041m))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6030a, this.f6031b, Integer.valueOf(Arrays.hashCode(this.f6032c)), this.f6033d, this.f6034e, this.f6035f, this.f6036g, this.f6037h, this.f6038j, this.f6039k, this.f6040l, this.f6041m});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f6030a);
        String strValueOf2 = String.valueOf(this.f6031b);
        String strM16426c = AbstractC8947b.m16426c(this.f6032c);
        String strValueOf3 = String.valueOf(this.f6033d);
        String strValueOf4 = String.valueOf(this.f6035f);
        String strValueOf5 = String.valueOf(this.f6036g);
        String strValueOf6 = String.valueOf(this.f6038j);
        String strValueOf7 = String.valueOf(this.f6039k);
        String strValueOf8 = String.valueOf(this.f6040l);
        StringBuilder sbM127r = AbstractC0030c.m127r("PublicKeyCredentialCreationOptions{\n rp=", strValueOf, ", \n user=", strValueOf2, ", \n challenge=");
        a1.m14319B(sbM127r, strM16426c, ", \n parameters=", strValueOf3, ", \n timeoutSeconds=");
        sbM127r.append(this.f6034e);
        sbM127r.append(", \n excludeList=");
        sbM127r.append(strValueOf4);
        sbM127r.append(", \n authenticatorSelection=");
        sbM127r.append(strValueOf5);
        sbM127r.append(", \n requestId=");
        sbM127r.append(this.f6037h);
        sbM127r.append(", \n tokenBinding=");
        sbM127r.append(strValueOf6);
        sbM127r.append(", \n attestationConveyancePreference=");
        return AbstractC0030c.m124o(sbM127r, strValueOf7, ", \n authenticationExtensions=", strValueOf8, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11777e(parcel, 2, this.f6030a, i10);
        AbstractC5932m.m11777e(parcel, 3, this.f6031b, i10);
        AbstractC5932m.m11775c(parcel, 4, this.f6032c);
        AbstractC5932m.m11782j(parcel, 5, this.f6033d);
        Double d2 = this.f6034e;
        if (d2 != null) {
            AbstractC5932m.m11785m(parcel, 6, 8);
            parcel.writeDouble(d2.doubleValue());
        }
        AbstractC5932m.m11782j(parcel, 7, this.f6035f);
        AbstractC5932m.m11777e(parcel, 8, this.f6036g, i10);
        Integer num = this.f6037h;
        if (num != null) {
            AbstractC5932m.m11785m(parcel, 9, 4);
            parcel.writeInt(num.intValue());
        }
        AbstractC5932m.m11777e(parcel, 10, this.f6038j, i10);
        AttestationConveyancePreference attestationConveyancePreference = this.f6039k;
        AbstractC5932m.m11778f(parcel, 11, attestationConveyancePreference == null ? null : attestationConveyancePreference.toString());
        AbstractC5932m.m11777e(parcel, 12, this.f6040l, i10);
        AbstractC5932m.m11778f(parcel, 13, this.f6041m);
        AbstractC5932m.m11777e(parcel, 14, this.f6042n, i10);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }

    public C1277c(String str) {
        try {
            C1277c c1277cM3099b = m3099b(new JSONObject(str));
            this.f6030a = c1277cM3099b.f6030a;
            this.f6031b = c1277cM3099b.f6031b;
            this.f6032c = c1277cM3099b.f6032c;
            this.f6033d = c1277cM3099b.f6033d;
            this.f6034e = c1277cM3099b.f6034e;
            this.f6035f = c1277cM3099b.f6035f;
            this.f6036g = c1277cM3099b.f6036g;
            this.f6037h = c1277cM3099b.f6037h;
            this.f6038j = c1277cM3099b.f6038j;
            this.f6039k = c1277cM3099b.f6039k;
            this.f6040l = c1277cM3099b.f6040l;
            this.f6041m = str;
        } catch (JSONException e2) {
            throw new IllegalArgumentException(e2);
        }
    }
}
