package com.websoptimization.callyzerbiz.data.model.response.lead_form_response;

import com.sun.mail.util.AbstractC1452a;
import j$.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import mm.AbstractC4801l;
import vm.EnumC7725b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class ComponentSettings {

    @InterfaceC4485b("dateFormat")
    private final String dateFormat;

    @InterfaceC4485b("inputType")
    private final EnumC7725b inputType;

    @InterfaceC4485b("isMultiselect")
    private final boolean isMultiselect;

    @InterfaceC4485b("maxDate")
    private final LocalDate maxDate;

    @InterfaceC4485b("maxLength")
    private final Integer maxLength;

    @InterfaceC4485b("maxValue")
    private final Double maxValue;

    @InterfaceC4485b("minDate")
    private final LocalDate minDate;

    @InterfaceC4485b("minLength")
    private final Integer minLength;

    @InterfaceC4485b("minValue")
    private final Double minValue;

    @InterfaceC4485b("options")
    private final List<Options> options;

    @InterfaceC4485b("placeholder")
    private final String placeholder;

    public ComponentSettings(List<Options> options, String str, Double d2, Double d10, LocalDate localDate, LocalDate localDate2, String str2, boolean z6, Integer num, Integer num2, EnumC7725b inputType) {
        AbstractC4154l.m8923f(options, "options");
        AbstractC4154l.m8923f(inputType, "inputType");
        this.options = options;
        this.placeholder = str;
        this.minValue = d2;
        this.maxValue = d10;
        this.minDate = localDate;
        this.maxDate = localDate2;
        this.dateFormat = str2;
        this.isMultiselect = z6;
        this.maxLength = num;
        this.minLength = num2;
        this.inputType = inputType;
    }

    /* renamed from: a */
    public final String m4944a() {
        return this.dateFormat;
    }

    /* renamed from: b */
    public final EnumC7725b m4945b() {
        return this.inputType;
    }

    /* renamed from: c */
    public final LocalDate m4946c() {
        return this.maxDate;
    }

    /* renamed from: d */
    public final Integer m4947d() {
        return this.maxLength;
    }

    /* renamed from: e */
    public final Double m4948e() {
        return this.maxValue;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComponentSettings)) {
            return false;
        }
        ComponentSettings componentSettings = (ComponentSettings) obj;
        return AbstractC4154l.m8918a(this.options, componentSettings.options) && AbstractC4154l.m8918a(this.placeholder, componentSettings.placeholder) && AbstractC4154l.m8918a(this.minValue, componentSettings.minValue) && AbstractC4154l.m8918a(this.maxValue, componentSettings.maxValue) && AbstractC4154l.m8918a(this.minDate, componentSettings.minDate) && AbstractC4154l.m8918a(this.maxDate, componentSettings.maxDate) && AbstractC4154l.m8918a(this.dateFormat, componentSettings.dateFormat) && this.isMultiselect == componentSettings.isMultiselect && AbstractC4154l.m8918a(this.maxLength, componentSettings.maxLength) && AbstractC4154l.m8918a(this.minLength, componentSettings.minLength) && this.inputType == componentSettings.inputType;
    }

    /* renamed from: f */
    public final LocalDate m4949f() {
        return this.minDate;
    }

    /* renamed from: g */
    public final Integer m4950g() {
        return this.minLength;
    }

    /* renamed from: h */
    public final Double m4951h() {
        return this.minValue;
    }

    public final int hashCode() {
        int iHashCode = this.options.hashCode() * 31;
        String str = this.placeholder;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Double d2 = this.minValue;
        int iHashCode3 = (iHashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d10 = this.maxValue;
        int iHashCode4 = (iHashCode3 + (d10 == null ? 0 : d10.hashCode())) * 31;
        LocalDate localDate = this.minDate;
        int iHashCode5 = (iHashCode4 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalDate localDate2 = this.maxDate;
        int iHashCode6 = (iHashCode5 + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
        String str2 = this.dateFormat;
        int iM4558e = AbstractC1452a.m4558e((iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.isMultiselect);
        Integer num = this.maxLength;
        int iHashCode7 = (iM4558e + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.minLength;
        return this.inputType.hashCode() + ((iHashCode7 + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    /* renamed from: i */
    public final List m4952i() {
        return this.options;
    }

    /* renamed from: j */
    public final String m4953j() {
        return this.placeholder;
    }

    /* renamed from: k */
    public final boolean m4954k() {
        return this.isMultiselect;
    }

    public final String toString() {
        List<Options> list = this.options;
        String str = this.placeholder;
        Double d2 = this.minValue;
        Double d10 = this.maxValue;
        LocalDate localDate = this.minDate;
        LocalDate localDate2 = this.maxDate;
        String str2 = this.dateFormat;
        boolean z6 = this.isMultiselect;
        Integer num = this.maxLength;
        Integer num2 = this.minLength;
        EnumC7725b enumC7725b = this.inputType;
        StringBuilder sb2 = new StringBuilder("ComponentSettings(options=");
        sb2.append(list);
        sb2.append(", placeholder=");
        sb2.append(str);
        sb2.append(", minValue=");
        sb2.append(d2);
        sb2.append(", maxValue=");
        sb2.append(d10);
        sb2.append(", minDate=");
        sb2.append(localDate);
        sb2.append(", maxDate=");
        sb2.append(localDate2);
        sb2.append(", dateFormat=");
        AbstractC4801l.m9749w(sb2, str2, ", isMultiselect=", z6, ", maxLength=");
        sb2.append(num);
        sb2.append(", minLength=");
        sb2.append(num2);
        sb2.append(", inputType=");
        sb2.append(enumC7725b);
        sb2.append(")");
        return sb2.toString();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ ComponentSettings(java.util.List r2, java.lang.String r3, java.lang.Double r4, java.lang.Double r5, j$.time.LocalDate r6, j$.time.LocalDate r7, java.lang.String r8, boolean r9, java.lang.Integer r10, java.lang.Integer r11, vm.EnumC7725b r12, int r13, kotlin.jvm.internal.AbstractC4148f r14) {
        /*
            r1 = this;
            r14 = r13 & 1
            if (r14 == 0) goto L6
            rw.r r2 = rw.C6668r.f31943a
        L6:
            r14 = r13 & 2
            r0 = 0
            if (r14 == 0) goto Lc
            r3 = r0
        Lc:
            r14 = r13 & 4
            if (r14 == 0) goto L11
            r4 = r0
        L11:
            r14 = r13 & 8
            if (r14 == 0) goto L16
            r5 = r0
        L16:
            r14 = r13 & 16
            if (r14 == 0) goto L1b
            r6 = r0
        L1b:
            r14 = r13 & 32
            if (r14 == 0) goto L20
            r7 = r0
        L20:
            r14 = r13 & 64
            if (r14 == 0) goto L25
            r8 = r0
        L25:
            r14 = r13 & 256(0x100, float:3.59E-43)
            if (r14 == 0) goto L2a
            r10 = r0
        L2a:
            r13 = r13 & 512(0x200, float:7.17E-43)
            if (r13 == 0) goto L3b
            r13 = r0
            r11 = r9
            r14 = r12
            r9 = r7
            r12 = r10
            r7 = r5
            r10 = r8
            r5 = r3
            r8 = r6
            r3 = r1
            r6 = r4
        L39:
            r4 = r2
            goto L47
        L3b:
            r13 = r11
            r14 = r12
            r11 = r9
            r12 = r10
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            goto L39
        L47:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.websoptimization.callyzerbiz.data.model.response.lead_form_response.ComponentSettings.<init>(java.util.List, java.lang.String, java.lang.Double, java.lang.Double, j$.time.LocalDate, j$.time.LocalDate, java.lang.String, boolean, java.lang.Integer, java.lang.Integer, vm.b, int, kotlin.jvm.internal.f):void");
    }
}
