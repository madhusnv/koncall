package an;

import com.sun.mail.imap.IMAPStore;
import ex.InterfaceC2139c;
import java.util.ArrayList;
import k8.InterfaceC4024a;
import k8.InterfaceC4026c;
import kotlin.jvm.internal.AbstractC4154l;
import mm.C4798i;
import og.se;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u4 implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f1445a;

    /* renamed from: b */
    public final /* synthetic */ int f1446b;

    /* renamed from: c */
    public final /* synthetic */ int f1447c;

    public /* synthetic */ u4(int i10, int i11, int i12) {
        this.f1445a = i12;
        this.f1446b = i10;
        this.f1447c = i11;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) throws Exception {
        InterfaceC4026c interfaceC4026cY0;
        switch (this.f1445a) {
            case 0:
                int i10 = this.f1446b;
                int i11 = this.f1447c;
                InterfaceC4024a _connection = (InterfaceC4024a) obj;
                AbstractC4154l.m8923f(_connection, "_connection");
                interfaceC4026cY0 = _connection.y0("SELECT contact_1.name,contact_1.phone_number,contact_1.country_code,contact_1.photo_uri,COUNT(CallLog1.phone_number) AS count FROM Contact AS contact_1 LEFT JOIN CallLog AS CallLog1 ON CallLog1.phone_number = contact_1.phone_number  GROUP BY contact_1.phone_number ORDER BY contact_1.name COLLATE NOCASE ASC LIMIT ? OFFSET ?");
                try {
                    interfaceC4026cY0.mo1778g(1, i10);
                    interfaceC4026cY0.mo1778g(2, i11);
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC4026cY0.r0()) {
                        arrayList.add(new C4798i((int) interfaceC4026cY0.getLong(4), (int) interfaceC4026cY0.getLong(2), interfaceC4026cY0.mo1777W(0), interfaceC4026cY0.mo1777W(1), interfaceC4026cY0.isNull(3) ? null : interfaceC4026cY0.mo1777W(3)));
                    }
                    return arrayList;
                } finally {
                }
            default:
                int i12 = this.f1446b;
                int i13 = this.f1447c;
                InterfaceC4024a _connection2 = (InterfaceC4024a) obj;
                AbstractC4154l.m8923f(_connection2, "_connection");
                interfaceC4026cY0 = _connection2.y0("SELECT * FROM ( SELECT CASE WHEN contact_1.name ISNULL OR contact_1.name= 'Unknown' THEN CallLog1.name ELSE contact_1.name END AS name,CallLog1.phone_number,CallLog1.country_code,photo_uri,COUNT(CallLog1.phone_number) AS count FROM CallLog AS CallLog1 LEFT JOIN Contact contact_1 ON contact_1.phone_number = CallLog1.phone_number GROUP BY CallLog1.phone_number UNION ALL SELECT contact_2.name,contact_2.phone_number,contact_2.country_code,contact_2.photo_uri,0 AS count FROM Contact AS contact_2 WHERE NOT EXISTS ( SELECT phone_number FROM CallLog CallLog2 WHERE CallLog2.phone_number = contact_2.phone_number ) ) AS frequent_table  ORDER BY count DESC LIMIT ? OFFSET ?");
                try {
                    interfaceC4026cY0.mo1778g(1, i12);
                    interfaceC4026cY0.mo1778g(2, i13);
                    int iM10916d = se.m10916d(interfaceC4026cY0, IMAPStore.ID_NAME);
                    int iM10916d2 = se.m10916d(interfaceC4026cY0, "phone_number");
                    int iM10916d3 = se.m10916d(interfaceC4026cY0, "country_code");
                    int iM10916d4 = se.m10916d(interfaceC4026cY0, "photo_uri");
                    int iM10916d5 = se.m10916d(interfaceC4026cY0, "count");
                    ArrayList arrayList2 = new ArrayList();
                    while (interfaceC4026cY0.r0()) {
                        arrayList2.add(new C4798i((int) interfaceC4026cY0.getLong(iM10916d5), (int) interfaceC4026cY0.getLong(iM10916d3), interfaceC4026cY0.mo1777W(iM10916d), interfaceC4026cY0.mo1777W(iM10916d2), interfaceC4026cY0.isNull(iM10916d4) ? null : interfaceC4026cY0.mo1777W(iM10916d4)));
                    }
                    return arrayList2;
                } finally {
                }
        }
    }
}
