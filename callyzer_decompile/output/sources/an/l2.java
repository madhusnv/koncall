package an;

import aq.C0409l;
import ex.InterfaceC2139c;
import j$.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import k8.InterfaceC4024a;
import k8.InterfaceC4026c;
import kotlin.jvm.internal.AbstractC4154l;
import om.C5404f;
import ot.C5743k;
import q1.C6080h;
import s2.C6734c;
import yv.C8800o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l2 implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f1043a = 0;

    /* renamed from: b */
    public final /* synthetic */ boolean f1044b;

    /* renamed from: c */
    public final /* synthetic */ Object f1045c;

    /* renamed from: d */
    public final /* synthetic */ Object f1046d;

    /* renamed from: e */
    public final /* synthetic */ Object f1047e;

    /* renamed from: f */
    public final /* synthetic */ Object f1048f;

    /* renamed from: g */
    public final /* synthetic */ Object f1049g;

    public /* synthetic */ l2(String str, LocalDateTime localDateTime, LocalDateTime localDateTime2, String str2, boolean z6, ArrayList arrayList) {
        this.f1045c = str;
        this.f1047e = localDateTime;
        this.f1048f = localDateTime2;
        this.f1046d = str2;
        this.f1044b = z6;
        this.f1049g = arrayList;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) throws Exception {
        String strM16212u;
        int i10 = this.f1043a;
        String strM16212u2 = null;
        Object obj2 = this.f1049g;
        Object obj3 = this.f1048f;
        Object obj4 = this.f1047e;
        Object obj5 = this.f1046d;
        Object obj6 = this.f1045c;
        switch (i10) {
            case 0:
                LocalDateTime localDateTime = (LocalDateTime) obj4;
                LocalDateTime localDateTime2 = (LocalDateTime) obj3;
                String str = (String) obj5;
                boolean z6 = this.f1044b;
                ArrayList arrayList = (ArrayList) obj2;
                InterfaceC4024a _connection = (InterfaceC4024a) obj;
                AbstractC4154l.m8923f(_connection, "_connection");
                InterfaceC4026c interfaceC4026cY0 = _connection.y0((String) obj6);
                if (localDateTime != null) {
                    try {
                        C8800o c8800o = C8800o.f42459a;
                        strM16212u = C8800o.m16212u(localDateTime);
                    } catch (Throwable th2) {
                        interfaceC4026cY0.close();
                        throw th2;
                    }
                } else {
                    strM16212u = null;
                }
                if (strM16212u == null) {
                    interfaceC4026cY0.mo1779i(1);
                } else {
                    interfaceC4026cY0.mo1776B(1, strM16212u);
                }
                if (localDateTime2 != null) {
                    C8800o c8800o2 = C8800o.f42459a;
                    strM16212u2 = C8800o.m16212u(localDateTime2);
                }
                if (strM16212u2 == null) {
                    interfaceC4026cY0.mo1779i(2);
                } else {
                    interfaceC4026cY0.mo1776B(2, strM16212u2);
                }
                interfaceC4026cY0.mo1776B(3, str);
                long j6 = z6 ? 1L : 0L;
                interfaceC4026cY0.mo1778g(4, j6);
                interfaceC4026cY0.mo1778g(5, j6);
                int size = arrayList.size();
                int i11 = 6;
                int i12 = 0;
                while (i12 < size) {
                    Object obj7 = arrayList.get(i12);
                    i12++;
                    interfaceC4026cY0.mo1776B(i11, (String) obj7);
                    i11++;
                }
                ArrayList arrayList2 = new ArrayList();
                while (interfaceC4026cY0.r0()) {
                    arrayList2.add(new C5404f(interfaceC4026cY0.getLong(0), interfaceC4026cY0.getLong(1)));
                }
                interfaceC4026cY0.close();
                return arrayList2;
            default:
                List list = (List) obj6;
                C6080h LazyColumn = (C6080h) obj;
                AbstractC4154l.m8923f(LazyColumn, "$this$LazyColumn");
                LazyColumn.m12099p(list.size(), null, new C0409l(list, 21), new C6734c(new C5743k(list, this.f1044b, (InterfaceC2139c) obj5, (InterfaceC2139c) obj4, (InterfaceC2139c) obj3, (InterfaceC2139c) obj2), true, -632812321));
                return qw.a0.f30746a;
        }
    }

    public /* synthetic */ l2(List list, boolean z6, InterfaceC2139c interfaceC2139c, InterfaceC2139c interfaceC2139c2, InterfaceC2139c interfaceC2139c3, InterfaceC2139c interfaceC2139c4) {
        this.f1045c = list;
        this.f1044b = z6;
        this.f1046d = interfaceC2139c;
        this.f1047e = interfaceC2139c2;
        this.f1048f = interfaceC2139c3;
        this.f1049g = interfaceC2139c4;
    }
}
