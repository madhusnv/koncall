package an;

import ex.InterfaceC2139c;
import j$.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k8.InterfaceC4024a;
import k8.InterfaceC4026c;
import kotlin.jvm.internal.AbstractC4154l;
import om.C5413o;
import yv.C8800o;
import zm.EnumC8994d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p3 implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f1244a = 1;

    /* renamed from: b */
    public final /* synthetic */ String f1245b;

    /* renamed from: c */
    public final /* synthetic */ List f1246c;

    /* renamed from: d */
    public final /* synthetic */ int f1247d;

    /* renamed from: e */
    public final /* synthetic */ int f1248e;

    /* renamed from: f */
    public final /* synthetic */ int f1249f;

    /* renamed from: g */
    public final /* synthetic */ int f1250g;

    /* renamed from: h */
    public final /* synthetic */ Object f1251h;

    /* renamed from: j */
    public final /* synthetic */ Object f1252j;

    public /* synthetic */ p3(String str, LocalDateTime localDateTime, LocalDateTime localDateTime2, List list, int i10, int i11, int i12, int i13) {
        this.f1245b = str;
        this.f1251h = localDateTime;
        this.f1252j = localDateTime2;
        this.f1246c = list;
        this.f1247d = i10;
        this.f1248e = i11;
        this.f1249f = i12;
        this.f1250g = i13;
    }

    /* JADX WARN: Finally extract failed */
    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) throws Exception {
        EnumC8994d enumC8994d;
        String strM16212u;
        String strM16212u2;
        String strM16212u3;
        String strM16212u4;
        int i10 = this.f1244a;
        int i11 = this.f1250g;
        int i12 = this.f1249f;
        int i13 = this.f1248e;
        int i14 = this.f1247d;
        List<EnumC8994d> list = this.f1246c;
        Object obj2 = this.f1252j;
        Object obj3 = this.f1251h;
        String str = this.f1245b;
        switch (i10) {
            case 0:
                EnumC8994d enumC8994d2 = (EnumC8994d) obj2;
                String str2 = (String) obj3;
                InterfaceC4024a _connection = (InterfaceC4024a) obj;
                AbstractC4154l.m8923f(_connection, "_connection");
                InterfaceC4026c interfaceC4026cY0 = _connection.y0(str);
                try {
                    Iterator it = list.iterator();
                    int i15 = 1;
                    while (it.hasNext()) {
                        interfaceC4026cY0.mo1776B(i15, (String) it.next());
                        i15++;
                    }
                    int i16 = i14 + 1;
                    if ((enumC8994d2 != null ? Integer.valueOf(enumC8994d2.getTypeValue()) : null) == null) {
                        interfaceC4026cY0.mo1779i(i16);
                    } else {
                        interfaceC4026cY0.mo1778g(i16, r7.intValue());
                    }
                    long j6 = i13;
                    interfaceC4026cY0.mo1778g(i14 + 2, j6);
                    interfaceC4026cY0.mo1776B(i14 + 3, str2);
                    interfaceC4026cY0.mo1778g(i14 + 4, j6);
                    interfaceC4026cY0.mo1776B(i14 + 5, str2);
                    interfaceC4026cY0.mo1778g(i14 + 6, i12);
                    interfaceC4026cY0.mo1778g(i14 + 7, i11);
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC4026cY0.r0()) {
                        String strMo1777W = interfaceC4026cY0.mo1777W(0);
                        int i17 = (int) interfaceC4026cY0.getLong(1);
                        Integer numValueOf = interfaceC4026cY0.isNull(2) ? null : Integer.valueOf((int) interfaceC4026cY0.getLong(2));
                        if (numValueOf != null && numValueOf.intValue() == 1) {
                            enumC8994d = EnumC8994d.INCOMING;
                        } else if (numValueOf != null && numValueOf.intValue() == 2) {
                            enumC8994d = EnumC8994d.OUTGOING;
                        } else {
                            if (numValueOf != null && numValueOf.intValue() == 3) {
                                enumC8994d = EnumC8994d.MISSED;
                            }
                            enumC8994d = (numValueOf != null && numValueOf.intValue() == 4) ? EnumC8994d.REJECTED : null;
                        }
                        if (enumC8994d == null) {
                            throw new IllegalStateException("Expected NON-NULL 'com.websoptimization.callyzerbiz.`data`.room.CallType', but it was NULL.");
                        }
                        arrayList.add(new C5413o(interfaceC4026cY0.mo1777W(3), strMo1777W, i17, enumC8994d));
                    }
                    interfaceC4026cY0.close();
                    return arrayList;
                } catch (Throwable th2) {
                    interfaceC4026cY0.close();
                    throw th2;
                }
            default:
                LocalDateTime localDateTime = (LocalDateTime) obj3;
                LocalDateTime localDateTime2 = (LocalDateTime) obj2;
                InterfaceC4024a _connection2 = (InterfaceC4024a) obj;
                AbstractC4154l.m8923f(_connection2, "_connection");
                InterfaceC4026c interfaceC4026cY02 = _connection2.y0(str);
                if (localDateTime != null) {
                    try {
                        C8800o c8800o = C8800o.f42459a;
                        strM16212u = C8800o.m16212u(localDateTime);
                    } catch (Throwable th3) {
                        interfaceC4026cY02.close();
                        throw th3;
                    }
                } else {
                    strM16212u = null;
                }
                if (strM16212u == null) {
                    interfaceC4026cY02.mo1779i(1);
                } else {
                    interfaceC4026cY02.mo1776B(1, strM16212u);
                }
                if (localDateTime2 != null) {
                    C8800o c8800o2 = C8800o.f42459a;
                    strM16212u2 = C8800o.m16212u(localDateTime2);
                } else {
                    strM16212u2 = null;
                }
                if (strM16212u2 == null) {
                    interfaceC4026cY02.mo1779i(2);
                } else {
                    interfaceC4026cY02.mo1776B(2, strM16212u2);
                }
                int i18 = 3;
                for (EnumC8994d enumC8994d3 : list) {
                    if ((enumC8994d3 != null ? Integer.valueOf(enumC8994d3.getTypeValue()) : null) == null) {
                        interfaceC4026cY02.mo1779i(i18);
                    } else {
                        interfaceC4026cY02.mo1778g(i18, r14.intValue());
                    }
                    i18++;
                }
                long j10 = i13;
                interfaceC4026cY02.mo1778g(i14 + 3, j10);
                int i19 = i14 + 4;
                if (localDateTime != null) {
                    C8800o c8800o3 = C8800o.f42459a;
                    strM16212u3 = C8800o.m16212u(localDateTime);
                } else {
                    strM16212u3 = null;
                }
                if (strM16212u3 == null) {
                    interfaceC4026cY02.mo1779i(i19);
                } else {
                    interfaceC4026cY02.mo1776B(i19, strM16212u3);
                }
                int i20 = i14 + 5;
                if (localDateTime2 != null) {
                    C8800o c8800o4 = C8800o.f42459a;
                    strM16212u4 = C8800o.m16212u(localDateTime2);
                } else {
                    strM16212u4 = null;
                }
                if (strM16212u4 == null) {
                    interfaceC4026cY02.mo1779i(i20);
                } else {
                    interfaceC4026cY02.mo1776B(i20, strM16212u4);
                }
                interfaceC4026cY02.mo1778g(i14 + 6, j10);
                interfaceC4026cY02.mo1778g(i14 + 7, i12);
                interfaceC4026cY02.mo1778g(i14 + 8, i11);
                ArrayList arrayList2 = new ArrayList();
                while (interfaceC4026cY02.r0()) {
                    String strMo1777W2 = interfaceC4026cY02.mo1777W(0);
                    int i21 = (int) interfaceC4026cY02.getLong(1);
                    String strMo1777W3 = interfaceC4026cY02.mo1777W(2);
                    Integer numValueOf2 = interfaceC4026cY02.isNull(3) ? null : Integer.valueOf((int) interfaceC4026cY02.getLong(3));
                    EnumC8994d enumC8994d4 = (numValueOf2 != null && numValueOf2.intValue() == 1) ? EnumC8994d.INCOMING : (numValueOf2 != null && numValueOf2.intValue() == 2) ? EnumC8994d.OUTGOING : (numValueOf2 != null && numValueOf2.intValue() == 3) ? EnumC8994d.MISSED : (numValueOf2 != null && numValueOf2.intValue() == 4) ? EnumC8994d.REJECTED : null;
                    if (enumC8994d4 == null) {
                        throw new IllegalStateException("Expected NON-NULL 'com.websoptimization.callyzerbiz.`data`.room.CallType', but it was NULL.");
                    }
                    arrayList2.add(new C5413o(strMo1777W2, strMo1777W3, i21, enumC8994d4));
                }
                interfaceC4026cY02.close();
                return arrayList2;
        }
    }

    public /* synthetic */ p3(String str, List list, int i10, EnumC8994d enumC8994d, int i11, String str2, int i12, int i13) {
        this.f1245b = str;
        this.f1246c = list;
        this.f1247d = i10;
        this.f1252j = enumC8994d;
        this.f1248e = i11;
        this.f1251h = str2;
        this.f1249f = i12;
        this.f1250g = i13;
    }
}
