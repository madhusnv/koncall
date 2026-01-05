package og;

import ac.C0088a;
import ad.C0100g;
import ad.C0108o;
import ad.C0109p;
import ad.C0115v;
import ad.C0116w;
import ad.C0118y;
import ad.C0119z;
import android.media.ImageReader;
import aws.smithy.kotlin.runtime.ClientException;
import com.sun.mail.util.AbstractC1452a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC4154l;
import nc.C5002m;
import nc.C5004o;
import nx.AbstractC5178p;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import rw.AbstractC6663m;
import sd.C6808b;
import sd.C6813g;
import sd.InterfaceC6811e;
import ud.C7416t;
import ud.InterfaceC7409m;
import zc.AbstractC8927d;
import zc.C8935l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class t1 {
    /* renamed from: a */
    public static final C5004o m10921a(InterfaceC7409m interfaceC7409m, C8935l c8935l) {
        C5004o c5004o;
        String str = c8935l.f42911a;
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        AbstractC4154l.m8922e(lowerCase, "toLowerCase(...)");
        String strConcat = lowerCase.concat("_proxy");
        String upperCase = c8935l.f42911a.toUpperCase(locale);
        AbstractC4154l.m8922e(upperCase, "toUpperCase(...)");
        Iterator it = pe.m10834i(strConcat, upperCase.concat("_PROXY")).iterator();
        do {
            c5004o = null;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            String strM13806a = ((C7416t) interfaceC7409m).m13806a(str2);
            if (strM13806a == null || AbstractC5178p.m10101L(strM13806a)) {
                strM13806a = null;
            }
            if (strM13806a != null) {
                try {
                    c5004o = new C5004o(C0108o.m297a(C0109p.f374i, strM13806a));
                } catch (Exception e2) {
                    throw new ClientException(AbstractC5601a.m11238i("Could not parse ", str2 + "=\"" + strM13806a + '\"', " into a valid proxy URL"), e2);
                }
            }
        } while (c5004o == null);
        return c5004o;
    }

    /* renamed from: b */
    public static final C5004o m10922b(InterfaceC7409m interfaceC7409m, C8935l c8935l) {
        String key = AbstractC1452a.m4564k(new StringBuilder(), c8935l.f42911a, ".proxyHost");
        String key2 = c8935l.f42911a + ".proxyPort";
        AbstractC4154l.m8923f(key, "key");
        String property = System.getProperty(key);
        if (property == null || AbstractC5178p.m10101L(property)) {
            property = null;
        }
        AbstractC4154l.m8923f(key2, "key");
        String property2 = System.getProperty(key2);
        String str = (property2 == null || AbstractC5178p.m10101L(property2)) ? null : property2;
        if (property == null) {
            return null;
        }
        C8935l c8935l2 = C8935l.f42909d;
        try {
            ArrayList arrayList = new ArrayList();
            C0115v c0115v = C0115v.f389a;
            C6813g c6813g = C6813g.f32359i;
            df.m10612b(arrayList, c0115v, new C0088a(1, c6813g, InterfaceC6811e.class, "encodableFromDecoded", "encodableFromDecoded(Ljava/lang/String;)Laws/smithy/kotlin/runtime/text/encoding/Encodable;", 0, 7));
            df.m10612b(arrayList, C0116w.f390a, new C0088a(1, c6813g, InterfaceC6811e.class, "encodableFromEncoded", "encodableFromEncoded(Ljava/lang/String;)Laws/smithy/kotlin/runtime/text/encoding/Encodable;", 0, 8));
            C0100g c0100g = new C0100g();
            C6808b c6808b = C6808b.f32347f;
            AbstractC4154l.m8923f(c8935l2, "<set-?>");
            AbstractC8927d abstractC8927dM11935c = pg.x9.m11935c(property);
            Integer numValueOf = str != null ? Integer.valueOf(Integer.parseInt(str)) : null;
            return new C5004o(new C0109p(c8935l2, abstractC8927dM11935c, numValueOf != null ? numValueOf.intValue() : c8935l2.f42912b, new C0118y(AbstractC6663m.c0(arrayList), false), c0100g.m263d(), new C0119z(c6808b, c6808b), null));
        } catch (Exception e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(key + "=\"" + property + '\"');
            if (str != null) {
                sb2.append(", " + key2 + "=\"" + str + '\"');
            }
            throw new ClientException(AbstractC5601a.m11238i("Could not parse ", sb2.toString(), " into a valid proxy URL"), e2);
        }
    }

    /* renamed from: c */
    public static com.google.android.gms.internal.measurement.j4 m10923c(int i10, int i11, int i12, int i13) {
        return new com.google.android.gms.internal.measurement.j4(ImageReader.newInstance(i10, i11, i12, i13));
    }

    /* renamed from: d */
    public static final C5002m m10924d(String str) {
        List listM10111V = AbstractC5178p.m10111V(str, new char[]{':'}, 2, 2);
        int size = listM10111V.size();
        if (size == 1) {
            return new C5002m((String) listM10111V.get(0), null);
        }
        if (size == 2) {
            return new C5002m((String) listM10111V.get(0), Integer.valueOf(Integer.parseInt((String) listM10111V.get(1))));
        }
        throw new IllegalStateException("invalid non proxy host: ".concat(str).toString());
    }
}
