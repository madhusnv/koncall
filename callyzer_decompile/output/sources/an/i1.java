package an;

import ex.InterfaceC2139c;
import j$.time.LocalDateTime;
import java.util.ArrayList;
import k8.InterfaceC4024a;
import k8.InterfaceC4026c;
import kotlin.jvm.internal.AbstractC4154l;
import om.C5419u;
import yv.C8800o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i1 implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f924a;

    /* renamed from: b */
    public final /* synthetic */ LocalDateTime f925b;

    /* renamed from: c */
    public final /* synthetic */ LocalDateTime f926c;

    /* renamed from: d */
    public final /* synthetic */ int f927d;

    /* renamed from: e */
    public final /* synthetic */ String f928e;

    /* renamed from: f */
    public final /* synthetic */ boolean f929f;

    /* renamed from: g */
    public final /* synthetic */ int f930g;

    /* renamed from: h */
    public final /* synthetic */ int f931h;

    public /* synthetic */ i1(int i10, int i11, int i12, String str, LocalDateTime localDateTime, LocalDateTime localDateTime2, boolean z6) {
        this.f924a = 0;
        this.f928e = str;
        this.f925b = localDateTime;
        this.f926c = localDateTime2;
        this.f927d = i10;
        this.f929f = z6;
        this.f930g = i11;
        this.f931h = i12;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) throws Exception {
        String strM16212u;
        String strM16212u2;
        String strM16212u3;
        String strM16212u4;
        String strM16212u5;
        String strM16212u6;
        int i10 = this.f924a;
        int i11 = this.f931h;
        int i12 = this.f930g;
        boolean z6 = this.f929f;
        String str = this.f928e;
        int i13 = this.f927d;
        LocalDateTime localDateTime = this.f926c;
        LocalDateTime localDateTime2 = this.f925b;
        switch (i10) {
            case 0:
                InterfaceC4024a _connection = (InterfaceC4024a) obj;
                AbstractC4154l.m8923f(_connection, "_connection");
                InterfaceC4026c interfaceC4026cY0 = _connection.y0("SELECT name, COUNT(phone_number) AS count, phone_number, country_code, SUM(duration) AS new_duration FROM ViewCallLogContactUserSim WHERE sim_number = ? AND date_time BETWEEN ? AND ? AND duration > ? GROUP BY phone_number ORDER BY CASE WHEN ? = 1 THEN count END ASC, CASE WHEN ? = 0 THEN count END DESC LIMIT ? OFFSET ?");
                try {
                    interfaceC4026cY0.mo1776B(1, str);
                    if (localDateTime2 != null) {
                        C8800o c8800o = C8800o.f42459a;
                        strM16212u = C8800o.m16212u(localDateTime2);
                    } else {
                        strM16212u = null;
                    }
                    if (strM16212u == null) {
                        interfaceC4026cY0.mo1779i(2);
                    } else {
                        interfaceC4026cY0.mo1776B(2, strM16212u);
                    }
                    if (localDateTime != null) {
                        C8800o c8800o2 = C8800o.f42459a;
                        strM16212u2 = C8800o.m16212u(localDateTime);
                    } else {
                        strM16212u2 = null;
                    }
                    if (strM16212u2 == null) {
                        interfaceC4026cY0.mo1779i(3);
                    } else {
                        interfaceC4026cY0.mo1776B(3, strM16212u2);
                    }
                    interfaceC4026cY0.mo1778g(4, i13);
                    long j6 = z6 ? 1L : 0L;
                    interfaceC4026cY0.mo1778g(5, j6);
                    interfaceC4026cY0.mo1778g(6, j6);
                    interfaceC4026cY0.mo1778g(7, i12);
                    interfaceC4026cY0.mo1778g(8, i11);
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC4026cY0.r0()) {
                        arrayList.add(new C5419u(interfaceC4026cY0.mo1777W(0), interfaceC4026cY0.mo1777W(2), (int) interfaceC4026cY0.getLong(3), interfaceC4026cY0.isNull(1) ? null : interfaceC4026cY0.mo1777W(1), interfaceC4026cY0.isNull(4) ? null : Long.valueOf(interfaceC4026cY0.getLong(4))));
                    }
                    interfaceC4026cY0.close();
                    return arrayList;
                } finally {
                    interfaceC4026cY0.close();
                }
            case 1:
                InterfaceC4024a _connection2 = (InterfaceC4024a) obj;
                AbstractC4154l.m8923f(_connection2, "_connection");
                InterfaceC4026c interfaceC4026cY02 = _connection2.y0("SELECT name, COUNT(phone_number) AS count, phone_number, country_code, SUM(duration) AS new_duration FROM ViewCallLogContactUserSim WHERE date_time BETWEEN ? AND ? AND duration > ? AND sim_number = ? GROUP BY phone_number ORDER BY CASE WHEN ? = 1 THEN name END COLLATE NOCASE ASC, CASE WHEN ? = 0 THEN name END COLLATE NOCASE DESC LIMIT ? OFFSET ?");
                if (localDateTime2 != null) {
                    try {
                        C8800o c8800o3 = C8800o.f42459a;
                        strM16212u3 = C8800o.m16212u(localDateTime2);
                    } finally {
                    }
                } else {
                    strM16212u3 = null;
                }
                if (strM16212u3 == null) {
                    interfaceC4026cY02.mo1779i(1);
                } else {
                    interfaceC4026cY02.mo1776B(1, strM16212u3);
                }
                if (localDateTime != null) {
                    C8800o c8800o4 = C8800o.f42459a;
                    strM16212u4 = C8800o.m16212u(localDateTime);
                } else {
                    strM16212u4 = null;
                }
                if (strM16212u4 == null) {
                    interfaceC4026cY02.mo1779i(2);
                } else {
                    interfaceC4026cY02.mo1776B(2, strM16212u4);
                }
                interfaceC4026cY02.mo1778g(3, i13);
                interfaceC4026cY02.mo1776B(4, str);
                long j10 = z6 ? 1L : 0L;
                interfaceC4026cY02.mo1778g(5, j10);
                interfaceC4026cY02.mo1778g(6, j10);
                interfaceC4026cY02.mo1778g(7, i12);
                interfaceC4026cY02.mo1778g(8, i11);
                ArrayList arrayList2 = new ArrayList();
                while (interfaceC4026cY02.r0()) {
                    arrayList2.add(new C5419u(interfaceC4026cY02.mo1777W(0), interfaceC4026cY02.mo1777W(2), (int) interfaceC4026cY02.getLong(3), interfaceC4026cY02.isNull(1) ? null : interfaceC4026cY02.mo1777W(1), interfaceC4026cY02.isNull(4) ? null : Long.valueOf(interfaceC4026cY02.getLong(4))));
                }
                interfaceC4026cY02.close();
                return arrayList2;
            default:
                InterfaceC4024a _connection3 = (InterfaceC4024a) obj;
                AbstractC4154l.m8923f(_connection3, "_connection");
                InterfaceC4026c interfaceC4026cY03 = _connection3.y0("SELECT name, COUNT(phone_number) AS count, phone_number, country_code, SUM(duration) AS new_duration FROM ViewCallLogContactUserSim WHERE date_time BETWEEN ? AND ? AND duration > ? AND sim_number = ? GROUP BY phone_number ORDER BY CASE WHEN ? = 1 THEN new_duration END ASC, CASE WHEN ? = 0 THEN new_duration END DESC LIMIT ? OFFSET ?");
                if (localDateTime2 != null) {
                    try {
                        C8800o c8800o5 = C8800o.f42459a;
                        strM16212u5 = C8800o.m16212u(localDateTime2);
                    } finally {
                    }
                } else {
                    strM16212u5 = null;
                }
                if (strM16212u5 == null) {
                    interfaceC4026cY03.mo1779i(1);
                } else {
                    interfaceC4026cY03.mo1776B(1, strM16212u5);
                }
                if (localDateTime != null) {
                    C8800o c8800o6 = C8800o.f42459a;
                    strM16212u6 = C8800o.m16212u(localDateTime);
                } else {
                    strM16212u6 = null;
                }
                if (strM16212u6 == null) {
                    interfaceC4026cY03.mo1779i(2);
                } else {
                    interfaceC4026cY03.mo1776B(2, strM16212u6);
                }
                interfaceC4026cY03.mo1778g(3, i13);
                interfaceC4026cY03.mo1776B(4, str);
                long j11 = z6 ? 1L : 0L;
                interfaceC4026cY03.mo1778g(5, j11);
                interfaceC4026cY03.mo1778g(6, j11);
                interfaceC4026cY03.mo1778g(7, i12);
                interfaceC4026cY03.mo1778g(8, i11);
                ArrayList arrayList3 = new ArrayList();
                while (interfaceC4026cY03.r0()) {
                    arrayList3.add(new C5419u(interfaceC4026cY03.mo1777W(0), interfaceC4026cY03.mo1777W(2), (int) interfaceC4026cY03.getLong(3), interfaceC4026cY03.isNull(1) ? null : interfaceC4026cY03.mo1777W(1), interfaceC4026cY03.isNull(4) ? null : Long.valueOf(interfaceC4026cY03.getLong(4))));
                }
                interfaceC4026cY03.close();
                return arrayList3;
        }
    }

    public /* synthetic */ i1(LocalDateTime localDateTime, LocalDateTime localDateTime2, int i10, String str, boolean z6, int i11, int i12, int i13) {
        this.f924a = i13;
        this.f925b = localDateTime;
        this.f926c = localDateTime2;
        this.f927d = i10;
        this.f928e = str;
        this.f929f = z6;
        this.f930g = i11;
        this.f931h = i12;
    }
}
