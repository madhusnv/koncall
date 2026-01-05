package com.websoptimization.callyzerbiz.ui.more.contact_us_form.model;

import a2.AbstractC0030c;
import android.net.Uri;
import com.sun.mail.imap.IMAPStore;
import com.sun.mail.util.AbstractC1452a;
import java.util.List;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class ContactUsForm {

    @InterfaceC4485b("contactNumber")
    private final String contactNumber;

    @InterfaceC4485b("countryCode")
    private final int countryCode;

    @InterfaceC4485b("mediaUris")
    private final List<Uri> mediaUris;

    @InterfaceC4485b("message")
    private final String message;

    @InterfaceC4485b(IMAPStore.ID_NAME)
    private final String name;

    @InterfaceC4485b("selectType")
    private final String selectType;

    /* JADX WARN: Multi-variable type inference failed */
    public ContactUsForm(String selectType, String name, String contactNumber, int i10, String message, List<? extends Uri> mediaUris) {
        AbstractC4154l.m8923f(selectType, "selectType");
        AbstractC4154l.m8923f(name, "name");
        AbstractC4154l.m8923f(contactNumber, "contactNumber");
        AbstractC4154l.m8923f(message, "message");
        AbstractC4154l.m8923f(mediaUris, "mediaUris");
        this.selectType = selectType;
        this.name = name;
        this.contactNumber = contactNumber;
        this.countryCode = i10;
        this.message = message;
        this.mediaUris = mediaUris;
    }

    /* renamed from: a */
    public final String m5035a() {
        return this.contactNumber;
    }

    /* renamed from: b */
    public final int m5036b() {
        return this.countryCode;
    }

    /* renamed from: c */
    public final List m5037c() {
        return this.mediaUris;
    }

    /* renamed from: d */
    public final String m5038d() {
        return this.message;
    }

    /* renamed from: e */
    public final String m5039e() {
        return this.name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactUsForm)) {
            return false;
        }
        ContactUsForm contactUsForm = (ContactUsForm) obj;
        return AbstractC4154l.m8918a(this.selectType, contactUsForm.selectType) && AbstractC4154l.m8918a(this.name, contactUsForm.name) && AbstractC4154l.m8918a(this.contactNumber, contactUsForm.contactNumber) && this.countryCode == contactUsForm.countryCode && AbstractC4154l.m8918a(this.message, contactUsForm.message) && AbstractC4154l.m8918a(this.mediaUris, contactUsForm.mediaUris);
    }

    /* renamed from: f */
    public final String m5040f() {
        return this.selectType;
    }

    public final int hashCode() {
        return this.mediaUris.hashCode() + AbstractC0030c.m113d(AbstractC1452a.m4556c(this.countryCode, AbstractC0030c.m113d(AbstractC0030c.m113d(this.selectType.hashCode() * 31, 31, this.name), 31, this.contactNumber), 31), 31, this.message);
    }

    public final String toString() {
        String str = this.selectType;
        String str2 = this.name;
        String str3 = this.contactNumber;
        int i10 = this.countryCode;
        String str4 = this.message;
        List<Uri> list = this.mediaUris;
        StringBuilder sbM127r = AbstractC0030c.m127r("ContactUsForm(selectType=", str, ", name=", str2, ", contactNumber=");
        AbstractC1452a.m4551B(sbM127r, str3, ", countryCode=", i10, ", message=");
        sbM127r.append(str4);
        sbM127r.append(", mediaUris=");
        sbM127r.append(list);
        sbM127r.append(")");
        return sbM127r.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ContactUsForm(String str, String str2, String str3, int i10, String str4, List list, int i11, AbstractC4148f abstractC4148f) {
        List list2;
        String str5;
        str = (i11 & 1) != 0 ? "" : str;
        str2 = (i11 & 2) != 0 ? "" : str2;
        str3 = (i11 & 4) != 0 ? "" : str3;
        i10 = (i11 & 8) != 0 ? 0 : i10;
        if ((i11 & 16) != 0) {
            list2 = list;
            str5 = "";
        } else {
            list2 = list;
            str5 = str4;
        }
        this(str, str2, str3, i10, str5, list2);
    }
}
