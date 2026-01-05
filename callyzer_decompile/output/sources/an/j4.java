package an;

import ex.InterfaceC2139c;
import j$.time.LocalDateTime;
import java.util.ArrayList;
import k8.InterfaceC4024a;
import k8.InterfaceC4026c;
import kotlin.jvm.internal.AbstractC4154l;
import og.se;
import om.C5405g;
import org.bouncycastle.i18n.MessageBundle;
import ph.C5950e;
import pm.C5974a;
import yv.C8800o;
import zm.EnumC8992b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j4 implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f979a;

    /* renamed from: b */
    public final /* synthetic */ String f980b;

    /* renamed from: c */
    public final /* synthetic */ m4 f981c;

    /* renamed from: d */
    public final /* synthetic */ EnumC8992b f982d;

    public /* synthetic */ j4(m4 m4Var, EnumC8992b enumC8992b, String str, int i10) {
        this.f979a = i10;
        this.f981c = m4Var;
        this.f982d = enumC8992b;
        this.f980b = str;
    }

    /* JADX WARN: Finally extract failed */
    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) throws Exception {
        InterfaceC4026c interfaceC4026cY0;
        boolean z6;
        LocalDateTime localDateTimeM16183G;
        LocalDateTime localDateTimeM16183G2;
        LocalDateTime localDateTimeM16183G3;
        LocalDateTime localDateTimeM16183G4;
        LocalDateTime localDateTimeM16183G5;
        LocalDateTime localDateTimeM16183G6;
        LocalDateTime localDateTimeM16183G7;
        LocalDateTime localDateTimeM16183G8;
        int i10 = this.f979a;
        String str = this.f980b;
        EnumC8992b enumC8992b = this.f982d;
        m4 m4Var = this.f981c;
        switch (i10) {
            case 0:
                InterfaceC4024a _connection = (InterfaceC4024a) obj;
                AbstractC4154l.m8923f(_connection, "_connection");
                interfaceC4026cY0 = _connection.y0("SELECT * FROM CallNoteTemplate  WHERE sim_number = ? AND call_note_template_sync_status != ? ");
                try {
                    if (str == null) {
                        z6 = true;
                        interfaceC4026cY0.mo1779i(1);
                    } else {
                        z6 = true;
                        interfaceC4026cY0.mo1776B(1, str);
                    }
                    C5950e c5950e = m4Var.f1108c;
                    interfaceC4026cY0.mo1778g(2, enumC8992b.getValue());
                    int iM10916d = se.m10916d(interfaceC4026cY0, "id");
                    int iM10916d2 = se.m10916d(interfaceC4026cY0, MessageBundle.TITLE_ENTRY);
                    int iM10916d3 = se.m10916d(interfaceC4026cY0, "description");
                    int iM10916d4 = se.m10916d(interfaceC4026cY0, "is_master");
                    int iM10916d5 = se.m10916d(interfaceC4026cY0, "last_Modified_date_time");
                    int iM10916d6 = se.m10916d(interfaceC4026cY0, "create_date_time");
                    int iM10916d7 = se.m10916d(interfaceC4026cY0, "call_note_template_sync_status");
                    int iM10916d8 = se.m10916d(interfaceC4026cY0, "use_count");
                    int iM10916d9 = se.m10916d(interfaceC4026cY0, "note_template_id");
                    int iM10916d10 = se.m10916d(interfaceC4026cY0, "sim_number");
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC4026cY0.r0()) {
                        int i11 = (int) interfaceC4026cY0.getLong(iM10916d);
                        String strMo1777W = interfaceC4026cY0.mo1777W(iM10916d2);
                        String strMo1777W2 = interfaceC4026cY0.mo1777W(iM10916d3);
                        int i12 = iM10916d2;
                        int i13 = iM10916d3;
                        boolean z10 = ((int) interfaceC4026cY0.getLong(iM10916d4)) != 0 ? z6 : false;
                        String strMo1777W3 = interfaceC4026cY0.isNull(iM10916d5) ? null : interfaceC4026cY0.mo1777W(iM10916d5);
                        if (strMo1777W3 != null) {
                            C8800o c8800o = C8800o.f42459a;
                            localDateTimeM16183G = C8800o.m16183G(strMo1777W3);
                        } else {
                            localDateTimeM16183G = null;
                        }
                        String strMo1777W4 = interfaceC4026cY0.isNull(iM10916d6) ? null : interfaceC4026cY0.mo1777W(iM10916d6);
                        if (strMo1777W4 != null) {
                            C8800o c8800o2 = C8800o.f42459a;
                            localDateTimeM16183G2 = C8800o.m16183G(strMo1777W4);
                        } else {
                            localDateTimeM16183G2 = null;
                        }
                        if (localDateTimeM16183G2 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'java.time.LocalDateTime', but it was NULL.");
                        }
                        EnumC8992b enumC8992bM11979j = C5950e.m11979j(Integer.valueOf((int) interfaceC4026cY0.getLong(iM10916d7)));
                        if (enumC8992bM11979j == null) {
                            throw new IllegalStateException("Expected NON-NULL 'com.websoptimization.callyzerbiz.`data`.room.CallNoteTemplateSyncStatus', but it was NULL.");
                        }
                        arrayList.add(new C5405g(i11, strMo1777W, strMo1777W2, z10, localDateTimeM16183G, localDateTimeM16183G2, enumC8992bM11979j, (int) interfaceC4026cY0.getLong(iM10916d8), interfaceC4026cY0.mo1777W(iM10916d9), interfaceC4026cY0.mo1777W(iM10916d10)));
                        iM10916d2 = i12;
                        iM10916d3 = i13;
                    }
                    return arrayList;
                } catch (Throwable th2) {
                    throw th2;
                }
            case 1:
                InterfaceC4024a _connection2 = (InterfaceC4024a) obj;
                AbstractC4154l.m8923f(_connection2, "_connection");
                interfaceC4026cY0 = _connection2.y0("SELECT * FROM CallNoteTemplate  WHERE sim_number = ? AND call_note_template_sync_status != ? AND is_master = ? ORDER BY last_Modified_date_time DESC");
                try {
                    interfaceC4026cY0.mo1776B(1, str);
                    C5950e c5950e2 = m4Var.f1108c;
                    interfaceC4026cY0.mo1778g(2, C5950e.m11978i(enumC8992b));
                    interfaceC4026cY0.mo1778g(3, 0);
                    int iM10916d11 = se.m10916d(interfaceC4026cY0, "id");
                    int iM10916d12 = se.m10916d(interfaceC4026cY0, MessageBundle.TITLE_ENTRY);
                    int iM10916d13 = se.m10916d(interfaceC4026cY0, "description");
                    int iM10916d14 = se.m10916d(interfaceC4026cY0, "is_master");
                    int iM10916d15 = se.m10916d(interfaceC4026cY0, "last_Modified_date_time");
                    int iM10916d16 = se.m10916d(interfaceC4026cY0, "create_date_time");
                    int iM10916d17 = se.m10916d(interfaceC4026cY0, "call_note_template_sync_status");
                    int iM10916d18 = se.m10916d(interfaceC4026cY0, "use_count");
                    int iM10916d19 = se.m10916d(interfaceC4026cY0, "note_template_id");
                    int iM10916d20 = se.m10916d(interfaceC4026cY0, "sim_number");
                    ArrayList arrayList2 = new ArrayList();
                    while (interfaceC4026cY0.r0()) {
                        int i14 = (int) interfaceC4026cY0.getLong(iM10916d11);
                        String strMo1777W5 = interfaceC4026cY0.mo1777W(iM10916d12);
                        String strMo1777W6 = interfaceC4026cY0.mo1777W(iM10916d13);
                        boolean z11 = ((int) interfaceC4026cY0.getLong(iM10916d14)) != 0;
                        String strMo1777W7 = interfaceC4026cY0.isNull(iM10916d15) ? null : interfaceC4026cY0.mo1777W(iM10916d15);
                        if (strMo1777W7 != null) {
                            C8800o c8800o3 = C8800o.f42459a;
                            localDateTimeM16183G3 = C8800o.m16183G(strMo1777W7);
                        } else {
                            localDateTimeM16183G3 = null;
                        }
                        String strMo1777W8 = interfaceC4026cY0.isNull(iM10916d16) ? null : interfaceC4026cY0.mo1777W(iM10916d16);
                        if (strMo1777W8 != null) {
                            C8800o c8800o4 = C8800o.f42459a;
                            localDateTimeM16183G4 = C8800o.m16183G(strMo1777W8);
                        } else {
                            localDateTimeM16183G4 = null;
                        }
                        if (localDateTimeM16183G4 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'java.time.LocalDateTime', but it was NULL.");
                        }
                        EnumC8992b enumC8992bM11979j2 = C5950e.m11979j(Integer.valueOf((int) interfaceC4026cY0.getLong(iM10916d17)));
                        if (enumC8992bM11979j2 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'com.websoptimization.callyzerbiz.`data`.room.CallNoteTemplateSyncStatus', but it was NULL.");
                        }
                        arrayList2.add(new C5405g(i14, strMo1777W5, strMo1777W6, z11, localDateTimeM16183G3, localDateTimeM16183G4, enumC8992bM11979j2, (int) interfaceC4026cY0.getLong(iM10916d18), interfaceC4026cY0.mo1777W(iM10916d19), interfaceC4026cY0.mo1777W(iM10916d20)));
                    }
                    return arrayList2;
                } catch (Throwable th3) {
                    throw th3;
                }
            case 2:
                InterfaceC4024a _connection3 = (InterfaceC4024a) obj;
                AbstractC4154l.m8923f(_connection3, "_connection");
                interfaceC4026cY0 = _connection3.y0("\n    SELECT t.*, s.slot AS slot,\n           INSTR(UPPER(t.title), UPPER(?)) AS position\n    FROM CallNoteTemplate t\n    LEFT JOIN UserSimDetails s \n    ON t.sim_number = s.sim_number\n    WHERE t.sim_number = ?\n      AND UPPER(t.title) LIKE '%' || UPPER(?) || '%'\n      AND t.call_note_template_sync_status != ?\n      AND t.is_master = ?\n    ORDER BY position ASC, t.title ASC\n    ");
                try {
                    interfaceC4026cY0.mo1776B(1, str);
                    interfaceC4026cY0.mo1776B(2, "");
                    interfaceC4026cY0.mo1776B(3, str);
                    C5950e c5950e3 = m4Var.f1108c;
                    interfaceC4026cY0.mo1778g(4, enumC8992b.getValue());
                    interfaceC4026cY0.mo1778g(5, 1);
                    int iM10916d21 = se.m10916d(interfaceC4026cY0, "id");
                    int iM10916d22 = se.m10916d(interfaceC4026cY0, MessageBundle.TITLE_ENTRY);
                    int iM10916d23 = se.m10916d(interfaceC4026cY0, "description");
                    int iM10916d24 = se.m10916d(interfaceC4026cY0, "is_master");
                    int iM10916d25 = se.m10916d(interfaceC4026cY0, "last_Modified_date_time");
                    int iM10916d26 = se.m10916d(interfaceC4026cY0, "create_date_time");
                    int iM10916d27 = se.m10916d(interfaceC4026cY0, "call_note_template_sync_status");
                    int iM10916d28 = se.m10916d(interfaceC4026cY0, "use_count");
                    int iM10916d29 = se.m10916d(interfaceC4026cY0, "note_template_id");
                    int iM10916d30 = se.m10916d(interfaceC4026cY0, "sim_number");
                    int iM10916d31 = se.m10916d(interfaceC4026cY0, "slot");
                    ArrayList arrayList3 = new ArrayList();
                    while (interfaceC4026cY0.r0()) {
                        Integer numValueOf = interfaceC4026cY0.isNull(iM10916d31) ? null : Integer.valueOf((int) interfaceC4026cY0.getLong(iM10916d31));
                        int i15 = (int) interfaceC4026cY0.getLong(iM10916d21);
                        String strMo1777W9 = interfaceC4026cY0.mo1777W(iM10916d22);
                        String strMo1777W10 = interfaceC4026cY0.mo1777W(iM10916d23);
                        int i16 = iM10916d21;
                        int i17 = iM10916d22;
                        boolean z12 = ((int) interfaceC4026cY0.getLong(iM10916d24)) != 0;
                        String strMo1777W11 = interfaceC4026cY0.isNull(iM10916d25) ? null : interfaceC4026cY0.mo1777W(iM10916d25);
                        if (strMo1777W11 != null) {
                            C8800o c8800o5 = C8800o.f42459a;
                            localDateTimeM16183G5 = C8800o.m16183G(strMo1777W11);
                        } else {
                            localDateTimeM16183G5 = null;
                        }
                        String strMo1777W12 = interfaceC4026cY0.isNull(iM10916d26) ? null : interfaceC4026cY0.mo1777W(iM10916d26);
                        if (strMo1777W12 != null) {
                            C8800o c8800o6 = C8800o.f42459a;
                            localDateTimeM16183G6 = C8800o.m16183G(strMo1777W12);
                        } else {
                            localDateTimeM16183G6 = null;
                        }
                        if (localDateTimeM16183G6 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'java.time.LocalDateTime', but it was NULL.");
                        }
                        EnumC8992b enumC8992bM11979j3 = C5950e.m11979j(Integer.valueOf((int) interfaceC4026cY0.getLong(iM10916d27)));
                        if (enumC8992bM11979j3 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'com.websoptimization.callyzerbiz.`data`.room.CallNoteTemplateSyncStatus', but it was NULL.");
                        }
                        arrayList3.add(new C5974a(new C5405g(i15, strMo1777W9, strMo1777W10, z12, localDateTimeM16183G5, localDateTimeM16183G6, enumC8992bM11979j3, (int) interfaceC4026cY0.getLong(iM10916d28), interfaceC4026cY0.mo1777W(iM10916d29), interfaceC4026cY0.mo1777W(iM10916d30)), numValueOf));
                        iM10916d21 = i16;
                        iM10916d22 = i17;
                    }
                    return arrayList3;
                } catch (Throwable th4) {
                    throw th4;
                }
            case 3:
                InterfaceC4024a _connection4 = (InterfaceC4024a) obj;
                AbstractC4154l.m8923f(_connection4, "_connection");
                interfaceC4026cY0 = _connection4.y0("\n    SELECT t.*, s.slot AS slot,\n           INSTR(UPPER(t.title), UPPER(?)) AS position\n    FROM CallNoteTemplate t\n    LEFT JOIN UserSimDetails s \n    ON t.sim_number = s.sim_number\n    WHERE UPPER(t.title) LIKE '%' || UPPER(?) || '%'\n      AND t.call_note_template_sync_status != ?\n    ORDER BY position ASC, t.title ASC, t.last_Modified_date_time DESC\n    ");
                try {
                    interfaceC4026cY0.mo1776B(1, str);
                    interfaceC4026cY0.mo1776B(2, str);
                    C5950e c5950e4 = m4Var.f1108c;
                    interfaceC4026cY0.mo1778g(3, enumC8992b.getValue());
                    int iM10916d32 = se.m10916d(interfaceC4026cY0, "id");
                    int iM10916d33 = se.m10916d(interfaceC4026cY0, MessageBundle.TITLE_ENTRY);
                    int iM10916d34 = se.m10916d(interfaceC4026cY0, "description");
                    int iM10916d35 = se.m10916d(interfaceC4026cY0, "is_master");
                    int iM10916d36 = se.m10916d(interfaceC4026cY0, "last_Modified_date_time");
                    int iM10916d37 = se.m10916d(interfaceC4026cY0, "create_date_time");
                    int iM10916d38 = se.m10916d(interfaceC4026cY0, "call_note_template_sync_status");
                    int iM10916d39 = se.m10916d(interfaceC4026cY0, "use_count");
                    int iM10916d40 = se.m10916d(interfaceC4026cY0, "note_template_id");
                    int iM10916d41 = se.m10916d(interfaceC4026cY0, "sim_number");
                    int iM10916d42 = se.m10916d(interfaceC4026cY0, "slot");
                    ArrayList arrayList4 = new ArrayList();
                    while (interfaceC4026cY0.r0()) {
                        Integer numValueOf2 = interfaceC4026cY0.isNull(iM10916d42) ? null : Integer.valueOf((int) interfaceC4026cY0.getLong(iM10916d42));
                        int i18 = (int) interfaceC4026cY0.getLong(iM10916d32);
                        String strMo1777W13 = interfaceC4026cY0.mo1777W(iM10916d33);
                        String strMo1777W14 = interfaceC4026cY0.mo1777W(iM10916d34);
                        int i19 = iM10916d42;
                        int i20 = iM10916d33;
                        boolean z13 = ((int) interfaceC4026cY0.getLong(iM10916d35)) != 0;
                        String strMo1777W15 = interfaceC4026cY0.isNull(iM10916d36) ? null : interfaceC4026cY0.mo1777W(iM10916d36);
                        if (strMo1777W15 != null) {
                            C8800o c8800o7 = C8800o.f42459a;
                            localDateTimeM16183G7 = C8800o.m16183G(strMo1777W15);
                        } else {
                            localDateTimeM16183G7 = null;
                        }
                        String strMo1777W16 = interfaceC4026cY0.isNull(iM10916d37) ? null : interfaceC4026cY0.mo1777W(iM10916d37);
                        if (strMo1777W16 != null) {
                            C8800o c8800o8 = C8800o.f42459a;
                            localDateTimeM16183G8 = C8800o.m16183G(strMo1777W16);
                        } else {
                            localDateTimeM16183G8 = null;
                        }
                        if (localDateTimeM16183G8 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'java.time.LocalDateTime', but it was NULL.");
                        }
                        EnumC8992b enumC8992bM11979j4 = C5950e.m11979j(Integer.valueOf((int) interfaceC4026cY0.getLong(iM10916d38)));
                        if (enumC8992bM11979j4 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'com.websoptimization.callyzerbiz.`data`.room.CallNoteTemplateSyncStatus', but it was NULL.");
                        }
                        arrayList4.add(new C5974a(new C5405g(i18, strMo1777W13, strMo1777W14, z13, localDateTimeM16183G7, localDateTimeM16183G8, enumC8992bM11979j4, (int) interfaceC4026cY0.getLong(iM10916d39), interfaceC4026cY0.mo1777W(iM10916d40), interfaceC4026cY0.mo1777W(iM10916d41)), numValueOf2));
                        iM10916d33 = i20;
                        iM10916d42 = i19;
                    }
                    return arrayList4;
                } catch (Throwable th5) {
                    throw th5;
                }
            case 4:
                InterfaceC4024a _connection5 = (InterfaceC4024a) obj;
                AbstractC4154l.m8923f(_connection5, "_connection");
                interfaceC4026cY0 = _connection5.y0("SELECT note_template_id FROM CallNoteTemplate  Where call_note_template_sync_status = ? AND sim_number =?");
                try {
                    C5950e c5950e5 = m4Var.f1108c;
                    interfaceC4026cY0.mo1778g(1, C5950e.m11978i(enumC8992b));
                    interfaceC4026cY0.mo1776B(2, str);
                    ArrayList arrayList5 = new ArrayList();
                    while (interfaceC4026cY0.r0()) {
                        arrayList5.add(interfaceC4026cY0.mo1777W(0));
                    }
                    return arrayList5;
                } finally {
                }
            default:
                InterfaceC4024a _connection6 = (InterfaceC4024a) obj;
                AbstractC4154l.m8923f(_connection6, "_connection");
                interfaceC4026cY0 = _connection6.y0("SELECT COUNT(*) FROM CallNoteTemplate  WHERE is_master = ? AND call_note_template_sync_status != ? AND sim_number =?");
                try {
                    interfaceC4026cY0.mo1778g(1, 0);
                    C5950e c5950e6 = m4Var.f1108c;
                    interfaceC4026cY0.mo1778g(2, C5950e.m11978i(enumC8992b));
                    interfaceC4026cY0.mo1776B(3, str);
                    int i21 = interfaceC4026cY0.r0() ? (int) interfaceC4026cY0.getLong(0) : 0;
                    interfaceC4026cY0.close();
                    return Integer.valueOf(i21);
                } finally {
                }
        }
    }

    public /* synthetic */ j4(String str, m4 m4Var, EnumC8992b enumC8992b, int i10) {
        this.f979a = i10;
        this.f980b = str;
        this.f981c = m4Var;
        this.f982d = enumC8992b;
    }
}
