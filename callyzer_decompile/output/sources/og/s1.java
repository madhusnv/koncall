package og;

import ec.C2003a;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4154l;
import na.AbstractC4981c;
import na.AbstractC4982d;
import na.C4979a;
import na.C4980b;
import na.C4983e;
import na.C4984f;
import na.C4985g;
import na.C4987i;
import na.C4988j;
import nx.AbstractC5178p;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import ra.C6487a;
import rw.AbstractC6664n;
import rw.AbstractC6674x;
import ud.C7406j;
import ud.C7410n;
import ud.C7416t;
import ud.InterfaceC7411o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class s1 {
    /* renamed from: a */
    public static C4980b m10886a(C4979a c4979a, String str) throws ClassNotFoundException {
        C4984f c4984f;
        InterfaceC7411o.f35200a.getClass();
        C7416t platform = C7410n.f35199b;
        Set set = AbstractC4982d.f24718a;
        AbstractC4154l.m8923f(platform, "platform");
        C4988j c4988j = new C4988j(c4979a.f24708b);
        C7406j c7406jM13807b = platform.m13807b();
        C4987i c4987i = new C4987i(c7406jM13807b.f35195a, c7406jM13807b.f35196b);
        C4985g c4985g = new C4985g((Map) AbstractC4981c.f24717a.getValue());
        if (str == null && (str = System.getProperty("aws.userAgentAppId")) == null) {
            str = platform.m13806a("AWS_SDK_UA_APP_ID");
        }
        String str2 = str;
        String property = System.getProperty("aws.frameworkMetadata");
        if (property == null) {
            property = platform.m13806a("AWS_FRAMEWORK_METADATA");
        }
        if (property != null) {
            List listM10111V = AbstractC5178p.m10111V(property, new char[]{':'}, 2, 2);
            if (listM10111V.size() != 2) {
                throw new IllegalStateException(AbstractC5601a.m11238i("Invalid value for FRAMEWORK_METADATA: ", property, "; must be of the form `name:version`").toString());
            }
            c4984f = new C4984f((String) listM10111V.get(0), (String) listM10111V.get(1));
        } else {
            c4984f = null;
        }
        C2003a c2003a = C6487a.f31162c;
        Map<String, String> map = System.getenv();
        AbstractC4154l.m8922e(map, "getenv(...)");
        LinkedHashMap linkedHashMapM11094a = zd.m11094a("AWS_CUSTOM_METADATA_", map);
        Set setEntrySet = System.getProperties().entrySet();
        AbstractC4154l.m8922e(setEntrySet, "<get-entries>(...)");
        Set<Map.Entry> set2 = setEntrySet;
        int iM12776d = AbstractC6674x.m12776d(AbstractC6664n.m12768r(set2, 10));
        if (iM12776d < 16) {
            iM12776d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM12776d);
        for (Map.Entry entry : set2) {
            AbstractC4154l.m8920c(entry);
            linkedHashMap.put(entry.getKey().toString(), entry.getValue().toString());
        }
        C6487a c6487a = new C6487a(AbstractC6674x.m12780h(linkedHashMapM11094a, zd.m11094a("aws.customMetadata.", linkedHashMap)), 2);
        String strM13806a = platform.m13806a("AWS_EXECUTION_ENV");
        return new C4980b(c4988j, c4979a, c4987i, c4985g, strM13806a != null ? new C4983e(strM13806a) : null, c4984f, str2, c6487a);
    }

    /* renamed from: b */
    public static final String m10887b(Reader reader) throws IOException {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int i10 = reader.read(cArr);
        while (i10 >= 0) {
            stringWriter.write(cArr, 0, i10);
            i10 = reader.read(cArr);
        }
        String string = stringWriter.toString();
        AbstractC4154l.m8922e(string, "toString(...)");
        return string;
    }
}
