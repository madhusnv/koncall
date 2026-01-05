package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.Attachment;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement;
import com.sun.mail.util.AbstractC1452a;
import gg.EnumC2605t;
import gg.b0;
import i0.m0;
import java.util.Arrays;
import pg.AbstractC5932m;
import sf.AbstractC6840z;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.gms.fido.fido2.api.common.b */
/* loaded from: classes.dex */
public final class C1276b extends AbstractC7149a {
    public static final Parcelable.Creator<C1276b> CREATOR = new b0(18);

    /* renamed from: a */
    public final Attachment f6026a;

    /* renamed from: b */
    public final Boolean f6027b;

    /* renamed from: c */
    public final EnumC2605t f6028c;

    /* renamed from: d */
    public final ResidentKeyRequirement f6029d;

    public C1276b(String str, Boolean bool, String str2, String str3) {
        Attachment attachmentFromString;
        ResidentKeyRequirement residentKeyRequirementFromString = null;
        if (str == null) {
            attachmentFromString = null;
        } else {
            try {
                attachmentFromString = Attachment.fromString(str);
            } catch (Attachment.UnsupportedAttachmentException | ResidentKeyRequirement.UnsupportedResidentKeyRequirementException | zzbc e2) {
                throw new IllegalArgumentException(e2);
            }
        }
        this.f6026a = attachmentFromString;
        this.f6027b = bool;
        this.f6028c = str2 == null ? null : EnumC2605t.fromString(str2);
        if (str3 != null) {
            residentKeyRequirementFromString = ResidentKeyRequirement.fromString(str3);
        }
        this.f6029d = residentKeyRequirementFromString;
    }

    /* renamed from: b */
    public final ResidentKeyRequirement m3098b() {
        ResidentKeyRequirement residentKeyRequirement = this.f6029d;
        if (residentKeyRequirement != null) {
            return residentKeyRequirement;
        }
        Boolean bool = this.f6027b;
        if (bool == null || !bool.booleanValue()) {
            return null;
        }
        return ResidentKeyRequirement.RESIDENT_KEY_REQUIRED;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1276b)) {
            return false;
        }
        C1276b c1276b = (C1276b) obj;
        return AbstractC6840z.m13040k(this.f6026a, c1276b.f6026a) && AbstractC6840z.m13040k(this.f6027b, c1276b.f6027b) && AbstractC6840z.m13040k(this.f6028c, c1276b.f6028c) && AbstractC6840z.m13040k(m3098b(), c1276b.m3098b());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6026a, this.f6027b, this.f6028c, m3098b()});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f6026a);
        String strValueOf2 = String.valueOf(this.f6028c);
        String strValueOf3 = String.valueOf(this.f6029d);
        StringBuilder sbM7383p = m0.m7383p("AuthenticatorSelectionCriteria{\n attachment=", strValueOf, ", \n requireResidentKey=");
        sbM7383p.append(this.f6027b);
        sbM7383p.append(", \n requireUserVerification=");
        sbM7383p.append(strValueOf2);
        sbM7383p.append(", \n residentKeyRequirement=");
        return AbstractC1452a.m4564k(sbM7383p, strValueOf3, "\n }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        Attachment attachment = this.f6026a;
        AbstractC5932m.m11778f(parcel, 2, attachment == null ? null : attachment.toString());
        Boolean bool = this.f6027b;
        if (bool != null) {
            AbstractC5932m.m11785m(parcel, 3, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        EnumC2605t enumC2605t = this.f6028c;
        AbstractC5932m.m11778f(parcel, 4, enumC2605t == null ? null : enumC2605t.toString());
        ResidentKeyRequirement residentKeyRequirementM3098b = m3098b();
        AbstractC5932m.m11778f(parcel, 5, residentKeyRequirementM3098b != null ? residentKeyRequirementM3098b.toString() : null);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
