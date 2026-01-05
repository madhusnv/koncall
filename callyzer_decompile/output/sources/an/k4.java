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
import yv.C8800o;
import zm.EnumC8992b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k4 implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f1021a;

    /* renamed from: b */
    public final /* synthetic */ m4 f1022b;

    public /* synthetic */ k4(m4 m4Var, int i10) {
        this.f1021a = i10;
        this.f1022b = m4Var;
    }

    /* JADX WARN: Finally extract failed */
    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) throws Exception {
        LocalDateTime localDateTimeM16183G;
        LocalDateTime localDateTimeM16183G2;
        LocalDateTime localDateTimeM16183G3;
        LocalDateTime localDateTimeM16183G4;
        int i10 = this.f1021a;
        m4 m4Var = this.f1022b;
        switch (i10) {
            case 0:
                String str = "Expected NON-NULL 'java.time.LocalDateTime', but it was NULL.";
                InterfaceC4024a _connection = (InterfaceC4024a) obj;
                AbstractC4154l.m8923f(_connection, "_connection");
                InterfaceC4026c interfaceC4026cY0 = _connection.y0("SELECT * FROM CallNoteTemplate  WHERE is_master = ?");
                m4 m4Var2 = m4Var;
                try {
                    interfaceC4026cY0.mo1778g(1, 1);
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
                        String str2 = str;
                        int i11 = (int) interfaceC4026cY0.getLong(iM10916d);
                        String strMo1777W = interfaceC4026cY0.mo1777W(iM10916d2);
                        String strMo1777W2 = interfaceC4026cY0.mo1777W(iM10916d3);
                        boolean z6 = ((int) interfaceC4026cY0.getLong(iM10916d4)) != 0;
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
                            throw new IllegalStateException(str2);
                        }
                        Integer numValueOf = Integer.valueOf((int) interfaceC4026cY0.getLong(iM10916d7));
                        m4 m4Var3 = m4Var2;
                        C5950e c5950e = m4Var3.f1108c;
                        EnumC8992b enumC8992bM11979j = C5950e.m11979j(numValueOf);
                        if (enumC8992bM11979j == null) {
                            throw new IllegalStateException("Expected NON-NULL 'com.websoptimization.callyzerbiz.`data`.room.CallNoteTemplateSyncStatus', but it was NULL.");
                        }
                        arrayList.add(new C5405g(i11, strMo1777W, strMo1777W2, z6, localDateTimeM16183G, localDateTimeM16183G2, enumC8992bM11979j, (int) interfaceC4026cY0.getLong(iM10916d8), interfaceC4026cY0.mo1777W(iM10916d9), interfaceC4026cY0.mo1777W(iM10916d10)));
                        m4Var2 = m4Var3;
                        str = str2;
                    }
                    interfaceC4026cY0.close();
                    return arrayList;
                } catch (Throwable th2) {
                    interfaceC4026cY0.close();
                    throw th2;
                }
            default:
                InterfaceC4024a _connection2 = (InterfaceC4024a) obj;
                AbstractC4154l.m8923f(_connection2, "_connection");
                InterfaceC4026c interfaceC4026cY02 = _connection2.y0("SELECT * FROM CallNoteTemplate  WHERE is_master = ? ORDER BY last_Modified_date_time DESC");
                try {
                    interfaceC4026cY02.mo1778g(1, 0);
                    int iM10916d11 = se.m10916d(interfaceC4026cY02, "id");
                    int iM10916d12 = se.m10916d(interfaceC4026cY02, MessageBundle.TITLE_ENTRY);
                    int iM10916d13 = se.m10916d(interfaceC4026cY02, "description");
                    int iM10916d14 = se.m10916d(interfaceC4026cY02, "is_master");
                    int iM10916d15 = se.m10916d(interfaceC4026cY02, "last_Modified_date_time");
                    int iM10916d16 = se.m10916d(interfaceC4026cY02, "create_date_time");
                    int iM10916d17 = se.m10916d(interfaceC4026cY02, "call_note_template_sync_status");
                    int iM10916d18 = se.m10916d(interfaceC4026cY02, "use_count");
                    int iM10916d19 = se.m10916d(interfaceC4026cY02, "note_template_id");
                    int iM10916d20 = se.m10916d(interfaceC4026cY02, "sim_number");
                    ArrayList arrayList2 = new ArrayList();
                    while (interfaceC4026cY02.r0()) {
                        int i12 = (int) interfaceC4026cY02.getLong(iM10916d11);
                        String strMo1777W5 = interfaceC4026cY02.mo1777W(iM10916d12);
                        String strMo1777W6 = interfaceC4026cY02.mo1777W(iM10916d13);
                        int i13 = iM10916d11;
                        int i14 = iM10916d12;
                        boolean z10 = ((int) interfaceC4026cY02.getLong(iM10916d14)) != 0;
                        String strMo1777W7 = interfaceC4026cY02.isNull(iM10916d15) ? null : interfaceC4026cY02.mo1777W(iM10916d15);
                        if (strMo1777W7 != null) {
                            C8800o c8800o3 = C8800o.f42459a;
                            localDateTimeM16183G3 = C8800o.m16183G(strMo1777W7);
                        } else {
                            localDateTimeM16183G3 = null;
                        }
                        String strMo1777W8 = interfaceC4026cY02.isNull(iM10916d16) ? null : interfaceC4026cY02.mo1777W(iM10916d16);
                        if (strMo1777W8 != null) {
                            C8800o c8800o4 = C8800o.f42459a;
                            localDateTimeM16183G4 = C8800o.m16183G(strMo1777W8);
                        } else {
                            localDateTimeM16183G4 = null;
                        }
                        if (localDateTimeM16183G4 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'java.time.LocalDateTime', but it was NULL.");
                        }
                        Integer numValueOf2 = Integer.valueOf((int) interfaceC4026cY02.getLong(iM10916d17));
                        C5950e c5950e2 = m4Var.f1108c;
                        EnumC8992b enumC8992bM11979j2 = C5950e.m11979j(numValueOf2);
                        if (enumC8992bM11979j2 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'com.websoptimization.callyzerbiz.`data`.room.CallNoteTemplateSyncStatus', but it was NULL.");
                        }
                        arrayList2.add(new C5405g(i12, strMo1777W5, strMo1777W6, z10, localDateTimeM16183G3, localDateTimeM16183G4, enumC8992bM11979j2, (int) interfaceC4026cY02.getLong(iM10916d18), interfaceC4026cY02.mo1777W(iM10916d19), interfaceC4026cY02.mo1777W(iM10916d20)));
                        iM10916d11 = i13;
                        iM10916d12 = i14;
                    }
                    interfaceC4026cY02.close();
                    return arrayList2;
                } catch (Throwable th3) {
                    interfaceC4026cY02.close();
                    throw th3;
                }
        }
    }
}
