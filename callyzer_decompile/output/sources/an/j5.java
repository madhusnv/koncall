package an;

import android.content.Context;
import au.C0442f;
import c9.C0917l;
import c9.C0927v;
import cm.C0983a;
import com.amplifyframework.auth.cognito.helpers.HostedUIHttpHelper;
import com.amplifyframework.core.configuration.AmplifyOutputsData;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import cv.C1517m;
import dd.C1684b;
import dd.C1687e;
import dd.C1692j;
import dd.C1700r;
import ex.InterfaceC2139c;
import g2.ka;
import j$.time.LocalDateTime;
import java.util.ArrayList;
import k8.InterfaceC4024a;
import k8.InterfaceC4026c;
import kotlin.jvm.internal.AbstractC4154l;
import ky.C4276h;
import mm.C4791b;
import mm.C4802m;
import og.re;
import og.se;
import org.bouncycastle.iana.AEADAlgorithm;
import qm.C6250f;
import y4.C8540a;
import y4.C8541b;
import y4.C8545f;
import yv.C8800o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j5 implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f983a;

    public /* synthetic */ j5(int i10) {
        this.f983a = i10;
    }

    /* renamed from: a */
    private final Object m488a(Object obj) throws Exception {
        InterfaceC4024a _connection = (InterfaceC4024a) obj;
        AbstractC4154l.m8923f(_connection, "_connection");
        InterfaceC4026c interfaceC4026cY0 = _connection.y0("SELECT * FROM message_template_tag");
        try {
            int iM10916d = se.m10916d(interfaceC4026cY0, "id");
            int iM10916d2 = se.m10916d(interfaceC4026cY0, "tag_name");
            ArrayList arrayList = new ArrayList();
            while (interfaceC4026cY0.r0()) {
                arrayList.add(new C6250f((int) interfaceC4026cY0.getLong(iM10916d), interfaceC4026cY0.mo1777W(iM10916d2)));
            }
            return arrayList;
        } finally {
            interfaceC4026cY0.close();
        }
    }

    /* renamed from: b */
    private final Object m489b(Object obj) {
        C1700r DslBuilderProperty = (C1700r) obj;
        AbstractC4154l.m8923f(DslBuilderProperty, "$this$DslBuilderProperty");
        return new C1517m(DslBuilderProperty.f8303a);
    }

    /* renamed from: d */
    private final Object m490d(Object obj) {
        C8540a constrain = (C8540a) obj;
        AbstractC4154l.m8923f(constrain, "$this$constrain");
        C0927v c0927v = constrain.f41486c;
        C8541b c8541b = constrain.f41485b;
        C0927v.m2699n(c0927v, c8541b.f41493c, DefinitionKt.NO_Float_VALUE, 6);
        C0917l.m2636k(constrain.f41489f, c8541b.f41496f, DefinitionKt.NO_Float_VALUE, 6);
        return qw.a0.f30746a;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) throws Exception {
        InterfaceC4026c interfaceC4026cY0;
        LocalDateTime localDateTimeM16183G;
        LocalDateTime localDateTimeM16183G2;
        LocalDateTime localDateTimeM16183G3;
        LocalDateTime localDateTimeM16183G4;
        LocalDateTime localDateTimeM16183G5;
        String strMo1777W;
        int i10;
        LocalDateTime localDateTimeM16183G6;
        LocalDateTime localDateTimeM16183G7;
        LocalDateTime localDateTimeM16183G8;
        LocalDateTime localDateTimeM16183G9;
        LocalDateTime localDateTimeM16183G10;
        String strMo1777W2;
        int i11;
        int i12;
        LocalDateTime localDateTimeM16183G11;
        LocalDateTime localDateTimeM16183G12;
        LocalDateTime localDateTimeM16183G13;
        LocalDateTime localDateTimeM16183G14;
        LocalDateTime localDateTimeM16183G15;
        String strMo1777W3;
        int i13;
        int i14;
        int i15 = this.f983a;
        Object objM16183G = null;
        qw.a0 a0Var = qw.a0.f30746a;
        switch (i15) {
            case 0:
                InterfaceC4024a _connection = (InterfaceC4024a) obj;
                AbstractC4154l.m8923f(_connection, "_connection");
                interfaceC4026cY0 = _connection.y0("SELECT MAX(last_call_sync) FROM UserSimDetails WHERE is_connect = '1' AND last_call_sync <> '' AND last_call_sync IS NOT NULL");
                try {
                    if (interfaceC4026cY0.r0()) {
                        String strMo1777W4 = interfaceC4026cY0.isNull(0) ? null : interfaceC4026cY0.mo1777W(0);
                        if (strMo1777W4 != null) {
                            C8800o c8800o = C8800o.f42459a;
                            objM16183G = C8800o.m16183G(strMo1777W4);
                        }
                    }
                    return objM16183G;
                } finally {
                }
            case 1:
                InterfaceC4024a _connection2 = (InterfaceC4024a) obj;
                AbstractC4154l.m8923f(_connection2, "_connection");
                try {
                    _connection2.y0("delete from UserSimDetails").r0();
                    return a0Var;
                } finally {
                }
            case 2:
                InterfaceC4024a _connection3 = (InterfaceC4024a) obj;
                AbstractC4154l.m8923f(_connection3, "_connection");
                interfaceC4026cY0 = _connection3.y0("SELECT * FROM UserSimDetails");
                try {
                    int iM10916d = se.m10916d(interfaceC4026cY0, "id");
                    int iM10916d2 = se.m10916d(interfaceC4026cY0, "carrier_name");
                    int iM10916d3 = se.m10916d(interfaceC4026cY0, "sim_number");
                    int iM10916d4 = se.m10916d(interfaceC4026cY0, "sim_country_code");
                    int iM10916d5 = se.m10916d(interfaceC4026cY0, "slot");
                    int iM10916d6 = se.m10916d(interfaceC4026cY0, "icc_id");
                    int iM10916d7 = se.m10916d(interfaceC4026cY0, "sub_id");
                    int iM10916d8 = se.m10916d(interfaceC4026cY0, "user_name");
                    int iM10916d9 = se.m10916d(interfaceC4026cY0, "device_connect_code");
                    int iM10916d10 = se.m10916d(interfaceC4026cY0, "is_connect");
                    int iM10916d11 = se.m10916d(interfaceC4026cY0, "last_call_sync");
                    int iM10916d12 = se.m10916d(interfaceC4026cY0, "sync_subscription_start_time");
                    int iM10916d13 = se.m10916d(interfaceC4026cY0, "sync_subscription_end_time");
                    int iM10916d14 = se.m10916d(interfaceC4026cY0, "is_lead");
                    int iM10916d15 = se.m10916d(interfaceC4026cY0, "is_sync_lead_numbers");
                    int iM10916d16 = se.m10916d(interfaceC4026cY0, "employee_code");
                    int iM10916d17 = se.m10916d(interfaceC4026cY0, "is_call_recording");
                    int iM10916d18 = se.m10916d(interfaceC4026cY0, "call_recording_subscription_start_time");
                    int iM10916d19 = se.m10916d(interfaceC4026cY0, "call_recording_subscription_end_time");
                    int iM10916d20 = se.m10916d(interfaceC4026cY0, "employee_id");
                    int iM10916d21 = se.m10916d(interfaceC4026cY0, "customer_name");
                    int iM10916d22 = se.m10916d(interfaceC4026cY0, "customer_country_name");
                    int iM10916d23 = se.m10916d(interfaceC4026cY0, "customer_country_code");
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC4026cY0.r0()) {
                        int i16 = iM10916d14;
                        int i17 = iM10916d13;
                        int i18 = (int) interfaceC4026cY0.getLong(iM10916d);
                        String strMo1777W5 = interfaceC4026cY0.isNull(iM10916d2) ? null : interfaceC4026cY0.mo1777W(iM10916d2);
                        String strMo1777W6 = interfaceC4026cY0.isNull(iM10916d3) ? null : interfaceC4026cY0.mo1777W(iM10916d3);
                        int i19 = iM10916d2;
                        int i20 = iM10916d;
                        int i21 = (int) interfaceC4026cY0.getLong(iM10916d4);
                        int i22 = (int) interfaceC4026cY0.getLong(iM10916d5);
                        String strMo1777W7 = interfaceC4026cY0.isNull(iM10916d6) ? null : interfaceC4026cY0.mo1777W(iM10916d6);
                        int i23 = (int) interfaceC4026cY0.getLong(iM10916d7);
                        String strMo1777W8 = interfaceC4026cY0.isNull(iM10916d8) ? null : interfaceC4026cY0.mo1777W(iM10916d8);
                        String strMo1777W9 = interfaceC4026cY0.isNull(iM10916d9) ? null : interfaceC4026cY0.mo1777W(iM10916d9);
                        boolean z6 = ((int) interfaceC4026cY0.getLong(iM10916d10)) != 0;
                        String strMo1777W10 = interfaceC4026cY0.isNull(iM10916d11) ? null : interfaceC4026cY0.mo1777W(iM10916d11);
                        if (strMo1777W10 != null) {
                            C8800o c8800o2 = C8800o.f42459a;
                            localDateTimeM16183G = C8800o.m16183G(strMo1777W10);
                        } else {
                            localDateTimeM16183G = null;
                        }
                        String strMo1777W11 = interfaceC4026cY0.isNull(iM10916d12) ? null : interfaceC4026cY0.mo1777W(iM10916d12);
                        if (strMo1777W11 != null) {
                            C8800o c8800o3 = C8800o.f42459a;
                            localDateTimeM16183G2 = C8800o.m16183G(strMo1777W11);
                        } else {
                            localDateTimeM16183G2 = null;
                        }
                        String strMo1777W12 = interfaceC4026cY0.isNull(i17) ? null : interfaceC4026cY0.mo1777W(i17);
                        if (strMo1777W12 != null) {
                            C8800o c8800o4 = C8800o.f42459a;
                            localDateTimeM16183G3 = C8800o.m16183G(strMo1777W12);
                        } else {
                            localDateTimeM16183G3 = null;
                        }
                        int i24 = iM10916d3;
                        boolean z10 = ((int) interfaceC4026cY0.getLong(i16)) != 0;
                        int i25 = iM10916d15;
                        boolean z11 = ((int) interfaceC4026cY0.getLong(i25)) != 0;
                        int i26 = iM10916d16;
                        String strMo1777W13 = interfaceC4026cY0.mo1777W(i26);
                        iM10916d15 = i25;
                        int i27 = iM10916d17;
                        boolean z12 = ((int) interfaceC4026cY0.getLong(i27)) != 0;
                        int i28 = iM10916d18;
                        String strMo1777W14 = interfaceC4026cY0.isNull(i28) ? null : interfaceC4026cY0.mo1777W(i28);
                        if (strMo1777W14 != null) {
                            C8800o c8800o5 = C8800o.f42459a;
                            localDateTimeM16183G4 = C8800o.m16183G(strMo1777W14);
                        } else {
                            localDateTimeM16183G4 = null;
                        }
                        int i29 = iM10916d19;
                        String strMo1777W15 = interfaceC4026cY0.isNull(i29) ? null : interfaceC4026cY0.mo1777W(i29);
                        if (strMo1777W15 != null) {
                            C8800o c8800o6 = C8800o.f42459a;
                            localDateTimeM16183G5 = C8800o.m16183G(strMo1777W15);
                        } else {
                            localDateTimeM16183G5 = null;
                        }
                        int i30 = iM10916d20;
                        String strMo1777W16 = interfaceC4026cY0.mo1777W(i30);
                        iM10916d20 = i30;
                        int i31 = iM10916d21;
                        String strMo1777W17 = interfaceC4026cY0.isNull(i31) ? null : interfaceC4026cY0.mo1777W(i31);
                        iM10916d21 = i31;
                        int i32 = iM10916d22;
                        if (interfaceC4026cY0.isNull(i32)) {
                            strMo1777W = null;
                            iM10916d22 = i32;
                            iM10916d18 = i28;
                            iM10916d19 = i29;
                            i10 = iM10916d23;
                        } else {
                            strMo1777W = interfaceC4026cY0.mo1777W(i32);
                            iM10916d22 = i32;
                            iM10916d19 = i29;
                            i10 = iM10916d23;
                            iM10916d18 = i28;
                        }
                        arrayList.add(new C4802m(i18, strMo1777W5, strMo1777W6, i21, i22, strMo1777W7, i23, strMo1777W8, strMo1777W9, z6, localDateTimeM16183G, localDateTimeM16183G2, localDateTimeM16183G3, z10, z11, strMo1777W13, z12, localDateTimeM16183G4, localDateTimeM16183G5, strMo1777W16, strMo1777W17, strMo1777W, (int) interfaceC4026cY0.getLong(i10)));
                        iM10916d17 = i27;
                        iM10916d = i20;
                        iM10916d13 = i17;
                        iM10916d16 = i26;
                        iM10916d23 = i10;
                        iM10916d3 = i24;
                        iM10916d14 = i16;
                        iM10916d2 = i19;
                    }
                    return arrayList;
                } finally {
                }
            case 3:
                InterfaceC4024a _connection4 = (InterfaceC4024a) obj;
                AbstractC4154l.m8923f(_connection4, "_connection");
                interfaceC4026cY0 = _connection4.y0("SELECT MIN(last_call_sync) FROM UserSimDetails WHERE is_connect = '1' AND last_call_sync <> '' AND last_call_sync IS NOT NULL");
                try {
                    if (interfaceC4026cY0.r0()) {
                        String strMo1777W18 = interfaceC4026cY0.isNull(0) ? null : interfaceC4026cY0.mo1777W(0);
                        if (strMo1777W18 != null) {
                            C8800o c8800o7 = C8800o.f42459a;
                            objM16183G = C8800o.m16183G(strMo1777W18);
                        }
                    }
                    return objM16183G;
                } finally {
                }
            case 4:
                InterfaceC4024a _connection5 = (InterfaceC4024a) obj;
                AbstractC4154l.m8923f(_connection5, "_connection");
                interfaceC4026cY0 = _connection5.y0("SELECT MAX(sync_subscription_end_time) FROM UserSimDetails WHERE is_connect = '1' AND sync_subscription_end_time <> '' AND sync_subscription_end_time IS NOT NULL");
                try {
                    if (interfaceC4026cY0.r0()) {
                        String strMo1777W19 = interfaceC4026cY0.isNull(0) ? null : interfaceC4026cY0.mo1777W(0);
                        if (strMo1777W19 != null) {
                            C8800o c8800o8 = C8800o.f42459a;
                            objM16183G = C8800o.m16183G(strMo1777W19);
                        }
                    }
                    return objM16183G;
                } finally {
                }
            case 5:
                InterfaceC4024a _connection6 = (InterfaceC4024a) obj;
                AbstractC4154l.m8923f(_connection6, "_connection");
                interfaceC4026cY0 = _connection6.y0("SELECT * FROM UserSimDetails WHERE  is_connect = '1' ORDER BY slot ASC");
                try {
                    int iM10916d24 = se.m10916d(interfaceC4026cY0, "id");
                    int iM10916d25 = se.m10916d(interfaceC4026cY0, "carrier_name");
                    int iM10916d26 = se.m10916d(interfaceC4026cY0, "sim_number");
                    int iM10916d27 = se.m10916d(interfaceC4026cY0, "sim_country_code");
                    int iM10916d28 = se.m10916d(interfaceC4026cY0, "slot");
                    int iM10916d29 = se.m10916d(interfaceC4026cY0, "icc_id");
                    int iM10916d30 = se.m10916d(interfaceC4026cY0, "sub_id");
                    int iM10916d31 = se.m10916d(interfaceC4026cY0, "user_name");
                    int iM10916d32 = se.m10916d(interfaceC4026cY0, "device_connect_code");
                    int iM10916d33 = se.m10916d(interfaceC4026cY0, "is_connect");
                    int iM10916d34 = se.m10916d(interfaceC4026cY0, "last_call_sync");
                    int iM10916d35 = se.m10916d(interfaceC4026cY0, "sync_subscription_start_time");
                    int iM10916d36 = se.m10916d(interfaceC4026cY0, "sync_subscription_end_time");
                    int iM10916d37 = se.m10916d(interfaceC4026cY0, "is_lead");
                    int iM10916d38 = se.m10916d(interfaceC4026cY0, "is_sync_lead_numbers");
                    int iM10916d39 = se.m10916d(interfaceC4026cY0, "employee_code");
                    int iM10916d40 = se.m10916d(interfaceC4026cY0, "is_call_recording");
                    int iM10916d41 = se.m10916d(interfaceC4026cY0, "call_recording_subscription_start_time");
                    int iM10916d42 = se.m10916d(interfaceC4026cY0, "call_recording_subscription_end_time");
                    int iM10916d43 = se.m10916d(interfaceC4026cY0, "employee_id");
                    int iM10916d44 = se.m10916d(interfaceC4026cY0, "customer_name");
                    int iM10916d45 = se.m10916d(interfaceC4026cY0, "customer_country_name");
                    int iM10916d46 = se.m10916d(interfaceC4026cY0, "customer_country_code");
                    ArrayList arrayList2 = new ArrayList();
                    while (interfaceC4026cY0.r0()) {
                        int i33 = iM10916d37;
                        int i34 = iM10916d36;
                        int i35 = (int) interfaceC4026cY0.getLong(iM10916d24);
                        String strMo1777W20 = interfaceC4026cY0.isNull(iM10916d25) ? null : interfaceC4026cY0.mo1777W(iM10916d25);
                        String strMo1777W21 = interfaceC4026cY0.isNull(iM10916d26) ? null : interfaceC4026cY0.mo1777W(iM10916d26);
                        int i36 = iM10916d25;
                        int i37 = iM10916d24;
                        int i38 = (int) interfaceC4026cY0.getLong(iM10916d27);
                        int i39 = (int) interfaceC4026cY0.getLong(iM10916d28);
                        String strMo1777W22 = interfaceC4026cY0.isNull(iM10916d29) ? null : interfaceC4026cY0.mo1777W(iM10916d29);
                        int i40 = (int) interfaceC4026cY0.getLong(iM10916d30);
                        String strMo1777W23 = interfaceC4026cY0.isNull(iM10916d31) ? null : interfaceC4026cY0.mo1777W(iM10916d31);
                        String strMo1777W24 = interfaceC4026cY0.isNull(iM10916d32) ? null : interfaceC4026cY0.mo1777W(iM10916d32);
                        boolean z13 = ((int) interfaceC4026cY0.getLong(iM10916d33)) != 0;
                        String strMo1777W25 = interfaceC4026cY0.isNull(iM10916d34) ? null : interfaceC4026cY0.mo1777W(iM10916d34);
                        if (strMo1777W25 != null) {
                            C8800o c8800o9 = C8800o.f42459a;
                            localDateTimeM16183G6 = C8800o.m16183G(strMo1777W25);
                        } else {
                            localDateTimeM16183G6 = null;
                        }
                        String strMo1777W26 = interfaceC4026cY0.isNull(iM10916d35) ? null : interfaceC4026cY0.mo1777W(iM10916d35);
                        if (strMo1777W26 != null) {
                            C8800o c8800o10 = C8800o.f42459a;
                            localDateTimeM16183G7 = C8800o.m16183G(strMo1777W26);
                        } else {
                            localDateTimeM16183G7 = null;
                        }
                        String strMo1777W27 = interfaceC4026cY0.isNull(i34) ? null : interfaceC4026cY0.mo1777W(i34);
                        if (strMo1777W27 != null) {
                            C8800o c8800o11 = C8800o.f42459a;
                            localDateTimeM16183G8 = C8800o.m16183G(strMo1777W27);
                        } else {
                            localDateTimeM16183G8 = null;
                        }
                        int i41 = iM10916d26;
                        boolean z14 = ((int) interfaceC4026cY0.getLong(i33)) != 0;
                        int i42 = iM10916d38;
                        boolean z15 = ((int) interfaceC4026cY0.getLong(i42)) != 0;
                        int i43 = iM10916d39;
                        String strMo1777W28 = interfaceC4026cY0.mo1777W(i43);
                        int i44 = iM10916d40;
                        boolean z16 = ((int) interfaceC4026cY0.getLong(i44)) != 0;
                        int i45 = iM10916d41;
                        String strMo1777W29 = interfaceC4026cY0.isNull(i45) ? null : interfaceC4026cY0.mo1777W(i45);
                        if (strMo1777W29 != null) {
                            C8800o c8800o12 = C8800o.f42459a;
                            localDateTimeM16183G9 = C8800o.m16183G(strMo1777W29);
                        } else {
                            localDateTimeM16183G9 = null;
                        }
                        int i46 = iM10916d42;
                        String strMo1777W30 = interfaceC4026cY0.isNull(i46) ? null : interfaceC4026cY0.mo1777W(i46);
                        if (strMo1777W30 != null) {
                            C8800o c8800o13 = C8800o.f42459a;
                            localDateTimeM16183G10 = C8800o.m16183G(strMo1777W30);
                        } else {
                            localDateTimeM16183G10 = null;
                        }
                        iM10916d41 = i45;
                        int i47 = iM10916d43;
                        String strMo1777W31 = interfaceC4026cY0.mo1777W(i47);
                        iM10916d43 = i47;
                        int i48 = iM10916d44;
                        String strMo1777W32 = interfaceC4026cY0.isNull(i48) ? null : interfaceC4026cY0.mo1777W(i48);
                        iM10916d44 = i48;
                        int i49 = iM10916d45;
                        if (interfaceC4026cY0.isNull(i49)) {
                            strMo1777W2 = null;
                            iM10916d45 = i49;
                            iM10916d38 = i42;
                            i12 = i43;
                            i11 = iM10916d46;
                        } else {
                            strMo1777W2 = interfaceC4026cY0.mo1777W(i49);
                            iM10916d45 = i49;
                            iM10916d38 = i42;
                            i11 = iM10916d46;
                            i12 = i43;
                        }
                        arrayList2.add(new C4802m(i35, strMo1777W20, strMo1777W21, i38, i39, strMo1777W22, i40, strMo1777W23, strMo1777W24, z13, localDateTimeM16183G6, localDateTimeM16183G7, localDateTimeM16183G8, z14, z15, strMo1777W28, z16, localDateTimeM16183G9, localDateTimeM16183G10, strMo1777W31, strMo1777W32, strMo1777W2, (int) interfaceC4026cY0.getLong(i11)));
                        int i50 = i12;
                        iM10916d40 = i44;
                        iM10916d36 = i34;
                        iM10916d39 = i50;
                        iM10916d46 = i11;
                        iM10916d42 = i46;
                        iM10916d26 = i41;
                        iM10916d37 = i33;
                        iM10916d24 = i37;
                        iM10916d25 = i36;
                    }
                    return arrayList2;
                } finally {
                }
            case 6:
                InterfaceC4024a _connection7 = (InterfaceC4024a) obj;
                AbstractC4154l.m8923f(_connection7, "_connection");
                interfaceC4026cY0 = _connection7.y0("SELECT * FROM UserSimDetails WHERE  is_connect = '1' ORDER BY slot ASC");
                try {
                    int iM10916d47 = se.m10916d(interfaceC4026cY0, "id");
                    int iM10916d48 = se.m10916d(interfaceC4026cY0, "carrier_name");
                    int iM10916d49 = se.m10916d(interfaceC4026cY0, "sim_number");
                    int iM10916d50 = se.m10916d(interfaceC4026cY0, "sim_country_code");
                    int iM10916d51 = se.m10916d(interfaceC4026cY0, "slot");
                    int iM10916d52 = se.m10916d(interfaceC4026cY0, "icc_id");
                    int iM10916d53 = se.m10916d(interfaceC4026cY0, "sub_id");
                    int iM10916d54 = se.m10916d(interfaceC4026cY0, "user_name");
                    int iM10916d55 = se.m10916d(interfaceC4026cY0, "device_connect_code");
                    int iM10916d56 = se.m10916d(interfaceC4026cY0, "is_connect");
                    int iM10916d57 = se.m10916d(interfaceC4026cY0, "last_call_sync");
                    int iM10916d58 = se.m10916d(interfaceC4026cY0, "sync_subscription_start_time");
                    int iM10916d59 = se.m10916d(interfaceC4026cY0, "sync_subscription_end_time");
                    int iM10916d60 = se.m10916d(interfaceC4026cY0, "is_lead");
                    int iM10916d61 = se.m10916d(interfaceC4026cY0, "is_sync_lead_numbers");
                    int iM10916d62 = se.m10916d(interfaceC4026cY0, "employee_code");
                    int iM10916d63 = se.m10916d(interfaceC4026cY0, "is_call_recording");
                    int iM10916d64 = se.m10916d(interfaceC4026cY0, "call_recording_subscription_start_time");
                    int iM10916d65 = se.m10916d(interfaceC4026cY0, "call_recording_subscription_end_time");
                    int iM10916d66 = se.m10916d(interfaceC4026cY0, "employee_id");
                    int iM10916d67 = se.m10916d(interfaceC4026cY0, "customer_name");
                    int iM10916d68 = se.m10916d(interfaceC4026cY0, "customer_country_name");
                    int iM10916d69 = se.m10916d(interfaceC4026cY0, "customer_country_code");
                    ArrayList arrayList3 = new ArrayList();
                    while (interfaceC4026cY0.r0()) {
                        int i51 = iM10916d60;
                        int i52 = iM10916d59;
                        int i53 = (int) interfaceC4026cY0.getLong(iM10916d47);
                        String strMo1777W33 = interfaceC4026cY0.isNull(iM10916d48) ? null : interfaceC4026cY0.mo1777W(iM10916d48);
                        String strMo1777W34 = interfaceC4026cY0.isNull(iM10916d49) ? null : interfaceC4026cY0.mo1777W(iM10916d49);
                        int i54 = iM10916d48;
                        int i55 = iM10916d47;
                        int i56 = (int) interfaceC4026cY0.getLong(iM10916d50);
                        int i57 = (int) interfaceC4026cY0.getLong(iM10916d51);
                        String strMo1777W35 = interfaceC4026cY0.isNull(iM10916d52) ? null : interfaceC4026cY0.mo1777W(iM10916d52);
                        int i58 = (int) interfaceC4026cY0.getLong(iM10916d53);
                        String strMo1777W36 = interfaceC4026cY0.isNull(iM10916d54) ? null : interfaceC4026cY0.mo1777W(iM10916d54);
                        String strMo1777W37 = interfaceC4026cY0.isNull(iM10916d55) ? null : interfaceC4026cY0.mo1777W(iM10916d55);
                        boolean z17 = ((int) interfaceC4026cY0.getLong(iM10916d56)) != 0;
                        String strMo1777W38 = interfaceC4026cY0.isNull(iM10916d57) ? null : interfaceC4026cY0.mo1777W(iM10916d57);
                        if (strMo1777W38 != null) {
                            C8800o c8800o14 = C8800o.f42459a;
                            localDateTimeM16183G11 = C8800o.m16183G(strMo1777W38);
                        } else {
                            localDateTimeM16183G11 = null;
                        }
                        String strMo1777W39 = interfaceC4026cY0.isNull(iM10916d58) ? null : interfaceC4026cY0.mo1777W(iM10916d58);
                        if (strMo1777W39 != null) {
                            C8800o c8800o15 = C8800o.f42459a;
                            localDateTimeM16183G12 = C8800o.m16183G(strMo1777W39);
                        } else {
                            localDateTimeM16183G12 = null;
                        }
                        String strMo1777W40 = interfaceC4026cY0.isNull(i52) ? null : interfaceC4026cY0.mo1777W(i52);
                        if (strMo1777W40 != null) {
                            C8800o c8800o16 = C8800o.f42459a;
                            localDateTimeM16183G13 = C8800o.m16183G(strMo1777W40);
                        } else {
                            localDateTimeM16183G13 = null;
                        }
                        int i59 = iM10916d49;
                        boolean z18 = ((int) interfaceC4026cY0.getLong(i51)) != 0;
                        int i60 = iM10916d61;
                        boolean z19 = ((int) interfaceC4026cY0.getLong(i60)) != 0;
                        int i61 = iM10916d62;
                        String strMo1777W41 = interfaceC4026cY0.mo1777W(i61);
                        int i62 = iM10916d63;
                        boolean z20 = ((int) interfaceC4026cY0.getLong(i62)) != 0;
                        int i63 = iM10916d64;
                        String strMo1777W42 = interfaceC4026cY0.isNull(i63) ? null : interfaceC4026cY0.mo1777W(i63);
                        if (strMo1777W42 != null) {
                            C8800o c8800o17 = C8800o.f42459a;
                            localDateTimeM16183G14 = C8800o.m16183G(strMo1777W42);
                        } else {
                            localDateTimeM16183G14 = null;
                        }
                        int i64 = iM10916d65;
                        String strMo1777W43 = interfaceC4026cY0.isNull(i64) ? null : interfaceC4026cY0.mo1777W(i64);
                        if (strMo1777W43 != null) {
                            C8800o c8800o18 = C8800o.f42459a;
                            localDateTimeM16183G15 = C8800o.m16183G(strMo1777W43);
                        } else {
                            localDateTimeM16183G15 = null;
                        }
                        iM10916d64 = i63;
                        int i65 = iM10916d66;
                        String strMo1777W44 = interfaceC4026cY0.mo1777W(i65);
                        iM10916d66 = i65;
                        int i66 = iM10916d67;
                        String strMo1777W45 = interfaceC4026cY0.isNull(i66) ? null : interfaceC4026cY0.mo1777W(i66);
                        iM10916d67 = i66;
                        int i67 = iM10916d68;
                        if (interfaceC4026cY0.isNull(i67)) {
                            strMo1777W3 = null;
                            iM10916d68 = i67;
                            iM10916d61 = i60;
                            i14 = i61;
                            i13 = iM10916d69;
                        } else {
                            strMo1777W3 = interfaceC4026cY0.mo1777W(i67);
                            iM10916d68 = i67;
                            iM10916d61 = i60;
                            i13 = iM10916d69;
                            i14 = i61;
                        }
                        arrayList3.add(new C4802m(i53, strMo1777W33, strMo1777W34, i56, i57, strMo1777W35, i58, strMo1777W36, strMo1777W37, z17, localDateTimeM16183G11, localDateTimeM16183G12, localDateTimeM16183G13, z18, z19, strMo1777W41, z20, localDateTimeM16183G14, localDateTimeM16183G15, strMo1777W44, strMo1777W45, strMo1777W3, (int) interfaceC4026cY0.getLong(i13)));
                        int i68 = i14;
                        iM10916d63 = i62;
                        iM10916d59 = i52;
                        iM10916d62 = i68;
                        iM10916d69 = i13;
                        iM10916d65 = i64;
                        iM10916d49 = i59;
                        iM10916d60 = i51;
                        iM10916d47 = i55;
                        iM10916d48 = i54;
                    }
                    return arrayList3;
                } finally {
                }
            case 7:
                InterfaceC4024a _connection8 = (InterfaceC4024a) obj;
                AbstractC4154l.m8923f(_connection8, "_connection");
                interfaceC4026cY0 = _connection8.y0("SELECT device_connect_code FROM UserSimDetails ORDER BY is_connect DESC");
                try {
                    if (interfaceC4026cY0.r0() && !interfaceC4026cY0.isNull(0)) {
                        objM16183G = interfaceC4026cY0.mo1777W(0);
                    }
                    return objM16183G;
                } finally {
                }
            case 8:
                return String.valueOf(((C4791b) obj).f23832a);
            case 9:
                C8545f c8545f = (C8545f) obj;
                C8541b c8541bM4574u = AbstractC1452a.m4574u(c8545f, "$this$ConstraintSet", "info");
                C8541b c8541b = new C8541b("list");
                c8545f.m15811b(c8541bM4574u, new j5(10));
                c8545f.m15811b(c8541b, new C0442f(c8541bM4574u, 0));
                return a0Var;
            case 10:
                C8540a constrain = (C8540a) obj;
                AbstractC4154l.m8923f(constrain, "$this$constrain");
                C0917l c0917l = constrain.f41487d;
                C8541b c8541b2 = constrain.f41485b;
                C0917l.m2636k(c0917l, c8541b2.f41494d, DefinitionKt.NO_Float_VALUE, 6);
                C0927v.m2699n(constrain.f41486c, c8541b2.f41493c, DefinitionKt.NO_Float_VALUE, 6);
                C0927v.m2699n(constrain.f41488e, c8541b2.f41495e, DefinitionKt.NO_Float_VALUE, 6);
                return a0Var;
            case 11:
                String it = (String) obj;
                AbstractC4154l.m8923f(it, "it");
                return a0Var;
            case 12:
                String it2 = (String) obj;
                AbstractC4154l.m8923f(it2, "it");
                return a0Var;
            case 13:
                C0983a it3 = (C0983a) obj;
                AbstractC4154l.m8923f(it3, "it");
                return a0Var;
            case 14:
                String it4 = (String) obj;
                AbstractC4154l.m8923f(it4, "it");
                return a0Var;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                String it5 = (String) obj;
                AbstractC4154l.m8923f(it5, "it");
                return a0Var;
            case 16:
                C0983a countryCode = (C0983a) obj;
                AbstractC4154l.m8923f(countryCode, "countryCode");
                return countryCode.f5815d;
            case 17:
                Context it6 = (Context) obj;
                AbstractC4154l.m8923f(it6, "it");
                return a0Var;
            case 18:
                InterfaceC4024a _connection9 = (InterfaceC4024a) obj;
                AbstractC4154l.m8923f(_connection9, "_connection");
                interfaceC4026cY0 = _connection9.y0("SELECT COUNT(*) FROM message_template");
                try {
                    int i69 = interfaceC4026cY0.r0() ? (int) interfaceC4026cY0.getLong(0) : 0;
                    interfaceC4026cY0.close();
                    return Integer.valueOf(i69);
                } finally {
                }
            case 19:
                InterfaceC4024a _connection10 = (InterfaceC4024a) obj;
                AbstractC4154l.m8923f(_connection10, "_connection");
                try {
                    _connection10.y0("delete from message_template").r0();
                    return a0Var;
                } finally {
                }
            case 20:
                InterfaceC4024a _connection11 = (InterfaceC4024a) obj;
                AbstractC4154l.m8923f(_connection11, "_connection");
                interfaceC4026cY0 = _connection11.y0("SELECT * FROM message_template_tag");
                try {
                    int iM10916d70 = se.m10916d(interfaceC4026cY0, "id");
                    int iM10916d71 = se.m10916d(interfaceC4026cY0, "tag_name");
                    ArrayList arrayList4 = new ArrayList();
                    while (interfaceC4026cY0.r0()) {
                        arrayList4.add(new C6250f((int) interfaceC4026cY0.getLong(iM10916d70), interfaceC4026cY0.mo1777W(iM10916d71)));
                    }
                    return arrayList4;
                } finally {
                }
            case 21:
                InterfaceC4024a _connection12 = (InterfaceC4024a) obj;
                AbstractC4154l.m8923f(_connection12, "_connection");
                interfaceC4026cY0 = _connection12.y0("DELETE FROM message_template_tag");
                try {
                    interfaceC4026cY0.r0();
                    int iM10878b = re.m10878b(_connection12);
                    interfaceC4026cY0.close();
                    return Integer.valueOf(iM10878b);
                } finally {
                }
            case 22:
                return m488a(obj);
            case 23:
                C1687e DslBuilderProperty = (C1687e) obj;
                AbstractC4154l.m8923f(DslBuilderProperty, "$this$DslBuilderProperty");
                C1684b c1684b = DslBuilderProperty.f8251a;
                c1684b.getClass();
                return new j2(8, c1684b);
            case 24:
                C1692j DslBuilderProperty2 = (C1692j) obj;
                AbstractC4154l.m8923f(DslBuilderProperty2, "$this$DslBuilderProperty");
                return new j2(9, DslBuilderProperty2.f8280a);
            case 25:
                return m489b(obj);
            case 26:
                return HostedUIHttpHelper.json$lambda$0((C4276h) obj);
            case 27:
                return AmplifyOutputsData.Companion.deserialize$lambda$0((C4276h) obj);
            case 28:
                return m490d(obj);
            default:
                ka it7 = (ka) obj;
                AbstractC4154l.m8923f(it7, "it");
                return Boolean.FALSE;
        }
    }
}
