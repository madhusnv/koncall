package fb;

import androidx.datastore.preferences.protobuf.C0312g;
import com.websoptimization.callyzerbiz.data.model.response.message_template.Documents;
import com.websoptimization.callyzerbiz.data.model.response.message_template.TemplateContentResponse;
import eb.C1978b;
import fd.C2271i;
import fd.C2272j;
import fd.C2274l;
import fd.InterfaceC2265c;
import fd.InterfaceC2275m;
import fd.InterfaceC2276n;
import hd.C2896h;
import j$.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import og.pe;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import qm.C6245a;
import qm.C6246b;
import qm.C6247c;
import qm.C6248d;
import qm.C6249e;
import qm.C6251g;
import rt.C6619c;
import rt.C6622f;
import rw.AbstractC6662l;
import rw.AbstractC6663m;
import rw.AbstractC6664n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fb.a */
/* loaded from: classes.dex */
public abstract class AbstractC2227a {
    /* renamed from: a */
    public static String m5930a(C0312g c0312g) {
        StringBuilder sb2 = new StringBuilder(c0312g.size());
        for (int i10 = 0; i10 < c0312g.size(); i10++) {
            byte bMo865a = c0312g.mo865a(i10);
            if (bMo865a == 34) {
                sb2.append("\\\"");
            } else if (bMo865a == 39) {
                sb2.append("\\'");
            } else if (bMo865a != 92) {
                switch (bMo865a) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (bMo865a < 32 || bMo865a > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((bMo865a >>> 6) & 3) + 48));
                            sb2.append((char) (((bMo865a >>> 3) & 7) + 48));
                            sb2.append((char) ((bMo865a & 7) + 48));
                            break;
                        } else {
                            sb2.append((char) bMo865a);
                            break;
                        }
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    /* renamed from: b */
    public static final List m5931b(String text) {
        AbstractC4154l.m8923f(text, "text");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (i10 < text.length()) {
            if (i10 + 2 < text.length() && text.charAt(i10) == '[') {
                int i11 = i10 + 1;
                if (text.charAt(i11) == '{') {
                    sb2.setLength(0);
                    while (true) {
                        int i12 = i10 + 1;
                        if (i12 >= text.length()) {
                            i10 = i11;
                            break;
                        }
                        sb2.append(text.charAt(i10));
                        if (text.charAt(i10) == '}' && text.charAt(i12) == ']') {
                            sb2.append(']');
                            String string = sb2.toString();
                            AbstractC4154l.m8922e(string, "toString(...)");
                            linkedHashSet.add(string);
                            i10 += 2;
                            break;
                        }
                        i10 = i12;
                    }
                }
            }
            i10++;
        }
        return AbstractC6663m.c0(AbstractC6663m.g0(linkedHashSet));
    }

    /* renamed from: c */
    public static final ArrayList m5932c(String messageTemplateId, List list) {
        AbstractC4154l.m8923f(messageTemplateId, "messageTemplateId");
        ArrayList arrayList = new ArrayList(AbstractC6664n.m12768r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Documents documents = (Documents) it.next();
            arrayList.add(new C6247c(documents.m4982a(), 0, documents.m4983b(), messageTemplateId));
        }
        return arrayList;
    }

    /* renamed from: d */
    public static final ArrayList m5933d(String messageTemplateId, List list) {
        AbstractC4154l.m8923f(list, "<this>");
        AbstractC4154l.m8923f(messageTemplateId, "messageTemplateId");
        ArrayList arrayList = new ArrayList(AbstractC6664n.m12768r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C6249e(0, messageTemplateId, (String) it.next()));
        }
        return arrayList;
    }

    /* renamed from: e */
    public static final ArrayList m5934e(List list) {
        AbstractC4154l.m8923f(list, "<this>");
        ArrayList arrayList = new ArrayList(AbstractC6664n.m12768r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C6251g c6251g = (C6251g) it.next();
            String str = !c6251g.f30294b.isEmpty() ? ((C6245a) c6251g.f30294b.get(0)).f30270c : "";
            C6246b c6246b = c6251g.f30293a;
            arrayList.add(new C6619c(c6246b.f30276b, c6246b.f30275a, str, c6246b.f30279e));
        }
        return arrayList;
    }

    /* renamed from: f */
    public static final ArrayList m5935f(String messageTemplateId, List list) {
        AbstractC4154l.m8923f(list, "<this>");
        AbstractC4154l.m8923f(messageTemplateId, "messageTemplateId");
        ArrayList arrayList = new ArrayList(AbstractC6664n.m12768r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TemplateContentResponse templateContentResponse = (TemplateContentResponse) it.next();
            String strM4998e = templateContentResponse.m4998e();
            String strM4995b = templateContentResponse.m4995b();
            LocalDateTime localDateTimeM4994a = templateContentResponse.m4994a();
            String str = messageTemplateId;
            C6245a c6245a = new C6245a(0, strM4998e, strM4995b, templateContentResponse.m4996c(), templateContentResponse.m4997d(), str, localDateTimeM4994a);
            List<TemplateContentResponse> listM10833h = pe.m10833h(templateContentResponse);
            ArrayList arrayList2 = new ArrayList(AbstractC6664n.m12768r(listM10833h, 10));
            for (TemplateContentResponse templateContentResponse2 : listM10833h) {
                arrayList2.add(new C6248d(0, templateContentResponse2.m4998e(), m5931b(templateContentResponse2.m4995b()), templateContentResponse2.m4997d()));
            }
            arrayList.add(new C6622f(c6245a, arrayList2));
            messageTemplateId = str;
        }
        return arrayList;
    }

    /* renamed from: g */
    public static final void m5936g(InterfaceC2275m serializer, C1978b input) {
        AbstractC4154l.m8923f(serializer, "serializer");
        AbstractC4154l.m8923f(input, "input");
        C2271i c2271i = new C2271i(C2274l.f10291i, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("AnalyticsEndpointId")}), 0);
        InterfaceC2276n interfaceC2276nMo5962b = serializer.mo5962b(new C2272j(AbstractC5601a.m11252w(c2271i)));
        String str = input.f9273a;
        if (str != null) {
            interfaceC2276nMo5962b.mo2596d(c2271i, str);
        }
        interfaceC2276nMo5962b.mo2598f();
    }
}
