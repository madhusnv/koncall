package og;

import ap.C0390c;
import com.sun.mail.imap.IMAPStore;
import f8.C2212g;
import f8.C2215j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k8.InterfaceC4024a;
import k8.InterfaceC4026c;
import kotlin.KotlinNothingValueException;
import rw.AbstractC6663m;
import rw.AbstractC6664n;
import s4.AbstractC6746b;
import sw.C6959c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class te {
    /* renamed from: a */
    public static long m10935a(int i10, int i11, int i12, int i13) {
        int i14 = 262142;
        int iMin = Math.min(i12, 262142);
        int iMin2 = i13 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i13, 262142);
        int i15 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i15 >= 8191) {
            if (i15 < 32767) {
                i14 = 65534;
            } else if (i15 < 65535) {
                i14 = 32766;
            } else {
                if (i15 >= 262143) {
                    AbstractC6746b.m12934l(i15);
                    throw new KotlinNothingValueException();
                }
                i14 = 8190;
            }
        }
        return AbstractC6746b.m12923a(Math.min(i14, i10), i11 != Integer.MAX_VALUE ? Math.min(i14, i11) : Integer.MAX_VALUE, iMin, iMin2);
    }

    /* renamed from: b */
    public static long m10936b(int i10, int i11, int i12, int i13) {
        int i14 = 262142;
        int iMin = Math.min(i10, 262142);
        int iMin2 = i11 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i11, 262142);
        int i15 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i15 >= 8191) {
            if (i15 < 32767) {
                i14 = 65534;
            } else if (i15 < 65535) {
                i14 = 32766;
            } else {
                if (i15 >= 262143) {
                    AbstractC6746b.m12934l(i15);
                    throw new KotlinNothingValueException();
                }
                i14 = 8190;
            }
        }
        return AbstractC6746b.m12923a(iMin, iMin2, Math.min(i14, i12), i13 != Integer.MAX_VALUE ? Math.min(i14, i13) : Integer.MAX_VALUE);
    }

    /* renamed from: c */
    public static final List m10937c(InterfaceC4026c interfaceC4026c) {
        int iM10914b = se.m10914b(interfaceC4026c, "id");
        int iM10914b2 = se.m10914b(interfaceC4026c, "seq");
        int iM10914b3 = se.m10914b(interfaceC4026c, "from");
        int iM10914b4 = se.m10914b(interfaceC4026c, "to");
        C6959c c6959cM10829d = pe.m10829d();
        while (interfaceC4026c.r0()) {
            c6959cM10829d.add(new C2212g(interfaceC4026c.mo1777W(iM10914b3), (int) interfaceC4026c.getLong(iM10914b), (int) interfaceC4026c.getLong(iM10914b2), interfaceC4026c.mo1777W(iM10914b4)));
        }
        return AbstractC6663m.m12759W(pe.m10828c(c6959cM10829d));
    }

    /* renamed from: d */
    public static final C2215j m10938d(InterfaceC4024a interfaceC4024a, String str, boolean z6) {
        InterfaceC4026c interfaceC4026cY0 = interfaceC4024a.y0("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int iM10914b = se.m10914b(interfaceC4026cY0, "seqno");
            int iM10914b2 = se.m10914b(interfaceC4026cY0, "cid");
            int iM10914b3 = se.m10914b(interfaceC4026cY0, IMAPStore.ID_NAME);
            int iM10914b4 = se.m10914b(interfaceC4026cY0, "desc");
            if (iM10914b != -1 && iM10914b2 != -1 && iM10914b3 != -1 && iM10914b4 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (interfaceC4026cY0.r0()) {
                    if (((int) interfaceC4026cY0.getLong(iM10914b2)) >= 0) {
                        int i10 = (int) interfaceC4026cY0.getLong(iM10914b);
                        String strMo1777W = interfaceC4026cY0.mo1777W(iM10914b3);
                        String str2 = interfaceC4026cY0.getLong(iM10914b4) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(i10), strMo1777W);
                        linkedHashMap2.put(Integer.valueOf(i10), str2);
                    }
                }
                List listM12760X = AbstractC6663m.m12760X(linkedHashMap.entrySet(), new C0390c(7));
                ArrayList arrayList = new ArrayList(AbstractC6664n.m12768r(listM12760X, 10));
                Iterator it = listM12760X.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List listC0 = AbstractC6663m.c0(arrayList);
                List listM12760X2 = AbstractC6663m.m12760X(linkedHashMap2.entrySet(), new C0390c(8));
                ArrayList arrayList2 = new ArrayList(AbstractC6664n.m12768r(listM12760X2, 10));
                Iterator it2 = listM12760X2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                C2215j c2215j = new C2215j(str, z6, listC0, AbstractC6663m.c0(arrayList2));
                mb.m10760a(interfaceC4026cY0, null);
                return c2215j;
            }
            mb.m10760a(interfaceC4026cY0, null);
            return null;
        } finally {
        }
    }
}
