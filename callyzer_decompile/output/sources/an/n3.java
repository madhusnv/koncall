package an;

import ex.InterfaceC2139c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k8.InterfaceC4024a;
import k8.InterfaceC4026c;
import kotlin.jvm.internal.AbstractC4154l;
import om.C5413o;
import zm.EnumC8994d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n3 implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f1142a = 1;

    /* renamed from: b */
    public final /* synthetic */ String f1143b;

    /* renamed from: c */
    public final /* synthetic */ List f1144c;

    /* renamed from: d */
    public final /* synthetic */ int f1145d;

    /* renamed from: e */
    public final /* synthetic */ int f1146e;

    /* renamed from: f */
    public final /* synthetic */ int f1147f;

    /* renamed from: g */
    public final /* synthetic */ int f1148g;

    /* renamed from: h */
    public final /* synthetic */ Object f1149h;

    public /* synthetic */ n3(String str, String str2, List list, int i10, int i11, int i12, int i13) {
        this.f1143b = str;
        this.f1149h = str2;
        this.f1144c = list;
        this.f1145d = i10;
        this.f1146e = i11;
        this.f1147f = i12;
        this.f1148g = i13;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) throws Exception {
        InterfaceC4026c interfaceC4026cY0;
        switch (this.f1142a) {
            case 0:
                List list = this.f1144c;
                EnumC8994d enumC8994d = (EnumC8994d) this.f1149h;
                int i10 = this.f1146e;
                int i11 = this.f1147f;
                int i12 = this.f1148g;
                InterfaceC4024a _connection = (InterfaceC4024a) obj;
                AbstractC4154l.m8923f(_connection, "_connection");
                interfaceC4026cY0 = _connection.y0(this.f1143b);
                try {
                    Iterator it = list.iterator();
                    int i13 = 1;
                    while (it.hasNext()) {
                        interfaceC4026cY0.mo1776B(i13, (String) it.next());
                        i13++;
                    }
                    int i14 = this.f1145d;
                    int i15 = i14 + 1;
                    if ((enumC8994d != null ? Integer.valueOf(enumC8994d.getTypeValue()) : null) == null) {
                        interfaceC4026cY0.mo1779i(i15);
                    } else {
                        interfaceC4026cY0.mo1778g(i15, r1.intValue());
                    }
                    long j6 = i10;
                    interfaceC4026cY0.mo1778g(i14 + 2, j6);
                    interfaceC4026cY0.mo1778g(i14 + 3, j6);
                    interfaceC4026cY0.mo1778g(i14 + 4, i11);
                    interfaceC4026cY0.mo1778g(i14 + 5, i12);
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC4026cY0.r0()) {
                        String strMo1777W = interfaceC4026cY0.mo1777W(0);
                        int i16 = (int) interfaceC4026cY0.getLong(1);
                        Integer numValueOf = interfaceC4026cY0.isNull(2) ? null : Integer.valueOf((int) interfaceC4026cY0.getLong(2));
                        EnumC8994d enumC8994d2 = (numValueOf != null && numValueOf.intValue() == 1) ? EnumC8994d.INCOMING : (numValueOf != null && numValueOf.intValue() == 2) ? EnumC8994d.OUTGOING : (numValueOf != null && numValueOf.intValue() == 3) ? EnumC8994d.MISSED : (numValueOf != null && numValueOf.intValue() == 4) ? EnumC8994d.REJECTED : null;
                        if (enumC8994d2 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'com.websoptimization.callyzerbiz.`data`.room.CallType', but it was NULL.");
                        }
                        arrayList.add(new C5413o(interfaceC4026cY0.mo1777W(3), strMo1777W, i16, enumC8994d2));
                    }
                    return arrayList;
                } finally {
                    interfaceC4026cY0.close();
                }
            default:
                String str = (String) this.f1149h;
                List list2 = this.f1144c;
                int i17 = this.f1145d;
                int i18 = this.f1146e;
                int i19 = this.f1147f;
                int i20 = this.f1148g;
                InterfaceC4024a _connection2 = (InterfaceC4024a) obj;
                AbstractC4154l.m8923f(_connection2, "_connection");
                interfaceC4026cY0 = _connection2.y0(this.f1143b);
                try {
                    interfaceC4026cY0.mo1776B(1, str);
                    Iterator it2 = list2.iterator();
                    int i21 = 2;
                    while (true) {
                        if (!it2.hasNext()) {
                            long j10 = i18;
                            interfaceC4026cY0.mo1778g(i17 + 2, j10);
                            interfaceC4026cY0.mo1776B(i17 + 3, str);
                            interfaceC4026cY0.mo1778g(i17 + 4, j10);
                            interfaceC4026cY0.mo1778g(i17 + 5, i19);
                            interfaceC4026cY0.mo1778g(i17 + 6, i20);
                            ArrayList arrayList2 = new ArrayList();
                            while (interfaceC4026cY0.r0()) {
                                String strMo1777W2 = interfaceC4026cY0.mo1777W(0);
                                int i22 = (int) interfaceC4026cY0.getLong(1);
                                String strMo1777W3 = interfaceC4026cY0.mo1777W(2);
                                Integer numValueOf2 = interfaceC4026cY0.isNull(3) ? null : Integer.valueOf((int) interfaceC4026cY0.getLong(3));
                                EnumC8994d enumC8994d3 = (numValueOf2 != null && numValueOf2.intValue() == 1) ? EnumC8994d.INCOMING : (numValueOf2 != null && numValueOf2.intValue() == 2) ? EnumC8994d.OUTGOING : (numValueOf2 != null && numValueOf2.intValue() == 3) ? EnumC8994d.MISSED : (numValueOf2 != null && numValueOf2.intValue() == 4) ? EnumC8994d.REJECTED : null;
                                if (enumC8994d3 == null) {
                                    throw new IllegalStateException("Expected NON-NULL 'com.websoptimization.callyzerbiz.`data`.room.CallType', but it was NULL.");
                                }
                                arrayList2.add(new C5413o(strMo1777W2, strMo1777W3, i22, enumC8994d3));
                            }
                            return arrayList2;
                        }
                        EnumC8994d enumC8994d4 = (EnumC8994d) it2.next();
                        if ((enumC8994d4 != null ? Integer.valueOf(enumC8994d4.getTypeValue()) : null) == null) {
                            interfaceC4026cY0.mo1779i(i21);
                        } else {
                            interfaceC4026cY0.mo1778g(i21, r10.intValue());
                        }
                        i21++;
                    }
                } finally {
                }
                break;
        }
    }

    public /* synthetic */ n3(String str, List list, int i10, EnumC8994d enumC8994d, int i11, int i12, int i13) {
        this.f1143b = str;
        this.f1144c = list;
        this.f1145d = i10;
        this.f1149h = enumC8994d;
        this.f1146e = i11;
        this.f1147f = i12;
        this.f1148g = i13;
    }
}
